// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class to6 implements Runnable {
    public final /* synthetic */ hq6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ to6(hq6 hq6Var, long j, int i) {
        this.a = hq6Var;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hq6 hq6Var = this.a;
        long j = this.b;
        byte b = this.c;
        try {
            SQLiteDatabase sQLiteDatabase = hq6Var.getMessagesStorage().b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j + " AND type = " + ((int) b)).stepThis().dispose();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
