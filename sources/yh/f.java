package yh;

import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ long c;

    public /* synthetic */ f(l lVar, long j10, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l.c0(this.b, this.c);
                break;
            default:
                l lVar = this.b;
                lVar.getClass();
                lVar.presentFragment(un.ma(this.c));
                break;
        }
    }
}
