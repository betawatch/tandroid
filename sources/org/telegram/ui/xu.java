package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xu implements org.telegram.messenger.nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ xu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // org.telegram.messenger.nr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                cx cxVar = this.b;
                cxVar.getClass();
                cxVar.W1 = i7 != 0;
                org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts", cxVar.W1).commit();
                cxVar.u3(false);
                break;
            default:
                cx cxVar2 = this.b;
                cxVar2.getClass();
                cxVar2.W1 = i7 != 0;
                org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts", cxVar2.W1).apply();
                cxVar2.u3(false);
                break;
        }
    }
}
