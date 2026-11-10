package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;

    public /* synthetic */ tn(io ioVar, int i7) {
        this.a = i7;
        this.b = ioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                io ioVar = this.b;
                ioVar.c0 = true;
                ioVar.h0();
                break;
            case 1:
                io ioVar2 = this.b;
                ioVar2.X = ioVar2.getMessagesController().M0(Long.valueOf(ioVar2.Z));
                ioVar2.e0();
                break;
            case 2:
                this.b.g0(false);
                break;
            case 3:
                io ioVar3 = this.b;
                ioVar3.c0 = true;
                if (ioVar3.b.length() > 0) {
                    ioVar3.c0(ioVar3.b.getText().toString());
                }
                ioVar3.h0();
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
