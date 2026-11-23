package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ sf(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                bn bnVar = this.b;
                bnVar.getClass();
                if (num.intValue() != 0) {
                    bnVar.jd(true);
                    bnVar.l(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    bnVar.A1 = 0;
                    bnVar.jd(true);
                    bnVar.getMessagesController().A3(bnVar.l6, bnVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                bn bnVar2 = this.b;
                bnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i7 = bnVar2.B1 - 1;
                    bnVar2.B1 = i7;
                    if (i7 <= 0) {
                        bnVar2.getMessagesController().z3(bnVar2.l6, bnVar2.d());
                    }
                    bnVar2.id(true);
                    bnVar2.l(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    bnVar2.B1 = 0;
                    bnVar2.id(true);
                    bnVar2.getMessagesController().z3(bnVar2.l6, bnVar2.d());
                    break;
                }
            default:
                bn bnVar3 = this.b;
                bnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bnVar3.x7 = booleanValue;
                if (!booleanValue) {
                    bnVar3.L8();
                    break;
                }
                break;
        }
    }
}
