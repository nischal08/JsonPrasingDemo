package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.atwebpages.awaillixa.jsonprasingdemo.Contact;
import com.atwebpages.awaillixa.jsonprasingdemo.ContactAdapter;
import com.atwebpages.awaillixa.jsonprasingdemo.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    List<Item> musicList;


    public MusicAdapter(List<Item> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public MusicAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, null);
        return new MusicAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.ViewHolder holder, int position) {
        holder.bindView(musicList.get(position));
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView  title, description;
        ImageView Image;
        public ViewHolder(View itemView) {
            super(itemView);

            Image = itemView.findViewById(R.id.image);
            title= itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);



        }

        public void bindView(final Item item /*, Contacts con*/) {
           // image.setText(item.getSnippet().);
            title.setText(item.getSnippet().getTitle());
            description.setText(item.getSnippet().getDescription());
            Glide.with(Image.getContext()).load(item.getSnippet().getThumbnail().getMedium().getUrl()).into(Image);









        }

    }
}


