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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wc extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ zc e;

    public wc(zc zcVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = zcVar;
        this.c = i10;
        this.d = g6Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02eb  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        FileInputStream fileInputStream;
        boolean z10;
        int s6;
        int intValue;
        String[] split;
        org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) m1Var.a;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        org.telegram.ui.ActionBar.j6 j10 = ((org.telegram.ui.Components.lp) arrayList.get(i10)).a.j(((org.telegram.ui.Components.lp) arrayList.get(i10)).c);
        if (j10 != null && j10.b != null && !j10.Q && new File(j10.b).exists()) {
            HashMap hashMap = zcVar.x;
            if (j10.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(j10.b));
                    int i11 = 0;
                    boolean z11 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.la.f3);
                            if (read == -1) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 >= read) {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                                byte[] bArr = org.telegram.ui.Cells.la.f3;
                                if (bArr[i13] == 10) {
                                    int i15 = i13 - i14;
                                    int i16 = i15 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j10.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb = new StringBuilder();
                                            z10 = z11;
                                            sb.append(Utilities.MD5(substring));
                                            sb.append(".wp");
                                            j10.c = new File(filesDirFixed, sb.toString()).getAbsolutePath();
                                            String queryParameter = parse.getQueryParameter("mode");
                                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                int i17 = 0;
                                                while (true) {
                                                    if (i17 >= split.length) {
                                                        break;
                                                    }
                                                    if ("blur".equals(split[i17])) {
                                                        j10.h = true;
                                                        break;
                                                    }
                                                    i17++;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                try {
                                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                                        j10.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                            j10.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                            j10.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                            j10.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                                        j10.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                String queryParameter4 = parse.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter4)) {
                                                    j10.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                }
                                                if (j10.y == 0) {
                                                    j10.y = 50;
                                                }
                                            }
                                        } else {
                                            z10 = z11;
                                            if (str.startsWith("WPS")) {
                                                j10.M = i12 + i16;
                                                z11 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s6 = org.telegram.ui.ActionBar.i5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.ra || s6 == org.telegram.ui.ActionBar.k6.Aa || s6 == org.telegram.ui.ActionBar.k6.Nd || s6 == org.telegram.ui.ActionBar.k6.Od || s6 == org.telegram.ui.ActionBar.k6.Pd || s6 == org.telegram.ui.ActionBar.k6.Qd)) {
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
                                                if (s6 == org.telegram.ui.ActionBar.k6.ra) {
                                                    j10.N = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.k6.Aa) {
                                                    j10.O = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.k6.Nd) {
                                                    j10.I = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.k6.Od) {
                                                    j10.J = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.k6.Pd) {
                                                    j10.K = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.k6.Qd) {
                                                    j10.L = intValue;
                                                }
                                            }
                                        }
                                        i14 += i16;
                                        i12 += i16;
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
                                    z10 = z11;
                                }
                                i13++;
                                fileInputStream2 = fileInputStream;
                                z11 = z10;
                            }
                            if (z11 || i11 == i12) {
                                break;
                            }
                            fileInputStream.getChannel().position(i12);
                            i11 = i12;
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
                if (j10.c == null || j10.f || new File(j10.c).exists()) {
                    z4 = true;
                    j10.Q = true;
                    org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(i10);
                    w11Var.setEnabled(z4);
                    w11Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i5, false));
                    w11Var.f(lpVar, 0L, false);
                    w11Var.g(lpVar.d, false);
                    w11Var.setFallbackWallpaper(lpVar.a.b ? null : zcVar.v);
                }
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.B).sendRequest(getwallpaper, new eg.b3(23, zcVar, j10));
                }
            }
        }
        z4 = true;
        org.telegram.ui.Components.lp lpVar2 = (org.telegram.ui.Components.lp) arrayList.get(i10);
        w11Var.setEnabled(z4);
        w11Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i5, false));
        w11Var.f(lpVar2, 0L, false);
        w11Var.g(lpVar2.d, false);
        w11Var.setFallbackWallpaper(lpVar2.a.b ? null : zcVar.v);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.el0(new vc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        int b10 = m1Var.b();
        View view = m1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(b10);
        org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
        w11Var.g(lpVar.d, false);
        w11Var.setFallbackWallpaper(lpVar.a.b ? null : zcVar.v);
    }
}
