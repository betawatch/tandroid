package zh;

import android.graphics.Bitmap;
import android.os.SystemClock;
import ci.g3;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ y0 c;

    public /* synthetic */ v0(b1 b1Var, y0 y0Var, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = y0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        r5 r5Var;
        g3 g3Var;
        uj0 lottieAnimation;
        int i10;
        switch (this.a) {
            case 0:
                l lVar = (l) obj;
                y0 y0Var = this.c;
                y0Var.v = null;
                if (lVar != null) {
                    Bitmap bitmap = lVar.a;
                    if (!y0Var.G) {
                        y0Var.u = lVar;
                        y0Var.H.d(bitmap);
                        y0Var.I.d(bitmap);
                        this.b.invalidate();
                        break;
                    } else {
                        e.c(bitmap);
                        break;
                    }
                }
                break;
            case 1:
                Bitmap bitmap2 = (Bitmap) obj;
                y0 y0Var2 = this.c;
                if (!y0Var2.G && y0Var2.e == null) {
                    this.b.A0(y0Var2, bitmap2);
                    break;
                }
                break;
            default:
                a0 a0Var = (a0) obj;
                if (a0Var != null) {
                    Bitmap bitmap3 = a0Var.a;
                    int i11 = a0Var.e;
                    y0 y0Var3 = this.c;
                    if (!y0Var3.G) {
                        y0Var3.A = a0Var;
                        y0Var3.C = SystemClock.elapsedRealtime();
                        y0Var3.B = 0.0f;
                        y0Var3.D = true;
                        if (i11 > 1 && (r5Var = y0Var3.d) != null && (g3Var = r5Var.k) != null && (lottieAnimation = g3Var.getLottieAnimation()) != null && (i10 = lottieAnimation.e[0]) > 1) {
                            y0Var3.B = (lottieAnimation.a0 * i11) / i10;
                            y0Var3.D = false;
                        }
                        y0Var3.J.d(bitmap3);
                        y0Var3.K.d(bitmap3);
                        r5 r5Var2 = y0Var3.d;
                        b1 b1Var = this.b;
                        if (r5Var2 != null && !b1Var.t7.containsValue(r5Var2)) {
                            y0Var3.d.o(b1Var);
                        }
                        y0Var3.F = true;
                        b1Var.invalidate();
                        break;
                    } else {
                        e.c(bitmap3);
                        break;
                    }
                }
                break;
        }
    }
}
