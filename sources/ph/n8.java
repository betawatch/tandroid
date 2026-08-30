package ph;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ n8(da daVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = daVar;
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
                da daVar = this.b;
                daVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(daVar.d2);
                daVar.d2 = null;
                daVar.P1 = false;
                this.c.run();
                break;
        }
    }
}
