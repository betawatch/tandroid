package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ rg(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                fo foVar = this.b;
                foVar.getClass();
                if (num.intValue() != 0) {
                    foVar.Fc(true);
                    foVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    foVar.l1 = 0;
                    foVar.Fc(true);
                    foVar.getMessagesController().markReactionsAsRead(foVar.T5, foVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                fo foVar2 = this.b;
                foVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = foVar2.m1 - 1;
                    foVar2.m1 = i10;
                    if (i10 <= 0) {
                        foVar2.getMessagesController().markPollVotesAsRead(foVar2.T5, foVar2.d());
                    }
                    foVar2.Ec(true);
                    foVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    foVar2.m1 = 0;
                    foVar2.Ec(true);
                    foVar2.getMessagesController().markPollVotesAsRead(foVar2.T5, foVar2.d());
                    break;
                }
            default:
                fo foVar3 = this.b;
                foVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                foVar3.f7 = booleanValue;
                if (!booleanValue) {
                    foVar3.v8();
                    break;
                }
                break;
        }
    }
}
