// default package

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class x15 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x15(int i, long j, long j2, int i2, zo2 zo2Var) {
        this.a = (byte) 0;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.e = i2;
        this.f = zo2Var;
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
                z15.a(this.d, this.b, this.c, i2 + 1, (zo2) obj);
                break;
            case 1:
                ls6 ls6Var = (ls6) obj;
                long j2 = this.c;
                int i3 = this.d;
                try {
                    SQLitePreparedStatement executeFast = j != 0 ? ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
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
                    cc4.g(e, true);
                    return;
                }
            default:
                ((jf7) obj).b2(this.d, this.e, -j, this.c);
                break;
        }
    }

    public /* synthetic */ x15(rf0 rf0Var, long j, long j2, int i, int i2, byte b) {
        this.a = b;
        this.f = rf0Var;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
    }
}
