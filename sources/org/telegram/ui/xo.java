package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ipVar.c0 = true;
                ipVar.b0();
                break;
            case 1:
                ip ipVar2 = this.b;
                ipVar2.X = ipVar2.getMessagesController().getChat(Long.valueOf(ipVar2.Z));
                ipVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                ip ipVar3 = this.b;
                ipVar3.c0 = true;
                if (ipVar3.a.length() > 0) {
                    ipVar3.W(ipVar3.a.getText().toString());
                }
                ipVar3.b0();
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
