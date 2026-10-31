package th;

import android.animation.ValueAnimator;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                uw uwVar = this.b.b0;
                ValueAnimator valueAnimator = uwVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                uwVar.k0 = null;
                break;
            default:
                l lVar = this.b;
                lVar.x = false;
                lVar.invalidate();
                break;
        }
    }
}
