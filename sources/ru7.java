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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ru7 {
    public static final ru7 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final wm4 d;

    static {
        ru7 ru7Var = new ru7("roboto", "PhotoEditorTypefaceRoboto", new wm4((pu7) new bh7((byte) 16)));
        e = ru7Var;
        f = Arrays.asList(ru7Var, new ru7("italic", "PhotoEditorTypefaceItalic", new wm4((pu7) new bh7((byte) 17))), new ru7("serif", "PhotoEditorTypefaceSerif", new wm4((pu7) new bh7((byte) 18))), new ru7("condensed", "PhotoEditorTypefaceCondensed", new wm4((pu7) new bh7((byte) 19))), new ru7("mono", "PhotoEditorTypefaceMono", new wm4((pu7) new bh7((byte) 20))), new ru7("mw_bold", "PhotoEditorTypefaceMerriweather", new wm4((pu7) new bh7((byte) 21))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public ru7(final Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new wm4(new pu7() { // from class: mu7
            @Override // pu7
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
            Utilities.i.c(new bo6((byte) 8));
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
        ou7 ou7Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                ou7 ou7Var2 = null;
                ou7Var2 = null;
                ou7Var2 = null;
                ou7Var2 = null;
                RandomAccessFile randomAccessFile2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Font i2 = bh7.i(it.next());
                if (!i2.getFile().getName().contains("Noto")) {
                    File file = i2.getFile();
                    if (file != null) {
                        try {
                            randomAccessFile = new RandomAccessFile(file, "r");
                            try {
                                try {
                                    int readInt = randomAccessFile.readInt();
                                    if (readInt == 65536 || readInt == 1330926671) {
                                        int readUnsignedShort = randomAccessFile.readUnsignedShort();
                                        randomAccessFile.skipBytes(6);
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < readUnsignedShort) {
                                                int readInt2 = randomAccessFile.readInt();
                                                randomAccessFile.skipBytes(4);
                                                int readInt3 = randomAccessFile.readInt();
                                                randomAccessFile.readInt();
                                                if (readInt2 == 1851878757) {
                                                    randomAccessFile.seek(readInt3 + 2);
                                                    int readUnsignedShort2 = randomAccessFile.readUnsignedShort();
                                                    int readUnsignedShort3 = randomAccessFile.readUnsignedShort();
                                                    HashMap hashMap2 = new HashMap();
                                                    for (int i4 = 0; i4 < readUnsignedShort2; i4++) {
                                                        qu7 qu7Var = new qu7(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(qu7Var.b), qu7Var);
                                                    }
                                                    ou7 ou7Var3 = new ou7();
                                                    ou7Var3.a = i2;
                                                    int i5 = readInt3 + readUnsignedShort3;
                                                    ou7Var3.b = e(randomAccessFile, i5, (qu7) hashMap2.get(1));
                                                    ou7Var3.c = e(randomAccessFile, i5, (qu7) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    ou7Var2 = ou7Var3;
                                                } else {
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    fc4.g(e, true);
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
                    if (ou7Var2 != null) {
                        nu7 nu7Var = (nu7) hashMap.get(ou7Var2.b);
                        if (nu7Var == null) {
                            nu7Var = new nu7();
                            nu7Var.a = new ArrayList();
                            hashMap.put(ou7Var2.b, nu7Var);
                        }
                        nu7Var.a.add(ou7Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                nu7 nu7Var2 = (nu7) hashMap.get((String) it2.next());
                if (nu7Var2 != null) {
                    ArrayList arrayList2 = nu7Var2.a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            ou7Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((ou7) arrayList2.get(i6)).c)) {
                                ou7Var = (ou7) arrayList2.get(i6);
                                break;
                            }
                            i6++;
                        }
                    }
                    if (ou7Var == null) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList2.size()) {
                                ou7Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((ou7) arrayList2.get(i7)).c)) {
                                    ou7Var = (ou7) arrayList2.get(i7);
                                    break;
                                }
                                i7++;
                            }
                        }
                        if (ou7Var == null && !arrayList2.isEmpty()) {
                            ou7Var = (ou7) arrayList2.get(0);
                        }
                    }
                    if (ou7Var != null) {
                        arrayList.add(new ru7(ou7Var.a, ("Regular".equals(ou7Var.c) || TextUtils.isEmpty(ou7Var.c)) ? ou7Var.b : ou7Var.b + " " + ou7Var.c));
                    }
                }
            }
        }
        gm.c3(new sf(arrayList, (byte) 8));
    }

    public static String e(RandomAccessFile randomAccessFile, int i2, qu7 qu7Var) {
        if (qu7Var == null) {
            return null;
        }
        randomAccessFile.seek(i2 + qu7Var.d);
        byte[] bArr = new byte[qu7Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, qu7Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface b() {
        wm4 wm4Var = this.d;
        Typeface typeface = (Typeface) wm4Var.c;
        if (typeface != null) {
            return typeface;
        }
        Typeface a = ((pu7) wm4Var.b).a();
        wm4Var.c = a;
        return a;
    }

    public ru7(String str, String str2, wm4 wm4Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = wm4Var;
    }
}
