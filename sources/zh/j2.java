package zh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.t9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j2 extends s4.w {
    public final /* synthetic */ vs0 d;
    public final /* synthetic */ m2 e;

    public j2(m2 m2Var, vs0 vs0Var) {
        this.e = m2Var;
        this.d = vs0Var;
    }

    public static TL_stars.SavedStarGift s(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof g1) {
            return ((g1) view).getSavedGift();
        }
        return null;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        return r(s(e1Var)) ? s4.w.l(15, 0) : s4.w.l(0, 0);
    }

    @Override // s4.w
    public final boolean j() {
        return this.e.h;
    }

    @Override // s4.w
    public final boolean k() {
        return this.e.h;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        bi.i1 i1Var;
        m2 m2Var = this.e;
        h2 h2Var = m2Var.f;
        if (m2Var.e == null || !m2Var.h || !r(s(e1Var)) || !r(s(e1Var2))) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        int indexOf = m2Var.e.l.indexOf(s(e1Var));
        int indexOf2 = m2Var.e.l.indexOf(s(e1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z10 = m2Var.d;
        vs0 vs0Var = this.d;
        if (z10) {
            m2Var.e.m(indexOf, indexOf2);
            vs0Var.e.n(m2Var.e.d);
        } else {
            t9 t9Var = m2Var.e;
            if (t9Var.q == null) {
                t9Var.q = t9Var.i();
            }
            t9Var.m(indexOf, indexOf2);
        }
        h2Var.g3.p(b10, b11);
        h2Var.g3.T();
        if (m2Var.d) {
            HashMap hashMap = r2.V;
            vs0Var.f(true);
        }
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (i1Var = ((ProfileActivity) U).v0) != null) {
            i1Var.a();
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        m2 m2Var = this.e;
        if (i10 != 0) {
            h2 h2Var = m2Var.f;
            if (h2Var != null) {
                h2Var.I0(false);
            }
            if (e1Var != null) {
                e1Var.a.setPressed(true);
                return;
            }
            return;
        }
        t9 t9Var = m2Var.e;
        if (t9Var != null) {
            ArrayList arrayList = t9Var.q;
            if (arrayList != null) {
                ArrayList i11 = t9Var.i();
                if (arrayList.size() == i11.size()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (arrayList.get(i12) == i11.get(i12)) {
                        }
                    }
                }
                t9Var.n();
                t9Var.q = null;
                return;
            }
            t9Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m2 m2Var = this.e;
        if (!m2Var.h) {
            return false;
        }
        if (m2Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}
