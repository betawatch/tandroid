package tf;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import hh.oa;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.fe;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d {
    public final long[] a;
    public final CharSequence[] b;
    public final CharSequence[] c;
    public final StaticLayout[] d;
    public final StaticLayout[] e;
    public int f;
    public int g;
    public DecimalFormat h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tf.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(long j10, long j11, boolean z10, float f10, int i10, TextPaint textPaint, TextPaint textPaint2) {
        long j12;
        float f11;
        int i11;
        long max;
        int i12;
        long j13;
        long j14;
        long max2;
        int i13;
        int i14;
        int i15;
        ?? obj = new Object();
        obj.g = 255;
        if (z10) {
            long j15 = j10 - j11;
            if (j15 == 0) {
                j12 = j11 - 1;
                i11 = 3;
            } else {
                if (j15 >= 6) {
                    long j16 = j15 / 2;
                    if (j16 < 6) {
                        j12 = j11;
                        i11 = (int) ((j15 % 2) + j16 + 1);
                        f11 = 2.0f;
                    } else {
                        float f12 = j15 / 5.0f;
                        if (f12 <= 0.0f) {
                            max = Math.max(2L, j15 + 1);
                        } else {
                            j12 = j11;
                            f11 = f12;
                            i11 = 6;
                        }
                    }
                    obj.a = new long[i11];
                    obj.b = new CharSequence[i11];
                    obj.d = new StaticLayout[i11];
                    if (f10 > 0.0f) {
                        obj.c = new CharSequence[i11];
                        obj.e = new StaticLayout[i11];
                    }
                    boolean z11 = f11 / f10 >= 1.0f;
                    i12 = 0;
                    d dVar = obj;
                    while (i12 < i11) {
                        long j17 = ((long) (i12 * f11)) + j12;
                        dVar.a[i12] = j17;
                        dVar.b[i12] = dVar.b(0, textPaint, j17, i10);
                        if (f10 > 0.0f) {
                            float f13 = dVar.a[i12] / f10;
                            if (z11) {
                                long j18 = (long) f13;
                                if (f13 - j18 < 0.01f || i10 == 1 || i10 == 2) {
                                    dVar.c[i12] = dVar.b(1, textPaint2, j18, i10);
                                } else {
                                    dVar.c[i12] = "";
                                }
                            } else {
                                dVar.c[i12] = dVar.b(1, textPaint2, (long) f13, i10);
                            }
                        }
                        i12++;
                        dVar = this;
                    }
                    return;
                }
                max = Math.max(2L, j15 + 1);
                j12 = j11;
                i11 = (int) max;
            }
            f11 = 1.0f;
            obj.a = new long[i11];
            obj.b = new CharSequence[i11];
            obj.d = new StaticLayout[i11];
            if (f10 > 0.0f) {
            }
            if (f11 / f10 >= 1.0f) {
            }
            i12 = 0;
            d dVar2 = obj;
            while (i12 < i11) {
            }
            return;
        }
        if (j10 > 100) {
            j13 = 0;
            if ((j10 / 5) % 10.0f != 0.0f) {
                j14 = 10 * ((j10 / 10) + 1);
                max2 = Math.max(1L, (long) Math.ceil(j14 / 5.0d));
                if (j14 < 6) {
                    long j19 = j14 / 2;
                    if (j19 < 6) {
                        i13 = (int) (j19 + 1);
                        i15 = j14 % 2 != j13 ? i13 + 1 : i15;
                    } else {
                        i13 = 6;
                    }
                    obj.a = new long[i13];
                    obj.b = new CharSequence[i13];
                    obj.d = new StaticLayout[i13];
                    if (f10 > 0.0f) {
                        obj.c = new CharSequence[i13];
                        obj.e = new StaticLayout[i13];
                    }
                    boolean z12 = ((float) max2) / f10 < 1.0f;
                    i14 = 1;
                    while (i14 < i13) {
                        long j20 = i14 * max2;
                        obj.a[i14] = j20;
                        long j21 = max2;
                        obj.b[i14] = obj.b(0, textPaint, j20, i10);
                        if (f10 > 0.0f) {
                            float f14 = obj.a[i14] / f10;
                            if (z12) {
                                long j22 = (long) f14;
                                if (f14 - j22 < 0.01f || i10 == 1 || i10 == 2) {
                                    obj.c[i14] = obj.b(1, textPaint2, j22, i10);
                                } else {
                                    obj.c[i14] = "";
                                }
                            } else {
                                obj.c[i14] = obj.b(1, textPaint2, (long) f14, i10);
                            }
                        }
                        i14++;
                        max2 = j21;
                    }
                }
                i15 = (int) Math.max(2L, j14 + 1);
                i13 = i15;
                obj.a = new long[i13];
                obj.b = new CharSequence[i13];
                obj.d = new StaticLayout[i13];
                if (f10 > 0.0f) {
                }
                if (((float) max2) / f10 < 1.0f) {
                }
                i14 = 1;
                while (i14 < i13) {
                }
            }
        } else {
            j13 = 0;
        }
        j14 = j10;
        max2 = Math.max(1L, (long) Math.ceil(j14 / 5.0d));
        if (j14 < 6) {
        }
        i13 = i15;
        obj.a = new long[i13];
        obj.b = new CharSequence[i13];
        obj.d = new StaticLayout[i13];
        if (f10 > 0.0f) {
        }
        if (((float) max2) / f10 < 1.0f) {
        }
        i14 = 1;
        while (i14 < i13) {
        }
    }

    public final void a(Canvas canvas, int i10, int i11, float f10, float f11, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr = this.e;
        StaticLayout[] staticLayoutArr2 = this.d;
        StaticLayout staticLayout = (i10 == 0 ? staticLayoutArr2 : staticLayoutArr)[i11];
        if (staticLayout == null) {
            CharSequence charSequence = (i10 == 0 ? this.b : this.c)[i11];
            if (i10 == 0) {
                staticLayoutArr = staticLayoutArr2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i11] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f10, textPaint.ascent() + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i10, TextPaint textPaint, long j10, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return AndroidUtilities.formatWholeNumber((int) j10, 0);
            }
            if (i10 != 1) {
                return oa.X0(false, i0.a.m(j10, ' ', new StringBuilder("XTR ")), 0.65f, null);
            }
            return "≈" + BillingController.getInstance().formatCurrency(j10, "USD");
        }
        if (i10 == 1) {
            return "≈" + BillingController.getInstance().formatCurrency(j10, "USD");
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
        this.h.setMaximumFractionDigits(j10 <= 1000000000 ? 6 : 2);
        return fe.f0("TON " + this.h.format(j10 / 1.0E9d), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
    }
}
