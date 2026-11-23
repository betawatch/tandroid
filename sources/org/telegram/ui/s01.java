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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s01 extends org.telegram.ui.Components.us {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = org.telegram.messenger.pc.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final /* synthetic */ t01 U;

    public s01(t01 t01Var) {
        this.U = t01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.us
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
                this.R = (c8.m9.a((-((view.getY() - this.U.getHeight()) + this.U.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        t01 t01Var = this.U;
        boolean z11 = true;
        boolean z12 = t01Var.m3.a0 == 13 || this.R < 1.0f || t01Var.b0() || this.P.size() <= 4 || !this.S || q11.c(this.U.m3) || (i11 = this.U.m3.a0) == 4 || i11 == 6;
        if (!z12) {
            if (this.U.m3.R1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                q11 q11Var = this.U.m3;
                if (elapsedRealtime - q11Var.R1 < q11Var.g()) {
                    z10 = true;
                    for (int i12 = 0; i12 < this.P.size(); i12++) {
                        a11 a11Var = (a11) this.P.get(i12);
                        if (a11Var.O != 0.0f || a11Var.T != 0.0f || a11Var.J != null || a11Var.getTranslationX() != 0.0f || a11Var.getTranslationY() != 0.0f || a11Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i13 = a11Var.c;
                            q11 q11Var2 = this.U.m3;
                            if (i13 > q11Var2.P1 && i13 < q11Var2.Q1) {
                                break;
                            }
                        }
                        if (a11Var.R) {
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

    @Override // org.telegram.ui.Components.us
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.us
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            a11 a11Var = (a11) arrayList.get(i7);
            if (!a11Var.b) {
                if (a11Var.a) {
                    a11Var.F.setBounds(a11Var.G);
                    a11Var.F.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = a11Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, a11Var.f[this.L]);
                    }
                }
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i7;
        q11 q11Var = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f11 = f10;
            int i11 = 0;
            while (i11 < this.P.size()) {
                a11 a11Var = (a11) this.P.get(i11);
                if (!a11Var.b) {
                    float scaleX = a11Var.getScaleX();
                    int i12 = q11Var.a0;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = a11Var.O;
                    if (f12 != 0.0f || (a11Var.T > 0.0f && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : a11Var.T * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    int i13 = (q11Var.R1 <= 0 || SystemClock.elapsedRealtime() - q11Var.R1 >= q11Var.g()) ? i10 : 1;
                    if (i13 == 0 || q11Var.P1 < 0 || q11Var.Q1 < 0 || q11Var.R1 <= 0) {
                        f11 *= a11Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(a11Var);
                        int i14 = q11Var.P1;
                        int i15 = R - i14;
                        int i16 = q11Var.Q1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.m9.a((SystemClock.elapsedRealtime() - q11Var.R1) / q11Var.f(), 0.0f, 1.0f);
                            float f13 = i15;
                            float f14 = i16;
                            float f15 = f14 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f13, f14, f15);
                            scaleX *= (this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = s5;
                        }
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(a11Var.getPaddingLeft() + ((int) a11Var.getX()), a11Var.getPaddingTop(), (a11Var.getWidth() + ((int) a11Var.getX())) - a11Var.getPaddingRight(), a11Var.getHeight() - a11Var.getPaddingBottom());
                    if (!q11Var.y1 && i13 == 0) {
                        rect.offset(i10, (int) a11Var.getTranslationY());
                    }
                    if (a11Var.a) {
                        drawable = q11Var.getPremiumStar();
                        int i17 = q11Var.a0;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(org.telegram.messenger.ks.e4);
                    } else if (a11Var.s || a11Var.R) {
                        ImageReceiver imageReceiver = a11Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.A0(rect);
                        }
                        drawable = null;
                    } else if ((a11Var.e != null || q11Var.a0 == 13) && !a11Var.b && (drawable = a11Var.F) != null) {
                        drawable.setAlpha(org.telegram.messenger.ks.e4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = q11Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = a11Var.F;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.R;
                    a11Var.P = f16;
                    a11Var.Q = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = a11Var.T;
                        if (f17 > 1.0f && (i7 = q11Var.a0) != 3 && i7 != 4 && i7 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f17);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = q11Var.a0;
                        if (i18 == 6 || i18 == 13 || i18 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            a11Var.getHeight();
                            float f18 = this.R;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i11 * 2.0f) / this.P.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, a11Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, a11Var, f11);
                    }
                }
                i11++;
                i10 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.U.m3.i0.invalidate();
                return;
            }
            org.telegram.messenger.gc gcVar = ((a11) arrayList.get(i7)).f[this.L];
            if (gcVar != null) {
                gcVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        int i7;
        org.telegram.messenger.gc[] gcVarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i10;
        int i11;
        int i12;
        Drawable premiumStar;
        q11 q11Var = this.U.m3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.P.size()) {
            a11 a11Var = (a11) this.P.get(i14);
            boolean z10 = a11Var.b;
            org.telegram.messenger.gc[] gcVarArr2 = a11Var.f;
            if (!z10) {
                if (a11Var.a) {
                    premiumStar = q11Var.getPremiumStar();
                    int i15 = q11Var.a0;
                    float f10 = (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) ? 1.3f : 1.0f;
                    float f11 = a11Var.O;
                    if (f11 != 0.0f || a11Var.T > 0.0f) {
                        f10 *= ((1.0f - Math.max(a11Var.T * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(org.telegram.messenger.ks.e4);
                        int width = (a11Var.getWidth() - a11Var.getPaddingLeft()) - a11Var.getPaddingRight();
                        int height = (a11Var.getHeight() - a11Var.getPaddingTop()) - a11Var.getPaddingBottom();
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((a11Var.getWidth() / 2.0f) - ((a11Var.getScaleX() * f12) * f10)), (int) ((a11Var.getHeight() / 2.0f) - ((a11Var.getScaleY() * f13) * f10)), (int) ((a11Var.getScaleX() * f12 * f10) + (a11Var.getWidth() / 2.0f)), (int) ((a11Var.getScaleY() * f13 * f10) + (a11Var.getHeight() / 2.0f)));
                        rect2.offset(a11Var.getLeft() - this.O, i13);
                        if (a11Var.G == null) {
                            a11Var.G = new Rect();
                        }
                        a11Var.G.set(rect2);
                        a11Var.setDrawable(premiumStar);
                        arrayList.add(a11Var);
                    }
                } else {
                    float f14 = a11Var.O;
                    if (f14 != 0.0f || a11Var.T > 0.0f) {
                        Math.max(a11Var.T * 0.8f, f14);
                    }
                    if (q11Var.R1 > 0) {
                        int i16 = i14;
                        if (SystemClock.elapsedRealtime() - q11Var.R1 >= q11Var.g() || q11Var.P1 < 0 || q11Var.Q1 < 0 || q11Var.R1 <= 0) {
                            gcVarArr = gcVarArr2;
                            i7 = i16;
                        } else {
                            int R = RecyclerView.R(a11Var);
                            int i17 = q11Var.P1;
                            int i18 = R - i17;
                            int i19 = q11Var.Q1 - i17;
                            if (i18 < 0 || i18 >= i19) {
                                gcVarArr = gcVarArr2;
                                i7 = i16;
                                alpha = 1.0f;
                            } else {
                                gcVarArr = gcVarArr2;
                                i7 = i16;
                                float a10 = c8.m9.a((SystemClock.elapsedRealtime() - q11Var.R1) / q11Var.f(), 0.0f, 1.0f);
                                float f15 = i18;
                                float f16 = i19;
                                float f17 = f16 / 4.0f;
                                float s5 = org.telegram.messenger.g0.s(a10, f15, f16, f17);
                                this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f15, f16, f17));
                                alpha = s5 * 1.0f;
                            }
                            if (!a11Var.s || a11Var.R) {
                                ImageReceiver imageReceiver2 = a11Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (a11Var.e != null) {
                                    Drawable drawable = a11Var.F;
                                    org.telegram.ui.Components.o5 o5Var = drawable instanceof org.telegram.ui.Components.o5 ? (org.telegram.ui.Components.o5) drawable : null;
                                    if (o5Var != null && (imageReceiver2 = o5Var.k) != null) {
                                        o5Var.setAlpha((int) (alpha * 255.0f));
                                        a11Var.setDrawable(o5Var);
                                        a11Var.F.setColorFilter(q11Var.l1);
                                    }
                                }
                                i11 = i7;
                                i10 = 0;
                                i14 = i11 + 1;
                                i13 = i10;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.h0((q11Var.M1 || (q11Var.N1 && a11Var.M)) ? false : true);
                            if (a11Var.M) {
                                imageReceiver.K0(0);
                            } else {
                                imageReceiver.K0(org.telegram.messenger.g0.L(4.0f));
                            }
                            int i20 = this.L;
                            org.telegram.messenger.gc f02 = imageReceiver.f0(gcVarArr[i20], i20);
                            gcVarArr[i20] = f02;
                            f02.c = j3;
                            a11Var.r = imageReceiver;
                            if (imageReceiver.C() != null) {
                                a11Var.r.C().V(j3);
                            }
                            if (a11Var.r.m() != null) {
                                a11Var.r.m().D(j3);
                            }
                            a11Var.getWidth();
                            a11Var.getPaddingLeft();
                            a11Var.getPaddingRight();
                            a11Var.getHeight();
                            a11Var.getPaddingTop();
                            a11Var.getPaddingBottom();
                            rect = org.telegram.messenger.g0.Q;
                            rect.set(a11Var.getPaddingLeft(), a11Var.getPaddingTop(), a11Var.getWidth() - a11Var.getPaddingRight(), a11Var.getHeight() - a11Var.getPaddingBottom());
                            if (a11Var.M && (i12 = q11Var.a0) != 3 && i12 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i10 = 0;
                            rect.offset((a11Var.getLeft() + ((int) a11Var.getTranslationX())) - this.O, 0);
                            gcVarArr[i20].b(rect);
                            a11Var.P = 1.0f;
                            i11 = i7;
                            a11Var.Q = i11;
                            arrayList.add(a11Var);
                            i14 = i11 + 1;
                            i13 = i10;
                        }
                    } else {
                        i7 = i14;
                        gcVarArr = gcVarArr2;
                    }
                    alpha = a11Var.getAlpha() * 1.0f;
                    if (a11Var.s) {
                    }
                    ImageReceiver imageReceiver22 = a11Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.h0((q11Var.M1 || (q11Var.N1 && a11Var.M)) ? false : true);
                    if (a11Var.M) {
                    }
                    int i202 = this.L;
                    org.telegram.messenger.gc f022 = imageReceiver.f0(gcVarArr[i202], i202);
                    gcVarArr[i202] = f022;
                    f022.c = j3;
                    a11Var.r = imageReceiver;
                    if (imageReceiver.C() != null) {
                    }
                    if (a11Var.r.m() != null) {
                    }
                    a11Var.getWidth();
                    a11Var.getPaddingLeft();
                    a11Var.getPaddingRight();
                    a11Var.getHeight();
                    a11Var.getPaddingTop();
                    a11Var.getPaddingBottom();
                    rect = org.telegram.messenger.g0.Q;
                    rect.set(a11Var.getPaddingLeft(), a11Var.getPaddingTop(), a11Var.getWidth() - a11Var.getPaddingRight(), a11Var.getHeight() - a11Var.getPaddingBottom());
                    if (a11Var.M) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i10 = 0;
                    rect.offset((a11Var.getLeft() + ((int) a11Var.getTranslationX())) - this.O, 0);
                    gcVarArr[i202].b(rect);
                    a11Var.P = 1.0f;
                    i11 = i7;
                    a11Var.Q = i11;
                    arrayList.add(a11Var);
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

    public final void m(Canvas canvas, Drawable drawable, a11 a11Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((a11Var.s || a11Var.R) && a11Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = a11Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), a11Var.h.B());
            a11Var.h.setAlpha(f10);
            a11Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
