package y3;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = this.r;
        if (i9 > 0) {
            if (i9 >= this.s || iVar.isDecodeOnly() != isDecodeOnly()) {
                return false;
            }
            ByteBuffer byteBuffer2 = iVar.b;
            if (byteBuffer2 != null && (byteBuffer = this.b) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.r;
        this.r = i10 + 1;
        if (i10 == 0) {
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
            c(byteBuffer3.remaining());
            this.b.put(byteBuffer3);
        }
        this.n = iVar.d;
        return true;
    }
}
