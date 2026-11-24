// default package

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
