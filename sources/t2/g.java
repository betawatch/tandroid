package t2;

import b8.zb;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends j2.h {
    public long r;
    public int s;
    public int w;

    @Override // j2.h, j2.a
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(j2.h hVar) {
        ByteBuffer byteBuffer;
        zb.f(!hVar.getFlag(TLObject.FLAG_30));
        zb.f(!hVar.hasSupplementalData());
        zb.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.s >= this.w) {
                return false;
            }
            ByteBuffer byteBuffer2 = hVar.c;
            if (byteBuffer2 != null && (byteBuffer = this.c) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i3 = this.s;
        this.s = i3 + 1;
        if (i3 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = hVar.e;
        return true;
    }

    public final boolean f() {
        return this.s > 0;
    }
}
