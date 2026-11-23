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
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a0 {
    public static final a0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final ji.l d;

    static {
        int i7 = 28;
        a0 a0Var = new a0("roboto", "PhotoEditorTypefaceRoboto", new ji.l(new r0.f1(18), i7));
        e = a0Var;
        f = Arrays.asList(a0Var, new a0("italic", "PhotoEditorTypefaceItalic", new ji.l(new r0.f1(19), i7)), new a0("serif", "PhotoEditorTypefaceSerif", new ji.l(new r0.f1(20), i7)), new a0("condensed", "PhotoEditorTypefaceCondensed", new ji.l(new r0.f1(21), i7)), new a0("mono", "PhotoEditorTypefaceMono", new ji.l(new r0.f1(22), i7)), new a0("mw_bold", "PhotoEditorTypefaceMerriweather", new ji.l(new r0.f1(23), i7)));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public a0(String str, String str2, ji.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        if (r8 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        x xVar;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                x xVar2 = null;
                xVar2 = null;
                xVar2 = null;
                xVar2 = null;
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
                                                        z zVar = new z(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(zVar.b), zVar);
                                                    }
                                                    x xVar3 = new x();
                                                    xVar3.a = next;
                                                    int i11 = readInt3 + readUnsignedShort3;
                                                    xVar3.b = e(randomAccessFile, i11, (z) hashMap2.get(1));
                                                    xVar3.c = e(randomAccessFile, i11, (z) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    xVar2 = xVar3;
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
                    if (xVar2 != null) {
                        w wVar = (w) hashMap.get(xVar2.b);
                        if (wVar == null) {
                            wVar = new w();
                            wVar.a = new ArrayList();
                            hashMap.put(xVar2.b, wVar);
                        }
                        wVar.a.add(xVar2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                w wVar2 = (w) hashMap.get((String) it2.next());
                if (wVar2 != null) {
                    ArrayList arrayList2 = wVar2.a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            xVar = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((x) arrayList2.get(i12)).c)) {
                                xVar = (x) arrayList2.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                    if (xVar == null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                xVar = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((x) arrayList2.get(i13)).c)) {
                                    xVar = (x) arrayList2.get(i13);
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (xVar == null && !arrayList2.isEmpty()) {
                            xVar = (x) arrayList2.get(0);
                        }
                    }
                    if (xVar != null) {
                        arrayList.add(new a0(xVar.a, ("Regular".equals(xVar.c) || TextUtils.isEmpty(xVar.c)) ? xVar.b : xVar.b + " " + xVar.c));
                    }
                }
            }
        }
        org.telegram.messenger.g0.g3(new bg.e(1, arrayList));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.i.c(new cd0(22));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, z zVar) {
        if (zVar == null) {
            return null;
        }
        randomAccessFile.seek(i7 + zVar.d);
        byte[] bArr = new byte[zVar.c];
        randomAccessFile.read(bArr);
        return new String(bArr, zVar.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        ji.l lVar = this.d;
        if (((Typeface) lVar.c) == null) {
            lVar.c = ((y) lVar.b).a();
        }
        return (Typeface) lVar.c;
    }

    public a0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new ji.l(new org.telegram.tgnet.u(font, 23), 28);
    }
}
