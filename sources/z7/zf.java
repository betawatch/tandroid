package z7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class zf {
    public static t7.r a;

    public static synchronized xf a(tf tfVar) {
        xf xfVar;
        synchronized (zf.class) {
            try {
                if (a == null) {
                    a = new t7.r(4);
                }
                xfVar = (xf) a.R0(tfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xfVar;
    }

    public static synchronized xf b() {
        xf a2;
        synchronized (zf.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            a2 = a(new tf());
        }
        return a2;
    }
}
