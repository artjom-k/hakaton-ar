package com.google.ar.sceneform.samples.common.helpers;

import android.content.Context;

import com.google.ar.sceneform.samples.augmentedimage.R;
import com.google.ar.sceneform.samples.common.BanknoteData;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    private List<BanknoteData> list;
    private static DataUtils instance;

    public static DataUtils getInstance() {
        if (instance == null) {
            synchronized (DataUtils.class) {
                if (instance == null) {
                    instance = new DataUtils();
                }
            }
        }
        return instance;
    }

    private DataUtils(){
        list = generateData();
    }

    private List<BanknoteData> generateData(){
        List<BanknoteData> list = new ArrayList<>(5);
        list.add(new BanknoteData("by_5", "5 рублей", "Каменецкая вежа", "Наиболее хорошо сохранившаяся оборонительная башня волынского типа и одновременно самая высокая (около 31 метра). Построена в 1271—1288 годах. Памятник романского стиля с элементами ранней готики. Находится в городе Каменец (Брестская область)", R.drawable.vezha, R.drawable.belarus));
        list.add(new BanknoteData("by_10", "10 рублей", "Спасо-Преображенская церковь", "Церковь была построена между 1152 и 1161 годами по распоряжению настоятельницы Спасо-Преображенского монастыря Ефросинии Полоцкой. Храм является творением полоцкого зодчего Иоанна и был возведен всего за 30 недель", R.drawable.church, R.drawable.belarus));
        list.add(new BanknoteData("by_20","20 рублей", "Дворец Румянцевых и Паскевичей", "Памятник архитектуры XVIII—XIX веков, главная достопримечательность города Гомеля, композиционный центр Гомельского дворцово-паркового ансамбля", R.drawable.palace, R.drawable.belarus));
        list.add(new BanknoteData("by_50","50 рублей", "Мирский замок", "Оборонительное укрепление и резиденция в городском посёлке Мир Кореличского района Гродненской области. Памятник архитектуры, внесён в список Всемирного наследия ЮНЕСКО (с 2000 года)", R.drawable.castle, R.drawable.belarus));
        list.add(new BanknoteData("by_100","100 рублей", "Замок радзивиллов", "Каменный архитектурный ансамбль был заложен в 1583 году несвижским ординатом князем Радзивиллом Сироткой к югу от старой деревянной крепости", R.drawable.castle2, R.drawable.belarus));
        list.add(new BanknoteData("usa_10","10 долларов США", "Александр Гамильтон", "Государственный деятель США, видный деятель Первой американской буржуазной революции (Войны за независимость США). Идеолог и руководитель Партии федералистов с момента её создания. Автор программы ускоренного торгово-промышленного развития США, 1-й министр финансов США", R.drawable.hamilton, R.drawable.usa));
        return list;
    }

    public List<BanknoteData> getData() {
        return list;
    }
}
