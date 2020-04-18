package com.example.recyclerviewmutipleviewtype25022020;

import java.util.ArrayList;
import java.util.Arrays;

public class Soccermodel {
    private  String name;
    private int price;
    private String mota;
    private int hinhanh;

    public Soccermodel(String name, int price, String mota, int hinhanh) {
        this.name = name;
        this.price = price;
        this.mota = mota;
        this.hinhanh = hinhanh;
    }
    public static ArrayList<Soccermodel> mock(){
        return new ArrayList<>(Arrays.asList(
                new Soccermodel("Eden Hazard", 150000000,"Là một cầu thủ bóng đá người Bỉ hiện đang chơi ở vị trí tiền đạo cho câu lạc bộ Real Madrid tại La Liga cũng như thi đấu cho đội tuyển Bỉ ở các giải đấu cấp độ đội tuyển. Anh là đội trưởng đội tuyển Bỉ. Vị trí thi đấu của anh thường là tiền đạo cánh trái.Anh là một trong những cầu thủ xuất sắc nhất thế giới hiện tại", R.drawable.hinh1);
                new Soccermodel("Pual Pogba",100000000, "Paul Pogba là cầu thủ người Pháp gốc Guinée hiện đang chơi cho Manchester United và đội tuyển bóng đá quốc gia Pháp ở vị trí tiền vệ",R.drawable.hinh2);
                new Soccermodel("Kante",80000000, "N'Golo Kanté là một cầu thủ bóng đá người Pháp gốc Mali hiện đang chơi ở vị trí tiền vệ cho câu lạc bộ Chelsea và Đội tuyển bóng đá quốc gia Pháp. Anh là tiền vệ phòng ngự xuất sắc nhất thế giới năm 2019 theo ESPN", R.drawable.hinh3);
                new Soccermodel("Recce James", 10000000,"Reece James là một cầu thủ bóng đá chuyên nghiệp người Anh, đóng vai trò là hậu vệ cánh cho câu lạc bộ Premier League Chelsea",R.drawable.hinh4);
                new Soccermodel("Mason Mount", 10000000, "Mason Tony Mount là cầu thủ bóng đá người Anh đang thi đấu ở vị trí tiền vệ cho câu lạc bộ Chelsea và Đội tuyển bóng đá quốc gia Anh. Mount gia nhập đội trẻ Chelsea từ năm 6 tuổi, thi đấu cho nhiều đội trẻ của câu lạc bộ này trước khi được đem cho mượn tại Vitesse và Derby County", R.drawable.hinh5);

        ));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
