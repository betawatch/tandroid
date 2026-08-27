package pf;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.cn0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;
    public final /* synthetic */ long c;

    public /* synthetic */ n(cn0 cn0Var, long j10, int i10) {
        this.a = i10;
        this.b = cn0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                z zVar = this.b;
                zVar.getClass();
                try {
                    MessagesStorage.getInstance(zVar.o0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            default:
                long j11 = this.c;
                z zVar2 = this.b;
                zVar2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(zVar2.o0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
