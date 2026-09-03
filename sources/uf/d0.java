package uf;

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
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.cr0;
import vh.a2;
import vh.j3;
import vh.j5;
import vh.m5;
import vh.s3;
import vh.u4;
import vh.v4;
import vh.w5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(int i10, Object obj, Object obj2) {
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
        View y12;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        switch (this.a) {
            case 0:
                f0.R((f0) this.b, (dw) this.c);
                return;
            case 1:
                MessagesController.getInstance(((l0) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 2:
                x0 x0Var = (x0) this.b;
                i51 i51Var = (i51) this.c;
                x0Var.getClass();
                x0Var.X(i51Var.d);
                return;
            case 3:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                o1 o1Var = (o1) this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, o1Var.a);
                        sQLitePreparedStatement.bindString(2, o1Var.b);
                        sQLitePreparedStatement.bindInteger(3, o1Var.c);
                        sQLitePreparedStatement.bindInteger(4, o1Var.f);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        FileLog.e(e);
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
            case 4:
                p1 p1Var = (p1) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList = p1Var.b;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            o1 o1Var2 = (o1) arrayList.get(i10);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, o1Var2.a);
                            sQLitePreparedStatement2.bindString(2, o1Var2.b);
                            sQLitePreparedStatement2.bindInteger(3, o1Var2.c);
                            sQLitePreparedStatement2.bindInteger(4, o1Var2.f);
                            sQLitePreparedStatement2.step();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
            case 5:
                p1 p1Var2 = (p1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = p1Var2.b;
                int i11 = p1Var2.a;
                ArrayList arrayList3 = null;
                if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList4 = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_quickReplies.quick_replies.size(); i12++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i12);
                        o1 o1Var3 = new o1();
                        o1Var3.a = tL_quickReply.shortcut_id;
                        o1Var3.b = tL_quickReply.shortcut;
                        o1Var3.f = tL_quickReply.count;
                        o1Var3.d = tL_quickReply.top_message;
                        o1Var3.c = i12;
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
                            o1Var3.e = messageObject;
                            messageObject.generateThumbs(false);
                            o1Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList4.add(o1Var3);
                    }
                    arrayList3 = arrayList4;
                }
                p1Var2.e = false;
                if (arrayList3 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                }
                p1Var2.f = true;
                p1Var2.l();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 6:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                boolean z4 = false;
                vh.r a2 = vh.r.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = vh.r.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z4 = true;
                }
                AndroidUtilities.runOnUIThread(new cr0(callback2, a2 != null ? a2.a : null, z4, 12));
                return;
            case 7:
                vh.w wVar = (vh.w) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                wVar.d0 = false;
                wVar.e0 = 0;
                ph.d dVar = wVar.c0;
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
                wVar.f0 = richMessage;
                wVar.Z.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                wVar.P();
                w51 w51Var = wVar.W;
                if (w51Var != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 8:
                s3 s3Var = (s3) this.b;
                Uri uri = (Uri) this.c;
                String str3 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !e2.c.t(str)) {
                    try {
                        query = s3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e11) {
                        e = e11;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
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
                                    } catch (Exception e12) {
                                        e = e12;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
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
                                openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
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
                    openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !e2.c.t(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new d0(9, s3Var, str));
                return;
            case 9:
                ((s3) this.b).b2((String) this.c);
                return;
            case 10:
                s3 s3Var2 = (s3) this.b;
                a2 a2Var = (a2) this.c;
                s3Var2.getClass();
                long j10 = a2Var.a;
                int i14 = a2Var.d;
                int i15 = a2Var.c;
                ArrayList arrayList5 = s3Var2.i3;
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList5.size()) {
                        i16 = -1;
                    } else if (((vh.a) arrayList5.get(i16)).a != j10) {
                        i16++;
                    }
                }
                if (i16 < 0) {
                    return;
                }
                KeyEvent.Callback m9 = s3Var2.U2.m(i16);
                if (m9 instanceof w5) {
                    w5 w5Var = (w5) m9;
                    w5Var.B();
                    vh.e1 editText = w5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i15, length)), Math.max(0, Math.min(i14, length)));
                    return;
                }
                if (!(m9 instanceof j5)) {
                    if (m9 instanceof vh.j0) {
                        vh.e1 captionEditText = ((vh.j0) m9).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i15, length2)), Math.max(0, Math.min(i14, length2)));
                        return;
                    }
                    return;
                }
                j5 j5Var = (j5) m9;
                vh.e1 l10 = j5Var.l(a2Var.b);
                if (l10 == null) {
                    l10 = j5Var.l(0);
                }
                if (l10 == null) {
                    return;
                }
                l10.r();
                int length3 = l10.length();
                l10.setSelection(Math.max(0, Math.min(i15, length3)), Math.max(0, Math.min(i14, length3)));
                return;
            case 11:
                j3 j3Var = (j3) this.b;
                vh.a aVar = (vh.a) this.c;
                if (aVar == null) {
                    j3Var.getClass();
                    y12 = null;
                } else {
                    y12 = j3Var.e.y1(aVar);
                }
                if (y12 instanceof w5) {
                    w5 w5Var2 = (w5) y12;
                    w5Var2.B();
                    w5Var2.getEditText().setSelection(w5Var2.getEditText().length());
                    return;
                }
                return;
            case 12:
                v4 v4Var = (v4) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                boolean z10 = v4Var.e;
                boolean z11 = v4Var.d;
                u4 u4Var = v4Var.s;
                if (v4Var.w) {
                    return;
                }
                v4Var.y = 0;
                if (v4Var.c || z11 || z10) {
                    if ((tLObject3 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject3).document) != null) {
                        if (!z10) {
                            if (z11) {
                                v4Var.x = true;
                                v4Var.e();
                                u4Var.e(document);
                                return;
                            } else {
                                v4Var.x = true;
                                v4Var.e();
                                u4Var.c(document);
                                return;
                            }
                        }
                        int i17 = v4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            v4Var.x = true;
                            v4Var.e();
                            u4Var.onError();
                            return;
                        }
                        v4Var.x = true;
                        v4Var.e();
                        if (!TextUtils.isEmpty(v4Var.C) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i17).setLocalPathTo(closestPhotoSizeWithSize, v4Var.C);
                            AndroidUtilities.copyFileSafe(new File(v4Var.C), FileLoader.getInstance(i17).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        u4Var.d(document);
                        return;
                    }
                } else if ((tLObject3 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject3).photo) != null) {
                    v4Var.x = true;
                    v4Var.e();
                    u4Var.b(photo);
                    return;
                }
                v4Var.x = true;
                v4Var.e();
                u4Var.onError();
                return;
            case 13:
                v4 v4Var2 = (v4) this.b;
                String str4 = (String) this.c;
                if (v4Var2.w || v4Var2.x) {
                    return;
                }
                v4Var2.a(str4);
                return;
            case 14:
                m5 m10 = ((j5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m10 == null) {
                    return;
                }
                vh.e1 e1Var = m10.a;
                e1Var.r();
                e1Var.setSelection(e1Var.length());
                return;
            default:
                yd.b bVar = (yd.b) this.b;
                View view = (View) this.c;
                yd.a aVar2 = bVar.a;
                if ((bVar.c & 2) != 0) {
                    if (!aVar2.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.c |= 8;
                        return;
                    }
                    bVar.c &= -3;
                    bVar.b = null;
                    float f10 = bVar.d;
                    float f11 = bVar.e;
                    bVar.f = f10;
                    bVar.g = f11;
                    if (aVar2.ignoreHapticFeedbackSettings(f10, f11)) {
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
}
