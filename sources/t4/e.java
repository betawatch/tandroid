package t4;

import java.nio.ByteBuffer;
import m3.m;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e extends m implements g {
    public final String a;

    public e(String str) {
        super(new j[2], new k[2]);
        this.a = str;
        setInitialInputBufferSize(1024);
    }

    public abstract f c(int i10, boolean z10, byte[] bArr);

    @Override // m3.m
    public final m3.i createInputBuffer() {
        return new j();
    }

    @Override // m3.m
    public final m3.k createOutputBuffer() {
        return new d(this, 1);
    }

    @Override // m3.m
    public final m3.g createUnexpectedDecodeException(Throwable th2) {
        return new h("Unexpected decode error", th2);
    }

    @Override // m3.m
    public final m3.g decode(m3.i iVar, m3.k kVar, boolean z10) {
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

    @Override // m3.e
    public final String getName() {
        return this.a;
    }

    @Override // t4.g
    public final void a(long j10) {
    }
}
