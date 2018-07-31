package com.atwebpages.awaillixa.jsonprasingdemo;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    List<Contact> ContactList;


    public ContactAdapter(List<Contact> ContactList) {
        this.ContactList = ContactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_detail, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindView(ContactList.get(position));
    }

    @Override
    public int getItemCount() {
        return ContactList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView contactId, contactName, contactAdd, contactEmail,contactGender,contactPhone,contactMo, contactHome, contactOffice;
        ProgressBar contactPro;
        public ViewHolder(View itemView) {
            super(itemView);

            contactId = itemView.findViewById(R.id.id);
            contactName= itemView.findViewById(R.id.na);
            contactAdd = itemView.findViewById(R.id.add);
            contactEmail = itemView.findViewById(R.id.ema);
            contactGender = itemView.findViewById(R.id.ge);
            contactPhone = itemView.findViewById(R.id.po);
            contactMo = itemView.findViewById(R.id.mo);
            contactHome = itemView.findViewById(R.id.ho);
            contactOffice = itemView.findViewById(R.id.off);


        }

        public void bindView(final Contact contact /*, Contacts con*/) {
            contactId.setText(contact.getId());
            contactName.setText(contact.getName());
            contactAdd.setText(contact.getAddress());
            contactEmail.setText(contact.getEmail());
            contactGender.setText(contact.getGender());
            contactMo.setText(contact.getPhone().getMobile());
            contactHome.setText(contact.getPhone().getHome());
            contactOffice.setText(contact.getPhone().getOffice());








        }

    }
}