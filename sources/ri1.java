// default package

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.f;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ri1 extends q59 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ylb d;
    public final /* synthetic */ ti1 e;

    public ri1(ti1 ti1Var, int i, ylb ylbVar) {
        this.e = ti1Var;
        this.c = i;
        this.d = ylbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        return this.e.c.size();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:48|49)|(15:51|52|53|(1:57)|58|(1:62)|63|(1:67)|68|69|(1:71)|72|(1:74)|75|(1:77))|82|68|69|(0)|72|(0)|75|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166 A[Catch: Exception -> 0x0170, all -> 0x0247, TRY_LEAVE, TryCatch #0 {Exception -> 0x0170, blocks: (B:69:0x015a, B:71:0x0166), top: B:68:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c A[Catch: all -> 0x0247, TryCatch #4 {all -> 0x0247, blocks: (B:25:0x006e, B:27:0x007b, B:29:0x009e, B:31:0x00aa, B:34:0x00ae, B:36:0x00b1, B:40:0x00bd, B:38:0x00c1, B:42:0x00c6, B:49:0x00d2, B:53:0x00e2, B:55:0x00fa, B:57:0x0104, B:58:0x0113, B:60:0x011b, B:62:0x0125, B:63:0x0135, B:65:0x013d, B:67:0x0147, B:69:0x015a, B:71:0x0166, B:72:0x0170, B:74:0x017c, B:75:0x0186, B:77:0x018a, B:45:0x0223, B:47:0x022c, B:85:0x0194, B:130:0x019e, B:133:0x023a, B:87:0x01a5, B:89:0x01ae, B:91:0x01bb, B:93:0x01bf, B:95:0x01c3, B:97:0x01c7, B:99:0x01cb, B:101:0x01cf, B:103:0x01db, B:107:0x01e4, B:108:0x01fa, B:110:0x01fe, B:111:0x0201, B:113:0x0205, B:114:0x0208, B:116:0x020c, B:117:0x020f, B:119:0x0213, B:120:0x0216, B:122:0x021a, B:123:0x021d, B:125:0x0221, B:127:0x01e9, B:128:0x01f2), top: B:24:0x006e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a A[Catch: all -> 0x0247, TryCatch #4 {all -> 0x0247, blocks: (B:25:0x006e, B:27:0x007b, B:29:0x009e, B:31:0x00aa, B:34:0x00ae, B:36:0x00b1, B:40:0x00bd, B:38:0x00c1, B:42:0x00c6, B:49:0x00d2, B:53:0x00e2, B:55:0x00fa, B:57:0x0104, B:58:0x0113, B:60:0x011b, B:62:0x0125, B:63:0x0135, B:65:0x013d, B:67:0x0147, B:69:0x015a, B:71:0x0166, B:72:0x0170, B:74:0x017c, B:75:0x0186, B:77:0x018a, B:45:0x0223, B:47:0x022c, B:85:0x0194, B:130:0x019e, B:133:0x023a, B:87:0x01a5, B:89:0x01ae, B:91:0x01bb, B:93:0x01bf, B:95:0x01c3, B:97:0x01c7, B:99:0x01cb, B:101:0x01cf, B:103:0x01db, B:107:0x01e4, B:108:0x01fa, B:110:0x01fe, B:111:0x0201, B:113:0x0205, B:114:0x0208, B:116:0x020c, B:117:0x020f, B:119:0x0213, B:120:0x0216, B:122:0x021a, B:123:0x021d, B:125:0x0221, B:127:0x01e9, B:128:0x01f2), top: B:24:0x006e, inners: #3 }] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        boolean z;
        FileInputStream fileInputStream;
        boolean z2;
        int d;
        int intValue;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String[] split;
        bpb bpbVar = (bpb) u69Var.a;
        ti1 ti1Var = this.e;
        ArrayList arrayList = ti1Var.c;
        bmb i2 = ((hf2) arrayList.get(i)).a.i(((hf2) arrayList.get(i)).c);
        if (i2 != null && i2.b != null && !i2.U && new File(i2.b).exists()) {
            HashMap hashMap = ti1Var.y;
            if (i2.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(i2.b));
                    int i3 = 0;
                    boolean z3 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(f.q3);
                            if (read == -1) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            int i4 = i3;
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i5 >= read) {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                                byte[] bArr = f.q3;
                                if (bArr[i5] == 10) {
                                    int i7 = i5 - i6;
                                    int i8 = i7 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i6, i7, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i2.e = parse.getQueryParameter("slug");
                                            i2.c = usc.d(substring).getAbsolutePath();
                                            String queryParameter4 = parse.getQueryParameter("mode");
                                            if (queryParameter4 != null && (split = queryParameter4.toLowerCase().split(" ")) != null && split.length > 0) {
                                                int i9 = 0;
                                                while (true) {
                                                    if (i9 >= split.length) {
                                                        break;
                                                    }
                                                    String[] strArr = split;
                                                    if ("blur".equals(strArr[i9])) {
                                                        i2.h = true;
                                                        break;
                                                    } else {
                                                        i9++;
                                                        split = strArr;
                                                    }
                                                }
                                            }
                                            if (TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                z2 = z3;
                                            } else {
                                                try {
                                                    queryParameter3 = parse.getQueryParameter("bg_color");
                                                } catch (Exception unused) {
                                                }
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    z2 = z3;
                                                    try {
                                                        i2.r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                                                        if (queryParameter3.length() >= 13 && gm.Q1(queryParameter3.charAt(6))) {
                                                            i2.s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                                                        }
                                                        if (queryParameter3.length() >= 20 && gm.Q1(queryParameter3.charAt(13))) {
                                                            i2.w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                                                        }
                                                        if (queryParameter3.length() == 27 && gm.Q1(queryParameter3.charAt(20))) {
                                                            i2.x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    queryParameter2 = parse.getQueryParameter("rotation");
                                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                                        i2.y = Utilities.z(queryParameter2).intValue();
                                                    }
                                                    queryParameter = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter)) {
                                                        i2.E = Utilities.z(queryParameter).intValue();
                                                    }
                                                    if (i2.E == 0) {
                                                        i2.E = 50;
                                                    }
                                                }
                                                z2 = z3;
                                                queryParameter2 = parse.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                }
                                                queryParameter = parse.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter)) {
                                                }
                                                if (i2.E == 0) {
                                                }
                                            }
                                        } else {
                                            z2 = z3;
                                            if (str.startsWith("WPS")) {
                                                i2.Q = i4 + i8;
                                                z3 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((d = nxe.d(str.substring(0, indexOf))) == cmb.qa || d == cmb.qb || d == cmb.De || d == cmb.Ee || d == cmb.Fe || d == cmb.Ge)) {
                                                String substring2 = str.substring(indexOf + 1);
                                                if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                                    intValue = Utilities.z(substring2).intValue();
                                                } else {
                                                    try {
                                                        intValue = Color.parseColor(substring2);
                                                    } catch (Exception unused3) {
                                                        intValue = Utilities.z(substring2).intValue();
                                                    }
                                                }
                                                if (d == cmb.qa) {
                                                    i2.R = intValue;
                                                } else if (d == cmb.qb) {
                                                    i2.S = intValue;
                                                } else if (d == cmb.De) {
                                                    i2.M = intValue;
                                                } else if (d == cmb.Ee) {
                                                    i2.N = intValue;
                                                } else if (d == cmb.Fe) {
                                                    i2.O = intValue;
                                                } else if (d == cmb.Ge) {
                                                    i2.P = intValue;
                                                }
                                            }
                                        }
                                        i6 += i8;
                                        i4 += i8;
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
                                    z2 = z3;
                                }
                                i5++;
                                fileInputStream2 = fileInputStream;
                                z3 = z2;
                            }
                            if (z3 || i3 == i4) {
                                break;
                            }
                            fileInputStream.getChannel().position(i4);
                            i3 = i4;
                            fileInputStream2 = fileInputStream;
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = fileInputStream2;
                        }
                    }
                    fileInputStream.close();
                } catch (Throwable th5) {
                    fc4.g(th5, true);
                }
                if (i2.c == null || i2.f || new File(i2.c).exists()) {
                    z = true;
                    i2.U = true;
                    hf2 hf2Var = (hf2) arrayList.get(i);
                    bpbVar.setEnabled(z);
                    anb.h(cmb.h5, null, bpbVar);
                    bpbVar.f(hf2Var, 0L, false);
                    bpbVar.g(hf2Var.d, false);
                    bpbVar.setFallbackWallpaper(hf2Var.a.b ? null : ti1Var.w);
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, i2.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i2.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i2.F).sendRequest(getwallpaper, new pm(ti1Var, i2, (byte) 11));
                }
            }
        }
        z = true;
        hf2 hf2Var2 = (hf2) arrayList.get(i);
        bpbVar.setEnabled(z);
        anb.h(cmb.h5, null, bpbVar);
        bpbVar.f(hf2Var2, 0L, false);
        bpbVar.g(hf2Var2.d, false);
        bpbVar.setFallbackWallpaper(hf2Var2.a.b ? null : ti1Var.w);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new b59(new qi1(this.c, 3, this.d, context));
    }

    @Override // y59
    public final void y(u69 u69Var) {
        ti1 ti1Var = this.e;
        ArrayList arrayList = ti1Var.c;
        int b = u69Var.b();
        View view = u69Var.a;
        if (b < 0 || b >= arrayList.size()) {
            return;
        }
        hf2 hf2Var = (hf2) arrayList.get(b);
        bpb bpbVar = (bpb) view;
        bpbVar.g(hf2Var.d, false);
        bpbVar.setFallbackWallpaper(hf2Var.a.b ? null : ti1Var.w);
    }
}
