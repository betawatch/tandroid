package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                org.telegram.ui.ActionBar.c2 c2Var = kpVar.r;
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new cg(kpVar, 2));
                    kpVar.showDialog(kpVar.r);
                    break;
                }
                break;
            case 1:
                kp kpVar2 = this.b;
                kpVar2.getMessagesController().loadFullChat(kpVar2.A, 0, true);
                break;
            default:
                kp kpVar3 = this.b;
                kpVar3.getMessagesController().loadFullChat(kpVar3.A, 0, true);
                break;
        }
    }
}
