package v4;

import java.nio.ByteBuffer;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class e extends n3.l implements g {
    public e(String str) {
        super(new j[2], new k[2]);
        int i10 = this.g;
        n3.i[] iVarArr = this.e;
        h5.a.i(i10 == iVarArr.length);
        for (n3.i iVar : iVarArr) {
            iVar.k(1024);
        }
    }

    @Override // n3.l
    public final n3.i e() {
        return new j();
    }

    @Override // n3.l
    public final n3.j f() {
        return new d(this, 1);
    }

    @Override // n3.l
    public final n3.g g(Throwable th2) {
        return new h("Unexpected decode error", th2);
    }

    @Override // n3.l
    public final n3.g h(n3.i iVar, n3.j jVar, boolean z4) {
        j jVar2 = (j) iVar;
        k kVar = (k) jVar;
        try {
            ByteBuffer byteBuffer = jVar2.d;
            byteBuffer.getClass();
            kVar.k(jVar2.f, k(byteBuffer.limit(), z4, byteBuffer.array()), jVar2.s);
            kVar.b &= ConnectionsManager.DEFAULT_DATACENTER_ID;
            return null;
        } catch (h e) {
            return e;
        }
    }

    public abstract f k(int i10, boolean z4, byte[] bArr);

    @Override // v4.g
    public final void a(long j10) {
    }
}
