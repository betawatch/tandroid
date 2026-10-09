package pg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.a80;
import org.telegram.ui.t21;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k0 {
    public static final k0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final b5 d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new b5(new a80(27)));
        e = k0Var;
        f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new b5(new a80(28))), new k0("serif", "PhotoEditorTypefaceSerif", new b5(new a80(29))), new k0("condensed", "PhotoEditorTypefaceCondensed", new b5(new e0(0))), new k0("mono", "PhotoEditorTypefaceMono", new b5(new e0(1))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new b5(new e0(2))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, b5 b5Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = b5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        if (r7 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        h0 h0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                h0 h0Var2 = null;
                h0Var2 = null;
                h0Var2 = null;
                h0Var2 = null;
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
                                                        j0 j0Var = new j0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(j0Var.b), j0Var);
                                                    }
                                                    h0 h0Var3 = new h0();
                                                    h0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    h0Var3.b = e(randomAccessFile, i12, (j0) hashMap2.get(1));
                                                    h0Var3.c = e(randomAccessFile, i12, (j0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    h0Var2 = h0Var3;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    FileLog.e(e);
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
                    if (h0Var2 != null) {
                        g0 g0Var = (g0) hashMap.get(h0Var2.b);
                        if (g0Var == null) {
                            g0Var = new g0();
                            g0Var.a = new ArrayList();
                            hashMap.put(h0Var2.b, g0Var);
                        }
                        g0Var.a.add(h0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                g0 g0Var2 = (g0) hashMap.get((String) it2.next());
                if (g0Var2 != null) {
                    ArrayList arrayList2 = g0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            h0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((h0) arrayList2.get(i13)).c)) {
                                h0Var = (h0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (h0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                h0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((h0) arrayList2.get(i14)).c)) {
                                    h0Var = (h0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (h0Var == null && !arrayList2.isEmpty()) {
                            h0Var = (h0) arrayList2.get(0);
                        }
                    }
                    if (h0Var != null) {
                        arrayList.add(new k0(h0Var.a, ("Regular".equals(h0Var.c) || TextUtils.isEmpty(h0Var.c)) ? h0Var.b : h0Var.b + " " + h0Var.c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new f0(arrayList, 0));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.themeQueue.postRunnable(new t21(12));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, j0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        b5 b5Var = this.d;
        if (((Typeface) b5Var.c) == null) {
            b5Var.c = ((i0) b5Var.b).a();
        }
        return (Typeface) b5Var.c;
    }

    public k0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new b5(new m4.w(font, 17));
    }
}
