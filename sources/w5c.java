// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class w5c implements p4b {
    public final /* synthetic */ d6c a;

    public w5c(d6c d6cVar) {
        this.a = d6cVar;
    }

    @Override // p4b
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // p4b
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // p4b
    public final void e(TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, boolean z2, int i, int i2) {
        this.a.b.f(i, obj, document, z2);
    }
}
