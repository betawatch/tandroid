package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp b;

    public /* synthetic */ uo(fp fpVar, int i10) {
        this.a = i10;
        this.b = fpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fp fpVar = this.b;
                fpVar.Z = true;
                fpVar.b0();
                break;
            case 1:
                fp fpVar2 = this.b;
                fpVar2.U = fpVar2.getMessagesController().getChat(Long.valueOf(fpVar2.W));
                fpVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                fp fpVar3 = this.b;
                fpVar3.Z = true;
                if (fpVar3.a.length() > 0) {
                    fpVar3.W(fpVar3.a.getText().toString());
                }
                fpVar3.b0();
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
