package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ rg(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                eo eoVar = this.b;
                eoVar.getClass();
                if (num.intValue() != 0) {
                    eoVar.Bc(true);
                    eoVar.E(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    eoVar.l1 = 0;
                    eoVar.Bc(true);
                    eoVar.getMessagesController().markReactionsAsRead(eoVar.T5, eoVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                eo eoVar2 = this.b;
                eoVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = eoVar2.m1 - 1;
                    eoVar2.m1 = i10;
                    if (i10 <= 0) {
                        eoVar2.getMessagesController().markPollVotesAsRead(eoVar2.T5, eoVar2.d());
                    }
                    eoVar2.Ac(true);
                    eoVar2.E(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    eoVar2.m1 = 0;
                    eoVar2.Ac(true);
                    eoVar2.getMessagesController().markPollVotesAsRead(eoVar2.T5, eoVar2.d());
                    break;
                }
            default:
                eo eoVar3 = this.b;
                eoVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eoVar3.f7 = booleanValue;
                if (!booleanValue) {
                    eoVar3.r8();
                    break;
                }
                break;
        }
    }
}
