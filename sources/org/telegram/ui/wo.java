package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                hpVar.d0 = true;
                hpVar.b0();
                break;
            case 1:
                hp hpVar2 = this.b;
                hpVar2.Y = hpVar2.getMessagesController().getChat(Long.valueOf(hpVar2.a0));
                hpVar2.X();
                break;
            case 2:
                this.b.Z(false);
                break;
            case 3:
                hp hpVar3 = this.b;
                hpVar3.d0 = true;
                if (hpVar3.b.length() > 0) {
                    hpVar3.U(hpVar3.b.getText().toString());
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
