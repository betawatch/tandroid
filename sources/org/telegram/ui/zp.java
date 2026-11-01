package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq b;
    public final /* synthetic */ long c;

    public /* synthetic */ zp(iq iqVar, long j10, int i10) {
        this.a = i10;
        this.b = iqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                iq iqVar = this.b;
                iqVar.n = j10;
                iqVar.r = true;
                iqVar.s0();
                break;
            default:
                iq.e0(this.b, this.c);
                break;
        }
    }
}
