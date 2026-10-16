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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class s61 extends org.telegram.ui.Components.vt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ t61 T;

    public s61(t61 t61Var) {
        this.T = t61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // org.telegram.ui.Components.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        s4.l0 l0Var;
        int i12;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        this.Q = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.O.get(0);
            if (view.getY() > (this.T.getHeight() - this.T.getPaddingBottom()) - view.getHeight()) {
                this.Q = (w7.r.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        t61 t61Var = this.T;
        boolean z11 = true;
        boolean z12 = t61Var.c3.W == 13 || this.Q < 1.0f || ((l0Var = t61Var.c0) != null && l0Var.k()) || this.O.size() <= 4 || !this.R || r71.c(this.T.c3) || (i12 = this.T.c3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.c3.P1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r71 r71Var = this.T.c3;
                if (elapsedRealtime - r71Var.P1 < r71Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        a71 a71Var = (a71) this.O.get(i13);
                        if (a71Var.N != 0.0f || a71Var.S != 0.0f || a71Var.I != null || a71Var.getTranslationX() != 0.0f || a71Var.getTranslationY() != 0.0f || a71Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = a71Var.c;
                            r71 r71Var2 = this.T.c3;
                            if (i14 > r71Var2.N1 && i14 < r71Var2.O1) {
                                break;
                            }
                        }
                        if (a71Var.Q) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i13 < this.O.size()) {
            }
        }
        z11 = z12;
        float f10 = ah.x0.b ? 1.0f : f7;
        if (!z11 && !ah.x0.e) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.vt
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.vt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            a71 a71Var = (a71) arrayList.get(i10);
            if (!a71Var.b) {
                if (a71Var.a) {
                    a71Var.E.setBounds(a71Var.F);
                    a71Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = a71Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, a71Var.f[this.K]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.vt
    public final void d(Canvas canvas, float f7) {
        Drawable drawable;
        int i10;
        r71 r71Var = this.T.c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f10 = f7;
            int i12 = 0;
            while (i12 < this.O.size()) {
                a71 a71Var = (a71) this.O.get(i12);
                if (!a71Var.b) {
                    float scaleX = a71Var.getScaleX();
                    int i13 = r71Var.W;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f11 = a71Var.N;
                    if (f11 != 0.0f || (a71Var.S > 0.0f && i13 != 3 && i13 != 4)) {
                        scaleX *= ((1.0f - Math.max((i13 == 3 || i13 == 4) ? 1.0f : a71Var.S * 0.7f, f11)) * 0.2f) + 0.8f;
                    }
                    int i14 = (r71Var.P1 <= 0 || SystemClock.elapsedRealtime() - r71Var.P1 >= r71Var.g()) ? i11 : 1;
                    if (i14 == 0 || r71Var.N1 < 0 || r71Var.O1 < 0 || r71Var.P1 <= 0) {
                        f10 *= a71Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(a71Var);
                        int i15 = r71Var.N1;
                        int i16 = R - i15;
                        int i17 = r71Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.r.a((SystemClock.elapsedRealtime() - r71Var.P1) / r71Var.f(), 0.0f, 1.0f);
                            float f12 = i16;
                            float f13 = i17;
                            float f14 = f13 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f12, f13, f14);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f12, f13, f14)) * 0.5f) + 0.5f;
                            f10 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(a71Var.getPaddingLeft() + ((int) a71Var.getX()), a71Var.getPaddingTop(), (a71Var.getWidth() + ((int) a71Var.getX())) - a71Var.getPaddingRight(), a71Var.getHeight() - a71Var.getPaddingBottom());
                    if (!r71Var.w1 && i14 == 0) {
                        rect.offset(i11, (int) a71Var.getTranslationY());
                    }
                    if (a71Var.a) {
                        drawable = r71Var.getPremiumStar();
                        int i18 = r71Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (a71Var.s || a71Var.Q) {
                        ImageReceiver imageReceiver = a71Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((a71Var.e != null || r71Var.W == 13) && !a71Var.b && (drawable = a71Var.E) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = r71Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = a71Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f15 = this.Q;
                    a71Var.O = f15;
                    a71Var.P = i12;
                    if (scaleX != 1.0f || f15 < 1.0f) {
                        canvas.save();
                        float f16 = a71Var.S;
                        if (f16 > 1.0f && (i10 = r71Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f16);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = r71Var.W;
                        if (i19 == 6 || i19 == 13 || i19 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            a71Var.getHeight();
                            float f17 = this.Q;
                            if (f17 < 1.0f) {
                                canvas.scale(1.0f, f17, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i12 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, a71Var, f10);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, a71Var, f10);
                    }
                }
                i12++;
                i11 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.T.c3.h0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((a71) arrayList.get(i10)).f[this.K];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i10;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        int i12;
        int i13;
        Drawable premiumStar;
        r71 r71Var = this.T.c3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.O.size()) {
            a71 a71Var = (a71) this.O.get(i15);
            boolean z10 = a71Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = a71Var.f;
            if (!z10) {
                if (a71Var.a) {
                    premiumStar = r71Var.getPremiumStar();
                    int i16 = r71Var.W;
                    float f7 = (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) ? 1.3f : 1.0f;
                    float f10 = a71Var.N;
                    if (f10 != 0.0f || a71Var.S > 0.0f) {
                        f7 *= ((1.0f - Math.max(a71Var.S * 0.8f, f10)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (a71Var.getWidth() - a71Var.getPaddingLeft()) - a71Var.getPaddingRight();
                        int height = (a71Var.getHeight() - a71Var.getPaddingTop()) - a71Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f11 = width / 2.0f;
                        float f12 = height / 2.0f;
                        rect2.set((int) ((a71Var.getWidth() / 2.0f) - ((a71Var.getScaleX() * f11) * f7)), (int) ((a71Var.getHeight() / 2.0f) - ((a71Var.getScaleY() * f12) * f7)), (int) ((a71Var.getScaleX() * f11 * f7) + (a71Var.getWidth() / 2.0f)), (int) ((a71Var.getScaleY() * f12 * f7) + (a71Var.getHeight() / 2.0f)));
                        rect2.offset(a71Var.getLeft() - this.N, i14);
                        if (a71Var.F == null) {
                            a71Var.F = new Rect();
                        }
                        a71Var.F.set(rect2);
                        a71Var.setDrawable(premiumStar);
                        arrayList.add(a71Var);
                    }
                } else {
                    float f13 = a71Var.N;
                    if (f13 != 0.0f || a71Var.S > 0.0f) {
                        Math.max(a71Var.S * 0.8f, f13);
                    }
                    if (r71Var.P1 > 0) {
                        int i17 = i15;
                        if (SystemClock.elapsedRealtime() - r71Var.P1 >= r71Var.g() || r71Var.N1 < 0 || r71Var.O1 < 0 || r71Var.P1 <= 0) {
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                            i10 = i17;
                        } else {
                            int R = RecyclerView.R(a71Var);
                            int i18 = r71Var.N1;
                            int i19 = R - i18;
                            int i20 = r71Var.O1 - i18;
                            if (i19 < 0 || i19 >= i20) {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                alpha = 1.0f;
                            } else {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                float a2 = w7.r.a((SystemClock.elapsedRealtime() - r71Var.P1) / r71Var.f(), 0.0f, 1.0f);
                                float f14 = i19;
                                float f15 = i20;
                                float f16 = f15 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                                this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16));
                                alpha = cascade * 1.0f;
                            }
                            if (!a71Var.s || a71Var.Q) {
                                ImageReceiver imageReceiver2 = a71Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (a71Var.e != null) {
                                    Drawable drawable = a71Var.E;
                                    org.telegram.ui.Components.s5 s5Var = drawable instanceof org.telegram.ui.Components.s5 ? (org.telegram.ui.Components.s5) drawable : null;
                                    if (s5Var != null && (imageReceiver2 = s5Var.k) != null) {
                                        s5Var.setAlpha((int) (alpha * 255.0f));
                                        a71Var.setDrawable(s5Var);
                                        a71Var.E.setColorFilter(r71Var.k1);
                                    }
                                }
                                i12 = i10;
                                i11 = 0;
                                i15 = i12 + 1;
                                i14 = i11;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.setEmojiPaused((r71Var.K1 || (r71Var.L1 && a71Var.L)) ? false : true);
                            if (a71Var.L) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                            }
                            int i21 = this.K;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i21], i21);
                            backgroundThreadDrawHolderArr[i21] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            a71Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                a71Var.r.getLottieAnimation().V(j10);
                            }
                            if (a71Var.r.getAnimation() != null) {
                                a71Var.r.getAnimation().D(j10);
                            }
                            a71Var.getWidth();
                            a71Var.getPaddingLeft();
                            a71Var.getPaddingRight();
                            a71Var.getHeight();
                            a71Var.getPaddingTop();
                            a71Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(a71Var.getPaddingLeft(), a71Var.getPaddingTop(), a71Var.getWidth() - a71Var.getPaddingRight(), a71Var.getHeight() - a71Var.getPaddingBottom());
                            if (a71Var.L && (i13 = r71Var.W) != 3 && i13 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i11 = 0;
                            rect.offset((a71Var.getLeft() + ((int) a71Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i21].setBounds(rect);
                            a71Var.O = 1.0f;
                            i12 = i10;
                            a71Var.P = i12;
                            arrayList.add(a71Var);
                            i15 = i12 + 1;
                            i14 = i11;
                        }
                    } else {
                        i10 = i15;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                    }
                    alpha = a71Var.getAlpha() * 1.0f;
                    if (a71Var.s) {
                    }
                    ImageReceiver imageReceiver22 = a71Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.setEmojiPaused((r71Var.K1 || (r71Var.L1 && a71Var.L)) ? false : true);
                    if (a71Var.L) {
                    }
                    int i212 = this.K;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i212], i212);
                    backgroundThreadDrawHolderArr[i212] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    a71Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (a71Var.r.getAnimation() != null) {
                    }
                    a71Var.getWidth();
                    a71Var.getPaddingLeft();
                    a71Var.getPaddingRight();
                    a71Var.getHeight();
                    a71Var.getPaddingTop();
                    a71Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(a71Var.getPaddingLeft(), a71Var.getPaddingTop(), a71Var.getWidth() - a71Var.getPaddingRight(), a71Var.getHeight() - a71Var.getPaddingBottom());
                    if (a71Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i11 = 0;
                    rect.offset((a71Var.getLeft() + ((int) a71Var.getTranslationX())) - this.N, 0);
                    backgroundThreadDrawHolderArr[i212].setBounds(rect);
                    a71Var.O = 1.0f;
                    i12 = i10;
                    a71Var.P = i12;
                    arrayList.add(a71Var);
                    i15 = i12 + 1;
                    i14 = i11;
                }
            }
            i11 = i14;
            i12 = i15;
            i15 = i12 + 1;
            i14 = i11;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, a71 a71Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.c3.k1);
        } else if ((a71Var.s || a71Var.Q) && a71Var.h != null) {
            canvas.save();
            canvas.clipRect(a71Var.h.getImageX(), a71Var.h.getImageY(), a71Var.h.getImageX2(), a71Var.h.getImageY2());
            a71Var.h.setAlpha(f7);
            a71Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
