package org.telegram.utils.code.highlight;

import com.google.android.gms.internal.play_billing.s0;
import mi.t;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        } catch (Error e) {
            e = e;
            close();
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            close();
            throw e;
        }
    }

    public static boolean b(int i10, String str) {
        return i10 > 0 && i10 < str.length() && Character.isHighSurrogate(str.charAt(i10 + (-1))) && Character.isLowSurrogate(str.charAt(i10));
    }

    public static void d(int i10, int[] iArr, String str) {
        if (iArr == null || iArr.length % 5 != 0) {
            throw new IllegalStateException("Invalid native token array");
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < iArr.length) {
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 1];
            int i15 = iArr[i11 + 2];
            int i16 = iArr[i11 + 3];
            int i17 = iArr[i11 + 4];
            if (i13 < i12 || i14 <= i13 || i14 > str.length() || i15 < 0 || i15 >= i10 || i16 < 0 || i16 >= i10 || i17 < -1 || i17 >= i11 / 5 || b(i13, str) || b(i14, str)) {
                throw new IllegalStateException("Invalid native token range");
            }
            if (i17 >= 0) {
                int i18 = i17 * 5;
                if (i13 < iArr[i18] || i14 > iArr[i18 + 1]) {
                    throw new IllegalStateException("Native token is outside its parent");
                }
            }
            i11 += 5;
            i12 = i13;
        }
    }

    private static native long nativeCreate(byte[] bArr);

    private static native void nativeDestroy(long j10);

    private static native String[] nativeGetLanguages(long j10);

    private static native String[] nativeGetTokenNames(long j10);

    private static native int[] nativeHighlight(long j10, String str, String str2);

    public final synchronized String[] a() {
        long j10;
        j10 = this.a;
        if (j10 == 0) {
            throw new IllegalStateException("Highlighter is closed");
        }
        return nativeGetLanguages(j10);
    }

    public final synchronized s0 c(String str, String str2) {
        int[] nativeHighlight;
        long j10 = this.a;
        if (j10 == 0) {
            throw new IllegalStateException("Highlighter is closed");
        }
        if (str == null) {
            throw new NullPointerException("text");
        }
        nativeHighlight = nativeHighlight(j10, str, str2);
        d(this.b.length, nativeHighlight, str);
        return new s0(nativeHighlight, this.c);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        long j10 = this.a;
        if (j10 != 0) {
            nativeDestroy(j10);
            this.a = 0L;
        }
    }
}
