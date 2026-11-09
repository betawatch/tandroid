package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ se(cn cnVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn.p0(this.b, this.c, this.d);
                break;
            default:
                cn.G1(this.b, this.c, this.d);
                break;
        }
    }
}
