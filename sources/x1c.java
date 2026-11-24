// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x1c implements r0b {
    public final /* synthetic */ d2c a;

    public x1c(d2c d2cVar) {
        this.a = d2cVar;
    }

    @Override // r0b
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // r0b
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // r0b
    public final void e(TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, boolean z2, int i, int i2) {
        this.a.b.f(i, obj, document, z2);
    }
}
