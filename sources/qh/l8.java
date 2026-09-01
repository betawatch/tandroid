package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ l8(ca caVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = caVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.run();
                this.b.p0();
                break;
            default:
                ca caVar = this.b;
                caVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(caVar.d2);
                caVar.d2 = null;
                caVar.P1 = false;
                this.c.run();
                break;
        }
    }
}
