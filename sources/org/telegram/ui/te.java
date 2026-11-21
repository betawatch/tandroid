package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ te(bn bnVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn.p0(this.b, this.c, this.d);
                break;
            default:
                bn.G1(this.b, this.c, this.d);
                break;
        }
    }
}
