package w7;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class l {
    public b2.p0 a(l3.a aVar) {
        ByteBuffer byteBuffer = aVar.c;
        byteBuffer.getClass();
        e2.d.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(aVar, byteBuffer);
    }

    public abstract b2.p0 b(l3.a aVar, ByteBuffer byteBuffer);
}
