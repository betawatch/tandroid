package x4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import h5.d0;
import h5.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public static byte[] a(int i10, int i11, v vVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) vVar.i(i11);
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
        boolean z4;
        int i14;
        int i15;
        byte[] bArr2;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i20;
        int i21;
        Paint paint2 = paint;
        v vVar = new v(bArr, bArr.length);
        int i22 = i11;
        int i23 = i12;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (vVar.b() != 0) {
            int i24 = 8;
            int i25 = vVar.i(8);
            if (i25 != 240) {
                int i26 = 3;
                int i27 = 2;
                int i28 = 4;
                switch (i25) {
                    case 16:
                        byte[] bArr6 = i10 == 3 ? bArr3 == null ? i : bArr3 : i10 == 2 ? bArr5 == null ? h : bArr5 : null;
                        boolean z12 = false;
                        while (true) {
                            int i29 = vVar.i(2);
                            if (i29 != 0) {
                                z4 = z12;
                                i13 = i29;
                            } else {
                                if (vVar.h()) {
                                    int i30 = vVar.i(3) + 3;
                                    z4 = z12;
                                    i13 = vVar.i(2);
                                    i14 = i30;
                                } else if (vVar.h()) {
                                    z4 = z12;
                                    i13 = 0;
                                } else {
                                    int i31 = vVar.i(2);
                                    if (i31 != 0) {
                                        if (i31 == 1) {
                                            z4 = z12;
                                            i13 = 0;
                                            i14 = 2;
                                        } else if (i31 == 2) {
                                            i14 = vVar.i(4) + 12;
                                            i13 = vVar.i(2);
                                            z4 = z12;
                                        } else if (i31 != 3) {
                                            z4 = z12;
                                            i13 = 0;
                                        } else {
                                            int i32 = vVar.i(8) + 29;
                                            i13 = vVar.i(2);
                                            z4 = z12;
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
                                        if (!z4) {
                                            vVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z12 = z4;
                                        }
                                    } else {
                                        i13 = 0;
                                        z4 = true;
                                    }
                                    i14 = 0;
                                    if (i14 != 0) {
                                    }
                                    i15 = i22;
                                    i22 = i15 + i14;
                                    if (!z4) {
                                    }
                                }
                                if (i14 != 0) {
                                }
                                i15 = i22;
                                i22 = i15 + i14;
                                if (!z4) {
                                }
                            }
                            i14 = 1;
                            if (i14 != 0) {
                            }
                            i15 = i22;
                            i22 = i15 + i14;
                            if (!z4) {
                            }
                        }
                    case 17:
                        if (i10 == 3) {
                            bArr2 = bArr4 == null ? j : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z13 = false;
                        while (true) {
                            int i33 = vVar.i(i28);
                            if (i33 != 0) {
                                z10 = z13;
                                i18 = i33;
                                i16 = 1;
                            } else if (vVar.h()) {
                                if (vVar.h()) {
                                    int i34 = vVar.i(i27);
                                    if (i34 == 0) {
                                        z10 = z13;
                                        i16 = 1;
                                    } else if (i34 != 1) {
                                        if (i34 == i27) {
                                            i16 = vVar.i(i28) + 9;
                                            i17 = vVar.i(i28);
                                        } else if (i34 != i26) {
                                            z10 = z13;
                                            i16 = 0;
                                        } else {
                                            i16 = vVar.i(i24) + 25;
                                            i17 = vVar.i(i28);
                                        }
                                        i18 = i17;
                                    } else {
                                        z10 = z13;
                                        i16 = 2;
                                    }
                                    i18 = 0;
                                } else {
                                    i16 = vVar.i(i27) + 4;
                                    i18 = vVar.i(i28);
                                }
                                z10 = z13;
                            } else {
                                int i35 = vVar.i(i26);
                                if (i35 != 0) {
                                    i16 = i35 + 2;
                                    z10 = z13;
                                    i18 = 0;
                                } else {
                                    z10 = true;
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
                            if (z10) {
                                vVar.c();
                                break;
                            } else {
                                z13 = z10;
                                i26 = 3;
                                i27 = 2;
                                i28 = 4;
                                i24 = 8;
                            }
                        }
                    case 18:
                        boolean z14 = false;
                        while (true) {
                            int i36 = vVar.i(8);
                            if (i36 != 0) {
                                z11 = z14;
                                i20 = 1;
                            } else if (vVar.h()) {
                                z11 = z14;
                                i20 = vVar.i(7);
                                i36 = vVar.i(8);
                            } else {
                                int i37 = vVar.i(7);
                                if (i37 != 0) {
                                    z11 = z14;
                                    i20 = i37;
                                    i36 = 0;
                                } else {
                                    i36 = 0;
                                    z11 = true;
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
                            if (z11) {
                                break;
                            } else {
                                z14 = z11;
                            }
                        }
                        break;
                    default:
                        switch (i25) {
                            case 32:
                                bArr5 = a(4, 4, vVar);
                                break;
                            case 33:
                                bArr3 = a(4, 8, vVar);
                                break;
                            case 34:
                                bArr4 = a(16, 8, vVar);
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

    public static a f(v vVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = vVar.i(8);
        vVar.s(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c3 = c();
        while (i19 > 0) {
            int i20 = vVar.i(i16);
            int i21 = vVar.i(i16);
            int[] iArr2 = (i21 & 128) != 0 ? iArr : (i21 & 64) != 0 ? b10 : c3;
            if ((i21 & 1) != 0) {
                i14 = vVar.i(i16);
                i15 = vVar.i(i16);
                i11 = vVar.i(i16);
                i13 = vVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i22 = vVar.i(6) << i18;
                int i23 = vVar.i(4) << 4;
                i11 = vVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = vVar.i(i18) << 6;
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
            iArr2[i20] = d((byte) (255 - (i13 & 255)), d0.h((int) ((1.402d * d10) + d), 0, 255), d0.h((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), d0.h((int) ((d11 * 1.772d) + d), 0, 255));
            i19 = i12;
            i17 = i17;
            c3 = c3;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr, b10, c3);
    }

    public static c g(v vVar) {
        byte[] bArr;
        int i10 = vVar.i(16);
        vVar.s(4);
        int i11 = vVar.i(2);
        boolean h9 = vVar.h();
        vVar.s(1);
        byte[] bArr2 = d0.f;
        if (i11 == 1) {
            vVar.s(vVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = vVar.i(16);
            int i13 = vVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                vVar.k(i12, bArr2);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                vVar.k(i13, bArr);
                return new c(bArr2, bArr, h9, i10);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, h9, i10);
    }
}
