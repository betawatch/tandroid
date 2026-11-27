// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        yf7 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = b.b;
        int i2 = a + b.a;
        return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
    }

    public final yf7 b() {
        ThreadLocal threadLocal = d;
        yf7 yf7Var = (yf7) threadLocal.get();
        if (yf7Var == null) {
            yf7Var = new yf7();
            threadLocal.set(yf7Var);
        }
        zf7 zf7Var = (zf7) this.b.a;
        int a = zf7Var.a(6);
        if (a != 0) {
            int i = a + zf7Var.a;
            int i2 = zf7Var.b.getInt(i) + i + 4 + (this.a << 2);
            int i3 = zf7Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = zf7Var.b;
            yf7Var.b = byteBuffer;
            if (byteBuffer != null) {
                yf7Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                yf7Var.c = i4;
                yf7Var.d = yf7Var.b.getShort(i4);
                return yf7Var;
            }
            yf7Var.a = 0;
            yf7Var.c = 0;
            yf7Var.d = 0;
        }
        return yf7Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        yf7 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? b.b.getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        yf7 b2 = b();
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
