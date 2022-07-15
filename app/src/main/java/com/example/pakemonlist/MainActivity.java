package com.example.pakemonlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.pakemonlist.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MoveAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<String>list = new ArrayList<>();
        list.add("https://pokemongolife.ru/p/Bulbasaur.png");
        list.add("https://pokemongolife.ru/p/Pikachu.png");
        list.add("https://pokemongolife.ru/p/Eevee.png");
        list.add("https://pokemongolife.ru/p/Sylveon.png");
        list.add("https://pokemongolife.ru/p/Umbreon.png");
        list.add("https://pokemongolife.ru/p/Raichu.png");
        list.add("https://pokemongolife.ru/p/Mewtwo.png");
        list.add("https://pokemongolife.ru/p/Charizard.png");
        list.add("https://pokemongolife.ru/p/Squirtle.png");
        list.add("https://pokemongolife.ru/p/Espeon.png");
        adapter = new MoveAdapter(list);
        binding.pokem.setAdapter(adapter);
    }
}