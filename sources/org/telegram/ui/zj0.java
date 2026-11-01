package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zj0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fd, code lost:
    
        if (r3 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:332:0x053f A[Catch: Exception -> 0x0431, TryCatch #6 {Exception -> 0x0431, blocks: (B:264:0x0420, B:266:0x0426, B:268:0x0434, B:270:0x0441, B:271:0x0444, B:273:0x0451, B:275:0x0459, B:277:0x046a, B:279:0x0470, B:281:0x0478, B:283:0x0480, B:332:0x053f, B:334:0x0544, B:335:0x0547, B:322:0x052b, B:325:0x051b, B:326:0x0531), top: B:263:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0544 A[Catch: Exception -> 0x0431, TryCatch #6 {Exception -> 0x0431, blocks: (B:264:0x0420, B:266:0x0426, B:268:0x0434, B:270:0x0441, B:271:0x0444, B:273:0x0451, B:275:0x0459, B:277:0x046a, B:279:0x0470, B:281:0x0478, B:283:0x0480, B:332:0x053f, B:334:0x0544, B:335:0x0547, B:322:0x052b, B:325:0x051b, B:326:0x0531), top: B:263:0x0420 }] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:207:0x03b5 -> B:197:0x03d0). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String G;
        int i10;
        ?? r62;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        SQLiteDatabase sQLiteDatabase;
        SQLiteCursor sQLiteCursor = null;
        int i13 = 1;
        int i14 = 0;
        switch (this.a) {
            case 0:
                jl0.d0((jl0) this.c, this.b, (String) this.d);
                return;
            case 1:
                wk0 wk0Var = (wk0) this.c;
                boolean z11 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                jl0 jl0Var = wk0Var.e;
                if (z11) {
                    i10 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                    org.telegram.messenger.e20.i(i10).u();
                    jl0Var.N0 = 0;
                    jl0Var.W1();
                    ViewGroup[] viewGroupArr = jl0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    jl0Var.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(jl0Var.Y[0]);
                    return;
                }
                jl0Var.R1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    jl0Var.E1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    jl0Var.Q1(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error.text);
                    return;
                }
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String L0 = org.telegram.messenger.dd.L0(R.string.AppName, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                jl0Var.Q1(L0, org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, objArr));
                return;
            case 2:
                jo0.Z((jo0) this.c, (TLObject) this.d, this.b);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z12 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!z12) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.v3();
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str = (String) this.d;
                boolean z13 = this.b;
                if (str.equals(photoViewer2.C4.Q)) {
                    photoViewer2.w4 = z13 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z14 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z14) {
                    RectF rectF = ProfileActivity.S6;
                } else if (profileActivity.L4 == -1) {
                    org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
                    if (hg0Var != null) {
                        org.telegram.ui.Components.eg0 i15 = org.telegram.ui.Components.hg0.i(7, hg0Var.a);
                        if (i15 == null || !i15.s) {
                            r62 = 0;
                        } else {
                            r62 = 0;
                            i15.s = false;
                            hg0Var.invalidate();
                        }
                        if (zArr[r62]) {
                            org.telegram.ui.Components.hg0 hg0Var2 = profileActivity.Z;
                            hg0Var2.F = true;
                            hg0Var2.o(7, r62);
                            profileActivity.Z.o(9, true);
                            org.telegram.ui.Components.hg0 hg0Var3 = profileActivity.Z;
                            if (hg0Var3.F) {
                                hg0Var3.F = r62;
                                hg0Var3.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                profileActivity.J5();
                wx0 wx0Var = profileActivity.d;
                if (wx0Var != null) {
                    wx0Var.f();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                boolean z15 = this.b;
                Activity activity = (Activity) this.d;
                RectF rectF2 = ProfileActivity.S6;
                try {
                    File P0 = org.telegram.messenger.i0.P0();
                    if (P0 == null) {
                        org.telegram.messenger.i0.g3(new org.telegram.ui.ActionBar.n1(x1Var, 0));
                        return;
                    }
                    File file = new File(P0, "logs.zip");
                    if (file.exists()) {
                        file.delete();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : P0.listFiles()) {
                        arrayList.add(file2);
                    }
                    File file3 = new File(org.telegram.messenger.w0.h(), "malformed_database/");
                    if (file3.exists() && file3.isDirectory()) {
                        for (File file4 : file3.listFiles()) {
                            arrayList.add(file4);
                        }
                    }
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                        int i16 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i17 = 0;
                            while (i17 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i17);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z15) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i17++;
                                        i16 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file5), i16);
                                    try {
                                        try {
                                            zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                            while (true) {
                                                int read = bufferedInputStream.read(bArr, 0, i16);
                                                if (read != -1) {
                                                    zipOutputStream.write(bArr, 0, read);
                                                    i16 = 65536;
                                                } else {
                                                    bufferedInputStream.close();
                                                }
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            e.printStackTrace();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            org.telegram.messenger.i0.g3(new v50(x1Var, zArr2, activity, file, 24));
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
                                i17++;
                                i16 = 65536;
                            }
                            zArr2[0] = true;
                        } catch (Exception e7) {
                            e = e7;
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
                    } catch (Exception e10) {
                        e = e10;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    org.telegram.messenger.i0.g3(new v50(x1Var, zArr2, activity, file, 24));
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 7:
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) this.c;
                boolean z16 = this.b;
                org.telegram.ui.Components.hi0 hi0Var = (org.telegram.ui.Components.hi0) this.d;
                if (z16) {
                    org.telegram.messenger.wp.r1(e30Var.a).o0(true);
                    hi0Var.run();
                } else {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    } else {
                        T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                    }
                }
                e30Var.dismiss();
                return;
            case 8:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 9:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.c;
                m4.x0 x0Var = (m4.x0) this.d;
                boolean z17 = this.b;
                if (u0Var.b) {
                    return;
                }
                try {
                    if (x0Var.b == ((org.telegram.ui.Wallet.p0) x0Var.c).l()) {
                        w7.k6.b = u0Var;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        int i18 = Build.VERSION.SDK_INT;
                        if (launchActivity != null && !launchActivity.isFinishing() && !launchActivity.isDestroyed() && !launchActivity.s().P()) {
                            u0Var.e = launchActivity;
                            try {
                                if (z17) {
                                    u0Var.a();
                                } else if (i18 >= 30) {
                                    u0Var.d();
                                } else {
                                    u0Var.b();
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.f8.g(e12, true);
                                u0Var.a();
                            }
                        }
                        u0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        u0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.f8.g(e13, true);
                    u0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 10:
                z90 z90Var = (z90) this.c;
                boolean z18 = this.b;
                org.telegram.ui.Wallet.h3 h3Var = (org.telegram.ui.Wallet.h3) this.d;
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (z90Var.b) {
                    return;
                }
                if (T2 == null) {
                    z90Var.a();
                    return;
                } else {
                    if (!z18) {
                        T2.presentFragment(h3Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    T2.showAsSheet(h3Var, i2Var);
                    return;
                }
            case 11:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z19 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.X;
                HashMap hashMap = wallpapersListActivity.Y;
                int i19 = wallpapersListActivity.r;
                HashMap hashMap2 = wallpapersListActivity.d0;
                ArrayList arrayList3 = wallpapersListActivity.a0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.c0.clear();
                    hashMap2.clear();
                    char c11 = 2;
                    if (i19 != 1 && i19 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.b0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i20 = 0;
                    while (i20 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i20);
                        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            i11 = i20;
                        } else if (!(wallPaper instanceof TLRPC.TL_wallPaper) || (wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                            i11 = i20;
                            if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.t6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i21 = wallPaperSettings4.second_background_color;
                                ke1 ke1Var = (i21 == 0 || (i12 = wallPaperSettings4.third_background_color) == 0) ? new ke1(wallPaperSettings4.background_color, i21, null, wallPaperSettings4.rotation) : new ke1(null, wallPaperSettings4.background_color, i21, i12, wallPaperSettings4.fourth_background_color);
                                ke1Var.a = wallPaper.slug;
                                ke1Var.h = wallPaperSettings4.intensity / 100.0f;
                                ke1Var.f = org.telegram.messenger.i0.s1(wallPaperSettings4.rotation, false);
                                ke1Var.l = wallPaper;
                                arrayList3.add(ke1Var);
                            }
                        } else {
                            hashMap.put(wallPaper.slug, wallPaper);
                            if (!wallPaper.pattern || (document = wallPaper.document) == null) {
                                i11 = i20;
                            } else {
                                i11 = i20;
                                if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                            }
                            if (i19 != i13 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i19 != 2 || z10) && (org.telegram.ui.ActionBar.t6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList3.add(wallPaper);
                            }
                        }
                        i20 = i11 + 1;
                        i13 = 1;
                        c11 = 2;
                    }
                    wallpapersListActivity.F0();
                    wallpapersListActivity.getMessagesStorage().p1(1, tL_wallPapers.wallpapers);
                }
                org.telegram.ui.ActionBar.x1 x1Var2 = wallpapersListActivity.L;
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    if (z19) {
                        return;
                    }
                    wallpapersListActivity.F.y0(0);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.c;
                String str2 = (String) this.d;
                boolean z20 = this.b;
                org.telegram.ui.Components.ii iiVar = jVar.x;
                ArrayList arrayList4 = jVar.y;
                arrayList4.clear();
                org.telegram.ui.web.g1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i22 = 0; i22 < jSONArray.length(); i22++) {
                        arrayList5.add(jSONArray.getString(i22));
                    }
                } catch (Exception e14) {
                    org.telegram.messenger.f8.g(e14, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i23 = 0; i23 < jSONArray2.length(); i23++) {
                            arrayList5.add(jSONArray2.getJSONObject(i23).getString("key"));
                        }
                    } catch (Exception e15) {
                        org.telegram.messenger.f8.g(e15, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i24 = 0; i24 < jSONArray3.length(); i24++) {
                                String string = jSONArray3.getJSONObject(i24).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList5.add(string);
                                }
                            }
                        } catch (Exception e16) {
                            org.telegram.messenger.f8.g(e16, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                iiVar.f3.O(true);
                if (z20 != (!arrayList4.isEmpty())) {
                    iiVar.e3.h1(0, 0);
                    return;
                }
                return;
            case 13:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 14:
                ((org.telegram.messenger.k20) this.c).a(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 15:
                ((ih.s) this.c).a(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 16:
                ((org.telegram.ui.Components.q70) this.c).a(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 17:
                org.telegram.messenger.is isVar = (org.telegram.messenger.is) this.c;
                boolean z21 = this.b;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.d;
                ArrayList arrayList6 = new ArrayList();
                try {
                    try {
                        sQLiteDatabase = isVar.b;
                    } catch (Exception e17) {
                        org.telegram.messenger.f8.g(e17, true);
                        break;
                    }
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    StringBuilder sb2 = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                    sb2.append(z21 ? "2" : "0 OR type = 1");
                    sb2.append(" ORDER BY date DESC");
                    sQLiteCursor = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                    while (sQLiteCursor.next()) {
                        long longValue = sQLiteCursor.longValue(0);
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            try {
                                vh.s0 s0Var = new vh.s0(byteBufferValue);
                                s0Var.a = longValue;
                                arrayList6.add(s0Var);
                            } catch (Exception e18) {
                                org.telegram.messenger.f8.g(e18, true);
                                arrayList7.add(Long.valueOf(longValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor.dispose();
                    if (arrayList7.size() > 0) {
                        for (int i25 = 0; i25 < arrayList7.size(); i25++) {
                            sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList7.get(i25)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.i0.g3(new vh.r0(i14, r20Var, arrayList6));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            default:
                vh.j2 j2Var = (vh.j2) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                boolean z22 = this.b;
                ArrayList arrayList8 = j2Var.c;
                if (tLObject2 instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                    j2Var.h = messages_botresults.next_offset;
                    if (z22) {
                        arrayList8.clear();
                    }
                    for (int i26 = 0; i26 < messages_botresults.results.size(); i26++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i26);
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
                    j2Var.d = false;
                    j2Var.F(false);
                    j2Var.f();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zj0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
