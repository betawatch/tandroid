package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.l5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class l2 extends s4.v {
    public final /* synthetic */ nr0 d;
    public final /* synthetic */ o2 e;

    public l2(o2 o2Var, nr0 nr0Var) {
        this.e = o2Var;
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
        return r(view instanceof j1 ? ((j1) view).getSavedGift() : null) ? s4.v.l(15, 0) : s4.v.l(0, 0);
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
        o2 o2Var = this.e;
        j2 j2Var = o2Var.f;
        if (o2Var.e == null || !o2Var.n) {
            return false;
        }
        View view = c1Var.a;
        if (!r(view instanceof j1 ? ((j1) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = c1Var2.a;
        if (!r(view2 instanceof j1 ? ((j1) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        boolean z10 = o2Var.d;
        nr0 nr0Var = this.d;
        if (z10) {
            o2Var.e.k(b10, b11);
            nr0Var.e.n(o2Var.e.d);
        } else {
            l5 l5Var = o2Var.e;
            if (l5Var.q == null) {
                l5Var.q = l5Var.h();
            }
            l5Var.k(b10, b11);
        }
        j2Var.Y2.p(b10, b11);
        j2Var.Y2.S();
        if (o2Var.d) {
            HashMap hashMap = s2.T;
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
        o2 o2Var = this.e;
        if (i10 != 0) {
            j2 j2Var = o2Var.f;
            if (j2Var != null) {
                j2Var.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        l5 l5Var = o2Var.e;
        if (l5Var != null) {
            ArrayList arrayList = l5Var.q;
            if (arrayList != null) {
                ArrayList h = l5Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                l5Var.l();
                l5Var.q = null;
                return;
            }
            l5Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        o2 o2Var = this.e;
        if (!o2Var.n) {
            return false;
        }
        if (o2Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
