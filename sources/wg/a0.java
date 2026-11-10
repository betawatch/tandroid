package wg;

import bi.ud;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import zh.d2;
import zh.g1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                b0Var.getClass();
                c0 c0Var = b0Var.r;
                ug.f1 f1Var = new ug.f1(c0Var.r1, c0Var.a, null, null, null, c0Var.I0);
                f1Var.E2 = true;
                f1Var.X1 = true;
                c0Var.r1.showDialog(f1Var);
                break;
            case 1:
                n40 n40Var = (n40) ((qt) this.b).b;
                n40Var.q0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = n40Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                a8.b(sb2.toString());
                n40Var.w(true);
                n40.n(n40Var);
                break;
            case 2:
                yh.l lVar = (yh.l) this.b;
                lVar.f();
                lVar.e(true);
                break;
            case 3:
                zh.l lVar2 = (zh.l) this.b;
                lVar2.c2.setTranslationX(lVar2.b2.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                break;
            case 4:
                ((zh.b0) this.b).onBackPressed();
                break;
            case 5:
                m41 m41Var = ((g1) this.b).T1;
                if (m41Var != null) {
                    m41Var.O(false);
                    break;
                }
                break;
            case 6:
                ((zh.v0) this.b).c();
                break;
            case 7:
                ((zh.b1) this.b).invalidateSelf();
                break;
            case 8:
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
