// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wr9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zr9 b;

    public /* synthetic */ wr9(zr9 zr9Var, byte b) {
        this.a = b;
        this.b = zr9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zr9 zr9Var = this.b;
        switch (b) {
            case 0:
                try {
                    ad7.Y(zr9Var.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                try {
                    SQLiteCursor queryFinalized = ad7.Y(zr9Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        xr9 xr9Var = new xr9();
                        xr9Var.a = queryFinalized.stringValue(0);
                        xr9Var.b = queryFinalized.intValue(1);
                        arrayList.add(xr9Var);
                        hashMap.put(xr9Var.a, xr9Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new fx7((byte) 16));
                    gl.c3(new gm8(zr9Var, arrayList, hashMap, (byte) 23));
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
        }
    }
}
