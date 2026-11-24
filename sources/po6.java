// default package

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class po6 implements Runnable {
    public final /* synthetic */ hq6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ double d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ po6(hq6 hq6Var, long j, int i, double d) {
        this.a = hq6Var;
        this.b = j;
        this.c = i;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hq6 hq6Var = this.a;
        long j = this.b;
        byte b = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, b);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
