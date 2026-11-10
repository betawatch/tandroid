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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v01 extends org.telegram.ui.Components.hs {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = org.telegram.messenger.sc.e(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ w01 T;

    public v01(w01 w01Var) {
        this.T = w01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.hs
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
        w01 w01Var = this.T;
        boolean z10 = true;
        boolean z11 = w01Var.l3.W == 13 || this.Q < 1.0f || w01Var.b0() || this.O.size() <= 4 || !this.R || t11.c(this.T.l3) || (i11 = this.T.l3.W) == 4 || i11 == 6;
        if (!z11) {
            if (this.T.l3.Q1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                t11 t11Var = this.T.l3;
                if (elapsedRealtime - t11Var.Q1 < t11Var.g()) {
                    z9 = true;
                    for (int i12 = 0; i12 < this.O.size(); i12++) {
                        d11 d11Var = (d11) this.O.get(i12);
                        if (d11Var.N != 0.0f || d11Var.S != 0.0f || d11Var.I != null || d11Var.getTranslationX() != 0.0f || d11Var.getTranslationY() != 0.0f || d11Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z9) {
                            int i13 = d11Var.c;
                            t11 t11Var2 = this.T.l3;
                            if (i13 > t11Var2.O1 && i13 < t11Var2.P1) {
                                break;
                            }
                        }
                        if (d11Var.Q) {
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

    @Override // org.telegram.ui.Components.hs
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.hs
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            d11 d11Var = (d11) arrayList.get(i7);
            if (!d11Var.b) {
                if (d11Var.a) {
                    d11Var.E.setBounds(d11Var.F);
                    d11Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = d11Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, d11Var.f[this.K]);
                    }
                }
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.hs
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i7;
        t11 t11Var = this.T.l3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i10 = 0;
            float f11 = f10;
            int i11 = 0;
            while (i11 < this.O.size()) {
                d11 d11Var = (d11) this.O.get(i11);
                if (!d11Var.b) {
                    float scaleX = d11Var.getScaleX();
                    int i12 = t11Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = d11Var.N;
                    if (f12 != 0.0f || (d11Var.S > 0.0f && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : d11Var.S * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    int i13 = (t11Var.Q1 <= 0 || SystemClock.elapsedRealtime() - t11Var.Q1 >= t11Var.g()) ? i10 : 1;
                    if (i13 == 0 || t11Var.O1 < 0 || t11Var.P1 < 0 || t11Var.Q1 <= 0) {
                        f11 *= d11Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(d11Var);
                        int i14 = t11Var.O1;
                        int i15 = R - i14;
                        int i16 = t11Var.P1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.j9.a((SystemClock.elapsedRealtime() - t11Var.Q1) / t11Var.f(), 0.0f, 1.0f);
                            float f13 = i15;
                            float f14 = i16;
                            float f15 = f14 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(org.telegram.messenger.g0.s(a10, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = s5;
                        }
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(d11Var.getPaddingLeft() + ((int) d11Var.getX()), d11Var.getPaddingTop(), (d11Var.getWidth() + ((int) d11Var.getX())) - d11Var.getPaddingRight(), d11Var.getHeight() - d11Var.getPaddingBottom());
                    if (!t11Var.x1 && i13 == 0) {
                        rect.offset(i10, (int) d11Var.getTranslationY());
                    }
                    if (d11Var.a) {
                        drawable = t11Var.getPremiumStar();
                        int i17 = t11Var.W;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(org.telegram.messenger.qs.e4);
                    } else if (d11Var.s || d11Var.Q) {
                        ImageReceiver imageReceiver = d11Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    } else if ((d11Var.e != null || t11Var.W == 13) && !d11Var.b && (drawable = d11Var.E) != null) {
                        drawable.setAlpha(org.telegram.messenger.qs.e4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = t11Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = d11Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.h5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    d11Var.O = f16;
                    d11Var.P = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = d11Var.S;
                        if (f17 > 1.0f && (i7 = t11Var.W) != 3 && i7 != 4 && i7 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f17);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = t11Var.W;
                        if (i18 == 6 || i18 == 13 || i18 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            d11Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, d11Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, d11Var, f11);
                    }
                }
                i11++;
                i10 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.hs
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                this.T.l3.h0.invalidate();
                return;
            }
            org.telegram.messenger.ic icVar = ((d11) arrayList.get(i7)).f[this.K];
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
    @Override // org.telegram.ui.Components.hs
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
        t11 t11Var = this.T.l3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.O.size()) {
            d11 d11Var = (d11) this.O.get(i14);
            boolean z9 = d11Var.b;
            org.telegram.messenger.ic[] icVarArr2 = d11Var.f;
            if (!z9) {
                if (d11Var.a) {
                    premiumStar = t11Var.getPremiumStar();
                    int i15 = t11Var.W;
                    float f10 = (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) ? 1.3f : 1.0f;
                    float f11 = d11Var.N;
                    if (f11 != 0.0f || d11Var.S > 0.0f) {
                        f10 *= ((1.0f - Math.max(d11Var.S * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(org.telegram.messenger.qs.e4);
                        int width = (d11Var.getWidth() - d11Var.getPaddingLeft()) - d11Var.getPaddingRight();
                        int height = (d11Var.getHeight() - d11Var.getPaddingTop()) - d11Var.getPaddingBottom();
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((d11Var.getWidth() / 2.0f) - ((d11Var.getScaleX() * f12) * f10)), (int) ((d11Var.getHeight() / 2.0f) - ((d11Var.getScaleY() * f13) * f10)), (int) ((d11Var.getScaleX() * f12 * f10) + (d11Var.getWidth() / 2.0f)), (int) ((d11Var.getScaleY() * f13 * f10) + (d11Var.getHeight() / 2.0f)));
                        rect2.offset(d11Var.getLeft() - this.N, i13);
                        if (d11Var.F == null) {
                            d11Var.F = new Rect();
                        }
                        d11Var.F.set(rect2);
                        d11Var.setDrawable(premiumStar);
                        arrayList.add(d11Var);
                    }
                } else {
                    float f14 = d11Var.N;
                    if (f14 != 0.0f || d11Var.S > 0.0f) {
                        Math.max(d11Var.S * 0.8f, f14);
                    }
                    if (t11Var.Q1 > 0) {
                        int i16 = i14;
                        if (SystemClock.elapsedRealtime() - t11Var.Q1 >= t11Var.g() || t11Var.O1 < 0 || t11Var.P1 < 0 || t11Var.Q1 <= 0) {
                            icVarArr = icVarArr2;
                            i7 = i16;
                        } else {
                            int R = RecyclerView.R(d11Var);
                            int i17 = t11Var.O1;
                            int i18 = R - i17;
                            int i19 = t11Var.P1 - i17;
                            if (i18 < 0 || i18 >= i19) {
                                icVarArr = icVarArr2;
                                i7 = i16;
                                alpha = 1.0f;
                            } else {
                                icVarArr = icVarArr2;
                                i7 = i16;
                                float a10 = c8.j9.a((SystemClock.elapsedRealtime() - t11Var.Q1) / t11Var.f(), 0.0f, 1.0f);
                                float f15 = i18;
                                float f16 = i19;
                                float f17 = f16 / 4.0f;
                                float s5 = org.telegram.messenger.g0.s(a10, f15, f16, f17);
                                this.S.getInterpolation(org.telegram.messenger.g0.s(a10, f15, f16, f17));
                                alpha = s5 * 1.0f;
                            }
                            if (!d11Var.s || d11Var.Q) {
                                ImageReceiver imageReceiver2 = d11Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (d11Var.e != null) {
                                    Drawable drawable = d11Var.E;
                                    org.telegram.ui.Components.h5 h5Var = drawable instanceof org.telegram.ui.Components.h5 ? (org.telegram.ui.Components.h5) drawable : null;
                                    if (h5Var != null && (imageReceiver2 = h5Var.k) != null) {
                                        h5Var.setAlpha((int) (alpha * 255.0f));
                                        d11Var.setDrawable(h5Var);
                                        d11Var.E.setColorFilter(t11Var.k1);
                                    }
                                }
                                i11 = i7;
                                i10 = 0;
                                i14 = i11 + 1;
                                i13 = i10;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.g0((t11Var.L1 || (t11Var.M1 && d11Var.L)) ? false : true);
                            if (d11Var.L) {
                                imageReceiver.J0(0);
                            } else {
                                imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
                            }
                            int i20 = this.K;
                            org.telegram.messenger.ic e02 = imageReceiver.e0(icVarArr[i20], i20);
                            icVarArr[i20] = e02;
                            e02.c = j3;
                            d11Var.r = imageReceiver;
                            if (imageReceiver.B() != null) {
                                d11Var.r.B().V(j3);
                            }
                            if (d11Var.r.m() != null) {
                                d11Var.r.m().D(j3);
                            }
                            d11Var.getWidth();
                            d11Var.getPaddingLeft();
                            d11Var.getPaddingRight();
                            d11Var.getHeight();
                            d11Var.getPaddingTop();
                            d11Var.getPaddingBottom();
                            rect = org.telegram.messenger.g0.Q;
                            rect.set(d11Var.getPaddingLeft(), d11Var.getPaddingTop(), d11Var.getWidth() - d11Var.getPaddingRight(), d11Var.getHeight() - d11Var.getPaddingBottom());
                            if (d11Var.L && (i12 = t11Var.W) != 3 && i12 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i10 = 0;
                            rect.offset((d11Var.getLeft() + ((int) d11Var.getTranslationX())) - this.N, 0);
                            icVarArr[i20].b(rect);
                            d11Var.O = 1.0f;
                            i11 = i7;
                            d11Var.P = i11;
                            arrayList.add(d11Var);
                            i14 = i11 + 1;
                            i13 = i10;
                        }
                    } else {
                        i7 = i14;
                        icVarArr = icVarArr2;
                    }
                    alpha = d11Var.getAlpha() * 1.0f;
                    if (d11Var.s) {
                    }
                    ImageReceiver imageReceiver22 = d11Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.g0((t11Var.L1 || (t11Var.M1 && d11Var.L)) ? false : true);
                    if (d11Var.L) {
                    }
                    int i202 = this.K;
                    org.telegram.messenger.ic e022 = imageReceiver.e0(icVarArr[i202], i202);
                    icVarArr[i202] = e022;
                    e022.c = j3;
                    d11Var.r = imageReceiver;
                    if (imageReceiver.B() != null) {
                    }
                    if (d11Var.r.m() != null) {
                    }
                    d11Var.getWidth();
                    d11Var.getPaddingLeft();
                    d11Var.getPaddingRight();
                    d11Var.getHeight();
                    d11Var.getPaddingTop();
                    d11Var.getPaddingBottom();
                    rect = org.telegram.messenger.g0.Q;
                    rect.set(d11Var.getPaddingLeft(), d11Var.getPaddingTop(), d11Var.getWidth() - d11Var.getPaddingRight(), d11Var.getHeight() - d11Var.getPaddingBottom());
                    if (d11Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i10 = 0;
                    rect.offset((d11Var.getLeft() + ((int) d11Var.getTranslationX())) - this.N, 0);
                    icVarArr[i202].b(rect);
                    d11Var.O = 1.0f;
                    i11 = i7;
                    d11Var.P = i11;
                    arrayList.add(d11Var);
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

    public final void m(Canvas canvas, Drawable drawable, d11 d11Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.l3.k1);
        } else if ((d11Var.s || d11Var.Q) && d11Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = d11Var.h;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), d11Var.h.A());
            d11Var.h.setAlpha(f10);
            d11Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
