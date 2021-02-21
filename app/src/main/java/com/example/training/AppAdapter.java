package com.example.training;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View appView = inflater.inflate(R.layout.item_app, parent, false);

        ViewHolder viewHolder = new ViewHolder(appView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        App app = mApps.get(position);

        TextView textView = holder.appname;
        textView.setText(app.getAppname());
        TextView descText = holder.description;
        descText.setText(app.getDescription());
        ImageView imageView = holder.image;
        imageView.setImageResource(app.getImage());

    }

    @Override
    public int getItemCount() {
        return mApps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView appname;
        public TextView description;
        public ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            appname = (TextView) itemView.findViewById(R.id.app_name);
            description = (TextView) itemView.findViewById(R.id.app_description);
            image = (ImageView) itemView.findViewById(R.id.app_image);
        }
    }

    private List<App> mApps;

    public AppAdapter(List<App> apps) {
        mApps = apps;
    }
}
