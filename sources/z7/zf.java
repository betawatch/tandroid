package z7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class zf {
    public static t7.r a;

    public static synchronized wf a(sf sfVar) {
        wf wfVar;
        synchronized (zf.class) {
            try {
                if (a == null) {
                    a = new t7.r(4);
                }
                wfVar = (wf) a.R0(sfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wfVar;
    }

    public static synchronized wf b() {
        wf a2;
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
            a2 = a(new sf());
        }
        return a2;
    }
}
