package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vg(Object obj, long j3, long j10, Long l10, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = j3;
        this.c = j10;
        this.d = l10;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        switch (this.a) {
            case 0:
                cn.u1((cn) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((ui) this.e).b).currentAccount;
                boolean z9 = false;
                bi.ea y10 = bi.ea.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z9 = true;
                }
                y10.g0(this.b, this.c, z9, true);
                break;
        }
    }
}
