package sf;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k51;
import org.telegram.ui.mp0;
import th.g3;
import th.g5;
import th.j5;
import th.p3;
import th.r4;
import th.s4;
import th.t5;
import th.y1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:129|130|131|(3:178|179|(10:181|182|(2:173|174)|135|(1:137)|138|139|140|(1:(1:143))(7:145|146|147|148|149|150|151)|144))|133|(0)|135|(0)|138|139|140|(0)(0)|144) */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0318, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        View z12;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        switch (this.a) {
            case 0:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                r1 r1Var = (r1) this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, r1Var.a);
                        sQLitePreparedStatement.bindString(2, r1Var.b);
                        sQLitePreparedStatement.bindInteger(3, r1Var.c);
                        sQLitePreparedStatement.bindInteger(4, r1Var.f);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 1:
                s1 s1Var = (s1) this.c;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.b;
                ArrayList arrayList = s1Var.b;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            r1 r1Var2 = (r1) arrayList.get(i10);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, r1Var2.a);
                            sQLitePreparedStatement2.bindString(2, r1Var2.b);
                            sQLitePreparedStatement2.bindInteger(3, r1Var2.c);
                            sQLitePreparedStatement2.bindInteger(4, r1Var2.f);
                            sQLitePreparedStatement2.step();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
            case 2:
                s1 s1Var2 = (s1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = s1Var2.b;
                int i11 = s1Var2.a;
                ArrayList arrayList3 = null;
                if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList4 = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_quickReplies.quick_replies.size(); i12++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i12);
                        r1 r1Var3 = new r1();
                        r1Var3.a = tL_quickReply.shortcut_id;
                        r1Var3.b = tL_quickReply.shortcut;
                        r1Var3.f = tL_quickReply.count;
                        r1Var3.d = tL_quickReply.top_message;
                        r1Var3.c = i12;
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i13);
                                if (message.id != tL_quickReply.top_message) {
                                    i13++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i11, message, false, true);
                            r1Var3.e = messageObject;
                            messageObject.generateThumbs(false);
                            r1Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList4.add(r1Var3);
                    }
                    arrayList3 = arrayList4;
                }
                s1Var2.e = false;
                if (arrayList3 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                }
                s1Var2.f = true;
                s1Var2.l();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 3:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                boolean z10 = false;
                th.q a2 = th.q.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = th.q.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z10 = true;
                }
                AndroidUtilities.runOnUIThread(new mp0(callback2, a2 != null ? a2.a : null, z10, 12));
                return;
            case 4:
                th.v vVar = (th.v) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                vVar.c0 = false;
                vVar.d0 = 0;
                nh.d dVar = vVar.b0;
                dVar.setLoading(false);
                if (!(tLObject2 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject2).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                vVar.e0 = richMessage;
                vVar.Y.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                vVar.P();
                k51 k51Var = vVar.V;
                if (k51Var != null) {
                    k51Var.N(true);
                    return;
                }
                return;
            case 5:
                p3 p3Var = (p3) this.b;
                Uri uri = (Uri) this.c;
                String str3 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e12) {
                    FileLog.e(e12);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !com.google.android.recaptcha.internal.a.v(str)) {
                    try {
                        query = p3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e13) {
                        e = e13;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str3;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str2 = query.getString(0);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Exception e14) {
                                        e = e14;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + SharedConfig.getLastLocalId();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AndroidUtilities.copyFile(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str3 = absolutePath;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str3;
                            }
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !com.google.android.recaptcha.internal.a.v(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new o1(6, p3Var, str));
                return;
            case 6:
                ((p3) this.b).c2((String) this.c);
                return;
            case 7:
                p3 p3Var2 = (p3) this.b;
                y1 y1Var = (y1) this.c;
                p3Var2.getClass();
                long j10 = y1Var.a;
                int i14 = y1Var.d;
                int i15 = y1Var.c;
                ArrayList arrayList5 = p3Var2.h3;
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList5.size()) {
                        i16 = -1;
                    } else if (((th.a) arrayList5.get(i16)).a != j10) {
                        i16++;
                    }
                }
                if (i16 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = p3Var2.T2.m(i16);
                if (m10 instanceof t5) {
                    t5 t5Var = (t5) m10;
                    t5Var.B();
                    th.d1 editText = t5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i15, length)), Math.max(0, Math.min(i14, length)));
                    return;
                }
                if (!(m10 instanceof g5)) {
                    if (m10 instanceof th.i0) {
                        th.d1 captionEditText = ((th.i0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i15, length2)), Math.max(0, Math.min(i14, length2)));
                        return;
                    }
                    return;
                }
                g5 g5Var = (g5) m10;
                th.d1 l10 = g5Var.l(y1Var.b);
                if (l10 == null) {
                    l10 = g5Var.l(0);
                }
                if (l10 == null) {
                    return;
                }
                l10.r();
                int length3 = l10.length();
                l10.setSelection(Math.max(0, Math.min(i15, length3)), Math.max(0, Math.min(i14, length3)));
                return;
            case 8:
                g3 g3Var = (g3) this.b;
                th.a aVar = (th.a) this.c;
                if (aVar == null) {
                    g3Var.getClass();
                    z12 = null;
                } else {
                    z12 = g3Var.e.z1(aVar);
                }
                if (z12 instanceof t5) {
                    t5 t5Var2 = (t5) z12;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(t5Var2.getEditText().length());
                    return;
                }
                return;
            case 9:
                s4 s4Var = (s4) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                boolean z11 = s4Var.e;
                boolean z13 = s4Var.d;
                r4 r4Var = s4Var.s;
                if (s4Var.w) {
                    return;
                }
                s4Var.y = 0;
                if (s4Var.c || z13 || z11) {
                    if ((tLObject3 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject3).document) != null) {
                        if (!z11) {
                            if (z13) {
                                s4Var.x = true;
                                s4Var.e();
                                r4Var.e(document);
                                return;
                            } else {
                                s4Var.x = true;
                                s4Var.e();
                                r4Var.c(document);
                                return;
                            }
                        }
                        int i17 = s4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            s4Var.x = true;
                            s4Var.e();
                            r4Var.onError();
                            return;
                        }
                        s4Var.x = true;
                        s4Var.e();
                        if (!TextUtils.isEmpty(s4Var.B) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i17).setLocalPathTo(closestPhotoSizeWithSize, s4Var.B);
                            AndroidUtilities.copyFileSafe(new File(s4Var.B), FileLoader.getInstance(i17).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        r4Var.d(document);
                        return;
                    }
                } else if ((tLObject3 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject3).photo) != null) {
                    s4Var.x = true;
                    s4Var.e();
                    r4Var.b(photo);
                    return;
                }
                s4Var.x = true;
                s4Var.e();
                r4Var.onError();
                return;
            case 10:
                s4 s4Var2 = (s4) this.b;
                String str4 = (String) this.c;
                if (s4Var2.w || s4Var2.x) {
                    return;
                }
                s4Var2.a(str4);
                return;
            case 11:
                j5 m11 = ((g5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                th.d1 d1Var = m11.a;
                d1Var.r();
                d1Var.setSelection(d1Var.length());
                return;
            default:
                wd.b bVar = (wd.b) this.b;
                View view = (View) this.c;
                wd.a aVar2 = bVar.a;
                if ((bVar.c & 2) != 0) {
                    if (!aVar2.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.c |= 8;
                        return;
                    }
                    bVar.c &= -3;
                    bVar.b = null;
                    float f9 = bVar.d;
                    float f10 = bVar.e;
                    bVar.f = f9;
                    bVar.g = f10;
                    if (aVar2.ignoreHapticFeedbackSettings(f9, f10)) {
                        boolean forceEnableVibration = aVar2.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar.c = (bVar.c | 4) & (-11);
                    bVar.b = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o1(s1 s1Var, MessagesStorage messagesStorage) {
        this.a = 1;
        this.c = s1Var;
        this.b = messagesStorage;
    }
}
