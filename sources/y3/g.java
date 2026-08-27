package y3;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends k3.i {
    public long n;
    public int r;
    public int s;

    @Override // k3.i, k3.a
    public final void clear() {
        super.clear();
        this.r = 0;
    }

    public final boolean e(k3.i iVar) {
        ByteBuffer byteBuffer;
        d5.a.f(!iVar.getFlag(TLObject.FLAG_30));
        d5.a.f(!iVar.hasSupplementalData());
        d5.a.f(!iVar.isEndOfStream());
        int i10 = this.r;
        if (i10 > 0) {
            if (i10 >= this.s || iVar.isDecodeOnly() != isDecodeOnly()) {
                return false;
            }
            ByteBuffer byteBuffer2 = iVar.b;
            if (byteBuffer2 != null && (byteBuffer = this.b) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.r;
        this.r = i11 + 1;
        if (i11 == 0) {
            this.d = iVar.d;
            if (iVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (iVar.isDecodeOnly()) {
            setFlags(TLObject.FLAG_31);
        }
        ByteBuffer byteBuffer3 = iVar.b;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.b.put(byteBuffer3);
        }
        this.n = iVar.d;
        return true;
    }
}
