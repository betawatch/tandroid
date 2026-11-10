package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ tf(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                cn cnVar = this.b;
                cnVar.getClass();
                if (num.intValue() != 0) {
                    cnVar.id(true);
                    cnVar.l(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    cnVar.z1 = 0;
                    cnVar.id(true);
                    cnVar.getMessagesController().t3(cnVar.j6, cnVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                cn cnVar2 = this.b;
                cnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i7 = cnVar2.A1 - 1;
                    cnVar2.A1 = i7;
                    if (i7 <= 0) {
                        cnVar2.getMessagesController().s3(cnVar2.j6, cnVar2.b());
                    }
                    cnVar2.hd(true);
                    cnVar2.l(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    cnVar2.A1 = 0;
                    cnVar2.hd(true);
                    cnVar2.getMessagesController().s3(cnVar2.j6, cnVar2.b());
                    break;
                }
            default:
                cn cnVar3 = this.b;
                cnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cnVar3.v7 = booleanValue;
                if (!booleanValue) {
                    cnVar3.K8();
                    break;
                }
                break;
        }
    }
}
