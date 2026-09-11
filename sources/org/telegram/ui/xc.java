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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xc extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = zcVar;
        this.c = i10;
        this.d = f6Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02eb  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        FileInputStream fileInputStream;
        boolean z11;
        int s10;
        int intValue;
        String[] split;
        org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) c1Var.a;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        org.telegram.ui.ActionBar.i6 j3 = ((org.telegram.ui.Components.kp) arrayList.get(i10)).a.j(((org.telegram.ui.Components.kp) arrayList.get(i10)).c);
        if (j3 != null && j3.b != null && !j3.T && new File(j3.b).exists()) {
            HashMap hashMap = zcVar.x;
            if (j3.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(j3.b));
                    int i11 = 0;
                    boolean z12 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.pa.i3);
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
                                byte[] bArr = org.telegram.ui.Cells.pa.i3;
                                if (bArr[i13] == 10) {
                                    int i15 = i13 - i14;
                                    int i16 = i15 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j3.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            z11 = z12;
                                            sb2.append(Utilities.MD5(substring));
                                            sb2.append(".wp");
                                            j3.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                            String queryParameter = parse.getQueryParameter("mode");
                                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                int i17 = 0;
                                                while (true) {
                                                    if (i17 >= split.length) {
                                                        break;
                                                    }
                                                    if ("blur".equals(split[i17])) {
                                                        j3.h = true;
                                                        break;
                                                    }
                                                    i17++;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                try {
                                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                                        j3.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                            j3.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                            j3.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                            j3.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                                        j3.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                String queryParameter4 = parse.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter4)) {
                                                    j3.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                }
                                                if (j3.y == 0) {
                                                    j3.y = 50;
                                                }
                                            }
                                        } else {
                                            z11 = z12;
                                            if (str.startsWith("WPS")) {
                                                j3.P = i12 + i16;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.g5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.j6.ra || s10 == org.telegram.ui.ActionBar.j6.Aa || s10 == org.telegram.ui.ActionBar.j6.Nd || s10 == org.telegram.ui.ActionBar.j6.Od || s10 == org.telegram.ui.ActionBar.j6.Pd || s10 == org.telegram.ui.ActionBar.j6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.j6.ra) {
                                                    j3.Q = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.j6.Aa) {
                                                    j3.R = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.j6.Nd) {
                                                    j3.L = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.j6.Od) {
                                                    j3.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.j6.Pd) {
                                                    j3.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.j6.Qd) {
                                                    j3.O = intValue;
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
                                    z11 = z12;
                                }
                                i13++;
                                fileInputStream2 = fileInputStream;
                                z12 = z11;
                            }
                            if (z12 || i11 == i12) {
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
                if (j3.c == null || j3.f || new File(j3.c).exists()) {
                    z10 = true;
                    j3.T = true;
                    org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList.get(i10);
                    t11Var.setEnabled(z10);
                    t11Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i5, false));
                    t11Var.f(kpVar, 0L, false);
                    t11Var.g(kpVar.d, false);
                    t11Var.setFallbackWallpaper(kpVar.a.b ? null : zcVar.v);
                }
                if (!hashMap.containsKey(j3)) {
                    hashMap.put(j3, j3.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j3.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j3.E).sendRequest(getwallpaper, new bi.m1(23, zcVar, j3));
                }
            }
        }
        z10 = true;
        org.telegram.ui.Components.kp kpVar2 = (org.telegram.ui.Components.kp) arrayList.get(i10);
        t11Var.setEnabled(z10);
        t11Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i5, false));
        t11Var.f(kpVar2, 0L, false);
        t11Var.g(kpVar2.d, false);
        t11Var.setFallbackWallpaper(kpVar2.a.b ? null : zcVar.v);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.vk0(new wc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.c;
        int b10 = c1Var.b();
        View view = c1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList.get(b10);
        org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) view;
        t11Var.g(kpVar.d, false);
        t11Var.setFallbackWallpaper(kpVar.a.b ? null : zcVar.v);
    }
}
