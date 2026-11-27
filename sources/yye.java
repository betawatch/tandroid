// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class yye {
    public final uf7 a(wf7 wf7Var) {
        ByteBuffer byteBuffer = wf7Var.c;
        byteBuffer.getClass();
        yve.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(wf7Var, byteBuffer);
    }

    public abstract uf7 b(wf7 wf7Var, ByteBuffer byteBuffer);
}
