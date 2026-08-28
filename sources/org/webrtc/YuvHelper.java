package org.webrtc;

import j3.r0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13, int i14) {
        nativeABGRToI420((ByteBuffer) checkNotNull(byteBuffer, "src"), i9, (ByteBuffer) checkNotNull(byteBuffer2, "dstY"), i10, (ByteBuffer) checkNotNull(byteBuffer3, "dstU"), i11, (ByteBuffer) checkNotNull(byteBuffer4, "dstV"), i12, i13, i14);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = (i13 + 1) / 2;
        int i19 = i14 * i13;
        int i20 = i14 * i15;
        int i21 = (i16 * i18) + i20;
        int i22 = (i16 * i17) + i20;
        int i23 = ((i18 - 1) * i16) + i22 + ((i12 + 1) / 2);
        if (byteBuffer4.capacity() < i23) {
            StringBuilder p6 = r0.p(i23, "Expected destination buffer capacity to be at least ", " was ");
            p6.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(p6.toString());
        }
        byteBuffer4.limit(i19);
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.limit(i21);
        byteBuffer4.position(i20);
        ByteBuffer slice2 = byteBuffer4.slice();
        byteBuffer4.limit(i23);
        byteBuffer4.position(i22);
        I420Copy(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, slice, i14, slice2, i16, byteBuffer4.slice(), i16, i12, i13);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13, int i14) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dst");
        int i15 = i14 % 180;
        int i16 = i15 == 0 ? i12 : i13;
        int i17 = i15 == 0 ? i13 : i12;
        int i18 = (i17 + 1) / 2;
        int i19 = (i16 + 1) / 2;
        int i20 = i17 * i16;
        int i21 = i18 * i19;
        int i22 = (i21 * 2) + i20;
        if (byteBuffer4.capacity() < i22) {
            StringBuilder p6 = r0.p(i22, "Expected destination buffer capacity to be at least ", " was ");
            p6.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(p6.toString());
        }
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.position(i20);
        ByteBuffer slice2 = byteBuffer4.slice();
        byteBuffer4.position(i21 + i20);
        nativeI420Rotate(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, slice, i16, slice2, i19, byteBuffer4.slice(), i19, i12, i13, i14);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13, int i14, int i15) {
        int i16 = (i12 + 1) / 2;
        int i17 = i14 * i13;
        int i18 = i14 * i15;
        int i19 = (((i13 + 1) / 2) * i16 * 2) + i18;
        if (byteBuffer4.capacity() < i19) {
            StringBuilder p6 = r0.p(i19, "Expected destination buffer capacity to be at least ", " was ");
            p6.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(p6.toString());
        }
        byteBuffer4.limit(i17);
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.limit(i19);
        byteBuffer4.position(i18);
        I420ToNV12(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, slice, i14, byteBuffer4.slice(), i16 * 2, i12, i13);
    }

    private static <T> T checkNotNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(ta.b.j(str, " should not be null"));
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, int i11, int i12) {
        nativeCopyPlane((ByteBuffer) checkNotNull(byteBuffer, "src"), i9, (ByteBuffer) checkNotNull(byteBuffer2, "dst"), i10, i11, i12);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13, int i14);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, int i11, int i12);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, ByteBuffer byteBuffer5, int i13, ByteBuffer byteBuffer6, int i14, int i15, int i16);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, ByteBuffer byteBuffer5, int i13, ByteBuffer byteBuffer6, int i14, int i15, int i16, int i17);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, ByteBuffer byteBuffer5, int i13, int i14, int i15);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13) {
        I420ToNV12(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, byteBuffer4, i12, i13, i12, i13);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, ByteBuffer byteBuffer5, int i13, int i14, int i15) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstUV");
        if (i14 > 0 && i15 > 0) {
            nativeI420ToNV12(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, byteBuffer4, i12, byteBuffer5, i13, i14, i15);
            return;
        }
        throw new IllegalArgumentException("I420ToNV12: width and height should not be negative");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13) {
        I420Copy(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, byteBuffer4, i12, i13, i12, i13, (i12 + 1) / 2, (i13 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, int i13, int i14, int i15) {
        I420Copy(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, byteBuffer4, i12, i13, i14, i15, (i14 + 1) / 2, (i15 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, ByteBuffer byteBuffer5, int i13, ByteBuffer byteBuffer6, int i14, int i15, int i16) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        if (i15 > 0 && i16 > 0) {
            nativeI420Copy(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, byteBuffer4, i12, byteBuffer5, i13, byteBuffer6, i14, i15, i16);
            return;
        }
        throw new IllegalArgumentException("I420Copy: width and height should not be negative");
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, ByteBuffer byteBuffer4, int i12, ByteBuffer byteBuffer5, int i13, ByteBuffer byteBuffer6, int i14, int i15, int i16, int i17) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        nativeI420Rotate(byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11, byteBuffer4, i12, byteBuffer5, i13, byteBuffer6, i14, i15, i16, i17);
    }
}
