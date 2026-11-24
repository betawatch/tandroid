// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yt9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu9 b;

    public /* synthetic */ yt9(bu9 bu9Var, byte b) {
        this.a = b;
        this.b = bu9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                try {
                    cf7.Y(bu9Var.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                try {
                    SQLiteCursor queryFinalized = cf7.Y(bu9Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        zt9 zt9Var = new zt9();
                        zt9Var.a = queryFinalized.stringValue(0);
                        zt9Var.b = queryFinalized.intValue(1);
                        arrayList.add(zt9Var);
                        hashMap.put(zt9Var.a, zt9Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new qx7((byte) 17));
                    gm.c3(new ak8((Object) bu9Var, (Object) arrayList, (Object) hashMap, (byte) 26));
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
        }
    }
}
