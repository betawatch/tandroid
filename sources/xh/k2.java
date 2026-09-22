package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.m5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class k2 extends s4.v {
    public final /* synthetic */ nr0 d;
    public final /* synthetic */ n2 e;

    public k2(n2 n2Var, nr0 nr0Var) {
        this.e = n2Var;
        this.d = nr0Var;
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
        nr0 nr0Var = this.d;
        if (z10) {
            n2Var.e.k(b10, b11);
            nr0Var.e.n(n2Var.e.d);
        } else {
            m5 m5Var = n2Var.e;
            if (m5Var.q == null) {
                m5Var.q = m5Var.h();
            }
            m5Var.k(b10, b11);
        }
        i2Var.Y2.p(b10, b11);
        i2Var.Y2.S();
        if (n2Var.d) {
            HashMap hashMap = r2.T;
            nr0Var.f(true);
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                i2Var.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        m5 m5Var = n2Var.e;
        if (m5Var != null) {
            ArrayList arrayList = m5Var.q;
            if (arrayList != null) {
                ArrayList h = m5Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                m5Var.l();
                m5Var.q = null;
                return;
            }
            m5Var.q = null;
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
