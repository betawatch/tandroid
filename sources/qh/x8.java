package qh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ y8 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ x8(y8 y8Var, Runnable runnable, boolean z4) {
        this.b = y8Var;
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
                ca caVar = this.b.a;
                e3 e3Var = caVar.Q0;
                e3Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                e3Var.invalidate();
                caVar.h(true, true);
                caVar.d0(true);
                caVar.F0.a(false, true);
                caVar.G0.b(true, true);
                caVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ x8(y8 y8Var, boolean z4, Runnable runnable) {
        this.b = y8Var;
        this.d = z4;
        this.c = runnable;
    }
}
