package t4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import d5.g0;
import d5.y;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public h(int i10, int i11) {
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
        this.f = new g(i10, i11);
    }

    public static byte[] a(int i10, int i11, y yVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) yVar.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206 A[LOOP:3: B:86:0x0155->B:97:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int i13;
        boolean z10;
        int i14;
        int i15;
        byte[] bArr2;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z12;
        int i20;
        int i21;
        Paint paint2 = paint;
        y yVar = new y(bArr, bArr.length);
        int i22 = i11;
        int i23 = i12;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (yVar.b() != 0) {
            int i24 = 8;
            int i25 = yVar.i(8);
            if (i25 != 240) {
                int i26 = 3;
                int i27 = 2;
                int i28 = 4;
                switch (i25) {
                    case 16:
                        byte[] bArr6 = i10 == 3 ? bArr3 == null ? i : bArr3 : i10 == 2 ? bArr5 == null ? h : bArr5 : null;
                        boolean z13 = false;
                        while (true) {
                            int i29 = yVar.i(2);
                            if (i29 != 0) {
                                z10 = z13;
                                i13 = i29;
                            } else {
                                if (yVar.h()) {
                                    int i30 = yVar.i(3) + 3;
                                    z10 = z13;
                                    i13 = yVar.i(2);
                                    i14 = i30;
                                } else if (yVar.h()) {
                                    z10 = z13;
                                    i13 = 0;
                                } else {
                                    int i31 = yVar.i(2);
                                    if (i31 != 0) {
                                        if (i31 == 1) {
                                            z10 = z13;
                                            i13 = 0;
                                            i14 = 2;
                                        } else if (i31 == 2) {
                                            i14 = yVar.i(4) + 12;
                                            i13 = yVar.i(2);
                                            z10 = z13;
                                        } else if (i31 != 3) {
                                            z10 = z13;
                                            i13 = 0;
                                        } else {
                                            int i32 = yVar.i(8) + 29;
                                            i13 = yVar.i(2);
                                            z10 = z13;
                                            i14 = i32;
                                        }
                                        if (i14 != 0 || paint2 == null) {
                                            i15 = i22;
                                        } else {
                                            if (bArr6 != 0) {
                                                i13 = bArr6[i13];
                                            }
                                            paint2.setColor(iArr[i13]);
                                            i15 = i22;
                                            canvas.drawRect(i22, i23, i22 + i14, i23 + 1, paint2);
                                        }
                                        i22 = i15 + i14;
                                        if (!z10) {
                                            yVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z13 = z10;
                                        }
                                    } else {
                                        i13 = 0;
                                        z10 = true;
                                    }
                                    i14 = 0;
                                    if (i14 != 0) {
                                    }
                                    i15 = i22;
                                    i22 = i15 + i14;
                                    if (!z10) {
                                    }
                                }
                                if (i14 != 0) {
                                }
                                i15 = i22;
                                i22 = i15 + i14;
                                if (!z10) {
                                }
                            }
                            i14 = 1;
                            if (i14 != 0) {
                            }
                            i15 = i22;
                            i22 = i15 + i14;
                            if (!z10) {
                            }
                        }
                    case 17:
                        if (i10 == 3) {
                            bArr2 = bArr4 == null ? j : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z14 = false;
                        while (true) {
                            int i33 = yVar.i(i28);
                            if (i33 != 0) {
                                z11 = z14;
                                i18 = i33;
                                i16 = 1;
                            } else if (yVar.h()) {
                                if (yVar.h()) {
                                    int i34 = yVar.i(i27);
                                    if (i34 == 0) {
                                        z11 = z14;
                                        i16 = 1;
                                    } else if (i34 != 1) {
                                        if (i34 == i27) {
                                            i16 = yVar.i(i28) + 9;
                                            i17 = yVar.i(i28);
                                        } else if (i34 != i26) {
                                            z11 = z14;
                                            i16 = 0;
                                        } else {
                                            i16 = yVar.i(i24) + 25;
                                            i17 = yVar.i(i28);
                                        }
                                        i18 = i17;
                                    } else {
                                        z11 = z14;
                                        i16 = 2;
                                    }
                                    i18 = 0;
                                } else {
                                    i16 = yVar.i(i27) + 4;
                                    i18 = yVar.i(i28);
                                }
                                z11 = z14;
                            } else {
                                int i35 = yVar.i(i26);
                                if (i35 != 0) {
                                    i16 = i35 + 2;
                                    z11 = z14;
                                    i18 = 0;
                                } else {
                                    z11 = true;
                                    i16 = 0;
                                    i18 = 0;
                                }
                            }
                            if (i16 == 0 || paint2 == null) {
                                i19 = i22;
                            } else {
                                if (bArr2 != 0) {
                                    i18 = bArr2[i18];
                                }
                                paint2.setColor(iArr[i18]);
                                i19 = i22;
                                canvas.drawRect(i22, i23, i22 + i16, i23 + 1, paint2);
                            }
                            i22 = i19 + i16;
                            if (z11) {
                                yVar.c();
                                break;
                            } else {
                                z14 = z11;
                                i26 = 3;
                                i27 = 2;
                                i28 = 4;
                                i24 = 8;
                            }
                        }
                    case 18:
                        boolean z15 = false;
                        while (true) {
                            int i36 = yVar.i(8);
                            if (i36 != 0) {
                                z12 = z15;
                                i20 = 1;
                            } else if (yVar.h()) {
                                z12 = z15;
                                i20 = yVar.i(7);
                                i36 = yVar.i(8);
                            } else {
                                int i37 = yVar.i(7);
                                if (i37 != 0) {
                                    z12 = z15;
                                    i20 = i37;
                                    i36 = 0;
                                } else {
                                    i36 = 0;
                                    z12 = true;
                                    i20 = 0;
                                }
                            }
                            if (i20 == 0 || paint2 == null) {
                                i21 = i22;
                            } else {
                                paint2.setColor(iArr[i36]);
                                i21 = i22;
                                canvas.drawRect(i22, i23, i22 + i20, i23 + 1, paint2);
                            }
                            i22 = i21 + i20;
                            if (z12) {
                                break;
                            } else {
                                z15 = z12;
                            }
                        }
                        break;
                    default:
                        switch (i25) {
                            case 32:
                                bArr5 = a(4, 4, yVar);
                                break;
                            case 33:
                                bArr3 = a(4, 8, yVar);
                                break;
                            case 34:
                                bArr4 = a(16, 8, yVar);
                                break;
                        }
                }
            } else {
                i23 += 2;
                i22 = i11;
            }
            paint2 = paint;
        }
    }

    public static a f(y yVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = yVar.i(8);
        yVar.s(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i19 > 0) {
            int i20 = yVar.i(i16);
            int i21 = yVar.i(i16);
            int[] iArr2 = (i21 & 128) != 0 ? iArr : (i21 & 64) != 0 ? b10 : c10;
            if ((i21 & 1) != 0) {
                i14 = yVar.i(i16);
                i15 = yVar.i(i16);
                i11 = yVar.i(i16);
                i13 = yVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i22 = yVar.i(6) << i18;
                int i23 = yVar.i(4) << 4;
                i11 = yVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = yVar.i(i18) << 6;
                i14 = i22;
                i15 = i23;
            }
            if (i14 == 0) {
                i15 = 0;
                i11 = 0;
                i13 = 255;
            }
            double d = i14;
            double d10 = i15 - 128;
            double d11 = i11 - 128;
            iArr2[i20] = d((byte) (255 - (i13 & 255)), g0.h((int) ((1.402d * d10) + d), 0, 255), g0.h((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), g0.h((int) ((d11 * 1.772d) + d), 0, 255));
            i19 = i12;
            i17 = i17;
            c10 = c10;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr, b10, c10);
    }

    public static c g(y yVar) {
        byte[] bArr;
        int i10 = yVar.i(16);
        yVar.s(4);
        int i11 = yVar.i(2);
        boolean h10 = yVar.h();
        yVar.s(1);
        byte[] bArr2 = g0.f;
        if (i11 == 1) {
            yVar.s(yVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = yVar.i(16);
            int i13 = yVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                yVar.k(i12, bArr2);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                yVar.k(i13, bArr);
                return new c(bArr2, bArr, h10, i10);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, h10, i10);
    }
}
