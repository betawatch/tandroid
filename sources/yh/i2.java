package yh;

import ai.y9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class i2 extends s4.v {
    public final /* synthetic */ ns0 d;
    public final /* synthetic */ l2 e;

    public i2(l2 l2Var, ns0 ns0Var) {
        this.e = l2Var;
        this.d = ns0Var;
    }

    public static TL_stars.SavedStarGift s(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof g1) {
            return ((g1) view).getSavedGift();
        }
        return null;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        return r(s(b1Var)) ? s4.v.l(15, 0) : s4.v.l(0, 0);
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
        l2 l2Var = this.e;
        g2 g2Var = l2Var.f;
        if (l2Var.e == null || !l2Var.n || !r(s(b1Var)) || !r(s(b1Var2))) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        int indexOf = l2Var.e.l.indexOf(s(b1Var));
        int indexOf2 = l2Var.e.l.indexOf(s(b1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z10 = l2Var.d;
        ns0 ns0Var = this.d;
        if (z10) {
            l2Var.e.m(indexOf, indexOf2);
            ns0Var.e.n(l2Var.e.d);
        } else {
            y9 y9Var = l2Var.e;
            if (y9Var.q == null) {
                y9Var.q = y9Var.i();
            }
            y9Var.m(indexOf, indexOf2);
        }
        g2Var.Z2.p(b10, b11);
        g2Var.Z2.S();
        if (l2Var.d) {
            HashMap hashMap = p2.U;
            ns0Var.f(true);
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (j1Var = ((ProfileActivity) U).w0) != null) {
            j1Var.a();
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        l2 l2Var = this.e;
        if (i10 != 0) {
            g2 g2Var = l2Var.f;
            if (g2Var != null) {
                g2Var.I0(false);
            }
            if (b1Var != null) {
                b1Var.a.setPressed(true);
                return;
            }
            return;
        }
        y9 y9Var = l2Var.e;
        if (y9Var != null) {
            ArrayList arrayList = y9Var.q;
            if (arrayList != null) {
                ArrayList i11 = y9Var.i();
                if (arrayList.size() == i11.size()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (arrayList.get(i12) == i11.get(i12)) {
                        }
                    }
                }
                y9Var.n();
                y9Var.q = null;
                return;
            }
            y9Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        l2 l2Var = this.e;
        if (!l2Var.n) {
            return false;
        }
        if (l2Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
