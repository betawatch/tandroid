package ph;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a9 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ z8(a9 a9Var, Runnable runnable, boolean z4) {
        this.b = a9Var;
        this.c = runnable;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c, this.d);
                break;
            default:
                this.c.run();
                da daVar = this.b.a;
                e3 e3Var = daVar.Q0;
                e3Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                e3Var.invalidate();
                daVar.h(true, true);
                daVar.d0(true);
                daVar.F0.a(false, true);
                daVar.G0.b(true, true);
                daVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ z8(a9 a9Var, boolean z4, Runnable runnable) {
        this.b = a9Var;
        this.d = z4;
        this.c = runnable;
    }
}
