// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oy8 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wy8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ oy8(wy8 wy8Var, String str, byte b) {
        this.a = b;
        this.b = wy8Var;
        this.c = str;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        String str = this.c;
        wy8 wy8Var = this.b;
        hx8 hx8Var = (hx8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(wy8Var.d, str)) {
                    boolean z = wy8Var.u0 == null;
                    wy8Var.u0 = hx8Var;
                    if (!wy8Var.w0) {
                        if (!z) {
                            wy8Var.i1(hx8Var);
                            break;
                        } else {
                            wy8Var.t0.a(hx8Var);
                            wy8Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                if (TextUtils.equals(wy8Var.e, str)) {
                    wy8Var.v0 = hx8Var;
                    if (wy8Var.w0 && wy8Var.x0 && wy8Var.B0) {
                        wy8Var.B0 = false;
                        wy8Var.A0 = System.currentTimeMillis() + 60000;
                        wy8Var.B2 = -1;
                    }
                    if (wy8Var.w0) {
                        wy8Var.i1(hx8Var);
                        break;
                    }
                }
                break;
        }
    }
}
