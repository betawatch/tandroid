package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ sg(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                bo boVar = this.b;
                boVar.getClass();
                if (num.intValue() != 0) {
                    boVar.Bc(true);
                    boVar.F(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    boVar.l1 = 0;
                    boVar.Bc(true);
                    boVar.getMessagesController().markReactionsAsRead(boVar.T5, boVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                bo boVar2 = this.b;
                boVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = boVar2.m1 - 1;
                    boVar2.m1 = i10;
                    if (i10 <= 0) {
                        boVar2.getMessagesController().markPollVotesAsRead(boVar2.T5, boVar2.d());
                    }
                    boVar2.Ac(true);
                    boVar2.F(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    boVar2.m1 = 0;
                    boVar2.Ac(true);
                    boVar2.getMessagesController().markPollVotesAsRead(boVar2.T5, boVar2.d());
                    break;
                }
            default:
                bo boVar3 = this.b;
                boVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boVar3.f7 = booleanValue;
                if (!booleanValue) {
                    boVar3.r8();
                    break;
                }
                break;
        }
    }
}
