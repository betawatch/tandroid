package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.e5;
import fi.x5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class s0 extends oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ y9 d;
    public final /* synthetic */ x5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ e5 h;

    public s0(e5 e5Var, Context context, y9 y9Var, x5 x5Var, boolean z9) {
        this.h = e5Var;
        this.c = context;
        this.d = y9Var;
        this.e = x5Var;
        this.f = z9;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.h.s0.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((ij) this.h.s0.get((r0.size() - 1) - i7)).U;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        aj d;
        e5 e5Var = this.h;
        ArrayList arrayList = e5Var.s0;
        ij ijVar = (ij) arrayList.get((arrayList.size() - 1) - i7);
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.t0) {
                ((org.telegram.ui.Cells.t0) view).setMessageObject(ijVar);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        dj djVar = e5Var.t0;
        if (djVar == null || (d = djVar.d(ijVar)) == null) {
            z9 = false;
        } else {
            z9 = d.c != 0;
        }
        dj djVar2 = e5Var.t0;
        q1Var.v3(ijVar, djVar2, djVar2 != null, z9, false, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        t0 t0Var = this.h.D0;
        Context context = this.c;
        if (i7 == 1) {
            return new xi0(new q0(this, context, t0Var));
        }
        r0 r0Var = new r0(this, context, p10.s0, t0Var);
        r0Var.e6 = true;
        return new xi0(r0Var);
    }
}
