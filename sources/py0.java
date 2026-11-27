// default package

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class py0 {
    public static final byte[] a = {-75, 0, 60, 0, 1, 4};

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(py0.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void b(ByteBuffer byteBuffer, boolean z) {
        ArrayList b = wue.b(byteBuffer.asReadOnlyBuffer());
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            er7 er7Var = (er7) obj;
            byte b2 = er7Var.a;
            ByteBuffer byteBuffer2 = er7Var.b;
            if (b2 == 5) {
                try {
                    yve.f(b2 == 5);
                    ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                    if (wue.a(asReadOnlyBuffer) == 4) {
                        if (z && asReadOnlyBuffer.remaining() >= 6) {
                            int position = asReadOnlyBuffer.position();
                            for (int i2 = 0; i2 < 6; i2++) {
                                if (asReadOnlyBuffer.get(position + i2) == a[i2]) {
                                }
                            }
                        }
                        byteBuffer.put(byteBuffer2.position(), (byte) 31);
                        break;
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }
}
