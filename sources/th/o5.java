package th;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                hs hsVar = this.b.b;
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i10 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    hsVar.o(th2, true);
                    return;
                }
            default:
                long j11 = this.c;
                int i11 = this.d;
                hs hsVar2 = this.b.b;
                SQLiteDatabase sQLiteDatabase2 = hsVar2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j11 + " AND story_id = " + i11).stepThis().dispose();
                    break;
                } catch (Throwable th3) {
                    hsVar2.o(th3, true);
                }
        }
    }
}
