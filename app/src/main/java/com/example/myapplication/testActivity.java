package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.Adapters.NewsAdapter;
import com.example.myapplication.Models.News;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ActivityTestBinding;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class testActivity extends AppCompatActivity {


    List<News> newsList = new ArrayList<>();
    private ActivityTestBinding binding;


    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_test);
        NavigationUI.setupWithNavController(binding.navView, navController);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        NewsAdapter.adapter = new NewsAdapter(this, newsList);
        recyclerView.setAdapter(NewsAdapter.adapter);

    }
    private void setInitialData(){
        newsList.add(new News("\uD83D\uDCCDПодведем итоги 6 дня умных каникул\n" +
                "\n" +
                "⚡Как батарейки, зарядившись энергией от утренних физических упражнений и завтрака, мы любители физики, отправились тратить ее на изучение самой интересной науки!\n" +
                "\n" +
                "\uD83D\uDC46Весь день вместе с преподавателем из университета ЛЭТИ Георгием Леонидовичем Курановым мы разбирались во всех тонкостях и сложностях решения олимпиадных задач экспериментального тура. За тот малый объем времени, который был нам дан, нам удалось как изучить полностью теорию по экспериментальным заданиям, так и проверить ее на практике. Мы провели множество экспериментов, сделали множество измерений и в миллионный раз доказали справедливость фундаментальных законов физики.\n" +
                "\n" +
                "\uD83D\uDC46В завершении дня, после научной деятельности, насладившись вкуснейшим обедом мы отправились на встречу с Советом старшеклассников, где поучаствовали в увлекательнейшем конкурсе, подготовленном ребятами. Очень приятно и полезно после продуктивного дня принять участие в интерактивном мероприятии!\n" +
                "Сегодня мы в очередной раз провели МЕГА-увлекательный день и приобрели 1000 киллотон новых знаний!\n" +
                "\n" +
                "\uD83D\uDCCDP.S Пост подготовлен группой любителей физики"," МОБУ «СОШ «ЦО «Кудрово»", R.drawable.school_logo, R.drawable.post2 ));
        newsList.add(new News("\uD83D\uDCCDЛаборатории технопарка летом\n" +
                "\n" +
                "\uD83D\uDCC5С 1 июня в ЦО «Кудрово» начал работать летний лагерь для обучающихся 1-5 классов. Ежедневно ребята принимают участие в запланированных организаторами лагеря мероприятиях, а также посещают различные кружки, студии, секции, лаборатории отделения дополнительного образования детей.\n" +
                "\n" +
                "\uD83D\uDC46Более пятидесяти обучающихся с удовольствием занимаются в ИЗО-студии. Около тридцати человек насчитывают каждый из таких кружков, как «Шахматы», «Гончарное дело», «Ансамбль эстрадного танца», «Рукопашный бой», «Роспись по керамике и дереву», «Легоконструирование».\n" +
                "\n" +
                "\uD83C\uDFE2Учитывая специфику и техническую направленность школы-технопарка ЦО «Кудрово», не приходится удивляться тому, что и летом ребята не только отдыхают и развлекаются, но и серьезно занимаются в лабораториях.\n" +
                "\n" +
                "\uD83D\uDCCDЭлектроника, робототехника, интернет вещей, геоинформационные системы и экология, инфокоммуникационные системы, з-Д моделирование и прототипирование, промышленный дизайн, юный изобретатель, стендовое моделирование – вот список компетенций, предложенных ребятам в июньскую смену.\n" +
                "\n" +
                "\uD83D\uDC46Несмотря на трудные по произношению и сначала непонятные названия лабораторий, дети с любопытством, свойственным только детям, отправляются на первое занятие. А там уже педагоги, опытные руководители лабораторий, воспитавшие не одно поколение победителей и призеров научно-технических конференций, чемпионатов и олимпиад разного уровня, очаровывают и заинтересовывают ребят настолько, что в конце занятия дети от души благодарят взрослых и спрашивают об очередном свидании с наукой.\n" +
                "\n" +
                "\uD83C\uDF93Такие занятия ежегодно проводятся в летнем лагере в пропедевтических целях, т.к. в ЦО «Кудрово» раннее профилирование и уже с пятого класса дети должны определиться с профилем обучения.\n" +
                "Конечно, тем, кто решит заниматься в лабораториях, придется долго и упорно трудиться, чтобы овладеть знаниями и победить на первом чемпионате. Но, как известно, ничто не сравнится с радостью победы.", " МОБУ «СОШ «ЦО «Кудрово»", R.drawable.school_logo, R.drawable.post1));
    }

}