// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pv9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sv9 b;

    public /* synthetic */ pv9(sv9 sv9Var, byte b) {
        this.a = b;
        this.b = sv9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sv9 sv9Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteCursor queryFinalized = jf7.Y(sv9Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        qv9 qv9Var = new qv9();
                        qv9Var.a = queryFinalized.stringValue(0);
                        qv9Var.b = queryFinalized.intValue(1);
                        arrayList.add(qv9Var);
                        hashMap.put(qv9Var.a, qv9Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new qq7((byte) 19));
                    hl.c3(new jr9((Object) sv9Var, (Object) arrayList, (Object) hashMap, (byte) 2));
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                try {
                    jf7.Y(sv9Var.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
        }
    }
}
