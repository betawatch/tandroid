package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ s0(c1 c1Var, String str, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        e eVar = (e) obj;
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                if (TextUtils.equals(c1Var.d, this.c)) {
                    boolean z10 = c1Var.t0 == null;
                    c1Var.t0 = eVar;
                    if (!c1Var.v0) {
                        if (!z10) {
                            c1Var.j1(eVar);
                            break;
                        } else {
                            c1Var.s0.a(eVar);
                            c1Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                c1 c1Var2 = this.b;
                if (TextUtils.equals(c1Var2.e, this.c)) {
                    c1Var2.u0 = eVar;
                    if (c1Var2.v0 && c1Var2.w0 && c1Var2.A0) {
                        c1Var2.A0 = false;
                        c1Var2.z0 = System.currentTimeMillis() + 60000;
                        c1Var2.A2 = -1;
                    }
                    if (c1Var2.v0) {
                        c1Var2.j1(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
