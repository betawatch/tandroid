package wh;

import java.util.ArrayList;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f3 extends m9 {
    public final /* synthetic */ p3 K0;
    public final /* synthetic */ r3 L0;

    public f3(r3 r3Var, p3 p3Var) {
        this.L0 = r3Var;
        this.K0 = p3Var;
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean D() {
        r3 r3Var = this.L0;
        CharSequence s6 = r3Var.k3.s();
        if (s6 == null || s6.length() == 0) {
            return true;
        }
        r3Var.a5(s6);
        return true;
    }

    @Override // org.telegram.ui.Cells.z9
    public final void E() {
        r3 r3Var = this.L0;
        CharSequence s6 = r3Var.k3.s();
        if (s6 != null && s6.length() > 0) {
            r3Var.a5(s6);
        }
        r3Var.D2();
    }

    @Override // org.telegram.ui.Cells.m9, org.telegram.ui.Cells.z9
    public final void G() {
        super.G();
        this.K0.q();
    }

    @Override // org.telegram.ui.Cells.z9
    public final void I() {
        this.L0.b4();
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.R4();
    }

    @Override // org.telegram.ui.Cells.z9
    public final void L(float f10, float f11) {
        r3 r3Var = this.L0;
        r3Var.p3 = true;
        r3Var.q3 = f10;
        r3Var.r3 = f11;
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean k() {
        boolean z4;
        int size;
        r3 r3Var = this.L0;
        f3 f3Var = r3Var.k3;
        ArrayList arrayList = r3Var.i3;
        if (!arrayList.isEmpty() && f3Var.y() && f3Var.u0 == 0 && f3Var.v0 == 0 && f3Var.w0 <= 0 && f3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = v5.p(aVar.b) ? x5.l(v5.k(aVar.b)) : "";
            boolean z10 = !l10.isEmpty();
            if (f3Var.y0 == z10) {
                if (f3Var.z0 >= (z10 ? l10.length() : v5.z(aVar.b).length())) {
                    z4 = true;
                    return !z4;
                }
            }
        }
        z4 = false;
        return !z4;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.z9
    public final int q() {
        return this.L0.getPaddingTop();
    }
}
