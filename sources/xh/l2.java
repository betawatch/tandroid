package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.k5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class l2 extends s4.v {
    public final /* synthetic */ zr0 d;
    public final /* synthetic */ o2 e;

    public l2(o2 o2Var, zr0 zr0Var) {
        this.e = o2Var;
        this.d = zr0Var;
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
        zr0 zr0Var = this.d;
        if (z10) {
            o2Var.e.k(b10, b11);
            zr0Var.e.n(o2Var.e.d);
        } else {
            k5 k5Var = o2Var.e;
            if (k5Var.q == null) {
                k5Var.q = k5Var.h();
            }
            k5Var.k(b10, b11);
        }
        j2Var.Y2.p(b10, b11);
        j2Var.Y2.S();
        if (o2Var.d) {
            HashMap hashMap = s2.T;
            zr0Var.f(true);
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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
        k5 k5Var = o2Var.e;
        if (k5Var != null) {
            ArrayList arrayList = k5Var.q;
            if (arrayList != null) {
                ArrayList h = k5Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                k5Var.l();
                k5Var.q = null;
                return;
            }
            k5Var.q = null;
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
