package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;

    public /* synthetic */ rn(go goVar, int i7) {
        this.a = i7;
        this.b = goVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                go goVar = this.b;
                goVar.c0 = true;
                goVar.h0();
                break;
            case 1:
                go goVar2 = this.b;
                goVar2.X = goVar2.getMessagesController().M0(Long.valueOf(goVar2.Z));
                goVar2.e0();
                break;
            case 2:
                this.b.g0(false);
                break;
            case 3:
                go goVar3 = this.b;
                goVar3.c0 = true;
                if (goVar3.b.length() > 0) {
                    goVar3.c0(goVar3.b.getText().toString());
                }
                goVar3.h0();
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
