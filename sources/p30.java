// default package

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface p30 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    ByteBuffer b();

    void c(n30 n30Var);

    void d(ByteBuffer byteBuffer);

    l30 e(l30 l30Var);

    void f();

    long g(long j);

    boolean isActive();

    void reset();
}
