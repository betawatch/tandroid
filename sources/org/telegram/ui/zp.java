package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                iqVar.r0();
                break;
            default:
                iq.d0(this.b, this.c);
                break;
        }
    }
}
