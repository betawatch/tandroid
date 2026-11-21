package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ String c;

    public /* synthetic */ qf(bn bnVar, String str, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    bn bnVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        bnVar.getMessagesController().p(str, false);
                    }
                    bnVar.getParentActivity();
                    vf.c.o(str);
                    break;
                }
                break;
            default:
                bn bnVar2 = this.b;
                bnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        bnVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(bnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
