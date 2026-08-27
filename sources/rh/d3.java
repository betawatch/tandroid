package rh;

import java.util.ArrayList;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d3 extends j9 {
    public final /* synthetic */ n3 K0;
    public final /* synthetic */ p3 L0;

    public d3(p3 p3Var, n3 n3Var) {
        this.L0 = p3Var;
        this.K0 = n3Var;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean D() {
        p3 p3Var = this.L0;
        CharSequence s10 = p3Var.j3.s();
        if (s10 == null || s10.length() == 0) {
            return true;
        }
        p3Var.b5(s10);
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void E() {
        p3 p3Var = this.L0;
        CharSequence s10 = p3Var.j3.s();
        if (s10 != null && s10.length() > 0) {
            p3Var.b5(s10);
        }
        p3Var.E2();
    }

    @Override // org.telegram.ui.Cells.j9, org.telegram.ui.Cells.w9
    public final void G() {
        super.G();
        this.K0.h0();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void I() {
        this.L0.c4();
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.S4();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void L(float f10, float f11) {
        p3 p3Var = this.L0;
        p3Var.o3 = true;
        p3Var.p3 = f10;
        p3Var.q3 = f11;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean k() {
        boolean z10;
        int size;
        p3 p3Var = this.L0;
        d3 d3Var = p3Var.j3;
        ArrayList arrayList = p3Var.h3;
        if (!arrayList.isEmpty() && d3Var.y() && d3Var.u0 == 0 && d3Var.v0 == 0 && d3Var.w0 <= 0 && d3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = t5.p(aVar.b) ? v5.l(t5.k(aVar.b)) : "";
            boolean z11 = !l10.isEmpty();
            if (d3Var.y0 == z11) {
                if (d3Var.z0 >= (z11 ? l10.length() : t5.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.w9
    public final int q() {
        return this.L0.getPaddingTop();
    }
}
