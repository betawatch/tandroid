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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.hk0;
import org.telegram.ui.mj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class l0 {
    public static final l0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final n2.e d;

    static {
        l0 l0Var = new l0("roboto", "PhotoEditorTypefaceRoboto", new n2.e(new hk0(25)));
        e = l0Var;
        f = Arrays.asList(l0Var, new l0("italic", "PhotoEditorTypefaceItalic", new n2.e(new hk0(26))), new l0("serif", "PhotoEditorTypefaceSerif", new n2.e(new hk0(27))), new l0("condensed", "PhotoEditorTypefaceCondensed", new n2.e(new hk0(28))), new l0("mono", "PhotoEditorTypefaceMono", new n2.e(new hk0(29))), new l0("mw_bold", "PhotoEditorTypefaceMerriweather", new n2.e(new e0(0))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public l0(String str, String str2, n2.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        if (r7 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        i0 i0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                i0 i0Var2 = null;
                i0Var2 = null;
                i0Var2 = null;
                i0Var2 = null;
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
                                                        k0 k0Var = new k0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(k0Var.b), k0Var);
                                                    }
                                                    i0 i0Var3 = new i0();
                                                    i0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    i0Var3.b = e(randomAccessFile, i12, (k0) hashMap2.get(1));
                                                    i0Var3.c = e(randomAccessFile, i12, (k0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    i0Var2 = i0Var3;
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
                    if (i0Var2 != null) {
                        h0 h0Var = (h0) hashMap.get(i0Var2.b);
                        if (h0Var == null) {
                            h0Var = new h0();
                            h0Var.a = new ArrayList();
                            hashMap.put(i0Var2.b, h0Var);
                        }
                        h0Var.a.add(i0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                h0 h0Var2 = (h0) hashMap.get((String) it2.next());
                if (h0Var2 != null) {
                    ArrayList arrayList2 = h0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            i0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((i0) arrayList2.get(i13)).c)) {
                                i0Var = (i0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                i0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((i0) arrayList2.get(i14)).c)) {
                                    i0Var = (i0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (i0Var == null && !arrayList2.isEmpty()) {
                            i0Var = (i0) arrayList2.get(0);
                        }
                    }
                    if (i0Var != null) {
                        arrayList.add(new l0(i0Var.a, ("Regular".equals(i0Var.c) || TextUtils.isEmpty(i0Var.c)) ? i0Var.b : i0Var.b + " " + i0Var.c));
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
            Utilities.themeQueue.postRunnable(new mj0(15));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + k0Var.d);
        byte[] bArr = new byte[k0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, k0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        n2.e eVar = this.d;
        if (((Typeface) eVar.c) == null) {
            eVar.c = ((j0) eVar.b).a();
        }
        return (Typeface) eVar.c;
    }

    public l0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new n2.e(new g0(font, 0));
    }
}
