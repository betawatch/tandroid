package ph;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
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
                u6 u6Var = daVar.H1;
                u6Var.k = (TextUtils.equals(u6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                daVar.H1.C0 = new SpannableString(daVar.Z0.getText());
                daVar.z();
                daVar.y();
                u6 u6Var2 = daVar.H1;
                daVar.L1 = (u6Var2 == null || !u6Var2.K) ? 0 : 1;
                daVar.H1 = (u6) daVar.E1.get(i11);
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
            default:
                vh.b0 b0Var = (vh.b0) obj;
                vh.e0 e0Var = b0Var.f;
                if (b0Var.c && e0Var.B != null && e0Var.a != null) {
                    b0Var.d = true;
                    b0Var.a.setPressed(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vh.c0 c0Var = e0Var.B;
                    vh.a aVar = e0Var.a;
                    vh.r3 r3Var = ((vh.j3) c0Var).a;
                    r3Var.o3(false);
                    r3Var.e3.l(new vh.o3(r3Var, aVar, i11), b0Var);
                    break;
                }
                break;
        }
    }
}
