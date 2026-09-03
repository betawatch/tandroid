package vh;

import java.util.ArrayList;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class g3 extends l9 {
    public final /* synthetic */ q3 K0;
    public final /* synthetic */ s3 L0;

    public g3(s3 s3Var, q3 q3Var) {
        this.L0 = s3Var;
        this.K0 = q3Var;
    }

    @Override // org.telegram.ui.Cells.y9
    public final boolean D() {
        s3 s3Var = this.L0;
        CharSequence s6 = s3Var.k3.s();
        if (s6 == null || s6.length() == 0) {
            return true;
        }
        s3Var.a5(s6);
        return true;
    }

    @Override // org.telegram.ui.Cells.y9
    public final void E() {
        s3 s3Var = this.L0;
        CharSequence s6 = s3Var.k3.s();
        if (s6 != null && s6.length() > 0) {
            s3Var.a5(s6);
        }
        s3Var.D2();
    }

    @Override // org.telegram.ui.Cells.l9, org.telegram.ui.Cells.y9
    public final void G() {
        super.G();
        this.K0.o();
    }

    @Override // org.telegram.ui.Cells.y9
    public final void I() {
        this.L0.b4();
    }

    @Override // org.telegram.ui.Cells.y9
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.R4();
    }

    @Override // org.telegram.ui.Cells.y9
    public final void L(float f10, float f11) {
        s3 s3Var = this.L0;
        s3Var.p3 = true;
        s3Var.q3 = f10;
        s3Var.r3 = f11;
    }

    @Override // org.telegram.ui.Cells.y9
    public final boolean k() {
        boolean z4;
        int size;
        s3 s3Var = this.L0;
        g3 g3Var = s3Var.k3;
        ArrayList arrayList = s3Var.i3;
        if (!arrayList.isEmpty() && g3Var.y() && g3Var.u0 == 0 && g3Var.v0 == 0 && g3Var.w0 <= 0 && g3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = w5.p(aVar.b) ? y5.l(w5.k(aVar.b)) : "";
            boolean z10 = !l10.isEmpty();
            if (g3Var.y0 == z10) {
                if (g3Var.z0 >= (z10 ? l10.length() : w5.z(aVar.b).length())) {
                    z4 = true;
                    return !z4;
                }
            }
        }
        z4 = false;
        return !z4;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.y9
    public final int q() {
        return this.L0.getPaddingTop();
    }
}
