package pf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lp0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                } catch (Exception e9) {
                    FileLog.e(e9);
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
                    Collections.sort(arrayList, new lp0(21));
                    AndroidUtilities.runOnUIThread(new gs0(j1Var2, arrayList, hashMap, 28));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
