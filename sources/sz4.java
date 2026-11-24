// default package

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class sz4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sz4(int i, long j, long j2, int i2, go2 go2Var) {
        this.a = (byte) 0;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.e = i2;
        this.f = go2Var;
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
                uz4.a(this.d, this.b, this.c, i2 + 1, (go2) obj);
                break;
            case 1:
                hq6 hq6Var = (hq6) obj;
                long j2 = this.c;
                int i3 = this.d;
                try {
                    SQLitePreparedStatement executeFast = j != 0 ? hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
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
                    fa4.g(e, true);
                    return;
                }
            default:
                ((ad7) obj).b2(this.d, this.e, -j, this.c);
                break;
        }
    }

    public /* synthetic */ sz4(pf0 pf0Var, long j, long j2, int i, int i2, byte b) {
        this.a = b;
        this.f = pf0Var;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
    }
}
