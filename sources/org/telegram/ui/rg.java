package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                i7 = ((org.telegram.ui.ActionBar.g2) ((ti) this.e).b).currentAccount;
                boolean z10 = false;
                di.y8 y10 = di.y8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.b, this.c, z10, true);
                break;
        }
    }
}
