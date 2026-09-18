package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                kpVar.c0 = true;
                kpVar.b0();
                break;
            case 1:
                kp kpVar2 = this.b;
                kpVar2.X = kpVar2.getMessagesController().getChat(Long.valueOf(kpVar2.Z));
                kpVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                kp kpVar3 = this.b;
                kpVar3.c0 = true;
                if (kpVar3.a.length() > 0) {
                    kpVar3.W(kpVar3.a.getText().toString());
                }
                kpVar3.b0();
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
