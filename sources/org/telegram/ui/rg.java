package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements org.telegram.messenger.z10 {
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

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7;
        switch (this.a) {
            case 0:
                an.u1((an) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.e2) ((si) this.e).b).currentAccount;
                boolean z10 = false;
                di.v8 y10 = di.v8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.b, this.c, z10, true);
                break;
        }
    }
}
