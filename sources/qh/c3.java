package qh;

import java.util.ArrayList;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c3 extends n9 {
    public final /* synthetic */ m3 K0;
    public final /* synthetic */ o3 L0;

    public c3(o3 o3Var, m3 m3Var) {
        this.L0 = o3Var;
        this.K0 = m3Var;
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean D() {
        o3 o3Var = this.L0;
        CharSequence s10 = o3Var.j3.s();
        if (s10 == null || s10.length() == 0) {
            return true;
        }
        o3Var.b5(s10);
        return true;
    }

    @Override // org.telegram.ui.Cells.aa
    public final void E() {
        o3 o3Var = this.L0;
        CharSequence s10 = o3Var.j3.s();
        if (s10 != null && s10.length() > 0) {
            o3Var.b5(s10);
        }
        o3Var.E2();
    }

    @Override // org.telegram.ui.Cells.n9, org.telegram.ui.Cells.aa
    public final void G() {
        super.G();
        this.K0.h0();
    }

    @Override // org.telegram.ui.Cells.aa
    public final void I() {
        this.L0.c4();
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.S4();
    }

    @Override // org.telegram.ui.Cells.aa
    public final void L(float f10, float f11) {
        o3 o3Var = this.L0;
        o3Var.o3 = true;
        o3Var.p3 = f10;
        o3Var.q3 = f11;
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean k() {
        boolean z10;
        int size;
        o3 o3Var = this.L0;
        c3 c3Var = o3Var.j3;
        ArrayList arrayList = o3Var.h3;
        if (!arrayList.isEmpty() && c3Var.y() && c3Var.u0 == 0 && c3Var.v0 == 0 && c3Var.w0 <= 0 && c3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = s5.p(aVar.b) ? u5.l(s5.k(aVar.b)) : "";
            boolean z11 = !l10.isEmpty();
            if (c3Var.y0 == z11) {
                if (c3Var.z0 >= (z11 ? l10.length() : s5.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.aa
    public final int q() {
        return this.L0.getPaddingTop();
    }
}
