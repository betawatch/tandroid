// default package

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ugd {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(ze3[] ze3VarArr, byte[] bArr) {
        int i = 0;
        for (ze3 ze3Var : ze3VarArr) {
            i += ((((ze3Var.g << 1) + 7) & (-8)) / 8) + b(bArr, ze3Var.a, ze3Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + (ze3Var.e << 1) + ze3Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, bhd.c)) {
            for (ze3 ze3Var2 : ze3VarArr) {
                j(byteArrayOutputStream, ze3Var2, b(bArr, ze3Var2.a, ze3Var2.b));
                l(byteArrayOutputStream, ze3Var2);
                int[] iArr = ze3Var2.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    bke.f(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                k(byteArrayOutputStream, ze3Var2);
            }
        } else {
            for (ze3 ze3Var3 : ze3VarArr) {
                j(byteArrayOutputStream, ze3Var3, b(bArr, ze3Var3.a, ze3Var3.b));
            }
            for (ze3 ze3Var4 : ze3VarArr) {
                l(byteArrayOutputStream, ze3Var4);
                int[] iArr2 = ze3Var4.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    bke.f(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                k(byteArrayOutputStream, ze3Var4);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = bhd.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = bhd.d;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return c00.k(new StringBuilder(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) bke.d(2, byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static ze3[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, ze3[] ze3VarArr) {
        byte[] bArr3 = bhd.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, bhd.g)) {
                grb.i("Unsupported meta version");
                return null;
            }
            int d = (int) bke.d(2, fileInputStream);
            byte[] c = bke.c(fileInputStream, (int) bke.d(4, fileInputStream), (int) bke.d(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                grb.i("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
            try {
                ze3[] f = f(byteArrayInputStream, bArr2, d, ze3VarArr);
                byteArrayInputStream.close();
                return f;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(bhd.a, bArr2)) {
            grb.i("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            grb.i("Unsupported meta version");
            return null;
        }
        int d2 = (int) bke.d(1, fileInputStream);
        byte[] c2 = bke.c(fileInputStream, (int) bke.d(4, fileInputStream), (int) bke.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            grb.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
        try {
            ze3[] e = e(byteArrayInputStream2, d2, ze3VarArr);
            byteArrayInputStream2.close();
            return e;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static ze3[] e(ByteArrayInputStream byteArrayInputStream, int i, ze3[] ze3VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new ze3[0];
        }
        if (i != ze3VarArr.length) {
            grb.i("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int d = (int) bke.d(2, byteArrayInputStream);
            iArr[i2] = (int) bke.d(2, byteArrayInputStream);
            strArr[i2] = new String(bke.b(d, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            ze3 ze3Var = ze3VarArr[i3];
            if (!ze3Var.b.equals(strArr[i3])) {
                grb.i("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            ze3Var.e = i4;
            ze3Var.h = c(byteArrayInputStream, i4);
        }
        return ze3VarArr;
    }

    public static ze3[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, ze3[] ze3VarArr) {
        ze3 ze3Var;
        if (byteArrayInputStream.available() == 0) {
            return new ze3[0];
        }
        if (i != ze3VarArr.length) {
            grb.i("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            bke.d(2, byteArrayInputStream);
            String str = new String(bke.b((int) bke.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long d = bke.d(4, byteArrayInputStream);
            int d2 = (int) bke.d(2, byteArrayInputStream);
            if (ze3VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < ze3VarArr.length; i3++) {
                    if (ze3VarArr[i3].b.equals(substring)) {
                        ze3Var = ze3VarArr[i3];
                        break;
                    }
                }
            }
            ze3Var = null;
            if (ze3Var == null) {
                grb.i("Missing profile key: ".concat(str));
                return null;
            }
            ze3Var.d = d;
            int[] c = c(byteArrayInputStream, d2);
            if (Arrays.equals(bArr, bhd.e)) {
                ze3Var.e = d2;
                ze3Var.h = c;
            }
        }
        return ze3VarArr;
    }

    public static ze3[] g(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, bhd.b)) {
            grb.i("Unsupported version");
            return null;
        }
        int d = (int) bke.d(1, fileInputStream);
        byte[] c = bke.c(fileInputStream, (int) bke.d(4, fileInputStream), (int) bke.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            grb.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
        try {
            ze3[] h = h(byteArrayInputStream, str, d);
            byteArrayInputStream.close();
            return h;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static ze3[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new ze3[0];
        }
        ze3[] ze3VarArr = new ze3[i];
        for (int i3 = 0; i3 < i; i3++) {
            int d = (int) bke.d(2, byteArrayInputStream);
            int d2 = (int) bke.d(2, byteArrayInputStream);
            ze3VarArr[i3] = new ze3(str, new String(bke.b(d, byteArrayInputStream), StandardCharsets.UTF_8), bke.d(4, byteArrayInputStream), d2, (int) bke.d(4, byteArrayInputStream), (int) bke.d(4, byteArrayInputStream), new int[d2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            ze3 ze3Var = ze3VarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = ze3Var.f;
            int i6 = ze3Var.g;
            TreeMap treeMap = ze3Var.i;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) bke.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i8), 1);
                int d3 = (int) bke.d(2, byteArrayInputStream);
                while (d3 > 0) {
                    bke.d(2, byteArrayInputStream);
                    int d4 = (int) bke.d(1, byteArrayInputStream);
                    if (d4 != 6 && d4 != 7) {
                        while (d4 > 0) {
                            bke.d(1, byteArrayInputStream);
                            int i9 = i2;
                            int i10 = i4;
                            for (int d5 = (int) bke.d(1, byteArrayInputStream); d5 > 0; d5--) {
                                bke.d(2, byteArrayInputStream);
                            }
                            d4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    d3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                grb.i("Read too much data during profile line parse");
                return null;
            }
            ze3Var.h = c(byteArrayInputStream, ze3Var.e);
            BitSet valueOf = BitSet.valueOf(bke.b((((i6 << 1) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() | i14));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return ze3VarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, ze3[] ze3VarArr) {
        int i;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = bhd.a;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = bhd.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a2 = a(ze3VarArr, bArr3);
                bke.e(byteArrayOutputStream, ze3VarArr.length, 1);
                bke.e(byteArrayOutputStream, a2.length, 4);
                byte[] a3 = bke.a(a2);
                bke.e(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = bhd.d;
            if (Arrays.equals(bArr, bArr4)) {
                bke.e(byteArrayOutputStream, ze3VarArr.length, 1);
                for (ze3 ze3Var : ze3VarArr) {
                    int size = ze3Var.i.size() << 2;
                    String b2 = b(bArr4, ze3Var.a, ze3Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    bke.f(byteArrayOutputStream, b2.getBytes(charset).length);
                    bke.f(byteArrayOutputStream, ze3Var.h.length);
                    bke.e(byteArrayOutputStream, size, 4);
                    bke.e(byteArrayOutputStream, ze3Var.c, 4);
                    byteArrayOutputStream.write(b2.getBytes(charset));
                    Iterator it = ze3Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        bke.f(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        bke.f(byteArrayOutputStream, 0);
                    }
                    for (int i3 : ze3Var.h) {
                        bke.f(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = bhd.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a4 = a(ze3VarArr, bArr5);
                bke.e(byteArrayOutputStream, ze3VarArr.length, 1);
                bke.e(byteArrayOutputStream, a4.length, 4);
                byte[] a5 = bke.a(a4);
                bke.e(byteArrayOutputStream, a5.length, 4);
                byteArrayOutputStream.write(a5);
                return true;
            }
            byte[] bArr6 = bhd.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            bke.f(byteArrayOutputStream, ze3VarArr.length);
            for (ze3 ze3Var2 : ze3VarArr) {
                String str = ze3Var2.a;
                TreeMap treeMap = ze3Var2.i;
                String b3 = b(bArr6, str, ze3Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                bke.f(byteArrayOutputStream, b3.getBytes(charset2).length);
                bke.f(byteArrayOutputStream, treeMap.size());
                bke.f(byteArrayOutputStream, ze3Var2.h.length);
                bke.e(byteArrayOutputStream, ze3Var2.c, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    bke.f(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : ze3Var2.h) {
                    bke.f(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            bke.f(byteArrayOutputStream2, ze3VarArr.length);
            int i5 = 2;
            for (ze3 ze3Var3 : ze3VarArr) {
                bke.e(byteArrayOutputStream2, ze3Var3.c, 4);
                bke.e(byteArrayOutputStream2, ze3Var3.d, 4);
                bke.e(byteArrayOutputStream2, ze3Var3.g, 4);
                String b4 = b(bArr2, ze3Var3.a, ze3Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b4.getBytes(charset3).length;
                bke.f(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(b4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            j3d j3dVar = new j3d(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(j3dVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < ze3VarArr.length) {
                try {
                    ze3 ze3Var4 = ze3VarArr[i6];
                    bke.f(byteArrayOutputStream3, i6);
                    bke.f(byteArrayOutputStream3, ze3Var4.e);
                    i7 = i7 + 4 + (ze3Var4.e << 1);
                    int[] iArr = ze3Var4.h;
                    int length3 = iArr.length;
                    int i8 = i2;
                    while (i2 < length3) {
                        int i9 = iArr[i2];
                        bke.f(byteArrayOutputStream3, i9 - i8);
                        i2++;
                        i8 = i9;
                    }
                    i6++;
                    i2 = 0;
                } finally {
                }
            }
            int i10 = 2;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            j3d j3dVar2 = new j3d(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(j3dVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < ze3VarArr.length) {
                try {
                    ze3 ze3Var5 = ze3VarArr[i11];
                    Iterator it3 = ze3Var5.i.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        k(byteArrayOutputStream4, ze3Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            l(byteArrayOutputStream4, ze3Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            bke.f(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            bke.e(byteArrayOutputStream3, length4, 4);
                            bke.f(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            j3d j3dVar3 = new j3d(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(j3dVar3);
            long size2 = 12 + (arrayList2.size() << 4);
            bke.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                j3d j3dVar4 = (j3d) arrayList2.get(i15);
                int i16 = j3dVar4.a;
                byte[] bArr7 = j3dVar4.b;
                if (i16 == 1) {
                    i = 0;
                } else if (i16 == i10) {
                    i = 1;
                } else if (i16 == 3) {
                    i = 2;
                } else if (i16 == 4) {
                    i = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    i = 4;
                }
                bke.e(byteArrayOutputStream, i, 4);
                bke.e(byteArrayOutputStream, size2, 4);
                if (j3dVar4.c) {
                    long length5 = bArr7.length;
                    byte[] a6 = bke.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a6);
                    bke.e(byteArrayOutputStream, a6.length, 4);
                    bke.e(byteArrayOutputStream, length5, 4);
                    length = a6.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    bke.e(byteArrayOutputStream, bArr7.length, 4);
                    bke.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
                i10 = 2;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } finally {
            try {
                byteArrayOutputStream2.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, ze3 ze3Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        bke.f(byteArrayOutputStream, str.getBytes(charset).length);
        bke.f(byteArrayOutputStream, ze3Var.e);
        bke.e(byteArrayOutputStream, ze3Var.f, 4);
        bke.e(byteArrayOutputStream, ze3Var.c, 4);
        bke.e(byteArrayOutputStream, ze3Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, ze3 ze3Var) {
        byte[] bArr = new byte[(((ze3Var.g << 1) + 7) & (-8)) / 8];
        for (Map.Entry entry : ze3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + ze3Var.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (i2 % 8)));
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, ze3 ze3Var) {
        int i = 0;
        for (Map.Entry entry : ze3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                bke.f(byteArrayOutputStream, intValue - i);
                bke.f(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
