package org.telegram.utils.code.highlight;

import com.google.android.gms.internal.play_billing.s0;
import ni.t;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class PrismaHighlighter implements AutoCloseable {
    public long a;
    public final String[] b;
    public final t c;

    public PrismaHighlighter(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("grammars");
        }
        long nativeCreate = nativeCreate(bArr);
        this.a = nativeCreate;
        if (nativeCreate == 0) {
            throw new IllegalStateException("Native highlighter was not created");
        }
        try {
            String[] nativeGetTokenNames = nativeGetTokenNames(nativeCreate);
            this.b = nativeGetTokenNames;
            if (nativeGetTokenNames == null || nativeGetTokenNames.length == 0 || !"".equals(nativeGetTokenNames[0])) {
                throw new IllegalStateException("Invalid native token name table");
            }
            this.c = new t(nativeGetTokenNames);
        } catch (Error e10) {
            e = e10;
            close();
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            close();
            throw e;
        }
    }

    public static boolean b(int i7, String str) {
        return i7 > 0 && i7 < str.length() && Character.isHighSurrogate(str.charAt(i7 + (-1))) && Character.isLowSurrogate(str.charAt(i7));
    }

    public static void d(int[] iArr, String str, int i7) {
        if (iArr == null || iArr.length % 5 != 0) {
            throw new IllegalStateException("Invalid native token array");
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            int i12 = iArr[i10];
            int i13 = iArr[i10 + 1];
            int i14 = iArr[i10 + 2];
            int i15 = iArr[i10 + 3];
            int i16 = iArr[i10 + 4];
            if (i12 < i11 || i13 <= i12 || i13 > str.length() || i14 < 0 || i14 >= i7 || i15 < 0 || i15 >= i7 || i16 < -1 || i16 >= i10 / 5 || b(i12, str) || b(i13, str)) {
                throw new IllegalStateException("Invalid native token range");
            }
            if (i16 >= 0) {
                int i17 = i16 * 5;
                if (i12 < iArr[i17] || i13 > iArr[i17 + 1]) {
                    throw new IllegalStateException("Native token is outside its parent");
                }
            }
            i10 += 5;
            i11 = i12;
        }
    }

    private static native long nativeCreate(byte[] bArr);

    private static native void nativeDestroy(long j3);

    private static native String[] nativeGetLanguages(long j3);

    private static native String[] nativeGetTokenNames(long j3);

    private static native int[] nativeHighlight(long j3, String str, String str2);

    public final synchronized String[] a() {
        long j3;
        j3 = this.a;
        if (j3 == 0) {
            throw new IllegalStateException("Highlighter is closed");
        }
        return nativeGetLanguages(j3);
    }

    public final synchronized s0 c(String str, String str2) {
        int[] nativeHighlight;
        long j3 = this.a;
        if (j3 == 0) {
            throw new IllegalStateException("Highlighter is closed");
        }
        if (str == null) {
            throw new NullPointerException("text");
        }
        nativeHighlight = nativeHighlight(j3, str, str2);
        d(nativeHighlight, str, this.b.length);
        return new s0(nativeHighlight, this.c);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        long j3 = this.a;
        if (j3 != 0) {
            nativeDestroy(j3);
            this.a = 0L;
        }
    }
}
