package yh;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ t7(long j3, int i10, int i11, boolean z10) {
        this.a = j3;
        this.b = i10;
        this.c = i11;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            v5.y(i10, this.d).X(i11);
        }
    }
}
