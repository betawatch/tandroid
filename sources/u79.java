// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class u79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ en1 b;
    public final /* synthetic */ u21 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ e53 e;

    public /* synthetic */ u79(en1 en1Var, u21 u21Var, Context context, e53 e53Var, byte b) {
        this.a = b;
        this.b = en1Var;
        this.c = u21Var;
        this.d = context;
        this.e = e53Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e53 e53Var = this.e;
        Context context = this.d;
        u21 u21Var = this.c;
        en1 en1Var = this.b;
        switch (b) {
            case 0:
                en1Var.run();
                u21Var.c(gl.N2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 9), e53Var)).j();
                break;
            case 1:
                en1Var.run();
                u21Var.c(gl.N2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 12), e53Var)).j();
                break;
            default:
                en1Var.run();
                u21Var.c(gl.N2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 13), e53Var)).j();
                break;
        }
    }
}
