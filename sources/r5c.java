// default package

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class r5c extends rf0 {
    public ByteBuffer d;

    static {
        Logger.getLogger(r5c.class.getName());
    }

    @Override // rf0
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.a + ", sizeOfInstance=" + this.b + ", data=" + this.d + '}';
    }
}
