// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class px3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final u8a b;
    public volatile byte c = 0;

    public px3(u8a u8aVar, int i) {
        this.b = u8aVar;
        this.a = i;
    }

    public final int a(int i) {
        xf7 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = b.b;
        int i2 = a + b.a;
        return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
    }

    public final xf7 b() {
        ThreadLocal threadLocal = d;
        xf7 xf7Var = (xf7) threadLocal.get();
        if (xf7Var == null) {
            xf7Var = new xf7();
            threadLocal.set(xf7Var);
        }
        yf7 yf7Var = (yf7) this.b.a;
        int a = yf7Var.a(6);
        if (a != 0) {
            int i = a + yf7Var.a;
            int i2 = yf7Var.b.getInt(i) + i + 4 + (this.a << 2);
            int i3 = yf7Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = yf7Var.b;
            xf7Var.b = byteBuffer;
            if (byteBuffer != null) {
                xf7Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                xf7Var.c = i4;
                xf7Var.d = xf7Var.b.getShort(i4);
                return xf7Var;
            }
            xf7Var.a = 0;
            xf7Var.c = 0;
            xf7Var.d = 0;
        }
        return xf7Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        xf7 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? b.b.getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        xf7 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = b2.b.getInt(b2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
