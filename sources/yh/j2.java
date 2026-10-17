package yh;

import ai.x9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.is0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class j2 extends s4.v {
    public final /* synthetic */ is0 d;
    public final /* synthetic */ m2 e;

    public j2(m2 m2Var, is0 is0Var) {
        this.e = m2Var;
        this.d = is0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        View view = b1Var.a;
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
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ai.j1 j1Var;
        m2 m2Var = this.e;
        h2 h2Var = m2Var.f;
        if (m2Var.e == null || !m2Var.n) {
            return false;
        }
        View view = b1Var.a;
        if (!r(view instanceof h1 ? ((h1) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = b1Var2.a;
        if (!r(view2 instanceof h1 ? ((h1) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        boolean z10 = m2Var.d;
        is0 is0Var = this.d;
        if (z10) {
            m2Var.e.l(b10, b11);
            is0Var.e.n(m2Var.e.d);
        } else {
            x9 x9Var = m2Var.e;
            if (x9Var.q == null) {
                x9Var.q = x9Var.i();
            }
            x9Var.l(b10, b11);
        }
        h2Var.W2.p(b10, b11);
        h2Var.W2.S();
        if (m2Var.d) {
            HashMap hashMap = q2.T;
            is0Var.f(true);
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (j1Var = ((ProfileActivity) U).w0) != null) {
            j1Var.a();
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        m2 m2Var = this.e;
        if (i10 != 0) {
            h2 h2Var = m2Var.f;
            if (h2Var != null) {
                h2Var.I0(false);
            }
            if (b1Var != null) {
                b1Var.a.setPressed(true);
                return;
            }
            return;
        }
        x9 x9Var = m2Var.e;
        if (x9Var != null) {
            ArrayList arrayList = x9Var.q;
            if (arrayList != null) {
                ArrayList i11 = x9Var.i();
                if (arrayList.size() == i11.size()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (arrayList.get(i12) == i11.get(i12)) {
                        }
                    }
                }
                x9Var.m();
                x9Var.q = null;
                return;
            }
            x9Var.q = null;
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
    public final void q(s4.b1 b1Var) {
    }
}
