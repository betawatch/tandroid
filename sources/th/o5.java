package th;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.is;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ o5(r5 r5Var, long j10, int i10, int i11) {
        this.a = i11;
        this.b = r5Var;
        this.c = j10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                int i10 = this.d;
                is isVar = this.b.b;
                SQLiteDatabase sQLiteDatabase = isVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i10 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    isVar.o(th2, true);
                    return;
                }
            default:
                long j11 = this.c;
                int i11 = this.d;
                is isVar2 = this.b.b;
                SQLiteDatabase sQLiteDatabase2 = isVar2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j11 + " AND story_id = " + i11).stepThis().dispose();
                    break;
                } catch (Throwable th3) {
                    isVar2.o(th3, true);
                }
        }
    }
}
