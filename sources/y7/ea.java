package y7;

import a8.qg;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
