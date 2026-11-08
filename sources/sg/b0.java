package sg;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.o61;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class b0 {
    public static final b0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final m4.d0 d;

    static {
        boolean z9 = false;
        b0 b0Var = new b0("roboto", "PhotoEditorTypefaceRoboto", new m4.d0(new s0.b(10), z9));
        e = b0Var;
        f = Arrays.asList(b0Var, new b0("italic", "PhotoEditorTypefaceItalic", new m4.d0(new s0.b(11), z9)), new b0("serif", "PhotoEditorTypefaceSerif", new m4.d0(new s0.b(12), z9)), new b0("condensed", "PhotoEditorTypefaceCondensed", new m4.d0(new s0.b(13), z9)), new b0("mono", "PhotoEditorTypefaceMono", new m4.d0(new s0.b(14), z9)), new b0("mw_bold", "PhotoEditorTypefaceMerriweather", new m4.d0(new s0.b(15), z9)));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public b0(String str, String str2, m4.d0 d0Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        if (r8 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        y yVar;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                y yVar2 = null;
                yVar2 = null;
                yVar2 = null;
                yVar2 = null;
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
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 < readUnsignedShort) {
                                                int readInt2 = randomAccessFile.readInt();
                                                randomAccessFile.skipBytes(4);
                                                int readInt3 = randomAccessFile.readInt();
                                                randomAccessFile.readInt();
                                                if (readInt2 == 1851878757) {
                                                    randomAccessFile.seek(readInt3 + 2);
                                                    int readUnsignedShort2 = randomAccessFile.readUnsignedShort();
                                                    int readUnsignedShort3 = randomAccessFile.readUnsignedShort();
                                                    HashMap hashMap2 = new HashMap();
                                                    for (int i10 = 0; i10 < readUnsignedShort2; i10++) {
                                                        a0 a0Var = new a0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(a0Var.b), a0Var);
                                                    }
                                                    y yVar3 = new y();
                                                    yVar3.a = next;
                                                    int i11 = readInt3 + readUnsignedShort3;
                                                    yVar3.b = e(randomAccessFile, i11, (a0) hashMap2.get(1));
                                                    yVar3.c = e(randomAccessFile, i11, (a0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    yVar2 = yVar3;
                                                } else {
                                                    i7++;
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
                            } catch (Exception e10) {
                                e = e10;
                                a8.g(e, true);
                            }
                        } catch (Exception e11) {
                            e = e11;
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
                    if (yVar2 != null) {
                        x xVar = (x) hashMap.get(yVar2.b);
                        if (xVar == null) {
                            xVar = new x();
                            xVar.a = new ArrayList();
                            hashMap.put(yVar2.b, xVar);
                        }
                        xVar.a.add(yVar2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                x xVar2 = (x) hashMap.get((String) it2.next());
                if (xVar2 != null) {
                    ArrayList arrayList2 = xVar2.a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            yVar = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((y) arrayList2.get(i12)).c)) {
                                yVar = (y) arrayList2.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                    if (yVar == null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                yVar = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((y) arrayList2.get(i13)).c)) {
                                    yVar = (y) arrayList2.get(i13);
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (yVar == null && !arrayList2.isEmpty()) {
                            yVar = (y) arrayList2.get(0);
                        }
                    }
                    if (yVar != null) {
                        arrayList.add(new b0(yVar.a, ("Regular".equals(yVar.c) || TextUtils.isEmpty(yVar.c)) ? yVar.b : yVar.b + " " + yVar.c));
                    }
                }
            }
        }
        org.telegram.messenger.g0.h3(new bg.e(1, arrayList));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.i.c(new o61(15));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        randomAccessFile.seek(i7 + a0Var.d);
        byte[] bArr = new byte[a0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, a0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        m4.d0 d0Var = this.d;
        if (((Typeface) d0Var.b) == null) {
            d0Var.b = ((z) d0Var.a).a();
        }
        return (Typeface) d0Var.b;
    }

    public b0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new m4.d0((Object) new m3(font, 16), false);
    }
}
