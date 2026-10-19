package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
