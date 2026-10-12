package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
