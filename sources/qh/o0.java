package qh;

import android.text.TextUtils;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ o0(x0 x0Var, String str, int i10) {
        this.a = i10;
        this.b = x0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        f fVar = (f) obj;
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                if (TextUtils.equals(x0Var.d, this.c)) {
                    boolean z10 = x0Var.t0 == null;
                    x0Var.t0 = fVar;
                    if (!x0Var.v0) {
                        if (!z10) {
                            x0Var.j1(fVar);
                            break;
                        } else {
                            x0Var.s0.a(fVar);
                            x0Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                x0 x0Var2 = this.b;
                if (TextUtils.equals(x0Var2.e, this.c)) {
                    x0Var2.u0 = fVar;
                    if (x0Var2.v0 && x0Var2.w0 && x0Var2.A0) {
                        x0Var2.A0 = false;
                        x0Var2.z0 = System.currentTimeMillis() + 60000;
                        x0Var2.A2 = -1;
                    }
                    if (x0Var2.v0) {
                        x0Var2.j1(fVar);
                        break;
                    }
                }
                break;
        }
    }
}
