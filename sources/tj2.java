// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tj2 {
    public final HashMap a;

    public tj2(byte b) {
        switch (b) {
            case 1:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public final void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.a.remove(runnable);
        if (runnable2 != null) {
            gl.r(runnable2);
        }
    }

    public final void b() {
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            gl.r((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }
}
