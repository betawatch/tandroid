// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x3c implements u2b {
    public final /* synthetic */ d4c a;

    public x3c(d4c d4cVar) {
        this.a = d4cVar;
    }

    @Override // u2b
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // u2b
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // u2b
    public final void e(TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z, boolean z2, int i, int i2) {
        this.a.b.f(i, obj, document, z2);
    }
}
