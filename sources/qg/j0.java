package qg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ji.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.q31;
import org.telegram.ui.sw0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j0 {
    public static final j0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final n7.z0 d;

    static {
        j0 j0Var = new j0("roboto", "PhotoEditorTypefaceRoboto", new n7.z0(new sw0(17)));
        e = j0Var;
        f = Arrays.asList(j0Var, new j0("italic", "PhotoEditorTypefaceItalic", new n7.z0(new sw0(18))), new j0("serif", "PhotoEditorTypefaceSerif", new n7.z0(new sw0(19))), new j0("condensed", "PhotoEditorTypefaceCondensed", new n7.z0(new sw0(20))), new j0("mono", "PhotoEditorTypefaceMono", new n7.z0(new sw0(21))), new j0("mw_bold", "PhotoEditorTypefaceMerriweather", new n7.z0(new sw0(22))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public j0(String str, String str2, n7.z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = z0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        if (r7 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        g0 g0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                g0 g0Var2 = null;
                g0Var2 = null;
                g0Var2 = null;
                g0Var2 = null;
                RandomAccessFile randomAccessFile2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Font next = it.next();
                if (!next.getFile().getName().contains("Noto")) {
                    File file = next.getFile();
                    if (file != null) {
                        try {
                            randomAccessFile = new RandomAccessFile(file, "r");
                            try {
                                try {
                                    int readInt = randomAccessFile.readInt();
                                    if (readInt == 65536 || readInt == 1330926671) {
                                        int readUnsignedShort = randomAccessFile.readUnsignedShort();
                                        randomAccessFile.skipBytes(6);
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < readUnsignedShort) {
                                                int readInt2 = randomAccessFile.readInt();
                                                randomAccessFile.skipBytes(4);
                                                int readInt3 = randomAccessFile.readInt();
                                                randomAccessFile.readInt();
                                                if (readInt2 == 1851878757) {
                                                    randomAccessFile.seek(readInt3 + 2);
                                                    int readUnsignedShort2 = randomAccessFile.readUnsignedShort();
                                                    int readUnsignedShort3 = randomAccessFile.readUnsignedShort();
                                                    HashMap hashMap2 = new HashMap();
                                                    for (int i11 = 0; i11 < readUnsignedShort2; i11++) {
                                                        i0 i0Var = new i0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(i0Var.b), i0Var);
                                                    }
                                                    g0 g0Var3 = new g0();
                                                    g0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    g0Var3.b = e(randomAccessFile, i12, (i0) hashMap2.get(1));
                                                    g0Var3.c = e(randomAccessFile, i12, (i0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    g0Var2 = g0Var3;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    randomAccessFile2 = randomAccessFile;
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                FileLog.e(e);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            randomAccessFile = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            randomAccessFile.close();
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                    if (g0Var2 != null) {
                        f0 f0Var = (f0) hashMap.get(g0Var2.b);
                        if (f0Var == null) {
                            f0Var = new f0();
                            f0Var.a = new ArrayList();
                            hashMap.put(g0Var2.b, f0Var);
                        }
                        f0Var.a.add(g0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                f0 f0Var2 = (f0) hashMap.get((String) it2.next());
                if (f0Var2 != null) {
                    ArrayList arrayList2 = f0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            g0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((g0) arrayList2.get(i13)).c)) {
                                g0Var = (g0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (g0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                g0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((g0) arrayList2.get(i14)).c)) {
                                    g0Var = (g0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (g0Var == null && !arrayList2.isEmpty()) {
                            g0Var = (g0) arrayList2.get(0);
                        }
                    }
                    if (g0Var != null) {
                        arrayList.add(new j0(g0Var.a, ("Regular".equals(g0Var.c) || TextUtils.isEmpty(g0Var.c)) ? g0Var.b : g0Var.b + " " + g0Var.c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new e0(arrayList, 0));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.themeQueue.postRunnable(new q31(9));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, i0 i0Var) {
        if (i0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + i0Var.d);
        byte[] bArr = new byte[i0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, i0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        n7.z0 z0Var = this.d;
        if (((Typeface) z0Var.c) == null) {
            z0Var.c = ((h0) z0Var.b).a();
        }
        return (Typeface) z0Var.c;
    }

    public j0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new n7.z0(new k5(font, 17));
    }
}
