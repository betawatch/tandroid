// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
