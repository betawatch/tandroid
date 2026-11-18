package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
