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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s51 extends org.telegram.ui.Components.gt {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public float N = 1.0f;
    public final boolean O = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator P = new OvershootInterpolator(3.0f);
    public final /* synthetic */ t51 Q;

    public s51(t51 t51Var) {
        this.Q = t51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        f2.u0 u0Var;
        int i12;
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        this.N = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.L.get(0);
            if (view.getY() > (this.Q.getHeight() - this.Q.getPaddingBottom()) - view.getHeight()) {
                this.N = (k7.o.a((-((view.getY() - this.Q.getHeight()) + this.Q.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        t51 t51Var = this.Q;
        boolean z10 = true;
        boolean z11 = t51Var.b3.T == 13 || this.N < 1.0f || ((u0Var = t51Var.W) != null && u0Var.k()) || this.L.size() <= 4 || !this.O || r61.c(this.Q.b3) || (i12 = this.Q.b3.T) == 4 || i12 == 6;
        if (!z11) {
            if (this.Q.b3.M1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r61 r61Var = this.Q.b3;
                if (elapsedRealtime - r61Var.M1 < r61Var.g()) {
                    z4 = true;
                    for (int i13 = 0; i13 < this.L.size(); i13++) {
                        a61 a61Var = (a61) this.L.get(i13);
                        if (a61Var.K != 0.0f || a61Var.P != 0.0f || a61Var.F != null || a61Var.getTranslationX() != 0.0f || a61Var.getTranslationY() != 0.0f || a61Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z4) {
                            int i14 = a61Var.c;
                            r61 r61Var2 = this.Q.b3;
                            if (i14 > r61Var2.K1 && i14 < r61Var2.L1) {
                                break;
                            }
                        }
                        if (a61Var.N) {
                            break;
                        }
                    }
                }
            }
            z4 = false;
            while (i13 < this.L.size()) {
            }
        }
        z10 = z11;
        float f11 = ng.g0.b ? 1.0f : f10;
        if (!z10 && !ng.g0.e) {
            super.a(canvas, j10, i10, i11, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.gt
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.gt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                return;
            }
            a61 a61Var = (a61) arrayList.get(i10);
            if (!a61Var.b) {
                if (a61Var.a) {
                    a61Var.B.setBounds(a61Var.C);
                    a61Var.B.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = a61Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, a61Var.f[this.H]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i10;
        r61 r61Var = this.Q.b3;
        if (this.L != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.K, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.L.size()) {
                a61 a61Var = (a61) this.L.get(i11);
                if (!a61Var.b) {
                    float scaleX = a61Var.getScaleX();
                    int i12 = r61Var.T;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = a61Var.K;
                    if (f13 != f11 || (a61Var.P > f11 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : a61Var.P * 0.7f, f13)) * 0.2f) + 0.8f;
                    }
                    boolean z4 = r61Var.M1 > 0 && SystemClock.elapsedRealtime() - r61Var.M1 < r61Var.g();
                    if (!z4 || r61Var.K1 < 0 || r61Var.L1 < 0 || r61Var.M1 <= 0) {
                        f12 *= a61Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(a61Var);
                        int i13 = r61Var.K1;
                        int i14 = R - i13;
                        int i15 = r61Var.L1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = k7.o.a((SystemClock.elapsedRealtime() - r61Var.M1) / r61Var.f(), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.P.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(a61Var.getPaddingLeft() + ((int) a61Var.getX()), a61Var.getPaddingTop(), (a61Var.getWidth() + ((int) a61Var.getX())) - a61Var.getPaddingRight(), a61Var.getHeight() - a61Var.getPaddingBottom());
                    if (!r61Var.t1 && !z4) {
                        rect.offset(0, (int) a61Var.getTranslationY());
                    }
                    if (a61Var.a) {
                        drawable = r61Var.getPremiumStar();
                        int i16 = r61Var.T;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (a61Var.s || a61Var.N) {
                        ImageReceiver imageReceiver = a61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((a61Var.e != null || r61Var.T == 13) && !a61Var.b && (drawable = a61Var.B) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = r61Var.h1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = a61Var.B;
                        if (drawable2 instanceof org.telegram.ui.Components.l5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.N;
                    a61Var.L = f17;
                    a61Var.M = i11;
                    if (scaleX != 1.0f || f17 < 1.0f) {
                        canvas.save();
                        float f18 = a61Var.P;
                        if (f18 > 1.0f && (i10 = r61Var.T) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = r61Var.T;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            a61Var.getHeight();
                            float f19 = this.N;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.N) * (1.0f - ((i11 * 2.0f) / this.L.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, a61Var, f12);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, a61Var, f12);
                    }
                }
                i11++;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.Q.b3.e0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((a61) arrayList.get(i10)).f[this.H];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    @Override // org.telegram.ui.Components.gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i10;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float f10;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        Drawable premiumStar;
        r61 r61Var = this.Q.b3;
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.L.size()) {
            a61 a61Var = (a61) this.L.get(i13);
            boolean z4 = a61Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = a61Var.f;
            if (!z4) {
                if (a61Var.a) {
                    premiumStar = r61Var.getPremiumStar();
                    int i14 = r61Var.T;
                    float f11 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f12 = a61Var.K;
                    if (f12 != 0.0f || a61Var.P > 0.0f) {
                        f11 *= ((1.0f - Math.max(a61Var.P * 0.8f, f12)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (a61Var.getWidth() - a61Var.getPaddingLeft()) - a61Var.getPaddingRight();
                        int height = (a61Var.getHeight() - a61Var.getPaddingTop()) - a61Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f13 = width / 2.0f;
                        float f14 = height / 2.0f;
                        rect2.set((int) ((a61Var.getWidth() / 2.0f) - ((a61Var.getScaleX() * f13) * f11)), (int) ((a61Var.getHeight() / 2.0f) - ((a61Var.getScaleY() * f14) * f11)), (int) ((a61Var.getScaleX() * f13 * f11) + (a61Var.getWidth() / 2.0f)), (int) ((a61Var.getScaleY() * f14 * f11) + (a61Var.getHeight() / 2.0f)));
                        rect2.offset(a61Var.getLeft() - this.K, i12);
                        if (a61Var.C == null) {
                            a61Var.C = new Rect();
                        }
                        a61Var.C.set(rect2);
                        a61Var.setDrawable(premiumStar);
                        arrayList.add(a61Var);
                    }
                } else {
                    float f15 = a61Var.K;
                    if (f15 != 0.0f || a61Var.P > 0.0f) {
                        Math.max(a61Var.P * 0.8f, f15);
                    }
                    if (r61Var.M1 > 0) {
                        f10 = 4.0f;
                        if (SystemClock.elapsedRealtime() - r61Var.M1 >= r61Var.g() || r61Var.K1 < 0 || r61Var.L1 < 0 || r61Var.M1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(a61Var);
                            int i15 = r61Var.K1;
                            int i16 = R - i15;
                            int i17 = r61Var.L1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = k7.o.a((SystemClock.elapsedRealtime() - r61Var.M1) / r61Var.f(), 0.0f, 1.0f);
                                float f16 = i16;
                                float f17 = i17;
                                float f18 = f17 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f16, f17, f18);
                                this.P.getInterpolation(AndroidUtilities.cascade(a2, f16, f17, f18));
                                alpha = cascade * 1.0f;
                            }
                            if (!a61Var.s || a61Var.N) {
                                imageReceiver = a61Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (a61Var.e != null) {
                                    Drawable drawable = a61Var.B;
                                    org.telegram.ui.Components.l5 l5Var = drawable instanceof org.telegram.ui.Components.l5 ? (org.telegram.ui.Components.l5) drawable : null;
                                    if (l5Var != null && (imageReceiver = l5Var.k) != null) {
                                        l5Var.setAlpha((int) (alpha * 255.0f));
                                        a61Var.setDrawable(l5Var);
                                        a61Var.B.setColorFilter(r61Var.h1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((r61Var.H1 || (r61Var.I1 && a61Var.I)) ? false : true);
                            if (a61Var.I) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                            }
                            int i18 = this.H;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            a61Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                a61Var.r.getLottieAnimation().S(j10);
                            }
                            if (a61Var.r.getAnimation() != null) {
                                a61Var.r.getAnimation().D(j10);
                            }
                            a61Var.getWidth();
                            a61Var.getPaddingLeft();
                            a61Var.getPaddingRight();
                            a61Var.getHeight();
                            a61Var.getPaddingTop();
                            a61Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(a61Var.getPaddingLeft(), a61Var.getPaddingTop(), a61Var.getWidth() - a61Var.getPaddingRight(), a61Var.getHeight() - a61Var.getPaddingBottom());
                            if (a61Var.I && (i11 = r61Var.T) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((a61Var.getLeft() + ((int) a61Var.getTranslationX())) - this.K, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            a61Var.L = 1.0f;
                            a61Var.M = i10;
                            arrayList.add(a61Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f10 = 4.0f;
                    }
                    alpha = a61Var.getAlpha() * 1.0f;
                    if (a61Var.s) {
                    }
                    imageReceiver = a61Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((r61Var.H1 || (r61Var.I1 && a61Var.I)) ? false : true);
                    if (a61Var.I) {
                    }
                    int i182 = this.H;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    a61Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (a61Var.r.getAnimation() != null) {
                    }
                    a61Var.getWidth();
                    a61Var.getPaddingLeft();
                    a61Var.getPaddingRight();
                    a61Var.getHeight();
                    a61Var.getPaddingTop();
                    a61Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(a61Var.getPaddingLeft(), a61Var.getPaddingTop(), a61Var.getWidth() - a61Var.getPaddingRight(), a61Var.getHeight() - a61Var.getPaddingBottom());
                    if (a61Var.I) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((a61Var.getLeft() + ((int) a61Var.getTranslationX())) - this.K, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    a61Var.L = 1.0f;
                    a61Var.M = i10;
                    arrayList.add(a61Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, a61 a61Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.Q.b3.h1);
        } else if ((a61Var.s || a61Var.N) && a61Var.h != null) {
            canvas.save();
            canvas.clipRect(a61Var.h.getImageX(), a61Var.h.getImageY(), a61Var.h.getImageX2(), a61Var.h.getImageY2());
            a61Var.h.setAlpha(f10);
            a61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
