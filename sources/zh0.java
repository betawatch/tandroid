// default package

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zh0 extends la3 {
    public long r;
    public int s;
    public byte w;

    @Override // la3, v11
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(la3 la3Var) {
        ByteBuffer byteBuffer;
        jte.f(!la3Var.getFlag(TLObject.FLAG_30));
        jte.f(!la3Var.hasSupplementalData());
        jte.f(!la3Var.isEndOfStream());
        if (f()) {
            if (this.s >= this.w) {
                return false;
            }
            ByteBuffer byteBuffer2 = la3Var.c;
            if (byteBuffer2 != null && (byteBuffer = this.c) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.s;
        this.s = i + 1;
        if (i == 0) {
            this.e = la3Var.e;
            if (la3Var.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = la3Var.c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = la3Var.e;
        return true;
    }

    public final boolean f() {
        return this.s > 0;
    }
}
