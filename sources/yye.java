// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class yye {
    public final vf7 a(xf7 xf7Var) {
        ByteBuffer byteBuffer = xf7Var.c;
        byteBuffer.getClass();
        yve.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(xf7Var, byteBuffer);
    }

    public abstract vf7 b(xf7 xf7Var, ByteBuffer byteBuffer);
}
