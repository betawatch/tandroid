// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class r4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ r4b(t4b t4bVar, long j, int i, byte b) {
        this.a = b;
        this.b = t4bVar;
        this.c = j;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                cf7 cf7Var = t4bVar.b;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + i + ")").stepThis().dispose();
                    break;
                } catch (Throwable th) {
                    cf7Var.n(th, true);
                    return;
                }
            default:
                cf7 cf7Var2 = t4bVar.b;
                SQLiteDatabase sQLiteDatabase2 = cf7Var2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j + " AND story_id = " + i).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    cf7Var2.n(th2, true);
                }
        }
    }
}
