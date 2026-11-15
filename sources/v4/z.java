package v4;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            View view3 = ((e1) this.k.get(i10)).a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.a.j() && (b10 = (p0Var.b() - this.d) * this.e) >= 0 && b10 < i7) {
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
            this.d = ((p0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(b1 b1Var) {
        int i7 = this.d;
        return i7 >= 0 && i7 < b1Var.b();
    }

    public final View c(w0 w0Var) {
        List list = this.k;
        if (list == null) {
            View view = w0Var.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = ((e1) this.k.get(i7)).a;
            p0 p0Var = (p0) view2.getLayoutParams();
            if (!p0Var.a.j() && this.d == p0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
