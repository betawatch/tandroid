// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s2b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ q2b(s2b s2bVar, long j, int i, byte b) {
        this.a = b;
        this.b = s2bVar;
        this.c = j;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        s2b s2bVar = this.b;
        switch (b) {
            case 0:
                ad7 ad7Var = s2bVar.b;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + i + ")").stepThis().dispose();
                    break;
                } catch (Throwable th) {
                    ad7Var.n(th, true);
                    return;
                }
            default:
                ad7 ad7Var2 = s2bVar.b;
                SQLiteDatabase sQLiteDatabase2 = ad7Var2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j + " AND story_id = " + i).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    ad7Var2.n(th2, true);
                }
        }
    }
}
