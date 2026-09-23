package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ vo(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gp gpVar = this.b;
                gpVar.c0 = true;
                gpVar.b0();
                break;
            case 1:
                gp gpVar2 = this.b;
                gpVar2.X = gpVar2.getMessagesController().getChat(Long.valueOf(gpVar2.Z));
                gpVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                gp gpVar3 = this.b;
                gpVar3.c0 = true;
                if (gpVar3.a.length() > 0) {
                    gpVar3.W(gpVar3.a.getText().toString());
                }
                gpVar3.b0();
                break;
            case 4:
                this.b.Y();
                break;
            default:
                this.b.a0(true);
                break;
        }
    }
}
