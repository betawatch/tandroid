// default package

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v17 extends BaseAdapter {
    public final y17 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public v17(y17 y17Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = y17Var;
        this.f = i;
        a();
    }

    public final void a() {
        y17 y17Var = this.a;
        c27 c27Var = y17Var.v;
        if (c27Var != null) {
            y17Var.i();
            ArrayList arrayList = y17Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c27) arrayList.get(i)) == c27Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c27 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        y17 y17Var = this.a;
        if (z) {
            y17Var.i();
            l = y17Var.j;
        } else {
            l = y17Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (c27) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        y17 y17Var = this.a;
        if (z) {
            y17Var.i();
            l = y17Var.j;
        } else {
            l = y17Var.l();
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
        u27 u27Var = (u27) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        u27Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
