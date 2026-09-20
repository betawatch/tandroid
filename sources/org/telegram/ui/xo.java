package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
