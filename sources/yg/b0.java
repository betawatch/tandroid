package yg;

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
import gg.h1;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.i61;
import org.telegram.ui.j71;
import org.telegram.ui.u61;
import qg.e1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        int i10 = j6.Td;
        f6 f6Var = c0Var.s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        if (c0Var.y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.v0(j6.G8, f6Var));
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
        pk0 pk0Var;
        pk0 pk0Var2;
        int i12;
        float f12;
        h1 h1Var;
        int i13;
        RectF rectF3;
        pk0 pk0Var3;
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
        pk0 pk0Var4;
        RectF rectF7;
        h1 h1Var2;
        int[] iArr;
        h1 h1Var3;
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
        pk0 pk0Var5 = c0Var.n;
        if (c0Var.l) {
            float clamp = Utilities.clamp(c0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i17 == 4) {
                rectF8.set(pk0Var5.w);
                rectF8.offset(c0Var.g, c0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, c0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(c0Var.e, AndroidUtilities.dp(i17 == 5 ? 20.0f : 8.0f), c0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i17 == 1 || (pk0Var5.getDelegate() != null && pk0Var5.getDelegate().t())) {
                f7 = 1.0f;
                ok0 delegate = pk0Var5.getDelegate();
                float x10 = getX();
                b0 b0Var = c0Var.a;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                delegate.r(canvas, rectF9, lerp, x10, i17 == 1 ? b0Var.getY() - AndroidUtilities.statusBarHeight : b0Var.getY() + c0Var.c.getY(), 255, true);
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
                bh.d dVar = c0Var.z;
                Paint paint = this.c;
                if (dVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF10.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    c0Var.z.setBounds(rect2);
                    c0Var.z.setAlpha(paint.getAlpha());
                    c0Var.z.p(lerp);
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
            if (pk0Var5.R0 != null) {
                canvas2.save();
                float f29 = rectF.left;
                float y3 = pk0Var5.R0.getY() + rectF.top;
                if (i17 != 3 && i17 != i10) {
                    if (i17 != 5) {
                        f28 = 0.0f;
                        canvas2.translate(f29, y3 - f28);
                        rectF2 = rectF8;
                        f11 = lerp;
                        i11 = 5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, pk0Var5.R0.getMeasuredWidth(), pk0Var5.R0.getMeasuredHeight(), (int) ((f7 - c0Var.j) * pk0Var5.R0.getAlpha() * f10), 31);
                        pk0Var5.R0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f28 = pk0Var5.w.top;
                canvas2.translate(f29, y3 - f28);
                rectF2 = rectF8;
                f11 = lerp;
                i11 = 5;
                canvas2.saveLayerAlpha(0.0f, 0.0f, pk0Var5.R0.getMeasuredWidth(), pk0Var5.R0.getMeasuredHeight(), (int) ((f7 - c0Var.j) * pk0Var5.R0.getAlpha() * f10), 31);
                pk0Var5.R0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f11 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - pk0Var5.w.width()) + (rectF.left - pk0Var5.w.left);
            if (c0Var.j > 0.05f || i17 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - pk0Var5.w.height()) + (rectF.top - pk0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(pk0Var5.v, 1.0f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                pk0Var5.f(pk0Var5.E * max, max, pk0Var5.F * max, pk0Var5.M0 == i11 ? 255 : (int) a2.A(1.0f, pk0Var5.w0, Utilities.clamp(pk0Var5.w0 / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                pk0Var = pk0Var5;
                canvas2 = canvas3;
                canvas2.restore();
            } else {
                pk0Var = pk0Var5;
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
            if (pk0Var != null) {
                for (int childCount = yVar.h0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (yVar.h0.getChildAt(childCount) instanceof u61) {
                        u61 u61Var = (u61) yVar.h0.getChildAt(childCount);
                        if (u61Var.y && (p0Var = u61Var.x) != null) {
                            hashMap.put(p0Var, u61Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, e2.z(1.0f, c0Var.j, pk0Var.g() + pk0Var.getTopOffset(), rectF.top));
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
                while (i20 < pk0Var.b.getChildCount()) {
                    View childAt = i20 == i19 ? pk0Var.z0 : pk0Var.b.getChildAt(i20);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i13 = i20;
                        rectF3 = rectF;
                        pk0Var3 = pk0Var;
                        i14 = i17;
                        i15 = save;
                        hashMap2 = hashMap;
                        rectF4 = rectF2;
                    } else {
                        canvas2.save();
                        if (childAt instanceof nk0) {
                            nk0 nk0Var = (nk0) childAt;
                            mk0 mk0Var = nk0Var.a;
                            mk0 mk0Var2 = nk0Var.b;
                            e1 e1Var = nk0Var.f;
                            if (e1Var != null) {
                                e1Var.setAlpha(1.0f - c0Var.j);
                            }
                            u61 u61Var2 = (u61) hashMap.get(nk0Var.e);
                            if (u61Var2 != null) {
                                float x12 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i20 == -1) {
                                    x12 -= pk0Var.b.getX();
                                    f18 = y11 - pk0Var.b.getY();
                                } else {
                                    f18 = y11;
                                }
                                i13 = i20;
                                float x13 = ((yVar.h0.getX() + (yVar.getX() + u61Var2.getX())) - mk0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y12 = (yVar.h0.getY() + (yVar.g0.getY() + (yVar.getY() + u61Var2.getY()))) - mk0Var2.getY();
                                float measuredWidth = u61Var2.getMeasuredWidth();
                                if (u61Var2.L) {
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
                                        float measuredWidth2 = measuredWidth / mk0Var2.getMeasuredWidth();
                                        i15 = save;
                                        rectF5 = rectF;
                                        f17 = AndroidUtilities.lerp(1.0f, measuredWidth2, c0Var.j);
                                        if (nk0Var.y != 0) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f24 = f22;
                                            f23 = 0.0f;
                                        } else if (nk0Var.w) {
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
                                float f34 = u61Var2.L ? 0.95f * f20 : f20;
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
                                float measuredWidth22 = measuredWidth / mk0Var2.getMeasuredWidth();
                                i15 = save;
                                rectF5 = rectF;
                                f17 = AndroidUtilities.lerp(1.0f, measuredWidth22, c0Var.j);
                                if (nk0Var.y != 0) {
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
                                canvas2.translate(mk0Var2.getX() + childAt.getX(), mk0Var2.getY() + childAt.getY());
                                f13 = 0.0f;
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 1.0f;
                            }
                            if (u61Var2 != null) {
                                if (u61Var2.L) {
                                    float measuredWidth3 = nk0Var.getMeasuredWidth() / f12;
                                    float measuredHeight = nk0Var.getMeasuredHeight() / f12;
                                    float measuredWidth4 = nk0Var.getMeasuredWidth() - AndroidUtilities.dp(f12);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (u61Var2.getMeasuredWidth() - AndroidUtilities.dp(f12)) / f17, c0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f36 = lerp4 / f12;
                                    rectF7 = rectF6;
                                    pk0Var4 = pk0Var;
                                    rectF11.set(measuredWidth3 - f36, measuredHeight - f36, measuredWidth3 + f36, measuredHeight + f36);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f12, AndroidUtilities.dp(4.0f), c0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, yVar.L);
                                } else {
                                    pk0Var4 = pk0Var;
                                    rectF7 = rectF6;
                                }
                                nk0Var.x = false;
                                if (f13 == 0.0f) {
                                    nk0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = mk0Var2.getImageReceiver();
                                    nk0Var.b();
                                    p5 p5Var = mk0Var2.e;
                                    if (p5Var != null && (h1Var3 = p5Var.k) != null) {
                                        imageReceiver = h1Var3;
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
                                    nk0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                nk0Var.x = true;
                                if (!u61Var2.b) {
                                    u61Var2.b = true;
                                    u61Var2.invalidate();
                                }
                            } else {
                                pk0Var4 = pk0Var;
                                rectF7 = rectF6;
                                if (nk0Var.r && mk0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = mk0Var.getImageReceiver().getAlpha();
                                    mk0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    mk0Var.draw(canvas2);
                                    mk0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    nk0Var.b();
                                    ImageReceiver imageReceiver2 = mk0Var2.getImageReceiver();
                                    p5 p5Var2 = mk0Var2.e;
                                    if (p5Var2 != null && (h1Var2 = p5Var2.k) != null) {
                                        imageReceiver2 = h1Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    mk0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (mk0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            pk0Var3 = pk0Var4;
                            rectF3 = rectF5;
                            rectF4 = rectF7;
                        } else {
                            i13 = i20;
                            RectF rectF12 = rectF;
                            i14 = i17;
                            i15 = save;
                            hashMap2 = hashMap;
                            pk0Var3 = pk0Var;
                            rectF4 = rectF2;
                            rectF3 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - pk0Var3.w.width(), (childAt.getY() + rectF4.top) - rectF3.top);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f37 = 1.0f - c0Var.j;
                            canvas2.scale(f37, f37, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i20 = i13 + 1;
                    pk0Var = pk0Var3;
                    rectF2 = rectF4;
                    rectF = rectF3;
                    hashMap = hashMap2;
                    i17 = i14;
                    save = i15;
                    i19 = -1;
                }
                pk0Var2 = pk0Var;
                i12 = i17;
                canvas2.restoreToCount(save);
            } else {
                pk0Var2 = pk0Var;
                i12 = i17;
                f12 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i22 = c0Var.F;
            if (i22 < 5) {
                if (i22 == 3) {
                    pk0Var2.setSkipDraw(true);
                }
                c0Var.F++;
            }
            Paint paint2 = yVar.X1;
            i61 i61Var = yVar.h0;
            ImageReceiver imageReceiver3 = yVar.V0;
            if (yVar.S0 != null) {
                imageReceiver3.setParentView(this);
                u61 u61Var3 = yVar.S0;
                if (u61Var3 != null) {
                    float f38 = yVar.U0;
                    if (f38 != 1.0f && !yVar.T0 && yVar.h1) {
                        float f39 = f38 + 0.010666667f;
                        yVar.U0 = f39;
                        if (f39 >= 1.0f) {
                            yVar.U0 = 1.0f;
                            j71 j71Var = yVar.H;
                            if (j71Var != null) {
                                pk0 pk0Var6 = (pk0) ((l2.g) j71Var).b;
                                if (u61Var3.s) {
                                    pk0Var6.l(u61Var3, u61Var3.x, true);
                                } else {
                                    long j3 = u61Var3.e.documentId;
                                    p0 p0Var2 = new p0();
                                    p0Var2.g = j3;
                                    p0Var2.h = j3;
                                    pk0Var6.l(u61Var3, p0Var2, true);
                                }
                            }
                        }
                        yVar.S0.G = yVar.U0;
                    }
                    float f40 = (yVar.U0 * f12) + 1.0f;
                    canvas2.save();
                    canvas2.translate(yVar.S0.getX() + i61Var.getX(), yVar.S0.getY() + i61Var.getY() + yVar.g0.getY());
                    paint2.setColor(j6.v0(j6.G8, yVar.Z0));
                    canvas2.drawRect(0.0f, 0.0f, yVar.S0.getMeasuredWidth(), yVar.S0.getMeasuredHeight(), paint2);
                    canvas2.scale(f40, f40, yVar.S0.getMeasuredWidth() / f12, yVar.S0.getMeasuredHeight());
                    u61 u61Var4 = yVar.S0;
                    if (!u61Var4.s) {
                        imageReceiver3 = u61Var4.r;
                    }
                    p5 p5Var3 = yVar.W0;
                    if (p5Var3 != null && (h1Var = p5Var3.k) != null && h1Var.hasBitmapImage()) {
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
        pk0 pk0Var = c0Var.n;
        if (c0Var.y == 1 || !(pk0Var == null || pk0Var.getDelegate() == null || !pk0Var.getDelegate().t())) {
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
