package lundy.com.latihanpertama;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListRowAdapter extends RecyclerView.Adapter<ListRowAdapter.CategoryViewHolder>{
        private Context context;

        ArrayList<DataSetGet> getListDataSetGet() {
            return listDataGetSet;
        }

         void setListDataSetGet(ArrayList<DataSetGet> listDataSetGet) {
            this.listDataGetSet = listDataSetGet;
        }
        private ArrayList<DataSetGet> listDataGetSet;
        ListRowAdapter(Context context) {
            this.context = context;
        }
        @Override
        public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int
        viewType) {
            View itemRow =
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_kelas, parent, false);
            return new CategoryViewHolder(itemRow);
        }
        @Override
        public void onBindViewHolder(CategoryViewHolder holder, int position) {
            holder.tvName.setText(getListDataSetGet().get(position).getName());
            holder.tvCode.setText(getListDataSetGet().get(position).getCode());
        }
        @Override
        public int getItemCount() {
            return getListDataSetGet().size();
        }
        class CategoryViewHolder extends RecyclerView.ViewHolder{
            TextView tvName;
            TextView tvCode;
            CategoryViewHolder(View itemView) {
                super(itemView);
                tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
                tvCode = (TextView)itemView.findViewById(R.id.tv_item_code);
            }
        }
}
