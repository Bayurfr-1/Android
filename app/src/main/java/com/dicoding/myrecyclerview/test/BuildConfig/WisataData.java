package com.dicoding.myrecyclerview.test.BuildConfig;

import java.util.ArrayList;

public class WisataData {
    public static String[][] data = new String[][]{
            {"KWJ", "Kampoeng Warna Warni Jodipan.", "https://i.pinimg.com/originals/6d/74/84/6d7484467a972dd78f6289ae51081d52.jpg"},
            {"Jatim Park", "Jawa Timur Park 1,2,dan 3.", "https://jtp.id/images/news/20171203045704_endritaid.jpg"},
            {"Museum Angkut", "Museum Transportatsi", "https://galuhayuoktavianaa.files.wordpress.com/2018/11/museum-angkut.jpg?w=539&h=371"},
            {"Alun Alun Malang", "Taman Alun Alun Malang.", "https://i.postimg.cc/26whJfpt/alun-alun-kota-malang.jpg"},
            {"Selecta", "Rekreasi Kolam Renang dan Taman.", "https://www.pegipegi.com/travel/wp-content/uploads/2019/04/5.jpg"},
            {"Predator Fun Park", "Mengenal Predator dengan datang ke Predator Fun Park.", "https://www.hargatiket.net/wp-content/uploads/2018/12/Predator-Fun-Park.jpg"},
            {"Batu Night Spectaculer", "Rekreasi dan Wahana Permainan Malam Hari.", "https://www.hargatiket.net/wp-content/uploads/2018/07/Harga-Tiket-Masuk-BNS.jpg"},
            {"Hawaii Water Park", "Wahana dan Kolam Renang terbesar di Malang.", "https://i0.wp.com/enaknyakemana.com/wp-content/uploads/2018/04/11-1.jpg"},
            {"Kampung Biru", "Kampung yang seluruh catnya berwarna Biru.", "https://i0.wp.com/malangtoday.net/wp-content/uploads/2019/05/kampung-Biru-Arema-@exploringwisata.jpg?fit=1080%2C859&ssl=1"},
            {"Taman Rekreasi Kota", "Taman Rekreasi Murah di Malang", "https://minakjinggotravel.files.wordpress.com/2009/12/taman-rekreasi-kota.jpg"},
    };
    public static ArrayList<wisata> getListData(){
        ArrayList<wisata> list = new ArrayList<>();
        for (String[] aData : data) {
            wisata wisata = new wisata();
            wisata.setName(aData[0]);
            wisata.setFrom(aData[1]);
            wisata.setPhoto(aData[2]);
            list.add(wisata);
        }
        return list;
    }
}