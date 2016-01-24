package com.alevsk.materialdesignapp.adapters;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alevsk.materialdesignapp.R;
import com.alevsk.materialdesignapp.models.Menu;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alevskey on 23/01/2016.
 */
public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private LayoutInflater mInflater;
    private List<Menu> data = Collections.emptyList();

    public MenuAdapter(Context context, List<Menu> data) {
        mInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.viewholder_menu, parent, false);
        MenuViewHolder holder = new MenuViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        holder.title.setText(data.get(position).getTitle());
        holder.icon.setImageResource(data.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView title;
        public MenuViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
        }
    }
}
