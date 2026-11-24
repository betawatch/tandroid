// default package

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w53 extends FrameLayout implements vlb {
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
    public final /* synthetic */ x53 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w53(x53 x53Var, Context context) {
        super(context);
        this.x = x53Var;
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
        int L = gm.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i = cmb.Je;
        ylb ylbVar = x53Var.s;
        anb.x(this, mutate, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        if (x53Var.y == 2) {
            paint.setColor(on2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(cmb.v0(cmb.F8, ylbVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x044d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        HashMap hashMap;
        byte b;
        float f2;
        RectF rectF;
        float f3;
        RectF rectF2;
        byte b2;
        v29 v29Var;
        byte b3;
        v29 v29Var2;
        byte b4;
        float f4;
        mm mmVar;
        int i;
        byte b5;
        int i2;
        int i3;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        v29 v29Var3;
        RectF rectF5;
        RectF rectF6;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        v29 v29Var4;
        RectF rectF7;
        mm mmVar2;
        int[] iArr;
        mm mmVar3;
        float f10;
        byte b6;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        k39 k39Var;
        byte b7;
        float f20;
        Canvas canvas2 = canvas;
        x53 x53Var = this.x;
        RectF rectF8 = x53Var.f;
        byte b8 = x53Var.y;
        RectF rectF9 = x53Var.i;
        t53 t53Var = x53Var.m;
        v29 v29Var5 = x53Var.n;
        if (x53Var.l) {
            float i4 = Utilities.i(x53Var.j, 1.0f, 0.0f);
            RectF rectF10 = gm.P;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (b8 == 4) {
                rectF8.set(v29Var5.x);
                rectF8.offset(x53Var.g, x53Var.h);
            }
            gm.X1(rectF8, rectF10, x53Var.j, rectF9);
            float R1 = gm.R1(x53Var.e, gm.L(b8 == 5 ? 20.0f : 8.0f), x53Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (b8 == 1 || (v29Var5.getDelegate() != null && v29Var5.getDelegate().s())) {
                f = 1.0f;
                u29 delegate = v29Var5.getDelegate();
                float x = getX();
                w53 w53Var = x53Var.a;
                z = true;
                hashMap = hashMap3;
                b = 4;
                f2 = 255.0f;
                delegate.m(canvas, rectF9, R1, x, b8 == 1 ? w53Var.getY() - gm.m : w53Var.getY() + x53Var.c.getY(), nm7.d4, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int i5 = (int) (Utilities.i(i4 / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(i5);
                int i6 = (int) rectF9.left;
                Rect rect = this.b;
                f = 1.0f;
                drawable.setBounds(i6 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                im0 im0Var = x53Var.z;
                Paint paint = this.c;
                if (im0Var != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = gm.Q;
                    rectF10.round(rect2);
                    rect2.inset(-gm.L(8.0f), -gm.L(8.0f));
                    x53Var.z.setBounds(rect2);
                    x53Var.z.setAlpha(paint.getAlpha());
                    x53Var.z.r(R1);
                    x53Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, R1, R1, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                b = 4;
                f2 = 255.0f;
                z = true;
            }
            if (v29Var5.S0 != null) {
                canvas2.save();
                float f21 = rectF.left;
                float y = v29Var5.S0.getY() + rectF.top;
                if (b8 == 3 || b8 == b) {
                    b7 = 5;
                } else {
                    b7 = 5;
                    if (b8 != 5) {
                        f20 = 0.0f;
                        canvas2.translate(f21, y - f20);
                        rectF2 = rectF8;
                        f3 = R1;
                        b2 = b7;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, v29Var5.S0.getMeasuredWidth(), v29Var5.S0.getMeasuredHeight(), (int) ((f - x53Var.j) * v29Var5.S0.getAlpha() * f2), 31);
                        v29Var5.S0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f20 = v29Var5.x.top;
                canvas2.translate(f21, y - f20);
                rectF2 = rectF8;
                f3 = R1;
                b2 = b7;
                canvas2.saveLayerAlpha(0.0f, 0.0f, v29Var5.S0.getMeasuredWidth(), v29Var5.S0.getMeasuredHeight(), (int) ((f - x53Var.j) * v29Var5.S0.getAlpha() * f2), 31);
                v29Var5.S0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f3 = R1;
                rectF2 = rectF8;
                b2 = 5;
            }
            float width = (rectF.width() - v29Var5.x.width()) + (rectF.left - v29Var5.x.left);
            if (x53Var.j > 0.05f || b8 == b2) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - v29Var5.x.height()) + (rectF.top - v29Var5.x.top));
                float max = (Math.max(0.25f, Math.min(v29Var5.w, f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                v29Var5.c(v29Var5.F * max, max, v29Var5.G * max, v29Var5.N0 == b2 ? nm7.d4 : (int) td4.z(1.0f, v29Var5.x0, Utilities.i(v29Var5.x0 / 0.2f, 1.0f, 0.0f), f2), canvas3);
                v29Var = v29Var5;
                canvas2 = canvas3;
                canvas2.restore();
                b3 = 5;
            } else {
                b3 = b2;
                v29Var = v29Var5;
            }
            if (b8 == b3) {
                Path path = this.w;
                path.rewind();
                path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f = 0.0f;
            this.h = 0.0f;
            this.n = 1.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            if (v29Var != null) {
                for (int childCount = t53Var.i0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (t53Var.i0.getChildAt(childCount) instanceof fz9) {
                        fz9 fz9Var = (fz9) t53Var.i0.getChildAt(childCount);
                        if (fz9Var.E && (k39Var = fz9Var.y) != null) {
                            hashMap.put(k39Var, fz9Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, td4.A(1.0f, x53Var.j, v29Var.d() + v29Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (t53Var.j0.getVisibility() == 0 ? t53Var.j0.getAlpha() : 0.0f), 1.0f - x53Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x2 = (int) (t53Var.i0.getX() + t53Var.getX());
                int y2 = (int) (t53Var.i0.getY() + t53Var.getY());
                boolean z2 = t53Var.e0.getParent() != null ? z : false;
                if (b8 != 5) {
                    float f22 = y2;
                    if (z2) {
                        f4 = 2.0f;
                        f19 = x2 + (gm.L(36.0f) * x53Var.j);
                    } else {
                        f4 = 2.0f;
                        f19 = 0.0f;
                    }
                    canvas2.clipRect(f22, f19, t53Var.i0.getMeasuredWidth() + y2, t53Var.i0.getMeasuredHeight() + x2);
                } else {
                    f4 = 2.0f;
                }
                int i7 = -1;
                int i8 = -1;
                while (i8 < v29Var.b.getChildCount()) {
                    View childAt = i8 == i7 ? v29Var.A0 : v29Var.b.getChildAt(i8);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i = i8;
                        b5 = b8;
                        i2 = i7;
                        i3 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        v29Var3 = v29Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof t29) {
                            t29 t29Var = (t29) childAt;
                            s29 s29Var = t29Var.a;
                            s29 s29Var2 = t29Var.b;
                            pj8 pj8Var = t29Var.f;
                            if (pj8Var != null) {
                                pj8Var.setAlpha(1.0f - x53Var.j);
                            }
                            fz9 fz9Var2 = (fz9) hashMap.get(t29Var.e);
                            if (fz9Var2 != null) {
                                float x3 = childAt.getX();
                                float y3 = childAt.getY();
                                if (i8 == -1) {
                                    x3 -= v29Var.b.getX();
                                    f10 = y3 - v29Var.b.getY();
                                } else {
                                    f10 = y3;
                                }
                                i = i8;
                                float x4 = ((t53Var.i0.getX() + (t53Var.getX() + fz9Var2.getX())) - s29Var2.getX()) - gm.L(1.0f);
                                float y4 = (t53Var.i0.getY() + (t53Var.h0.getY() + (t53Var.getY() + fz9Var2.getY()))) - s29Var2.getY();
                                float measuredWidth = fz9Var2.getMeasuredWidth();
                                if (fz9Var2.M) {
                                    b6 = 4;
                                } else {
                                    b6 = 4;
                                    if (b8 != 4) {
                                        f13 = x4;
                                        hashMap2 = hashMap;
                                        float f23 = y4;
                                        b5 = b8;
                                        float R12 = gm.R1(x3, f13, x53Var.j);
                                        float f24 = x3;
                                        float R13 = gm.R1(f10, f23, x53Var.j);
                                        float f25 = f10;
                                        float measuredWidth2 = measuredWidth / s29Var2.getMeasuredWidth();
                                        i3 = save;
                                        rectF5 = rectF;
                                        f9 = gm.R1(1.0f, measuredWidth2, x53Var.j);
                                        if (t29Var.E != 0) {
                                            f14 = gm.L(6.0f);
                                            f16 = f14;
                                            f15 = 0.0f;
                                        } else if (t29Var.x) {
                                            f14 = gm.L(6.0f);
                                            f15 = f14;
                                            f16 = f15;
                                            f17 = f16;
                                            canvas2.translate(R12, R13);
                                            canvas2.scale(f9, f9);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f18 = f14;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f18 = f14;
                                                this.f = gm.R1((rectF6.left + f24) - f13, 0.0f, x53Var.j);
                                                this.h = gm.R1((rectF6.top + f25) - f23, 0.0f, x53Var.j);
                                                this.n = gm.R1(1.0f / measuredWidth2, 1.0f, x53Var.j);
                                                this.r = f13;
                                                this.s = f23;
                                            }
                                            f6 = f18;
                                            f7 = f15;
                                            f5 = f16;
                                            f8 = f17;
                                        } else {
                                            f14 = 0.0f;
                                            f15 = 0.0f;
                                            f16 = 0.0f;
                                        }
                                        f17 = 0.0f;
                                        canvas2.translate(R12, R13);
                                        canvas2.scale(f9, f9);
                                        if (this.f == 0.0f) {
                                        }
                                        f18 = f14;
                                        rectF6 = rectF2;
                                        f6 = f18;
                                        f7 = f15;
                                        f5 = f16;
                                        f8 = f17;
                                    }
                                }
                                if (b8 == b6) {
                                    f11 = x4 - gm.L(0.33f);
                                    y4 -= gm.L(1.33f);
                                    f12 = 0.87f * measuredWidth;
                                } else {
                                    f11 = x4;
                                    f12 = measuredWidth;
                                }
                                float f26 = fz9Var2.M ? 0.95f * f12 : f12;
                                float f27 = (measuredWidth - f26) / f4;
                                measuredWidth = f26;
                                f13 = f11 + f27;
                                y4 += f27;
                                hashMap2 = hashMap;
                                float f232 = y4;
                                b5 = b8;
                                float R122 = gm.R1(x3, f13, x53Var.j);
                                float f242 = x3;
                                float R132 = gm.R1(f10, f232, x53Var.j);
                                float f252 = f10;
                                float measuredWidth22 = measuredWidth / s29Var2.getMeasuredWidth();
                                i3 = save;
                                rectF5 = rectF;
                                f9 = gm.R1(1.0f, measuredWidth22, x53Var.j);
                                if (t29Var.E != 0) {
                                }
                                f17 = 0.0f;
                                canvas2.translate(R122, R132);
                                canvas2.scale(f9, f9);
                                if (this.f == 0.0f) {
                                }
                                f18 = f14;
                                rectF6 = rectF2;
                                f6 = f18;
                                f7 = f15;
                                f5 = f16;
                                f8 = f17;
                            } else {
                                i = i8;
                                rectF5 = rectF;
                                b5 = b8;
                                i3 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(s29Var2.getX() + childAt.getX(), s29Var2.getY() + childAt.getY());
                                f5 = 0.0f;
                                f6 = 0.0f;
                                f7 = 0.0f;
                                f8 = 0.0f;
                                f9 = 1.0f;
                            }
                            if (fz9Var2 != null) {
                                if (fz9Var2.M) {
                                    float measuredWidth3 = t29Var.getMeasuredWidth() / f4;
                                    float measuredHeight = t29Var.getMeasuredHeight() / f4;
                                    float measuredWidth4 = t29Var.getMeasuredWidth() - gm.L(f4);
                                    float R14 = gm.R1(measuredWidth4, (fz9Var2.getMeasuredWidth() - gm.L(f4)) / f9, x53Var.j);
                                    RectF rectF11 = gm.P;
                                    float f28 = R14 / f4;
                                    rectF7 = rectF6;
                                    v29Var4 = v29Var;
                                    rectF11.set(measuredWidth3 - f28, measuredHeight - f28, measuredWidth3 + f28, measuredHeight + f28);
                                    float R15 = gm.R1(measuredWidth4 / f4, gm.L(4.0f), x53Var.j);
                                    canvas2.drawRoundRect(rectF11, R15, R15, t53Var.M);
                                } else {
                                    v29Var4 = v29Var;
                                    rectF7 = rectF6;
                                }
                                t29Var.y = false;
                                if (f5 == 0.0f) {
                                    t29Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = s29Var2.getImageReceiver();
                                    t29Var.a();
                                    vm vmVar = s29Var2.e;
                                    if (vmVar != null && (mmVar3 = vmVar.k) != null) {
                                        imageReceiver = mmVar3;
                                    }
                                    int[] iArr2 = imageReceiver.X0;
                                    int i9 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i9 >= 4) {
                                            break;
                                        }
                                        iArr[i9] = iArr2[i9];
                                        i9++;
                                    }
                                    imageReceiver.r0((int) gm.R1(f6, 0.0f, x53Var.j), (int) gm.R1(f7, 0.0f, x53Var.j), (int) gm.R1(f8, 0.0f, x53Var.j), (int) gm.R1(f5, 0.0f, x53Var.j));
                                    t29Var.draw(canvas2);
                                    imageReceiver.s0(iArr);
                                }
                                boolean z3 = z;
                                t29Var.y = z3;
                                if (!fz9Var2.b) {
                                    fz9Var2.b = z3;
                                    fz9Var2.invalidate();
                                }
                            } else {
                                v29Var4 = v29Var;
                                rectF7 = rectF6;
                                if (t29Var.r && s29Var2.getImageReceiver().y() == null) {
                                    float alpha = s29Var.getImageReceiver().getAlpha();
                                    s29Var.getImageReceiver().setAlpha((1.0f - i4) * alpha);
                                    s29Var.draw(canvas2);
                                    s29Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    t29Var.a();
                                    ImageReceiver imageReceiver2 = s29Var2.getImageReceiver();
                                    vm vmVar2 = s29Var2.e;
                                    if (vmVar2 != null && (mmVar2 = vmVar2.k) != null) {
                                        imageReceiver2 = mmVar2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - i4) * alpha2);
                                    s29Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (s29Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            v29Var3 = v29Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i2 = -1;
                        } else {
                            i = i8;
                            RectF rectF12 = rectF;
                            b5 = b8;
                            i3 = save;
                            hashMap2 = hashMap;
                            v29Var3 = v29Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - v29Var3.x.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i2 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - i4) * 255.0f), 31);
                            float f29 = 1.0f - x53Var.j;
                            canvas2.scale(f29, f29, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i8 = i + 1;
                    v29Var = v29Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i7 = i2;
                    hashMap = hashMap2;
                    b8 = b5;
                    save = i3;
                    z = true;
                }
                v29Var2 = v29Var;
                b4 = b8;
                canvas2.restoreToCount(save);
            } else {
                v29Var2 = v29Var;
                b4 = b8;
                f4 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i10 = x53Var.F;
            if (i10 < 5) {
                if (i10 == 3) {
                    v29Var2.setSkipDraw(true);
                }
                x53Var.F++;
            }
            Paint paint2 = t53Var.Z1;
            ty9 ty9Var = t53Var.i0;
            ImageReceiver imageReceiver3 = t53Var.W0;
            if (t53Var.T0 != null) {
                imageReceiver3.p0(this);
                fz9 fz9Var3 = t53Var.T0;
                if (fz9Var3 != null) {
                    float f30 = t53Var.V0;
                    if (f30 != 1.0f && !t53Var.U0 && t53Var.i1) {
                        float f31 = f30 + 0.010666667f;
                        t53Var.V0 = f31;
                        if (f31 >= 1.0f) {
                            t53Var.V0 = 1.0f;
                            tz9 tz9Var = t53Var.I;
                            if (tz9Var != null) {
                                boolean z4 = fz9Var3.s;
                                v29 v29Var6 = (v29) ((ni6) tz9Var).b;
                                if (z4) {
                                    v29Var6.i(fz9Var3, fz9Var3.y, true);
                                } else {
                                    long j = fz9Var3.e.documentId;
                                    k39 k39Var2 = new k39();
                                    k39Var2.g = j;
                                    k39Var2.h = j;
                                    v29Var6.i(fz9Var3, k39Var2, true);
                                }
                            }
                        }
                        fz9 fz9Var4 = t53Var.T0;
                        f30 = t53Var.V0;
                        fz9Var4.H = f30;
                    }
                    float f32 = (f30 * f4) + 1.0f;
                    canvas2.save();
                    canvas2.translate(t53Var.T0.getX() + ty9Var.getX(), t53Var.T0.getY() + ty9Var.getY() + t53Var.h0.getY());
                    paint2.setColor(cmb.v0(cmb.F8, t53Var.a1));
                    canvas2.drawRect(0.0f, 0.0f, t53Var.T0.getMeasuredWidth(), t53Var.T0.getMeasuredHeight(), paint2);
                    canvas2.scale(f32, f32, t53Var.T0.getMeasuredWidth() / f4, t53Var.T0.getMeasuredHeight());
                    fz9 fz9Var5 = t53Var.T0;
                    if (!fz9Var5.s) {
                        imageReceiver3 = fz9Var5.r;
                    }
                    vm vmVar3 = t53Var.X0;
                    if (vmVar3 != null && (mmVar = vmVar3.k) != null && mmVar.B()) {
                        imageReceiver3 = t53Var.X0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.i0(0.0f, 0.0f, t53Var.T0.getMeasuredWidth(), t53Var.T0.getMeasuredHeight());
                        imageReceiver3.h(canvas2, null);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (b4 == 5) {
                canvas2.restore();
            }
            if (x53Var.x != null) {
                invalidate();
            }
            Runnable runnable = oi5.c;
            if (runnable != null) {
                runnable.run();
                oi5.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        x53 x53Var = this.x;
        v29 v29Var = x53Var.n;
        if (x53Var.y == 1 || !(v29Var == null || v29Var.getDelegate() == null || !v29Var.getDelegate().s())) {
            x53Var.m.g0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        int L;
        int L2;
        x53 x53Var = this.x;
        v29 v29Var = x53Var.n;
        byte b = x53Var.y;
        if (b == 1 || b == 2 || b == 4) {
            measuredWidth = v29Var.getMeasuredWidth();
        } else if (b == 5) {
            measuredWidth = gm.L(12.0f) + (gm.L(36.0f) << 3);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            int L3 = (gm.L(36.0f) << 3) + gm.L(12.0f);
            if (L3 < measuredWidth) {
                measuredWidth = L3;
            }
        }
        if (b != 4) {
            if (v29Var.G0) {
                int ceil = (int) Math.ceil(x53Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i3 = gm.L(8.0f) + (gm.L(36.0f) * ceil);
                } else {
                    L = gm.L(36.0f) << 3;
                    L2 = gm.L(8.0f);
                }
            } else {
                i3 = measuredWidth;
            }
            if (b == 5) {
                i3 = Math.min(gm.L(254.0f), i3);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
        }
        L = gm.L(36.0f) << 3;
        L2 = gm.L(8.0f);
        i3 = L - L2;
        if (b == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        Paint paint;
        try {
            x53 x53Var = this.x;
            if (x53Var.y == 2 || (paint = this.c) == null) {
                return;
            }
            paint.setColor(cmb.v0(cmb.F8, x53Var.s));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
