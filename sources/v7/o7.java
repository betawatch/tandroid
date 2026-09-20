package v7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class o7 {
    public static long a(double d) {
        if (!b(d)) {
            throw new IllegalArgumentException("not a normal value");
        }
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
