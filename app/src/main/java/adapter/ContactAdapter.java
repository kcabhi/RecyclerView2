package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.e.recyclerview.R;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactsViewHolder>  {
    Context mContext;
    List<Contacts>contactsList;

    public ContactAdapter(Context mContext, List<Contacts>contactsList){
        this.mContext=mContext;
        this.contactsList=contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact,viewGroup,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        final Contacts contacts= contactsList.get(i);
        contactsViewHolder.imgProfile.setImageResource(contacts.getImageID());
        contactsViewHolder.tvName.setText(contacts.getName());
        contactsViewHolder.tvPhone.setText(contacts.getPhoneNo());
    }

    @Override
    public int getItemCount() {
       return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvName,tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imgProfile);
            tvName=itemView.findViewById(R.id.tvName);
            tvPhone=itemView.findViewById(R.id.tvPhone);

        }
    }
}
