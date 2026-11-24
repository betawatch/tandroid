// default package

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yj4 extends ArrayAdapter {
    public final /* synthetic */ ek4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj4(ek4 ek4Var, Context context) {
        super(context, 0);
        this.a = ek4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ek4 ek4Var = this.a;
        dk4 dk4Var = ek4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i);
        int width = ek4Var.I.getWidth();
        if (view != null) {
            int i2 = dk4Var.b;
            gk4.e(view, menuItem, dk4Var.e.Q.j != null);
        } else {
            gk4 gk4Var = dk4Var.e.Q;
            Context context = dk4Var.d;
            tj4 tj4Var = gk4.p;
            view = gk4Var.b(context, menuItem, true, false, false);
            int i3 = dk4Var.c;
            view.setPadding(i3, 0, i3, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
