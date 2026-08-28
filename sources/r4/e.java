package r4;

import java.nio.ByteBuffer;
import k3.m;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e extends m implements g {
    public final String a;

    public e(String str) {
        super(new j[2], new k[2]);
        this.a = str;
        setInitialInputBufferSize(1024);
    }

    public abstract f c(int i9, boolean z10, byte[] bArr);

    @Override // k3.m
    public final k3.i createInputBuffer() {
        return new j();
    }

    @Override // k3.m
    public final k3.k createOutputBuffer() {
        return new d(this, 1);
    }

    @Override // k3.m
    public final k3.g createUnexpectedDecodeException(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    @Override // k3.m
    public final k3.g decode(k3.i iVar, k3.k kVar, boolean z10) {
        j jVar = (j) iVar;
        k kVar2 = (k) kVar;
        try {
            ByteBuffer byteBuffer = jVar.b;
            byteBuffer.getClass();
            kVar2.a(jVar.d, c(byteBuffer.limit(), z10, byteBuffer.array()), jVar.n);
            kVar2.clearFlag(TLObject.FLAG_31);
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override // k3.e
    public final String getName() {
        return this.a;
    }

    @Override // r4.g
    public final void a(long j10) {
    }
}
