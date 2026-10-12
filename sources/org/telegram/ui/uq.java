package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;

    public /* synthetic */ uq(yr yrVar, int i10) {
        this.a = i10;
        this.b = yrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                yr yrVar = this.b;
                yrVar.getMessagesController().loadFullChat(yrVar.N, 0, true);
                break;
        }
    }
}
