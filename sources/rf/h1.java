package rf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.yw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ h1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                k1Var.getClass();
                try {
                    MessagesStorage.getInstance(k1Var.m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                k1 k1Var2 = this.b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(k1Var2.m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        i1 i1Var = new i1();
                        i1Var.a = queryFinalized.stringValue(0);
                        i1Var.b = queryFinalized.intValue(1);
                        arrayList.add(i1Var);
                        hashMap.put(i1Var.a, i1Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new wp0(21));
                    AndroidUtilities.runOnUIThread(new yw0(k1Var2, arrayList, hashMap, 28));
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
