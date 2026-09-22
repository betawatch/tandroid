package z7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class yf {
    public static t7.r a;

    public static synchronized wf a(sf sfVar) {
        wf wfVar;
        synchronized (yf.class) {
            try {
                if (a == null) {
                    a = new t7.r(4);
                }
                wfVar = (wf) a.O0(sfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wfVar;
    }

    public static synchronized wf b() {
        wf a2;
        synchronized (yf.class) {
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
