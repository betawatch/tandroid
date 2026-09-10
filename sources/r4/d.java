package r4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p4.s0;
import t7.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class d {
    public static final u a = new u();
    public static final byte[] b = {112, 114, 111, 0};
    public static final byte[] c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i10 = 0;
        for (b bVar : bVarArr) {
            i10 += ((((bVar.g * 2) + 7) & (-8)) / 8) + (bVar.e * 2) + d(bVar.a, bVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.a, bVar2.b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.h;
                int length = iArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = iArr[i11];
                    u(byteArrayOutputStream, i13 - i12);
                    i11++;
                    i12 = i13;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.a, bVar3.b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.h;
                int length2 = iArr2.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length2) {
                    int i16 = iArr2[i14];
                    u(byteArrayOutputStream, i16 - i15);
                    i14++;
                    i15 = i16;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
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
                return a4.a.s(a4.a.u(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(int i10, InputStream inputStream) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read < 0) {
                throw new IllegalStateException(hc.b.j(i10, "Not enough bytes to read: "));
            }
            i11 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (int) m(2, byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int i13 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i13 += inflater.inflate(bArr, i13, i11 - i13);
                    i12 += read;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m10 = (int) m(2, fileInputStream);
            byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
            try {
                b[] k10 = k(byteArrayInputStream, bArr2, m10, bVarArr);
                byteArrayInputStream.close();
                return k10;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m11 = (int) m(1, fileInputStream);
        byte[] h11 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
        try {
            b[] j3 = j(byteArrayInputStream2, m11, bVarArr);
            byteArrayInputStream2.close();
            return j3;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m10 = (int) m(2, byteArrayInputStream);
            iArr[i11] = (int) m(2, byteArrayInputStream);
            strArr[i11] = new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            if (!bVar.b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.e = i13;
            bVar.h = g(byteArrayInputStream, i13);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(2, byteArrayInputStream);
            String str = new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long m10 = m(4, byteArrayInputStream);
            int m11 = (int) m(2, byteArrayInputStream);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i12].b.equals(substring)) {
                        bVar = bVarArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.d = m10;
            int[] g10 = g(byteArrayInputStream, m11);
            if (Arrays.equals(bArr, h)) {
                bVar.e = m11;
                bVar.h = g10;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m10 = (int) m(1, fileInputStream);
        byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
        try {
            b[] n10 = n(byteArrayInputStream, str, m10);
            byteArrayInputStream.close();
            return n10;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(int i10, InputStream inputStream) {
        byte[] f7 = f(i10, inputStream);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 += (f7[i11] & 255) << (i11 * 8);
        }
        return j3;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m10 = (int) m(2, byteArrayInputStream);
            int m11 = (int) m(2, byteArrayInputStream);
            bVarArr[i11] = new b(str, new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), m11, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[m11], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i10) {
            b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available();
            int i13 = bVar.f;
            int i14 = bVar.g;
            TreeMap treeMap = bVar.i;
            int i15 = available - i13;
            int i16 = 0;
            while (byteArrayInputStream.available() > i15) {
                i16 += (int) m(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i16), 1);
                int m12 = (int) m(2, byteArrayInputStream);
                while (m12 > 0) {
                    m(2, byteArrayInputStream);
                    int m13 = (int) m(1, byteArrayInputStream);
                    if (m13 != 6 && m13 != 7) {
                        while (m13 > 0) {
                            m(1, byteArrayInputStream);
                            int i17 = i12;
                            for (int m14 = (int) m(1, byteArrayInputStream); m14 > 0; m14--) {
                                m(2, byteArrayInputStream);
                            }
                            m13--;
                            i12 = i17;
                        }
                    }
                    m12--;
                    i12 = i12;
                }
            }
            int i18 = i12;
            if (byteArrayInputStream.available() != i15) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.h = g(byteArrayInputStream, bVar.e);
            BitSet valueOf = BitSet.valueOf(f((((i14 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i19 = 0; i19 < i14; i19++) {
                int i20 = valueOf.get(i19) ? 2 : 0;
                if (valueOf.get(i19 + i14)) {
                    i20 |= 4;
                }
                if (i20 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i19));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i19), Integer.valueOf(i20 | num.intValue()));
                }
            }
            i12 = i18 + 1;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b10 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b10.length, 4);
                byte[] a2 = a(b10);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.i.size() * 4;
                    String d10 = d(bVar.a, bVar.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d10.getBytes(charset).length);
                    u(byteArrayOutputStream, bVar.h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, bVar.c, 4);
                    byteArrayOutputStream.write(d10.getBytes(charset));
                    Iterator it = bVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i10 : bVar.h) {
                        u(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b11 = b(bVarArr, bArr5);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b11.length, 4);
                byte[] a10 = a(b11);
                t(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr6 = h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.a;
                TreeMap treeMap = bVar2.i;
                String d11 = d(str, bVar2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d11.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar2.h.length);
                t(byteArrayOutputStream, bVar2.c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : bVar2.h) {
                    u(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, bVarArr.length);
            int i12 = 2;
            for (b bVar3 : bVarArr) {
                t(byteArrayOutputStream2, bVar3.c, 4);
                t(byteArrayOutputStream2, bVar3.d, 4);
                t(byteArrayOutputStream2, bVar3.g, 4);
                String d12 = d(bVar3.a, bVar3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d12.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i12 = i12 + 14 + length2;
                byteArrayOutputStream2.write(d12.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i12 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < bVarArr.length; i14++) {
                try {
                    b bVar4 = bVarArr[i14];
                    u(byteArrayOutputStream3, i14);
                    u(byteArrayOutputStream3, bVar4.e);
                    i13 = i13 + 4 + (bVar4.e * 2);
                    int[] iArr = bVar4.h;
                    int length3 = iArr.length;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length3) {
                        int i17 = iArr[i15];
                        u(byteArrayOutputStream3, i17 - i16);
                        i15++;
                        i16 = i17;
                    }
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i18];
                    Iterator it3 = bVar5.i.entrySet().iterator();
                    int i20 = 0;
                    while (it3.hasNext()) {
                        i20 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i21 = i19 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i20);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i19 = i21 + length4;
                            i18++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i19 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i22);
                int i23 = jVar4.a;
                byte[] bArr7 = jVar4.b;
                if (i23 == 1) {
                    j3 = 0;
                } else if (i23 == 2) {
                    j3 = 1;
                } else if (i23 == 3) {
                    j3 = 2;
                } else if (i23 == 4) {
                    j3 = 3;
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                t(byteArrayOutputStream, j3, 4);
                t(byteArrayOutputStream, size2, 4);
                if (jVar4.c) {
                    long length5 = bArr7.length;
                    byte[] a11 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a11);
                    t(byteArrayOutputStream, a11.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a11.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.e);
        t(byteArrayOutputStream, bVar.f, 4);
        t(byteArrayOutputStream, bVar.c, 4);
        t(byteArrayOutputStream, bVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i10 = intValue / 8;
                bArr[i10] = (byte) (bArr[i10] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i11 = intValue + bVar.g;
                int i12 = i11 / 8;
                bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i10 = 0;
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i10);
                u(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, c cVar, boolean z10) {
        FileInputStream fileInputStream;
        byte[] bArr;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr2;
        boolean z11;
        FileOutputStream fileOutputStream;
        boolean z12;
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        s0 s0Var;
        FileInputStream a2;
        boolean z13;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z13 = readLong == packageInfo.lastUpdateTime;
                            if (z13) {
                                cVar.x(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z13) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        i.c(context, false);
                        return;
                    }
                }
                z13 = false;
                if (z13) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i11 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            s0 s0Var2 = new s0(assets, executor, cVar, name, file2);
            byte[] bArr3 = (byte[]) s0Var2.d;
            if (bArr3 == null) {
                s0Var2.b(3, Integer.valueOf(i11));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        s0Var2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    s0Var2.b(4, null);
                }
                s0Var2.a = true;
                try {
                    try {
                        fileInputStream = s0Var2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e7) {
                        cVar.x(6, e7);
                        fileInputStream = null;
                        bArr = b;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) s0Var2.g;
                        if (bVarArr2 != null) {
                        }
                        c cVar2 = (c) s0Var2.c;
                        bVarArr3 = (b[]) s0Var2.g;
                        byte[] bArr4 = (byte[]) s0Var2.d;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = (byte[]) s0Var2.h;
                        if (bArr2 == null) {
                        }
                        if (z11) {
                        }
                        z12 = z11;
                        i.c(context, !z12 && z10);
                    } catch (IOException e10) {
                        cVar.x(7, e10);
                        fileInputStream = null;
                        bArr = b;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) s0Var2.g;
                        if (bVarArr2 != null) {
                        }
                        c cVar22 = (c) s0Var2.c;
                        bVarArr3 = (b[]) s0Var2.g;
                        byte[] bArr42 = (byte[]) s0Var2.d;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = (byte[]) s0Var2.h;
                        if (bArr2 == null) {
                        }
                        if (z11) {
                        }
                        z12 = z11;
                        i.c(context, !z12 && z10);
                    }
                    if (fileInputStream != null) {
                        try {
                            try {
                            } catch (IllegalStateException e11) {
                                cVar.x(8, e11);
                                try {
                                    fileInputStream.close();
                                } catch (IOException e12) {
                                    cVar.x(7, e12);
                                }
                                bVarArr = null;
                                s0Var2.g = bVarArr;
                                bVarArr2 = (b[]) s0Var2.g;
                                if (bVarArr2 != null) {
                                    if (i10 != 24) {
                                        switch (i10) {
                                        }
                                    }
                                    try {
                                        a2 = s0Var2.a(assets, "dexopt/baseline.profm");
                                        if (a2 == null) {
                                        }
                                    } catch (FileNotFoundException e13) {
                                        cVar.x(9, e13);
                                    } catch (IOException e14) {
                                        cVar.x(7, e14);
                                    } catch (IllegalStateException e15) {
                                        s0Var2.g = null;
                                        cVar.x(8, e15);
                                    }
                                }
                                c cVar222 = (c) s0Var2.c;
                                bVarArr3 = (b[]) s0Var2.g;
                                byte[] bArr422 = (byte[]) s0Var2.d;
                                if (bVarArr3 != null) {
                                    if (s0Var2.a) {
                                    }
                                }
                                bArr2 = (byte[]) s0Var2.h;
                                if (bArr2 == null) {
                                }
                                if (z11) {
                                }
                                z12 = z11;
                                i.c(context, !z12 && z10);
                            }
                        } catch (IOException e16) {
                            cVar.x(7, e16);
                            fileInputStream.close();
                            bVarArr = null;
                            s0Var2.g = bVarArr;
                            bVarArr2 = (b[]) s0Var2.g;
                            if (bVarArr2 != null) {
                            }
                            c cVar2222 = (c) s0Var2.c;
                            bVarArr3 = (b[]) s0Var2.g;
                            byte[] bArr4222 = (byte[]) s0Var2.d;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) s0Var2.h;
                            if (bArr2 == null) {
                            }
                            if (z11) {
                            }
                            z12 = z11;
                            i.c(context, !z12 && z10);
                        }
                        if (!Arrays.equals(bArr, f(4, fileInputStream))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(fileInputStream, f(4, fileInputStream), (String) s0Var2.f);
                        try {
                            fileInputStream.close();
                        } catch (IOException e17) {
                            cVar.x(7, e17);
                        }
                        s0Var2.g = bVarArr;
                    }
                    bVarArr2 = (b[]) s0Var2.g;
                    if (bVarArr2 != null && (i10 = Build.VERSION.SDK_INT) >= 24 && i10 <= 34) {
                        if (i10 != 24 && i10 != 25) {
                            switch (i10) {
                            }
                        }
                        a2 = s0Var2.a(assets, "dexopt/baseline.profm");
                        if (a2 == null) {
                            try {
                                if (!Arrays.equals(c, f(4, a2))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                s0Var2.g = i(a2, f(4, a2), bArr3, bVarArr2);
                                a2.close();
                                s0Var = s0Var2;
                                if (s0Var != null) {
                                    s0Var2 = s0Var;
                                }
                            } finally {
                            }
                        } else {
                            if (a2 != null) {
                                a2.close();
                            }
                            s0Var = null;
                            if (s0Var != null) {
                            }
                        }
                    }
                    c cVar22222 = (c) s0Var2.c;
                    bVarArr3 = (b[]) s0Var2.g;
                    byte[] bArr42222 = (byte[]) s0Var2.d;
                    if (bVarArr3 != null && bArr42222 != null) {
                        if (s0Var2.a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e18) {
                            cVar22222.x(7, e18);
                        } catch (IllegalStateException e19) {
                            cVar22222.x(8, e19);
                        }
                        if (o(byteArrayOutputStream, bArr42222, bVarArr3)) {
                            s0Var2.h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            s0Var2.g = null;
                        } else {
                            cVar22222.x(5, null);
                            s0Var2.g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) s0Var2.h;
                    if (bArr2 == null) {
                        z11 = false;
                    } else {
                        try {
                            if (!s0Var2.a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        fileOutputStream = new FileOutputStream((File) s0Var2.e);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        try {
                                            byte[] bArr5 = new byte[512];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr5);
                                                if (read > 0) {
                                                    fileOutputStream.write(bArr5, 0, read);
                                                } else {
                                                    try {
                                                        s0Var2.b(1, null);
                                                        fileOutputStream.close();
                                                        byteArrayInputStream.close();
                                                        s0Var2.h = null;
                                                        s0Var2.g = null;
                                                        z11 = true;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        Throwable th4 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th4;
                                                        } catch (Throwable th5) {
                                                            th4.addSuppressed(th5);
                                                            throw th4;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Throwable th8 = th;
                                        try {
                                            byteArrayInputStream.close();
                                            throw th8;
                                        } catch (Throwable th9) {
                                            th8.addSuppressed(th9);
                                            throw th8;
                                        }
                                    }
                                } catch (FileNotFoundException e20) {
                                    e = e20;
                                    s0Var2.b(6, e);
                                    z11 = false;
                                    if (z11) {
                                    }
                                    z12 = z11;
                                    i.c(context, !z12 && z10);
                                } catch (IOException e21) {
                                    e = e21;
                                    s0Var2.b(7, e);
                                    z11 = false;
                                    if (z11) {
                                    }
                                    z12 = z11;
                                    i.c(context, !z12 && z10);
                                }
                            } catch (FileNotFoundException e22) {
                                e = e22;
                                s0Var2.b(6, e);
                                z11 = false;
                                if (z11) {
                                }
                                z12 = z11;
                                i.c(context, !z12 && z10);
                            } catch (IOException e23) {
                                e = e23;
                                s0Var2.b(7, e);
                                z11 = false;
                                if (z11) {
                                }
                                z12 = z11;
                                i.c(context, !z12 && z10);
                            }
                        } finally {
                            s0Var2.h = null;
                            s0Var2.g = null;
                        }
                    }
                    if (z11) {
                        e(packageInfo, filesDir);
                    }
                    z12 = z11;
                    i.c(context, !z12 && z10);
                } finally {
                }
                bArr = b;
            }
            z12 = false;
            i.c(context, !z12 && z10);
        } catch (PackageManager.NameNotFoundException e24) {
            cVar.x(7, e24);
            i.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j3 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        t(byteArrayOutputStream, i10, 2);
    }
}
