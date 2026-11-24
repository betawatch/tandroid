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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vw9 extends oq3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = e66.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final /* synthetic */ ww9 U;

    public vw9(ww9 ww9Var) {
        this.U = ww9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    @Override // oq3
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
                this.R = (moe.a((-((view.getY() - this.U.getHeight()) + this.U.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        ww9 ww9Var = this.U;
        boolean z2 = true;
        boolean z3 = ww9Var.m3.a0 == 13 || this.R < 1.0f || ww9Var.c0() || this.P.size() <= 4 || !this.S || this.U.m3.g() || (i3 = this.U.m3.a0) == 4 || i3 == 6;
        if (!z3) {
            if (this.U.m3.R1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                tx9 tx9Var = this.U.m3;
                if (elapsedRealtime - tx9Var.R1 < tx9Var.e()) {
                    z = true;
                    for (int i4 = 0; i4 < this.P.size(); i4++) {
                        dx9 dx9Var = (dx9) this.P.get(i4);
                        if (dx9Var.O != 0.0f || dx9Var.T != 0.0f || dx9Var.J != null || dx9Var.getTranslationX() != 0.0f || dx9Var.getTranslationY() != 0.0f || dx9Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z) {
                            int i5 = dx9Var.c;
                            tx9 tx9Var2 = this.U.m3;
                            if (i5 > tx9Var2.P1 && i5 < tx9Var2.Q1) {
                                break;
                            }
                        }
                        if (dx9Var.R) {
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
        float f2 = pg5.b ? 1.0f : f;
        if (!z2 && !pg5.e) {
            super.a(canvas, j, i, i2, f2);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f2);
        k();
    }

    @Override // oq3
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // oq3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            dx9 dx9Var = (dx9) arrayList.get(i);
            if (!dx9Var.b) {
                if (dx9Var.a) {
                    dx9Var.F.setBounds(dx9Var.G);
                    dx9Var.F.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = dx9Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, dx9Var.f[this.L]);
                    }
                }
            }
            i++;
        }
    }

    @Override // oq3
    public final void d(Canvas canvas, float f) {
        Drawable drawable;
        int i;
        tx9 tx9Var = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i2 = 0;
            float f2 = f;
            int i3 = 0;
            while (i3 < this.P.size()) {
                dx9 dx9Var = (dx9) this.P.get(i3);
                if (!dx9Var.b) {
                    float scaleX = dx9Var.getScaleX();
                    int i4 = tx9Var.a0;
                    if (i4 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f3 = dx9Var.O;
                    if (f3 != 0.0f || (dx9Var.T > 0.0f && i4 != 3 && i4 != 4)) {
                        scaleX *= ((1.0f - Math.max((i4 == 3 || i4 == 4) ? 1.0f : dx9Var.T * 0.7f, f3)) * 0.2f) + 0.8f;
                    }
                    int i5 = (tx9Var.R1 <= 0 || SystemClock.elapsedRealtime() - tx9Var.R1 >= tx9Var.e()) ? i2 : 1;
                    if (i5 == 0 || tx9Var.P1 < 0 || tx9Var.Q1 < 0 || tx9Var.R1 <= 0) {
                        f2 *= dx9Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(dx9Var);
                        int i6 = tx9Var.P1;
                        int i7 = R - i6;
                        int i8 = tx9Var.Q1 - i6;
                        if (i7 >= 0 && i7 < i8) {
                            float a = moe.a((SystemClock.elapsedRealtime() - tx9Var.R1) / tx9Var.d(), 0.0f, 1.0f);
                            float f4 = i7;
                            float f5 = i8;
                            float f6 = f5 / 4.0f;
                            float s = gl.s(a, f4, f5, f6);
                            scaleX *= (this.T.getInterpolation(gl.s(a, f4, f5, f6)) * 0.5f) + 0.5f;
                            f2 = s;
                        }
                    }
                    Rect rect = gl.Q;
                    rect.set(dx9Var.getPaddingLeft() + ((int) dx9Var.getX()), dx9Var.getPaddingTop(), (dx9Var.getWidth() + ((int) dx9Var.getX())) - dx9Var.getPaddingRight(), dx9Var.getHeight() - dx9Var.getPaddingBottom());
                    if (!tx9Var.y1 && i5 == 0) {
                        rect.offset(i2, (int) dx9Var.getTranslationY());
                    }
                    if (dx9Var.a) {
                        drawable = tx9Var.getPremiumStar();
                        int i9 = tx9Var.a0;
                        if (i9 == 5 || i9 == 10 || i9 == 9 || i9 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(kk7.d4);
                    } else if (dx9Var.s || dx9Var.R) {
                        ImageReceiver imageReceiver = dx9Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.j0(rect);
                        }
                        drawable = null;
                    } else if ((dx9Var.e != null || tx9Var.a0 == 13) && !dx9Var.b && (drawable = dx9Var.F) != null) {
                        drawable.setAlpha(kk7.d4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = tx9Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = dx9Var.F;
                        if (drawable2 instanceof vl) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f7 = this.R;
                    dx9Var.P = f7;
                    dx9Var.Q = i3;
                    if (scaleX != 1.0f || f7 < 1.0f) {
                        canvas.save();
                        float f8 = dx9Var.T;
                        if (f8 > 1.0f && (i = tx9Var.a0) != 3 && i != 4 && i != 6) {
                            float R1 = gl.R1(1.0f, 0.85f, f8);
                            canvas.scale(R1, R1, rect.centerX(), rect.centerY());
                        }
                        int i10 = tx9Var.a0;
                        if (i10 == 6 || i10 == 13 || i10 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            dx9Var.getHeight();
                            float f9 = this.R;
                            if (f9 < 1.0f) {
                                canvas.scale(1.0f, f9, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i3 * 2.0f) / this.P.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, dx9Var, f2);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, dx9Var, f2);
                    }
                }
                i3++;
                i2 = 0;
            }
            canvas.restore();
        }
    }

    @Override // oq3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.U.m3.i0.invalidate();
                return;
            }
            il5 il5Var = ((dx9) arrayList.get(i)).f[this.L];
            if (il5Var != null) {
                il5Var.a();
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
    @Override // oq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j) {
        int i;
        int i2;
        float f;
        int i3;
        il5[] il5VarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i4;
        Drawable premiumStar;
        tx9 tx9Var = this.U.m3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.P.size()) {
            dx9 dx9Var = (dx9) this.P.get(i6);
            boolean z = dx9Var.b;
            il5[] il5VarArr2 = dx9Var.f;
            if (!z) {
                if (dx9Var.a) {
                    premiumStar = tx9Var.getPremiumStar();
                    int i7 = tx9Var.a0;
                    float f2 = (i7 == 5 || i7 == 10 || i7 == 9 || i7 == 7) ? 1.3f : 1.0f;
                    float f3 = dx9Var.O;
                    if (f3 != 0.0f || dx9Var.T > 0.0f) {
                        f2 *= ((1.0f - Math.max(dx9Var.T * 0.8f, f3)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(kk7.d4);
                        int width = (dx9Var.getWidth() - dx9Var.getPaddingLeft()) - dx9Var.getPaddingRight();
                        int height = (dx9Var.getHeight() - dx9Var.getPaddingTop()) - dx9Var.getPaddingBottom();
                        Rect rect2 = gl.Q;
                        float f4 = width / 2.0f;
                        float f5 = height / 2.0f;
                        rect2.set((int) ((dx9Var.getWidth() / 2.0f) - ((dx9Var.getScaleX() * f4) * f2)), (int) ((dx9Var.getHeight() / 2.0f) - ((dx9Var.getScaleY() * f5) * f2)), (int) ((dx9Var.getScaleX() * f4 * f2) + (dx9Var.getWidth() / 2.0f)), (int) ((dx9Var.getScaleY() * f5 * f2) + (dx9Var.getHeight() / 2.0f)));
                        rect2.offset(dx9Var.getLeft() - this.O, i5);
                        Rect rect3 = dx9Var.G;
                        if (rect3 == null) {
                            rect3 = new Rect();
                            dx9Var.G = rect3;
                        }
                        rect3.set(rect2);
                        dx9Var.setDrawable(premiumStar);
                        arrayList.add(dx9Var);
                    }
                } else {
                    if (tx9Var.R1 <= 0) {
                        f = 4.0f;
                    } else if (SystemClock.elapsedRealtime() - tx9Var.R1 >= tx9Var.e()) {
                        f = 4.0f;
                    } else if (tx9Var.P1 < 0 || tx9Var.Q1 < 0 || tx9Var.R1 <= 0) {
                        i3 = i6;
                        f = 4.0f;
                        il5VarArr = il5VarArr2;
                        alpha = dx9Var.getAlpha() * 1.0f;
                        if (!dx9Var.s || dx9Var.R) {
                            imageReceiver = dx9Var.h;
                            imageReceiver.setAlpha(alpha);
                        } else {
                            if (dx9Var.e != null) {
                                Drawable drawable = dx9Var.F;
                                vl vlVar = drawable instanceof vl ? (vl) drawable : null;
                                if (vlVar != null && (imageReceiver = vlVar.k) != null) {
                                    vlVar.setAlpha((int) (alpha * 255.0f));
                                    dx9Var.setDrawable(vlVar);
                                    dx9Var.F.setColorFilter(tx9Var.l1);
                                }
                            }
                            i2 = i3;
                            i = 0;
                            i6 = i2 + 1;
                            i5 = i;
                        }
                        imageReceiver.S((tx9Var.M1 || (tx9Var.N1 && dx9Var.M)) ? false : true);
                        if (dx9Var.M) {
                            imageReceiver.q0(gl.L(f));
                        } else {
                            imageReceiver.q0(0);
                        }
                        int i8 = this.L;
                        il5 Q = imageReceiver.Q(il5VarArr[i8], i8);
                        il5VarArr[i8] = Q;
                        Q.c = j;
                        dx9Var.r = imageReceiver;
                        if (imageReceiver.y() != null) {
                            dx9Var.r.y().Q(j);
                        }
                        if (dx9Var.r.m() != null) {
                            dx9Var.r.m().D(j);
                        }
                        dx9Var.getWidth();
                        dx9Var.getPaddingLeft();
                        dx9Var.getPaddingRight();
                        dx9Var.getHeight();
                        dx9Var.getPaddingTop();
                        dx9Var.getPaddingBottom();
                        rect = gl.Q;
                        rect.set(dx9Var.getPaddingLeft(), dx9Var.getPaddingTop(), dx9Var.getWidth() - dx9Var.getPaddingRight(), dx9Var.getHeight() - dx9Var.getPaddingBottom());
                        if (dx9Var.M && (i4 = tx9Var.a0) != 3 && i4 != 4) {
                            rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                        }
                        i = 0;
                        rect.offset((dx9Var.getLeft() + ((int) dx9Var.getTranslationX())) - this.O, 0);
                        il5VarArr[i8].b(rect);
                        dx9Var.P = 1.0f;
                        i2 = i3;
                        dx9Var.Q = i2;
                        arrayList.add(dx9Var);
                        i6 = i2 + 1;
                        i5 = i;
                    } else {
                        int R = RecyclerView.R(dx9Var);
                        int i9 = tx9Var.P1;
                        int i10 = R - i9;
                        int i11 = tx9Var.Q1 - i9;
                        if (i10 < 0 || i10 >= i11) {
                            i3 = i6;
                            f = 4.0f;
                            il5VarArr = il5VarArr2;
                            alpha = 1.0f;
                        } else {
                            f = 4.0f;
                            il5VarArr = il5VarArr2;
                            i3 = i6;
                            float a = moe.a((SystemClock.elapsedRealtime() - tx9Var.R1) / tx9Var.d(), 0.0f, 1.0f);
                            float f6 = i10;
                            float f7 = i11;
                            float f8 = f7 / 4.0f;
                            float s = gl.s(a, f6, f7, f8);
                            this.T.getInterpolation(gl.s(a, f6, f7, f8));
                            alpha = s * 1.0f;
                        }
                        if (dx9Var.s) {
                        }
                        imageReceiver = dx9Var.h;
                        imageReceiver.setAlpha(alpha);
                        imageReceiver.S((tx9Var.M1 || (tx9Var.N1 && dx9Var.M)) ? false : true);
                        if (dx9Var.M) {
                        }
                        int i82 = this.L;
                        il5 Q2 = imageReceiver.Q(il5VarArr[i82], i82);
                        il5VarArr[i82] = Q2;
                        Q2.c = j;
                        dx9Var.r = imageReceiver;
                        if (imageReceiver.y() != null) {
                        }
                        if (dx9Var.r.m() != null) {
                        }
                        dx9Var.getWidth();
                        dx9Var.getPaddingLeft();
                        dx9Var.getPaddingRight();
                        dx9Var.getHeight();
                        dx9Var.getPaddingTop();
                        dx9Var.getPaddingBottom();
                        rect = gl.Q;
                        rect.set(dx9Var.getPaddingLeft(), dx9Var.getPaddingTop(), dx9Var.getWidth() - dx9Var.getPaddingRight(), dx9Var.getHeight() - dx9Var.getPaddingBottom());
                        if (dx9Var.M) {
                            rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                        }
                        i = 0;
                        rect.offset((dx9Var.getLeft() + ((int) dx9Var.getTranslationX())) - this.O, 0);
                        il5VarArr[i82].b(rect);
                        dx9Var.P = 1.0f;
                        i2 = i3;
                        dx9Var.Q = i2;
                        arrayList.add(dx9Var);
                        i6 = i2 + 1;
                        i5 = i;
                    }
                    i3 = i6;
                    il5VarArr = il5VarArr2;
                    alpha = dx9Var.getAlpha() * 1.0f;
                    if (dx9Var.s) {
                    }
                    imageReceiver = dx9Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.S((tx9Var.M1 || (tx9Var.N1 && dx9Var.M)) ? false : true);
                    if (dx9Var.M) {
                    }
                    int i822 = this.L;
                    il5 Q22 = imageReceiver.Q(il5VarArr[i822], i822);
                    il5VarArr[i822] = Q22;
                    Q22.c = j;
                    dx9Var.r = imageReceiver;
                    if (imageReceiver.y() != null) {
                    }
                    if (dx9Var.r.m() != null) {
                    }
                    dx9Var.getWidth();
                    dx9Var.getPaddingLeft();
                    dx9Var.getPaddingRight();
                    dx9Var.getHeight();
                    dx9Var.getPaddingTop();
                    dx9Var.getPaddingBottom();
                    rect = gl.Q;
                    rect.set(dx9Var.getPaddingLeft(), dx9Var.getPaddingTop(), dx9Var.getWidth() - dx9Var.getPaddingRight(), dx9Var.getHeight() - dx9Var.getPaddingBottom());
                    if (dx9Var.M) {
                    }
                    i = 0;
                    rect.offset((dx9Var.getLeft() + ((int) dx9Var.getTranslationX())) - this.O, 0);
                    il5VarArr[i822].b(rect);
                    dx9Var.P = 1.0f;
                    i2 = i3;
                    dx9Var.Q = i2;
                    arrayList.add(dx9Var);
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

    public final void m(Canvas canvas, Drawable drawable, dx9 dx9Var, float f) {
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((dx9Var.s || dx9Var.R) && dx9Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = dx9Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), dx9Var.h.x());
            dx9Var.h.setAlpha(f);
            dx9Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
