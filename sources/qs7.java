// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qs7 {
    public static final qs7 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final wk4 d;

    static {
        qs7 qs7Var = new qs7("roboto", "PhotoEditorTypefaceRoboto", new wk4((os7) new fi7((byte) 14)));
        e = qs7Var;
        f = Arrays.asList(qs7Var, new qs7("italic", "PhotoEditorTypefaceItalic", new wk4((os7) new fi7((byte) 15))), new qs7("serif", "PhotoEditorTypefaceSerif", new wk4((os7) new fi7((byte) 16))), new qs7("condensed", "PhotoEditorTypefaceCondensed", new wk4((os7) new fi7((byte) 17))), new qs7("mono", "PhotoEditorTypefaceMono", new wk4((os7) new fi7((byte) 18))), new qs7("mw_bold", "PhotoEditorTypefaceMerriweather", new wk4((os7) new fi7((byte) 19))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public qs7(final Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new wk4(new os7() { // from class: ls7
            @Override // os7
            public final Typeface a() {
                Typeface createFromFile;
                createFromFile = Typeface.createFromFile(font.getFile());
                return createFromFile;
            }
        });
    }

    public static List a() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.i.c(new am6((byte) 8));
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if (r8 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c() {
        ns7 ns7Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                ns7 ns7Var2 = null;
                ns7Var2 = null;
                ns7Var2 = null;
                ns7Var2 = null;
                RandomAccessFile randomAccessFile2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Font f2 = fi7.f(it.next());
                if (!f2.getFile().getName().contains("Noto")) {
                    File file = f2.getFile();
                    if (file != null) {
                        try {
                            randomAccessFile = new RandomAccessFile(file, "r");
                            try {
                                try {
                                    int readInt = randomAccessFile.readInt();
                                    if (readInt == 65536 || readInt == 1330926671) {
                                        int readUnsignedShort = randomAccessFile.readUnsignedShort();
                                        randomAccessFile.skipBytes(6);
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < readUnsignedShort) {
                                                int readInt2 = randomAccessFile.readInt();
                                                randomAccessFile.skipBytes(4);
                                                int readInt3 = randomAccessFile.readInt();
                                                randomAccessFile.readInt();
                                                if (readInt2 == 1851878757) {
                                                    randomAccessFile.seek(readInt3 + 2);
                                                    int readUnsignedShort2 = randomAccessFile.readUnsignedShort();
                                                    int readUnsignedShort3 = randomAccessFile.readUnsignedShort();
                                                    HashMap hashMap2 = new HashMap();
                                                    for (int i3 = 0; i3 < readUnsignedShort2; i3++) {
                                                        ps7 ps7Var = new ps7(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(ps7Var.b), ps7Var);
                                                    }
                                                    ns7 ns7Var3 = new ns7();
                                                    ns7Var3.a = f2;
                                                    int i4 = readInt3 + readUnsignedShort3;
                                                    ns7Var3.b = e(randomAccessFile, i4, (ps7) hashMap2.get(1));
                                                    ns7Var3.c = e(randomAccessFile, i4, (ps7) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    ns7Var2 = ns7Var3;
                                                } else {
                                                    i2++;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    fa4.g(e, true);
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
                        } catch (Exception e3) {
                            e = e3;
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
                    if (ns7Var2 != null) {
                        ms7 ms7Var = (ms7) hashMap.get(ns7Var2.b);
                        if (ms7Var == null) {
                            ms7Var = new ms7();
                            ms7Var.a = new ArrayList();
                            hashMap.put(ns7Var2.b, ms7Var);
                        }
                        ms7Var.a.add(ns7Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                ms7 ms7Var2 = (ms7) hashMap.get((String) it2.next());
                if (ms7Var2 != null) {
                    ArrayList arrayList2 = ms7Var2.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            ns7Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((ns7) arrayList2.get(i5)).c)) {
                                ns7Var = (ns7) arrayList2.get(i5);
                                break;
                            }
                            i5++;
                        }
                    }
                    if (ns7Var == null) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList2.size()) {
                                ns7Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((ns7) arrayList2.get(i6)).c)) {
                                    ns7Var = (ns7) arrayList2.get(i6);
                                    break;
                                }
                                i6++;
                            }
                        }
                        if (ns7Var == null && !arrayList2.isEmpty()) {
                            ns7Var = (ns7) arrayList2.get(0);
                        }
                    }
                    if (ns7Var != null) {
                        arrayList.add(new qs7(ns7Var.a, ("Regular".equals(ns7Var.c) || TextUtils.isEmpty(ns7Var.c)) ? ns7Var.b : ns7Var.b + " " + ns7Var.c));
                    }
                }
            }
        }
        gl.d3(new se(arrayList, (byte) 8));
    }

    public static String e(RandomAccessFile randomAccessFile, int i2, ps7 ps7Var) {
        if (ps7Var == null) {
            return null;
        }
        randomAccessFile.seek(i2 + ps7Var.d);
        byte[] bArr = new byte[ps7Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, ps7Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface b() {
        wk4 wk4Var = this.d;
        Typeface typeface = (Typeface) wk4Var.c;
        if (typeface != null) {
            return typeface;
        }
        Typeface a = ((os7) wk4Var.b).a();
        wk4Var.c = a;
        return a;
    }

    public qs7(String str, String str2, wk4 wk4Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = wk4Var;
    }
}
