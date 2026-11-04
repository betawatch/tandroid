package t4;

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
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class e {
    public static final kb.a a = new kb.a(24);
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
        int i3 = 0;
        for (b bVar : bVarArr) {
            i3 += ((((bVar.g * 2) + 7) & (-8)) / 8) + (bVar.e * 2) + d(bArr, bVar.a, bVar.b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bArr, bVar2.a, bVar2.b));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.h;
                int length = iArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = iArr[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bArr, bVar3.a, bVar3.b));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.h;
                int length2 = iArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr2[i13];
                    u(byteArrayOutputStream, i15 - i14);
                    i13++;
                    i14 = i15;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
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

    public static String d(byte[] bArr, String str, String str2) {
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
                return a1.g.s(com.google.android.recaptcha.internal.a.l(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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

    public static byte[] f(int i3, InputStream inputStream) {
        byte[] bArr = new byte[i3];
        int i10 = 0;
        while (i10 < i3) {
            int read = inputStream.read(bArr, i10, i3 - i10);
            if (read < 0) {
                throw new IllegalStateException(p1.i(i3, "Not enough bytes to read: "));
            }
            i10 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += (int) m(2, byteArrayInputStream);
            iArr[i11] = i10;
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
    public static byte[] h(FileInputStream fileInputStream, int i3, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int i12 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i3) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i12 += inflater.inflate(bArr, i12, i10 - i12);
                    i11 += read;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i11);
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
            byte[] h7 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
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
        byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h10);
        try {
            b[] j10 = j(byteArrayInputStream2, m11, bVarArr);
            byteArrayInputStream2.close();
            return j10;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i3, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i3 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            int m10 = (int) m(2, byteArrayInputStream);
            iArr[i10] = (int) m(2, byteArrayInputStream);
            strArr[i10] = new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i3; i11++) {
            b bVar = bVarArr[i11];
            if (!bVar.b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            bVar.e = i12;
            bVar.h = g(byteArrayInputStream, i12);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i3 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i3; i10++) {
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
                int i11 = 0;
                while (true) {
                    if (i11 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i11].b.equals(substring)) {
                        bVar = bVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.d = m10;
            int[] g7 = g(byteArrayInputStream, m11);
            if (Arrays.equals(bArr, h)) {
                bVar.e = m11;
                bVar.h = g7;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m10 = (int) m(1, fileInputStream);
        byte[] h7 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
        try {
            b[] n4 = n(byteArrayInputStream, str, m10);
            byteArrayInputStream.close();
            return n4;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(int i3, InputStream inputStream) {
        byte[] f10 = f(i3, inputStream);
        long j10 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j10 += (f10[i10] & 255) << (i10 * 8);
        }
        return j10;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            int m10 = (int) m(2, byteArrayInputStream);
            int m11 = (int) m(2, byteArrayInputStream);
            bVarArr[i11] = new b(str, new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), m11, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[m11], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i3) {
            b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available();
            int i13 = bVar.f;
            int i14 = bVar.g;
            TreeMap treeMap = bVar.i;
            int i15 = available - i13;
            int i16 = i10;
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
                            int i17 = i10;
                            int i18 = i12;
                            for (int m14 = (int) m(1, byteArrayInputStream); m14 > 0; m14--) {
                                m(2, byteArrayInputStream);
                            }
                            m13--;
                            i10 = i17;
                            i12 = i18;
                        }
                    }
                    m12--;
                    i10 = i10;
                    i12 = i12;
                }
            }
            int i19 = i10;
            int i20 = i12;
            if (byteArrayInputStream.available() != i15) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.h = g(byteArrayInputStream, bVar.e);
            BitSet valueOf = BitSet.valueOf(f((((i14 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i21 = i19; i21 < i14; i21++) {
                int i22 = valueOf.get(i21) ? 2 : i19;
                if (valueOf.get(i21 + i14)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (num == null) {
                        num = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | num.intValue()));
                }
            }
            i12 = i20 + 1;
            i10 = i19;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b10 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b10.length, 4);
                byte[] a10 = a(b10);
                t(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.i.size() * 4;
                    String d10 = d(bArr4, bVar.a, bVar.b);
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
                byte[] a11 = a(b11);
                t(byteArrayOutputStream, a11.length, 4);
                byteArrayOutputStream.write(a11);
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
                String d11 = d(bArr6, str, bVar2.b);
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
            int i13 = 2;
            for (b bVar3 : bVarArr) {
                t(byteArrayOutputStream2, bVar3.c, 4);
                t(byteArrayOutputStream2, bVar3.d, 4);
                t(byteArrayOutputStream2, bVar3.g, 4);
                String d12 = d(bArr2, bVar3.a, bVar3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d12.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(d12.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i14];
                    u(byteArrayOutputStream3, i14);
                    u(byteArrayOutputStream3, bVar4.e);
                    i15 = i15 + 4 + (bVar4.e * i12);
                    int[] iArr = bVar4.h;
                    int length3 = iArr.length;
                    int i16 = i3;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        u(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i3 = 0;
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i20];
                    Iterator it3 = bVar5.i.entrySet().iterator();
                    int i22 = 0;
                    while (it3.hasNext()) {
                        i22 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
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
                            u(byteArrayOutputStream3, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i22);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i23 + length4;
                            i20++;
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
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i24);
                int i25 = kVar4.a;
                byte[] bArr7 = kVar4.b;
                if (i25 == 1) {
                    j10 = 0;
                } else if (i25 == 2) {
                    j10 = 1;
                } else if (i25 == 3) {
                    j10 = 2;
                } else if (i25 == 4) {
                    j10 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                t(byteArrayOutputStream, j10, 4);
                t(byteArrayOutputStream, size2, 4);
                if (kVar4.c) {
                    long length5 = bArr7.length;
                    byte[] a12 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a12);
                    t(byteArrayOutputStream, a12.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a12.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
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
                int i3 = intValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + bVar.g;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i3 = 0;
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z10) {
        boolean z11;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r72;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr2;
        boolean z12;
        boolean z13;
        ?? r73;
        boolean z14;
        boolean z15;
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        ne.h hVar;
        FileInputStream m10;
        boolean z16;
        boolean z17;
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
                            z17 = readLong == packageInfo.lastUpdateTime;
                            if (z17) {
                                dVar.u(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z17) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        j.c(context, false);
                        return;
                    }
                }
                z17 = false;
                if (z17) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i10 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            ne.h hVar2 = new ne.h(assets, executor, dVar, name, file2);
            byte[] bArr3 = (byte[]) hVar2.d;
            if (bArr3 == null) {
                hVar2.n(3, Integer.valueOf(i10));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z11 = true;
                        hVar2.n(4, null);
                    }
                } else if (!file2.canWrite()) {
                    hVar2.n(4, null);
                }
                hVar2.a = true;
                try {
                    try {
                        fileInputStream = hVar2.m(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        dVar.u(6, e10);
                        fileInputStream = null;
                        bArr = b;
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) hVar2.f;
                        if (bVarArr2 != null) {
                            if (i3 != 24) {
                                switch (i3) {
                                }
                            }
                            try {
                                m10 = hVar2.m(assets, "dexopt/baseline.profm");
                                if (m10 == null) {
                                }
                            } catch (FileNotFoundException e11) {
                                dVar.u(9, e11);
                            } catch (IOException e12) {
                                dVar.u(7, e12);
                            } catch (IllegalStateException e13) {
                                hVar2.f = null;
                                dVar.u(8, e13);
                            }
                        }
                        d dVar2 = (d) hVar2.c;
                        bVarArr3 = (b[]) hVar2.f;
                        byte[] bArr4 = (byte[]) hVar2.d;
                        if (bVarArr3 != null) {
                            if (hVar2.a) {
                            }
                        }
                        bArr2 = (byte[]) hVar2.h;
                        if (bArr2 == null) {
                        }
                        if (z13) {
                        }
                        z15 = z13;
                        z16 = z14;
                        j.c(context, (z15 || !z10) ? false : z16);
                    } catch (IOException e14) {
                        dVar.u(7, e14);
                        fileInputStream = null;
                        bArr = b;
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) hVar2.f;
                        if (bVarArr2 != null) {
                        }
                        d dVar22 = (d) hVar2.c;
                        bVarArr3 = (b[]) hVar2.f;
                        byte[] bArr42 = (byte[]) hVar2.d;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = (byte[]) hVar2.h;
                        if (bArr2 == null) {
                        }
                        if (z13) {
                        }
                        z15 = z13;
                        z16 = z14;
                        j.c(context, (z15 || !z10) ? false : z16);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e15) {
                            dVar.u(7, e15);
                            try {
                                fileInputStream.close();
                            } catch (IOException e16) {
                                dVar.u(7, e16);
                            }
                            bVarArr = null;
                            hVar2.f = bVarArr;
                            bVarArr2 = (b[]) hVar2.f;
                            if (bVarArr2 != null) {
                            }
                            d dVar222 = (d) hVar2.c;
                            bVarArr3 = (b[]) hVar2.f;
                            byte[] bArr422 = (byte[]) hVar2.d;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) hVar2.h;
                            if (bArr2 == null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z16 = z14;
                            j.c(context, (z15 || !z10) ? false : z16);
                        } catch (IllegalStateException e17) {
                            dVar.u(8, e17);
                            fileInputStream.close();
                            bVarArr = null;
                            hVar2.f = bVarArr;
                            bVarArr2 = (b[]) hVar2.f;
                            if (bVarArr2 != null) {
                            }
                            d dVar2222 = (d) hVar2.c;
                            bVarArr3 = (b[]) hVar2.f;
                            byte[] bArr4222 = (byte[]) hVar2.d;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) hVar2.h;
                            if (bArr2 == null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z16 = z14;
                            j.c(context, (z15 || !z10) ? false : z16);
                        }
                        if (!Arrays.equals(bArr, f(4, fileInputStream))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(fileInputStream, f(4, fileInputStream), (String) hVar2.g);
                        try {
                            fileInputStream.close();
                        } catch (IOException e18) {
                            dVar.u(7, e18);
                        }
                        hVar2.f = bVarArr;
                    }
                    bVarArr2 = (b[]) hVar2.f;
                    if (bVarArr2 != null && (i3 = Build.VERSION.SDK_INT) >= 24 && i3 <= 34) {
                        if (i3 != 24 && i3 != 25) {
                            switch (i3) {
                            }
                        }
                        m10 = hVar2.m(assets, "dexopt/baseline.profm");
                        if (m10 == null) {
                            try {
                                if (!Arrays.equals(c, f(4, m10))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                hVar2.f = i(m10, f(4, m10), bArr3, bVarArr2);
                                m10.close();
                                hVar = hVar2;
                                if (hVar != null) {
                                    hVar2 = hVar;
                                }
                            } finally {
                            }
                        } else {
                            if (m10 != null) {
                                m10.close();
                            }
                            hVar = null;
                            if (hVar != null) {
                            }
                        }
                    }
                    d dVar22222 = (d) hVar2.c;
                    bVarArr3 = (b[]) hVar2.f;
                    byte[] bArr42222 = (byte[]) hVar2.d;
                    if (bVarArr3 != null && bArr42222 != null) {
                        if (hVar2.a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e19) {
                            dVar22222.u(7, e19);
                        } catch (IllegalStateException e20) {
                            dVar22222.u(8, e20);
                        }
                        if (o(byteArrayOutputStream, bArr42222, bVarArr3)) {
                            hVar2.h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            hVar2.f = null;
                        } else {
                            dVar22222.u(5, null);
                            hVar2.f = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) hVar2.h;
                    if (bArr2 == null) {
                        z13 = false;
                        z14 = true;
                    } else {
                        try {
                            if (!hVar2.a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) hVar2.e);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z14 = true;
                                                        try {
                                                            hVar2.n(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            hVar2.h = null;
                                                            hVar2.f = null;
                                                            z13 = true;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            Throwable th3 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th3;
                                                            } catch (Throwable th4) {
                                                                th3.addSuppressed(th4);
                                                                throw th3;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                Throwable th6 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    r73 = 1;
                                    hVar2.n(6, e);
                                    z12 = r73;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z16 = z14;
                                    j.c(context, (z15 || !z10) ? false : z16);
                                } catch (IOException e22) {
                                    e = e22;
                                    r72 = 1;
                                    hVar2.n(7, e);
                                    z12 = r72;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z16 = z14;
                                    j.c(context, (z15 || !z10) ? false : z16);
                                }
                            } catch (FileNotFoundException e23) {
                                e = e23;
                                hVar2.n(6, e);
                                z12 = r73;
                                z13 = false;
                                z14 = z12;
                                if (z13) {
                                }
                                z15 = z13;
                                z16 = z14;
                                j.c(context, (z15 || !z10) ? false : z16);
                            } catch (IOException e24) {
                                e = e24;
                                hVar2.n(7, e);
                                z12 = r72;
                                z13 = false;
                                z14 = z12;
                                if (z13) {
                                }
                                z15 = z13;
                                z16 = z14;
                                j.c(context, (z15 || !z10) ? false : z16);
                            }
                        } finally {
                            hVar2.h = null;
                            hVar2.f = null;
                        }
                    }
                    if (z13) {
                        e(packageInfo, filesDir);
                    }
                    z15 = z13;
                    z16 = z14;
                    j.c(context, (z15 || !z10) ? false : z16);
                } finally {
                }
                bArr = b;
                r72 = 8;
                r73 = 8;
            }
            z11 = true;
            z15 = false;
            z16 = z11;
            j.c(context, (z15 || !z10) ? false : z16);
        } catch (PackageManager.NameNotFoundException e25) {
            dVar.u(7, e25);
            j.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j10, int i3) {
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) ((j10 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        t(byteArrayOutputStream, i3, 2);
    }
}
