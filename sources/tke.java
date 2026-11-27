// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class tke {
    public static final /* synthetic */ int a = 0;

    static {
        if (eke.e && eke.d) {
            int i = uwd.a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        int i5 = bArr[i - 1];
        if (i4 == 0) {
            if (i5 <= -12) {
                return i5;
            }
            return -1;
        }
        if (i4 == 1) {
            int i6 = bArr[i];
            if (i5 > -12 || i6 > -65) {
                return -1;
            }
            i3 = i6 << 8;
        } else {
            if (i4 != 2) {
                lq5.f();
                return 0;
            }
            int i7 = bArr[i];
            int i8 = bArr[i + 1];
            if (i5 > -12 || i7 > -65 || i8 > -65) {
                return -1;
            }
            i3 = i8 << 16;
            i5 ^= i7 << 8;
        }
        return i5 ^ i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r11 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (charAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                            throw new oke(i6, length);
                        }
                        p3d.k(charAt2, i7);
                        return 0;
                    }
                    int i8 = i6 + 1;
                    if (i8 != str.length()) {
                        char charAt3 = str.charAt(i8);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i9 = i7 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | jn7.O3);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i6 = i8;
                        } else {
                            i6 = i8;
                        }
                    }
                    throw new oke(i6 - 1, length);
                }
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new oke(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        p3d.g(i2 + 4294967296L);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(int i, int i2, byte[] bArr) {
        while (i < i2) {
            if (bArr[i] < 0) {
                while (i < i2) {
                    int i3 = i + 1;
                    int i4 = bArr[i];
                    if (i4 >= 0) {
                        i = i3;
                    } else if (i4 < -32) {
                        if (i3 >= i2) {
                            return i4 == 0;
                        }
                        if (i4 < -62) {
                            return false;
                        }
                        i += 2;
                        if (bArr[i3] > 65471) {
                            return false;
                        }
                    } else if (i4 < -16) {
                        if (i3 >= i2 - 1) {
                            i4 = a(bArr, i3, i2);
                            if (i4 == 0) {
                            }
                        } else {
                            int i5 = i + 2;
                            char c = bArr[i3];
                            if (c > 65471) {
                                return false;
                            }
                            if (i4 == -32 && c < 65440) {
                                return false;
                            }
                            if (i4 == -19 && c >= 65440) {
                                return false;
                            }
                            i += 3;
                            if (bArr[i5] > 65471) {
                                return false;
                            }
                        }
                    } else if (i3 >= i2 - 2) {
                        i4 = a(bArr, i3, i2);
                        if (i4 == 0) {
                        }
                    } else {
                        int i6 = i + 2;
                        int i7 = bArr[i3];
                        if (i7 > -65) {
                            return false;
                        }
                        if ((((i7 + jn7.w1) + (i4 << 28)) >> 30) != 0) {
                            return false;
                        }
                        int i8 = i + 3;
                        if (bArr[i6] > 65471) {
                            return false;
                        }
                        i += 4;
                        if (bArr[i8] > 65471) {
                            return false;
                        }
                    }
                }
                return true;
            }
            i++;
        }
        return true;
    }
}
