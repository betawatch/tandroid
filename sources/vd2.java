// default package

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.f;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vd2 extends n39 {
    public final wjb c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final boolean n;
    public final long r;
    public int f = -1;
    public final HashMap s = new HashMap();
    public final HashMap w = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public vd2(int i, long j, wjb wjbVar, int i2) {
        this.n = i2;
        this.r = j;
        this.c = wjbVar;
        this.h = i;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void E(int i) {
        int i2 = this.f;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0) {
            g(i2);
            WeakReference weakReference = this.e;
            anb anbVar = weakReference == null ? null : (anb) weakReference.get();
            if (anbVar != null) {
                anbVar.setSelected(false);
            }
        }
        this.f = i;
        g(i);
    }

    @Override // w39
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:46|47)|(15:49|50|51|(1:55)|56|(1:60)|61|(1:65)|66|67|(1:69)|70|(1:72)|73|(1:75))|83|66|67|(0)|70|(0)|73|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d4, code lost:
    
        if (r10 == r14) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0209 A[Catch: all -> 0x0252, TryCatch #7 {all -> 0x0252, blocks: (B:31:0x022e, B:33:0x0237, B:167:0x0245, B:115:0x01b6, B:132:0x01e6, B:155:0x01ee, B:136:0x0205, B:138:0x0209, B:139:0x020c, B:141:0x0210, B:142:0x0213, B:144:0x0217, B:145:0x021a, B:147:0x021e, B:148:0x0221, B:150:0x0225, B:151:0x0228, B:153:0x022c, B:135:0x01fd, B:157:0x01f3), top: B:166:0x0245, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020c A[Catch: all -> 0x0252, TryCatch #7 {all -> 0x0252, blocks: (B:31:0x022e, B:33:0x0237, B:167:0x0245, B:115:0x01b6, B:132:0x01e6, B:155:0x01ee, B:136:0x0205, B:138:0x0209, B:139:0x020c, B:141:0x0210, B:142:0x0213, B:144:0x0217, B:145:0x021a, B:147:0x021e, B:148:0x0221, B:150:0x0225, B:151:0x0228, B:153:0x022c, B:135:0x01fd, B:157:0x01f3), top: B:166:0x0245, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167 A[Catch: Exception -> 0x0171, all -> 0x01d7, TRY_LEAVE, TryCatch #5 {Exception -> 0x0171, blocks: (B:67:0x015b, B:69:0x0167), top: B:66:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d A[Catch: all -> 0x01d7, TryCatch #10 {all -> 0x01d7, blocks: (B:51:0x00e3, B:53:0x00fb, B:55:0x0105, B:56:0x0114, B:58:0x011c, B:60:0x0126, B:61:0x0136, B:63:0x013e, B:65:0x0148, B:67:0x015b, B:69:0x0167, B:70:0x0171, B:72:0x017d, B:73:0x0187, B:75:0x018b, B:161:0x01a6, B:118:0x01c2, B:120:0x01c6, B:122:0x01ca, B:124:0x01ce, B:126:0x01d2), top: B:50:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b A[Catch: all -> 0x01d7, TRY_LEAVE, TryCatch #10 {all -> 0x01d7, blocks: (B:51:0x00e3, B:53:0x00fb, B:55:0x0105, B:56:0x0114, B:58:0x011c, B:60:0x0126, B:61:0x0136, B:63:0x013e, B:65:0x0148, B:67:0x015b, B:69:0x0167, B:70:0x0171, B:72:0x017d, B:73:0x0187, B:75:0x018b, B:161:0x01a6, B:118:0x01c2, B:120:0x01c6, B:122:0x01ca, B:124:0x01ce, B:126:0x01d2), top: B:50:0x00e3 }] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v31, types: [int] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        FileInputStream fileInputStream;
        byte[] bArr;
        Throwable th;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        anb anbVar = (anb) s49Var.a;
        akb i3 = ((wd2) this.d.get(i)).a.i(((wd2) this.d.get(i)).c);
        if (i3 == null || i3.b == null || i3.U || !new File(i3.b).exists() || i3.b == null) {
            z = false;
        } else {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i3.b));
                int i4 = 0;
                boolean z7 = false;
                while (true) {
                    try {
                        try {
                            int read = fileInputStream2.read(f.q3);
                            if (read == -1) {
                                fileInputStream = fileInputStream2;
                                z4 = false;
                                break;
                            }
                            int i5 = i4;
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                if (i6 >= read) {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                                bArr = f.q3;
                                if (bArr[i6] == '\n') {
                                    int i8 = i6 - i7;
                                    int i9 = i8 + 1;
                                    String str = new String(bArr, i7, i8, "UTF-8");
                                    if (str.startsWith("WLS=")) {
                                        try {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i3.e = parse.getQueryParameter("slug");
                                            i3.c = sqc.d(substring).getAbsolutePath();
                                            String queryParameter4 = parse.getQueryParameter("mode");
                                            if (queryParameter4 != null) {
                                                try {
                                                    String[] split = queryParameter4.toLowerCase().split(" ");
                                                    if (split != null && split.length > 0) {
                                                        int i10 = 0;
                                                        while (true) {
                                                            bArr = split.length;
                                                            if (i10 >= bArr) {
                                                                break;
                                                            }
                                                            bArr = "blur";
                                                            String[] strArr = split;
                                                            if ("blur".equals(strArr[i10])) {
                                                                i3.h = true;
                                                                break;
                                                            } else {
                                                                i10++;
                                                                split = strArr;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    fileInputStream = fileInputStream2;
                                                    z2 = false;
                                                    try {
                                                        fileInputStream.close();
                                                        throw th;
                                                    } catch (Throwable th3) {
                                                        th.addSuppressed(th3);
                                                        throw th;
                                                    }
                                                }
                                            }
                                            if (TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                fileInputStream = fileInputStream2;
                                                bArr = bArr;
                                            } else {
                                                try {
                                                    queryParameter3 = parse.getQueryParameter("bg_color");
                                                } catch (Exception unused) {
                                                }
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    fileInputStream = fileInputStream2;
                                                    bArr = 0;
                                                    try {
                                                        try {
                                                            i3.r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                                                            bArr = 13;
                                                            if (queryParameter3.length() >= 13 && gl.Q1(queryParameter3.charAt(6))) {
                                                                i3.s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter3.length() >= 20 && gl.Q1(queryParameter3.charAt(13))) {
                                                                i3.w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            bArr = 27;
                                                            bArr = 27;
                                                            if (queryParameter3.length() == 27 && gl.Q1(queryParameter3.charAt(20))) {
                                                                bArr = 16;
                                                                i3.x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                        queryParameter2 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            i3.y = Utilities.z(queryParameter2).intValue();
                                                        }
                                                        queryParameter = parse.getQueryParameter("intensity");
                                                        if (!TextUtils.isEmpty(queryParameter)) {
                                                            i3.E = Utilities.z(queryParameter).intValue();
                                                        }
                                                        bArr = bArr;
                                                        if (i3.E == 0) {
                                                            i3.E = 50;
                                                            bArr = bArr;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        th = th;
                                                        z2 = false;
                                                        fileInputStream.close();
                                                        throw th;
                                                    }
                                                }
                                                fileInputStream = fileInputStream2;
                                                queryParameter2 = parse.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                }
                                                queryParameter = parse.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter)) {
                                                }
                                                bArr = bArr;
                                                if (i3.E == 0) {
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fileInputStream = fileInputStream2;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            if (str.startsWith("WPS")) {
                                                i3.Q = i9 + i5;
                                                z7 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            bArr = bArr;
                                            if (indexOf != -1) {
                                                int d = lve.d(str.substring(0, indexOf));
                                                if (d != bkb.qa && d != bkb.qb && d != bkb.De && d != bkb.Ee && d != bkb.Fe) {
                                                    int i11 = bkb.Ge;
                                                    bArr = i11;
                                                }
                                                String substring2 = str.substring(indexOf + 1);
                                                if (substring2.length() > 0) {
                                                    z5 = false;
                                                    bArr = 0;
                                                    z6 = false;
                                                    z6 = false;
                                                    bArr = 0;
                                                    if (substring2.charAt(0) == '#') {
                                                        try {
                                                            i2 = Color.parseColor(substring2);
                                                        } catch (Exception unused3) {
                                                            i2 = Utilities.z(substring2).intValue();
                                                        }
                                                        if (d != bkb.qa) {
                                                            i3.R = i2;
                                                            bArr = z6;
                                                        } else if (d == bkb.qb) {
                                                            i3.S = i2;
                                                            bArr = z6;
                                                        } else if (d == bkb.De) {
                                                            i3.M = i2;
                                                            bArr = z6;
                                                        } else if (d == bkb.Ee) {
                                                            i3.N = i2;
                                                            bArr = z6;
                                                        } else if (d == bkb.Fe) {
                                                            i3.O = i2;
                                                            bArr = z6;
                                                        } else {
                                                            bArr = z6;
                                                            if (d == bkb.Ge) {
                                                                i3.P = i2;
                                                                bArr = z6;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    z5 = false;
                                                }
                                                i2 = Utilities.z(substring2).intValue();
                                                z6 = z5;
                                                if (d != bkb.qa) {
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            bArr = 0;
                                            th = th;
                                            z2 = bArr;
                                            fileInputStream.close();
                                            throw th;
                                        }
                                    }
                                    i7 += i9;
                                    i5 += i9;
                                } else {
                                    fileInputStream = fileInputStream2;
                                }
                                i6++;
                                fileInputStream2 = fileInputStream;
                            }
                            z4 = false;
                            z2 = false;
                            bArr = 0;
                            z4 = false;
                            if (z7 || i4 == i5) {
                                break;
                            }
                            try {
                                fileInputStream.getChannel().position(i5);
                                i4 = i5;
                                fileInputStream2 = fileInputStream;
                            } catch (Throwable th7) {
                                th = th7;
                                th = th;
                                z2 = bArr;
                                fileInputStream.close();
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            fa4.g(th, true);
                            z3 = z2;
                            if (i3.c != null) {
                            }
                            i3.U = true;
                            z = z3;
                            wd2 wd2Var = (wd2) this.d.get(i);
                            wd2 wd2Var2 = anbVar.H;
                            if (wd2Var2 == null) {
                            }
                            anbVar.setFocusable(true);
                            anbVar.setEnabled(true);
                            zkb.h(bkb.h5, null, anbVar);
                            anbVar.f(wd2Var, this.r, r5);
                            boolean z8 = z;
                            if (i == this.f) {
                            }
                            anbVar.g(z8, r5);
                            if (i != this.f) {
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        fileInputStream = fileInputStream2;
                    }
                }
                fileInputStream.close();
                z3 = z4;
            } catch (Throwable th10) {
                th = th10;
                z2 = false;
            }
            if (i3.c != null || i3.f || new File(i3.c).exists()) {
                i3.U = true;
                z = z3;
            } else {
                HashMap hashMap = this.w;
                z = z3;
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, i3.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i3.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i3.F).sendRequest(getwallpaper, new pl(this, i3, (byte) 23));
                    z = z3;
                }
            }
        }
        wd2 wd2Var3 = (wd2) this.d.get(i);
        wd2 wd2Var22 = anbVar.H;
        boolean z9 = (wd2Var22 == null && elb.a(wd2Var22.a.c, wd2Var3.a.c) && !cj3.C4 && anbVar.W == wd2Var3.c) ? true : z ? 1 : 0;
        anbVar.setFocusable(true);
        anbVar.setEnabled(true);
        zkb.h(bkb.h5, null, anbVar);
        anbVar.f(wd2Var3, this.r, z9);
        boolean z82 = z;
        if (i == this.f) {
            z82 = true;
        }
        anbVar.g(z82, z9);
        if (i != this.f) {
            this.e = new WeakReference(anbVar);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new y29(new anb(this.h, this.n ? 1 : 0, this.c, context));
    }
}
