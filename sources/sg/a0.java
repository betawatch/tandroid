package sg;

import ag.c2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.HashSet;
import kg.l1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.messenger.m5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.g21;
import org.telegram.ui.g31;
import org.telegram.ui.s21;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a0 extends FrameLayout implements k6 {
    public final Drawable a;
    public final Rect b;
    public final Paint c;
    public final int[] d;
    public final HashMap e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public final Path w;
    public final /* synthetic */ b0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Context context) {
        super(context);
        this.x = b0Var;
        Rect rect = new Rect();
        this.b = rect;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f = 0.0f;
        this.h = 0.0f;
        this.n = 1.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.w = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.a = mutate;
        int L = org.telegram.messenger.i0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i10 = t6.He;
        p6 p6Var = b0Var.s;
        a7.y(this, mutate, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.y == 2) {
            paint.setColor(i0.b.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(t6.w0(t6.G8, p6Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0469  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        boolean z10;
        HashMap hashMap;
        int i10;
        float f10;
        RectF rectF;
        float f11;
        RectF rectF2;
        int i11;
        mj0 mj0Var;
        int i12;
        mj0 mj0Var2;
        int i13;
        float f12;
        c2 c2Var;
        int i14;
        int i15;
        int i16;
        int i17;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        mj0 mj0Var3;
        RectF rectF5;
        RectF rectF6;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        mj0 mj0Var4;
        RectF rectF7;
        c2 c2Var2;
        int[] iArr;
        c2 c2Var3;
        float f18;
        int i18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        o0 o0Var;
        int i19;
        float f28;
        Canvas canvas2 = canvas;
        b0 b0Var = this.x;
        RectF rectF8 = b0Var.f;
        int i20 = b0Var.y;
        RectF rectF9 = b0Var.i;
        w wVar = b0Var.m;
        mj0 mj0Var5 = b0Var.n;
        if (b0Var.l) {
            float i21 = Utilities.i(b0Var.j, 1.0f, 0.0f);
            RectF rectF10 = org.telegram.messenger.i0.P;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i20 == 4) {
                rectF8.set(mj0Var5.x);
                rectF8.offset(b0Var.g, b0Var.h);
            }
            org.telegram.messenger.i0.Z1(rectF8, rectF10, b0Var.j, rectF9);
            float T1 = org.telegram.messenger.i0.T1(b0Var.e, org.telegram.messenger.i0.L(i20 == 5 ? 20.0f : 8.0f), b0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i20 == 1 || (mj0Var5.getDelegate() != null && mj0Var5.getDelegate().A())) {
                f7 = 1.0f;
                lj0 delegate = mj0Var5.getDelegate();
                float x10 = getX();
                a0 a0Var = b0Var.a;
                z10 = true;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                delegate.r(canvas, rectF9, T1, x10, i20 == 1 ? a0Var.getY() - org.telegram.messenger.i0.m : a0Var.getY() + b0Var.c.getY(), zs.e4, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int i22 = (int) (Utilities.i(i21 / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(i22);
                int i23 = (int) rectF9.left;
                Rect rect = this.b;
                f7 = 1.0f;
                drawable.setBounds(i23 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                vg.f fVar = b0Var.z;
                Paint paint = this.c;
                if (fVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = org.telegram.messenger.i0.Q;
                    rectF10.round(rect2);
                    rect2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                    b0Var.z.setBounds(rect2);
                    b0Var.z.setAlpha(paint.getAlpha());
                    b0Var.z.q(T1);
                    b0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, T1, T1, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                z10 = true;
            }
            if (mj0Var5.R0 != null) {
                canvas2.save();
                float f29 = rectF.left;
                float y3 = mj0Var5.R0.getY() + rectF.top;
                if (i20 == 3 || i20 == i10) {
                    i19 = 5;
                } else {
                    i19 = 5;
                    if (i20 != 5) {
                        f28 = 0.0f;
                        canvas2.translate(f29, y3 - f28);
                        rectF2 = rectF8;
                        f11 = T1;
                        i11 = i19;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, mj0Var5.R0.getMeasuredWidth(), mj0Var5.R0.getMeasuredHeight(), (int) ((f7 - b0Var.j) * mj0Var5.R0.getAlpha() * f10), 31);
                        mj0Var5.R0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f28 = mj0Var5.x.top;
                canvas2.translate(f29, y3 - f28);
                rectF2 = rectF8;
                f11 = T1;
                i11 = i19;
                canvas2.saveLayerAlpha(0.0f, 0.0f, mj0Var5.R0.getMeasuredWidth(), mj0Var5.R0.getMeasuredHeight(), (int) ((f7 - b0Var.j) * mj0Var5.R0.getAlpha() * f10), 31);
                mj0Var5.R0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f11 = T1;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - mj0Var5.x.width()) + (rectF.left - mj0Var5.x.left);
            if (b0Var.j > 0.05f || i20 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - mj0Var5.x.height()) + (rectF.top - mj0Var5.x.top));
                float max = (Math.max(0.25f, Math.min(mj0Var5.w, f7)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                mj0Var5.f(mj0Var5.E * max, max, mj0Var5.F * max, mj0Var5.M0 == i11 ? zs.e4 : (int) m5.A(1.0f, mj0Var5.w0, Utilities.i(mj0Var5.w0 / 0.2f, 1.0f, 0.0f), f10), canvas3);
                mj0Var = mj0Var5;
                canvas2 = canvas3;
                canvas2.restore();
                i12 = 5;
            } else {
                i12 = i11;
                mj0Var = mj0Var5;
            }
            if (i20 == i12) {
                Path path = this.w;
                path.rewind();
                path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f = 0.0f;
            this.h = 0.0f;
            this.n = 1.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            if (mj0Var != null) {
                for (int childCount = wVar.h0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (wVar.h0.getChildAt(childCount) instanceof s21) {
                        s21 s21Var = (s21) wVar.h0.getChildAt(childCount);
                        if (s21Var.D && (o0Var = s21Var.y) != null) {
                            hashMap.put(o0Var, s21Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, c3.i0.z(1.0f, b0Var.j, mj0Var.g() + mj0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (wVar.i0.getVisibility() == 0 ? wVar.i0.getAlpha() : 0.0f), 1.0f - b0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x11 = (int) (wVar.h0.getX() + wVar.getX());
                int y10 = (int) (wVar.h0.getY() + wVar.getY());
                boolean z11 = wVar.d0.getParent() != null ? z10 : false;
                if (i20 != 5) {
                    float f30 = y10;
                    if (z11) {
                        f12 = 2.0f;
                        f27 = x11 + (org.telegram.messenger.i0.L(36.0f) * b0Var.j);
                    } else {
                        f12 = 2.0f;
                        f27 = 0.0f;
                    }
                    canvas2.clipRect(f30, f27, wVar.h0.getMeasuredWidth() + y10, wVar.h0.getMeasuredHeight() + x11);
                } else {
                    f12 = 2.0f;
                }
                int i24 = -1;
                int i25 = -1;
                while (i25 < mj0Var.b.getChildCount()) {
                    View childAt = i25 == i24 ? mj0Var.z0 : mj0Var.b.getChildAt(i25);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i14 = i25;
                        i15 = i20;
                        i16 = i24;
                        i17 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        mj0Var3 = mj0Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof kj0) {
                            kj0 kj0Var = (kj0) childAt;
                            jj0 jj0Var = kj0Var.a;
                            jj0 jj0Var2 = kj0Var.b;
                            l1 l1Var = kj0Var.f;
                            if (l1Var != null) {
                                l1Var.setAlpha(1.0f - b0Var.j);
                            }
                            s21 s21Var2 = (s21) hashMap.get(kj0Var.e);
                            if (s21Var2 != null) {
                                float x12 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i25 == -1) {
                                    x12 -= mj0Var.b.getX();
                                    f18 = y11 - mj0Var.b.getY();
                                } else {
                                    f18 = y11;
                                }
                                i14 = i25;
                                float x13 = ((wVar.h0.getX() + (wVar.getX() + s21Var2.getX())) - jj0Var2.getX()) - org.telegram.messenger.i0.L(1.0f);
                                float y12 = (wVar.h0.getY() + (wVar.g0.getY() + (wVar.getY() + s21Var2.getY()))) - jj0Var2.getY();
                                float measuredWidth = s21Var2.getMeasuredWidth();
                                if (s21Var2.L) {
                                    i18 = 4;
                                } else {
                                    i18 = 4;
                                    if (i20 != 4) {
                                        f21 = x13;
                                        hashMap2 = hashMap;
                                        float f31 = y12;
                                        i15 = i20;
                                        float T12 = org.telegram.messenger.i0.T1(x12, f21, b0Var.j);
                                        float f32 = x12;
                                        float T13 = org.telegram.messenger.i0.T1(f18, f31, b0Var.j);
                                        float f33 = f18;
                                        float measuredWidth2 = measuredWidth / jj0Var2.getMeasuredWidth();
                                        i17 = save;
                                        rectF5 = rectF;
                                        f17 = org.telegram.messenger.i0.T1(1.0f, measuredWidth2, b0Var.j);
                                        if (kj0Var.D != 0) {
                                            f22 = org.telegram.messenger.i0.L(6.0f);
                                            f24 = f22;
                                            f23 = 0.0f;
                                        } else if (kj0Var.x) {
                                            f22 = org.telegram.messenger.i0.L(6.0f);
                                            f23 = f22;
                                            f24 = f23;
                                            f25 = f24;
                                            canvas2.translate(T12, T13);
                                            canvas2.scale(f17, f17);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f26 = f22;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f26 = f22;
                                                this.f = org.telegram.messenger.i0.T1((rectF6.left + f32) - f21, 0.0f, b0Var.j);
                                                this.h = org.telegram.messenger.i0.T1((rectF6.top + f33) - f31, 0.0f, b0Var.j);
                                                this.n = org.telegram.messenger.i0.T1(1.0f / measuredWidth2, 1.0f, b0Var.j);
                                                this.r = f21;
                                                this.s = f31;
                                            }
                                            f14 = f26;
                                            f15 = f23;
                                            f13 = f24;
                                            f16 = f25;
                                        } else {
                                            f22 = 0.0f;
                                            f23 = 0.0f;
                                            f24 = 0.0f;
                                        }
                                        f25 = 0.0f;
                                        canvas2.translate(T12, T13);
                                        canvas2.scale(f17, f17);
                                        if (this.f == 0.0f) {
                                        }
                                        f26 = f22;
                                        rectF6 = rectF2;
                                        f14 = f26;
                                        f15 = f23;
                                        f13 = f24;
                                        f16 = f25;
                                    }
                                }
                                if (i20 == i18) {
                                    f19 = x13 - org.telegram.messenger.i0.L(0.33f);
                                    y12 -= org.telegram.messenger.i0.L(1.33f);
                                    f20 = 0.87f * measuredWidth;
                                } else {
                                    f19 = x13;
                                    f20 = measuredWidth;
                                }
                                float f34 = s21Var2.L ? 0.95f * f20 : f20;
                                float f35 = (measuredWidth - f34) / f12;
                                measuredWidth = f34;
                                f21 = f19 + f35;
                                y12 += f35;
                                hashMap2 = hashMap;
                                float f312 = y12;
                                i15 = i20;
                                float T122 = org.telegram.messenger.i0.T1(x12, f21, b0Var.j);
                                float f322 = x12;
                                float T132 = org.telegram.messenger.i0.T1(f18, f312, b0Var.j);
                                float f332 = f18;
                                float measuredWidth22 = measuredWidth / jj0Var2.getMeasuredWidth();
                                i17 = save;
                                rectF5 = rectF;
                                f17 = org.telegram.messenger.i0.T1(1.0f, measuredWidth22, b0Var.j);
                                if (kj0Var.D != 0) {
                                }
                                f25 = 0.0f;
                                canvas2.translate(T122, T132);
                                canvas2.scale(f17, f17);
                                if (this.f == 0.0f) {
                                }
                                f26 = f22;
                                rectF6 = rectF2;
                                f14 = f26;
                                f15 = f23;
                                f13 = f24;
                                f16 = f25;
                            } else {
                                i14 = i25;
                                rectF5 = rectF;
                                i15 = i20;
                                i17 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(jj0Var2.getX() + childAt.getX(), jj0Var2.getY() + childAt.getY());
                                f13 = 0.0f;
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 1.0f;
                            }
                            if (s21Var2 != null) {
                                if (s21Var2.L) {
                                    float measuredWidth3 = kj0Var.getMeasuredWidth() / f12;
                                    float measuredHeight = kj0Var.getMeasuredHeight() / f12;
                                    float measuredWidth4 = kj0Var.getMeasuredWidth() - org.telegram.messenger.i0.L(f12);
                                    float T14 = org.telegram.messenger.i0.T1(measuredWidth4, (s21Var2.getMeasuredWidth() - org.telegram.messenger.i0.L(f12)) / f17, b0Var.j);
                                    RectF rectF11 = org.telegram.messenger.i0.P;
                                    float f36 = T14 / f12;
                                    rectF7 = rectF6;
                                    mj0Var4 = mj0Var;
                                    rectF11.set(measuredWidth3 - f36, measuredHeight - f36, measuredWidth3 + f36, measuredHeight + f36);
                                    float T15 = org.telegram.messenger.i0.T1(measuredWidth4 / f12, org.telegram.messenger.i0.L(4.0f), b0Var.j);
                                    canvas2.drawRoundRect(rectF11, T15, T15, wVar.L);
                                } else {
                                    mj0Var4 = mj0Var;
                                    rectF7 = rectF6;
                                }
                                kj0Var.y = false;
                                if (f13 == 0.0f) {
                                    kj0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = jj0Var2.getImageReceiver();
                                    kj0Var.b();
                                    f5 f5Var = jj0Var2.e;
                                    if (f5Var != null && (c2Var3 = f5Var.k) != null) {
                                        imageReceiver = c2Var3;
                                    }
                                    int[] iArr2 = imageReceiver.W0;
                                    int i26 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i26 >= 4) {
                                            break;
                                        }
                                        iArr[i26] = iArr2[i26];
                                        i26++;
                                    }
                                    imageReceiver.K0((int) org.telegram.messenger.i0.T1(f14, 0.0f, b0Var.j), (int) org.telegram.messenger.i0.T1(f15, 0.0f, b0Var.j), (int) org.telegram.messenger.i0.T1(f16, 0.0f, b0Var.j), (int) org.telegram.messenger.i0.T1(f13, 0.0f, b0Var.j));
                                    kj0Var.draw(canvas2);
                                    imageReceiver.L0(iArr);
                                }
                                boolean z12 = z10;
                                kj0Var.y = z12;
                                if (!s21Var2.b) {
                                    s21Var2.b = z12;
                                    s21Var2.invalidate();
                                }
                            } else {
                                mj0Var4 = mj0Var;
                                rectF7 = rectF6;
                                if (kj0Var.r && jj0Var2.getImageReceiver().B() == null) {
                                    float alpha = jj0Var.getImageReceiver().getAlpha();
                                    jj0Var.getImageReceiver().setAlpha((1.0f - i21) * alpha);
                                    jj0Var.draw(canvas2);
                                    jj0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    kj0Var.b();
                                    ImageReceiver imageReceiver2 = jj0Var2.getImageReceiver();
                                    f5 f5Var2 = jj0Var2.e;
                                    if (f5Var2 != null && (c2Var2 = f5Var2.k) != null) {
                                        imageReceiver2 = c2Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - i21) * alpha2);
                                    jj0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (jj0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            mj0Var3 = mj0Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i16 = -1;
                        } else {
                            i14 = i25;
                            RectF rectF12 = rectF;
                            i15 = i20;
                            i17 = save;
                            hashMap2 = hashMap;
                            mj0Var3 = mj0Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - mj0Var3.x.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i16 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - i21) * 255.0f), 31);
                            float f37 = 1.0f - b0Var.j;
                            canvas2.scale(f37, f37, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i25 = i14 + 1;
                    mj0Var = mj0Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i24 = i16;
                    hashMap = hashMap2;
                    i20 = i15;
                    save = i17;
                    z10 = true;
                }
                mj0Var2 = mj0Var;
                i13 = i20;
                canvas2.restoreToCount(save);
            } else {
                mj0Var2 = mj0Var;
                i13 = i20;
                f12 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i27 = b0Var.F;
            if (i27 < 5) {
                if (i27 == 3) {
                    mj0Var2.setSkipDraw(true);
                }
                b0Var.F++;
            }
            Paint paint2 = wVar.Y1;
            g21 g21Var = wVar.h0;
            ImageReceiver imageReceiver3 = wVar.V0;
            if (wVar.S0 != null) {
                imageReceiver3.H0(this);
                s21 s21Var3 = wVar.S0;
                if (s21Var3 != null) {
                    float f38 = wVar.U0;
                    if (f38 != 1.0f && !wVar.T0 && wVar.h1) {
                        float f39 = f38 + 0.010666667f;
                        wVar.U0 = f39;
                        if (f39 >= 1.0f) {
                            wVar.U0 = 1.0f;
                            g31 g31Var = wVar.H;
                            if (g31Var != null) {
                                mj0 mj0Var6 = (mj0) ((r2.y) g31Var).b;
                                if (s21Var3.s) {
                                    mj0Var6.l(s21Var3, s21Var3.y, true);
                                } else {
                                    long j10 = s21Var3.e.documentId;
                                    o0 o0Var2 = new o0();
                                    o0Var2.g = j10;
                                    o0Var2.h = j10;
                                    mj0Var6.l(s21Var3, o0Var2, true);
                                }
                            }
                        }
                        wVar.S0.G = wVar.U0;
                    }
                    float f40 = (wVar.U0 * f12) + 1.0f;
                    canvas2.save();
                    canvas2.translate(wVar.S0.getX() + g21Var.getX(), wVar.S0.getY() + g21Var.getY() + wVar.g0.getY());
                    paint2.setColor(t6.w0(t6.G8, wVar.Z0));
                    canvas2.drawRect(0.0f, 0.0f, wVar.S0.getMeasuredWidth(), wVar.S0.getMeasuredHeight(), paint2);
                    canvas2.scale(f40, f40, wVar.S0.getMeasuredWidth() / f12, wVar.S0.getMeasuredHeight());
                    s21 s21Var4 = wVar.S0;
                    if (!s21Var4.s) {
                        imageReceiver3 = s21Var4.r;
                    }
                    f5 f5Var3 = wVar.W0;
                    if (f5Var3 != null && (c2Var = f5Var3.k) != null && c2Var.I()) {
                        imageReceiver3 = wVar.W0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.y0(0.0f, 0.0f, wVar.S0.getMeasuredWidth(), wVar.S0.getMeasuredHeight());
                        imageReceiver3.h(canvas2, null);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i13 == 5) {
                canvas2.restore();
            }
            if (b0Var.x != null) {
                invalidate();
            }
            Runnable runnable = e0.c;
            if (runnable != null) {
                runnable.run();
                e0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.x;
        mj0 mj0Var = b0Var.n;
        if (b0Var.y == 1 || !(mj0Var == null || mj0Var.getDelegate() == null || !mj0Var.getDelegate().A())) {
            b0Var.m.f0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int measuredWidth;
        int i12;
        int L;
        int L2;
        b0 b0Var = this.x;
        int i13 = b0Var.y;
        if (i13 == 1 || i13 == 2 || i13 == 4) {
            measuredWidth = b0Var.n.getMeasuredWidth();
        } else if (i13 == 5) {
            measuredWidth = org.telegram.messenger.i0.L(12.0f) + (org.telegram.messenger.i0.L(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            int L3 = (org.telegram.messenger.i0.L(36.0f) * 8) + org.telegram.messenger.i0.L(12.0f);
            if (L3 < measuredWidth) {
                measuredWidth = L3;
            }
        }
        if (b0Var.y != 4) {
            if (b0Var.n.F0) {
                int ceil = (int) Math.ceil(b0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i12 = org.telegram.messenger.i0.L(8.0f) + (org.telegram.messenger.i0.L(36.0f) * ceil);
                } else {
                    L = org.telegram.messenger.i0.L(36.0f) * 8;
                    L2 = org.telegram.messenger.i0.L(8.0f);
                }
            } else {
                i12 = measuredWidth;
            }
            if (b0Var.y == 5) {
                i12 = Math.min(org.telegram.messenger.i0.L(254.0f), i12);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        }
        L = org.telegram.messenger.i0.L(36.0f) * 8;
        L2 = org.telegram.messenger.i0.L(8.0f);
        i12 = L - L2;
        if (b0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.x;
            if (b0Var.y == 2 || (paint = this.c) == null) {
                return;
            }
            paint.setColor(t6.w0(t6.G8, b0Var.s));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
