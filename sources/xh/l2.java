package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.e5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class l2 extends s4.w {
    public final /* synthetic */ rs0 d;
    public final /* synthetic */ o2 e;

    public l2(o2 o2Var, rs0 rs0Var) {
        this.e = o2Var;
        this.d = rs0Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        View view = d1Var.a;
        return r(view instanceof j1 ? ((j1) view).getSavedGift() : null) ? s4.w.l(15, 0) : s4.w.l(0, 0);
    }

    @Override // s4.w
    public final boolean j() {
        return this.e.n;
    }

    @Override // s4.w
    public final boolean k() {
        return this.e.n;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        yh.e0 e0Var;
        o2 o2Var = this.e;
        j2 j2Var = o2Var.f;
        if (o2Var.e == null || !o2Var.n) {
            return false;
        }
        View view = d1Var.a;
        if (!r(view instanceof j1 ? ((j1) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = d1Var2.a;
        if (!r(view2 instanceof j1 ? ((j1) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        boolean z10 = o2Var.d;
        rs0 rs0Var = this.d;
        if (z10) {
            o2Var.e.k(b10, b11);
            rs0Var.e.n(o2Var.e.d);
        } else {
            e5 e5Var = o2Var.e;
            if (e5Var.q == null) {
                e5Var.q = e5Var.h();
            }
            e5Var.k(b10, b11);
        }
        j2Var.W2.p(b10, b11);
        j2Var.W2.S();
        if (o2Var.d) {
            HashMap hashMap = s2.T;
            rs0Var.f(true);
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (e0Var = ((ProfileActivity) U).v0) != null) {
            e0Var.a();
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        o2 o2Var = this.e;
        if (i10 != 0) {
            j2 j2Var = o2Var.f;
            if (j2Var != null) {
                j2Var.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        e5 e5Var = o2Var.e;
        if (e5Var != null) {
            ArrayList arrayList = e5Var.q;
            if (arrayList != null) {
                ArrayList h = e5Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                e5Var.l();
                e5Var.q = null;
                return;
            }
            e5Var.q = null;
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

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }
}
