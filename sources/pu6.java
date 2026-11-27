// default package

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class pu6 extends tf3 {
    public boolean B0 = false;
    public ep C0;
    public dw6 D0;

    public pu6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // tf3
    public final Dialog P() {
        if (this.B0) {
            lv6 lv6Var = new lv6(n());
            this.C0 = lv6Var;
            Q();
            lv6Var.f(this.D0);
        } else {
            ou6 ou6Var = new ou6(n());
            this.C0 = ou6Var;
            Q();
            ou6Var.h(this.D0);
        }
        return this.C0;
    }

    public final void Q() {
        dw6 dw6Var = this.D0;
        if (dw6Var == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                dw6Var = dw6.b(bundle.getBundle("selector"));
                this.D0 = dw6Var;
            }
            if (dw6Var == null) {
                this.D0 = dw6.c;
            }
        }
    }

    @Override // gp4, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        ep epVar = this.C0;
        if (epVar == null) {
            return;
        }
        if (!this.B0) {
            ou6 ou6Var = (ou6) epVar;
            ou6Var.getWindow().setLayout(mte.a(ou6Var.getContext()), -2);
        } else {
            lv6 lv6Var = (lv6) epVar;
            Context context = lv6Var.n;
            lv6Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : mte.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
