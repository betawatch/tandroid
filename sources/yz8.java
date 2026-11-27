// default package

import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yz8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yz8(qc9 qc9Var, pcc pccVar) {
        this.a = (byte) 15;
        this.c = qc9Var;
        this.b = pccVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:185|(2:186|187)|(3:234|235|(10:237|238|(2:229|230)|191|(1:193)|194|195|196|(1:(1:199))(7:201|202|203|204|205|206|207)|200))|189|(0)|191|(0)|194|195|196|(0)(0)|200) */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04d5, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0485 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0440 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        TLRPC.Document document;
        TLRPC.PhotoSize w;
        TLRPC.Photo photo;
        TLRPC.Document document2;
        TLRPC.Document document3;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r8 = null;
        r8 = null;
        String str3 = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        ArrayList arrayList = null;
        sQLitePreparedStatement = null;
        int i = 0;
        switch (this.a) {
            case 0:
                ((pcc) this.b).a((ry8) this.c);
                return;
            case 1:
                kf7 kf7Var = (kf7) this.b;
                a19 a19Var = (a19) this.c;
                try {
                    try {
                        sQLitePreparedStatement = kf7Var.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, a19Var.a);
                        sQLitePreparedStatement.bindString(2, a19Var.b);
                        sQLitePreparedStatement.bindInteger(3, a19Var.c);
                        sQLitePreparedStatement.bindInteger(4, a19Var.f);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        cc4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 2:
                b19 b19Var = (b19) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = b19Var.b;
                int i2 = b19Var.a;
                if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
                    uc7.s1(i2).j4(tL_messages_quickReplies.users, false);
                    uc7.s1(i2).c4(tL_messages_quickReplies.chats, false);
                    kf7.a0(i2).n1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < tL_messages_quickReplies.quick_replies.size(); i3++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i3);
                        a19 a19Var2 = new a19();
                        a19Var2.a = tL_quickReply.shortcut_id;
                        a19Var2.b = tL_quickReply.shortcut;
                        a19Var2.f = tL_quickReply.count;
                        a19Var2.d = tL_quickReply.top_message;
                        a19Var2.c = i3;
                        int i4 = 0;
                        while (true) {
                            if (i4 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i4);
                                if (message.id != tL_quickReply.top_message) {
                                    i4++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            r47 r47Var = new r47(i2, message, false, true);
                            a19Var2.e = r47Var;
                            r47Var.r0(false);
                            a19Var2.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(a19Var2);
                    }
                    arrayList = arrayList3;
                }
                b19Var.e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                b19Var.f = true;
                b19Var.l();
                jn7.f(i2).k(jn7.F1, new Object[0]);
                return;
            case 3:
                b19 b19Var2 = (b19) this.b;
                kf7 kf7Var2 = (kf7) this.c;
                ArrayList arrayList4 = b19Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = kf7Var2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i < arrayList4.size()) {
                            a19 a19Var3 = (a19) arrayList4.get(i);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, a19Var3.a);
                            sQLitePreparedStatement2.bindString(2, a19Var3.b);
                            sQLitePreparedStatement2.bindInteger(3, a19Var3.c);
                            sQLitePreparedStatement2.bindInteger(4, a19Var3.f);
                            sQLitePreparedStatement2.step();
                            i++;
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 4:
                j19 j19Var = (j19) this.b;
                j19Var.b.add((String) this.c);
                j19Var.invalidate();
                return;
            case 5:
                RLottieNative rLottieNative = (RLottieNative) this.b;
                RLottieNative rLottieNative2 = (RLottieNative) this.c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 6:
                c39 c39Var = (c39) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = c39Var.r;
                c39Var.n.addAll(arrayList5);
                int size = arrayList5.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList5.get(i5);
                    i5++;
                    b39 b39Var = (b39) obj;
                    int i6 = 0;
                    while (true) {
                        if (i6 < arrayList6.size()) {
                            TLObject tLObject2 = ((b39) arrayList6.get(i6)).a;
                            long j = tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L;
                            TLObject tLObject3 = b39Var.a;
                            if (j != (tLObject3 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject3).id : tLObject3 instanceof TLRPC.User ? ((TLRPC.User) tLObject3).id : 0L)) {
                                i6++;
                            } else if (b39Var.c > 0) {
                                ((b39) arrayList6.get(i6)).c = b39Var.c;
                            }
                        } else {
                            arrayList6.add(b39Var);
                        }
                    }
                }
                pt2 pt2Var = c39Var.x;
                if (pt2Var != null) {
                    pt2Var.accept(arrayList5);
                }
                c39Var.a();
                return;
            case 7:
                x49 x49Var = (x49) this.b;
                u49 u49Var = (u49) this.c;
                x49Var.getClass();
                ((pk5) x49Var.w).c(u49Var.a, true, 0.0f, 0.0f);
                u49Var.X.c(false);
                x49Var.P = null;
                x49Var.Q = false;
                x49Var.R = null;
                return;
            case 8:
                pa9 pa9Var = (pa9) this.b;
                Runnable runnable = (Runnable) this.c;
                na9 na9Var = pa9Var.d;
                if (na9Var == null || !na9Var.f) {
                    return;
                }
                na9Var.a();
                runnable.run();
                return;
            case 9:
                View[] viewArr = (View[]) this.b;
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = (TLRPC.TL_reportResultChooseOption) this.c;
                mb9 mb9Var = (mb9) viewArr[0];
                mb9Var.b = null;
                mb9Var.c = tL_reportResultChooseOption;
                mb9Var.d = null;
                mb9Var.f.g3.O(false);
                return;
            case 10:
                View[] viewArr2 = (View[]) this.b;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                mb9 mb9Var2 = (mb9) viewArr2[0];
                mb9Var2.b = tL_channels_sponsoredMessageReportResultChooseOption;
                mb9Var2.c = null;
                mb9Var2.d = null;
                mb9Var2.f.g3.O(false);
                return;
            case 11:
                ((mb9) ((View[]) this.b)[0]).b((TLRPC.TL_reportResultAddComment) this.c);
                return;
            case 12:
                vn1 vn1Var = (vn1) this.b;
                d31 d31Var = (d31) this.c;
                vn1Var.run();
                d31Var.c(ob6.M0(2131754481, null)).j();
                return;
            case 13:
                e eVar = (e) this.b;
                dn9 dn9Var = (dn9) this.c;
                d31.b0(eVar).c(ob6.M0(2131754481, null)).j();
                hl.c3(dn9Var);
                return;
            case 14:
                rb9 rb9Var = (rb9) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    h5c.a().d.a(rb9Var.h.a.b(pm8.c), 1);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 15:
                ((pcc) this.b).a(z15.c(((qc9) this.c).a) ? new uqc() : new thb());
                return;
            case 16:
                ((jq) this.b).h((Typeface) this.c);
                return;
            case 17:
                ((h23) this.b).onResult((bv4) this.c);
                return;
            case 18:
                ue9 ue9Var = (ue9) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ue9Var.b2 = false;
                ue9Var.c2 = 0;
                c51 c51Var = ue9Var.a2;
                c51Var.setLoading(false);
                if (!(tLObject4 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    hl.A3(4.0f, c51Var, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject4).result;
                if (richMessage == null) {
                    hl.A3(4.0f, c51Var, null);
                    return;
                }
                ue9Var.d2 = richMessage;
                ue9Var.X1.set(richMessage);
                c51Var.i(ob6.M0(2131754054, null), true, true);
                ue9Var.Z0();
                l9c l9cVar = ue9Var.U1;
                if (l9cVar != null) {
                    l9cVar.O(true);
                    return;
                }
                return;
            case 19:
                pi9 pi9Var = (pi9) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = hl.S0(uri);
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !bp1.t(str)) {
                    try {
                        query = pi9Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e4) {
                        e = e4;
                        str2 = null;
                        cc4.g(e, true);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = pi9Var.getContext().getContentResolver().openInputStream(uri);
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
                                    } catch (Exception e5) {
                                        e = e5;
                                        cc4.g(e, true);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = pi9Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + xea.p();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = pi9Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(xb4.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            hl.D(openInputStream, fileOutputStream);
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
                        } catch (Throwable th3) {
                            try {
                                query.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = pi9Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !bp1.t(str)) {
                    return;
                }
                hl.c3(new yz8(pi9Var, str, (byte) 20));
                return;
            case 20:
                ((pi9) this.b).Y1((String) this.c);
                return;
            case 21:
                pi9 pi9Var2 = (pi9) this.b;
                zg9 zg9Var = (zg9) this.c;
                long j2 = zg9Var.a;
                int i7 = zg9Var.d;
                int i8 = zg9Var.c;
                ArrayList arrayList7 = pi9Var2.t3;
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList7.size()) {
                        i9 = -1;
                    } else if (((mk0) arrayList7.get(i9)).a != j2) {
                        i9++;
                    }
                }
                if (i9 >= 0) {
                    View m = pi9Var2.f3.m(i9);
                    if (m instanceof km9) {
                        km9 km9Var = (km9) m;
                        km9Var.A();
                        dg9 editText = km9Var.getEditText();
                        int length = editText.length();
                        editText.setSelection(Math.max(0, Math.min(i8, length)), Math.max(0, Math.min(i7, length)));
                        return;
                    }
                    if (!(m instanceof xl9)) {
                        if (m instanceof jf9) {
                            dg9 captionEditText = ((jf9) m).getCaptionEditText();
                            captionEditText.O();
                            int length2 = captionEditText.length();
                            captionEditText.setSelection(Math.max(0, Math.min(i8, length2)), Math.max(0, Math.min(i7, length2)));
                            return;
                        }
                        return;
                    }
                    xl9 xl9Var = (xl9) m;
                    dg9 n = xl9Var.n(zg9Var.b);
                    if (n == null) {
                        n = xl9Var.n(0);
                    }
                    if (n != null) {
                        n.O();
                        int length3 = n.length();
                        n.setSelection(Math.max(0, Math.min(i8, length3)), Math.max(0, Math.min(i7, length3)));
                        return;
                    }
                    return;
                }
                return;
            case 22:
                gi9 gi9Var = (gi9) this.b;
                mk0 mk0Var = (mk0) this.c;
                View D1 = mk0Var != null ? gi9Var.e.D1(mk0Var) : null;
                if (D1 instanceof km9) {
                    km9 km9Var2 = (km9) D1;
                    km9Var2.A();
                    km9Var2.getEditText().setSelection(km9Var2.getEditText().length());
                    return;
                }
                return;
            case 23:
                sj9 sj9Var = (sj9) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                boolean z = sj9Var.e;
                boolean z2 = sj9Var.d;
                rj9 rj9Var = sj9Var.s;
                if (sj9Var.x) {
                    return;
                }
                sj9Var.E = 0;
                if (sj9Var.c || z2 || z) {
                    if ((tLObject5 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject5).document) != null) {
                        if (!z) {
                            if (z2) {
                                sj9Var.y = true;
                                sj9Var.e();
                                rj9Var.f(document);
                                return;
                            } else {
                                sj9Var.y = true;
                                sj9Var.e();
                                rj9Var.d(document);
                                return;
                            }
                        }
                        int i10 = sj9Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            sj9Var.y = true;
                            sj9Var.e();
                            rj9Var.a();
                            return;
                        }
                        sj9Var.y = true;
                        sj9Var.e();
                        if (!TextUtils.isEmpty(sj9Var.G) && r47.W2(document) && (w = xb4.w(document.thumbs, jn7.q5, false, null, false)) != null) {
                            xb4.G(i10).e0(sj9Var.G, w);
                            File file2 = new File(sj9Var.G);
                            xb4.G(i10);
                            hl.F(file2, xb4.J(w, null, true, true));
                        }
                        rj9Var.e(document);
                        return;
                    }
                } else if ((tLObject5 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject5).photo) != null) {
                    sj9Var.y = true;
                    sj9Var.e();
                    rj9Var.c(photo);
                    return;
                }
                sj9Var.y = true;
                sj9Var.e();
                rj9Var.a();
                return;
            case 24:
                sj9 sj9Var2 = (sj9) this.b;
                String str4 = (String) this.c;
                if (sj9Var2.x || sj9Var2.y) {
                    return;
                }
                sj9Var2.a(str4);
                return;
            case 25:
                am9 m2 = ((xl9) this.b).w.m((TL_iv.pageTableCell) this.c);
                if (m2 != null) {
                    dg9 dg9Var = m2.a;
                    dg9Var.O();
                    dg9Var.setSelection(dg9Var.length());
                    return;
                }
                return;
            case 26:
                wm9 wm9Var = (wm9) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TL_account.TL_savedRingtonesNotModified) {
                        wm9Var.f(true);
                    } else if (tLObject6 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject6;
                        ArrayList<TLRPC.Document> arrayList8 = tL_savedRingtones.ringtones;
                        ArrayList arrayList9 = wm9Var.e;
                        if (!wm9Var.f) {
                            wm9Var.f(false);
                            wm9Var.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size2 = arrayList9.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList9.get(i11);
                            i11++;
                            vm9 vm9Var = (vm9) obj2;
                            if (vm9Var.b != null && (document2 = vm9Var.a) != null) {
                                hashMap.put(Long.valueOf(document2.id), vm9Var.b);
                            }
                        }
                        arrayList9.clear();
                        SharedPreferences d = wm9Var.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList8.size());
                        for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                            TLRPC.Document document4 = arrayList8.get(i12);
                            String str5 = (String) hashMap.get(Long.valueOf(document4.id));
                            SerializedData serializedData = new SerializedData(document4.getObjectSize());
                            document4.serializeToStream(serializedData);
                            edit.putString("tone_document" + i12, Utilities.f(serializedData.toByteArray()));
                            if (str5 != null) {
                                edit.putString("tone_local_path" + i12, str5);
                            }
                            vm9 vm9Var2 = new vm9();
                            vm9Var2.a = document4;
                            vm9Var2.b = str5;
                            int i13 = wm9Var.d;
                            wm9Var.d = i13 + 1;
                            vm9Var2.c = i13;
                            arrayList9.add(vm9Var2);
                        }
                        edit.apply();
                        jn7.f(wm9Var.c).k(jn7.h5, new Object[0]);
                        SharedPreferences.Editor edit2 = wm9Var.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        wm9.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        wm9.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    wm9Var.b();
                    return;
                }
                return;
            case 27:
                wm9 wm9Var2 = (wm9) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                while (i < arrayList10.size()) {
                    vm9 vm9Var3 = (vm9) arrayList10.get(i);
                    if (vm9Var3 != null && ((TextUtils.isEmpty(vm9Var3.b) || !new File(vm9Var3.b).exists()) && (document3 = vm9Var3.a) != null)) {
                        xb4.G(wm9Var2.c);
                        File I = xb4.I(document3);
                        if (I == null || !I.exists()) {
                            hl.c3(new yz8(wm9Var2, document3, (byte) 28));
                        }
                    }
                    i++;
                }
                return;
            case 28:
                wm9 wm9Var3 = (wm9) this.b;
                TLRPC.Document document5 = (TLRPC.Document) this.c;
                xb4.G(wm9Var3.c).X(document5, document5, 0, 0);
                return;
            default:
                xm9 xm9Var = (xm9) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i14 = xm9Var.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    jn7.e().k(jn7.S4, 4, ob6.a0("TooLongError", null, 2131743695, new Object[0]), ob6.a0("ErrorRingtoneDurationTooLong", null, 2131751069, Integer.valueOf(uc7.s1(i14).l4.a1.f())));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    jn7.e().k(jn7.S4, 4, ob6.a0("TooLargeError", null, 2131743696, new Object[0]), ob6.a0("ErrorRingtoneSizeTooBig", null, 2131751067, Integer.valueOf(uc7.s1(i14).l4.Z0.f() / 1024)));
                    return;
                } else {
                    jn7.e().k(jn7.S4, 4, ob6.a0("InvalidFormatError", null, 2131748935, new Object[0]), ob6.M0(2131751068, null));
                    return;
                }
        }
    }

    public /* synthetic */ yz8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
