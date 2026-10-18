package s4;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class z {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b10;
        int size = this.k.size();
        View view2 = null;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((b1) this.k.get(i11)).a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.a.j() && (b10 = (o0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                } else {
                    i10 = b10;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((o0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(y0 y0Var) {
        int i10 = this.d;
        return i10 >= 0 && i10 < y0Var.b();
    }

    public final View c(qf.e eVar) {
        List list = this.k;
        if (list == null) {
            View view = eVar.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((b1) this.k.get(i10)).a;
            o0 o0Var = (o0) view2.getLayoutParams();
            if (!o0Var.a.j() && this.d == o0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
