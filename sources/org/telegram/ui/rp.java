package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq b;
    public final /* synthetic */ long c;

    public /* synthetic */ rp(bq bqVar, long j10, int i10) {
        this.a = i10;
        this.b = bqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                bq bqVar = this.b;
                bqVar.n = j10;
                bqVar.r = true;
                bqVar.n0();
                break;
            default:
                bq.Z(this.b, this.c);
                break;
        }
    }
}
