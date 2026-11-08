package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ se(an anVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an.o0(this.b, this.c, this.d);
                break;
            default:
                an.F1(this.b, this.c, this.d);
                break;
        }
    }
}
