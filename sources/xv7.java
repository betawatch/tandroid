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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xv7 {
    public static final xv7 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final um4 d;

    static {
        xv7 xv7Var = new xv7("roboto", "PhotoEditorTypefaceRoboto", new um4((vv7) new ku7((byte) 2)));
        e = xv7Var;
        f = Arrays.asList(xv7Var, new xv7("italic", "PhotoEditorTypefaceItalic", new um4((vv7) new ku7((byte) 3))), new xv7("serif", "PhotoEditorTypefaceSerif", new um4((vv7) new ku7((byte) 4))), new xv7("condensed", "PhotoEditorTypefaceCondensed", new um4((vv7) new ku7((byte) 5))), new xv7("mono", "PhotoEditorTypefaceMono", new um4((vv7) new ku7((byte) 6))), new xv7("mw_bold", "PhotoEditorTypefaceMerriweather", new um4((vv7) new ku7((byte) 7))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public xv7(final Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new um4(new vv7() { // from class: sv7
            @Override // vv7
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
            Utilities.i.c(new pg6((byte) 11));
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
        uv7 uv7Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                uv7 uv7Var2 = null;
                uv7Var2 = null;
                uv7Var2 = null;
                uv7Var2 = null;
                RandomAccessFile randomAccessFile2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Font e2 = ku7.e(it.next());
                if (!e2.getFile().getName().contains("Noto")) {
                    File file = e2.getFile();
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
                                                        wv7 wv7Var = new wv7(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(wv7Var.b), wv7Var);
                                                    }
                                                    uv7 uv7Var3 = new uv7();
                                                    uv7Var3.a = e2;
                                                    int i4 = readInt3 + readUnsignedShort3;
                                                    uv7Var3.b = e(randomAccessFile, i4, (wv7) hashMap2.get(1));
                                                    uv7Var3.c = e(randomAccessFile, i4, (wv7) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    uv7Var2 = uv7Var3;
                                                } else {
                                                    i2++;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    cc4.g(e, true);
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
                        } catch (Exception e4) {
                            e = e4;
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
                    if (uv7Var2 != null) {
                        tv7 tv7Var = (tv7) hashMap.get(uv7Var2.b);
                        if (tv7Var == null) {
                            tv7Var = new tv7();
                            tv7Var.a = new ArrayList();
                            hashMap.put(uv7Var2.b, tv7Var);
                        }
                        tv7Var.a.add(uv7Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                tv7 tv7Var2 = (tv7) hashMap.get((String) it2.next());
                if (tv7Var2 != null) {
                    ArrayList arrayList2 = tv7Var2.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            uv7Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((uv7) arrayList2.get(i5)).c)) {
                                uv7Var = (uv7) arrayList2.get(i5);
                                break;
                            }
                            i5++;
                        }
                    }
                    if (uv7Var == null) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList2.size()) {
                                uv7Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((uv7) arrayList2.get(i6)).c)) {
                                    uv7Var = (uv7) arrayList2.get(i6);
                                    break;
                                }
                                i6++;
                            }
                        }
                        if (uv7Var == null && !arrayList2.isEmpty()) {
                            uv7Var = (uv7) arrayList2.get(0);
                        }
                    }
                    if (uv7Var != null) {
                        arrayList.add(new xv7(uv7Var.a, ("Regular".equals(uv7Var.c) || TextUtils.isEmpty(uv7Var.c)) ? uv7Var.b : uv7Var.b + " " + uv7Var.c));
                    }
                }
            }
        }
        hl.c3(new se(arrayList, (byte) 8));
    }

    public static String e(RandomAccessFile randomAccessFile, int i2, wv7 wv7Var) {
        if (wv7Var == null) {
            return null;
        }
        randomAccessFile.seek(i2 + wv7Var.d);
        byte[] bArr = new byte[wv7Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, wv7Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface b() {
        um4 um4Var = this.d;
        Typeface typeface = (Typeface) um4Var.c;
        if (typeface != null) {
            return typeface;
        }
        Typeface a = ((vv7) um4Var.b).a();
        um4Var.c = a;
        return a;
    }

    public xv7(String str, String str2, um4 um4Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = um4Var;
    }
}
