package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gq b;
    public final /* synthetic */ long c;

    public /* synthetic */ xp(gq gqVar, long j10, int i10) {
        this.a = i10;
        this.b = gqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                gq gqVar = this.b;
                gqVar.n = j10;
                gqVar.r = true;
                gqVar.o0();
                break;
            default:
                gq.a0(this.b, this.c);
                break;
        }
    }
}
