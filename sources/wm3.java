// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bn3 b;
    public final /* synthetic */ String c;

    public /* synthetic */ wm3(bn3 bn3Var, String str, byte b) {
        this.a = b;
        this.b = bn3Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        bn3 bn3Var = this.b;
        switch (b) {
            case 0:
                bn3Var.D(str);
                break;
            default:
                bn3Var.L = str;
                cm3 cm3Var = new cm3(r3c.F0(r3c.K0(str, null, null)), 0L, null, false);
                cm3Var.e = str;
                cm3Var.f = R.drawable.outline_ai_translate2;
                bn3Var.c(cm3Var);
                break;
        }
    }
}
