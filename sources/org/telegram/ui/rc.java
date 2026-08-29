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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rc extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ tc e;

    public rc(tc tcVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = tcVar;
        this.c = i10;
        this.d = c6Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
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
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        FileInputStream fileInputStream;
        boolean z11;
        int s10;
        int intValue;
        String[] split;
        org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) n1Var.a;
        tc tcVar = this.e;
        ArrayList arrayList = tcVar.c;
        org.telegram.ui.ActionBar.f6 j10 = ((org.telegram.ui.Components.fp) arrayList.get(i10)).a.j(((org.telegram.ui.Components.fp) arrayList.get(i10)).c);
        if (j10 != null && j10.b != null && !j10.P && new File(j10.b).exists()) {
            HashMap hashMap = tcVar.x;
            if (j10.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(j10.b));
                    int i11 = 0;
                    boolean z12 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.ja.e3);
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
                                byte[] bArr = org.telegram.ui.Cells.ja.e3;
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
                                            StringBuilder sb2 = new StringBuilder();
                                            z11 = z12;
                                            sb2.append(Utilities.MD5(substring));
                                            sb2.append(".wp");
                                            j10.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
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
                                            z11 = z12;
                                            if (str.startsWith("WPS")) {
                                                j10.L = i12 + i16;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.g6.ra || s10 == org.telegram.ui.ActionBar.g6.Aa || s10 == org.telegram.ui.ActionBar.g6.Nd || s10 == org.telegram.ui.ActionBar.g6.Od || s10 == org.telegram.ui.ActionBar.g6.Pd || s10 == org.telegram.ui.ActionBar.g6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.g6.ra) {
                                                    j10.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Aa) {
                                                    j10.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Nd) {
                                                    j10.H = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Od) {
                                                    j10.I = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Pd) {
                                                    j10.J = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Qd) {
                                                    j10.K = intValue;
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
                if (j10.c == null || j10.f || new File(j10.c).exists()) {
                    z10 = true;
                    j10.P = true;
                    org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) arrayList.get(i10);
                    l11Var.setEnabled(z10);
                    l11Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i5, false));
                    l11Var.f(fpVar, 0L, false);
                    l11Var.g(fpVar.d, false);
                    l11Var.setFallbackWallpaper(fpVar.a.b ? null : tcVar.v);
                }
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.A).sendRequest(getwallpaper, new bg.h3(26, tcVar, j10));
                }
            }
        }
        z10 = true;
        org.telegram.ui.Components.fp fpVar2 = (org.telegram.ui.Components.fp) arrayList.get(i10);
        l11Var.setEnabled(z10);
        l11Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i5, false));
        l11Var.f(fpVar2, 0L, false);
        l11Var.g(fpVar2.d, false);
        l11Var.setFallbackWallpaper(fpVar2.a.b ? null : tcVar.v);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.vk0(new qc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        tc tcVar = this.e;
        ArrayList arrayList = tcVar.c;
        int b10 = n1Var.b();
        View view = n1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) arrayList.get(b10);
        org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) view;
        l11Var.g(fpVar.d, false);
        l11Var.setFallbackWallpaper(fpVar.a.b ? null : tcVar.v);
    }
}
