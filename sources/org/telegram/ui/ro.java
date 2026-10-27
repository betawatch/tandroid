package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ ro(cp cpVar, int i10) {
        this.a = i10;
        this.b = cpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cp cpVar = this.b;
                cpVar.c0 = true;
                cpVar.d0();
                break;
            case 1:
                cp cpVar2 = this.b;
                cpVar2.X = cpVar2.getMessagesController().getChat(Long.valueOf(cpVar2.Z));
                cpVar2.a0();
                break;
            case 2:
                this.b.c0(false);
                break;
            case 3:
                cp cpVar3 = this.b;
                cpVar3.c0 = true;
                if (cpVar3.b.length() > 0) {
                    cpVar3.Y(cpVar3.b.getText().toString());
                }
                cpVar3.d0();
                break;
            case 4:
                this.b.a0();
                break;
            default:
                this.b.c0(true);
                break;
        }
    }
}
