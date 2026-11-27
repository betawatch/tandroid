// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz8 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g09 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xz8(g09 g09Var, String str, byte b) {
        this.a = b;
        this.b = g09Var;
        this.c = str;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        String str = this.c;
        g09 g09Var = this.b;
        ry8 ry8Var = (ry8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(g09Var.d, str)) {
                    boolean z = g09Var.u0 == null;
                    g09Var.u0 = ry8Var;
                    if (!g09Var.w0) {
                        if (!z) {
                            g09Var.i1(ry8Var);
                            break;
                        } else {
                            g09Var.t0.a(ry8Var);
                            g09Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                if (TextUtils.equals(g09Var.e, str)) {
                    g09Var.v0 = ry8Var;
                    if (g09Var.w0 && g09Var.x0 && g09Var.B0) {
                        g09Var.B0 = false;
                        g09Var.A0 = System.currentTimeMillis() + 60000;
                        g09Var.B2 = -1;
                    }
                    if (g09Var.w0) {
                        g09Var.i1(ry8Var);
                        break;
                    }
                }
                break;
        }
    }
}
