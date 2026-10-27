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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xc extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = zcVar;
        this.c = i10;
        this.d = u6Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02e6  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        FileInputStream fileInputStream;
        boolean z11;
        int i11;
        int intValue;
        String[] split;
        org.telegram.ui.Components.e31 e31Var = (org.telegram.ui.Components.e31) e1Var.a;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        org.telegram.ui.ActionBar.x6 i12 = ((org.telegram.ui.Components.yp) arrayList.get(i10)).a.i(((org.telegram.ui.Components.yp) arrayList.get(i10)).c);
        if (i12 != null && i12.b != null && !i12.T && new File(i12.b).exists()) {
            HashMap hashMap = zcVar.x;
            if (i12.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(i12.b));
                    int i13 = 0;
                    boolean z12 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.ra.q3);
                            if (read == -1) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            int i14 = i13;
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 >= read) {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                                byte[] bArr = org.telegram.ui.Cells.ra.q3;
                                if (bArr[i15] == 10) {
                                    int i17 = i15 - i16;
                                    int i18 = i17 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i16, i17, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i12.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            z11 = z12;
                                            sb2.append(Utilities.MD5(substring));
                                            sb2.append(".wp");
                                            i12.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                            String queryParameter = parse.getQueryParameter("mode");
                                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                int i19 = 0;
                                                while (true) {
                                                    if (i19 >= split.length) {
                                                        break;
                                                    }
                                                    if ("blur".equals(split[i19])) {
                                                        i12.h = true;
                                                        break;
                                                    }
                                                    i19++;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                try {
                                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                                        i12.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                            i12.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                            i12.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                            i12.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                                        i12.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                String queryParameter4 = parse.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter4)) {
                                                    i12.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                }
                                                if (i12.y == 0) {
                                                    i12.y = 50;
                                                }
                                            }
                                        } else {
                                            z11 = z12;
                                            if (str.startsWith("WPS")) {
                                                i12.P = i14 + i18;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((i11 = org.telegram.ui.ActionBar.m5.i(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.y6.ra || i11 == org.telegram.ui.ActionBar.y6.Aa || i11 == org.telegram.ui.ActionBar.y6.Nd || i11 == org.telegram.ui.ActionBar.y6.Od || i11 == org.telegram.ui.ActionBar.y6.Pd || i11 == org.telegram.ui.ActionBar.y6.Qd)) {
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
                                                if (i11 == org.telegram.ui.ActionBar.y6.ra) {
                                                    i12.Q = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Aa) {
                                                    i12.R = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Nd) {
                                                    i12.L = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Od) {
                                                    i12.M = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Pd) {
                                                    i12.N = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Qd) {
                                                    i12.O = intValue;
                                                }
                                            }
                                        }
                                        i16 += i18;
                                        i14 += i18;
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
                                i15++;
                                fileInputStream2 = fileInputStream;
                                z12 = z11;
                            }
                            if (z12 || i13 == i14) {
                                break;
                            }
                            fileInputStream.getChannel().position(i14);
                            i13 = i14;
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
                if (i12.c == null || i12.f || new File(i12.c).exists()) {
                    z10 = true;
                    i12.T = true;
                    org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i10);
                    e31Var.setEnabled(z10);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.i5, e31Var, null);
                    e31Var.f(ypVar, 0L, false);
                    e31Var.g(ypVar.d, false);
                    e31Var.setFallbackWallpaper(ypVar.a.b ? null : zcVar.v);
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, i12.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i12.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i12.E).sendRequest(getwallpaper, new z7(1, zcVar, i12));
                }
            }
        }
        z10 = true;
        org.telegram.ui.Components.yp ypVar2 = (org.telegram.ui.Components.yp) arrayList.get(i10);
        e31Var.setEnabled(z10);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.i5, e31Var, null);
        e31Var.f(ypVar2, 0L, false);
        e31Var.g(ypVar2.d, false);
        e31Var.setFallbackWallpaper(ypVar2.a.b ? null : zcVar.v);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(new wc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        int b10 = e1Var.b();
        View view = e1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(b10);
        org.telegram.ui.Components.e31 e31Var = (org.telegram.ui.Components.e31) view;
        e31Var.g(ypVar.d, false);
        e31Var.setFallbackWallpaper(ypVar.a.b ? null : zcVar.v);
    }
}
