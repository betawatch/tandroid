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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x51 extends org.telegram.ui.Components.dt {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public float N = 1.0f;
    public final boolean O = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator P = new OvershootInterpolator(3.0f);
    public final /* synthetic */ y51 Q;

    public x51(y51 y51Var) {
        this.Q = y51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.dt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        f2.t0 t0Var;
        int i12;
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        this.N = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.L.get(0);
            if (view.getY() > (this.Q.getHeight() - this.Q.getPaddingBottom()) - view.getHeight()) {
                this.N = (k7.n.a((-((view.getY() - this.Q.getHeight()) + this.Q.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        y51 y51Var = this.Q;
        boolean z10 = true;
        boolean z11 = y51Var.b3.T == 13 || this.N < 1.0f || ((t0Var = y51Var.W) != null && t0Var.k()) || this.L.size() <= 4 || !this.O || x61.c(this.Q.b3) || (i12 = this.Q.b3.T) == 4 || i12 == 6;
        if (!z11) {
            if (this.Q.b3.M1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                x61 x61Var = this.Q.b3;
                if (elapsedRealtime - x61Var.M1 < x61Var.g()) {
                    z4 = true;
                    for (int i13 = 0; i13 < this.L.size(); i13++) {
                        f61 f61Var = (f61) this.L.get(i13);
                        if (f61Var.K != 0.0f || f61Var.P != 0.0f || f61Var.F != null || f61Var.getTranslationX() != 0.0f || f61Var.getTranslationY() != 0.0f || f61Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z4) {
                            int i14 = f61Var.c;
                            x61 x61Var2 = this.Q.b3;
                            if (i14 > x61Var2.K1 && i14 < x61Var2.L1) {
                                break;
                            }
                        }
                        if (f61Var.N) {
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
        float f11 = mg.g0.b ? 1.0f : f10;
        if (!z10 && !mg.g0.e) {
            super.a(canvas, j10, i10, i11, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.dt
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.dt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                return;
            }
            f61 f61Var = (f61) arrayList.get(i10);
            if (!f61Var.b) {
                if (f61Var.a) {
                    f61Var.B.setBounds(f61Var.C);
                    f61Var.B.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = f61Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, f61Var.f[this.H]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.dt
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i10;
        x61 x61Var = this.Q.b3;
        if (this.L != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.K, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.L.size()) {
                f61 f61Var = (f61) this.L.get(i11);
                if (!f61Var.b) {
                    float scaleX = f61Var.getScaleX();
                    int i12 = x61Var.T;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = f61Var.K;
                    if (f13 != f11 || (f61Var.P > f11 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : f61Var.P * 0.7f, f13)) * 0.2f) + 0.8f;
                    }
                    boolean z4 = x61Var.M1 > 0 && SystemClock.elapsedRealtime() - x61Var.M1 < x61Var.g();
                    if (!z4 || x61Var.K1 < 0 || x61Var.L1 < 0 || x61Var.M1 <= 0) {
                        f12 *= f61Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(f61Var);
                        int i13 = x61Var.K1;
                        int i14 = R - i13;
                        int i15 = x61Var.L1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = k7.n.a((SystemClock.elapsedRealtime() - x61Var.M1) / x61Var.f(), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.P.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(f61Var.getPaddingLeft() + ((int) f61Var.getX()), f61Var.getPaddingTop(), (f61Var.getWidth() + ((int) f61Var.getX())) - f61Var.getPaddingRight(), f61Var.getHeight() - f61Var.getPaddingBottom());
                    if (!x61Var.t1 && !z4) {
                        rect.offset(0, (int) f61Var.getTranslationY());
                    }
                    if (f61Var.a) {
                        drawable = x61Var.getPremiumStar();
                        int i16 = x61Var.T;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (f61Var.s || f61Var.N) {
                        ImageReceiver imageReceiver = f61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((f61Var.e != null || x61Var.T == 13) && !f61Var.b && (drawable = f61Var.B) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = x61Var.h1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = f61Var.B;
                        if (drawable2 instanceof org.telegram.ui.Components.l5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.N;
                    f61Var.L = f17;
                    f61Var.M = i11;
                    if (scaleX != 1.0f || f17 < 1.0f) {
                        canvas.save();
                        float f18 = f61Var.P;
                        if (f18 > 1.0f && (i10 = x61Var.T) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = x61Var.T;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            f61Var.getHeight();
                            float f19 = this.N;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.N) * (1.0f - ((i11 * 2.0f) / this.L.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, f61Var, f12);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, f61Var, f12);
                    }
                }
                i11++;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.dt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.Q.b3.e0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((f61) arrayList.get(i10)).f[this.H];
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
    @Override // org.telegram.ui.Components.dt
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
        x61 x61Var = this.Q.b3;
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.L.size()) {
            f61 f61Var = (f61) this.L.get(i13);
            boolean z4 = f61Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = f61Var.f;
            if (!z4) {
                if (f61Var.a) {
                    premiumStar = x61Var.getPremiumStar();
                    int i14 = x61Var.T;
                    float f11 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f12 = f61Var.K;
                    if (f12 != 0.0f || f61Var.P > 0.0f) {
                        f11 *= ((1.0f - Math.max(f61Var.P * 0.8f, f12)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (f61Var.getWidth() - f61Var.getPaddingLeft()) - f61Var.getPaddingRight();
                        int height = (f61Var.getHeight() - f61Var.getPaddingTop()) - f61Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f13 = width / 2.0f;
                        float f14 = height / 2.0f;
                        rect2.set((int) ((f61Var.getWidth() / 2.0f) - ((f61Var.getScaleX() * f13) * f11)), (int) ((f61Var.getHeight() / 2.0f) - ((f61Var.getScaleY() * f14) * f11)), (int) ((f61Var.getScaleX() * f13 * f11) + (f61Var.getWidth() / 2.0f)), (int) ((f61Var.getScaleY() * f14 * f11) + (f61Var.getHeight() / 2.0f)));
                        rect2.offset(f61Var.getLeft() - this.K, i12);
                        if (f61Var.C == null) {
                            f61Var.C = new Rect();
                        }
                        f61Var.C.set(rect2);
                        f61Var.setDrawable(premiumStar);
                        arrayList.add(f61Var);
                    }
                } else {
                    float f15 = f61Var.K;
                    if (f15 != 0.0f || f61Var.P > 0.0f) {
                        Math.max(f61Var.P * 0.8f, f15);
                    }
                    if (x61Var.M1 > 0) {
                        f10 = 4.0f;
                        if (SystemClock.elapsedRealtime() - x61Var.M1 >= x61Var.g() || x61Var.K1 < 0 || x61Var.L1 < 0 || x61Var.M1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(f61Var);
                            int i15 = x61Var.K1;
                            int i16 = R - i15;
                            int i17 = x61Var.L1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = k7.n.a((SystemClock.elapsedRealtime() - x61Var.M1) / x61Var.f(), 0.0f, 1.0f);
                                float f16 = i16;
                                float f17 = i17;
                                float f18 = f17 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f16, f17, f18);
                                this.P.getInterpolation(AndroidUtilities.cascade(a2, f16, f17, f18));
                                alpha = cascade * 1.0f;
                            }
                            if (!f61Var.s || f61Var.N) {
                                imageReceiver = f61Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (f61Var.e != null) {
                                    Drawable drawable = f61Var.B;
                                    org.telegram.ui.Components.l5 l5Var = drawable instanceof org.telegram.ui.Components.l5 ? (org.telegram.ui.Components.l5) drawable : null;
                                    if (l5Var != null && (imageReceiver = l5Var.k) != null) {
                                        l5Var.setAlpha((int) (alpha * 255.0f));
                                        f61Var.setDrawable(l5Var);
                                        f61Var.B.setColorFilter(x61Var.h1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((x61Var.H1 || (x61Var.I1 && f61Var.I)) ? false : true);
                            if (f61Var.I) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                            }
                            int i18 = this.H;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            f61Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                f61Var.r.getLottieAnimation().S(j10);
                            }
                            if (f61Var.r.getAnimation() != null) {
                                f61Var.r.getAnimation().D(j10);
                            }
                            f61Var.getWidth();
                            f61Var.getPaddingLeft();
                            f61Var.getPaddingRight();
                            f61Var.getHeight();
                            f61Var.getPaddingTop();
                            f61Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(f61Var.getPaddingLeft(), f61Var.getPaddingTop(), f61Var.getWidth() - f61Var.getPaddingRight(), f61Var.getHeight() - f61Var.getPaddingBottom());
                            if (f61Var.I && (i11 = x61Var.T) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((f61Var.getLeft() + ((int) f61Var.getTranslationX())) - this.K, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            f61Var.L = 1.0f;
                            f61Var.M = i10;
                            arrayList.add(f61Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f10 = 4.0f;
                    }
                    alpha = f61Var.getAlpha() * 1.0f;
                    if (f61Var.s) {
                    }
                    imageReceiver = f61Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((x61Var.H1 || (x61Var.I1 && f61Var.I)) ? false : true);
                    if (f61Var.I) {
                    }
                    int i182 = this.H;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    f61Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (f61Var.r.getAnimation() != null) {
                    }
                    f61Var.getWidth();
                    f61Var.getPaddingLeft();
                    f61Var.getPaddingRight();
                    f61Var.getHeight();
                    f61Var.getPaddingTop();
                    f61Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(f61Var.getPaddingLeft(), f61Var.getPaddingTop(), f61Var.getWidth() - f61Var.getPaddingRight(), f61Var.getHeight() - f61Var.getPaddingBottom());
                    if (f61Var.I) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((f61Var.getLeft() + ((int) f61Var.getTranslationX())) - this.K, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    f61Var.L = 1.0f;
                    f61Var.M = i10;
                    arrayList.add(f61Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, f61 f61Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.Q.b3.h1);
        } else if ((f61Var.s || f61Var.N) && f61Var.h != null) {
            canvas.save();
            canvas.clipRect(f61Var.h.getImageX(), f61Var.h.getImageY(), f61Var.h.getImageX2(), f61Var.h.getImageY2());
            f61Var.h.setAlpha(f10);
            f61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
