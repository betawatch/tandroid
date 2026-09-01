package uf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.du;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ g1(k1 k1Var, int i10) {
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
                } catch (Exception e6) {
                    FileLog.e(e6);
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
                    Collections.sort(arrayList, new du(21));
                    AndroidUtilities.runOnUIThread(new h1(k1Var2, arrayList, hashMap, 0));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
