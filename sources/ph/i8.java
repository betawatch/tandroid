package ph;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        final int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                da daVar = (da) obj;
                int i12 = daVar.c;
                daVar.m();
                daVar.U1 = false;
                File file = daVar.H1.O0;
                if (file != null) {
                    file.delete();
                    daVar.H1.O0 = null;
                }
                daVar.W(daVar.H1, true);
                CharSequence[] charSequenceArr = {daVar.Z0.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(new CharSequence[]{daVar.H1.C0}, true) : new ArrayList<>();
                t6 t6Var = daVar.H1;
                t6Var.k = (TextUtils.equals(t6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                daVar.H1.C0 = new SpannableString(daVar.Z0.getText());
                daVar.z();
                daVar.y();
                t6 t6Var2 = daVar.H1;
                daVar.L1 = (t6Var2 == null || !t6Var2.K) ? 0 : 1;
                daVar.H1 = (t6) daVar.E1.get(i11);
                daVar.O(0, 1);
                daVar.N(0, 1);
                daVar.a1.b.V2.N(false);
                daVar.Z0.setText(daVar.H1.C0);
                break;
            case 1:
                ((tf.z) obj).m(i11);
                break;
            case 2:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i11).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i11).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                f2.n0 n0Var = (f2.n0) obj;
                n0Var.getClass();
                try {
                    n0Var.a.scrollBy(0, i11);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 4:
                vh.c0 c0Var = (vh.c0) obj;
                vh.f0 f0Var = c0Var.f;
                if (c0Var.c && f0Var.B != null && f0Var.a != null) {
                    c0Var.d = true;
                    c0Var.a.setPressed(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vh.d0 d0Var = f0Var.B;
                    vh.a aVar = f0Var.a;
                    vh.s3 s3Var = ((vh.k3) d0Var).a;
                    s3Var.n3(false);
                    s3Var.e3.m(new vh.p3(s3Var, aVar, i11), c0Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    try {
                        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ze.a
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        d2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
