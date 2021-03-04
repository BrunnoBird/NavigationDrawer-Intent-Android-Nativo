package com.example.navigationdrawer.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SobreFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static SobreFragment newInstance(String param1, String param2) {
        SobreFragment fragment = new SobreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "A ATM consultoria tem como missão apoiar organizações que desejam alcançar o sucesso através da excelência em gestão";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");
       return new AboutPage(getActivity() )
               .setImage(R.drawable.logo)
               .setDescription(descricao)

               .addGroup("Entre em contato")
               .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
               .addWebsite("https://www.google.com", "Acesse o nosso site")

               .addGroup("Redes sociais")
               .addFacebook("brunno.gonzalesanjos", "Facebook")
               .addInstagram("brunno.gonzalesanjos", "Instagram")
               .addTwitter("Bgabunno", "Twitter")
               .addYoutube("jamiltondamasceno", "Youtube")
               .addGitHub("BrunnoBird", "GitHub")
               .addPlayStore("com.facebook.katana", "Download App")

               .addGroup("Versão do App")
               .addItem( versao )
                .create();
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}