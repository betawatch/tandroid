package v4;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((d1) this.k.get(i10)).a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.a.j() && (b10 = (o0Var.b() - this.d) * this.e) >= 0 && b10 < i7) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                } else {
                    i7 = b10;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((o0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(a1 a1Var) {
        int i7 = this.d;
        return i7 >= 0 && i7 < a1Var.b();
    }

    public final View c(v0 v0Var) {
        List list = this.k;
        if (list == null) {
            View view = v0Var.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = ((d1) this.k.get(i7)).a;
            o0 o0Var = (o0) view2.getLayoutParams();
            if (!o0Var.a.j() && this.d == o0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
