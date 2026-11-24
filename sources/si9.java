// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class si9 extends View {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si9(Context context, wjb wjbVar) {
        super(context);
        this.a = (byte) 0;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, wjbVar, this);
        this.b = checkBoxBase;
        checkBoxBase.h(bkb.Xl, bkb.y5, bkb.j7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(gl.L(5.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 11:
                canvas.save();
                t7b t7bVar = (t7b) this.b;
                canvas.translate(t7bVar.d1.getX() + t7bVar.m0.getX(), t7bVar.d1.getY() + t7bVar.m0.getY());
                j7b j7bVar = t7bVar.d1;
                j7bVar.k(canvas, j7bVar.getBounds(), t7bVar.d1.getOver2Alpha());
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.draw(canvas);
                taa taaVar = (taa) this.b;
                ql0 ql0Var = taaVar.Q2;
                ql0Var.setBounds(0, (getMeasuredHeight() - taaVar.B2.d) - gl.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                ql0Var.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 7:
                super.invalidate();
                ((cja) this.b).S();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.b).l = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.b).l = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        Drawable drawable;
        Paint paint;
        byte b = this.a;
        int i2 = 2;
        int i3 = kk7.d4;
        int i4 = 1;
        float f5 = 0.0f;
        float f6 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                int L = gl.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                break;
            case 1:
                ((SecretMediaViewer) obj).P.a(canvas, this);
                break;
            case 5:
                super.onDraw(canvas);
                int R0 = gl.R0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int R02 = gl.R0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                haa haaVar = (haa) obj;
                RectF rectF = haaVar.n;
                Paint paint2 = haaVar.h;
                if (R0 != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{R0, R02}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), paint2);
                break;
            case 7:
                cja cjaVar = (cja) obj;
                if (cjaVar.b != null && !cjaVar.K) {
                    Drawable newDrawable = cjaVar.getNewDrawable();
                    boolean newDrawableMotion = cjaVar.getNewDrawableMotion();
                    if (newDrawable != cjaVar.b && newDrawable != null) {
                        if (bkb.f1()) {
                            cjaVar.d = cjaVar.b;
                            cjaVar.e = cjaVar.c;
                        }
                        if (newDrawable instanceof ye7) {
                            ((ye7) newDrawable).p(cjaVar.M);
                        }
                        cjaVar.b = newDrawable;
                        if (cjaVar.N && (newDrawable instanceof p72)) {
                            ((p72) newDrawable).f(this);
                        }
                        if (cjaVar.N) {
                            Drawable drawable2 = cjaVar.b;
                            if (drawable2 instanceof ye7) {
                                ((ye7) drawable2).k();
                            }
                        }
                        cjaVar.c = newDrawableMotion;
                        cjaVar.d0 = 0.0f;
                        cjaVar.T(cjaVar.b);
                        cjaVar.F();
                    } else if (cjaVar.c != newDrawableMotion) {
                        cjaVar.c = newDrawableMotion;
                        cjaVar.F();
                    }
                    cjaVar.d0 = Utilities.i((gl.t / 200.0f) + cjaVar.d0, 1.0f, 0.0f);
                    int i5 = 0;
                    while (i5 < i2) {
                        Drawable drawable3 = i5 == 0 ? cjaVar.d : cjaVar.b;
                        if (drawable3 == null) {
                            i = i2;
                            f4 = f6;
                        } else {
                            if (i5 != i4 || cjaVar.d == null || cjaVar.H == null) {
                                drawable3.setAlpha(i3);
                            } else {
                                drawable3.setAlpha((int) (cjaVar.d0 * 255.0f));
                            }
                            if (i5 == 0 ? cjaVar.e : cjaVar.c) {
                                f3 = cjaVar.E;
                                f = cjaVar.x;
                                f2 = cjaVar.y;
                            } else {
                                f = f5;
                                f2 = f;
                                f3 = f6;
                            }
                            if (drawable3 instanceof ye7) {
                                ye7 ye7Var = (ye7) drawable3;
                                if (ye7Var.u != null) {
                                    int currentActionBarHeight = (cjaVar.O() ? a.getCurrentActionBarHeight() : 0) + ((cjaVar.P() && cjaVar.s) ? gl.m : 0);
                                    int measuredHeight = cjaVar.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    i = i2;
                                    float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    f4 = f6;
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max * f3);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max * f3);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f);
                                    int i6 = ((measuredHeight - ceil2) / 2) + cjaVar.F + currentActionBarHeight + ((int) f2);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - cjaVar.h);
                                    drawable3.setBounds(measuredWidth, i6, ceil + measuredWidth, ceil2 + i6);
                                    drawable3.draw(canvas);
                                    cjaVar.G(canvas);
                                    canvas.restore();
                                } else {
                                    i = i2;
                                    f4 = f6;
                                    if (cjaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cjaVar.h);
                                    }
                                    ye7Var.f = cjaVar.F;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - cjaVar.F) + f2));
                                    drawable3.draw(canvas);
                                    if (cjaVar.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                i = i2;
                                f4 = f6;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (cjaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - cjaVar.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    cjaVar.G(canvas);
                                    if (cjaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (cjaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cjaVar.h);
                                    }
                                    drawable3.setBounds(0, cjaVar.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + cjaVar.F);
                                    drawable3.draw(canvas);
                                    cjaVar.G(canvas);
                                    if (cjaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (cjaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cjaVar.h);
                                    }
                                    if (drawable3 instanceof p72) {
                                        p72 p72Var = (p72) drawable3;
                                        p72Var.b = this;
                                        ye7 ye7Var2 = p72Var.f;
                                        if (ye7Var2 != null) {
                                            ye7Var2.p(this);
                                        }
                                    }
                                    float f7 = f3 - f4;
                                    float d = ls6.d(-getMeasuredWidth(), f7, 2.0f, f);
                                    float d2 = ls6.d(-getRootView().getMeasuredHeight(), f7, 2.0f, f2);
                                    drawable3.setBounds((int) d, (int) (cjaVar.F + d2), (int) ((getMeasuredWidth() * f3) + d), (int) ir2.i(getRootView().getMeasuredHeight(), f3, cjaVar.F, d2));
                                    drawable3.draw(canvas);
                                    cjaVar.G(canvas);
                                    if (cjaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f8 = 2.0f / gl.p;
                                    canvas.scale(f8, f8);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f8), (int) Math.ceil(getRootView().getMeasuredHeight() / f8));
                                    drawable3.draw(canvas);
                                    cjaVar.G(canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (cjaVar.O() ? a.getCurrentActionBarHeight() : 0) + ((cjaVar.P() && cjaVar.s) ? gl.m : 0);
                                    int measuredHeight2 = cjaVar.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f3);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f3);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f);
                                    int i7 = ((measuredHeight2 - ceil4) / 2) + cjaVar.F + currentActionBarHeight2 + ((int) f2);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - cjaVar.h);
                                    drawable3.setBounds(measuredWidth2, i7, ceil3 + measuredWidth2, ceil4 + i7);
                                    drawable3.draw(canvas);
                                    cjaVar.G(canvas);
                                    canvas.restore();
                                }
                            }
                            if (i5 == 0 && (drawable = cjaVar.d) != null && cjaVar.d0 >= f4) {
                                if (cjaVar.N && (drawable instanceof p72)) {
                                    ((p72) drawable).g(cjaVar.M);
                                }
                                if (cjaVar.N) {
                                    Drawable drawable4 = cjaVar.d;
                                    if (drawable4 instanceof ye7) {
                                        ((ye7) drawable4).l();
                                    }
                                }
                                cjaVar.d = null;
                                cjaVar.e = false;
                                cjaVar.F();
                                cjaVar.M.invalidate();
                            }
                        }
                        i5++;
                        i2 = i;
                        f6 = f4;
                        i3 = kk7.d4;
                        i4 = 1;
                        f5 = 0.0f;
                    }
                    if (cjaVar.d0 != f6) {
                        cjaVar.M.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                super.onDraw(canvas);
                int w0 = bkb.w0(null, bkb.Lj, false);
                h1b h1bVar = (h1b) obj;
                wd1 wd1Var = h1bVar.M;
                Paint paint3 = h1bVar.a;
                paint3.setColor(w0);
                Paint paint4 = h1bVar.b;
                paint4.setColor(w0);
                Paint paint5 = h1bVar.c;
                paint5.setColor(w0);
                paint4.setAlpha(kk7.d4);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = h1bVar.d;
                paint6.setColor(bkb.w0(null, bkb.c6, false));
                canvas.drawLine(gl.L(24.0f), gl.L(20.0f), getMeasuredWidth() - gl.L(24.0f), gl.L(20.0f), paint3);
                if (!h1bVar.e) {
                    float f9 = h1bVar.K;
                    if (f9 != 0.0f) {
                        float f10 = f9 - 0.10666667f;
                        h1bVar.K = f10;
                        if (f10 < 0.0f) {
                            h1bVar.K = 0.0f;
                        }
                    }
                    int L2 = gl.L(24.0f);
                    if (h1bVar.e) {
                        int L3 = gl.L(24.0f) + ((int) ((getMeasuredWidth() - (gl.L(24.0f) << 1)) * h1bVar.G));
                        canvas.drawLine(L2, gl.L(20.0f), gl.L(24.0f) + r2, gl.L(20.0f), paint5);
                        paint = paint6;
                        canvas.drawRect(L3, gl.L(20.0f) - gl.L(3.0f), gl.L(3.0f) + L3, gl.L(3.0f) + gl.L(20.0f), paint);
                    } else {
                        paint = paint6;
                    }
                    if (h1bVar.e) {
                        int measuredWidth3 = (int) ((getMeasuredWidth() - (gl.L(24.0f) << 1)) * h1bVar.F);
                        if (measuredWidth3 < gl.L(1.0f)) {
                            measuredWidth3 = gl.L(1.0f);
                        }
                        int L4 = gl.L(24.0f) + measuredWidth3;
                        canvas.drawLine(L2, gl.L(20.0f), gl.L(24.0f) + measuredWidth3, gl.L(20.0f), paint4);
                        canvas.drawRect(L4, gl.L(20.0f) - gl.L(3.0f), gl.L(3.0f) + L4, gl.L(3.0f) + gl.L(20.0f), paint);
                        break;
                    }
                } else {
                    boolean z = h1bVar.L;
                    float f11 = h1bVar.K;
                    if (z) {
                        float f12 = f11 + 0.024615385f;
                        h1bVar.K = f12;
                        if (f12 > 1.0f) {
                            h1bVar.K = 1.0f;
                            h1bVar.L = false;
                        }
                    } else {
                        float f13 = f11 - 0.024615385f;
                        h1bVar.K = f13;
                        if (f13 < 0.0f) {
                            h1bVar.K = 0.0f;
                            h1bVar.L = true;
                        }
                    }
                }
                invalidate();
                RectF rectF2 = gl.P;
                rectF2.set(gl.L(24.0f), gl.L(17.0f), getMeasuredWidth() - gl.L(24.0f), gl.L(23.0f));
                wd1Var.f = getMeasuredWidth();
                wd1Var.a(gl.L(3.0f), canvas, rectF2, null);
                int L22 = gl.L(24.0f);
                if (h1bVar.e) {
                }
                if (h1bVar.e) {
                }
                break;
            case 14:
                canvas.drawColor(bkb.v0(bkb.d7, ((s7c) obj).J0));
                break;
            case 15:
                smc smcVar = (smc) obj;
                float e = smcVar.L.e(false, smcVar.K);
                if (smcVar.R != null && getWidth() > 0) {
                    smcVar.b(canvas, e);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 2:
                super.onLayout(z, i, i2, i3, i4);
                jw9 jw9Var = (jw9) this.b;
                int[] iArr = jw9Var.H;
                getLocationOnScreen(iArr);
                Rect rect = jw9Var.d;
                int i5 = iArr[0];
                rect.set(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1]);
                gl.V1(jw9Var.c, rect, jw9Var.J, jw9Var.e);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        int L2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(24.0f));
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((qaa) obj).L.E1.R, TLObject.FLAG_30));
                break;
            case 6:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((dha) obj).getMeasuredHeight());
                break;
            case 8:
                jva jvaVar = (jva) obj;
                if (jvaVar.I) {
                    L = (jvaVar.o0().getMeasuredHeight() + jvaVar.J) - gl.L(16.0f);
                } else {
                    int L3 = gl.L(140.0f) + jvaVar.J;
                    L = gl.L(24.0f) + jvaVar.E.getMeasuredHeight() > L3 ? gl.L(24.0f) + jvaVar.E.getMeasuredHeight() : L3;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (L - 0.0f), TLObject.FLAG_30));
                break;
            case 9:
                tya tyaVar = ((lya) obj).d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i2) - gl.L(4.0f);
                int i3 = tyaVar.o3;
                int max = Math.max(i3 > 0 ? gl.L(4.0f) + i3 : 0, (int) (size - Math.min(gl.L(4.0f) + ((r6.b() - 1) * size2), tyaVar.f3 * size2)));
                tyaVar.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i2);
                break;
            case 10:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), TLObject.FLAG_30));
                break;
            case 12:
                ydb ydbVar = (ydb) obj;
                if (ydbVar.I) {
                    L2 = (ydbVar.o0().getMeasuredHeight() + ydbVar.J) - gl.L(16.0f);
                } else {
                    int L4 = gl.L(140.0f) + ydbVar.J;
                    L2 = gl.L(24.0f) + ydbVar.E.getMeasuredHeight() > L4 ? gl.L(24.0f) + ydbVar.E.getMeasuredHeight() : L4;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (L2 - 0.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 13:
                super.setAlpha(f);
                View view = ((qvb) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        switch (this.a) {
            case 5:
                super.setTranslationX(f);
                invalidate();
                break;
            default:
                super.setTranslationX(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si9(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
