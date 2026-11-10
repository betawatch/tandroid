package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ String c;

    public /* synthetic */ rf(cn cnVar, String str, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    cn cnVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        cnVar.getMessagesController().p(str, false);
                    }
                    cnVar.getParentActivity();
                    vf.c.o(str);
                    break;
                }
                break;
            default:
                cn cnVar2 = this.b;
                cnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        cnVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(cnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
