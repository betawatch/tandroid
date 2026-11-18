package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = j3;
        this.c = j10;
        this.d = l10;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7;
        switch (this.a) {
            case 0:
                bn.u1((bn) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.h2) ((ti) this.e).b).currentAccount;
                boolean z10 = false;
                di.x8 y10 = di.x8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.b, this.c, z10, true);
                break;
        }
    }
}
