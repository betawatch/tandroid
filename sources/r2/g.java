package r2;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends h2.h {
    public long r;
    public int s;
    public int w;

    @Override // h2.h, h2.a
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(h2.h hVar) {
        ByteBuffer byteBuffer;
        t6.f(!hVar.getFlag(TLObject.FLAG_30));
        t6.f(!hVar.hasSupplementalData());
        t6.f(!hVar.isEndOfStream());
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

    public final boolean f() {
        return this.s > 0;
    }
}
