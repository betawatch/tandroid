package qh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b1 extends gt {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public final boolean N = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ d1 O;

    public b1(d1 d1Var) {
        this.O = d1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.l5 l5Var, c1 c1Var, float f10) {
        if (l5Var != null) {
            l5Var.setAlpha((int) (f10 * 255.0f));
            l5Var.draw(canvas);
        } else if (c1Var.e != null) {
            canvas.save();
            canvas.clipRect(c1Var.e.getImageX(), c1Var.e.getImageY(), c1Var.e.getImageX2(), c1Var.e.getImageY2());
            c1Var.e.setAlpha(f10);
            c1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.L == null) {
            return;
        }
        f2.u0 u0Var = this.O.W;
        boolean z4 = true;
        boolean z10 = (u0Var != null && u0Var.k()) || this.L.size() <= 4 || !this.N;
        if (!z10) {
            for (int i12 = 0; i12 < this.L.size(); i12++) {
                if (((c1) this.L.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z4 = z10;
        if (!z4) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.gt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                return;
            }
            c1 c1Var = (c1) arrayList.get(i10);
            c1Var.getClass();
            org.telegram.ui.Components.l5 l5Var = c1Var.c;
            if (l5Var != null) {
                l5Var.setColorFilter(this.O.e3);
            }
            c1Var.n.draw(canvas, c1Var.h[this.H]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.l5 l5Var;
        if (this.L != null) {
            canvas.save();
            canvas.translate(-this.K, 0.0f);
            for (int i10 = 0; i10 < this.L.size(); i10++) {
                c1 c1Var = (c1) this.L.get(i10);
                c1Var.getClass();
                float scale = c1Var.getScale();
                float alpha = c1Var.getAlpha() * f10;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(c1Var.getPaddingLeft() + ((int) c1Var.getX()), c1Var.getPaddingTop(), (c1Var.getWidth() + ((int) c1Var.getX())) - c1Var.getPaddingRight(), c1Var.getHeight() - c1Var.getPaddingBottom());
                org.telegram.ui.Components.l5 l5Var2 = c1Var.c;
                if (l5Var2 != null) {
                    l5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = c1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.O.e3;
                if (porterDuffColorFilter != null && (l5Var = c1Var.c) != null) {
                    l5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, l5Var2, c1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, l5Var2, c1Var, alpha);
                }
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
                this.O.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((c1) arrayList.get(i10)).h[this.H];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    @Override // org.telegram.ui.Components.gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f10;
        int i10;
        ArrayList arrayList = this.M;
        arrayList.clear();
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            c1 c1Var = (c1) this.L.get(i11);
            c1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = c1Var.h;
            org.telegram.ui.Components.l5 l5Var = c1Var.c;
            ImageReceiver imageReceiver = l5Var != null ? l5Var.k : c1Var.e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(c1Var.getAlpha());
                org.telegram.ui.Components.l5 l5Var2 = c1Var.c;
                if (l5Var2 != null) {
                    l5Var2.setColorFilter(this.O.e3);
                }
                int i12 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                c1Var.n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    c1Var.n.getLottieAnimation().S(j10);
                }
                if (c1Var.n.getAnimation() != null) {
                    c1Var.n.getAnimation().D(j10);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(c1Var.getPaddingLeft(), c1Var.getPaddingTop(), c1Var.getWidth() - c1Var.getPaddingRight(), c1Var.getHeight() - c1Var.getPaddingBottom());
                hj0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i10 = lottieAnimation.c) == 0) {
                    org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
                    if (animation == null || animation.getIntrinsicHeight() == 0) {
                        Bitmap bitmap = imageReceiver.getBitmap();
                        if (bitmap != null) {
                            width = bitmap.getWidth();
                            height = bitmap.getHeight();
                        } else {
                            Drawable staticThumb = imageReceiver.getStaticThumb();
                            intrinsicWidth = (staticThumb == null || staticThumb.getIntrinsicHeight() == 0) ? 1.0f : staticThumb.getIntrinsicWidth() / staticThumb.getIntrinsicHeight();
                            if (intrinsicWidth >= 1.0f) {
                                float height2 = (rect.height() * intrinsicWidth) / 2.0f;
                                rect.left = (int) (rect.centerX() - height2);
                                rect.right = (int) (rect.centerX() + height2);
                            } else if (intrinsicWidth > 1.0f) {
                                float width2 = (rect.width() / intrinsicWidth) / 2.0f;
                                rect.top = (int) (rect.centerY() - width2);
                                rect.bottom = (int) (rect.centerY() + width2);
                            }
                            rect.offset((c1Var.getLeft() + ((int) c1Var.getTranslationX())) - this.K, 0);
                            backgroundThreadDrawHolderArr[i12].setBounds(rect);
                            arrayList.add(c1Var);
                        }
                    } else {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    }
                    f10 = height;
                } else {
                    width = lottieAnimation.b;
                    f10 = i10;
                }
                intrinsicWidth = width / f10;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((c1Var.getLeft() + ((int) c1Var.getTranslationX())) - this.K, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(c1Var);
            }
        }
    }
}
