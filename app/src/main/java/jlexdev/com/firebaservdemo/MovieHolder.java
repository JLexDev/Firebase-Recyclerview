package jlexdev.com.firebaservdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    private TextView tvDuration;
    private TextView tvDescription;
    private ImageView ivCover;

    public MovieHolder(View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tv_name);
        tvDuration = itemView.findViewById(R.id.tv_duration);
        tvDescription = itemView.findViewById(R.id.tv_description);
        ivCover = itemView.findViewById(R.id.iv_cover);
    }

    public void bindMovie(Movie item) {

        tvName.setText(item.getName());
        tvDuration.setText(item.getDuration());
        tvDescription.setText(item.getDescription());

        /* Picasso              [RecyclerViewPicasso]-> GitHub
        Picasso.with(context)
                .load(item.getImagen())
                .placeholder(R.drawable.xd)        // Fondo mientras carga mi Imagen
                .fit()                             // Redimensionar Imagen al tamaño de "ImageView"
                .error(R.mipmap.ic_launcher)       // Imagen que aparecerá al ocurri un Error
                .transform(new CircleTransform())  // "Redondear" Imagen
                .into(imgImagen);

        */
    }
}
