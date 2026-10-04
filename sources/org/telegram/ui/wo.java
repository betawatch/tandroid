package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ wo(hp hpVar, int i10) {
        this.a = i10;
        this.b = hpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                hpVar.c0 = true;
                hpVar.b0();
                break;
            case 1:
                hp hpVar2 = this.b;
                hpVar2.X = hpVar2.getMessagesController().getChat(Long.valueOf(hpVar2.Z));
                hpVar2.X();
                break;
            case 2:
                this.b.Z(false);
                break;
            case 3:
                hp hpVar3 = this.b;
                hpVar3.c0 = true;
                if (hpVar3.a.length() > 0) {
                    hpVar3.U(hpVar3.a.getText().toString());
                }
                hpVar3.b0();
                break;
            case 4:
                this.b.X();
                break;
            default:
                this.b.Z(true);
                break;
        }
    }
}
