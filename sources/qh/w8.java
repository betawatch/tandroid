package qh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ x8 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ w8(x8 x8Var, Runnable runnable, boolean z4) {
        this.b = x8Var;
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
                ba baVar = this.b.a;
                d3 d3Var = baVar.Q0;
                d3Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                d3Var.invalidate();
                baVar.h(true, true);
                baVar.d0(true);
                baVar.F0.a(false, true);
                baVar.G0.b(true, true);
                baVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ w8(x8 x8Var, boolean z4, Runnable runnable) {
        this.b = x8Var;
        this.d = z4;
        this.c = runnable;
    }
}
