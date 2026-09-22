package r2;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class g extends h2.h {
    public long r;
    public int s;
    public int v;

    @Override // h2.h, h2.a
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean h(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(TLObject.FLAG_30));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (i()) {
            if (this.s >= this.v) {
                return false;
            }
            ByteBuffer byteBuffer2 = hVar.c;
            if (byteBuffer2 != null && (byteBuffer = this.c) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.s;
        this.s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = hVar.e;
        return true;
    }

    public final boolean i() {
        return this.s > 0;
    }
}
