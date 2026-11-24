// default package

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class s15 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s15(int i, long j, long j2, int i2, rp2 rp2Var) {
        this.a = (byte) 0;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.e = i2;
        this.f = rp2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        int i2 = this.e;
        long j = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                u15.a(this.d, this.b, this.c, i2 + 1, (rp2) obj);
                break;
            case 1:
                hs6 hs6Var = (hs6) obj;
                long j2 = this.c;
                int i3 = this.d;
                try {
                    SQLitePreparedStatement executeFast = j != 0 ? hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j2);
                    if (j != 0) {
                        executeFast.bindLong(2, j);
                        i = 3;
                    } else {
                        i = 2;
                    }
                    executeFast.bindInteger(i, i3);
                    executeFast.bindInteger(i + 1, i2);
                    executeFast.bindInteger(i + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                ((cf7) obj).b2(this.d, this.e, -j, this.c);
                break;
        }
    }

    public /* synthetic */ s15(pg0 pg0Var, long j, long j2, int i, int i2, byte b) {
        this.a = b;
        this.f = pg0Var;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
    }
}
