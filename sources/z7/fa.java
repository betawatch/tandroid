package z7;

import b8.ng;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class fa {
    public static ng a;

    public static synchronized da a(aa aaVar) {
        da daVar;
        synchronized (fa.class) {
            try {
                if (a == null) {
                    a = new ng(4);
                }
                daVar = (da) a.R0(aaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return daVar;
    }

    public static synchronized da b() {
        da a10;
        synchronized (fa.class) {
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
            a10 = a(new aa());
        }
        return a10;
    }
}
