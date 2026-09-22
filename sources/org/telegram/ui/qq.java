package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ qq(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                ur urVar = this.b;
                urVar.getMessagesController().loadFullChat(urVar.N, 0, true);
                break;
        }
    }
}
