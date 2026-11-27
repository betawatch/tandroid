// default package

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class v46 {
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
            View view3 = ((f89) this.k.get(i2)).a;
            r79 r79Var = (r79) view3.getLayoutParams();
            if (view3 != view && !r79Var.a.j() && (b = (r79Var.b() - this.d) * this.e) >= 0 && b < i) {
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
            this.d = ((r79) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(c89 c89Var) {
        int i = this.d;
        return i >= 0 && i < c89Var.b();
    }

    public final View c(oh2 oh2Var) {
        List list = this.k;
        if (list == null) {
            View view = oh2Var.k(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((f89) this.k.get(i)).a;
            r79 r79Var = (r79) view2.getLayoutParams();
            if (!r79Var.a.j() && this.d == r79Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
