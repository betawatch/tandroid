package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ q0(b1 b1Var, String str, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        g gVar = (g) obj;
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                if (TextUtils.equals(b1Var.d, this.c)) {
                    boolean z10 = b1Var.t0 == null;
                    b1Var.t0 = gVar;
                    if (!b1Var.v0) {
                        if (!z10) {
                            b1Var.c1(gVar);
                            break;
                        } else {
                            h hVar = b1Var.s0;
                            hVar.m = gVar;
                            hVar.n = null;
                            hVar.q = 2;
                            hVar.o = 0.0f;
                            hVar.p = 0L;
                            hVar.E = 0L;
                            hVar.F = false;
                            b1Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                b1 b1Var2 = this.b;
                if (TextUtils.equals(b1Var2.e, this.c)) {
                    b1Var2.u0 = gVar;
                    if (b1Var2.v0 && b1Var2.w0 && b1Var2.A0) {
                        b1Var2.A0 = false;
                        b1Var2.z0 = System.currentTimeMillis() + 60000;
                        b1Var2.A2 = -1;
                    }
                    if (b1Var2.v0) {
                        b1Var2.c1(gVar);
                        break;
                    }
                }
                break;
        }
    }
}
