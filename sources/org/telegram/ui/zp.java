package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                iqVar.o0();
                break;
            default:
                iq.a0(this.b, this.c);
                break;
        }
    }
}
