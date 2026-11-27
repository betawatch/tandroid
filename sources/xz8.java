// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz8 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f09 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xz8(f09 f09Var, String str, byte b) {
        this.a = b;
        this.b = f09Var;
        this.c = str;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        String str = this.c;
        f09 f09Var = this.b;
        ry8 ry8Var = (ry8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(f09Var.d, str)) {
                    boolean z = f09Var.u0 == null;
                    f09Var.u0 = ry8Var;
                    if (!f09Var.w0) {
                        if (!z) {
                            f09Var.i1(ry8Var);
                            break;
                        } else {
                            f09Var.t0.a(ry8Var);
                            f09Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                if (TextUtils.equals(f09Var.e, str)) {
                    f09Var.v0 = ry8Var;
                    if (f09Var.w0 && f09Var.x0 && f09Var.B0) {
                        f09Var.B0 = false;
                        f09Var.A0 = System.currentTimeMillis() + 60000;
                        f09Var.B2 = -1;
                    }
                    if (f09Var.w0) {
                        f09Var.i1(ry8Var);
                        break;
                    }
                }
                break;
        }
    }
}
