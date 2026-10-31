package yh;

import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                l.b0(this.b, this.c);
                break;
            default:
                l lVar = this.b;
                lVar.getClass();
                lVar.presentFragment(un.ha(this.c));
                break;
        }
    }
}
