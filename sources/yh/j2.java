package yh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import zh.j5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j2 extends s4.v {
    public final /* synthetic */ nr0 d;
    public final /* synthetic */ m2 e;

    public j2(m2 m2Var, nr0 nr0Var) {
        this.e = m2Var;
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
        return r(view instanceof h1 ? ((h1) view).getSavedGift() : null) ? s4.v.l(15, 0) : s4.v.l(0, 0);
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
        zh.g0 g0Var;
        m2 m2Var = this.e;
        h2 h2Var = m2Var.f;
        if (m2Var.e == null || !m2Var.n) {
            return false;
        }
        View view = c1Var.a;
        if (!r(view instanceof h1 ? ((h1) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = c1Var2.a;
        if (!r(view2 instanceof h1 ? ((h1) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        boolean z10 = m2Var.d;
        nr0 nr0Var = this.d;
        if (z10) {
            m2Var.e.k(b10, b11);
            nr0Var.e.n(m2Var.e.d);
        } else {
            j5 j5Var = m2Var.e;
            if (j5Var.q == null) {
                j5Var.q = j5Var.h();
            }
            j5Var.k(b10, b11);
        }
        h2Var.Y2.p(b10, b11);
        h2Var.Y2.S();
        if (m2Var.d) {
            HashMap hashMap = q2.T;
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
        m2 m2Var = this.e;
        if (i10 != 0) {
            h2 h2Var = m2Var.f;
            if (h2Var != null) {
                h2Var.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        j5 j5Var = m2Var.e;
        if (j5Var != null) {
            ArrayList arrayList = j5Var.q;
            if (arrayList != null) {
                ArrayList h = j5Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                j5Var.l();
                j5Var.q = null;
                return;
            }
            j5Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m2 m2Var = this.e;
        if (!m2Var.n) {
            return false;
        }
        if (m2Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
