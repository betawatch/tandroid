package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ te(cn cnVar, long j3, long j10, int i7) {
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
