package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ qg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                zn znVar = this.b;
                znVar.getClass();
                if (num.intValue() != 0) {
                    znVar.Bc(true);
                    znVar.F(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    znVar.l1 = 0;
                    znVar.Bc(true);
                    znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                zn znVar2 = this.b;
                znVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = znVar2.m1 - 1;
                    znVar2.m1 = i10;
                    if (i10 <= 0) {
                        znVar2.getMessagesController().markPollVotesAsRead(znVar2.T5, znVar2.d());
                    }
                    znVar2.Ac(true);
                    znVar2.F(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    znVar2.m1 = 0;
                    znVar2.Ac(true);
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.T5, znVar2.d());
                    break;
                }
            default:
                zn znVar3 = this.b;
                znVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                znVar3.f7 = booleanValue;
                if (!booleanValue) {
                    znVar3.r8();
                    break;
                }
                break;
        }
    }
}
