// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class zqb extends FrameLayout implements fn7, snb {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public ne2 H;
    public final de0 I;
    public final int J;
    public s8b K;
    public final byte L;
    public int M;
    public float N;
    public g82 O;
    public boolean P;
    public final ImageReceiver Q;
    public rb0 R;
    public final t37 S;
    public final t37 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float a;
    public boolean a0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public yqb f;
    public yqb h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final vnb y;

    /* JADX WARN: Multi-variable type inference failed */
    public zqb(int i, int i2, vnb vnbVar, Context context) {
        super(context);
        this.a = hl.L(8.0f);
        this.b = hl.L(6.0f);
        this.c = hl.L(4.0f);
        this.d = hl.L(21.0f);
        this.e = hl.L(41.0f);
        this.f = new yqb(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.S = new t37(0, true, false, null);
        this.T = new t37(0, false, false, null);
        this.L = i2;
        this.J = i;
        this.y = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.q0(hl.L(8.0f));
        yob.h(aob.i5, vnbVar, this);
        de0 de0Var = new de0(context);
        this.I = de0Var;
        de0Var.getImageReceiver().B0 = true;
        de0Var.getImageReceiver().v0 = false;
        de0Var.getImageReceiver().M(0);
        if (i2 == 0 || i2 == 3 || i2 == 2) {
            addView(de0Var, tre.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(de0Var, tre.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(hl.L(120.0f) / bitmap.getWidth(), hl.L(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || Math.abs(max - 1.0f) < 0.0125f) {
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * max);
        int height = (int) (bitmap.getHeight() * max);
        return (height <= 0 || width <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.G;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(jn7.M1);
        this.F = textPaint;
        textPaint.setColor(aob.v0(aob.Of, this.y));
        this.F.setTextSize(hl.L(c()));
        this.F.setTypeface(hl.o());
        int L = hl.L(52.0f);
        byte b = this.L;
        if (b == 3 || b == 4) {
            L = hl.L(77.0f);
        }
        String b2 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = o0b.d(b2, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return ob6.M0(2131752182, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().y() != null) {
            hl.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().y().l0) {
                this.I.getImageReceiver().y().I(0, true, false);
                this.I.getImageReceiver().y().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(hl.H).start();
            s8b s8bVar = new s8b(this, (byte) 23);
            this.K = s8bVar;
            hl.d3(s8bVar, 2500L);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yqb yqbVar;
        yqb yqbVar2;
        if (this.H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.O != null) {
            canvas.save();
            canvas.clipPath(this.x);
            this.O.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.n != 1.0f && (yqbVar2 = this.h) != null) {
            yqbVar2.b(canvas, 1.0f);
        }
        float f = this.n;
        if (f != 0.0f) {
            this.f.b(canvas, f);
        }
        if (this.n != 1.0f && (yqbVar = this.h) != null) {
            yqbVar.a(canvas, 1.0f);
        }
        float f2 = this.n;
        if (f2 != 0.0f) {
            this.f.a(canvas, f2);
        }
        float f3 = this.n;
        if (f3 != 1.0f) {
            float f4 = f3 + 0.10666667f;
            this.n = f4;
            if (f4 >= 1.0f) {
                this.n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(ne2 ne2Var, long j, boolean z) {
        long j2;
        yqb yqbVar;
        ne2 ne2Var2;
        long h;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        ez3 ez3Var;
        hl5 hl5Var;
        ne2 ne2Var3;
        Drawable drawable;
        ne2 ne2Var4;
        int i;
        int i2;
        int i3;
        int i4;
        hh7 hh7Var;
        ez3 ez3Var2;
        g82 g82Var;
        g82 g82Var2;
        boolean z2 = this.H != ne2Var;
        int i5 = this.W;
        int i6 = ne2Var.c;
        boolean z3 = i5 != i6;
        this.W = i6;
        this.H = ne2Var;
        TLRPC.Document e = ne2Var.a.e();
        ez3 ez3Var3 = ne2Var.a;
        if (ez3Var3.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            Long l = (Long) af2.e(ez3Var3.g).r.get(((TLRPC.TL_chatThemeUniqueGift) ez3Var3.d).gift.slug);
            if (l != null) {
                j2 = l.longValue();
                this.V = j2;
                if (j == j2) {
                    this.V = 0L;
                    j2 = 0;
                }
                String str = null;
                if (j2 == 0) {
                    if (this.R == null) {
                        this.R = new rb0((vnb) null);
                    }
                    TLObject b2 = uc7.s1(this.J).b2(this.V);
                    this.R.o(b2);
                    this.Q.U(b2, this.R, null);
                } else {
                    this.Q.f();
                }
                if (z2) {
                    s8b s8bVar = this.K;
                    if (s8bVar != null) {
                        hl.r(s8bVar);
                        this.K = null;
                    }
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                }
                if (z2) {
                    Drawable f = e != null ? lp3.f(e, aob.c7, 0.2f, null) : null;
                    if (f == null) {
                        pv3.k(ne2Var.a.e);
                        f = pv3.g(ne2Var.a.e);
                    }
                    this.I.m(jn5.b(e), "50_50", f, null);
                    ne2Var.a.getClass();
                    TLRPC.WallPaper wallPaper = this.U;
                    boolean z4 = this.P;
                    if (wallPaper != null) {
                        if (z4 && (g82Var2 = this.O) != null) {
                            g82Var2.g(this);
                        }
                        g82 g82Var3 = new g82(wallPaper, false, true);
                        this.O = g82Var3;
                        g82Var3.b = this;
                        hh7 hh7Var2 = g82Var3.f;
                        if (hh7Var2 != null) {
                            hh7Var2.p(this);
                        }
                        if (this.P) {
                            this.O.f(this);
                        }
                    } else {
                        if (z4 && (g82Var = this.O) != null) {
                            g82Var.g(this);
                        }
                        this.O = null;
                    }
                }
                this.I.setVisibility((ne2Var.a.l() || this.U == null) ? 0 : 8);
                if (!z2 || z3) {
                    if (z) {
                        this.n = 1.0f;
                    } else {
                        this.n = 0.0f;
                        this.h = this.f;
                        this.f = new yqb(this);
                        invalidate();
                    }
                    yqbVar = this.f;
                    ne2Var2 = this.H;
                    if (ne2Var2 != null && (ez3Var = ne2Var2.a) != null) {
                        dz3 dz3Var = (dz3) ez3Var.f.get(ne2Var2.c);
                        int i7 = dz3Var.h;
                        if (this.V != 0) {
                            i7 = dz3Var.k;
                        }
                        Paint paint = yqbVar.c;
                        Paint paint2 = yqbVar.a;
                        Paint paint3 = yqbVar.b;
                        paint.setColor(i7);
                        paint3.setColor(dz3Var.i);
                        int v0 = !this.H.a.l() ? aob.v0(aob.Fi, this.y) : dz3Var.j;
                        int alpha = paint2.getAlpha();
                        paint2.setColor(v0);
                        paint2.setAlpha(alpha);
                        ne2 ne2Var5 = this.H;
                        hl5Var = (hl5) ne2Var5.a.f.get(ne2Var5.c);
                        if (hl5Var != null) {
                            dz3 dz3Var2 = (dz3) hl5Var;
                            if (dz3Var2.a() != 0) {
                                ne2 ne2Var6 = this.H;
                                int i8 = ((dz3) ne2Var6.a.f.get(ne2Var6.c)).d;
                                ArrayList<Integer> arrayList = dz3Var2.b(i8).message_colors;
                                if (arrayList.size() > 1) {
                                    int[] iArr = new int[arrayList.size()];
                                    for (int i9 = 0; i9 != arrayList.size(); i9++) {
                                        iArr[i9] = arrayList.get(i9).intValue() | (-16777216);
                                    }
                                    float L = this.c + hl.L(8.0f);
                                    paint3.setShader(new LinearGradient(0.0f, L, 0.0f, L + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                                } else {
                                    paint3.setShader(null);
                                }
                                paint3.setAlpha(jn7.d4);
                                ne2Var4 = this.H;
                                if (ne2Var4 != null) {
                                    if (i8 >= 0) {
                                        TLRPC.WallPaperSettings wallPaperSettings = dz3Var2.b(i8).wallpaper.settings;
                                        int i10 = wallPaperSettings.background_color;
                                        int i11 = wallPaperSettings.second_background_color;
                                        int i12 = wallPaperSettings.third_background_color;
                                        i4 = wallPaperSettings.fourth_background_color;
                                        i = i10;
                                        i2 = i11;
                                        i3 = i12;
                                    } else {
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                        i4 = 0;
                                    }
                                    if (i2 != 0) {
                                        hh7Var = new hh7(i, i2, i3, i4, true, false);
                                        this.M = hh7Var.f();
                                    } else {
                                        hh7 hh7Var3 = new hh7(i, i, i, i, true, false);
                                        this.M = -16777216;
                                        hh7Var = hh7Var3;
                                    }
                                    ne2Var4 = this.H;
                                    ne2Var4.b = hh7Var;
                                }
                                yqbVar.d = ne2Var4.b;
                                invalidate();
                            }
                        }
                        ne2 ne2Var7 = this.H;
                        dz3 dz3Var3 = (dz3) ne2Var7.a.f.get(ne2Var7.c);
                        ne2Var3 = this.H;
                        if (ne2Var3 != null) {
                            ne2Var4 = ne2Var3;
                        } else {
                            int i13 = dz3Var3.k;
                            int i14 = dz3Var3.l;
                            int i15 = dz3Var3.m;
                            int i16 = dz3Var3.n;
                            if (dz3Var3.a.i(false) != null) {
                                if (i14 != 0) {
                                    hh7 hh7Var4 = new hh7(i13, i14, i15, i16, true, false);
                                    this.M = hh7Var4.f();
                                    drawable = hh7Var4;
                                } else {
                                    Drawable hh7Var5 = new hh7(i13, i13, i13, i13, true, false);
                                    this.M = -16777216;
                                    drawable = hh7Var5;
                                }
                            } else if (i13 != 0) {
                                drawable = i14 != 0 ? new hh7(i13, i14, i15, i16, true, false) : new ColorDrawable(i13);
                            } else {
                                znb znbVar = dz3Var3.a;
                                if (znbVar == null || (znbVar.Q <= 0 && znbVar.c == null)) {
                                    ez3 ez3Var4 = this.H.a;
                                    if (ez3Var4 == null || !ez3Var4.l()) {
                                        drawable = new hh7(-2368069, -9722489, -2762611, -7817084, true, false);
                                    }
                                    drawable = null;
                                } else {
                                    float L2 = hl.L(112.0f);
                                    float L3 = hl.L(134.0f);
                                    znb znbVar2 = dz3Var3.a;
                                    Bitmap d1 = hl.d1(L2, L3, znbVar2.c, znbVar2.b, znbVar2.Q);
                                    if (d1 != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(d1);
                                        bitmapDrawable.setFilterBitmap(true);
                                        drawable = bitmapDrawable;
                                    }
                                    drawable = null;
                                }
                            }
                            ne2Var4 = this.H;
                            ne2Var4.b = drawable;
                        }
                        yqbVar.d = ne2Var4.b;
                        invalidate();
                    }
                    h = ne2Var.a.h(this.W);
                    ez3 ez3Var5 = ne2Var.a;
                    int i17 = this.W;
                    if (h == 0) {
                        TLRPC.WallPaper j3 = ez3Var5.j(i17);
                        if (j3 != null) {
                            ne2Var.a.p(this.W, new ff(this, h, ne2Var, j3.settings.intensity, (byte) 5));
                        }
                    } else {
                        SparseArray sparseArray = ez3Var5.i(i17).b0;
                        ynb ynbVar = sparseArray != null ? (ynb) sparseArray.get(((dz3) ne2Var.a.f.get(this.W)).e) : null;
                        if (ynbVar != null && (tL_theme = ynbVar.r) != null && tL_theme.settings.size() > 0) {
                            TLRPC.WallPaper wallPaper2 = ynbVar.r.settings.get(0).wallpaper;
                            if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                                jn5 c = jn5.c(xb4.w(document.thumbs, jn7.E1, false, null, false), document);
                                ImageReceiver imageReceiver = new ImageReceiver(null);
                                imageReceiver.A1 = false;
                                imageReceiver.d0(c, "120_140", null, null, null, 1);
                                imageReceiver.h1 = new o48((Object) this, (Object) ne2Var, (Object) wallPaper2, (byte) 18);
                                in5.z().I(imageReceiver, null);
                            }
                        } else if (ynbVar != null && ynbVar.r == null) {
                            int i18 = (int) (ynbVar.p * 100.0f);
                            Drawable drawable2 = ne2Var.b;
                            if (drawable2 instanceof hh7) {
                                hh7 hh7Var6 = (hh7) drawable2;
                                hh7Var6.r(i18, hh7Var6.u);
                            }
                            af2.s.c(new a39((Object) this, (Object) ne2Var, i18, (byte) 25));
                        }
                    }
                }
                if (!z) {
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                    hl.r(this.K);
                    if (this.I.getImageReceiver().y() != null) {
                        this.I.getImageReceiver().y().stop();
                        this.I.getImageReceiver().y().I(0, false, false);
                    }
                }
                ez3Var2 = this.H.a;
                if (ez3Var2 != null || ez3Var2.l()) {
                    setContentDescription(ob6.M0(2131752182, null));
                }
                dpb dpbVar = this.H.a.c;
                if (dpbVar != null && (str = dpbVar.b) == null) {
                    str = dpbVar.a;
                }
                setContentDescription(str);
                return;
            }
        }
        j2 = 0;
        this.V = j2;
        if (j == j2) {
        }
        String str2 = null;
        if (j2 == 0) {
        }
        if (z2) {
        }
        if (z2) {
        }
        this.I.setVisibility((ne2Var.a.l() || this.U == null) ? 0 : 8);
        if (!z2) {
        }
        if (z) {
        }
        yqbVar = this.f;
        ne2Var2 = this.H;
        if (ne2Var2 != null) {
            dz3 dz3Var4 = (dz3) ez3Var.f.get(ne2Var2.c);
            int i72 = dz3Var4.h;
            if (this.V != 0) {
            }
            Paint paint4 = yqbVar.c;
            Paint paint22 = yqbVar.a;
            Paint paint32 = yqbVar.b;
            paint4.setColor(i72);
            paint32.setColor(dz3Var4.i);
            if (!this.H.a.l()) {
            }
            int alpha2 = paint22.getAlpha();
            paint22.setColor(v0);
            paint22.setAlpha(alpha2);
            ne2 ne2Var52 = this.H;
            hl5Var = (hl5) ne2Var52.a.f.get(ne2Var52.c);
            if (hl5Var != null) {
            }
            ne2 ne2Var72 = this.H;
            dz3 dz3Var32 = (dz3) ne2Var72.a.f.get(ne2Var72.c);
            ne2Var3 = this.H;
            if (ne2Var3 != null) {
            }
            yqbVar.d = ne2Var4.b;
            invalidate();
        }
        h = ne2Var.a.h(this.W);
        ez3 ez3Var52 = ne2Var.a;
        int i172 = this.W;
        if (h == 0) {
        }
        if (!z) {
        }
        ez3Var2 = this.H.a;
        if (ez3Var2 != null) {
        }
        setContentDescription(ob6.M0(2131752182, null));
    }

    public final void g(boolean z, boolean z2) {
        if (!z2) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z;
            this.N = z ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.a0 != z) {
            float f = this.N;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new ija(this, (byte) 26));
            this.E.addListener(new i1a((byte) 7, this, z));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.a0 = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
        this.P = true;
        g82 g82Var = this.O;
        if (g82Var != null) {
            g82Var.f(this);
        }
        this.Q.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
        this.P = false;
        g82 g82Var = this.O;
        if (g82Var != null) {
            g82Var.g(this);
        }
        this.Q.K();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.a0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.L;
        if (b == 1 || b == 4) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), TLObject.FLAG_30));
        } else {
            int L = hl.L(b == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size2 == 0) {
                size2 = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        de0 de0Var = this.I;
        de0Var.setPivotY(de0Var.getMeasuredHeight());
        de0Var.setPivotX(de0Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        float f = this.c;
        RectF rectF = this.w;
        rectF.set(f, f, i - f, i2 - f);
        Path path = this.x;
        path.reset();
        float f2 = this.b;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        int i2 = aob.i5;
        vnb vnbVar = this.y;
        this.s.setColor(aob.v0(i2, vnbVar));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(aob.v0(aob.Of, vnbVar));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            ne2 ne2Var = this.H;
            if (ne2Var != null) {
                this.H = null;
                f(ne2Var, 0L, false);
            }
        }
    }

    @Override // snb
    public final void updateColors() {
        vnb vnbVar = this.y;
        try {
            this.s.setColor(aob.v0(aob.i5, vnbVar));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(aob.v0(aob.Of, vnbVar));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
