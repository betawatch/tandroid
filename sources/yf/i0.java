package yf;

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
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i0 {
    public static final i0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final w3.b0 d;

    static {
        i0 i0Var = new i0("roboto", "PhotoEditorTypefaceRoboto", new w3.b0((g0) new u3.k(9)));
        e = i0Var;
        f = Arrays.asList(i0Var, new i0("italic", "PhotoEditorTypefaceItalic", new w3.b0((g0) new u3.k(10))), new i0("serif", "PhotoEditorTypefaceSerif", new w3.b0((g0) new u3.k(11))), new i0("condensed", "PhotoEditorTypefaceCondensed", new w3.b0((g0) new u3.k(12))), new i0("mono", "PhotoEditorTypefaceMono", new w3.b0((g0) new u3.k(13))), new i0("mw_bold", "PhotoEditorTypefaceMerriweather", new w3.b0((g0) new u3.k(14))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public i0(String str, String str2, w3.b0 b0Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        if (r7 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        f0 f0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                f0 f0Var2 = null;
                f0Var2 = null;
                f0Var2 = null;
                f0Var2 = null;
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
                                                        h0 h0Var = new h0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(h0Var.b), h0Var);
                                                    }
                                                    f0 f0Var3 = new f0();
                                                    f0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    f0Var3.b = e(randomAccessFile, i12, (h0) hashMap2.get(1));
                                                    f0Var3.c = e(randomAccessFile, i12, (h0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    f0Var2 = f0Var3;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    randomAccessFile2 = randomAccessFile;
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                FileLog.e(e);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            randomAccessFile = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            randomAccessFile.close();
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                    if (f0Var2 != null) {
                        e0 e0Var = (e0) hashMap.get(f0Var2.b);
                        if (e0Var == null) {
                            e0Var = new e0();
                            e0Var.a = new ArrayList();
                            hashMap.put(f0Var2.b, e0Var);
                        }
                        e0Var.a.add(f0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                e0 e0Var2 = (e0) hashMap.get((String) it2.next());
                if (e0Var2 != null) {
                    ArrayList arrayList2 = e0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            f0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((f0) arrayList2.get(i13)).c)) {
                                f0Var = (f0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (f0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                f0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((f0) arrayList2.get(i14)).c)) {
                                    f0Var = (f0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (f0Var == null && !arrayList2.isEmpty()) {
                            f0Var = (f0) arrayList2.get(0);
                        }
                    }
                    if (f0Var != null) {
                        arrayList.add(new i0(f0Var.a, ("Regular".equals(f0Var.c) || TextUtils.isEmpty(f0Var.c)) ? f0Var.b : f0Var.b + " " + f0Var.c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new gf.e(arrayList, 1));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.themeQueue.postRunnable(new tq0(17));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + h0Var.d);
        byte[] bArr = new byte[h0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, h0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        w3.b0 b0Var = this.d;
        if (((Typeface) b0Var.c) == null) {
            b0Var.c = ((g0) b0Var.b).a();
        }
        return (Typeface) b0Var.c;
    }

    public i0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new w3.b0((g0) new t0.c(font, 6));
    }
}
