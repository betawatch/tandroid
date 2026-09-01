package qh;

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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e8(int i10, ArrayList arrayList) {
        this.a = 0;
        this.b = i10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                MessagesController.getInstance(i11).putUsers((ArrayList) obj, true);
                break;
            case 1:
                ca caVar = (ca) obj;
                int i12 = caVar.c;
                caVar.m();
                caVar.U1 = false;
                File file = caVar.H1.O0;
                if (file != null) {
                    file.delete();
                    caVar.H1.O0 = null;
                }
                caVar.W(caVar.H1, true);
                CharSequence[] charSequenceArr = {caVar.Z0.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(new CharSequence[]{caVar.H1.C0}, true) : new ArrayList<>();
                s6 s6Var = caVar.H1;
                s6Var.k = (TextUtils.equals(s6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                caVar.H1.C0 = new SpannableString(caVar.Z0.getText());
                caVar.z();
                caVar.y();
                s6 s6Var2 = caVar.H1;
                caVar.L1 = (s6Var2 == null || !s6Var2.K) ? 0 : 1;
                caVar.H1 = (s6) caVar.E1.get(i11);
                caVar.O(0, 1);
                caVar.N(0, 1);
                caVar.a1.b.V2.N(false);
                caVar.Z0.setText(caVar.H1.C0);
                break;
            case 2:
                ((uf.z) obj).m(i11);
                break;
            case 3:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i11).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i11).stepThis().dispose();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                f2.o0 o0Var = (f2.o0) obj;
                o0Var.getClass();
                try {
                    o0Var.a.scrollBy(0, i11);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            default:
                wh.c0 c0Var = (wh.c0) obj;
                wh.f0 f0Var = c0Var.f;
                if (c0Var.c && f0Var.B != null && f0Var.a != null) {
                    c0Var.d = true;
                    c0Var.a.setPressed(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    wh.d0 d0Var = f0Var.B;
                    wh.a aVar = f0Var.a;
                    wh.r3 r3Var = ((wh.j3) d0Var).a;
                    r3Var.o3(false);
                    r3Var.e3.d(new wh.o3(r3Var, aVar, i11), c0Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
