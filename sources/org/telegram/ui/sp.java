package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;
    public final /* synthetic */ long c;

    public /* synthetic */ sp(dq dqVar, long j10, int i10) {
        this.a = i10;
        this.b = dqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                dq dqVar = this.b;
                dqVar.n = j10;
                dqVar.r = true;
                dqVar.n0();
                break;
            default:
                dq.Z(this.b, this.c);
                break;
        }
    }
}
