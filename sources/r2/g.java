package r2;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g extends h2.g {
    public long v;
    public int w;
    public int x;

    @Override // h2.g
    public final void i() {
        super.i();
        this.w = 0;
    }

    public final boolean n(h2.g gVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!gVar.c(TLObject.FLAG_30));
        e2.d.b(!gVar.c(TLObject.FLAG_28));
        e2.d.b(!gVar.c(4));
        if (o()) {
            if (this.w >= this.x) {
                return false;
            }
            ByteBuffer byteBuffer2 = gVar.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.w;
        this.w = i10 + 1;
        if (i10 == 0) {
            this.h = gVar.h;
            if (gVar.c(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = gVar.e;
        if (byteBuffer3 != null) {
            l(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.v = gVar.h;
        return true;
    }

    public final boolean o() {
        return this.w > 0;
    }
}
