package wg;

import bi.ud;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import zh.f2;
import zh.h1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                ((ex) this.b).a(Collections.EMPTY_LIST);
                break;
            case 1:
                ((v) this.b).a(null);
                break;
            case 2:
                b0 b0Var = (b0) this.b;
                b0Var.getClass();
                c0 c0Var = b0Var.r;
                ug.f1 f1Var = new ug.f1(c0Var.o1, c0Var.a, null, null, null, c0Var.I0);
                f1Var.B2 = true;
                f1Var.U1 = true;
                c0Var.o1.showDialog(f1Var);
                break;
            case 3:
                n40 n40Var = (n40) ((qt) this.b).b;
                n40Var.p0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = n40Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                a8.b(sb2.toString());
                n40Var.v(true);
                n40.m(n40Var);
                break;
            case 4:
                yh.l lVar = (yh.l) this.b;
                lVar.f();
                lVar.e(true);
                break;
            case 5:
                zh.m mVar = (zh.m) this.b;
                mVar.Z1.setTranslationX(mVar.Y1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                break;
            case 6:
                ((zh.c0) this.b).onBackPressed();
                break;
            case 7:
                f41 f41Var = ((h1) this.b).Q1;
                if (f41Var != null) {
                    f41Var.O(false);
                    break;
                }
                break;
            case 8:
                ((zh.w0) this.b).c();
                break;
            case 9:
                ((zh.c1) this.b).invalidateSelf();
                break;
            case 10:
                zh.e1 e1Var = (zh.e1) this.b;
                ud udVar = e1Var.e;
                if (udVar != null) {
                    udVar.d();
                    e1Var.invalidateSelf();
                    break;
                }
                break;
            default:
                ((f2) this.b).p();
                break;
        }
    }
}
