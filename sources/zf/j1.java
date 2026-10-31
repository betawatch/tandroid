package zf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ j1(m1 m1Var, int i10) {
        this.a = i10;
        this.b = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    hs.a0(this.b.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                m1 m1Var = this.b;
                try {
                    SQLiteCursor queryFinalized = hs.a0(m1Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        k1 k1Var = new k1();
                        k1Var.a = queryFinalized.stringValue(0);
                        k1Var.b = queryFinalized.intValue(1);
                        arrayList.add(k1Var);
                        hashMap.put(k1Var.a, k1Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new x2.e(11));
                    org.telegram.messenger.i0.g3(new k0(m1Var, arrayList, hashMap, 1));
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
        }
    }
}
