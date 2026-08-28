package t4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import d5.f0;
import d5.x;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final g f;
    public Bitmap g;

    public h(int i9, int i10) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f = new g(i9, i10);
    }

    public static byte[] a(int i9, int i10, x xVar) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) xVar.i(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i9 = 1; i9 < 16; i9++) {
            if (i9 < 8) {
                iArr[i9] = d(255, (i9 & 1) != 0 ? 255 : 0, (i9 & 2) != 0 ? 255 : 0, (i9 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i9] = d(255, (i9 & 1) != 0 ? 127 : 0, (i9 & 2) != 0 ? 127 : 0, (i9 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            if (i9 < 8) {
                iArr[i9] = d(63, (i9 & 1) != 0 ? 255 : 0, (i9 & 2) != 0 ? 255 : 0, (i9 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i9 & 136;
                if (i10 == 0) {
                    iArr[i9] = d(255, ((i9 & 1) != 0 ? 85 : 0) + ((i9 & 16) != 0 ? 170 : 0), ((i9 & 2) != 0 ? 85 : 0) + ((i9 & 32) != 0 ? 170 : 0), ((i9 & 4) == 0 ? 0 : 85) + ((i9 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i9] = d(127, ((i9 & 1) != 0 ? 85 : 0) + ((i9 & 16) != 0 ? 170 : 0), ((i9 & 2) != 0 ? 85 : 0) + ((i9 & 32) != 0 ? 170 : 0), ((i9 & 4) == 0 ? 0 : 85) + ((i9 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i9] = d(255, ((i9 & 1) != 0 ? 43 : 0) + 127 + ((i9 & 16) != 0 ? 85 : 0), ((i9 & 2) != 0 ? 43 : 0) + 127 + ((i9 & 32) != 0 ? 85 : 0), ((i9 & 4) == 0 ? 0 : 43) + 127 + ((i9 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i9] = d(255, ((i9 & 1) != 0 ? 43 : 0) + ((i9 & 16) != 0 ? 85 : 0), ((i9 & 2) != 0 ? 43 : 0) + ((i9 & 32) != 0 ? 85 : 0), ((i9 & 4) == 0 ? 0 : 43) + ((i9 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206 A[LOOP:3: B:86:0x0155->B:97:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        byte[] bArr2;
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        int i19;
        int i20;
        Paint paint2 = paint;
        x xVar = new x(bArr, bArr.length);
        int i21 = i10;
        int i22 = i11;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (xVar.b() != 0) {
            int i23 = 8;
            int i24 = xVar.i(8);
            if (i24 != 240) {
                int i25 = 3;
                int i26 = 2;
                int i27 = 4;
                switch (i24) {
                    case 16:
                        byte[] bArr6 = i9 == 3 ? bArr3 == null ? i : bArr3 : i9 == 2 ? bArr5 == null ? h : bArr5 : null;
                        boolean z13 = false;
                        while (true) {
                            int i28 = xVar.i(2);
                            if (i28 != 0) {
                                z10 = z13;
                                i12 = i28;
                            } else {
                                if (xVar.h()) {
                                    int i29 = xVar.i(3) + 3;
                                    z10 = z13;
                                    i12 = xVar.i(2);
                                    i13 = i29;
                                } else if (xVar.h()) {
                                    z10 = z13;
                                    i12 = 0;
                                } else {
                                    int i30 = xVar.i(2);
                                    if (i30 != 0) {
                                        if (i30 == 1) {
                                            z10 = z13;
                                            i12 = 0;
                                            i13 = 2;
                                        } else if (i30 == 2) {
                                            i13 = xVar.i(4) + 12;
                                            i12 = xVar.i(2);
                                            z10 = z13;
                                        } else if (i30 != 3) {
                                            z10 = z13;
                                            i12 = 0;
                                        } else {
                                            int i31 = xVar.i(8) + 29;
                                            i12 = xVar.i(2);
                                            z10 = z13;
                                            i13 = i31;
                                        }
                                        if (i13 != 0 || paint2 == null) {
                                            i14 = i21;
                                        } else {
                                            if (bArr6 != 0) {
                                                i12 = bArr6[i12];
                                            }
                                            paint2.setColor(iArr[i12]);
                                            i14 = i21;
                                            canvas.drawRect(i21, i22, i21 + i13, i22 + 1, paint2);
                                        }
                                        i21 = i14 + i13;
                                        if (!z10) {
                                            xVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z13 = z10;
                                        }
                                    } else {
                                        i12 = 0;
                                        z10 = true;
                                    }
                                    i13 = 0;
                                    if (i13 != 0) {
                                    }
                                    i14 = i21;
                                    i21 = i14 + i13;
                                    if (!z10) {
                                    }
                                }
                                if (i13 != 0) {
                                }
                                i14 = i21;
                                i21 = i14 + i13;
                                if (!z10) {
                                }
                            }
                            i13 = 1;
                            if (i13 != 0) {
                            }
                            i14 = i21;
                            i21 = i14 + i13;
                            if (!z10) {
                            }
                        }
                    case 17:
                        if (i9 == 3) {
                            bArr2 = bArr4 == null ? j : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z14 = false;
                        while (true) {
                            int i32 = xVar.i(i27);
                            if (i32 != 0) {
                                z11 = z14;
                                i17 = i32;
                                i15 = 1;
                            } else if (xVar.h()) {
                                if (xVar.h()) {
                                    int i33 = xVar.i(i26);
                                    if (i33 == 0) {
                                        z11 = z14;
                                        i15 = 1;
                                    } else if (i33 != 1) {
                                        if (i33 == i26) {
                                            i15 = xVar.i(i27) + 9;
                                            i16 = xVar.i(i27);
                                        } else if (i33 != i25) {
                                            z11 = z14;
                                            i15 = 0;
                                        } else {
                                            i15 = xVar.i(i23) + 25;
                                            i16 = xVar.i(i27);
                                        }
                                        i17 = i16;
                                    } else {
                                        z11 = z14;
                                        i15 = 2;
                                    }
                                    i17 = 0;
                                } else {
                                    i15 = xVar.i(i26) + 4;
                                    i17 = xVar.i(i27);
                                }
                                z11 = z14;
                            } else {
                                int i34 = xVar.i(i25);
                                if (i34 != 0) {
                                    i15 = i34 + 2;
                                    z11 = z14;
                                    i17 = 0;
                                } else {
                                    z11 = true;
                                    i15 = 0;
                                    i17 = 0;
                                }
                            }
                            if (i15 == 0 || paint2 == null) {
                                i18 = i21;
                            } else {
                                if (bArr2 != 0) {
                                    i17 = bArr2[i17];
                                }
                                paint2.setColor(iArr[i17]);
                                i18 = i21;
                                canvas.drawRect(i21, i22, i21 + i15, i22 + 1, paint2);
                            }
                            i21 = i18 + i15;
                            if (z11) {
                                xVar.c();
                                break;
                            } else {
                                z14 = z11;
                                i25 = 3;
                                i26 = 2;
                                i27 = 4;
                                i23 = 8;
                            }
                        }
                    case 18:
                        boolean z15 = false;
                        while (true) {
                            int i35 = xVar.i(8);
                            if (i35 != 0) {
                                z12 = z15;
                                i19 = 1;
                            } else if (xVar.h()) {
                                z12 = z15;
                                i19 = xVar.i(7);
                                i35 = xVar.i(8);
                            } else {
                                int i36 = xVar.i(7);
                                if (i36 != 0) {
                                    z12 = z15;
                                    i19 = i36;
                                    i35 = 0;
                                } else {
                                    i35 = 0;
                                    z12 = true;
                                    i19 = 0;
                                }
                            }
                            if (i19 == 0 || paint2 == null) {
                                i20 = i21;
                            } else {
                                paint2.setColor(iArr[i35]);
                                i20 = i21;
                                canvas.drawRect(i21, i22, i21 + i19, i22 + 1, paint2);
                            }
                            i21 = i20 + i19;
                            if (z12) {
                                break;
                            } else {
                                z15 = z12;
                            }
                        }
                        break;
                    default:
                        switch (i24) {
                            case 32:
                                bArr5 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArr3 = a(4, 8, xVar);
                                break;
                            case 34:
                                bArr4 = a(16, 8, xVar);
                                break;
                        }
                }
            } else {
                i22 += 2;
                i21 = i10;
            }
            paint2 = paint;
        }
    }

    public static a f(x xVar, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = xVar.i(8);
        xVar.s(8);
        int i17 = 2;
        int i18 = i9 - 2;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i18 > 0) {
            int i19 = xVar.i(i15);
            int i20 = xVar.i(i15);
            int[] iArr2 = (i20 & 128) != 0 ? iArr : (i20 & 64) != 0 ? b10 : c10;
            if ((i20 & 1) != 0) {
                i13 = xVar.i(i15);
                i14 = xVar.i(i15);
                i10 = xVar.i(i15);
                i12 = xVar.i(i15);
                i11 = i18 - 6;
            } else {
                int i21 = xVar.i(6) << i17;
                int i22 = xVar.i(4) << 4;
                i10 = xVar.i(4) << 4;
                i11 = i18 - 4;
                i12 = xVar.i(i17) << 6;
                i13 = i21;
                i14 = i22;
            }
            if (i13 == 0) {
                i14 = 0;
                i10 = 0;
                i12 = 255;
            }
            double d = i13;
            double d9 = i14 - 128;
            double d10 = i10 - 128;
            iArr2[i19] = d((byte) (255 - (i12 & 255)), f0.h((int) ((1.402d * d9) + d), 0, 255), f0.h((int) ((d - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), f0.h((int) ((d10 * 1.772d) + d), 0, 255));
            i18 = i11;
            i16 = i16;
            c10 = c10;
            i15 = 8;
            i17 = 2;
        }
        return new a(i16, iArr, b10, c10);
    }

    public static c g(x xVar) {
        byte[] bArr;
        int i9 = xVar.i(16);
        xVar.s(4);
        int i10 = xVar.i(2);
        boolean h10 = xVar.h();
        xVar.s(1);
        byte[] bArr2 = f0.f;
        if (i10 == 1) {
            xVar.s(xVar.i(8) * 16);
        } else if (i10 == 0) {
            int i11 = xVar.i(16);
            int i12 = xVar.i(16);
            if (i11 > 0) {
                bArr2 = new byte[i11];
                xVar.k(i11, bArr2);
            }
            if (i12 > 0) {
                bArr = new byte[i12];
                xVar.k(i12, bArr);
                return new c(bArr2, bArr, h10, i9);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, h10, i9);
    }
}
