package r2;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public final boolean f(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(TLObject.FLAG_30));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (g()) {
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
            b(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = hVar.e;
        return true;
    }

    public final boolean g() {
        return this.s > 0;
    }
}
