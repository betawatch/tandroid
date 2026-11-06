package zh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.v9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.up0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x1 extends v4.v {
    public final /* synthetic */ up0 d;
    public final /* synthetic */ a2 e;

    public x1(a2 a2Var, up0 up0Var) {
        this.e = a2Var;
        this.d = up0Var;
    }

    public static TL_stars.SavedStarGift s(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof z0) {
            return ((z0) view).getSavedGift();
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
        a2 a2Var = this.e;
        fi.w3 w3Var = a2Var.f;
        if (a2Var.e == null || !a2Var.h || !r(s(d1Var)) || !r(s(d1Var2))) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        int indexOf = a2Var.e.l.indexOf(s(d1Var));
        int indexOf2 = a2Var.e.l.indexOf(s(d1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z9 = a2Var.d;
        up0 up0Var = this.d;
        if (z9) {
            a2Var.e.m(indexOf, indexOf2);
            up0Var.e.n(a2Var.e.d);
        } else {
            v9 v9Var = a2Var.e;
            if (v9Var.q == null) {
                v9Var.q = v9Var.i();
            }
            v9Var.m(indexOf, indexOf2);
        }
        w3Var.f3.j(b10, b11);
        w3Var.f3.T();
        if (a2Var.d) {
            HashMap hashMap = f2.U;
            up0Var.f(true);
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if ((T instanceof ProfileActivity) && (g1Var = ((ProfileActivity) T).v0) != null) {
            g1Var.a();
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        a2 a2Var = this.e;
        if (i7 != 0) {
            fi.w3 w3Var = a2Var.f;
            if (w3Var != null) {
                w3Var.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        v9 v9Var = a2Var.e;
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
        a2 a2Var = this.e;
        if (!a2Var.h) {
            return false;
        }
        if (a2Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }
}
