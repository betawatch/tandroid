// default package

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s46 {
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
        int b;
        int size = this.k.size();
        View view2 = null;
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((u69) this.k.get(i2)).a;
            g69 g69Var = (g69) view3.getLayoutParams();
            if (view3 != view && !g69Var.a.j() && (b = (g69Var.b() - this.d) * this.e) >= 0 && b < i) {
                view2 = view3;
                if (b == 0) {
                    break;
                } else {
                    i = b;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((g69) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(r69 r69Var) {
        int i = this.d;
        return i >= 0 && i < r69Var.b();
    }

    public final View c(ki2 ki2Var) {
        List list = this.k;
        if (list == null) {
            View view = ki2Var.k(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((u69) this.k.get(i)).a;
            g69 g69Var = (g69) view2.getLayoutParams();
            if (!g69Var.a.j() && this.d == g69Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
