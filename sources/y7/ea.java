package y7;

import a8.qg;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class ea {
    public static qg a;

    public static synchronized ca a(z9 z9Var) {
        ca caVar;
        synchronized (ea.class) {
            try {
                if (a == null) {
                    a = new qg(4);
                }
                caVar = (ca) a.R0(z9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return caVar;
    }

    public static synchronized ca b() {
        ca a2;
        synchronized (ea.class) {
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
            a2 = a(new z9());
        }
        return a2;
    }
}
