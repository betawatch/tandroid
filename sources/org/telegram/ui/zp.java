package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq b;
    public final /* synthetic */ long c;

    public /* synthetic */ zp(jq jqVar, long j10, int i10) {
        this.a = i10;
        this.b = jqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                jq jqVar = this.b;
                jqVar.n = j10;
                jqVar.r = true;
                jqVar.n0();
                break;
            default:
                jq.Z(this.b, this.c);
                break;
        }
    }
}
