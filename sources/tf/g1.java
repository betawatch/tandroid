package tf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.m71;
import org.telegram.ui.eu;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1 b;

    public /* synthetic */ g1(j1 j1Var, int i10) {
        this.a = i10;
        this.b = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j1 j1Var = this.b;
                j1Var.getClass();
                try {
                    MessagesStorage.getInstance(j1Var.m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                j1 j1Var2 = this.b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(j1Var2.m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        h1 h1Var = new h1();
                        h1Var.a = queryFinalized.stringValue(0);
                        h1Var.b = queryFinalized.intValue(1);
                        arrayList.add(h1Var);
                        hashMap.put(h1Var.a, h1Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new eu(21));
                    AndroidUtilities.runOnUIThread(new m71(j1Var2, arrayList, hashMap, 29));
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
        }
    }
}
