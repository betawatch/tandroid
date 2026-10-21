package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x70(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0524 A[Catch: Exception -> 0x0413, TryCatch #5 {Exception -> 0x0413, blocks: (B:223:0x0402, B:225:0x0408, B:227:0x0416, B:229:0x0423, B:230:0x0426, B:232:0x0433, B:234:0x043b, B:236:0x044c, B:238:0x0452, B:240:0x045a, B:242:0x0462, B:291:0x0524, B:293:0x0529, B:294:0x052c, B:282:0x050f, B:285:0x04ff, B:286:0x0515), top: B:222:0x0402 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0529 A[Catch: Exception -> 0x0413, TryCatch #5 {Exception -> 0x0413, blocks: (B:223:0x0402, B:225:0x0408, B:227:0x0416, B:229:0x0423, B:230:0x0426, B:232:0x0433, B:234:0x043b, B:236:0x044c, B:238:0x0452, B:240:0x045a, B:242:0x0462, B:291:0x0524, B:293:0x0529, B:294:0x052c, B:282:0x050f, B:285:0x04ff, B:286:0x0515), top: B:222:0x0402 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String formatPluralString;
        int i10;
        ?? r72;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        boolean z10;
        boolean z11;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        int i12;
        long cameraFlipElapsedMs;
        int i13 = 2;
        int i14 = 1;
        switch (this.a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                boolean z13 = this.b;
                b2Var.dismiss();
                if (z13) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new w70(languageSelectActivity, 1), 10L);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z14 = this.b;
                Pattern pattern = LaunchActivity.C1;
                launchActivity.u0(n2Var, z14, false);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                boolean z15 = this.b;
                BetaUpdate betaUpdate = (BetaUpdate) this.d;
                Pattern pattern2 = LaunchActivity.C1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z15 || betaUpdate == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity2, update, launchActivity2.O);
                    return;
                }
                return;
            case 3:
                vm0.Y((vm0) this.c, this.b, (String) this.d);
                return;
            case 4:
                im0 im0Var = (im0) this.c;
                boolean z16 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                vm0 vm0Var = im0Var.e;
                if (z16) {
                    i10 = ((org.telegram.ui.ActionBar.n2) vm0Var).currentAccount;
                    UserConfig.getInstance(i10).resetSavedPassword();
                    vm0Var.N0 = 0;
                    vm0Var.Q1();
                    ViewGroup[] viewGroupArr = vm0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    vm0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(vm0Var.Y[0]);
                    return;
                }
                vm0Var.M1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    vm0Var.z1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    vm0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                } else {
                    c10 = 0;
                    formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                }
                String string = LocaleController.getString(R.string.AppName);
                int i15 = R.string.FloodWaitTime;
                Object[] objArr = new Object[1];
                objArr[c10] = formatPluralString;
                vm0Var.L1(string, LocaleController.formatString("FloodWaitTime", i15, objArr));
                return;
            case 5:
                jq0.U((jq0) this.c, (TLObject) this.d, this.b);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z17 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!z17) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.u3();
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str = (String) this.d;
                boolean z18 = this.b;
                if (str.equals(photoViewer2.C4.getImageKey())) {
                    photoViewer2.w4 = z18 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z19 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z19 || profileActivity.N4 != -1) {
                    profileActivity.j5();
                    b01 b01Var = profileActivity.d;
                    if (b01Var != null) {
                        b01Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.zh0 zh0Var = profileActivity.a0;
                if (zh0Var != null) {
                    org.telegram.ui.Components.wh0 j10 = org.telegram.ui.Components.zh0.j(7, zh0Var.a);
                    if (j10 == null || !j10.s) {
                        r72 = 0;
                    } else {
                        r72 = 0;
                        j10.s = false;
                        zh0Var.invalidate();
                    }
                    if (zArr[r72]) {
                        org.telegram.ui.Components.zh0 zh0Var2 = profileActivity.a0;
                        zh0Var2.I = true;
                        zh0Var2.o(7, r72);
                        profileActivity.a0.o(9, true);
                        org.telegram.ui.Components.zh0 zh0Var3 = profileActivity.a0;
                        if (zh0Var3.I) {
                            zh0Var3.I = r72;
                            zh0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.d;
                boolean z20 = this.b;
                Activity activity = (Activity) this.c;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p1(b2Var2, 0));
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
                        int i16 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i17 = 0;
                            while (i17 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i17);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z20) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i17++;
                                        i16 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), i16);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            int read = bufferedInputStream2.read(bArr, 0, i16);
                                            if (read != -1) {
                                                zipOutputStream.write(bArr, 0, read);
                                                i16 = 65536;
                                            } else {
                                                bufferedInputStream2.close();
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        bufferedInputStream = bufferedInputStream2;
                                        try {
                                            e.printStackTrace();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            AndroidUtilities.runOnUIThread(new fn0(b2Var2, zArr2, activity, file, 9));
                                            return;
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
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedInputStream = bufferedInputStream2;
                                        if (bufferedInputStream != null) {
                                        }
                                        if (zipOutputStream != null) {
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
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new fn0(b2Var2, zArr2, activity, file, 9));
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 10:
                h31.Q((h31) this.c, this.b, (org.telegram.ui.Components.ho0) this.d);
                return;
            case 11:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 12:
                org.telegram.ui.Wallet.w0 w0Var = (org.telegram.ui.Wallet.w0) this.c;
                ci.d1 d1Var = (ci.d1) this.d;
                boolean z21 = this.b;
                if (w0Var.b) {
                    return;
                }
                try {
                    if (d1Var.b == ((org.telegram.ui.Wallet.q0) d1Var.c).l()) {
                        w7.h6.b = w0Var;
                        LaunchActivity launchActivity3 = LaunchActivity.H1;
                        int i18 = Build.VERSION.SDK_INT;
                        if (launchActivity3 != null && !launchActivity3.isFinishing() && !launchActivity3.isDestroyed() && !launchActivity3.s().P()) {
                            w0Var.e = launchActivity3;
                            try {
                                if (z21) {
                                    w0Var.a();
                                } else if (i18 >= 30) {
                                    w0Var.d();
                                } else {
                                    w0Var.b();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                w0Var.a();
                            }
                        }
                        w0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        w0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    w0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 13:
                na0 na0Var = (na0) this.c;
                boolean z22 = this.b;
                org.telegram.ui.Wallet.r2 r2Var = (org.telegram.ui.Wallet.r2) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (na0Var.b) {
                    return;
                }
                if (U == null) {
                    na0Var.b();
                    return;
                } else {
                    if (!z22) {
                        U.presentFragment(r2Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    U.showAsSheet(r2Var, l2Var);
                    return;
                }
            case 14:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z23 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.b0;
                HashMap hashMap = wallpapersListActivity.c0;
                int i19 = wallpapersListActivity.v;
                HashMap hashMap2 = wallpapersListActivity.h0;
                ArrayList arrayList3 = wallpapersListActivity.e0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.g0.clear();
                    hashMap2.clear();
                    if (i19 != 1 && i19 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.f0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i20 = 0;
                    while (i20 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i20);
                        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            z11 = z23;
                        } else if (!(wallPaper instanceof TLRPC.TL_wallPaper) || (wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                            z11 = z23;
                            if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.h6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i21 = wallPaperSettings4.second_background_color;
                                sh1 sh1Var = (i21 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) ? new sh1(wallPaperSettings4.background_color, i21, null, wallPaperSettings4.rotation) : new sh1(null, wallPaperSettings4.background_color, i21, i11, wallPaperSettings4.fourth_background_color);
                                sh1Var.a = wallPaper.slug;
                                sh1Var.h = wallPaperSettings4.intensity / 100.0f;
                                sh1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                sh1Var.l = wallPaper;
                                arrayList3.add(sh1Var);
                                i20++;
                                z23 = z11;
                                i13 = 2;
                                i14 = 1;
                            }
                        } else {
                            hashMap.put(wallPaper.slug, wallPaper);
                            if (!wallPaper.pattern || (document = wallPaper.document) == null) {
                                z11 = z23;
                            } else {
                                z11 = z23;
                                if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.g0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                            }
                            if (i19 != i14 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i19 != i13 || z12) && (org.telegram.ui.ActionBar.h6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList3.add(wallPaper);
                            }
                        }
                        i20++;
                        z23 = z11;
                        i13 = 2;
                        i14 = 1;
                    }
                    z10 = z23;
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                } else {
                    z10 = z23;
                }
                org.telegram.ui.ActionBar.b2 b2Var3 = wallpapersListActivity.P;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.H.x0(0);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.c;
                String str2 = (String) this.d;
                boolean z24 = this.b;
                org.telegram.ui.web.c cVar = kVar.w;
                ArrayList arrayList4 = kVar.x;
                arrayList4.clear();
                org.telegram.ui.web.m1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i22 = 0; i22 < jSONArray.length(); i22++) {
                        arrayList5.add(jSONArray.getString(i22));
                    }
                } catch (Exception e14) {
                    FileLog.e((Throwable) e14, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i23 = 0; i23 < jSONArray2.length(); i23++) {
                            arrayList5.add(jSONArray2.getJSONObject(i23).getString("key"));
                        }
                    } catch (Exception e15) {
                        FileLog.e((Throwable) e15, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i24 = 0; i24 < jSONArray3.length(); i24++) {
                                String string2 = jSONArray3.getJSONObject(i24).getString("phrase");
                                if (!TextUtils.isEmpty(string2)) {
                                    arrayList5.add(string2);
                                }
                            }
                        } catch (Exception e16) {
                            FileLog.e((Throwable) e16, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                cVar.W2.N(true);
                if (z24 != (!arrayList4.isEmpty())) {
                    cVar.V2.h1(0, 0);
                    return;
                }
                return;
            case 16:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 17:
                si.t tVar = (si.t) this.c;
                boolean z25 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (tVar.f) {
                    tVar.F = z25;
                    Size size2 = z25 ? tVar.c : tVar.b;
                    tVar.a = size2;
                    int i25 = z25 ? tVar.l : tVar.k;
                    tVar.j = i25;
                    tVar.m = z25 ? tVar.o : tVar.n;
                    si.d0 d0Var = tVar.N;
                    if (d0Var != null) {
                        d0Var.c = size2;
                        d0Var.d = i25;
                        d0Var.q = si.d0.j(size2, i25, false);
                        d0Var.r = si.d0.j(size2, i25, true);
                        d0Var.A = false;
                        d0Var.z = 0L;
                    }
                    tVar.Q = -1L;
                    tVar.u0 = runnable;
                    tVar.i.b("GL dual input selected: input=" + (z25 ? 1 : 0));
                    return;
                }
                return;
            default:
                k2.w0 w0Var2 = (k2.w0) this.c;
                si.h hVar = (si.h) this.d;
                boolean z26 = this.b;
                si.s0 s0Var = (si.s0) w0Var2.b;
                int i26 = s0Var.W;
                if (i26 == 7 || i26 == 8 || i26 == 9 || i26 == 10) {
                    return;
                }
                si.l0 l0Var = hVar.a;
                si.n0 n0Var = hVar.c;
                si.m0 m0Var = hVar.b;
                s0Var.q = l0Var;
                s0Var.r = m0Var;
                s0Var.s = n0Var;
                s0Var.t = hVar.f;
                if (l0Var != si.l0.a) {
                    if (hVar.g) {
                        i12 = 2;
                        s0Var.X = i12;
                        s0Var.n();
                        si.n nVar = s0Var.m;
                        StringBuilder sb2 = new StringBuilder("camera configured: facing=");
                        sb2.append(l0Var);
                        sb2.append(", mode=");
                        sb2.append(m0Var);
                        sb2.append(", preview=");
                        sb2.append(hVar.d);
                        sb2.append(", recording=");
                        sb2.append(hVar.e);
                        sb2.append(", fps=");
                        sb2.append(n0Var.a);
                        sb2.append(", maxZoom=");
                        sb2.append(s0Var.t);
                        sb2.append(", flash=");
                        int i27 = s0Var.X;
                        sb2.append(i27 == 1 ? i27 != 2 ? i27 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z26);
                        nVar.b(sb2.toString());
                        if (z26) {
                        }
                        s0Var.w = false;
                        org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) s0Var.d.b;
                        l60Var.o0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(l0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = l60Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        FileLog.d(sb3.toString());
                        org.telegram.ui.Components.l60.l(l60Var);
                        s0Var.o();
                        return;
                    }
                    i12 = 1;
                    s0Var.X = i12;
                    s0Var.n();
                    si.n nVar2 = s0Var.m;
                    StringBuilder sb22 = new StringBuilder("camera configured: facing=");
                    sb22.append(l0Var);
                    sb22.append(", mode=");
                    sb22.append(m0Var);
                    sb22.append(", preview=");
                    sb22.append(hVar.d);
                    sb22.append(", recording=");
                    sb22.append(hVar.e);
                    sb22.append(", fps=");
                    sb22.append(n0Var.a);
                    sb22.append(", maxZoom=");
                    sb22.append(s0Var.t);
                    sb22.append(", flash=");
                    int i272 = s0Var.X;
                    sb22.append(i272 == 1 ? i272 != 2 ? i272 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z26);
                    nVar2.b(sb22.toString());
                    if (z26) {
                    }
                    s0Var.w = false;
                    org.telegram.ui.Components.l60 l60Var2 = (org.telegram.ui.Components.l60) s0Var.d.b;
                    l60Var2.o0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(l0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = l60Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    FileLog.d(sb32.toString());
                    org.telegram.ui.Components.l60.l(l60Var2);
                    s0Var.o();
                    return;
                }
                if (s0Var.f != null) {
                    i12 = 3;
                    s0Var.X = i12;
                    s0Var.n();
                    si.n nVar22 = s0Var.m;
                    StringBuilder sb222 = new StringBuilder("camera configured: facing=");
                    sb222.append(l0Var);
                    sb222.append(", mode=");
                    sb222.append(m0Var);
                    sb222.append(", preview=");
                    sb222.append(hVar.d);
                    sb222.append(", recording=");
                    sb222.append(hVar.e);
                    sb222.append(", fps=");
                    sb222.append(n0Var.a);
                    sb222.append(", maxZoom=");
                    sb222.append(s0Var.t);
                    sb222.append(", flash=");
                    int i2722 = s0Var.X;
                    sb222.append(i2722 == 1 ? i2722 != 2 ? i2722 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z26);
                    nVar22.b(sb222.toString());
                    if (!z26 || s0Var.w) {
                        s0Var.w = false;
                        org.telegram.ui.Components.l60 l60Var22 = (org.telegram.ui.Components.l60) s0Var.d.b;
                        l60Var22.o0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(l0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = l60Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        FileLog.d(sb322.toString());
                        org.telegram.ui.Components.l60.l(l60Var22);
                        s0Var.o();
                        return;
                    }
                    return;
                }
                i12 = 1;
                s0Var.X = i12;
                s0Var.n();
                si.n nVar222 = s0Var.m;
                StringBuilder sb2222 = new StringBuilder("camera configured: facing=");
                sb2222.append(l0Var);
                sb2222.append(", mode=");
                sb2222.append(m0Var);
                sb2222.append(", preview=");
                sb2222.append(hVar.d);
                sb2222.append(", recording=");
                sb2222.append(hVar.e);
                sb2222.append(", fps=");
                sb2222.append(n0Var.a);
                sb2222.append(", maxZoom=");
                sb2222.append(s0Var.t);
                sb2222.append(", flash=");
                int i27222 = s0Var.X;
                sb2222.append(i27222 == 1 ? i27222 != 2 ? i27222 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z26);
                nVar222.b(sb2222.toString());
                if (z26) {
                }
                s0Var.w = false;
                org.telegram.ui.Components.l60 l60Var222 = (org.telegram.ui.Components.l60) s0Var.d.b;
                l60Var222.o0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(l0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = l60Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                FileLog.d(sb3222.toString());
                org.telegram.ui.Components.l60.l(l60Var222);
                s0Var.o();
                return;
        }
    }

    public /* synthetic */ x70(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ x70(org.telegram.ui.ActionBar.b2 b2Var, boolean z10, Activity activity) {
        this.a = 9;
        this.d = b2Var;
        this.b = z10;
        this.c = activity;
    }
}
