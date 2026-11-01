package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.kj d;

    public /* synthetic */ xh(un unVar, int i10, org.telegram.messenger.kj kjVar) {
        this.b = unVar;
        this.c = i10;
        this.d = kjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.messenger.kj kjVar = this.d;
        int i11 = this.c;
        un unVar = this.b;
        switch (i10) {
            case 0:
                unVar.B4 = null;
                kjVar.k.replies.read_max_id = i11;
                break;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                org.telegram.messenger.wp.r1(i11).o0(false);
                unVar.Za(kjVar);
                unVar.bb(kjVar);
                break;
        }
    }

    public /* synthetic */ xh(un unVar, org.telegram.messenger.kj kjVar, int i10) {
        this.b = unVar;
        this.d = kjVar;
        this.c = i10;
    }
}
