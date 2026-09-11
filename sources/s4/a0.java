package s4;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a0 {
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
            View view3 = ((c1) this.k.get(i11)).a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.a.j() && (b10 = (p0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
            this.d = ((p0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(z0 z0Var) {
        int i10 = this.d;
        return i10 >= 0 && i10 < z0Var.b();
    }

    public final View c(pf.e eVar) {
        List list = this.k;
        if (list == null) {
            View view = eVar.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((c1) this.k.get(i10)).a;
            p0 p0Var = (p0) view2.getLayoutParams();
            if (!p0Var.a.j() && this.d == p0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
