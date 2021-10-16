package com.dagger.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dagger.databinding.NamesItemBinding;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NamesViewHolder> {

    private ArrayList<String> names;

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        NamesItemBinding namesItemBinding = NamesItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new NamesViewHolder(namesItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesAdapter.NamesViewHolder holder, int position) {
        holder.namesItemBinding.tvName.setText(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names == null ? 0 : names.size();
    }

    public void setData(ArrayList<String> names) {
        this.names = names;
    }

    static class NamesViewHolder extends RecyclerView.ViewHolder {

        private final NamesItemBinding namesItemBinding;

        public NamesViewHolder(NamesItemBinding binding) {
            super(binding.getRoot());
            this.namesItemBinding = binding;
        }
    }
}
