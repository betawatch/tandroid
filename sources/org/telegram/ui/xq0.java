package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xq0(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d5, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e3, code lost:
    
        if (r5 == null) goto L147;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:369:0x061b A[Catch: Exception -> 0x0510, TryCatch #0 {Exception -> 0x0510, blocks: (B:300:0x04ff, B:302:0x0505, B:304:0x0513, B:306:0x0520, B:307:0x0523, B:309:0x0531, B:311:0x0539, B:313:0x054a, B:315:0x0550, B:317:0x0558, B:319:0x0560, B:369:0x061b, B:371:0x0620, B:372:0x0623, B:359:0x0608, B:362:0x05f8, B:363:0x060e), top: B:299:0x04ff }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0620 A[Catch: Exception -> 0x0510, TryCatch #0 {Exception -> 0x0510, blocks: (B:300:0x04ff, B:302:0x0505, B:304:0x0513, B:306:0x0520, B:307:0x0523, B:309:0x0531, B:311:0x0539, B:313:0x054a, B:315:0x0550, B:317:0x0558, B:319:0x0560, B:369:0x061b, B:371:0x0620, B:372:0x0623, B:359:0x0608, B:362:0x05f8, B:363:0x060e), top: B:299:0x04ff }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        int i10;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z4;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        SQLiteDatabase database;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                String str = (String) this.d;
                if (str.equals(photoViewer.z4.getImageKey())) {
                    photoViewer.t4 = this.b ? 1 : 0;
                    photoViewer.u4 = str;
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean[] zArr = (boolean[]) this.d;
                if (!this.b || profileActivity.I4 != -1) {
                    profileActivity.j5();
                    i01 i01Var = profileActivity.d;
                    if (i01Var != null) {
                        i01Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.lh0 lh0Var = profileActivity.X;
                if (lh0Var != null) {
                    org.telegram.ui.Components.ih0 j10 = org.telegram.ui.Components.lh0.j(7, lh0Var.a);
                    if (j10 != null && j10.s) {
                        j10.s = false;
                        lh0Var.invalidate();
                    }
                    if (zArr[0]) {
                        org.telegram.ui.Components.lh0 lh0Var2 = profileActivity.X;
                        lh0Var2.F = true;
                        lh0Var2.o(7, false);
                        profileActivity.X.o(9, true);
                        org.telegram.ui.Components.lh0 lh0Var3 = profileActivity.X;
                        if (lh0Var3.F) {
                            lh0Var3.F = false;
                            lh0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                Activity activity = (Activity) this.d;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.s1(d2Var, 0));
                        return;
                    }
                    File file = new File(logsDir, "logs.zip");
                    if (file.exists()) {
                        file.delete();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : logsDir.listFiles()) {
                        arrayList.add(file2);
                    }
                    File file3 = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                    if (file3.exists() && file3.isDirectory()) {
                        for (File file4 : file3.listFiles()) {
                            arrayList.add(file4);
                        }
                    }
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                        try {
                            byte[] bArr = new byte[65536];
                            while (i10 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i10);
                                if (!file5.getName().contains("cache4")) {
                                    if (!this.b) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    i10 = currentTimeMillis - file5.lastModified() > 86400000 ? i10 + 1 : 0;
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file5), 65536);
                                    try {
                                        try {
                                            zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                            while (true) {
                                                int read = bufferedInputStream.read(bArr, 0, 65536);
                                                if (read != -1) {
                                                    zipOutputStream.write(bArr, 0, read);
                                                } else {
                                                    bufferedInputStream.close();
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            e.printStackTrace();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            AndroidUtilities.runOnUIThread(new b30(d2Var, zArr2, activity, file, 26));
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        if (zipOutputStream != null) {
                                            zipOutputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                            }
                            zArr2[0] = true;
                        } catch (Exception e10) {
                            e = e10;
                            bufferedInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedInputStream = null;
                            if (bufferedInputStream != null) {
                            }
                            if (zipOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new b30(d2Var, zArr2, activity, file, 26));
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            case 3:
                b41.P((b41) this.c, this.b, (org.telegram.ui.Components.a90) this.d);
                return;
            case 4:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList2 = wallpapersListActivity.Y;
                HashMap hashMap = wallpapersListActivity.Z;
                int i12 = wallpapersListActivity.v;
                HashMap hashMap2 = wallpapersListActivity.e0;
                ArrayList arrayList3 = wallpapersListActivity.b0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.d0.clear();
                    hashMap2.clear();
                    int i13 = 2;
                    int i14 = 1;
                    if (i12 != 1 && i12 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.c0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i15);
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                hashMap.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (i12 != i14 && ((!(z4 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != i13 || z4) && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i16 = wallPaperSettings4.second_background_color;
                                pi1 pi1Var = (i16 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) ? new pi1(wallPaperSettings4.background_color, i16, null, wallPaperSettings4.rotation) : new pi1(null, wallPaperSettings4.background_color, i16, i11, wallPaperSettings4.fourth_background_color);
                                pi1Var.a = wallPaper.slug;
                                pi1Var.h = wallPaperSettings4.intensity / 100.0f;
                                pi1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                pi1Var.l = wallPaper;
                                arrayList3.add(pi1Var);
                            }
                        }
                        i15++;
                        i13 = 2;
                        i14 = 1;
                    }
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                }
                org.telegram.ui.ActionBar.d2 d2Var2 = wallpapersListActivity.M;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    if (this.b) {
                        return;
                    }
                    wallpapersListActivity.E.x0(0);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.c;
                String str2 = (String) this.d;
                org.telegram.ui.web.c cVar = kVar.w;
                ArrayList arrayList4 = kVar.x;
                arrayList4.clear();
                org.telegram.ui.web.m1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        arrayList5.add(jSONArray.getString(i17));
                    }
                } catch (Exception e13) {
                    FileLog.e((Throwable) e13, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                            arrayList5.add(jSONArray2.getJSONObject(i18).getString("key"));
                        }
                    } catch (Exception e14) {
                        FileLog.e((Throwable) e14, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                                String string = jSONArray3.getJSONObject(i19).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList5.add(string);
                                }
                            }
                        } catch (Exception e15) {
                            FileLog.e((Throwable) e15, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                cVar.V2.N(true);
                if (this.b != (!arrayList4.isEmpty())) {
                    cVar.U2.h1(0, 0);
                    return;
                }
                return;
            case 7:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 8:
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                ArrayList arrayList6 = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                } catch (Exception e16) {
                    FileLog.e(e16);
                    break;
                }
                if (database == null) {
                    return;
                }
                ArrayList arrayList7 = new ArrayList();
                StringBuilder sb = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                sb.append(this.b ? "2" : "0 OR type = 1");
                sb.append(" ORDER BY date DESC");
                sQLiteCursor = database.queryFinalized(sb.toString(), new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        try {
                            qh.s0 s0Var = new qh.s0(byteBufferValue);
                            s0Var.a = longValue;
                            arrayList6.add(s0Var);
                        } catch (Exception e17) {
                            FileLog.e(e17);
                            arrayList7.add(Long.valueOf(longValue));
                        }
                        byteBufferValue.reuse();
                    }
                }
                sQLiteCursor.dispose();
                if (arrayList7.size() > 0) {
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList7.get(i20)).stepThis().dispose();
                    }
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new mg1(18, callback, arrayList6));
                return;
            case 9:
                qh.z2 z2Var = (qh.z2) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                ArrayList arrayList8 = z2Var.c;
                if (tLObject2 instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                    z2Var.h = messages_botresults.next_offset;
                    if (this.b) {
                        arrayList8.clear();
                    }
                    for (int i21 = 0; i21 < messages_botresults.results.size(); i21++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i21);
                        TLRPC.Document document2 = botInlineResult.document;
                        if (document2 != null) {
                            arrayList8.add(document2);
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                arrayList8.add(photo);
                            } else if (botInlineResult.content != null) {
                                arrayList8.add(botInlineResult);
                            }
                        }
                    }
                    z2Var.d = false;
                    z2Var.F(false);
                    z2Var.l();
                    return;
                }
                return;
            case 10:
                vf.t tVar = (vf.t) this.c;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.d;
                ArrayList arrayList9 = new ArrayList();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList11 = new ArrayList<>();
                SQLiteCursor sQLiteCursor2 = null;
                try {
                    try {
                        sQLiteCursor2 = messagesStorage2.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor2.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                            arrayList9.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false));
                        }
                        sQLiteCursor2.dispose();
                        ArrayList<Long> arrayList12 = new ArrayList<>();
                        ArrayList arrayList13 = new ArrayList();
                        for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList9.get(i22);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i23 = 0; i23 < tL_businessChatLink.entities.size(); i23++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i23);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList12.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList12.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList12.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList12, arrayList10);
                        }
                        if (!arrayList13.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList13), arrayList11);
                        }
                    } catch (Exception e18) {
                        FileLog.e(e18);
                        break;
                    }
                    sQLiteCursor2.dispose();
                    AndroidUtilities.runOnUIThread(new hg.j(tVar, arrayList9, arrayList10, arrayList11, this.b, 22));
                    return;
                } finally {
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                }
            case 11:
                ((vh.a) this.c).P((Utilities.Callback) this.d, this.b, false);
                return;
            case 12:
                ((Utilities.Callback2) this.c).run((Bitmap) this.d, Boolean.valueOf(this.b));
                return;
            case 13:
                wh.r3 r3Var = (wh.r3) this.c;
                wh.i5 i5Var = (wh.i5) this.d;
                boolean z10 = this.b;
                boolean z11 = !z10;
                wh.k5 k5Var = i5Var.v;
                Iterator it = i5Var.E.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    wh.l5 m9 = k5Var.m(pagetablecell);
                    if (m9 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wh.z5.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (wh.x5.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        wh.z5.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            wh.x5.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            wh.x5.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        wh.z5.d(pagetablecell, spannableStringBuilder);
                    } else if (m9.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m9.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (wh.x5.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        wh.z5.l(m9.b, z11);
                        if (z10) {
                            if (z13) {
                                wh.x5.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            wh.x5.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        wh.z5.d(m9.b, spannableStringBuilder2);
                        m9.b(m9.b);
                    }
                }
                k5Var.invalidate();
                wh.y2 y2Var = i5Var.B;
                if (y2Var != null && i5Var.a != null) {
                    y2Var.a();
                }
                r3Var.M2();
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                wh.q3 q3Var = (wh.q3) this.d;
                q3Var.f.o3(true);
                wh.d4.k(p2Var, this.b, new wh.a4(q3Var, 2));
                return;
        }
    }

    public /* synthetic */ xq0(Object obj, boolean z4, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
    }
}
