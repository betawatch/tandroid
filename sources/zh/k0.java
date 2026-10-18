package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ k0(u0 u0Var, String str, int i10) {
        this.a = i10;
        this.b = u0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        e eVar = (e) obj;
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (TextUtils.equals(u0Var.d, this.c)) {
                    boolean z10 = u0Var.t0 == null;
                    u0Var.t0 = eVar;
                    if (!u0Var.v0) {
                        if (!z10) {
                            u0Var.j1(eVar);
                            break;
                        } else {
                            f fVar = u0Var.s0;
                            fVar.m = eVar;
                            fVar.n = null;
                            fVar.q = 2;
                            fVar.o = 0.0f;
                            fVar.p = 0L;
                            fVar.E = 0L;
                            fVar.F = false;
                            u0Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                u0 u0Var2 = this.b;
                if (TextUtils.equals(u0Var2.e, this.c)) {
                    u0Var2.u0 = eVar;
                    if (u0Var2.v0 && u0Var2.w0 && u0Var2.A0) {
                        u0Var2.A0 = false;
                        u0Var2.z0 = System.currentTimeMillis() + 60000;
                        u0Var2.A2 = -1;
                    }
                    if (u0Var2.v0) {
                        u0Var2.j1(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
