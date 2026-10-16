package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
