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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u01 extends org.telegram.ui.Components.xs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = org.telegram.messenger.qc.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final /* synthetic */ v01 U;

    public u01(v01 v01Var) {
        this.U = v01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.xs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        this.R = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.P.get(0);
            if (view.getY() > (this.U.getHeight() - this.U.getPaddingBottom()) - view.getHeight()) {
                this.R = (c8.l9.a((-((view.getY() - this.U.getHeight()) + this.U.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        v01 v01Var = this.U;
        boolean z11 = true;
        boolean z12 = v01Var.m3.a0 == 13 || this.R < 1.0f || v01Var.b0() || this.P.size() <= 4 || !this.S || s11.c(this.U.m3) || (i11 = this.U.m3.a0) == 4 || i11 == 6;
        if (!z12) {
            if (this.U.m3.R1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                s11 s11Var = this.U.m3;
                if (elapsedRealtime - s11Var.R1 < s11Var.g()) {
                    z10 = true;
                    for (int i12 = 0; i12 < this.P.size(); i12++) {
                        c11 c11Var = (c11) this.P.get(i12);
                        if (c11Var.O != 0.0f || c11Var.T != 0.0f || c11Var.J != null || c11Var.getTranslationX() != 0.0f || c11Var.getTranslationY() != 0.0f || c11Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i13 = c11Var.c;
                            s11 s11Var2 = this.U.m3;
                            if (i13 > s11Var2.P1 && i13 < s11Var2.Q1) {
                                break;
                            }
                        }
                        if (c11Var.R) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i12 < this.P.size()) {
            }
        }
        z11 = z12;
        float f11 = ch.f0.b ? 1.0f : f10;
        if (!z11 && !ch.f0.e) {
            super.a(canvas, j3, i7, i10, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.xs
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.xs
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            c11 c11Var = (c11) arrayList.get(i7);
            if (!c11Var.b) {
                if (c11Var.a) {
                    c11Var.F.setBounds(c11Var.G);
                    c11Var.F.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = c11Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, c11Var.f[this.L]);
                    }
                }
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.xs
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i7;
        s11 s11Var = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f11 = f10;
            int i11 = 0;
            while (i11 < this.P.size()) {
                c11 c11Var = (c11) this.P.get(i11);
                if (!c11Var.b) {
                    float scaleX = c11Var.getScaleX();
                    int i12 = s11Var.a0;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = c11Var.O;
                    if (f12 != 0.0f || (c11Var.T > 0.0f && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : c11Var.T * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    int i13 = (s11Var.R1 <= 0 || SystemClock.elapsedRealtime() - s11Var.R1 >= s11Var.g()) ? i10 : 1;
                    if (i13 == 0 || s11Var.P1 < 0 || s11Var.Q1 < 0 || s11Var.R1 <= 0) {
                        f11 *= c11Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(c11Var);
                        int i14 = s11Var.P1;
                        int i15 = R - i14;
                        int i16 = s11Var.Q1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.l9.a((SystemClock.elapsedRealtime() - s11Var.R1) / s11Var.f(), 0.0f, 1.0f);
                            float f13 = i15;
                            float f14 = i16;
                            float f15 = f14 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f13, f14, f15);
                            scaleX *= (this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = s5;
                        }
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(c11Var.getPaddingLeft() + ((int) c11Var.getX()), c11Var.getPaddingTop(), (c11Var.getWidth() + ((int) c11Var.getX())) - c11Var.getPaddingRight(), c11Var.getHeight() - c11Var.getPaddingBottom());
                    if (!s11Var.y1 && i13 == 0) {
                        rect.offset(i10, (int) c11Var.getTranslationY());
                    }
                    if (c11Var.a) {
                        drawable = s11Var.getPremiumStar();
                        int i17 = s11Var.a0;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(org.telegram.messenger.ls.e4);
                    } else if (c11Var.s || c11Var.R) {
                        ImageReceiver imageReceiver = c11Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    } else if ((c11Var.e != null || s11Var.a0 == 13) && !c11Var.b && (drawable = c11Var.F) != null) {
                        drawable.setAlpha(org.telegram.messenger.ls.e4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = s11Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = c11Var.F;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.R;
                    c11Var.P = f16;
                    c11Var.Q = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = c11Var.T;
                        if (f17 > 1.0f && (i7 = s11Var.a0) != 3 && i7 != 4 && i7 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f17);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = s11Var.a0;
                        if (i18 == 6 || i18 == 13 || i18 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            c11Var.getHeight();
                            float f18 = this.R;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i11 * 2.0f) / this.P.size())), 0.0f);
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

    @Override // org.telegram.ui.Components.xs
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.U.m3.i0.invalidate();
                return;
            }
            org.telegram.messenger.hc hcVar = ((c11) arrayList.get(i7)).f[this.L];
            if (hcVar != null) {
                hcVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.xs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        int i7;
        org.telegram.messenger.hc[] hcVarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i10;
        int i11;
        int i12;
        Drawable premiumStar;
        s11 s11Var = this.U.m3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.P.size()) {
            c11 c11Var = (c11) this.P.get(i14);
            boolean z10 = c11Var.b;
            org.telegram.messenger.hc[] hcVarArr2 = c11Var.f;
            if (!z10) {
                if (c11Var.a) {
                    premiumStar = s11Var.getPremiumStar();
                    int i15 = s11Var.a0;
                    float f10 = (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) ? 1.3f : 1.0f;
                    float f11 = c11Var.O;
                    if (f11 != 0.0f || c11Var.T > 0.0f) {
                        f10 *= ((1.0f - Math.max(c11Var.T * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(org.telegram.messenger.ls.e4);
                        int width = (c11Var.getWidth() - c11Var.getPaddingLeft()) - c11Var.getPaddingRight();
                        int height = (c11Var.getHeight() - c11Var.getPaddingTop()) - c11Var.getPaddingBottom();
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((c11Var.getWidth() / 2.0f) - ((c11Var.getScaleX() * f12) * f10)), (int) ((c11Var.getHeight() / 2.0f) - ((c11Var.getScaleY() * f13) * f10)), (int) ((c11Var.getScaleX() * f12 * f10) + (c11Var.getWidth() / 2.0f)), (int) ((c11Var.getScaleY() * f13 * f10) + (c11Var.getHeight() / 2.0f)));
                        rect2.offset(c11Var.getLeft() - this.O, i13);
                        if (c11Var.G == null) {
                            c11Var.G = new Rect();
                        }
                        c11Var.G.set(rect2);
                        c11Var.setDrawable(premiumStar);
                        arrayList.add(c11Var);
                    }
                } else {
                    float f14 = c11Var.O;
                    if (f14 != 0.0f || c11Var.T > 0.0f) {
                        Math.max(c11Var.T * 0.8f, f14);
                    }
                    if (s11Var.R1 > 0) {
                        int i16 = i14;
                        if (SystemClock.elapsedRealtime() - s11Var.R1 >= s11Var.g() || s11Var.P1 < 0 || s11Var.Q1 < 0 || s11Var.R1 <= 0) {
                            hcVarArr = hcVarArr2;
                            i7 = i16;
                        } else {
                            int R = RecyclerView.R(c11Var);
                            int i17 = s11Var.P1;
                            int i18 = R - i17;
                            int i19 = s11Var.Q1 - i17;
                            if (i18 < 0 || i18 >= i19) {
                                hcVarArr = hcVarArr2;
                                i7 = i16;
                                alpha = 1.0f;
                            } else {
                                hcVarArr = hcVarArr2;
                                i7 = i16;
                                float a10 = c8.l9.a((SystemClock.elapsedRealtime() - s11Var.R1) / s11Var.f(), 0.0f, 1.0f);
                                float f15 = i18;
                                float f16 = i19;
                                float f17 = f16 / 4.0f;
                                float s5 = org.telegram.messenger.g0.s(a10, f15, f16, f17);
                                this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f15, f16, f17));
                                alpha = s5 * 1.0f;
                            }
                            if (!c11Var.s || c11Var.R) {
                                ImageReceiver imageReceiver2 = c11Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (c11Var.e != null) {
                                    Drawable drawable = c11Var.F;
                                    org.telegram.ui.Components.p5 p5Var = drawable instanceof org.telegram.ui.Components.p5 ? (org.telegram.ui.Components.p5) drawable : null;
                                    if (p5Var != null && (imageReceiver2 = p5Var.k) != null) {
                                        p5Var.setAlpha((int) (alpha * 255.0f));
                                        c11Var.setDrawable(p5Var);
                                        c11Var.F.setColorFilter(s11Var.l1);
                                    }
                                }
                                i11 = i7;
                                i10 = 0;
                                i14 = i11 + 1;
                                i13 = i10;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.g0((s11Var.M1 || (s11Var.N1 && c11Var.M)) ? false : true);
                            if (c11Var.M) {
                                imageReceiver.J0(0);
                            } else {
                                imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
                            }
                            int i20 = this.L;
                            org.telegram.messenger.hc e02 = imageReceiver.e0(hcVarArr[i20], i20);
                            hcVarArr[i20] = e02;
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
                            if (c11Var.M && (i12 = s11Var.a0) != 3 && i12 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i10 = 0;
                            rect.offset((c11Var.getLeft() + ((int) c11Var.getTranslationX())) - this.O, 0);
                            hcVarArr[i20].b(rect);
                            c11Var.P = 1.0f;
                            i11 = i7;
                            c11Var.Q = i11;
                            arrayList.add(c11Var);
                            i14 = i11 + 1;
                            i13 = i10;
                        }
                    } else {
                        i7 = i14;
                        hcVarArr = hcVarArr2;
                    }
                    alpha = c11Var.getAlpha() * 1.0f;
                    if (c11Var.s) {
                    }
                    ImageReceiver imageReceiver22 = c11Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.g0((s11Var.M1 || (s11Var.N1 && c11Var.M)) ? false : true);
                    if (c11Var.M) {
                    }
                    int i202 = this.L;
                    org.telegram.messenger.hc e022 = imageReceiver.e0(hcVarArr[i202], i202);
                    hcVarArr[i202] = e022;
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
                    if (c11Var.M) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i10 = 0;
                    rect.offset((c11Var.getLeft() + ((int) c11Var.getTranslationX())) - this.O, 0);
                    hcVarArr[i202].b(rect);
                    c11Var.P = 1.0f;
                    i11 = i7;
                    c11Var.Q = i11;
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
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((c11Var.s || c11Var.R) && c11Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = c11Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), c11Var.h.A());
            c11Var.h.setAlpha(f10);
            c11Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
