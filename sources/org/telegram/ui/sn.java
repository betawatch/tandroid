package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ sn(ho hoVar, int i7) {
        this.a = i7;
        this.b = hoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ho hoVar = this.b;
                hoVar.d0 = true;
                hoVar.h0();
                break;
            case 1:
                ho hoVar2 = this.b;
                hoVar2.Y = hoVar2.getMessagesController().M0(Long.valueOf(hoVar2.a0));
                hoVar2.e0();
                break;
            case 2:
                this.b.g0(false);
                break;
            case 3:
                ho hoVar3 = this.b;
                hoVar3.d0 = true;
                if (hoVar3.b.length() > 0) {
                    hoVar3.c0(hoVar3.b.getText().toString());
                }
                hoVar3.h0();
                break;
            case 4:
                this.b.e0();
                break;
            default:
                this.b.g0(true);
                break;
        }
    }
}
