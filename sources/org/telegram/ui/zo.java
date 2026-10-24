package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                    c2Var.setOnCancelListener(new gg(kpVar, 2));
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
