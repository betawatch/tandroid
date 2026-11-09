package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u01 extends org.telegram.ui.Components.is {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = org.telegram.messenger.sc.e(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ v01 T;

    public u01(v01 v01Var) {
        this.T = v01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z9;
        int i11;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        this.Q = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.O.get(0);
            if (view.getY() > (this.T.getHeight() - this.T.getPaddingBottom()) - view.getHeight()) {
                this.Q = (c8.j9.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        v01 v01Var = this.T;
        boolean z10 = true;
        boolean z11 = v01Var.l3.W == 13 || this.Q < 1.0f || v01Var.b0() || this.O.size() <= 4 || !this.R || s11.c(this.T.l3) || (i11 = this.T.l3.W) == 4 || i11 == 6;
        if (!z11) {
            if (this.T.l3.Q1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                s11 s11Var = this.T.l3;
                if (elapsedRealtime - s11Var.Q1 < s11Var.g()) {
                    z9 = true;
                    for (int i12 = 0; i12 < this.O.size(); i12++) {
                        c11 c11Var = (c11) this.O.get(i12);
                        if (c11Var.N != 0.0f || c11Var.S != 0.0f || c11Var.I != null || c11Var.getTranslationX() != 0.0f || c11Var.getTranslationY() != 0.0f || c11Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z9) {
                            int i13 = c11Var.c;
                            s11 s11Var2 = this.T.l3;
                            if (i13 > s11Var2.O1 && i13 < s11Var2.P1) {
                                break;
                            }
                        }
                        if (c11Var.Q) {
                            break;
                        }
                    }
                }
            }
            z9 = false;
            while (i12 < this.O.size()) {
            }
        }
        z10 = z11;
        float f11 = ch.e0.b ? 1.0f : f10;
        if (!z10 && !ch.e0.e) {
            super.a(canvas, j3, i7, i10, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.is
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.is
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            c11 c11Var = (c11) arrayList.get(i7);
            if (!c11Var.b) {
                if (c11Var.a) {
                    c11Var.E.setBounds(c11Var.F);
                    c11Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = c11Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, c11Var.f[this.K]);
                    }
                }
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i7;
        s11 s11Var = this.T.l3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i10 = 0;
            float f11 = f10;
            int i11 = 0;
            while (i11 < this.O.size()) {
                c11 c11Var = (c11) this.O.get(i11);
                if (!c11Var.b) {
                    float scaleX = c11Var.getScaleX();
                    int i12 = s11Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = c11Var.N;
                    if (f12 != 0.0f || (c11Var.S > 0.0f && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : c11Var.S * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    int i13 = (s11Var.Q1 <= 0 || SystemClock.elapsedRealtime() - s11Var.Q1 >= s11Var.g()) ? i10 : 1;
                    if (i13 == 0 || s11Var.O1 < 0 || s11Var.P1 < 0 || s11Var.Q1 <= 0) {
                        f11 *= c11Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(c11Var);
                        int i14 = s11Var.O1;
                        int i15 = R - i14;
                        int i16 = s11Var.P1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.j9.a((SystemClock.elapsedRealtime() - s11Var.Q1) / s11Var.f(), 0.0f, 1.0f);
                            float f13 = i15;
                            float f14 = i16;
                            float f15 = f14 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(org.telegram.messenger.g0.s(a10, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = s5;
                        }
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(c11Var.getPaddingLeft() + ((int) c11Var.getX()), c11Var.getPaddingTop(), (c11Var.getWidth() + ((int) c11Var.getX())) - c11Var.getPaddingRight(), c11Var.getHeight() - c11Var.getPaddingBottom());
                    if (!s11Var.x1 && i13 == 0) {
                        rect.offset(i10, (int) c11Var.getTranslationY());
                    }
                    if (c11Var.a) {
                        drawable = s11Var.getPremiumStar();
                        int i17 = s11Var.W;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(org.telegram.messenger.qs.e4);
                    } else if (c11Var.s || c11Var.Q) {
                        ImageReceiver imageReceiver = c11Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    } else if ((c11Var.e != null || s11Var.W == 13) && !c11Var.b && (drawable = c11Var.E) != null) {
                        drawable.setAlpha(org.telegram.messenger.qs.e4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = s11Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = c11Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.i5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    c11Var.O = f16;
                    c11Var.P = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = c11Var.S;
                        if (f17 > 1.0f && (i7 = s11Var.W) != 3 && i7 != 4 && i7 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f17);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = s11Var.W;
                        if (i18 == 6 || i18 == 13 || i18 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            c11Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, c11Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, c11Var, f11);
                    }
                }
                i11++;
                i10 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                this.T.l3.h0.invalidate();
                return;
            }
            org.telegram.messenger.ic icVar = ((c11) arrayList.get(i7)).f[this.K];
            if (icVar != null) {
                icVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        int i7;
        org.telegram.messenger.ic[] icVarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i10;
        int i11;
        int i12;
        Drawable premiumStar;
        s11 s11Var = this.T.l3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.O.size()) {
            c11 c11Var = (c11) this.O.get(i14);
            boolean z9 = c11Var.b;
            org.telegram.messenger.ic[] icVarArr2 = c11Var.f;
            if (!z9) {
                if (c11Var.a) {
                    premiumStar = s11Var.getPremiumStar();
                    int i15 = s11Var.W;
                    float f10 = (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) ? 1.3f : 1.0f;
                    float f11 = c11Var.N;
                    if (f11 != 0.0f || c11Var.S > 0.0f) {
                        f10 *= ((1.0f - Math.max(c11Var.S * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(org.telegram.messenger.qs.e4);
                        int width = (c11Var.getWidth() - c11Var.getPaddingLeft()) - c11Var.getPaddingRight();
                        int height = (c11Var.getHeight() - c11Var.getPaddingTop()) - c11Var.getPaddingBottom();
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((c11Var.getWidth() / 2.0f) - ((c11Var.getScaleX() * f12) * f10)), (int) ((c11Var.getHeight() / 2.0f) - ((c11Var.getScaleY() * f13) * f10)), (int) ((c11Var.getScaleX() * f12 * f10) + (c11Var.getWidth() / 2.0f)), (int) ((c11Var.getScaleY() * f13 * f10) + (c11Var.getHeight() / 2.0f)));
                        rect2.offset(c11Var.getLeft() - this.N, i13);
                        if (c11Var.F == null) {
                            c11Var.F = new Rect();
                        }
                        c11Var.F.set(rect2);
                        c11Var.setDrawable(premiumStar);
                        arrayList.add(c11Var);
                    }
                } else {
                    float f14 = c11Var.N;
                    if (f14 != 0.0f || c11Var.S > 0.0f) {
                        Math.max(c11Var.S * 0.8f, f14);
                    }
                    if (s11Var.Q1 > 0) {
                        int i16 = i14;
                        if (SystemClock.elapsedRealtime() - s11Var.Q1 >= s11Var.g() || s11Var.O1 < 0 || s11Var.P1 < 0 || s11Var.Q1 <= 0) {
                            icVarArr = icVarArr2;
                            i7 = i16;
                        } else {
                            int R = RecyclerView.R(c11Var);
                            int i17 = s11Var.O1;
                            int i18 = R - i17;
                            int i19 = s11Var.P1 - i17;
                            if (i18 < 0 || i18 >= i19) {
                                icVarArr = icVarArr2;
                                i7 = i16;
                                alpha = 1.0f;
                            } else {
                                icVarArr = icVarArr2;
                                i7 = i16;
                                float a10 = c8.j9.a((SystemClock.elapsedRealtime() - s11Var.Q1) / s11Var.f(), 0.0f, 1.0f);
                                float f15 = i18;
                                float f16 = i19;
                                float f17 = f16 / 4.0f;
                                float s5 = org.telegram.messenger.g0.s(a10, f15, f16, f17);
                                this.S.getInterpolation(org.telegram.messenger.g0.s(a10, f15, f16, f17));
                                alpha = s5 * 1.0f;
                            }
                            if (!c11Var.s || c11Var.Q) {
                                ImageReceiver imageReceiver2 = c11Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (c11Var.e != null) {
                                    Drawable drawable = c11Var.E;
                                    org.telegram.ui.Components.i5 i5Var = drawable instanceof org.telegram.ui.Components.i5 ? (org.telegram.ui.Components.i5) drawable : null;
                                    if (i5Var != null && (imageReceiver2 = i5Var.k) != null) {
                                        i5Var.setAlpha((int) (alpha * 255.0f));
                                        c11Var.setDrawable(i5Var);
                                        c11Var.E.setColorFilter(s11Var.k1);
                                    }
                                }
                                i11 = i7;
                                i10 = 0;
                                i14 = i11 + 1;
                                i13 = i10;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.g0((s11Var.L1 || (s11Var.M1 && c11Var.L)) ? false : true);
                            if (c11Var.L) {
                                imageReceiver.J0(0);
                            } else {
                                imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
                            }
                            int i20 = this.K;
                            org.telegram.messenger.ic e02 = imageReceiver.e0(icVarArr[i20], i20);
                            icVarArr[i20] = e02;
                            e02.c = j3;
                            c11Var.r = imageReceiver;
                            if (imageReceiver.B() != null) {
                                c11Var.r.B().V(j3);
                            }
                            if (c11Var.r.m() != null) {
                                c11Var.r.m().D(j3);
                            }
                            c11Var.getWidth();
                            c11Var.getPaddingLeft();
                            c11Var.getPaddingRight();
                            c11Var.getHeight();
                            c11Var.getPaddingTop();
                            c11Var.getPaddingBottom();
                            rect = org.telegram.messenger.g0.Q;
                            rect.set(c11Var.getPaddingLeft(), c11Var.getPaddingTop(), c11Var.getWidth() - c11Var.getPaddingRight(), c11Var.getHeight() - c11Var.getPaddingBottom());
                            if (c11Var.L && (i12 = s11Var.W) != 3 && i12 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i10 = 0;
                            rect.offset((c11Var.getLeft() + ((int) c11Var.getTranslationX())) - this.N, 0);
                            icVarArr[i20].b(rect);
                            c11Var.O = 1.0f;
                            i11 = i7;
                            c11Var.P = i11;
                            arrayList.add(c11Var);
                            i14 = i11 + 1;
                            i13 = i10;
                        }
                    } else {
                        i7 = i14;
                        icVarArr = icVarArr2;
                    }
                    alpha = c11Var.getAlpha() * 1.0f;
                    if (c11Var.s) {
                    }
                    ImageReceiver imageReceiver22 = c11Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.g0((s11Var.L1 || (s11Var.M1 && c11Var.L)) ? false : true);
                    if (c11Var.L) {
                    }
                    int i202 = this.K;
                    org.telegram.messenger.ic e022 = imageReceiver.e0(icVarArr[i202], i202);
                    icVarArr[i202] = e022;
                    e022.c = j3;
                    c11Var.r = imageReceiver;
                    if (imageReceiver.B() != null) {
                    }
                    if (c11Var.r.m() != null) {
                    }
                    c11Var.getWidth();
                    c11Var.getPaddingLeft();
                    c11Var.getPaddingRight();
                    c11Var.getHeight();
                    c11Var.getPaddingTop();
                    c11Var.getPaddingBottom();
                    rect = org.telegram.messenger.g0.Q;
                    rect.set(c11Var.getPaddingLeft(), c11Var.getPaddingTop(), c11Var.getWidth() - c11Var.getPaddingRight(), c11Var.getHeight() - c11Var.getPaddingBottom());
                    if (c11Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i10 = 0;
                    rect.offset((c11Var.getLeft() + ((int) c11Var.getTranslationX())) - this.N, 0);
                    icVarArr[i202].b(rect);
                    c11Var.O = 1.0f;
                    i11 = i7;
                    c11Var.P = i11;
                    arrayList.add(c11Var);
                    i14 = i11 + 1;
                    i13 = i10;
                }
            }
            i10 = i13;
            i11 = i14;
            i14 = i11 + 1;
            i13 = i10;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, c11 c11Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.l3.k1);
        } else if ((c11Var.s || c11Var.Q) && c11Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = c11Var.h;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), c11Var.h.A());
            c11Var.h.setAlpha(f10);
            c11Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
