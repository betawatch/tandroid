package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ qg(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                co coVar = this.b;
                coVar.getClass();
                if (num.intValue() != 0) {
                    coVar.Bc(true);
                    coVar.F(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    coVar.l1 = 0;
                    coVar.Bc(true);
                    coVar.getMessagesController().markReactionsAsRead(coVar.T5, coVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                co coVar2 = this.b;
                coVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = coVar2.m1 - 1;
                    coVar2.m1 = i10;
                    if (i10 <= 0) {
                        coVar2.getMessagesController().markPollVotesAsRead(coVar2.T5, coVar2.d());
                    }
                    coVar2.Ac(true);
                    coVar2.F(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    coVar2.m1 = 0;
                    coVar2.Ac(true);
                    coVar2.getMessagesController().markPollVotesAsRead(coVar2.T5, coVar2.d());
                    break;
                }
            default:
                co coVar3 = this.b;
                coVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                coVar3.f7 = booleanValue;
                if (!booleanValue) {
                    coVar3.r8();
                    break;
                }
                break;
        }
    }
}
