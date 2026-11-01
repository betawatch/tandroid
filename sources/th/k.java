package th;

import android.animation.ValueAnimator;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ k(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tw twVar = this.b.b0;
                ValueAnimator valueAnimator = twVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                twVar.k0 = null;
                break;
            default:
                l lVar = this.b;
                lVar.x = false;
                lVar.invalidate();
                break;
        }
    }
}
