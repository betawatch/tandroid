package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ye(qn qnVar, long j10, long j11, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn.n0(this.b, this.c, this.d);
                break;
            default:
                qn.k1(this.b, this.c, this.d);
                break;
        }
    }
}
