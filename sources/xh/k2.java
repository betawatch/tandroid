package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.or0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.n5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class k2 extends s4.v {
    public final /* synthetic */ or0 d;
    public final /* synthetic */ n2 e;

    public k2(n2 n2Var, or0 or0Var) {
        this.e = n2Var;
        this.d = or0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        View view = c1Var.a;
        return r(view instanceof i1 ? ((i1) view).getSavedGift() : null) ? s4.v.l(15, 0) : s4.v.l(0, 0);
    }

    @Override // s4.v
    public final boolean j() {
        return this.e.n;
    }

    @Override // s4.v
    public final boolean k() {
        return this.e.n;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        yh.g0 g0Var;
        n2 n2Var = this.e;
        i2 i2Var = n2Var.f;
        if (n2Var.e == null || !n2Var.n) {
            return false;
        }
        View view = c1Var.a;
        if (!r(view instanceof i1 ? ((i1) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = c1Var2.a;
        if (!r(view2 instanceof i1 ? ((i1) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        boolean z10 = n2Var.d;
        or0 or0Var = this.d;
        if (z10) {
            n2Var.e.k(b10, b11);
            or0Var.e.n(n2Var.e.d);
        } else {
            n5 n5Var = n2Var.e;
            if (n5Var.q == null) {
                n5Var.q = n5Var.h();
            }
            n5Var.k(b10, b11);
        }
        i2Var.Y2.p(b10, b11);
        i2Var.Y2.S();
        if (n2Var.d) {
            HashMap hashMap = r2.T;
            or0Var.f(true);
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (g0Var = ((ProfileActivity) U).v0) != null) {
            g0Var.a();
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        n2 n2Var = this.e;
        if (i10 != 0) {
            i2 i2Var = n2Var.f;
            if (i2Var != null) {
                i2Var.J0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        n5 n5Var = n2Var.e;
        if (n5Var != null) {
            ArrayList arrayList = n5Var.q;
            if (arrayList != null) {
                ArrayList h = n5Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                n5Var.l();
                n5Var.q = null;
                return;
            }
            n5Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n2 n2Var = this.e;
        if (!n2Var.n) {
            return false;
        }
        if (n2Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
