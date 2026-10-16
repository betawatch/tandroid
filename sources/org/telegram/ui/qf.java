package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ qf(fo foVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo.Y(this.b, this.c, this.d);
                break;
            default:
                fo.X(this.b, this.c, this.d);
                break;
        }
    }
}
