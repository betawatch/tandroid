package u4;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((d1) this.k.get(i10)).a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.a.j() && (b10 = (p0Var.b() - this.d) * this.e) >= 0 && b10 < i3) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                } else {
                    i3 = b10;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((p0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(a1 a1Var) {
        int i3 = this.d;
        return i3 >= 0 && i3 < a1Var.b();
    }

    public final View c(tf.e eVar) {
        List list = this.k;
        if (list == null) {
            View view = eVar.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = ((d1) this.k.get(i3)).a;
            p0 p0Var = (p0) view2.getLayoutParams();
            if (!p0Var.a.j() && this.d == p0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
