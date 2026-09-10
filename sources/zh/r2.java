package zh;

import android.app.Activity;
import bi.ce;
import bi.r9;
import bi.xd;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0108 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r9 r9Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        t7 t7Var;
        char c10;
        org.telegram.ui.ActionBar.p2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase database;
        SQLitePreparedStatement executeFast;
        int i10 = 1;
        switch (this.a) {
            case 0:
                int i11 = 0;
                v2 v2Var = (v2) this.b;
                Activity activity = (Activity) this.c;
                u7 u7Var = (u7) this.d;
                y2 y2Var = (y2) this.e;
                ce E = ce.E(activity, v2Var.l.C2);
                k2.v vVar = v2Var.l.M2;
                long j3 = (vVar == null || (t7Var = (t7) vVar.c) == null) ? 0L : t7Var.currentPosition;
                bi.f1 f1Var = MessagesController.getInstance(v2Var.l.C2).getStoriesController().w;
                TL_stories.StoryItem storyItem2 = v2Var.l.O1.a;
                long j10 = storyItem2.dialogId;
                ArrayList arrayList2 = f1Var.b;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    r9Var = (r9) obj;
                    if (r9Var.g && storyItem2.id == r9Var.f && j10 == r9Var.e) {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList2;
                        storyItem = storyItem2;
                        if ((document == null || document.id == r9Var.H) && ((photo = messageMedia.photo) == null || photo.id == r9Var.I)) {
                            r9Var.h = true;
                            if (r9Var != null || r9Var.u || (file = r9Var.L) == null || !file.exists()) {
                                r9Var = r9.n(v2Var.l.O1.h(), v2Var.l.O1.a);
                                r9Var.e = v2Var.l.B1;
                            }
                            r9 g10 = r9Var.g();
                            if (v2Var.l.I0()) {
                                a3 a3Var = v2Var.l;
                                g10.J0 = a3Var.B1;
                                g10.L0 = MessagesController.toInputMedia(a3Var.O1.a.media);
                                a5 a5Var = u7Var.O0;
                                if (a5Var instanceof s4) {
                                    g10.K0 = ((s4) a5Var).E;
                                }
                            }
                            E.S(xd.d(u7Var), g10, j3);
                            E.Q = new p2(v2Var, 3);
                            E.R = new s2(v2Var, y2Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList2;
                        storyItem = storyItem2;
                    }
                    storyItem2 = storyItem;
                    arrayList2 = arrayList;
                }
                r9Var = null;
                if (r9Var != null) {
                }
                r9Var = r9.n(v2Var.l.O1.h(), v2Var.l.O1.a);
                r9Var.e = v2Var.l.B1;
                r9 g102 = r9Var.g();
                if (v2Var.l.I0()) {
                }
                E.S(xd.d(u7Var), g102, j3);
                E.Q = new p2(v2Var, 3);
                E.R = new s2(v2Var, y2Var, 1);
                return;
            case 1:
                w4 w4Var = (w4) this.b;
                TLObject tLObject = (TLObject) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                w4Var.i = false;
                if (tLObject instanceof TL_stories.TL_storyAlbum) {
                    b5 a2 = b5.a((TL_stories.TL_storyAlbum) tLObject);
                    w4Var.h.add(a2);
                    w4Var.f(true);
                    if (callback != null) {
                        callback.run(a2);
                        return;
                    }
                    return;
                }
                if (tL_error == null || (U = LaunchActivity.U()) == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    wc.a0(U).d0(tL_error, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(w4Var.a);
                int i12 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(w4Var.b);
                objArr[1] = w4Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, objArr);
                return;
            default:
                a5 a5Var2 = (a5) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                int i13 = a5Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i14 = a5Var2.e;
                sb2.append(i14);
                sb2.append("{");
                long j11 = a5Var2.d;
                sb2.append(j11);
                sb2.append("} saveCache {");
                sb2.append(i5.a(arrayList3));
                hc.b.v("}", sb2);
                try {
                    database = messagesStorage.getDatabase();
                    executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = null;
                }
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j11 + " AND album_id = " + i13).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                    int i15 = 0;
                    while (i15 < arrayList3.size()) {
                        try {
                            TL_stories.StoryItem storyItem3 = ((MessageObject) arrayList3.get(i15)).storyItem;
                            if (storyItem3 != null) {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem3.getObjectSize());
                                storyItem3.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindLong(i10, j11);
                                executeFast.bindInteger(2, storyItem3.id);
                                executeFast.bindByteBuffer(3, nativeByteBuffer);
                                executeFast.bindInteger(4, i14);
                                executeFast.bindInteger(5, a5Var2.m.contains(Integer.valueOf(storyItem3.id)) ? 1 : 0);
                                executeFast.bindInteger(6, arrayList4.indexOf(Integer.valueOf(storyItem3.id)) + 1);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                                executeFast2.requery();
                                executeFast2.bindLong(1, j11);
                                executeFast2.bindInteger(2, i13);
                                executeFast2.bindInteger(3, storyItem3.id);
                                executeFast2.bindInteger(4, i15);
                                executeFast2.step();
                            }
                            i15++;
                            i10 = 1;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLitePreparedStatement2 = executeFast2;
                            sQLitePreparedStatement = executeFast;
                            try {
                                messagesStorage.checkSQLException(th);
                                AndroidUtilities.runOnUIThread(new x4(a5Var2, 2));
                                return;
                            } finally {
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                }
                            }
                        }
                    }
                    if (executeFast != null) {
                        executeFast.dispose();
                    }
                    if (executeFast2 != null) {
                        executeFast2.dispose();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = executeFast;
                    sQLitePreparedStatement2 = null;
                    messagesStorage.checkSQLException(th);
                    AndroidUtilities.runOnUIThread(new x4(a5Var2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new x4(a5Var2, 2));
                return;
        }
    }
}
