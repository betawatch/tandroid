package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h5 extends ViewGroup {
    public final RectF A;
    public final Path B;
    public final y5 C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public w5 a;
    public final b6 b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public g5 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final Paint x;
    public final RectF y;

    public h5(Context context, b6 b6Var) {
        super(context);
        this.c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f = new int[0];
        Paint paint = new Paint(1);
        this.n = paint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.y = new RectF();
        this.A = new RectF();
        this.B = new Path();
        this.b = b6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.C = new y5(this, 0L, 220L, gr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        TL_iv.pageTableCell pagetablecell;
        w5 w5Var = this.a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (w5Var != null && w5Var.b != 0 && w5Var.c != 0) {
            View findFocus = findFocus();
            for (ViewParent parent = findFocus == null ? null : findFocus.getParent(); parent != null && parent != this; parent = parent.getParent()) {
                if (parent instanceof i5) {
                    pagetablecell = ((i5) parent).b;
                    break;
                }
            }
            pagetablecell = null;
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.h == null) {
                return null;
            }
            ArrayList arrayList = this.a.g;
            int size = arrayList.size();
            int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((kh.p) this.h).b).contains(pagetablecell3)) {
                    int b10 = this.a.b(pagetablecell3);
                    int a2 = this.a.a(pagetablecell3);
                    if (b10 < i9 || (b10 == i9 && a2 < i10)) {
                        pagetablecell2 = pagetablecell3;
                        i9 = b10;
                        i10 = a2;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i9 = f6.qh;
        b6 b6Var = this.b;
        this.n.setColor(f6.v0(i9, b6Var));
        int v02 = f6.v0(f6.M6, b6Var);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.r.setColor(f6.v0(f6.ph, b6Var));
        this.s.setColor(Color.argb(20, red, green, blue));
        this.D = 255;
        int i10 = f6.Oh;
        this.v.setColor(f6.v0(i10, b6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.w;
        paint.setStyle(style);
        this.K = f6.v0(f6.E6, b6Var);
        this.L = f6.v0(f6.Sh, b6Var);
        paint.setColor(this.K);
        Paint paint2 = this.x;
        paint2.setStyle(style);
        paint2.setColor(f6.v0(i10, b6Var));
        invalidate();
    }

    public final boolean c(int i9, int i10) {
        if (i9 < 0 || i10 < i9) {
            return false;
        }
        while (i9 <= i10) {
            if (!n(i9)) {
                return false;
            }
            i9++;
        }
        return true;
    }

    public final boolean d(int i9, int i10) {
        if (i9 < 0 || i10 < i9) {
            return false;
        }
        while (i9 <= i10) {
            if (!o(i9)) {
                return false;
            }
            i9++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        int b10;
        int min;
        int i9;
        int i10;
        int min2;
        float f11;
        w5 w5Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TL_iv.pageBlockTable pageblocktable;
        Canvas canvas3 = canvas;
        this.F = false;
        this.E = false;
        TL_iv.pageTableCell a2 = a();
        if (a2 != null) {
            int b11 = this.a.b(a2);
            int a3 = this.a.a(a2);
            if (b11 >= 0 && a3 >= 0) {
                int i16 = a2.rowspan;
                if (i16 == 0) {
                    i16 = 1;
                }
                int i17 = a2.colspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                if (o(b11)) {
                    this.E = true;
                    int[] iArr = this.f;
                    this.G = iArr[b11];
                    this.H = iArr[Math.min(b11 + i16, this.a.b)];
                }
                if (n(a3)) {
                    this.F = true;
                    int[] iArr2 = this.e;
                    this.I = iArr2[a3];
                    this.J = iArr2[Math.min(a3 + i17, this.a.c)];
                }
            }
        }
        w5 w5Var2 = this.a;
        RectF rectF = this.y;
        if (w5Var2 != null && w5Var2.b != 0 && w5Var2.c != 0) {
            TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
            boolean z10 = pageblocktable2 != null && pageblocktable2.striped;
            canvas3.save();
            float f12 = this.e[0];
            float f13 = this.f[0];
            w5 w5Var3 = this.a;
            rectF.set(f12, f13, r2[w5Var3.c], r4[w5Var3.b]);
            Path path = this.B;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dpf2(10.0f), AndroidUtilities.dpf2(10.0f), Path.Direction.CW);
            canvas3.clipPath(path);
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                View childAt = getChildAt(i18);
                if (childAt instanceof i5) {
                    i5 i5Var = (i5) childAt;
                    int b12 = this.a.b(i5Var.b);
                    int a10 = this.a.a(i5Var.b);
                    if (b12 >= 0 && a10 >= 0) {
                        int n10 = w5.n(i5Var.b);
                        int o6 = w5.o(i5Var.b);
                        int[] iArr3 = this.e;
                        int i19 = iArr3[a10];
                        int i20 = this.f[b12];
                        int i21 = iArr3[Math.min(a10 + n10, this.a.c)];
                        int i22 = this.f[Math.min(o6 + b12, this.a.b)];
                        if (i5Var.b.header) {
                            canvas3.drawRect(i19, i20, i21, i22, this.r);
                        } else if (z10 && b12 % 2 == 0) {
                            canvas3 = canvas;
                            canvas3.drawRect(i19, i20, i21, i22, this.s);
                        }
                        canvas3 = canvas;
                    }
                }
            }
            canvas3.restore();
        }
        super.dispatchDraw(canvas);
        if (l()) {
            int k10 = k();
            int r10 = r();
            int j10 = j();
            int q10 = q();
            if (d(k10, r10)) {
                int[] iArr4 = this.f;
                h(canvas3, iArr4[k10], iArr4[r10 + 1]);
            }
            if (c(j10, q10)) {
                int[] iArr5 = this.e;
                g(canvas3, iArr5[j10], iArr5[q10 + 1]);
            }
        } else {
            if (this.E) {
                h(canvas3, this.G, this.H);
            }
            if (this.F) {
                g(canvas3, this.I, this.J);
            }
        }
        w5 w5Var4 = this.a;
        if (w5Var4 != null && (pageblocktable = w5Var4.a) != null && pageblocktable.bordered) {
            Paint paint = this.n;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float dpf2 = AndroidUtilities.dpf2(10.0f);
            int[] iArr6 = this.e;
            int[] iArr7 = this.f;
            w5 w5Var5 = this.a;
            rectF.set(iArr6[0] + strokeWidth, iArr7[0] + strokeWidth, iArr6[w5Var5.c] - strokeWidth, iArr7[w5Var5.b] - strokeWidth);
            canvas3.drawRoundRect(rectF, dpf2, dpf2, paint);
            int i23 = 1;
            while (i23 < this.a.c) {
                int i24 = this.e[i23];
                int i25 = -1;
                int i26 = 0;
                while (true) {
                    w5 w5Var6 = this.a;
                    if (i26 >= w5Var6.b) {
                        break;
                    }
                    TL_iv.pageTableCell[] pagetablecellArr = w5Var6.d[i26];
                    if (pagetablecellArr[i23 - 1] != pagetablecellArr[i23]) {
                        if (i25 < 0) {
                            i25 = this.f[i26];
                        }
                    } else if (i25 >= 0) {
                        float f14 = i24;
                        canvas3.drawLine(f14, i25, f14, this.f[i26], paint);
                        i25 = -1;
                    }
                    i26++;
                    canvas3 = canvas;
                }
                if (i25 >= 0) {
                    float f15 = i24;
                    canvas.drawLine(f15, i25, f15, this.f[r4], paint);
                }
                i23++;
                canvas3 = canvas;
            }
            for (int i27 = 1; i27 < this.a.b; i27++) {
                int i28 = this.f[i27];
                int i29 = -1;
                int i30 = 0;
                while (true) {
                    w5 w5Var7 = this.a;
                    if (i30 >= w5Var7.c) {
                        break;
                    }
                    TL_iv.pageTableCell[][] pagetablecellArr2 = w5Var7.d;
                    if (pagetablecellArr2[i27 - 1][i30] != pagetablecellArr2[i27][i30]) {
                        if (i29 < 0) {
                            i29 = this.e[i30];
                        }
                    } else if (i29 >= 0) {
                        float f16 = i28;
                        canvas.drawLine(i29, f16, this.e[i30], f16, paint);
                        i29 = -1;
                    }
                    i30++;
                }
                if (i29 >= 0) {
                    float f17 = i29;
                    float f18 = i28;
                    canvas.drawLine(f17, f18, this.e[r3], f18, paint);
                }
            }
        }
        if (this.a != null) {
            float d = this.C.d(l() ? 1.0f : 0.0f, false);
            if (d > 0.001f) {
                Paint paint2 = this.v;
                paint2.setAlpha((int) (this.D * d));
                paint2.setStrokeWidth(Math.max(0.4f, d) * AndroidUtilities.dpf2(2.0f));
                int i31 = 0;
                while (true) {
                    int i32 = this.a.b;
                    if (i31 > i32) {
                        break;
                    }
                    int i33 = i31 < i32 ? this.f[i31] : this.f[i32];
                    int i34 = -1;
                    int i35 = 0;
                    while (true) {
                        i14 = this.a.c;
                        if (i35 >= i14) {
                            break;
                        }
                        if (p(i31 - 1, i35) != p(i31, i35)) {
                            if (i34 < 0) {
                                i34 = this.e[i35];
                            }
                        } else if (i34 >= 0) {
                            int i36 = this.e[i35];
                            if (i36 > i34) {
                                float f19 = f(i34, i33) + i34;
                                float f20 = i36 - f(i36, i33);
                                if (f20 > f19) {
                                    float f21 = i33;
                                    canvas.drawLine(f19, f21, f20, f21, paint2);
                                }
                            }
                            i34 = -1;
                        }
                        i35++;
                    }
                    if (i34 >= 0 && (i15 = this.e[i14]) > i34) {
                        float f22 = f(i34, i33) + i34;
                        float f23 = i15 - f(i15, i33);
                        if (f23 > f22) {
                            float f24 = i33;
                            canvas.drawLine(f22, f24, f23, f24, paint2);
                        }
                    }
                    i31++;
                }
                int i37 = 0;
                while (true) {
                    w5Var = this.a;
                    i11 = w5Var.c;
                    if (i37 > i11) {
                        break;
                    }
                    int[] iArr8 = this.e;
                    int i38 = i37 < i11 ? iArr8[i37] : iArr8[i11];
                    int i39 = -1;
                    int i40 = 0;
                    while (true) {
                        i12 = this.a.b;
                        if (i40 >= i12) {
                            break;
                        }
                        if (p(i40, i37 - 1) != p(i40, i37)) {
                            if (i39 < 0) {
                                i39 = this.f[i40];
                            }
                        } else if (i39 >= 0) {
                            int i41 = this.f[i40];
                            if (i41 > i39) {
                                float f25 = i39 + f(i38, i39);
                                float f26 = i41 - f(i38, i41);
                                if (f26 > f25) {
                                    float f27 = i38;
                                    canvas.drawLine(f27, f25, f27, f26, paint2);
                                }
                            }
                            i39 = -1;
                        }
                        i40++;
                    }
                    if (i39 >= 0 && (i13 = this.f[i12]) > i39) {
                        float f28 = i39 + f(i38, i39);
                        float f29 = i13 - f(i38, i13);
                        if (f29 > f28) {
                            float f30 = i38;
                            canvas.drawLine(f30, f28, f30, f29, paint2);
                            i37++;
                        }
                    }
                    i37++;
                }
                canvas2 = canvas;
                int i42 = w5Var.b;
                i(canvas2, this.e[0], this.f[0], 180.0f);
                i(canvas2, this.e[i11], this.f[0], 270.0f);
                i(canvas2, this.e[0], this.f[i42], 90.0f);
                i(canvas2, this.e[i11], this.f[i42], 0.0f);
                if (this.a != null) {
                    return;
                }
                float dpf22 = AndroidUtilities.dpf2(3.0f) / 2.0f;
                float dp = AndroidUtilities.dp(8.0f);
                float dp2 = (this.e[0] - AndroidUtilities.dp(6.0f)) - dpf22;
                float dp3 = AndroidUtilities.dp(6.0f) + this.f[this.a.b] + dpf22;
                boolean l10 = l();
                Paint paint3 = this.w;
                if (!l10) {
                    TL_iv.pageTableCell a11 = a();
                    if (a11 == null) {
                        return;
                    }
                    int b13 = this.a.b(a11);
                    int a12 = this.a.a(a11);
                    if (b13 < 0 || a12 < 0) {
                        return;
                    }
                    int i43 = a11.rowspan;
                    if (i43 == 0) {
                        i43 = 1;
                    }
                    int i44 = a11.colspan;
                    if (i44 == 0) {
                        i44 = 1;
                    }
                    int[] iArr9 = this.f;
                    float f31 = (iArr9[b13] + iArr9[Math.min(b13 + i43, this.a.b)]) / 2.0f;
                    paint3.setColor(this.E ? this.L : this.K);
                    for (int i45 = -1; i45 <= 1; i45++) {
                        canvas2.drawCircle(dp2, (i45 * dp) + f31, dpf22, paint3);
                    }
                    int[] iArr10 = this.e;
                    float f32 = (iArr10[a12] + iArr10[Math.min(a12 + i44, this.a.c)]) / 2.0f;
                    paint3.setColor(this.F ? this.L : this.K);
                    for (int i46 = -1; i46 <= 1; i46++) {
                        canvas2.drawCircle((i46 * dp) + f32, dp3, dpf22, paint3);
                    }
                    return;
                }
                int k11 = k();
                int r11 = r();
                int j11 = j();
                int q11 = q();
                if (k11 < 0 || j11 < 0) {
                    return;
                }
                TL_iv.pageTableCell a13 = a();
                boolean v = v();
                if (a13 == null) {
                    b10 = k11;
                    f10 = 2.0f;
                } else {
                    f10 = 2.0f;
                    b10 = this.a.b(a13);
                }
                if (a13 == null) {
                    min = b10 + 1;
                } else {
                    int i47 = a13.rowspan;
                    if (i47 == 0) {
                        i47 = 1;
                    }
                    min = Math.min(i47 + b10, this.a.b);
                }
                if (v) {
                    int[] iArr11 = this.f;
                    i9 = iArr11[k11];
                    i10 = iArr11[r11 + 1];
                } else {
                    int[] iArr12 = this.f;
                    i9 = iArr12[b10];
                    i10 = iArr12[min];
                }
                float f33 = (i9 + i10) / f10;
                paint3.setColor((v && d(k11, r11)) ? this.L : this.K);
                for (int i48 = -1; i48 <= 1; i48++) {
                    canvas2.drawCircle(dp2, (i48 * dp) + f33, dpf22, paint3);
                }
                boolean u10 = u();
                int a14 = a13 == null ? j11 : this.a.a(a13);
                if (a13 == null) {
                    min2 = a14 + 1;
                } else {
                    int i49 = a13.colspan;
                    if (i49 == 0) {
                        i49 = 1;
                    }
                    min2 = Math.min(i49 + a14, this.a.c);
                }
                if (u10) {
                    int[] iArr13 = this.e;
                    f11 = iArr13[j11] + iArr13[q11 + 1];
                } else {
                    int[] iArr14 = this.e;
                    f11 = iArr14[a14] + iArr14[min2];
                }
                float f34 = f11 / f10;
                paint3.setColor((u10 && c(j11, q11)) ? this.L : this.K);
                for (int i50 = -1; i50 <= 1; i50++) {
                    canvas2.drawCircle((i50 * dp) + f34, dp3, dpf22, paint3);
                }
                return;
            }
        }
        canvas2 = canvas;
        if (this.a != null) {
        }
    }

    public final boolean e(int i9) {
        if (i9 >= 0 && i9 < this.a.c) {
            for (int i10 = 0; i10 < this.a.b; i10++) {
                if (p(i10, i9)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i9, int i10) {
        int i11;
        int i12;
        w5 w5Var = this.a;
        int i13 = w5Var.c;
        int i14 = w5Var.b;
        int[] iArr = this.e;
        if (i9 != iArr[0]) {
            i11 = i9 == iArr[i13] ? i13 - 1 : 0;
            return 0.0f;
        }
        int[] iArr2 = this.f;
        if (i10 != iArr2[0]) {
            i12 = i10 == iArr2[i14] ? i14 - 1 : 0;
            return 0.0f;
        }
        if (i11 >= 0 && i12 >= 0 && p(i12, i11)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.c[i11], this.d[i12]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i9, int i10) {
        float dpf2 = i9 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i10;
        float f10 = this.f[this.a.b];
        float dp = AndroidUtilities.dp(16.0f) + f10;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f11 = f(i9, this.f[this.a.b]);
        float f12 = f(i10, this.f[this.a.b]);
        Path path = this.B;
        path.rewind();
        path.moveTo(dpf2, f10 - f11);
        path.lineTo(dpf2, dp - min);
        float f13 = min * 2.0f;
        float f14 = dp - f13;
        RectF rectF = this.A;
        rectF.set(dpf2, f14, dpf2 + f13, dp);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(dpf22 - min, dp);
        rectF.set(dpf22 - f13, f14, dpf22, dp);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(dpf22, f10 - f12);
        if (f12 > 0.0f) {
            float f15 = f12 * 2.0f;
            rectF.set(dpf22 - f15, f10 - f15, dpf22, f10);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(dpf22, f10);
        }
        path.lineTo(dpf2 + f11, f10);
        if (f11 > 0.0f) {
            float f16 = f11 * 2.0f;
            rectF.set(dpf2, f10 - f16, f16 + dpf2, f10);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(dpf2, f10);
        }
        path.close();
        canvas.drawPath(path, this.x);
    }

    public w5 getModel() {
        return this.a;
    }

    public final void h(Canvas canvas, int i9, int i10) {
        float dpf2 = i9 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i10;
        float dp = this.e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(this.e[0], i9);
        float f11 = f(this.e[0], i10);
        Path path = this.B;
        path.rewind();
        path.moveTo(this.e[0] + f10, dpf2);
        path.lineTo(dp + min, dpf2);
        float f12 = min * 2.0f;
        float f13 = dp + f12;
        RectF rectF = this.A;
        rectF.set(dp, dpf2, f13, dpf2 + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f12, f13, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f11, dpf22);
        if (f11 > 0.0f) {
            int i11 = this.e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i11, dpf22 - f14, i11 + f14, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf22);
        }
        path.lineTo(this.e[0], dpf2 + f10);
        if (f10 > 0.0f) {
            int i12 = this.e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i12, dpf2, i12 + f15, f15 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.x);
    }

    public final void i(Canvas canvas, int i9, int i10, float f10) {
        float f11 = f(i9, i10);
        if (f11 <= 0.0f) {
            return;
        }
        float f12 = i9 == this.e[0] ? i9 + f11 : i9 - f11;
        float f13 = i10 == this.f[0] ? i10 + f11 : i10 - f11;
        RectF rectF = this.A;
        rectF.set(f12 - f11, f13 - f11, f12 + f11, f13 + f11);
        canvas.drawArc(rectF, f10, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i9 = 0; i9 < this.a.c; i9++) {
            if (e(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i9 = 0; i9 < this.a.b; i9++) {
            if (t(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final boolean l() {
        w5 w5Var = this.a;
        if (w5Var != null && this.h != null) {
            ArrayList arrayList = w5Var.g;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                if (((LinkedHashSet) ((kh.p) this.h).b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final i5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof i5) {
                i5 i5Var = (i5) childAt;
                if (i5Var.b == pagetablecell) {
                    return i5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i9) {
        if (i9 < 0 || i9 >= this.a.c) {
            return false;
        }
        for (int i10 = 0; i10 < this.a.b; i10++) {
            if (!p(i10, i9)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i9) {
        if (i9 < 0 || i9 >= this.a.b) {
            return false;
        }
        for (int i10 = 0; i10 < this.a.c; i10++) {
            if (!p(i9, i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        if (this.a == null) {
            return;
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof i5) {
                i5 i5Var = (i5) childAt;
                int b10 = this.a.b(i5Var.b);
                int a2 = this.a.a(i5Var.b);
                if (b10 >= 0 && a2 >= 0) {
                    int i14 = this.e[a2];
                    int i15 = this.f[b10];
                    i5Var.layout(i14, i15, i5Var.getMeasuredWidth() + i14, i5Var.getMeasuredHeight() + i15);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int a2;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(10.0f);
        w5 w5Var = this.a;
        if (w5Var == null || w5Var.b == 0 || w5Var.c == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), dp2 + dp4);
            this.c = new int[0];
            this.d = new int[0];
            this.e = new int[0];
            this.f = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i9) - dp) - dp3;
        w5 w5Var2 = this.a;
        int i15 = w5Var2.b;
        int i16 = w5Var2.c;
        this.c = new int[i16];
        this.d = new int[i15];
        int dp5 = AndroidUtilities.dp(w5Var2.a.compact ? 20.0f : 50.0f);
        int i17 = this.a.a.compact ? 5 : 12;
        int b10 = i16 == 2 ? org.telegram.messenger.l0.b(i17 * 4, size / 2, 0) : Math.max(0, Math.round(size / 1.5f));
        float f10 = i17 * 2;
        int z10 = org.telegram.messenger.l0.z(f10, b10, dp5);
        for (int i18 = 0; i18 < i16; i18++) {
            this.c[i18] = dp5;
        }
        int i19 = 0;
        while (true) {
            i11 = 1;
            if (i19 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i19);
            if (childAt instanceof i5) {
                i5 i5Var = (i5) childAt;
                d1 d1Var = i5Var.a;
                if (w5.n(i5Var.b) == 1 && (a2 = this.a.a(i5Var.b)) >= 0 && a2 < i16) {
                    int dp6 = AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(d1Var.getText(), d1Var.getPaint()));
                    int[] iArr = this.c;
                    iArr[a2] = Math.max(iArr[a2], Math.min(z10, dp6));
                }
            }
            i19++;
        }
        int i20 = 0;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof i5) {
                i5 i5Var2 = (i5) childAt2;
                d1 d1Var2 = i5Var2.a;
                int n10 = w5.n(i5Var2.b);
                if (n10 > i11) {
                    int a3 = this.a.a(i5Var2.b);
                    int min = Math.min(i16, n10 + a3);
                    if (a3 >= 0 && a3 < min) {
                        int i21 = 0;
                        for (int i22 = a3; i22 < min; i22++) {
                            i21 += this.c[i22];
                        }
                        int min2 = Math.min((min - a3) * z10, AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(d1Var2.getText(), d1Var2.getPaint()))) - i21;
                        while (a3 < min && min2 > 0) {
                            int i23 = ((min2 + r14) - 1) / (min - a3);
                            int[] iArr2 = this.c;
                            iArr2[a3] = iArr2[a3] + i23;
                            min2 -= i23;
                            a3++;
                        }
                    }
                    i20++;
                    i11 = 1;
                }
            }
            i20++;
            i11 = 1;
        }
        int i24 = 0;
        for (int i25 : this.c) {
            i24 += i25;
        }
        if (i24 < size && i16 > 0) {
            int i26 = size - i24;
            int i27 = 0;
            while (i27 < i16) {
                int round = i27 == i16 + (-1) ? i26 : Math.round((this.c[i27] * i26) / i24);
                int[] iArr3 = this.c;
                int i28 = iArr3[i27] + round;
                iArr3[i27] = i28;
                i26 -= round;
                i24 -= i28 - round;
                i27++;
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i29 = 0;
        while (i29 < getChildCount()) {
            View childAt3 = getChildAt(i29);
            if (childAt3 instanceof i5) {
                i5 i5Var3 = (i5) childAt3;
                int b11 = this.a.b(i5Var3.b);
                int a10 = this.a.a(i5Var3.b);
                int n11 = w5.n(i5Var3.b);
                i14 = i29;
                int i30 = 0;
                for (int i31 = a10; i31 < a10 + n11 && i31 < i16; i31++) {
                    i30 += this.c[i31];
                }
                i5Var3.measure(View.MeasureSpec.makeMeasureSpec(i30, TLObject.FLAG_30), makeMeasureSpec);
                if (w5.o(i5Var3.b) == 1) {
                    int measuredHeight = i5Var3.getMeasuredHeight();
                    int[] iArr4 = this.d;
                    if (measuredHeight > iArr4[b11]) {
                        iArr4[b11] = i5Var3.getMeasuredHeight();
                    }
                }
            } else {
                i14 = i29;
            }
            i29 = i14 + 1;
        }
        for (int i32 = 0; i32 < getChildCount(); i32++) {
            View childAt4 = getChildAt(i32);
            if (childAt4 instanceof i5) {
                i5 i5Var4 = (i5) childAt4;
                int b12 = this.a.b(i5Var4.b);
                int o6 = w5.o(i5Var4.b);
                if (o6 > 1) {
                    int i33 = b12;
                    int i34 = 0;
                    while (true) {
                        i13 = b12 + o6;
                        if (i33 >= i13 || i33 >= i15) {
                            break;
                        }
                        i34 += this.d[i33];
                        i33++;
                    }
                    int measuredHeight2 = i5Var4.getMeasuredHeight();
                    if (measuredHeight2 > i34) {
                        int i35 = measuredHeight2 - i34;
                        int max = i35 / Math.max(o6, 1);
                        int max2 = i35 % Math.max(o6, 1);
                        while (b12 < i13 && b12 < i15) {
                            int[] iArr5 = this.d;
                            iArr5[b12] = max + (max2 > 0 ? 1 : 0) + iArr5[b12];
                            if (max2 > 0) {
                                max2--;
                            }
                            b12++;
                        }
                    }
                }
            }
        }
        int i36 = 0;
        while (i36 < getChildCount()) {
            View childAt5 = getChildAt(i36);
            if (childAt5 instanceof i5) {
                i5 i5Var5 = (i5) childAt5;
                int b13 = this.a.b(i5Var5.b);
                int a11 = this.a.a(i5Var5.b);
                int n12 = w5.n(i5Var5.b);
                int o9 = w5.o(i5Var5.b);
                i12 = i36;
                int i37 = 0;
                for (int i38 = a11; i38 < a11 + n12 && i38 < i16; i38++) {
                    i37 += this.c[i38];
                }
                int i39 = 0;
                for (int i40 = b13; i40 < b13 + o9 && i40 < i15; i40++) {
                    i39 += this.d[i40];
                }
                i5Var5.measure(View.MeasureSpec.makeMeasureSpec(i37, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i39, TLObject.FLAG_30));
            } else {
                i12 = i36;
            }
            i36 = i12 + 1;
        }
        int[] iArr6 = new int[i16 + 1];
        this.e = iArr6;
        iArr6[0] = dp;
        int i41 = 0;
        while (i41 < i16) {
            int[] iArr7 = this.e;
            int i42 = i41 + 1;
            iArr7[i42] = iArr7[i41] + this.c[i41];
            i41 = i42;
        }
        int[] iArr8 = new int[i15 + 1];
        this.f = iArr8;
        iArr8[0] = dp2;
        int i43 = 0;
        while (i43 < i15) {
            int[] iArr9 = this.f;
            int i44 = i43 + 1;
            iArr9[i44] = iArr9[i43] + this.d[i43];
            i43 = i44;
        }
        setMeasuredDimension(Math.max(this.e[i16] + dp3, size + dp + dp3), this.f[i15] + dp4);
    }

    public final boolean p(int i9, int i10) {
        g5 g5Var;
        w5 w5Var = this.a;
        if (w5Var == null || (g5Var = this.h) == null || i9 < 0 || i9 >= w5Var.b || i10 < 0 || i10 >= w5Var.c) {
            return false;
        }
        return ((LinkedHashSet) ((kh.p) g5Var).b).contains(w5Var.d[i9][i10]);
    }

    public final int q() {
        for (int i9 = this.a.c - 1; i9 >= 0; i9--) {
            if (e(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i9 = this.a.b - 1; i9 >= 0; i9--) {
            if (t(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof i5) {
                removeViewAt(childCount);
            }
        }
        w5 w5Var = this.a;
        if (w5Var == null) {
            return;
        }
        int size = w5Var.g.size();
        for (int i9 = 0; i9 < size; i9++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.a.g.get(i9);
            i5 i5Var = new i5(getContext(), this.b);
            i5Var.setCompact(this.a.a.compact);
            i5Var.b(pagetablecell);
            addView(i5Var);
        }
    }

    public void setModel(w5 w5Var) {
        this.a = w5Var;
        s();
    }

    public void setSelectionProvider(g5 g5Var) {
        this.h = g5Var;
        invalidate();
    }

    public final boolean t(int i9) {
        if (i9 >= 0 && i9 < this.a.b) {
            for (int i10 = 0; i10 < this.a.c; i10++) {
                if (p(i9, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        if (l()) {
            return !d(k(), r()) || c(j(), q());
        }
        return false;
    }

    public final boolean v() {
        if (l()) {
            return !c(j(), q()) || d(k(), r());
        }
        return false;
    }
}
