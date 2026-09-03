package ph;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ m8(da daVar, Runnable runnable, int i10) {
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
