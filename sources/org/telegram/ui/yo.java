package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp b;

    public /* synthetic */ yo(jp jpVar, int i10) {
        this.a = i10;
        this.b = jpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jp jpVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = jpVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new fg(jpVar, 2));
                    jpVar.showDialog(jpVar.r);
                    break;
                }
                break;
            case 1:
                jp jpVar2 = this.b;
                jpVar2.getMessagesController().loadFullChat(jpVar2.A, 0, true);
                break;
            default:
                jp jpVar3 = this.b;
                jpVar3.getMessagesController().loadFullChat(jpVar3.A, 0, true);
                break;
        }
    }
}
