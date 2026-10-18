package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
