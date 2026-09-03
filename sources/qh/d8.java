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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d8(int i10, ArrayList arrayList) {
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
                ba baVar = (ba) obj;
                int i12 = baVar.c;
                baVar.m();
                baVar.U1 = false;
                File file = baVar.H1.O0;
                if (file != null) {
                    file.delete();
                    baVar.H1.O0 = null;
                }
                baVar.W(baVar.H1, true);
                CharSequence[] charSequenceArr = {baVar.Z0.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(new CharSequence[]{baVar.H1.C0}, true) : new ArrayList<>();
                r6 r6Var = baVar.H1;
                r6Var.k = (TextUtils.equals(r6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                baVar.H1.C0 = new SpannableString(baVar.Z0.getText());
                baVar.z();
                baVar.y();
                r6 r6Var2 = baVar.H1;
                baVar.L1 = (r6Var2 == null || !r6Var2.K) ? 0 : 1;
                baVar.H1 = (r6) baVar.E1.get(i11);
                baVar.O(0, 1);
                baVar.N(0, 1);
                baVar.a1.b.V2.N(false);
                baVar.Z0.setText(baVar.H1.C0);
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
                    r3Var.n3(false);
                    r3Var.e3.d(new wh.o3(r3Var, aVar, i11), c0Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
