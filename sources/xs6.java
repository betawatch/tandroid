// default package

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class xs6 extends ze3 {
    public boolean B0 = false;
    public dp C0;
    public yt6 D0;

    public xs6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // ze3, bn4
    public final void I() {
        super.I();
        dp dpVar = this.C0;
        if (dpVar == null || this.B0) {
            return;
        }
        ((ws6) dpVar).i(false);
    }

    @Override // ze3
    public final Dialog P() {
        if (this.B0) {
            rt6 rt6Var = new rt6(n());
            this.C0 = rt6Var;
            rt6Var.i(this.D0);
        } else {
            this.C0 = new ws6(n());
        }
        return this.C0;
    }

    @Override // bn4, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        dp dpVar = this.C0;
        if (dpVar != null) {
            if (this.B0) {
                ((rt6) dpVar).j();
            } else {
                ((ws6) dpVar).s();
            }
        }
    }
}
