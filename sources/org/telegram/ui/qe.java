package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ qe(an anVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an.p0(this.b, this.c, this.d);
                break;
            default:
                an.G1(this.b, this.c, this.d);
                break;
        }
    }
}
