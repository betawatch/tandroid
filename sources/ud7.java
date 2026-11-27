// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ud7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ud7(jf7 jf7Var, ArrayList arrayList, ArrayList arrayList2, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.c;
        jf7 jf7Var = this.b;
        switch (b) {
            case 0:
                if (!arrayList2.isEmpty()) {
                    jf7Var.getMessagesController().j4(arrayList2, true);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                jf7Var.getMessagesController().c4(arrayList, true);
                return;
            default:
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = jf7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList.get(i)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList2.get(i)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e) {
                        jf7Var.n(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
        }
    }
}
