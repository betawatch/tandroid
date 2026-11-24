package org.telegram.utils.code.highlight;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class PrismaHighlighter implements AutoCloseable {
    public long a;
    public final String[] b;
    public final kj8 c;

    public PrismaHighlighter(byte[] bArr) {
        if (bArr == null) {
            fvc.f("grammars");
            throw null;
        }
        long nativeCreate = nativeCreate(bArr);
        this.a = nativeCreate;
        if (nativeCreate == 0) {
            sc8.j("Native highlighter was not created");
            throw null;
        }
        try {
            String[] nativeGetTokenNames = nativeGetTokenNames(nativeCreate);
            this.b = nativeGetTokenNames;
            if (nativeGetTokenNames == null || nativeGetTokenNames.length == 0 || !"".equals(nativeGetTokenNames[0])) {
                throw new IllegalStateException("Invalid native token name table");
            }
            this.c = new kj8(nativeGetTokenNames);
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    public static boolean b(int i, String str) {
        return i > 0 && i < str.length() && Character.isHighSurrogate(str.charAt(i + (-1))) && Character.isLowSurrogate(str.charAt(i));
    }

    public static void d(int[] iArr, String str, int i) {
        if (iArr == null || iArr.length % 5 != 0) {
            sc8.j("Invalid native token array");
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            int i4 = iArr[i2];
            int i5 = iArr[i2 + 1];
            int i6 = iArr[i2 + 2];
            int i7 = iArr[i2 + 3];
            int i8 = iArr[i2 + 4];
            if (i4 < i3 || i5 <= i4 || i5 > str.length() || i6 < 0 || i6 >= i || i7 < 0 || i7 >= i || i8 < -1 || i8 >= i2 / 5 || b(i4, str) || b(i5, str)) {
                sc8.j("Invalid native token range");
                return;
            }
            if (i8 >= 0) {
                int i9 = i8 * 5;
                if (i4 < iArr[i9] || i5 > iArr[i9 + 1]) {
                    sc8.j("Native token is outside its parent");
                    return;
                }
            }
            i2 += 5;
            i3 = i4;
        }
    }

    private static native long nativeCreate(byte[] bArr);

    private static native void nativeDestroy(long j);

    private static native String[] nativeGetLanguages(long j);

    private static native String[] nativeGetTokenNames(long j);

    private static native int[] nativeHighlight(long j, String str, String str2);

    public final synchronized String[] a() {
        long j;
        j = this.a;
        if (j == 0) {
            throw new IllegalStateException("Highlighter is closed");
        }
        return nativeGetLanguages(j);
    }

    public final synchronized f06 c(String str, String str2) {
        int[] nativeHighlight;
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("Highlighter is closed");
        }
        if (str == null) {
            throw new NullPointerException("text");
        }
        nativeHighlight = nativeHighlight(j, str, str2);
        d(nativeHighlight, str, this.b.length);
        return new f06(nativeHighlight, this.c);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        long j = this.a;
        if (j != 0) {
            nativeDestroy(j);
            this.a = 0L;
        }
    }
}
