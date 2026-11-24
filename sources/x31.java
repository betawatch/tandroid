// default package

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x31 extends x02 {
    public final /* synthetic */ byte H4;
    public final /* synthetic */ Object I4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(Context context, d dVar, wjb wjbVar, hq1 hq1Var) {
        super(context, dVar, false, false, true, wjbVar);
        this.H4 = (byte) 2;
        this.I4 = hq1Var;
    }

    @Override // x02, fx0
    public final void I() {
        int i;
        int i2;
        byte b = this.H4;
        Object obj = this.I4;
        switch (b) {
            case 0:
                y31 y31Var = (y31) obj;
                x31 x31Var = y31Var.M;
                if (x31Var != null && x31Var.isShowing()) {
                    Activity parentActivity = y31Var.getParentActivity();
                    i = ((d) y31Var).classGuid;
                    gl.V2(parentActivity, i);
                }
                super.I();
                break;
            case 1:
                mu1 mu1Var = (mu1) obj;
                x31 x31Var2 = mu1Var.Y1;
                if (x31Var2 != null && (x31Var2.isShowing() || this.r2)) {
                    Activity parentActivity2 = mu1Var.getParentActivity();
                    i2 = ((d) mu1Var).classGuid;
                    gl.V2(parentActivity2, i2);
                }
                super.I();
                mu1Var.Y9(false, true);
                at1 at1Var = mu1Var.m1;
                if (at1Var != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c(at1Var);
                    break;
                }
                break;
            case 2:
                super.I();
                hq1 hq1Var = (hq1) obj;
                if (hq1Var != null) {
                    hq1Var.run();
                    break;
                }
                break;
            default:
                super.I();
                break;
        }
    }

    @Override // fx0
    public final void k0() {
        int i;
        int i2;
        ar1 ar1Var;
        byte b = this.H4;
        Object obj = this.I4;
        switch (b) {
            case 0:
                y31 y31Var = (y31) obj;
                x31 x31Var = y31Var.M;
                if (x31Var != null) {
                    x31Var.v0(false);
                }
                x31 x31Var2 = y31Var.M;
                if (x31Var2 != null && x31Var2.isShowing()) {
                    Activity parentActivity = y31Var.getParentActivity();
                    i = ((d) y31Var).classGuid;
                    gl.V2(parentActivity, i);
                    break;
                }
                break;
            case 1:
                mu1 mu1Var = (mu1) obj;
                boolean z = this.r2;
                boolean O = this.v2.O();
                if (!O) {
                    mu1Var.S3 = false;
                    ar1 ar1Var2 = mu1Var.a0;
                    if (ar1Var2 != null) {
                        if (!z) {
                            ar1Var2.S();
                        }
                        if (mu1Var.a0.getEditField() != null) {
                            mu1Var.a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z) {
                    x31 x31Var3 = mu1Var.Y1;
                    if (x31Var3 != null) {
                        x31Var3.v0(false);
                    }
                    if (O && (ar1Var = mu1Var.a0) != null && ar1Var.getEditField() != null) {
                        mu1Var.a0.getEditField().requestFocus();
                    }
                    x31 x31Var4 = mu1Var.Y1;
                    if (x31Var4 != null && x31Var4.isShowing()) {
                        Activity parentActivity2 = mu1Var.getParentActivity();
                        i2 = ((d) mu1Var).classGuid;
                        gl.V2(parentActivity2, i2);
                    }
                    mu1Var.Y9(false, false);
                    at1 at1Var = mu1Var.m1;
                    if (at1Var != null) {
                        WeakHashMap weakHashMap = jdc.a;
                        zcc.c(at1Var);
                        break;
                    }
                }
                break;
            case 3:
                y28 y28Var = (y28) obj;
                x31 x31Var5 = y28Var.y2;
                if (x31Var5 != null) {
                    x31Var5.v0(false);
                }
                q18 q18Var = y28Var.R1;
                if (q18Var != null && q18Var.getEditField() != null) {
                    y28Var.R1.getEditField().requestFocus();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x31(d dVar, Activity activity, d dVar2, wjb wjbVar, byte b) {
        super(activity, dVar2, false, false, true, wjbVar);
        this.H4 = b;
        this.I4 = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(y28 y28Var, Context context, f53 f53Var) {
        super(context, null, false, false, true, f53Var);
        this.H4 = (byte) 3;
        this.I4 = y28Var;
    }
}
