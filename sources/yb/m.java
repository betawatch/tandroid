package yb;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m extends b {
    public int d;

    @Override // yb.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = r2.b.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m.class == obj.getClass() && this.d == ((m) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
