package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;

    public /* synthetic */ rq(vr vrVar, int i10) {
        this.a = i10;
        this.b = vrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                vr vrVar = this.b;
                vrVar.getMessagesController().loadFullChat(vrVar.N, 0, true);
                break;
        }
    }
}
