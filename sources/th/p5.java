package th;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p5(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((r5) this.b).l(this.c, (TL_stories.StoryItem) this.d);
                break;
            case 1:
                r5 r5Var = (r5) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                long j10 = this.c;
                hs hsVar = r5Var.b;
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                try {
                    String join = TextUtils.join(", ", arrayList);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    hsVar.o(th2, true);
                    return;
                }
            case 2:
                v5 v5Var = (v5) this.b;
                ((View) this.d).invalidate();
                vp.r1(v5Var.a).O1().h0(this.c, false);
                break;
            case 3:
                vh.r6 r6Var = (vh.r6) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                r6Var.getClass();
                r6Var.e(this.c, chatFull.participants);
                break;
            default:
                long[] jArr = (long[]) this.b;
                i2.g1 g1Var = (i2.g1) this.d;
                jArr[0] = this.c;
                g1Var.run();
                break;
        }
    }

    public /* synthetic */ p5(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
    }
}
