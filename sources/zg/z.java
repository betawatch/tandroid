package zg;

import ai.m4;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.e2;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.h61;
import org.telegram.ui.i71;
import org.telegram.ui.t61;
import rg.c1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z extends FrameLayout {
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
    public final Path v;
    public final /* synthetic */ a0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Context context) {
        super(context);
        this.w = a0Var;
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
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = i6.Td;
        e6 e6Var = a0Var.s;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        if (a0Var.y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(i6.w0(i6.G8, e6Var));
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
        kl0 kl0Var;
        int i12;
        kl0 kl0Var2;
        int i13;
        float f12;
        m4 m4Var;
        int i14;
        int i15;
        int i16;
        int i17;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        kl0 kl0Var3;
        RectF rectF5;
        RectF rectF6;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        kl0 kl0Var4;
        RectF rectF7;
        m4 m4Var2;
        int[] iArr;
        m4 m4Var3;
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
        n0 n0Var;
        int i19;
        float f28;
        Canvas canvas2 = canvas;
        a0 a0Var = this.w;
        RectF rectF8 = a0Var.f;
        int i20 = a0Var.y;
        RectF rectF9 = a0Var.i;
        w wVar = a0Var.m;
        kl0 kl0Var5 = a0Var.n;
        if (a0Var.l) {
            float clamp = Utilities.clamp(a0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i20 == 4) {
                rectF8.set(kl0Var5.w);
                rectF8.offset(a0Var.g, a0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, a0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(a0Var.e, AndroidUtilities.dp(i20 == 5 ? 20.0f : 8.0f), a0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i20 == 1 || (kl0Var5.getDelegate() != null && kl0Var5.getDelegate().v())) {
                f7 = 1.0f;
                jl0 delegate = kl0Var5.getDelegate();
                float x10 = getX();
                z zVar = a0Var.a;
                z10 = true;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                delegate.r(canvas, rectF9, lerp, x10, i20 == 1 ? zVar.getY() - AndroidUtilities.statusBarHeight : zVar.getY() + a0Var.c.getY(), 255, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int clamp2 = (int) (Utilities.clamp(clamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(clamp2);
                int i21 = (int) rectF9.left;
                Rect rect = this.b;
                f7 = 1.0f;
                drawable.setBounds(i21 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                ch.d dVar = a0Var.z;
                Paint paint = this.c;
                if (dVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF10.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    a0Var.z.setBounds(rect2);
                    a0Var.z.setAlpha(paint.getAlpha());
                    a0Var.z.q(lerp);
                    a0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, lerp, lerp, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                z10 = true;
            }
            if (kl0Var5.R0 != null) {
                canvas2.save();
                float f29 = rectF.left;
                float y3 = kl0Var5.R0.getY() + rectF.top;
                if (i20 == 3 || i20 == i10) {
                    i19 = 5;
                } else {
                    i19 = 5;
                    if (i20 != 5) {
                        f28 = 0.0f;
                        canvas2.translate(f29, y3 - f28);
                        rectF2 = rectF8;
                        f11 = lerp;
                        i11 = i19;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, kl0Var5.R0.getMeasuredWidth(), kl0Var5.R0.getMeasuredHeight(), (int) ((f7 - a0Var.j) * kl0Var5.R0.getAlpha() * f10), 31);
                        kl0Var5.R0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f28 = kl0Var5.w.top;
                canvas2.translate(f29, y3 - f28);
                rectF2 = rectF8;
                f11 = lerp;
                i11 = i19;
                canvas2.saveLayerAlpha(0.0f, 0.0f, kl0Var5.R0.getMeasuredWidth(), kl0Var5.R0.getMeasuredHeight(), (int) ((f7 - a0Var.j) * kl0Var5.R0.getAlpha() * f10), 31);
                kl0Var5.R0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f11 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - kl0Var5.w.width()) + (rectF.left - kl0Var5.w.left);
            if (a0Var.j > 0.05f || i20 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - kl0Var5.w.height()) + (rectF.top - kl0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(kl0Var5.v, f7)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                kl0Var5.f(kl0Var5.E * max, max, kl0Var5.F * max, kl0Var5.M0 == i11 ? 255 : (int) org.telegram.messenger.q.z(1.0f, kl0Var5.w0, Utilities.clamp(kl0Var5.w0 / 0.2f, 1.0f, 0.0f), f10), canvas3);
                kl0Var = kl0Var5;
                canvas2 = canvas3;
                canvas2.restore();
                i12 = 5;
            } else {
                i12 = i11;
                kl0Var = kl0Var5;
            }
            if (i20 == i12) {
                Path path = this.v;
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
            if (kl0Var != null) {
                for (int childCount = wVar.h0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (wVar.h0.getChildAt(childCount) instanceof t61) {
                        t61 t61Var = (t61) wVar.h0.getChildAt(childCount);
                        if (t61Var.y && (n0Var = t61Var.x) != null) {
                            hashMap.put(n0Var, t61Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, e2.y(1.0f, a0Var.j, kl0Var.g() + kl0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (wVar.i0.getVisibility() == 0 ? wVar.i0.getAlpha() : 0.0f), 1.0f - a0Var.j);
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
                        f27 = x11 + (AndroidUtilities.dp(36.0f) * a0Var.j);
                    } else {
                        f12 = 2.0f;
                        f27 = 0.0f;
                    }
                    canvas2.clipRect(f30, f27, wVar.h0.getMeasuredWidth() + y10, wVar.h0.getMeasuredHeight() + x11);
                } else {
                    f12 = 2.0f;
                }
                int i22 = -1;
                int i23 = -1;
                while (i23 < kl0Var.b.getChildCount()) {
                    View childAt = i23 == i22 ? kl0Var.z0 : kl0Var.b.getChildAt(i23);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i14 = i23;
                        i15 = i20;
                        i16 = i22;
                        i17 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        kl0Var3 = kl0Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof il0) {
                            il0 il0Var = (il0) childAt;
                            hl0 hl0Var = il0Var.a;
                            hl0 hl0Var2 = il0Var.b;
                            c1 c1Var = il0Var.f;
                            if (c1Var != null) {
                                c1Var.setAlpha(1.0f - a0Var.j);
                            }
                            t61 t61Var2 = (t61) hashMap.get(il0Var.e);
                            if (t61Var2 != null) {
                                float x12 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i23 == -1) {
                                    x12 -= kl0Var.b.getX();
                                    f18 = y11 - kl0Var.b.getY();
                                } else {
                                    f18 = y11;
                                }
                                i14 = i23;
                                float x13 = ((wVar.h0.getX() + (wVar.getX() + t61Var2.getX())) - hl0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y12 = (wVar.h0.getY() + (wVar.g0.getY() + (wVar.getY() + t61Var2.getY()))) - hl0Var2.getY();
                                float measuredWidth = t61Var2.getMeasuredWidth();
                                if (t61Var2.L) {
                                    i18 = 4;
                                } else {
                                    i18 = 4;
                                    if (i20 != 4) {
                                        f21 = x13;
                                        hashMap2 = hashMap;
                                        float f31 = y12;
                                        i15 = i20;
                                        float lerp2 = AndroidUtilities.lerp(x12, f21, a0Var.j);
                                        float f32 = x12;
                                        float lerp3 = AndroidUtilities.lerp(f18, f31, a0Var.j);
                                        float f33 = f18;
                                        float measuredWidth2 = measuredWidth / hl0Var2.getMeasuredWidth();
                                        i17 = save;
                                        rectF5 = rectF;
                                        f17 = AndroidUtilities.lerp(1.0f, measuredWidth2, a0Var.j);
                                        if (il0Var.y != 0) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f24 = f22;
                                            f23 = 0.0f;
                                        } else if (il0Var.w) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f23 = f22;
                                            f24 = f23;
                                            f25 = f24;
                                            canvas2.translate(lerp2, lerp3);
                                            canvas2.scale(f17, f17);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f26 = f22;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f26 = f22;
                                                this.f = AndroidUtilities.lerp((rectF6.left + f32) - f21, 0.0f, a0Var.j);
                                                this.h = AndroidUtilities.lerp((rectF6.top + f33) - f31, 0.0f, a0Var.j);
                                                this.n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, a0Var.j);
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
                                        canvas2.translate(lerp2, lerp3);
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
                                    f19 = x13 - AndroidUtilities.dp(0.33f);
                                    y12 -= AndroidUtilities.dp(1.33f);
                                    f20 = 0.87f * measuredWidth;
                                } else {
                                    f19 = x13;
                                    f20 = measuredWidth;
                                }
                                float f34 = t61Var2.L ? 0.95f * f20 : f20;
                                float f35 = (measuredWidth - f34) / f12;
                                measuredWidth = f34;
                                f21 = f19 + f35;
                                y12 += f35;
                                hashMap2 = hashMap;
                                float f312 = y12;
                                i15 = i20;
                                float lerp22 = AndroidUtilities.lerp(x12, f21, a0Var.j);
                                float f322 = x12;
                                float lerp32 = AndroidUtilities.lerp(f18, f312, a0Var.j);
                                float f332 = f18;
                                float measuredWidth22 = measuredWidth / hl0Var2.getMeasuredWidth();
                                i17 = save;
                                rectF5 = rectF;
                                f17 = AndroidUtilities.lerp(1.0f, measuredWidth22, a0Var.j);
                                if (il0Var.y != 0) {
                                }
                                f25 = 0.0f;
                                canvas2.translate(lerp22, lerp32);
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
                                i14 = i23;
                                rectF5 = rectF;
                                i15 = i20;
                                i17 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(hl0Var2.getX() + childAt.getX(), hl0Var2.getY() + childAt.getY());
                                f13 = 0.0f;
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 1.0f;
                            }
                            if (t61Var2 != null) {
                                if (t61Var2.L) {
                                    float measuredWidth3 = il0Var.getMeasuredWidth() / f12;
                                    float measuredHeight = il0Var.getMeasuredHeight() / f12;
                                    float measuredWidth4 = il0Var.getMeasuredWidth() - AndroidUtilities.dp(f12);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (t61Var2.getMeasuredWidth() - AndroidUtilities.dp(f12)) / f17, a0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f36 = lerp4 / f12;
                                    rectF7 = rectF6;
                                    kl0Var4 = kl0Var;
                                    rectF11.set(measuredWidth3 - f36, measuredHeight - f36, measuredWidth3 + f36, measuredHeight + f36);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f12, AndroidUtilities.dp(4.0f), a0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, wVar.L);
                                } else {
                                    kl0Var4 = kl0Var;
                                    rectF7 = rectF6;
                                }
                                il0Var.x = false;
                                if (f13 == 0.0f) {
                                    il0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = hl0Var2.getImageReceiver();
                                    il0Var.b();
                                    s5 s5Var = hl0Var2.e;
                                    if (s5Var != null && (m4Var3 = s5Var.k) != null) {
                                        imageReceiver = m4Var3;
                                    }
                                    int[] roundRadius = imageReceiver.getRoundRadius();
                                    int i24 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i24 >= 4) {
                                            break;
                                        }
                                        iArr[i24] = roundRadius[i24];
                                        i24++;
                                    }
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f14, 0.0f, a0Var.j), (int) AndroidUtilities.lerp(f15, 0.0f, a0Var.j), (int) AndroidUtilities.lerp(f16, 0.0f, a0Var.j), (int) AndroidUtilities.lerp(f13, 0.0f, a0Var.j));
                                    il0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                boolean z12 = z10;
                                il0Var.x = z12;
                                if (!t61Var2.b) {
                                    t61Var2.b = z12;
                                    t61Var2.invalidate();
                                }
                            } else {
                                kl0Var4 = kl0Var;
                                rectF7 = rectF6;
                                if (il0Var.r && hl0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = hl0Var.getImageReceiver().getAlpha();
                                    hl0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    hl0Var.draw(canvas2);
                                    hl0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    il0Var.b();
                                    ImageReceiver imageReceiver2 = hl0Var2.getImageReceiver();
                                    s5 s5Var2 = hl0Var2.e;
                                    if (s5Var2 != null && (m4Var2 = s5Var2.k) != null) {
                                        imageReceiver2 = m4Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    hl0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (hl0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            kl0Var3 = kl0Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i16 = -1;
                        } else {
                            i14 = i23;
                            RectF rectF12 = rectF;
                            i15 = i20;
                            i17 = save;
                            hashMap2 = hashMap;
                            kl0Var3 = kl0Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - kl0Var3.w.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i16 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f37 = 1.0f - a0Var.j;
                            canvas2.scale(f37, f37, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i23 = i14 + 1;
                    kl0Var = kl0Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i22 = i16;
                    hashMap = hashMap2;
                    i20 = i15;
                    save = i17;
                    z10 = true;
                }
                kl0Var2 = kl0Var;
                i13 = i20;
                canvas2.restoreToCount(save);
            } else {
                kl0Var2 = kl0Var;
                i13 = i20;
                f12 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i25 = a0Var.F;
            if (i25 < 5) {
                if (i25 == 3) {
                    kl0Var2.setSkipDraw(true);
                }
                a0Var.F++;
            }
            Paint paint2 = wVar.X1;
            h61 h61Var = wVar.h0;
            ImageReceiver imageReceiver3 = wVar.V0;
            if (wVar.S0 != null) {
                imageReceiver3.setParentView(this);
                t61 t61Var3 = wVar.S0;
                if (t61Var3 != null) {
                    float f38 = wVar.U0;
                    if (f38 != 1.0f && !wVar.T0 && wVar.h1) {
                        float f39 = f38 + 0.010666667f;
                        wVar.U0 = f39;
                        if (f39 >= 1.0f) {
                            wVar.U0 = 1.0f;
                            i71 i71Var = wVar.H;
                            if (i71Var != null) {
                                kl0 kl0Var6 = (kl0) ((w3.b) i71Var).a;
                                if (t61Var3.s) {
                                    kl0Var6.l(t61Var3, t61Var3.x, true);
                                } else {
                                    long j3 = t61Var3.e.documentId;
                                    n0 n0Var2 = new n0();
                                    n0Var2.g = j3;
                                    n0Var2.h = j3;
                                    kl0Var6.l(t61Var3, n0Var2, true);
                                }
                            }
                        }
                        wVar.S0.G = wVar.U0;
                    }
                    float f40 = (wVar.U0 * f12) + 1.0f;
                    canvas2.save();
                    canvas2.translate(wVar.S0.getX() + h61Var.getX(), wVar.S0.getY() + h61Var.getY() + wVar.g0.getY());
                    paint2.setColor(i6.w0(i6.G8, wVar.Z0));
                    canvas2.drawRect(0.0f, 0.0f, wVar.S0.getMeasuredWidth(), wVar.S0.getMeasuredHeight(), paint2);
                    canvas2.scale(f40, f40, wVar.S0.getMeasuredWidth() / f12, wVar.S0.getMeasuredHeight());
                    t61 t61Var4 = wVar.S0;
                    if (!t61Var4.s) {
                        imageReceiver3 = t61Var4.r;
                    }
                    s5 s5Var3 = wVar.W0;
                    if (s5Var3 != null && (m4Var = s5Var3.k) != null && m4Var.hasBitmapImage()) {
                        imageReceiver3 = wVar.W0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.setImageCoords(0.0f, 0.0f, wVar.S0.getMeasuredWidth(), wVar.S0.getMeasuredHeight());
                        imageReceiver3.draw(canvas2);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i13 == 5) {
                canvas2.restore();
            }
            if (a0Var.x != null) {
                invalidate();
            }
            Runnable runnable = d0.c;
            if (runnable != null) {
                runnable.run();
                d0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.w;
        kl0 kl0Var = a0Var.n;
        if (a0Var.y == 1 || !(kl0Var == null || kl0Var.getDelegate() == null || !kl0Var.getDelegate().v())) {
            a0Var.m.f0.invalidate();
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
        int dp;
        int dp2;
        a0 a0Var = this.w;
        int i13 = a0Var.y;
        if (i13 == 1 || i13 == 2 || i13 == 4) {
            measuredWidth = a0Var.n.getMeasuredWidth();
        } else if (i13 == 5) {
            measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            int dp3 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
            if (dp3 < measuredWidth) {
                measuredWidth = dp3;
            }
        }
        if (a0Var.y != 4) {
            if (a0Var.n.F0) {
                int ceil = (int) Math.ceil(a0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i12 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * ceil);
                } else {
                    dp = AndroidUtilities.dp(36.0f) * 8;
                    dp2 = AndroidUtilities.dp(8.0f);
                }
            } else {
                i12 = measuredWidth;
            }
            if (a0Var.y == 5) {
                i12 = Math.min(AndroidUtilities.dp(254.0f), i12);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        }
        dp = AndroidUtilities.dp(36.0f) * 8;
        dp2 = AndroidUtilities.dp(8.0f);
        i12 = dp - dp2;
        if (a0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }
}
