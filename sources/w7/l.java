package w7;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l {
    public b2.u0 a(l3.a aVar) {
        ByteBuffer byteBuffer = aVar.c;
        byteBuffer.getClass();
        v7.t6.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(aVar, byteBuffer);
    }

    public abstract b2.u0 b(l3.a aVar, ByteBuffer byteBuffer);
}
