// default package

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vz6 extends BaseAdapter {
    public final yz6 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public vz6(yz6 yz6Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = yz6Var;
        this.f = i;
        a();
    }

    public final void a() {
        yz6 yz6Var = this.a;
        c07 c07Var = yz6Var.v;
        if (c07Var != null) {
            yz6Var.i();
            ArrayList arrayList = yz6Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c07) arrayList.get(i)) == c07Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c07 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        yz6 yz6Var = this.a;
        if (z) {
            yz6Var.i();
            l = yz6Var.j;
        } else {
            l = yz6Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (c07) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        yz6 yz6Var = this.a;
        if (z) {
            yz6Var.i();
            l = yz6Var.j;
        } else {
            l = yz6Var.l();
        }
        return this.b < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        u07 u07Var = (u07) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        u07Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
