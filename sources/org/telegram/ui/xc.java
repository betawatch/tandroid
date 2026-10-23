package org.telegram.ui;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class xc extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = zcVar;
        this.c = i10;
        this.d = g6Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02e6  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        FileInputStream fileInputStream;
        boolean z11;
        int v;
        int intValue;
        String[] split;
        org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) b1Var.a;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        org.telegram.ui.ActionBar.j6 i11 = ((org.telegram.ui.Components.vp) arrayList.get(i10)).a.i(((org.telegram.ui.Components.vp) arrayList.get(i10)).c);
        if (i11 != null && i11.b != null && !i11.T && new File(i11.b).exists()) {
            HashMap hashMap = zcVar.x;
            if (i11.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(i11.b));
                    int i12 = 0;
                    boolean z12 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.na.j3);
                            if (read == -1) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            int i13 = i12;
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                if (i14 >= read) {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                                byte[] bArr = org.telegram.ui.Cells.na.j3;
                                if (bArr[i14] == 10) {
                                    int i16 = i14 - i15;
                                    int i17 = i16 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i15, i16, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i11.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            z11 = z12;
                                            sb2.append(Utilities.MD5(substring));
                                            sb2.append(".wp");
                                            i11.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                            String queryParameter = parse.getQueryParameter("mode");
                                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                int i18 = 0;
                                                while (true) {
                                                    if (i18 >= split.length) {
                                                        break;
                                                    }
                                                    if ("blur".equals(split[i18])) {
                                                        i11.h = true;
                                                        break;
                                                    }
                                                    i18++;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                try {
                                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                                        i11.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                            i11.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                            i11.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                            i11.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                                        i11.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                String queryParameter4 = parse.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter4)) {
                                                    i11.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                }
                                                if (i11.y == 0) {
                                                    i11.y = 50;
                                                }
                                            }
                                        } else {
                                            z11 = z12;
                                            if (str.startsWith("WPS")) {
                                                i11.P = i13 + i17;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((v = org.telegram.ui.ActionBar.k5.v(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.ra || v == org.telegram.ui.ActionBar.k6.Aa || v == org.telegram.ui.ActionBar.k6.Nd || v == org.telegram.ui.ActionBar.k6.Od || v == org.telegram.ui.ActionBar.k6.Pd || v == org.telegram.ui.ActionBar.k6.Qd)) {
                                                String substring2 = str.substring(indexOf + 1);
                                                if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                                    intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                } else {
                                                    try {
                                                        intValue = Color.parseColor(substring2);
                                                    } catch (Exception unused3) {
                                                        intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                    }
                                                }
                                                if (v == org.telegram.ui.ActionBar.k6.ra) {
                                                    i11.Q = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.k6.Aa) {
                                                    i11.R = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.k6.Nd) {
                                                    i11.L = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.k6.Od) {
                                                    i11.M = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.k6.Pd) {
                                                    i11.N = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.k6.Qd) {
                                                    i11.O = intValue;
                                                }
                                            }
                                        }
                                        i15 += i17;
                                        i13 += i17;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } else {
                                    fileInputStream = fileInputStream2;
                                    z11 = z12;
                                }
                                i14++;
                                fileInputStream2 = fileInputStream;
                                z12 = z11;
                            }
                            if (z12 || i12 == i13) {
                                break;
                            }
                            fileInputStream.getChannel().position(i13);
                            i12 = i13;
                            fileInputStream2 = fileInputStream;
                        } catch (Throwable th5) {
                            th = th5;
                            fileInputStream = fileInputStream2;
                        }
                    }
                    fileInputStream.close();
                } catch (Throwable th6) {
                    FileLog.e(th6);
                }
                if (i11.c == null || i11.f || new File(i11.c).exists()) {
                    z10 = true;
                    i11.T = true;
                    org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(i10);
                    v21Var.setEnabled(z10);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, v21Var, null);
                    v21Var.f(vpVar, 0L, false);
                    v21Var.g(vpVar.d, false);
                    v21Var.setFallbackWallpaper(vpVar.a.b ? null : zcVar.v);
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, i11.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i11.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i11.E).sendRequest(getwallpaper, new vc(0, zcVar, i11));
                }
            }
        }
        z10 = true;
        org.telegram.ui.Components.vp vpVar2 = (org.telegram.ui.Components.vp) arrayList.get(i10);
        v21Var.setEnabled(z10);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, v21Var, null);
        v21Var.f(vpVar2, 0L, false);
        v21Var.g(vpVar2.d, false);
        v21Var.setFallbackWallpaper(vpVar2.a.b ? null : zcVar.v);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(new wc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        int b10 = b1Var.b();
        View view = b1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(b10);
        org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) view;
        v21Var.g(vpVar.d, false);
        v21Var.setFallbackWallpaper(vpVar.a.b ? null : zcVar.v);
    }
}
