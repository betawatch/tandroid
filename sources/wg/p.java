package wg;

import bi.ud;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.rt;
import zh.d2;
import zh.g1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                ((fx) this.b).a(Collections.EMPTY_LIST);
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
                n40 n40Var = (n40) ((rt) this.b).b;
                n40Var.q0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = n40Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                a8.b(sb2.toString());
                n40Var.w(true);
                n40.n(n40Var);
                break;
            case 4:
                yh.l lVar = (yh.l) this.b;
                lVar.f();
                lVar.e(true);
                break;
            case 5:
                zh.l lVar2 = (zh.l) this.b;
                lVar2.Z1.setTranslationX(lVar2.Y1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                break;
            case 6:
                ((zh.b0) this.b).onBackPressed();
                break;
            case 7:
                l41 l41Var = ((g1) this.b).Q1;
                if (l41Var != null) {
                    l41Var.O(false);
                    break;
                }
                break;
            case 8:
                ((zh.v0) this.b).c();
                break;
            case 9:
                ((zh.b1) this.b).invalidateSelf();
                break;
            case 10:
                zh.d1 d1Var = (zh.d1) this.b;
                ud udVar = d1Var.e;
                if (udVar != null) {
                    udVar.d();
                    d1Var.invalidateSelf();
                    break;
                }
                break;
            default:
                ((d2) this.b).p();
                break;
        }
    }
}
