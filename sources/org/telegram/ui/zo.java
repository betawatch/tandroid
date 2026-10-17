package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ zo(kp kpVar, int i10) {
        this.a = i10;
        this.b = kpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kp kpVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = kpVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new jg(kpVar, 2));
                    kpVar.showDialog(kpVar.r);
                    break;
                }
                break;
            case 1:
                kp kpVar2 = this.b;
                kpVar2.getMessagesController().loadFullChat(kpVar2.E, 0, true);
                break;
            default:
                kp kpVar3 = this.b;
                kpVar3.getMessagesController().loadFullChat(kpVar3.E, 0, true);
                break;
        }
    }
}
