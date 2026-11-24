// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uw3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final wtc b;
    public volatile byte c = 0;

    public uw3(wtc wtcVar, int i) {
        this.b = wtcVar;
        this.a = i;
    }

    public final int a(int i) {
        od7 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = b.b;
        int i2 = a + b.a;
        return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
    }

    public final od7 b() {
        ThreadLocal threadLocal = d;
        od7 od7Var = (od7) threadLocal.get();
        if (od7Var == null) {
            od7Var = new od7();
            threadLocal.set(od7Var);
        }
        pd7 pd7Var = (pd7) this.b.a;
        int a = pd7Var.a(6);
        if (a != 0) {
            int i = a + pd7Var.a;
            int i2 = pd7Var.b.getInt(i) + i + 4 + (this.a << 2);
            int i3 = pd7Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = pd7Var.b;
            od7Var.b = byteBuffer;
            if (byteBuffer != null) {
                od7Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                od7Var.c = i4;
                od7Var.d = od7Var.b.getShort(i4);
                return od7Var;
            }
            od7Var.a = 0;
            od7Var.c = 0;
            od7Var.d = 0;
        }
        return od7Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        od7 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? b.b.getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        od7 b2 = b();
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
