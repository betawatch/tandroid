package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ so(ep epVar, int i10) {
        this.a = i10;
        this.b = epVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ep epVar = this.b;
                epVar.Z = true;
                epVar.b0();
                break;
            case 1:
                ep epVar2 = this.b;
                epVar2.U = epVar2.getMessagesController().getChat(Long.valueOf(epVar2.W));
                epVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                ep epVar3 = this.b;
                epVar3.Z = true;
                if (epVar3.a.length() > 0) {
                    epVar3.W(epVar3.a.getText().toString());
                }
                epVar3.b0();
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
