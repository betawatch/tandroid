// default package

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zl4 extends ArrayAdapter {
    public final /* synthetic */ fm4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl4(fm4 fm4Var, Context context) {
        super(context, 0);
        this.a = fm4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        fm4 fm4Var = this.a;
        em4 em4Var = fm4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i);
        int width = fm4Var.I.getWidth();
        if (view != null) {
            int i2 = em4Var.b;
            hm4.e(view, menuItem, em4Var.e.Q.j != null);
        } else {
            hm4 hm4Var = em4Var.e.Q;
            Context context = em4Var.d;
            ul4 ul4Var = hm4.p;
            view = hm4Var.b(context, menuItem, true, false, false);
            int i3 = em4Var.c;
            view.setPadding(i3, 0, i3, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
