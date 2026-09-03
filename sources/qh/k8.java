package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ k8(ba baVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = baVar;
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
                ba baVar = this.b;
                baVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(baVar.d2);
                baVar.d2 = null;
                baVar.P1 = false;
                this.c.run();
                break;
        }
    }
}
