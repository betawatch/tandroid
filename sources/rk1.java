// default package

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rk1 {
    public final long[] a;
    public final CharSequence[] b;
    public final CharSequence[] c;
    public final StaticLayout[] d;
    public final StaticLayout[] e;
    public int f;
    public int g;
    public DecimalFormat h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rk1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rk1(long j, long j2, boolean z, float f, int i, TextPaint textPaint, TextPaint textPaint2) {
        long j3;
        float f2;
        int i2;
        long max;
        int i3;
        long j4;
        long j5;
        long max2;
        int i4;
        int i5;
        int i6;
        ?? obj = new Object();
        obj.g = jn7.d4;
        if (z) {
            long j6 = j - j2;
            if (j6 == 0) {
                j3 = j2 - 1;
                i2 = 3;
            } else {
                if (j6 >= 6) {
                    long j7 = j6 / 2;
                    if (j7 < 6) {
                        j3 = j2;
                        i2 = (int) ((j6 % 2) + j7 + 1);
                        f2 = 2.0f;
                    } else {
                        float f3 = j6 / 5.0f;
                        if (f3 <= 0.0f) {
                            max = Math.max(2L, j6 + 1);
                        } else {
                            j3 = j2;
                            f2 = f3;
                            i2 = 6;
                        }
                    }
                    obj.a = new long[i2];
                    obj.b = new CharSequence[i2];
                    obj.d = new StaticLayout[i2];
                    if (f > 0.0f) {
                        obj.c = new CharSequence[i2];
                        obj.e = new StaticLayout[i2];
                    }
                    boolean z2 = f2 / f >= 1.0f;
                    i3 = 0;
                    rk1 rk1Var = obj;
                    while (i3 < i2) {
                        long j8 = ((long) (i3 * f2)) + j3;
                        rk1Var.a[i3] = j8;
                        rk1Var.b[i3] = rk1Var.b(0, textPaint, j8, i);
                        if (f > 0.0f) {
                            float f4 = rk1Var.a[i3] / f;
                            if (z2) {
                                long j9 = (long) f4;
                                if (f4 - j9 < 0.01f || i == 1 || i == 2) {
                                    rk1Var.c[i3] = rk1Var.b(1, textPaint2, j9, i);
                                } else {
                                    rk1Var.c[i3] = "";
                                }
                            } else {
                                rk1Var.c[i3] = rk1Var.b(1, textPaint2, (long) f4, i);
                            }
                        }
                        i3++;
                        rk1Var = this;
                    }
                    return;
                }
                max = Math.max(2L, j6 + 1);
                j3 = j2;
                i2 = (int) max;
            }
            f2 = 1.0f;
            obj.a = new long[i2];
            obj.b = new CharSequence[i2];
            obj.d = new StaticLayout[i2];
            if (f > 0.0f) {
            }
            if (f2 / f >= 1.0f) {
            }
            i3 = 0;
            rk1 rk1Var2 = obj;
            while (i3 < i2) {
            }
            return;
        }
        if (j > 100) {
            j4 = 0;
            if ((j / 5) % 10.0f != 0.0f) {
                j5 = 10 * ((j / 10) + 1);
                max2 = Math.max(1L, (long) Math.ceil(j5 / 5.0d));
                if (j5 < 6) {
                    long j10 = j5 / 2;
                    if (j10 < 6) {
                        i4 = (int) (j10 + 1);
                        i6 = j5 % 2 != j4 ? i4 + 1 : i6;
                    } else {
                        i4 = 6;
                    }
                    obj.a = new long[i4];
                    obj.b = new CharSequence[i4];
                    obj.d = new StaticLayout[i4];
                    if (f > 0.0f) {
                        obj.c = new CharSequence[i4];
                        obj.e = new StaticLayout[i4];
                    }
                    boolean z3 = ((float) max2) / f < 1.0f;
                    i5 = 1;
                    while (i5 < i4) {
                        long j11 = i5 * max2;
                        obj.a[i5] = j11;
                        long j12 = max2;
                        obj.b[i5] = obj.b(0, textPaint, j11, i);
                        if (f > 0.0f) {
                            float f5 = obj.a[i5] / f;
                            if (z3) {
                                long j13 = (long) f5;
                                if (f5 - j13 < 0.01f || i == 1 || i == 2) {
                                    obj.c[i5] = obj.b(1, textPaint2, j13, i);
                                } else {
                                    obj.c[i5] = "";
                                }
                            } else {
                                obj.c[i5] = obj.b(1, textPaint2, (long) f5, i);
                            }
                        }
                        i5++;
                        max2 = j12;
                    }
                }
                i6 = (int) Math.max(2L, j5 + 1);
                i4 = i6;
                obj.a = new long[i4];
                obj.b = new CharSequence[i4];
                obj.d = new StaticLayout[i4];
                if (f > 0.0f) {
                }
                if (((float) max2) / f < 1.0f) {
                }
                i5 = 1;
                while (i5 < i4) {
                }
            }
        } else {
            j4 = 0;
        }
        j5 = j;
        max2 = Math.max(1L, (long) Math.ceil(j5 / 5.0d));
        if (j5 < 6) {
        }
        i4 = i6;
        obj.a = new long[i4];
        obj.b = new CharSequence[i4];
        obj.d = new StaticLayout[i4];
        if (f > 0.0f) {
        }
        if (((float) max2) / f < 1.0f) {
        }
        i5 = 1;
        while (i5 < i4) {
        }
    }

    public final void a(Canvas canvas, int i, int i2, float f, float f2, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr = this.e;
        StaticLayout[] staticLayoutArr2 = this.d;
        StaticLayout staticLayout = (i == 0 ? staticLayoutArr2 : staticLayoutArr)[i2];
        if (staticLayout == null) {
            CharSequence charSequence = (i == 0 ? this.b : this.c)[i2];
            if (i == 0) {
                staticLayoutArr = staticLayoutArr2;
            }
            staticLayout = new StaticLayout(charSequence, textPaint, hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i2] = staticLayout;
        }
        canvas.save();
        canvas.translate(f, textPaint.ascent() + f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i, TextPaint textPaint, long j, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return hl.o0((int) j, 0);
            }
            if (i != 1) {
                return nza.b1(false, "XTR ".concat(ob6.E(j, ' ')), 0.65f, null);
            }
            return "≈" + di0.h().e(j, "USD");
        }
        if (i == 1) {
            return "≈" + di0.h().e(j, "USD");
        }
        if (this.h == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.h = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            this.h.setMaximumFractionDigits(6);
            this.h.setGroupingUsed(false);
        }
        this.h.setMaximumFractionDigits(j <= 1000000000 ? 6 : 2);
        return ij1.L("TON " + this.h.format(j / 1.0E9d), textPaint, 0.8f, -hl.L(0.66f), false);
    }
}
