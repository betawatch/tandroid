package u2;

import a8.ia;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g extends k2.h {
    public long r;
    public int s;
    public int w;

    @Override // k2.h, k2.a
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        ia.f(!hVar.getFlag(TLObject.FLAG_30));
        ia.f(!hVar.hasSupplementalData());
        ia.f(!hVar.isEndOfStream());
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
        int i7 = this.s;
        this.s = i7 + 1;
        if (i7 == 0) {
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
