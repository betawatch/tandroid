package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.jj d;

    public /* synthetic */ xh(un unVar, int i10, org.telegram.messenger.jj jjVar) {
        this.b = unVar;
        this.c = i10;
        this.d = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.messenger.jj jjVar = this.d;
        int i11 = this.c;
        un unVar = this.b;
        switch (i10) {
            case 0:
                unVar.B4 = null;
                jjVar.k.replies.read_max_id = i11;
                break;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                org.telegram.messenger.vp.r1(i11).o0(false);
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                break;
        }
    }

    public /* synthetic */ xh(un unVar, org.telegram.messenger.jj jjVar, int i10) {
        this.b = unVar;
        this.d = jjVar;
        this.c = i10;
    }
}
