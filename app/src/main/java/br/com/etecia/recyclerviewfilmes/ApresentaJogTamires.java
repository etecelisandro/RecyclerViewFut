package br.com.etecia.recyclerviewfilmes;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.google.android.material.appbar.MaterialToolbar;

public class ApresentaJogTamires extends AppCompatActivity {

    TextView mTitulo, mCategoria, mDescricao;
    ImageView mImagem;
    Button btnVoltar;

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);

        mTitulo = findViewById(R.id.mTituloFilme);
        mCategoria = findViewById(R.id.mCategoria);
        mDescricao = findViewById(R.id.mDescricao);
        mImagem = findViewById(R.id.mImagemtamires);
        btnVoltar = findViewById(R.id.btnVoltar);

        idToolbar = findViewById(R.id.idToolBar);

        //Clique o botão na toolbar
        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        //Declarando intent para receber valor
        Intent intent = getIntent();
        //Declarando as variáveis que irão receber o valor
        String titulo, descricao, categoria;
        int mImagemTamires01;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("atua como lateral-esquerda");
        categoria = intent.getExtras().getString("Categoria");

        mImagemTamires01 = intent.getExtras().getInt("ImagemTamires01");

        mTitulo.setText(titulo);
        mDescricao.setText(descricao);
        mCategoria.setText(categoria);
        mImagem.setImageResource(mImagemTamires01);

    }
}