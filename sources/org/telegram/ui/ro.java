package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                cpVar.g0();
                break;
            case 1:
                cp cpVar2 = this.b;
                cpVar2.X = cpVar2.getMessagesController().L0(Long.valueOf(cpVar2.Z));
                cpVar2.d0();
                break;
            case 2:
                this.b.f0(false);
                break;
            case 3:
                cp cpVar3 = this.b;
                cpVar3.c0 = true;
                if (cpVar3.b.length() > 0) {
                    cpVar3.b0(cpVar3.b.getText().toString());
                }
                cpVar3.g0();
                break;
            case 4:
                this.b.d0();
                break;
            default:
                this.b.f0(true);
                break;
        }
    }
}
