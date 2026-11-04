package org.telegram.utils.code.highlight;

import com.google.android.gms.internal.play_billing.s0;
import oi.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class PrismaHighlighter implements AutoCloseable {
    public long a;
    public final String[] b;
    public final r c;

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
            this.c = new r(nativeGetTokenNames);
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

    public static boolean b(int i3, String str) {
        return i3 > 0 && i3 < str.length() && Character.isHighSurrogate(str.charAt(i3 + (-1))) && Character.isLowSurrogate(str.charAt(i3));
    }

    public static void d(int[] iArr, String str, int i3) {
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
            if (i12 < i11 || i13 <= i12 || i13 > str.length() || i14 < 0 || i14 >= i3 || i15 < 0 || i15 >= i3 || i16 < -1 || i16 >= i10 / 5 || b(i12, str) || b(i13, str)) {
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
        d(nativeHighlight, str, this.b.length);
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
