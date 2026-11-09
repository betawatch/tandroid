package zh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.v9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w1 extends v4.v {
    public final /* synthetic */ vp0 d;
    public final /* synthetic */ z1 e;

    public w1(z1 z1Var, vp0 vp0Var) {
        this.e = z1Var;
        this.d = vp0Var;
    }

    public static TL_stars.SavedStarGift s(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof y0) {
            return ((y0) view).getSavedGift();
        }
        return null;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        return r(s(d1Var)) ? v4.v.l(15, 0) : v4.v.l(0, 0);
    }

    @Override // v4.v
    public final boolean j() {
        return this.e.h;
    }

    @Override // v4.v
    public final boolean k() {
        return this.e.h;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        bi.g1 g1Var;
        z1 z1Var = this.e;
        fi.w3 w3Var = z1Var.f;
        if (z1Var.e == null || !z1Var.h || !r(s(d1Var)) || !r(s(d1Var2))) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        int indexOf = z1Var.e.l.indexOf(s(d1Var));
        int indexOf2 = z1Var.e.l.indexOf(s(d1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z9 = z1Var.d;
        vp0 vp0Var = this.d;
        if (z9) {
            z1Var.e.m(indexOf, indexOf2);
            vp0Var.e.n(z1Var.e.d);
        } else {
            v9 v9Var = z1Var.e;
            if (v9Var.q == null) {
                v9Var.q = v9Var.i();
            }
            v9Var.m(indexOf, indexOf2);
        }
        w3Var.f3.j(b10, b11);
        w3Var.f3.T();
        if (z1Var.d) {
            HashMap hashMap = d2.U;
            vp0Var.f(true);
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if ((T instanceof ProfileActivity) && (g1Var = ((ProfileActivity) T).v0) != null) {
            g1Var.a();
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        z1 z1Var = this.e;
        if (i7 != 0) {
            fi.w3 w3Var = z1Var.f;
            if (w3Var != null) {
                w3Var.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        v9 v9Var = z1Var.e;
        if (v9Var != null) {
            ArrayList arrayList = v9Var.q;
            if (arrayList != null) {
                ArrayList i10 = v9Var.i();
                if (arrayList.size() == i10.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == i10.get(i11)) {
                        }
                    }
                }
                v9Var.n();
                v9Var.q = null;
                return;
            }
            v9Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        z1 z1Var = this.e;
        if (!z1Var.h) {
            return false;
        }
        if (z1Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }
}
