package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ tf(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                an anVar = this.b;
                anVar.getClass();
                if (num.intValue() != 0) {
                    anVar.fd(true);
                    anVar.l(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    anVar.z1 = 0;
                    anVar.fd(true);
                    anVar.getMessagesController().t3(anVar.j6, anVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                an anVar2 = this.b;
                anVar2.getClass();
                if (num2.intValue() != 0) {
                    int i7 = anVar2.A1 - 1;
                    anVar2.A1 = i7;
                    if (i7 <= 0) {
                        anVar2.getMessagesController().s3(anVar2.j6, anVar2.b());
                    }
                    anVar2.ed(true);
                    anVar2.l(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    anVar2.A1 = 0;
                    anVar2.ed(true);
                    anVar2.getMessagesController().s3(anVar2.j6, anVar2.b());
                    break;
                }
            default:
                an anVar3 = this.b;
                anVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                anVar3.v7 = booleanValue;
                if (!booleanValue) {
                    anVar3.J8();
                    break;
                }
                break;
        }
    }
}
