package zg;

import ai.l4;
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
import org.telegram.messenger.z0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.i61;
import org.telegram.ui.w51;
import org.telegram.ui.x61;
import rg.b1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class b0 extends FrameLayout {
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
    public final /* synthetic */ c0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Context context) {
        super(context);
        this.w = c0Var;
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
        int i10 = h6.Td;
        d6 d6Var = c0Var.s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (c0Var.y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(h6.v0(h6.G8, d6Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x046c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        HashMap hashMap;
        int i10;
        float f10;
        RectF rectF;
        float f11;
        RectF rectF2;
        int i11;
        gk0 gk0Var;
        gk0 gk0Var2;
        int i12;
        float f12;
        l4 l4Var;
        int i13;
        RectF rectF3;
        gk0 gk0Var3;
        int i14;
        int i15;
        HashMap hashMap2;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        gk0 gk0Var4;
        RectF rectF7;
        l4 l4Var2;
        int[] iArr;
        l4 l4Var3;
        float f18;
        int i16;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        p0 p0Var;
        float f28;
        Canvas canvas2 = canvas;
        c0 c0Var = this.w;
        RectF rectF8 = c0Var.f;
        int i17 = c0Var.y;
        RectF rectF9 = c0Var.i;
        y yVar = c0Var.m;
        gk0 gk0Var5 = c0Var.n;
        if (c0Var.l) {
            float clamp = Utilities.clamp(c0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i17 == 4) {
                rectF8.set(gk0Var5.w);
                rectF8.offset(c0Var.g, c0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, c0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(c0Var.e, AndroidUtilities.dp(i17 == 5 ? 20.0f : 8.0f), c0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i17 == 1 || (gk0Var5.getDelegate() != null && gk0Var5.getDelegate().q())) {
                f7 = 1.0f;
                fk0 delegate = gk0Var5.getDelegate();
                float x10 = getX();
                b0 b0Var = c0Var.a;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                delegate.n(canvas, rectF9, lerp, x10, i17 == 1 ? b0Var.getY() - AndroidUtilities.statusBarHeight : b0Var.getY() + c0Var.c.getY(), 255, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int clamp2 = (int) (Utilities.clamp(clamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(clamp2);
                int i18 = (int) rectF9.left;
                Rect rect = this.b;
                f7 = 1.0f;
                drawable.setBounds(i18 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                ch.d dVar = c0Var.z;
                Paint paint = this.c;
                if (dVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF10.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    c0Var.z.setBounds(rect2);
                    c0Var.z.setAlpha(paint.getAlpha());
                    c0Var.z.q(lerp);
                    c0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, lerp, lerp, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
            }
            if (gk0Var5.R0 != null) {
                canvas2.save();
                float f29 = rectF.left;
                float y3 = gk0Var5.R0.getY() + rectF.top;
                if (i17 != 3 && i17 != i10) {
                    if (i17 != 5) {
                        f28 = 0.0f;
                        canvas2.translate(f29, y3 - f28);
                        rectF2 = rectF8;
                        f11 = lerp;
                        i11 = 5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, gk0Var5.R0.getMeasuredWidth(), gk0Var5.R0.getMeasuredHeight(), (int) ((f7 - c0Var.j) * gk0Var5.R0.getAlpha() * f10), 31);
                        gk0Var5.R0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f28 = gk0Var5.w.top;
                canvas2.translate(f29, y3 - f28);
                rectF2 = rectF8;
                f11 = lerp;
                i11 = 5;
                canvas2.saveLayerAlpha(0.0f, 0.0f, gk0Var5.R0.getMeasuredWidth(), gk0Var5.R0.getMeasuredHeight(), (int) ((f7 - c0Var.j) * gk0Var5.R0.getAlpha() * f10), 31);
                gk0Var5.R0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f11 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - gk0Var5.w.width()) + (rectF.left - gk0Var5.w.left);
            if (c0Var.j > 0.05f || i17 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - gk0Var5.w.height()) + (rectF.top - gk0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(gk0Var5.v, 1.0f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                gk0Var5.f(gk0Var5.E * max, max, gk0Var5.F * max, gk0Var5.M0 == i11 ? 255 : (int) z0.A(1.0f, gk0Var5.w0, Utilities.clamp(gk0Var5.w0 / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                gk0Var = gk0Var5;
                canvas2 = canvas3;
                canvas2.restore();
            } else {
                gk0Var = gk0Var5;
            }
            if (i17 == 5) {
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
            if (gk0Var != null) {
                for (int childCount = yVar.h0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (yVar.h0.getChildAt(childCount) instanceof i61) {
                        i61 i61Var = (i61) yVar.h0.getChildAt(childCount);
                        if (i61Var.y && (p0Var = i61Var.x) != null) {
                            hashMap.put(p0Var, i61Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, e2.z(1.0f, c0Var.j, gk0Var.g() + gk0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (yVar.i0.getVisibility() == 0 ? yVar.i0.getAlpha() : 0.0f), 1.0f - c0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x11 = (int) (yVar.h0.getX() + yVar.getX());
                int y10 = (int) (yVar.h0.getY() + yVar.getY());
                boolean z10 = yVar.d0.getParent() != null;
                if (i17 != 5) {
                    float f30 = y10;
                    if (z10) {
                        f12 = 2.0f;
                        f27 = x11 + (AndroidUtilities.dp(36.0f) * c0Var.j);
                    } else {
                        f12 = 2.0f;
                        f27 = 0.0f;
                    }
                    canvas2.clipRect(f30, f27, yVar.h0.getMeasuredWidth() + y10, yVar.h0.getMeasuredHeight() + x11);
                } else {
                    f12 = 2.0f;
                }
                int i19 = -1;
                int i20 = -1;
                while (i20 < gk0Var.b.getChildCount()) {
                    View childAt = i20 == i19 ? gk0Var.z0 : gk0Var.b.getChildAt(i20);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i13 = i20;
                        rectF3 = rectF;
                        gk0Var3 = gk0Var;
                        i14 = i17;
                        i15 = save;
                        hashMap2 = hashMap;
                        rectF4 = rectF2;
                    } else {
                        canvas2.save();
                        if (childAt instanceof ek0) {
                            ek0 ek0Var = (ek0) childAt;
                            dk0 dk0Var = ek0Var.a;
                            dk0 dk0Var2 = ek0Var.b;
                            b1 b1Var = ek0Var.f;
                            if (b1Var != null) {
                                b1Var.setAlpha(1.0f - c0Var.j);
                            }
                            i61 i61Var2 = (i61) hashMap.get(ek0Var.e);
                            if (i61Var2 != null) {
                                float x12 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i20 == -1) {
                                    x12 -= gk0Var.b.getX();
                                    f18 = y11 - gk0Var.b.getY();
                                } else {
                                    f18 = y11;
                                }
                                i13 = i20;
                                float x13 = ((yVar.h0.getX() + (yVar.getX() + i61Var2.getX())) - dk0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y12 = (yVar.h0.getY() + (yVar.g0.getY() + (yVar.getY() + i61Var2.getY()))) - dk0Var2.getY();
                                float measuredWidth = i61Var2.getMeasuredWidth();
                                if (i61Var2.L) {
                                    i16 = 4;
                                } else {
                                    i16 = 4;
                                    if (i17 != 4) {
                                        f21 = x13;
                                        hashMap2 = hashMap;
                                        float f31 = y12;
                                        i14 = i17;
                                        float lerp2 = AndroidUtilities.lerp(x12, f21, c0Var.j);
                                        float f32 = x12;
                                        float lerp3 = AndroidUtilities.lerp(f18, f31, c0Var.j);
                                        float f33 = f18;
                                        float measuredWidth2 = measuredWidth / dk0Var2.getMeasuredWidth();
                                        i15 = save;
                                        rectF5 = rectF;
                                        f17 = AndroidUtilities.lerp(1.0f, measuredWidth2, c0Var.j);
                                        if (ek0Var.y != 0) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f24 = f22;
                                            f23 = 0.0f;
                                        } else if (ek0Var.w) {
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
                                                this.f = AndroidUtilities.lerp((rectF6.left + f32) - f21, 0.0f, c0Var.j);
                                                this.h = AndroidUtilities.lerp((rectF6.top + f33) - f31, 0.0f, c0Var.j);
                                                this.n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, c0Var.j);
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
                                if (i17 == i16) {
                                    f19 = x13 - AndroidUtilities.dp(0.33f);
                                    y12 -= AndroidUtilities.dp(1.33f);
                                    f20 = 0.87f * measuredWidth;
                                } else {
                                    f19 = x13;
                                    f20 = measuredWidth;
                                }
                                float f34 = i61Var2.L ? 0.95f * f20 : f20;
                                float f35 = (measuredWidth - f34) / f12;
                                measuredWidth = f34;
                                f21 = f19 + f35;
                                y12 += f35;
                                hashMap2 = hashMap;
                                float f312 = y12;
                                i14 = i17;
                                float lerp22 = AndroidUtilities.lerp(x12, f21, c0Var.j);
                                float f322 = x12;
                                float lerp32 = AndroidUtilities.lerp(f18, f312, c0Var.j);
                                float f332 = f18;
                                float measuredWidth22 = measuredWidth / dk0Var2.getMeasuredWidth();
                                i15 = save;
                                rectF5 = rectF;
                                f17 = AndroidUtilities.lerp(1.0f, measuredWidth22, c0Var.j);
                                if (ek0Var.y != 0) {
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
                                i13 = i20;
                                rectF5 = rectF;
                                i14 = i17;
                                i15 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(dk0Var2.getX() + childAt.getX(), dk0Var2.getY() + childAt.getY());
                                f13 = 0.0f;
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 1.0f;
                            }
                            if (i61Var2 != null) {
                                if (i61Var2.L) {
                                    float measuredWidth3 = ek0Var.getMeasuredWidth() / f12;
                                    float measuredHeight = ek0Var.getMeasuredHeight() / f12;
                                    float measuredWidth4 = ek0Var.getMeasuredWidth() - AndroidUtilities.dp(f12);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (i61Var2.getMeasuredWidth() - AndroidUtilities.dp(f12)) / f17, c0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f36 = lerp4 / f12;
                                    rectF7 = rectF6;
                                    gk0Var4 = gk0Var;
                                    rectF11.set(measuredWidth3 - f36, measuredHeight - f36, measuredWidth3 + f36, measuredHeight + f36);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f12, AndroidUtilities.dp(4.0f), c0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, yVar.L);
                                } else {
                                    gk0Var4 = gk0Var;
                                    rectF7 = rectF6;
                                }
                                ek0Var.x = false;
                                if (f13 == 0.0f) {
                                    ek0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = dk0Var2.getImageReceiver();
                                    ek0Var.b();
                                    q5 q5Var = dk0Var2.e;
                                    if (q5Var != null && (l4Var3 = q5Var.k) != null) {
                                        imageReceiver = l4Var3;
                                    }
                                    int[] roundRadius = imageReceiver.getRoundRadius();
                                    int i21 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i21 >= 4) {
                                            break;
                                        }
                                        iArr[i21] = roundRadius[i21];
                                        i21++;
                                    }
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f14, 0.0f, c0Var.j), (int) AndroidUtilities.lerp(f15, 0.0f, c0Var.j), (int) AndroidUtilities.lerp(f16, 0.0f, c0Var.j), (int) AndroidUtilities.lerp(f13, 0.0f, c0Var.j));
                                    ek0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                ek0Var.x = true;
                                if (!i61Var2.b) {
                                    i61Var2.b = true;
                                    i61Var2.invalidate();
                                }
                            } else {
                                gk0Var4 = gk0Var;
                                rectF7 = rectF6;
                                if (ek0Var.r && dk0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = dk0Var.getImageReceiver().getAlpha();
                                    dk0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    dk0Var.draw(canvas2);
                                    dk0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    ek0Var.b();
                                    ImageReceiver imageReceiver2 = dk0Var2.getImageReceiver();
                                    q5 q5Var2 = dk0Var2.e;
                                    if (q5Var2 != null && (l4Var2 = q5Var2.k) != null) {
                                        imageReceiver2 = l4Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    dk0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (dk0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            gk0Var3 = gk0Var4;
                            rectF3 = rectF5;
                            rectF4 = rectF7;
                        } else {
                            i13 = i20;
                            RectF rectF12 = rectF;
                            i14 = i17;
                            i15 = save;
                            hashMap2 = hashMap;
                            gk0Var3 = gk0Var;
                            rectF4 = rectF2;
                            rectF3 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - gk0Var3.w.width(), (childAt.getY() + rectF4.top) - rectF3.top);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f37 = 1.0f - c0Var.j;
                            canvas2.scale(f37, f37, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i20 = i13 + 1;
                    gk0Var = gk0Var3;
                    rectF2 = rectF4;
                    rectF = rectF3;
                    hashMap = hashMap2;
                    i17 = i14;
                    save = i15;
                    i19 = -1;
                }
                gk0Var2 = gk0Var;
                i12 = i17;
                canvas2.restoreToCount(save);
            } else {
                gk0Var2 = gk0Var;
                i12 = i17;
                f12 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i22 = c0Var.F;
            if (i22 < 5) {
                if (i22 == 3) {
                    gk0Var2.setSkipDraw(true);
                }
                c0Var.F++;
            }
            Paint paint2 = yVar.X1;
            w51 w51Var = yVar.h0;
            ImageReceiver imageReceiver3 = yVar.V0;
            if (yVar.S0 != null) {
                imageReceiver3.setParentView(this);
                i61 i61Var3 = yVar.S0;
                if (i61Var3 != null) {
                    float f38 = yVar.U0;
                    if (f38 != 1.0f && !yVar.T0 && yVar.h1) {
                        float f39 = f38 + 0.010666667f;
                        yVar.U0 = f39;
                        if (f39 >= 1.0f) {
                            yVar.U0 = 1.0f;
                            x61 x61Var = yVar.H;
                            if (x61Var != null) {
                                gk0 gk0Var6 = (gk0) ((v8.s) x61Var).a;
                                if (i61Var3.s) {
                                    gk0Var6.l(i61Var3, i61Var3.x, true);
                                } else {
                                    long j3 = i61Var3.e.documentId;
                                    p0 p0Var2 = new p0();
                                    p0Var2.g = j3;
                                    p0Var2.h = j3;
                                    gk0Var6.l(i61Var3, p0Var2, true);
                                }
                            }
                        }
                        yVar.S0.G = yVar.U0;
                    }
                    float f40 = (yVar.U0 * f12) + 1.0f;
                    canvas2.save();
                    canvas2.translate(yVar.S0.getX() + w51Var.getX(), yVar.S0.getY() + w51Var.getY() + yVar.g0.getY());
                    paint2.setColor(h6.v0(h6.G8, yVar.Z0));
                    canvas2.drawRect(0.0f, 0.0f, yVar.S0.getMeasuredWidth(), yVar.S0.getMeasuredHeight(), paint2);
                    canvas2.scale(f40, f40, yVar.S0.getMeasuredWidth() / f12, yVar.S0.getMeasuredHeight());
                    i61 i61Var4 = yVar.S0;
                    if (!i61Var4.s) {
                        imageReceiver3 = i61Var4.r;
                    }
                    q5 q5Var3 = yVar.W0;
                    if (q5Var3 != null && (l4Var = q5Var3.k) != null && l4Var.hasBitmapImage()) {
                        imageReceiver3 = yVar.W0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.setImageCoords(0.0f, 0.0f, yVar.S0.getMeasuredWidth(), yVar.S0.getMeasuredHeight());
                        imageReceiver3.draw(canvas2);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i12 == 5) {
                canvas2.restore();
            }
            if (c0Var.x != null) {
                invalidate();
            }
            Runnable runnable = f0.c;
            if (runnable != null) {
                runnable.run();
                f0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        c0 c0Var = this.w;
        gk0 gk0Var = c0Var.n;
        if (c0Var.y == 1 || !(gk0Var == null || gk0Var.getDelegate() == null || !gk0Var.getDelegate().q())) {
            c0Var.m.f0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int measuredWidth;
        int i12;
        int dp;
        int dp2;
        c0 c0Var = this.w;
        int i13 = c0Var.y;
        if (i13 == 1 || i13 == 2 || i13 == 4) {
            measuredWidth = c0Var.n.getMeasuredWidth();
        } else if (i13 == 5) {
            measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            int dp3 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
            if (dp3 < measuredWidth) {
                measuredWidth = dp3;
            }
        }
        if (c0Var.y != 4) {
            if (c0Var.n.F0) {
                int ceil = (int) Math.ceil(c0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i12 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * ceil);
                } else {
                    dp = AndroidUtilities.dp(36.0f) * 8;
                    dp2 = AndroidUtilities.dp(8.0f);
                }
            } else {
                i12 = measuredWidth;
            }
            if (c0Var.y == 5) {
                i12 = Math.min(AndroidUtilities.dp(254.0f), i12);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        }
        dp = AndroidUtilities.dp(36.0f) * 8;
        dp2 = AndroidUtilities.dp(8.0f);
        i12 = dp - dp2;
        if (c0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }
}
