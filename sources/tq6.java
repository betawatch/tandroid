// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tq6 implements Runnable {
    public final /* synthetic */ hs6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tq6(hs6 hs6Var, long j, int i) {
        this.a = hs6Var;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hs6 hs6Var = this.a;
        long j = this.b;
        byte b = this.c;
        try {
            SQLiteDatabase sQLiteDatabase = hs6Var.getMessagesStorage().b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j + " AND type = " + ((int) b)).stepThis().dispose();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
