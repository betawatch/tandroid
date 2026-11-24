// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xy9 extends yr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = e86.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final /* synthetic */ yy9 U;

    public xy9(yy9 yy9Var) {
        this.U = yy9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    @Override // yr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        int i3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        this.R = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.P.get(0);
            if (view.getY() > (this.U.getHeight() - this.U.getPaddingBottom()) - view.getHeight()) {
                this.R = (pqe.a((-((view.getY() - this.U.getHeight()) + this.U.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        yy9 yy9Var = this.U;
        boolean z2 = true;
        boolean z3 = yy9Var.m3.a0 == 13 || this.R < 1.0f || yy9Var.c0() || this.P.size() <= 4 || !this.S || this.U.m3.g() || (i3 = this.U.m3.a0) == 4 || i3 == 6;
        if (!z3) {
            if (this.U.m3.R1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                vz9 vz9Var = this.U.m3;
                if (elapsedRealtime - vz9Var.R1 < vz9Var.e()) {
                    z = true;
                    for (int i4 = 0; i4 < this.P.size(); i4++) {
                        fz9 fz9Var = (fz9) this.P.get(i4);
                        if (fz9Var.O != 0.0f || fz9Var.T != 0.0f || fz9Var.J != null || fz9Var.getTranslationX() != 0.0f || fz9Var.getTranslationY() != 0.0f || fz9Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z) {
                            int i5 = fz9Var.c;
                            vz9 vz9Var2 = this.U.m3;
                            if (i5 > vz9Var2.P1 && i5 < vz9Var2.Q1) {
                                break;
                            }
                        }
                        if (fz9Var.R) {
                            break;
                        }
                    }
                }
            }
            z = false;
            while (i4 < this.P.size()) {
            }
        }
        z2 = z3;
        float f2 = oi5.b ? 1.0f : f;
        if (!z2 && !oi5.e) {
            super.a(canvas, j, i, i2, f2);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f2);
        k();
    }

    @Override // yr3
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // yr3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            fz9 fz9Var = (fz9) arrayList.get(i);
            if (!fz9Var.b) {
                if (fz9Var.a) {
                    fz9Var.F.setBounds(fz9Var.G);
                    fz9Var.F.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = fz9Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, fz9Var.f[this.L]);
                    }
                }
            }
            i++;
        }
    }

    @Override // yr3
    public final void d(Canvas canvas, float f) {
        Drawable drawable;
        int i;
        vz9 vz9Var = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i2 = 0;
            float f2 = f;
            int i3 = 0;
            while (i3 < this.P.size()) {
                fz9 fz9Var = (fz9) this.P.get(i3);
                if (!fz9Var.b) {
                    float scaleX = fz9Var.getScaleX();
                    int i4 = vz9Var.a0;
                    if (i4 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f3 = fz9Var.O;
                    if (f3 != 0.0f || (fz9Var.T > 0.0f && i4 != 3 && i4 != 4)) {
                        scaleX *= ((1.0f - Math.max((i4 == 3 || i4 == 4) ? 1.0f : fz9Var.T * 0.7f, f3)) * 0.2f) + 0.8f;
                    }
                    int i5 = (vz9Var.R1 <= 0 || SystemClock.elapsedRealtime() - vz9Var.R1 >= vz9Var.e()) ? i2 : 1;
                    if (i5 == 0 || vz9Var.P1 < 0 || vz9Var.Q1 < 0 || vz9Var.R1 <= 0) {
                        f2 *= fz9Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(fz9Var);
                        int i6 = vz9Var.P1;
                        int i7 = R - i6;
                        int i8 = vz9Var.Q1 - i6;
                        if (i7 >= 0 && i7 < i8) {
                            float a = pqe.a((SystemClock.elapsedRealtime() - vz9Var.R1) / vz9Var.d(), 0.0f, 1.0f);
                            float f4 = i7;
                            float f5 = i8;
                            float f6 = f5 / 4.0f;
                            float s = gm.s(a, f4, f5, f6);
                            scaleX *= (this.T.getInterpolation(gm.s(a, f4, f5, f6)) * 0.5f) + 0.5f;
                            f2 = s;
                        }
                    }
                    Rect rect = gm.Q;
                    rect.set(fz9Var.getPaddingLeft() + ((int) fz9Var.getX()), fz9Var.getPaddingTop(), (fz9Var.getWidth() + ((int) fz9Var.getX())) - fz9Var.getPaddingRight(), fz9Var.getHeight() - fz9Var.getPaddingBottom());
                    if (!vz9Var.y1 && i5 == 0) {
                        rect.offset(i2, (int) fz9Var.getTranslationY());
                    }
                    if (fz9Var.a) {
                        drawable = vz9Var.getPremiumStar();
                        int i9 = vz9Var.a0;
                        if (i9 == 5 || i9 == 10 || i9 == 9 || i9 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(nm7.d4);
                    } else if (fz9Var.s || fz9Var.R) {
                        ImageReceiver imageReceiver = fz9Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.j0(rect);
                        }
                        drawable = null;
                    } else if ((fz9Var.e != null || vz9Var.a0 == 13) && !fz9Var.b && (drawable = fz9Var.F) != null) {
                        drawable.setAlpha(nm7.d4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = vz9Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = fz9Var.F;
                        if (drawable2 instanceof vm) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f7 = this.R;
                    fz9Var.P = f7;
                    fz9Var.Q = i3;
                    if (scaleX != 1.0f || f7 < 1.0f) {
                        canvas.save();
                        float f8 = fz9Var.T;
                        if (f8 > 1.0f && (i = vz9Var.a0) != 3 && i != 4 && i != 6) {
                            float R1 = gm.R1(1.0f, 0.85f, f8);
                            canvas.scale(R1, R1, rect.centerX(), rect.centerY());
                        }
                        int i10 = vz9Var.a0;
                        if (i10 == 6 || i10 == 13 || i10 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            fz9Var.getHeight();
                            float f9 = this.R;
                            if (f9 < 1.0f) {
                                canvas.scale(1.0f, f9, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i3 * 2.0f) / this.P.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, fz9Var, f2);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, fz9Var, f2);
                    }
                }
                i3++;
                i2 = 0;
            }
            canvas.restore();
        }
    }

    @Override // yr3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.U.m3.i0.invalidate();
                return;
            }
            in5 in5Var = ((fz9) arrayList.get(i)).f[this.L];
            if (in5Var != null) {
                in5Var.a();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c9  */
    @Override // yr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j) {
        int i;
        int i2;
        float f;
        int i3;
        in5[] in5VarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i4;
        Drawable premiumStar;
        vz9 vz9Var = this.U.m3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.P.size()) {
            fz9 fz9Var = (fz9) this.P.get(i6);
            boolean z = fz9Var.b;
            in5[] in5VarArr2 = fz9Var.f;
            if (!z) {
                if (fz9Var.a) {
                    premiumStar = vz9Var.getPremiumStar();
                    int i7 = vz9Var.a0;
                    float f2 = (i7 == 5 || i7 == 10 || i7 == 9 || i7 == 7) ? 1.3f : 1.0f;
                    float f3 = fz9Var.O;
                    if (f3 != 0.0f || fz9Var.T > 0.0f) {
                        f2 *= ((1.0f - Math.max(fz9Var.T * 0.8f, f3)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(nm7.d4);
                        int width = (fz9Var.getWidth() - fz9Var.getPaddingLeft()) - fz9Var.getPaddingRight();
                        int height = (fz9Var.getHeight() - fz9Var.getPaddingTop()) - fz9Var.getPaddingBottom();
                        Rect rect2 = gm.Q;
                        float f4 = width / 2.0f;
                        float f5 = height / 2.0f;
                        rect2.set((int) ((fz9Var.getWidth() / 2.0f) - ((fz9Var.getScaleX() * f4) * f2)), (int) ((fz9Var.getHeight() / 2.0f) - ((fz9Var.getScaleY() * f5) * f2)), (int) ((fz9Var.getScaleX() * f4 * f2) + (fz9Var.getWidth() / 2.0f)), (int) ((fz9Var.getScaleY() * f5 * f2) + (fz9Var.getHeight() / 2.0f)));
                        rect2.offset(fz9Var.getLeft() - this.O, i5);
                        Rect rect3 = fz9Var.G;
                        if (rect3 == null) {
                            rect3 = new Rect();
                            fz9Var.G = rect3;
                        }
                        rect3.set(rect2);
                        fz9Var.setDrawable(premiumStar);
                        arrayList.add(fz9Var);
                    }
                } else {
                    if (vz9Var.R1 <= 0) {
                        f = 4.0f;
                    } else if (SystemClock.elapsedRealtime() - vz9Var.R1 >= vz9Var.e()) {
                        f = 4.0f;
                    } else if (vz9Var.P1 < 0 || vz9Var.Q1 < 0 || vz9Var.R1 <= 0) {
                        i3 = i6;
                        f = 4.0f;
                        in5VarArr = in5VarArr2;
                        alpha = fz9Var.getAlpha() * 1.0f;
                        if (!fz9Var.s || fz9Var.R) {
                            imageReceiver = fz9Var.h;
                            imageReceiver.setAlpha(alpha);
                        } else {
                            if (fz9Var.e != null) {
                                Drawable drawable = fz9Var.F;
                                vm vmVar = drawable instanceof vm ? (vm) drawable : null;
                                if (vmVar != null && (imageReceiver = vmVar.k) != null) {
                                    vmVar.setAlpha((int) (alpha * 255.0f));
                                    fz9Var.setDrawable(vmVar);
                                    fz9Var.F.setColorFilter(vz9Var.l1);
                                }
                            }
                            i2 = i3;
                            i = 0;
                            i6 = i2 + 1;
                            i5 = i;
                        }
                        imageReceiver.S((vz9Var.M1 || (vz9Var.N1 && fz9Var.M)) ? false : true);
                        if (fz9Var.M) {
                            imageReceiver.q0(gm.L(f));
                        } else {
                            imageReceiver.q0(0);
                        }
                        int i8 = this.L;
                        in5 Q = imageReceiver.Q(in5VarArr[i8], i8);
                        in5VarArr[i8] = Q;
                        Q.c = j;
                        fz9Var.r = imageReceiver;
                        if (imageReceiver.y() != null) {
                            fz9Var.r.y().Q(j);
                        }
                        if (fz9Var.r.m() != null) {
                            fz9Var.r.m().D(j);
                        }
                        fz9Var.getWidth();
                        fz9Var.getPaddingLeft();
                        fz9Var.getPaddingRight();
                        fz9Var.getHeight();
                        fz9Var.getPaddingTop();
                        fz9Var.getPaddingBottom();
                        rect = gm.Q;
                        rect.set(fz9Var.getPaddingLeft(), fz9Var.getPaddingTop(), fz9Var.getWidth() - fz9Var.getPaddingRight(), fz9Var.getHeight() - fz9Var.getPaddingBottom());
                        if (fz9Var.M && (i4 = vz9Var.a0) != 3 && i4 != 4) {
                            rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                        }
                        i = 0;
                        rect.offset((fz9Var.getLeft() + ((int) fz9Var.getTranslationX())) - this.O, 0);
                        in5VarArr[i8].b(rect);
                        fz9Var.P = 1.0f;
                        i2 = i3;
                        fz9Var.Q = i2;
                        arrayList.add(fz9Var);
                        i6 = i2 + 1;
                        i5 = i;
                    } else {
                        int R = RecyclerView.R(fz9Var);
                        int i9 = vz9Var.P1;
                        int i10 = R - i9;
                        int i11 = vz9Var.Q1 - i9;
                        if (i10 < 0 || i10 >= i11) {
                            i3 = i6;
                            f = 4.0f;
                            in5VarArr = in5VarArr2;
                            alpha = 1.0f;
                        } else {
                            f = 4.0f;
                            in5VarArr = in5VarArr2;
                            i3 = i6;
                            float a = pqe.a((SystemClock.elapsedRealtime() - vz9Var.R1) / vz9Var.d(), 0.0f, 1.0f);
                            float f6 = i10;
                            float f7 = i11;
                            float f8 = f7 / 4.0f;
                            float s = gm.s(a, f6, f7, f8);
                            this.T.getInterpolation(gm.s(a, f6, f7, f8));
                            alpha = s * 1.0f;
                        }
                        if (fz9Var.s) {
                        }
                        imageReceiver = fz9Var.h;
                        imageReceiver.setAlpha(alpha);
                        imageReceiver.S((vz9Var.M1 || (vz9Var.N1 && fz9Var.M)) ? false : true);
                        if (fz9Var.M) {
                        }
                        int i82 = this.L;
                        in5 Q2 = imageReceiver.Q(in5VarArr[i82], i82);
                        in5VarArr[i82] = Q2;
                        Q2.c = j;
                        fz9Var.r = imageReceiver;
                        if (imageReceiver.y() != null) {
                        }
                        if (fz9Var.r.m() != null) {
                        }
                        fz9Var.getWidth();
                        fz9Var.getPaddingLeft();
                        fz9Var.getPaddingRight();
                        fz9Var.getHeight();
                        fz9Var.getPaddingTop();
                        fz9Var.getPaddingBottom();
                        rect = gm.Q;
                        rect.set(fz9Var.getPaddingLeft(), fz9Var.getPaddingTop(), fz9Var.getWidth() - fz9Var.getPaddingRight(), fz9Var.getHeight() - fz9Var.getPaddingBottom());
                        if (fz9Var.M) {
                            rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                        }
                        i = 0;
                        rect.offset((fz9Var.getLeft() + ((int) fz9Var.getTranslationX())) - this.O, 0);
                        in5VarArr[i82].b(rect);
                        fz9Var.P = 1.0f;
                        i2 = i3;
                        fz9Var.Q = i2;
                        arrayList.add(fz9Var);
                        i6 = i2 + 1;
                        i5 = i;
                    }
                    i3 = i6;
                    in5VarArr = in5VarArr2;
                    alpha = fz9Var.getAlpha() * 1.0f;
                    if (fz9Var.s) {
                    }
                    imageReceiver = fz9Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.S((vz9Var.M1 || (vz9Var.N1 && fz9Var.M)) ? false : true);
                    if (fz9Var.M) {
                    }
                    int i822 = this.L;
                    in5 Q22 = imageReceiver.Q(in5VarArr[i822], i822);
                    in5VarArr[i822] = Q22;
                    Q22.c = j;
                    fz9Var.r = imageReceiver;
                    if (imageReceiver.y() != null) {
                    }
                    if (fz9Var.r.m() != null) {
                    }
                    fz9Var.getWidth();
                    fz9Var.getPaddingLeft();
                    fz9Var.getPaddingRight();
                    fz9Var.getHeight();
                    fz9Var.getPaddingTop();
                    fz9Var.getPaddingBottom();
                    rect = gm.Q;
                    rect.set(fz9Var.getPaddingLeft(), fz9Var.getPaddingTop(), fz9Var.getWidth() - fz9Var.getPaddingRight(), fz9Var.getHeight() - fz9Var.getPaddingBottom());
                    if (fz9Var.M) {
                    }
                    i = 0;
                    rect.offset((fz9Var.getLeft() + ((int) fz9Var.getTranslationX())) - this.O, 0);
                    in5VarArr[i822].b(rect);
                    fz9Var.P = 1.0f;
                    i2 = i3;
                    fz9Var.Q = i2;
                    arrayList.add(fz9Var);
                    i6 = i2 + 1;
                    i5 = i;
                }
            }
            i = i5;
            i2 = i6;
            i6 = i2 + 1;
            i5 = i;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, fz9 fz9Var, float f) {
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((fz9Var.s || fz9Var.R) && fz9Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = fz9Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), fz9Var.h.x());
            fz9Var.h.setAlpha(f);
            fz9Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
