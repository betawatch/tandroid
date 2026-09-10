package zh;

import android.text.TextUtils;
import android.view.View;
import bi.r9;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f5(Object obj, long j3, TL_stories.StoryItem storyItem, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = storyItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h5 h5Var = (h5) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                i5 i5Var = h5Var.M;
                bi.f1 f1Var = i5Var.w;
                h5Var.d = true;
                r9 r9Var = h5Var.c;
                if (r9Var.w) {
                    f1Var.b(r9Var);
                }
                r9Var.w = false;
                r9Var.x = null;
                if (!r9Var.b0) {
                    ArrayList arrayList = f1Var.b;
                    if (!r9Var.u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            r9 r9Var2 = (r9) obj;
                            if (r9Var2.g && r9Var2.f == storyItem.id) {
                                arrayList2.add(r9Var2);
                            }
                        }
                        f1Var.c(arrayList2);
                        f1Var.e(r9Var);
                        r9Var.b = Utilities.random.nextLong();
                        bi.e1 e1Var = new bi.e1(r9Var);
                        r9Var.g = true;
                        e1Var.G = true;
                        long j3 = this.b;
                        r9Var.e = j3;
                        e1Var.I = j3;
                        int i11 = storyItem.id;
                        r9Var.f = i11;
                        e1Var.H = i11;
                        long j10 = storyItem.expire_date * 1000;
                        r9Var.J = j10;
                        e1Var.L = j10;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j11 = document.id;
                            r9Var.H = j11;
                            e1Var.J = j11;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j12 = photo.id;
                                r9Var.I = j12;
                                e1Var.K = j12;
                            }
                        }
                        arrayList.remove(r9Var);
                        arrayList.add(0, r9Var);
                        f1Var.a(e1Var);
                    }
                }
                if (!h5Var.b) {
                    i5Var.R = false;
                    i5Var.S = null;
                    break;
                }
                break;
            case 1:
                v5 v5Var = (v5) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                long j13 = this.b;
                MessagesStorage messagesStorage = v5Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j13 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 2:
                ((v5) this.c).l(this.b, (TL_stories.StoryItem) this.d);
                break;
            default:
                z5 z5Var = (z5) this.c;
                View view = (View) this.d;
                z5Var.getClass();
                view.invalidate();
                MessagesController.getInstance(z5Var.a).getStoriesController().e0(this.b, false);
                break;
        }
    }

    public /* synthetic */ f5(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
