// default package

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zg0 extends z83 {
    public long r;
    public int s;
    public byte w;

    @Override // z83, n01
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(z83 z83Var) {
        ByteBuffer byteBuffer;
        gre.f(!z83Var.getFlag(TLObject.FLAG_30));
        gre.f(!z83Var.hasSupplementalData());
        gre.f(!z83Var.isEndOfStream());
        if (f()) {
            if (this.s >= this.w) {
                return false;
            }
            ByteBuffer byteBuffer2 = z83Var.c;
            if (byteBuffer2 != null && (byteBuffer = this.c) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.s;
        this.s = i + 1;
        if (i == 0) {
            this.e = z83Var.e;
            if (z83Var.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = z83Var.c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = z83Var.e;
        return true;
    }

    public final boolean f() {
        return this.s > 0;
    }
}
