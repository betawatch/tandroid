// default package

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class r26 {
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
            View view3 = ((s49) this.k.get(i2)).a;
            e49 e49Var = (e49) view3.getLayoutParams();
            if (view3 != view && !e49Var.a.j() && (b = (e49Var.b() - this.d) * this.e) >= 0 && b < i) {
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
            this.d = ((e49) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(p49 p49Var) {
        int i = this.d;
        return i >= 0 && i < p49Var.b();
    }

    public final View c(wg2 wg2Var) {
        List list = this.k;
        if (list == null) {
            View view = wg2Var.k(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((s49) this.k.get(i)).a;
            e49 e49Var = (e49) view2.getLayoutParams();
            if (!e49Var.a.j() && this.d == e49Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
