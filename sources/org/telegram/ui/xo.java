package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip b;

    public /* synthetic */ xo(ip ipVar, int i10) {
        this.a = i10;
        this.b = ipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ip ipVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = ipVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new hg(ipVar, 2));
                    ipVar.showDialog(ipVar.r);
                    break;
                }
                break;
            case 1:
                ip ipVar2 = this.b;
                ipVar2.getMessagesController().loadFullChat(ipVar2.E, 0, true);
                break;
            default:
                ip ipVar3 = this.b;
                ipVar3.getMessagesController().loadFullChat(ipVar3.E, 0, true);
                break;
        }
    }
}
