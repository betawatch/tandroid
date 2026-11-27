// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xt8 extends iu5 {
    public final /* synthetic */ cga e;
    public final /* synthetic */ au8 f;

    public xt8(au8 au8Var, cga cgaVar) {
        this.f = au8Var;
        this.e = cgaVar;
    }

    public static TL_stars.SavedStarGift v(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof sx4) {
            return ((sx4) view).getSavedGift();
        }
        return null;
    }

    @Override // iu5
    public final void a(RecyclerView recyclerView, f89 f89Var) {
        super.a(recyclerView, f89Var);
        f89Var.a.setPressed(false);
    }

    @Override // iu5
    public final int f(RecyclerView recyclerView, f89 f89Var) {
        return u(v(f89Var)) ? iu5.m(15, 0) : iu5.m(0, 0);
    }

    @Override // iu5
    public final boolean k() {
        return this.f.h;
    }

    @Override // iu5
    public final boolean l() {
        return this.f.h;
    }

    @Override // iu5
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        gu8 gu8Var;
        au8 au8Var = this.f;
        wa waVar = au8Var.f;
        if (au8Var.e == null || !au8Var.h || !u(v(f89Var)) || !u(v(f89Var2))) {
            return false;
        }
        int b = f89Var.b();
        int b2 = f89Var2.b();
        int indexOf = au8Var.e.l.indexOf(v(f89Var));
        int indexOf2 = au8Var.e.l.indexOf(v(f89Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z = au8Var.d;
        axa axaVar = au8Var.e;
        cga cgaVar = this.e;
        if (z) {
            axaVar.n(indexOf, indexOf2);
            cgaVar.e.n(au8Var.e.d);
        } else {
            if (axaVar.q == null) {
                axaVar.q = axaVar.i();
            }
            axaVar.n(indexOf, indexOf2);
        }
        waVar.g3.j(b, b2);
        waVar.g3.T();
        if (au8Var.d) {
            HashMap hashMap = eu8.V;
            cgaVar.f(true);
        }
        e S = LaunchActivity.S();
        if ((S instanceof ProfileActivity) && (gu8Var = ((ProfileActivity) S).w0) != null) {
            gu8Var.a();
        }
        return true;
    }

    @Override // iu5
    public final void q(f89 f89Var, int i) {
        au8 au8Var = this.f;
        if (i != 0) {
            wa waVar = au8Var.f;
            if (waVar != null) {
                waVar.K0(false);
            }
            if (f89Var != null) {
                f89Var.a.setPressed(true);
                return;
            }
            return;
        }
        axa axaVar = au8Var.e;
        if (axaVar != null) {
            ArrayList arrayList = axaVar.q;
            if (arrayList != null) {
                ArrayList i2 = axaVar.i();
                if (arrayList.size() == i2.size()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (arrayList.get(i3) == i2.get(i3)) {
                        }
                    }
                }
                axaVar.p();
                axaVar.q = null;
                return;
            }
            axaVar.q = null;
        }
    }

    public final boolean u(TL_stars.SavedStarGift savedStarGift) {
        au8 au8Var = this.f;
        if (!au8Var.h) {
            return false;
        }
        if (au8Var.e == this.e.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // iu5
    public final void r(f89 f89Var) {
    }
}
