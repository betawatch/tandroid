// default package

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class pq6 implements Runnable {
    public final /* synthetic */ hs6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ double d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pq6(hs6 hs6Var, long j, int i, double d) {
        this.a = hs6Var;
        this.b = j;
        this.c = i;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hs6 hs6Var = this.a;
        long j = this.b;
        byte b = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, b);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
