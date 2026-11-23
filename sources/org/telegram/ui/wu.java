package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements org.telegram.messenger.nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ wu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // org.telegram.messenger.nr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                bx bxVar = this.b;
                bxVar.getClass();
                bxVar.W1 = i7 != 0;
                org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts", bxVar.W1).commit();
                bxVar.u3(false);
                break;
            default:
                bx bxVar2 = this.b;
                bxVar2.getClass();
                bxVar2.W1 = i7 != 0;
                org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts", bxVar2.W1).apply();
                bxVar2.u3(false);
                break;
        }
    }
}
