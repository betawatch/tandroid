package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ String c;

    public /* synthetic */ rf(an anVar, String str, int i7) {
        this.a = i7;
        this.b = anVar;
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
                    an anVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        anVar.getMessagesController().p(str, false);
                    }
                    anVar.getParentActivity();
                    vf.c.o(str);
                    break;
                }
                break;
            default:
                an anVar2 = this.b;
                anVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        anVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(anVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
