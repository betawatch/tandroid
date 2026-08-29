package rf;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.mn0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ o(mn0 mn0Var, long j10, int i10) {
        this.a = i10;
        this.b = mn0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                a0 a0Var = this.b;
                a0Var.getClass();
                try {
                    MessagesStorage.getInstance(a0Var.o0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                long j11 = this.c;
                a0 a0Var2 = this.b;
                a0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(a0Var2.o0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
