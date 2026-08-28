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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tc extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ vc e;

    public tc(vc vcVar, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.e = vcVar;
        this.c = i9;
        this.d = b6Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02ea  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        FileInputStream fileInputStream;
        boolean z11;
        int s10;
        int intValue;
        String[] split;
        org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) q1Var.a;
        vc vcVar = this.e;
        ArrayList arrayList = vcVar.c;
        org.telegram.ui.ActionBar.e6 j10 = ((org.telegram.ui.Components.bp) arrayList.get(i9)).a.j(((org.telegram.ui.Components.bp) arrayList.get(i9)).c);
        if (j10 != null && j10.b != null && !j10.P && new File(j10.b).exists()) {
            HashMap hashMap = vcVar.x;
            if (j10.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(j10.b));
                    int i10 = 0;
                    boolean z12 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.ma.e3);
                            if (read == -1) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            int i11 = i10;
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                if (i12 >= read) {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                                byte[] bArr = org.telegram.ui.Cells.ma.e3;
                                if (bArr[i12] == 10) {
                                    int i14 = i12 - i13;
                                    int i15 = i14 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i13, i14, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j10.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            z11 = z12;
                                            sb2.append(Utilities.MD5(substring));
                                            sb2.append(".wp");
                                            j10.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                            String queryParameter = parse.getQueryParameter("mode");
                                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                int i16 = 0;
                                                while (true) {
                                                    if (i16 >= split.length) {
                                                        break;
                                                    }
                                                    if ("blur".equals(split[i16])) {
                                                        j10.h = true;
                                                        break;
                                                    }
                                                    i16++;
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
                                            z11 = z12;
                                            if (str.startsWith("WPS")) {
                                                j10.L = i11 + i15;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.f6.ra || s10 == org.telegram.ui.ActionBar.f6.Aa || s10 == org.telegram.ui.ActionBar.f6.Nd || s10 == org.telegram.ui.ActionBar.f6.Od || s10 == org.telegram.ui.ActionBar.f6.Pd || s10 == org.telegram.ui.ActionBar.f6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.f6.ra) {
                                                    j10.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Aa) {
                                                    j10.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Nd) {
                                                    j10.H = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Od) {
                                                    j10.I = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Pd) {
                                                    j10.J = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Qd) {
                                                    j10.K = intValue;
                                                }
                                            }
                                        }
                                        i13 += i15;
                                        i11 += i15;
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    fileInputStream = fileInputStream2;
                                    z11 = z12;
                                }
                                i12++;
                                fileInputStream2 = fileInputStream;
                                z12 = z11;
                            }
                            if (z12 || i10 == i11) {
                                break;
                            }
                            fileInputStream.getChannel().position(i11);
                            i10 = i11;
                            fileInputStream2 = fileInputStream;
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = fileInputStream2;
                        }
                    }
                    fileInputStream.close();
                } catch (Throwable th5) {
                    FileLog.e(th5);
                }
                if (j10.c == null || j10.f || new File(j10.c).exists()) {
                    z10 = true;
                    j10.P = true;
                    org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) arrayList.get(i9);
                    a11Var.setEnabled(z10);
                    a11Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i5, false));
                    a11Var.f(bpVar, 0L, false);
                    a11Var.g(bpVar.d, false);
                    a11Var.setFallbackWallpaper(bpVar.a.b ? null : vcVar.v);
                }
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.A).sendRequest(getwallpaper, new rc(0, vcVar, j10));
                }
            }
        }
        z10 = true;
        org.telegram.ui.Components.bp bpVar2 = (org.telegram.ui.Components.bp) arrayList.get(i9);
        a11Var.setEnabled(z10);
        a11Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i5, false));
        a11Var.f(bpVar2, 0L, false);
        a11Var.g(bpVar2.d, false);
        a11Var.setFallbackWallpaper(bpVar2.a.b ? null : vcVar.v);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new org.telegram.ui.Components.ik0(new sc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        vc vcVar = this.e;
        ArrayList arrayList = vcVar.c;
        int b10 = q1Var.b();
        View view = q1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) arrayList.get(b10);
        org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) view;
        a11Var.g(bpVar.d, false);
        a11Var.setFallbackWallpaper(bpVar.a.b ? null : vcVar.v);
    }
}
