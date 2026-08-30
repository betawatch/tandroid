package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ so(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dp dpVar = this.b;
                dpVar.Z = true;
                dpVar.b0();
                break;
            case 1:
                dp dpVar2 = this.b;
                dpVar2.U = dpVar2.getMessagesController().getChat(Long.valueOf(dpVar2.W));
                dpVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                dp dpVar3 = this.b;
                dpVar3.Z = true;
                if (dpVar3.a.length() > 0) {
                    dpVar3.W(dpVar3.a.getText().toString());
                }
                dpVar3.b0();
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
