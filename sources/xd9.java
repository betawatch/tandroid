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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xd9 extends View {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd9(Context context, ylb ylbVar) {
        super(context);
        this.a = (byte) 1;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, ylbVar, this);
        this.b = checkBoxBase;
        checkBoxBase.h(cmb.Xl, cmb.y5, cmb.j7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(gm.L(5.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 12:
                canvas.save();
                v9b v9bVar = (v9b) this.b;
                canvas.translate(v9bVar.d1.getX() + v9bVar.m0.getX(), v9bVar.d1.getY() + v9bVar.m0.getY());
                l9b l9bVar = v9bVar.d1;
                l9bVar.k(canvas, l9bVar.getBounds(), v9bVar.d1.getOver2Alpha());
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
            case 4:
                super.draw(canvas);
                tca tcaVar = (tca) this.b;
                qm0 qm0Var = tcaVar.Q2;
                qm0Var.setBounds(0, (getMeasuredHeight() - tcaVar.B2.d) - gm.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                qm0Var.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 8:
                super.invalidate();
                ((ela) this.b).S();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 1:
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
            case 1:
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
        int i3 = nm7.d4;
        int i4 = 1;
        float f5 = 0.0f;
        float f6 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                canvas.save();
                canvas.translate(gm.N(22.6f), gm.N(21.66f));
                ((be9) obj).c.draw(canvas);
                canvas.restore();
                break;
            case 1:
                int L = gm.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                break;
            case 2:
                ((SecretMediaViewer) obj).P.a(canvas, this);
                break;
            case 6:
                super.onDraw(canvas);
                int R0 = gm.R0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int R02 = gm.R0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                hca hcaVar = (hca) obj;
                RectF rectF = hcaVar.n;
                Paint paint2 = hcaVar.h;
                if (R0 != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{R0, R02}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), paint2);
                break;
            case 8:
                ela elaVar = (ela) obj;
                if (elaVar.b != null && !elaVar.K) {
                    Drawable newDrawable = elaVar.getNewDrawable();
                    boolean newDrawableMotion = elaVar.getNewDrawableMotion();
                    if (newDrawable != elaVar.b && newDrawable != null) {
                        if (cmb.f1()) {
                            elaVar.d = elaVar.b;
                            elaVar.e = elaVar.c;
                        }
                        if (newDrawable instanceof ah7) {
                            ((ah7) newDrawable).p(elaVar.M);
                        }
                        elaVar.b = newDrawable;
                        if (elaVar.N && (newDrawable instanceof a92)) {
                            ((a92) newDrawable).f(this);
                        }
                        if (elaVar.N) {
                            Drawable drawable2 = elaVar.b;
                            if (drawable2 instanceof ah7) {
                                ((ah7) drawable2).k();
                            }
                        }
                        elaVar.c = newDrawableMotion;
                        elaVar.d0 = 0.0f;
                        elaVar.T(elaVar.b);
                        elaVar.F();
                    } else if (elaVar.c != newDrawableMotion) {
                        elaVar.c = newDrawableMotion;
                        elaVar.F();
                    }
                    elaVar.d0 = Utilities.i((gm.t / 200.0f) + elaVar.d0, 1.0f, 0.0f);
                    int i5 = 0;
                    while (i5 < i2) {
                        Drawable drawable3 = i5 == 0 ? elaVar.d : elaVar.b;
                        if (drawable3 == null) {
                            i = i2;
                            f4 = f6;
                        } else {
                            if (i5 != i4 || elaVar.d == null || elaVar.H == null) {
                                drawable3.setAlpha(i3);
                            } else {
                                drawable3.setAlpha((int) (elaVar.d0 * 255.0f));
                            }
                            if (i5 == 0 ? elaVar.e : elaVar.c) {
                                f3 = elaVar.E;
                                f = elaVar.x;
                                f2 = elaVar.y;
                            } else {
                                f = f5;
                                f2 = f;
                                f3 = f6;
                            }
                            if (drawable3 instanceof ah7) {
                                ah7 ah7Var = (ah7) drawable3;
                                if (ah7Var.u != null) {
                                    int currentActionBarHeight = (elaVar.O() ? a.getCurrentActionBarHeight() : 0) + ((elaVar.P() && elaVar.s) ? gm.m : 0);
                                    int measuredHeight = elaVar.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    i = i2;
                                    float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    f4 = f6;
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max * f3);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max * f3);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f);
                                    int i6 = ((measuredHeight - ceil2) / 2) + elaVar.F + currentActionBarHeight + ((int) f2);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - elaVar.h);
                                    drawable3.setBounds(measuredWidth, i6, ceil + measuredWidth, ceil2 + i6);
                                    drawable3.draw(canvas);
                                    elaVar.G(canvas);
                                    canvas.restore();
                                } else {
                                    i = i2;
                                    f4 = f6;
                                    if (elaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - elaVar.h);
                                    }
                                    ah7Var.f = elaVar.F;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - elaVar.F) + f2));
                                    drawable3.draw(canvas);
                                    if (elaVar.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                i = i2;
                                f4 = f6;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (elaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - elaVar.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    elaVar.G(canvas);
                                    if (elaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (elaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - elaVar.h);
                                    }
                                    drawable3.setBounds(0, elaVar.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + elaVar.F);
                                    drawable3.draw(canvas);
                                    elaVar.G(canvas);
                                    if (elaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (elaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - elaVar.h);
                                    }
                                    if (drawable3 instanceof a92) {
                                        a92 a92Var = (a92) drawable3;
                                        a92Var.b = this;
                                        ah7 ah7Var2 = a92Var.f;
                                        if (ah7Var2 != null) {
                                            ah7Var2.p(this);
                                        }
                                    }
                                    float f7 = f3 - f4;
                                    float d = kt6.d(-getMeasuredWidth(), f7, 2.0f, f);
                                    float d2 = kt6.d(-getRootView().getMeasuredHeight(), f7, 2.0f, f2);
                                    drawable3.setBounds((int) d, (int) (elaVar.F + d2), (int) ((getMeasuredWidth() * f3) + d), (int) ts2.i(getRootView().getMeasuredHeight(), f3, elaVar.F, d2));
                                    drawable3.draw(canvas);
                                    elaVar.G(canvas);
                                    if (elaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f8 = 2.0f / gm.p;
                                    canvas.scale(f8, f8);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f8), (int) Math.ceil(getRootView().getMeasuredHeight() / f8));
                                    drawable3.draw(canvas);
                                    elaVar.G(canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (elaVar.O() ? a.getCurrentActionBarHeight() : 0) + ((elaVar.P() && elaVar.s) ? gm.m : 0);
                                    int measuredHeight2 = elaVar.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f3);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f3);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f);
                                    int i7 = ((measuredHeight2 - ceil4) / 2) + elaVar.F + currentActionBarHeight2 + ((int) f2);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - elaVar.h);
                                    drawable3.setBounds(measuredWidth2, i7, ceil3 + measuredWidth2, ceil4 + i7);
                                    drawable3.draw(canvas);
                                    elaVar.G(canvas);
                                    canvas.restore();
                                }
                            }
                            if (i5 == 0 && (drawable = elaVar.d) != null && elaVar.d0 >= f4) {
                                if (elaVar.N && (drawable instanceof a92)) {
                                    ((a92) drawable).g(elaVar.M);
                                }
                                if (elaVar.N) {
                                    Drawable drawable4 = elaVar.d;
                                    if (drawable4 instanceof ah7) {
                                        ((ah7) drawable4).l();
                                    }
                                }
                                elaVar.d = null;
                                elaVar.e = false;
                                elaVar.F();
                                elaVar.M.invalidate();
                            }
                        }
                        i5++;
                        i2 = i;
                        f6 = f4;
                        i3 = nm7.d4;
                        i4 = 1;
                        f5 = 0.0f;
                    }
                    if (elaVar.d0 != f6) {
                        elaVar.M.invalidate();
                        break;
                    }
                }
                break;
            case 11:
                super.onDraw(canvas);
                int w0 = cmb.w0(null, cmb.Lj, false);
                j3b j3bVar = (j3b) obj;
                ef1 ef1Var = j3bVar.M;
                Paint paint3 = j3bVar.a;
                paint3.setColor(w0);
                Paint paint4 = j3bVar.b;
                paint4.setColor(w0);
                Paint paint5 = j3bVar.c;
                paint5.setColor(w0);
                paint4.setAlpha(nm7.d4);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = j3bVar.d;
                paint6.setColor(cmb.w0(null, cmb.c6, false));
                canvas.drawLine(gm.L(24.0f), gm.L(20.0f), getMeasuredWidth() - gm.L(24.0f), gm.L(20.0f), paint3);
                if (!j3bVar.e) {
                    float f9 = j3bVar.K;
                    if (f9 != 0.0f) {
                        float f10 = f9 - 0.10666667f;
                        j3bVar.K = f10;
                        if (f10 < 0.0f) {
                            j3bVar.K = 0.0f;
                        }
                    }
                    int L2 = gm.L(24.0f);
                    if (j3bVar.e) {
                        int L3 = gm.L(24.0f) + ((int) ((getMeasuredWidth() - (gm.L(24.0f) << 1)) * j3bVar.G));
                        canvas.drawLine(L2, gm.L(20.0f), gm.L(24.0f) + r2, gm.L(20.0f), paint5);
                        paint = paint6;
                        canvas.drawRect(L3, gm.L(20.0f) - gm.L(3.0f), gm.L(3.0f) + L3, gm.L(3.0f) + gm.L(20.0f), paint);
                    } else {
                        paint = paint6;
                    }
                    if (j3bVar.e) {
                        int measuredWidth3 = (int) ((getMeasuredWidth() - (gm.L(24.0f) << 1)) * j3bVar.F);
                        if (measuredWidth3 < gm.L(1.0f)) {
                            measuredWidth3 = gm.L(1.0f);
                        }
                        int L4 = gm.L(24.0f) + measuredWidth3;
                        canvas.drawLine(L2, gm.L(20.0f), gm.L(24.0f) + measuredWidth3, gm.L(20.0f), paint4);
                        canvas.drawRect(L4, gm.L(20.0f) - gm.L(3.0f), gm.L(3.0f) + L4, gm.L(3.0f) + gm.L(20.0f), paint);
                        break;
                    }
                } else {
                    boolean z = j3bVar.L;
                    float f11 = j3bVar.K;
                    if (z) {
                        float f12 = f11 + 0.024615385f;
                        j3bVar.K = f12;
                        if (f12 > 1.0f) {
                            j3bVar.K = 1.0f;
                            j3bVar.L = false;
                        }
                    } else {
                        float f13 = f11 - 0.024615385f;
                        j3bVar.K = f13;
                        if (f13 < 0.0f) {
                            j3bVar.K = 0.0f;
                            j3bVar.L = true;
                        }
                    }
                }
                invalidate();
                RectF rectF2 = gm.P;
                rectF2.set(gm.L(24.0f), gm.L(17.0f), getMeasuredWidth() - gm.L(24.0f), gm.L(23.0f));
                ef1Var.f = getMeasuredWidth();
                ef1Var.a(gm.L(3.0f), canvas, rectF2, null);
                int L22 = gm.L(24.0f);
                if (j3bVar.e) {
                }
                if (j3bVar.e) {
                }
                break;
            case 15:
                canvas.drawColor(cmb.v0(cmb.d7, ((t9c) obj).J0));
                break;
            case 16:
                soc socVar = (soc) obj;
                float e = socVar.L.e(false, socVar.K);
                if (socVar.R != null && getWidth() > 0) {
                    socVar.b(canvas, e);
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
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                ly9 ly9Var = (ly9) this.b;
                int[] iArr = ly9Var.H;
                getLocationOnScreen(iArr);
                Rect rect = ly9Var.d;
                int i5 = iArr[0];
                rect.set(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1]);
                gm.V1(ly9Var.c, rect, ly9Var.J, ly9Var.e);
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
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(24.0f));
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 12:
            default:
                super.onMeasure(i, i2);
                break;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((qca) obj).L.E1.R, TLObject.FLAG_30));
                break;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((fja) obj).getMeasuredHeight());
                break;
            case 9:
                nxa nxaVar = (nxa) obj;
                if (nxaVar.I) {
                    L = (nxaVar.p0().getMeasuredHeight() + nxaVar.J) - gm.L(16.0f);
                } else {
                    int L3 = gm.L(140.0f) + nxaVar.J;
                    L = gm.L(24.0f) + nxaVar.E.getMeasuredHeight() > L3 ? gm.L(24.0f) + nxaVar.E.getMeasuredHeight() : L3;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (L - 0.0f), TLObject.FLAG_30));
                break;
            case 10:
                u0b u0bVar = ((m0b) obj).d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i2) - gm.L(4.0f);
                int i3 = u0bVar.o3;
                int max = Math.max(i3 > 0 ? gm.L(4.0f) + i3 : 0, (int) (size - Math.min(gm.L(4.0f) + ((r6.b() - 1) * size2), u0bVar.f3 * size2)));
                u0bVar.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i2);
                break;
            case 11:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30));
                break;
            case 13:
                yfb yfbVar = (yfb) obj;
                if (yfbVar.I) {
                    L2 = (yfbVar.p0().getMeasuredHeight() + yfbVar.J) - gm.L(16.0f);
                } else {
                    int L4 = gm.L(140.0f) + yfbVar.J;
                    L2 = gm.L(24.0f) + yfbVar.E.getMeasuredHeight() > L4 ? gm.L(24.0f) + yfbVar.E.getMeasuredHeight() : L4;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (L2 - 0.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 14:
                super.setAlpha(f);
                View view = ((sxb) this.b).fragmentView;
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
            case 6:
                super.setTranslationX(f);
                invalidate();
                break;
            default:
                super.setTranslationX(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd9(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
