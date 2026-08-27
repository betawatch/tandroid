package r4;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class f extends k3.m implements h {
    public final String a;

    public f(String str) {
        super(new k[2], new l[2]);
        this.a = str;
        setInitialInputBufferSize(1024);
    }

    public abstract g c(int i10, boolean z10, byte[] bArr);

    @Override // k3.m
    public final k3.i createInputBuffer() {
        return new k();
    }

    @Override // k3.m
    public final k3.k createOutputBuffer() {
        return new e(this, 1);
    }

    @Override // k3.m
    public final k3.g createUnexpectedDecodeException(Throwable th) {
        return new i("Unexpected decode error", th);
    }

    @Override // k3.m
    public final k3.g decode(k3.i iVar, k3.k kVar, boolean z10) {
        k kVar2 = (k) iVar;
        l lVar = (l) kVar;
        try {
            ByteBuffer byteBuffer = kVar2.b;
            byteBuffer.getClass();
            lVar.a(kVar2.d, c(byteBuffer.limit(), z10, byteBuffer.array()), kVar2.n);
            lVar.clearFlag(TLObject.FLAG_31);
            return null;
        } catch (i e9) {
            return e9;
        }
    }

    @Override // k3.e
    public final String getName() {
        return this.a;
    }

    @Override // r4.h
    public final void a(long j10) {
    }
}
