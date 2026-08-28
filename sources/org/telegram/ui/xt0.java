package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class xt0 {
    public final View i;
    public boolean p;
    public final org.telegram.ui.Components.fq q;
    public final org.telegram.ui.Components.qf0 r;
    public final /* synthetic */ PhotoViewer s;
    public long a = 0;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f = 0.0f;
    public final RectF g = new RectF();
    public int h = -1;
    public final int j = AndroidUtilities.dp(64.0f);
    public int k = -2;
    public float l = 1.0f;
    public final float[] m = new float[3];
    public final float[] n = new float[3];
    public float o = 1.0f;

    public xt0(PhotoViewer photoViewer, View view) {
        this.s = photoViewer;
        if (PhotoViewer.S8 == null) {
            PhotoViewer.S8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.T8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.T8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.T8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.T8.setColor(-1);
        }
        this.i = view;
        int i9 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i9 >= fArr.length) {
                a();
                org.telegram.ui.Components.qf0 qf0Var = new org.telegram.ui.Components.qf0(28);
                this.r = qf0Var;
                qf0Var.h = 200;
                this.q = new org.telegram.ui.Components.fq(photoViewer.y.getDrawable(R.drawable.circle_big).mutate(), qf0Var);
                return;
            }
            this.m[i9] = 1.0f;
            fArr[i9] = 1.0f;
            i9++;
        }
    }

    public final void a() {
        boolean z10;
        int i9 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i9 >= fArr.length) {
                z10 = true;
                break;
            } else {
                if (fArr[i9] != 1.0f) {
                    z10 = false;
                    break;
                }
                i9++;
            }
        }
        if (z10 != this.p) {
            this.p = z10;
            ur0 ur0Var = (ur0) this;
            PhotoViewer photoViewer = ur0Var.t;
            if (ur0Var == photoViewer.S0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i9 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.s;
        float f10 = ((i9 + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) - ((int) (this.j * this.o))) / 2;
        photoViewer.getClass();
        int i10 = (int) (f10 + 0.0f);
        return photoViewer.Y1 == 1 ? i10 - AndroidUtilities.dp(38.0f) : i10;
    }

    public final void c(Canvas canvas) {
        int i9;
        float f10 = this.j;
        int i10 = (int) (this.o * f10);
        int width = (this.s.a0.getWidth() - ((int) (f10 * this.o))) / 2;
        int b10 = b();
        int i11 = 0;
        float f11 = 1.0f;
        while (true) {
            float[] fArr = this.m;
            if (i11 >= fArr.length) {
                break;
            }
            f11 = i11 == 2 ? AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i11]) * f11 : f11 * fArr[i11];
            i11++;
        }
        int i12 = this.k;
        Drawable drawable = this.q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.P8;
            if (i12 < drawableArr.length + 2) {
                Drawable drawable2 = i12 < drawableArr.length ? drawableArr[i12] : drawable;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.l * 255.0f * f11));
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i13 = this.h;
        if (i13 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.P8;
            if (i13 < drawableArr2.length + 2) {
                if (i13 < drawableArr2.length) {
                    drawable = drawableArr2[i13];
                }
                if (drawable != null) {
                    if (this.k != -2) {
                        drawable.setAlpha((int) org.telegram.messenger.l0.y(1.0f, this.l, 255.0f, f11));
                    } else {
                        drawable.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable.setBounds(width, b10, width + i10, b10 + i10);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i9 = this.k) != 0 && i9 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.k != -2) {
            PhotoViewer.T8.setAlpha((int) (this.l * 255.0f * f11));
        } else {
            PhotoViewer.T8.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.g;
        rectF.set(width + dp, b10 + dp, (width + i10) - dp, (b10 + i10) - dp);
        canvas.drawArc(rectF, this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), false, PhotoViewer.T8);
        g(true);
    }

    public final void d(int i9, boolean z10, boolean z11) {
        int i10;
        int i11 = this.h;
        if (i11 == i9) {
            return;
        }
        View view = this.i;
        org.telegram.ui.Components.qf0 qf0Var = this.r;
        if (qf0Var != null) {
            boolean z12 = z11 && (i11 == 3 || i11 == 4);
            if (i9 == 3) {
                qf0Var.a(false, z12);
            } else if (i9 == 4) {
                qf0Var.a(true, z12);
            }
            qf0Var.f = view;
            qf0Var.invalidateSelf();
        }
        this.a = System.currentTimeMillis();
        if (!z10 || (i10 = this.h) == i9) {
            this.k = -2;
        } else {
            this.k = i10;
            this.l = 1.0f;
        }
        this.h = i9;
        ur0 ur0Var = (ur0) this;
        PhotoViewer photoViewer = ur0Var.t;
        if (ur0Var == photoViewer.S0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i9, float f10, boolean z10) {
        float[] fArr = this.n;
        if (fArr[i9] != f10) {
            fArr[i9] = f10;
            if (!z10) {
                this.m[i9] = f10;
            }
            a();
            this.i.invalidate();
        }
    }

    public final void f(float f10, boolean z10) {
        if (z10) {
            this.d = this.f;
        } else {
            this.f = f10;
            this.d = f10;
        }
        this.c = f10;
        this.e = 0L;
        this.i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.a = currentTimeMillis;
        int i9 = 0;
        if (z10) {
            if (this.f == 1.0f && this.c == 1.0f) {
                z11 = false;
            } else {
                this.b = ((360 * j10) / 3000.0f) + this.b;
                float f10 = this.c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        float f11 = this.c;
                        this.f = f11;
                        this.d = f11;
                        this.e = 0L;
                    } else {
                        this.f = (PhotoViewer.S8.getInterpolation(j11 / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.l;
            if (f12 > 0.0f && this.k != -2) {
                float f13 = f12 - (j10 / 200.0f);
                this.l = f13;
                if (f13 <= 0.0f) {
                    this.l = 0.0f;
                    this.k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.n;
            if (i9 >= fArr.length) {
                break;
            }
            float f14 = fArr[i9];
            float[] fArr2 = this.m;
            float f15 = fArr2[i9];
            if (f14 > f15) {
                fArr2[i9] = Math.min(1.0f, (j10 / 200.0f) + f15);
            } else if (f14 < f15) {
                fArr2[i9] = Math.max(0.0f, f15 - (j10 / 200.0f));
            } else {
                i9++;
            }
            z11 = true;
            i9++;
        }
        if (z11) {
            this.i.postInvalidateOnAnimation();
        }
    }
}
