package org.telegram.ui;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
