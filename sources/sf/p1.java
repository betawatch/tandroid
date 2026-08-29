package sf;

import android.content.DialogInterface;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c2;
import th.h3;
import th.m3;
import th.p3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                int i10 = this.b;
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i10).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i10).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                f2.o0 o0Var = (f2.o0) this.c;
                int i11 = this.b;
                o0Var.getClass();
                try {
                    o0Var.a.scrollBy(0, i11);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 2:
                th.b0 b0Var = (th.b0) this.c;
                th.e0 e0Var = b0Var.f;
                if (b0Var.c && e0Var.A != null && e0Var.a != null) {
                    b0Var.d = true;
                    b0Var.a.setPressed(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    th.c0 c0Var = e0Var.A;
                    th.a aVar = e0Var.a;
                    p3 p3Var = ((h3) c0Var).a;
                    p3Var.o3(false);
                    p3Var.d3.Q0(new m3(p3Var, aVar, this.b), b0Var);
                    break;
                }
                break;
            case 3:
                c2[] c2VarArr = (c2[]) this.c;
                final int i12 = this.b;
                c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    try {
                        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ye.a
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i12, true);
                            }
                        });
                        c2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            default:
                ((yg.a) this.c).v0(this.b, 0, null);
                break;
        }
    }
}
