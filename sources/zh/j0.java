package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ j0(t0 t0Var, String str, int i10) {
        this.a = i10;
        this.b = t0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        e eVar = (e) obj;
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (TextUtils.equals(t0Var.d, this.c)) {
                    boolean z10 = t0Var.t0 == null;
                    t0Var.t0 = eVar;
                    if (!t0Var.v0) {
                        if (!z10) {
                            t0Var.i1(eVar);
                            break;
                        } else {
                            f fVar = t0Var.s0;
                            fVar.m = eVar;
                            fVar.n = null;
                            fVar.q = 2;
                            fVar.o = 0.0f;
                            fVar.p = 0L;
                            fVar.E = 0L;
                            fVar.F = false;
                            t0Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                t0 t0Var2 = this.b;
                if (TextUtils.equals(t0Var2.e, this.c)) {
                    t0Var2.u0 = eVar;
                    if (t0Var2.v0 && t0Var2.w0 && t0Var2.A0) {
                        t0Var2.A0 = false;
                        t0Var2.z0 = System.currentTimeMillis() + 60000;
                        t0Var2.z2 = -1;
                    }
                    if (t0Var2.v0) {
                        t0Var2.i1(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
