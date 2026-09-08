package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class yu0 {
    public final View i;
    public boolean p;
    public final org.telegram.ui.Components.oq q;
    public final org.telegram.ui.Components.fg0 r;
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

    public yu0(PhotoViewer photoViewer, View view) {
        this.s = photoViewer;
        if (PhotoViewer.W8 == null) {
            PhotoViewer.W8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.X8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.X8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.X8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.X8.setColor(-1);
        }
        this.i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i10 >= fArr.length) {
                a();
                org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(28);
                this.r = fg0Var;
                fg0Var.h = 200;
                this.q = new org.telegram.ui.Components.oq(photoViewer.y.getDrawable(R.drawable.circle_big).mutate(), fg0Var);
                return;
            }
            this.m[i10] = 1.0f;
            fArr[i10] = 1.0f;
            i10++;
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i10 >= fArr.length) {
                z10 = true;
                break;
            } else {
                if (fArr[i10] != 1.0f) {
                    z10 = false;
                    break;
                }
                i10++;
            }
        }
        if (z10 != this.p) {
            this.p = z10;
            ws0 ws0Var = (ws0) this;
            PhotoViewer photoViewer = ws0Var.t;
            if (ws0Var == photoViewer.W0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.s;
        float f7 = ((i10 + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) - ((int) (this.j * this.o))) / 2;
        photoViewer.getClass();
        int i11 = (int) (f7 + 0.0f);
        return photoViewer.c2 == 1 ? i11 - AndroidUtilities.dp(38.0f) : i11;
    }

    public final void c(Canvas canvas) {
        int i10;
        float f7 = this.j;
        int i11 = (int) (this.o * f7);
        int width = (this.s.e0.getWidth() - ((int) (f7 * this.o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f10 = 1.0f;
        while (true) {
            float[] fArr = this.m;
            if (i12 >= fArr.length) {
                break;
            }
            f10 = i12 == 2 ? AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i12]) * f10 : f10 * fArr[i12];
            i12++;
        }
        int i13 = this.k;
        Drawable drawable = this.q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.T8;
            if (i13 < drawableArr.length + 2) {
                Drawable drawable2 = i13 < drawableArr.length ? drawableArr[i13] : drawable;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.l * 255.0f * f10));
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.T8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable = drawableArr2[i14];
                }
                if (drawable != null) {
                    if (this.k != -2) {
                        drawable.setAlpha((int) org.telegram.messenger.w1.A(1.0f, this.l, 255.0f, f10));
                    } else {
                        drawable.setAlpha((int) (f10 * 255.0f));
                    }
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.k != -2) {
            PhotoViewer.X8.setAlpha((int) (this.l * 255.0f * f10));
        } else {
            PhotoViewer.X8.setAlpha((int) (f10 * 255.0f));
        }
        RectF rectF = this.g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), false, PhotoViewer.X8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.i;
        org.telegram.ui.Components.fg0 fg0Var = this.r;
        if (fg0Var != null) {
            boolean z12 = z11 && (i12 == 3 || i12 == 4);
            if (i10 == 3) {
                fg0Var.a(false, z12);
            } else if (i10 == 4) {
                fg0Var.a(true, z12);
            }
            fg0Var.f = view;
            fg0Var.invalidateSelf();
        }
        this.a = System.currentTimeMillis();
        if (!z10 || (i11 = this.h) == i10) {
            this.k = -2;
        } else {
            this.k = i11;
            this.l = 1.0f;
        }
        this.h = i10;
        ws0 ws0Var = (ws0) this;
        PhotoViewer photoViewer = ws0Var.t;
        if (ws0Var == photoViewer.W0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f7, boolean z10) {
        float[] fArr = this.n;
        if (fArr[i10] != f7) {
            fArr[i10] = f7;
            if (!z10) {
                this.m[i10] = f7;
            }
            a();
            this.i.invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        if (z10) {
            this.d = this.f;
        } else {
            this.f = f7;
            this.d = f7;
        }
        this.c = f7;
        this.e = 0L;
        this.i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.a = currentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f == 1.0f && this.c == 1.0f) {
                z11 = false;
            } else {
                this.b = ((360 * j3) / 3000.0f) + this.b;
                float f7 = this.c - this.d;
                if (Math.abs(f7) > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        float f10 = this.c;
                        this.f = f10;
                        this.d = f10;
                        this.e = 0L;
                    } else {
                        this.f = (PhotoViewer.W8.getInterpolation(j10 / 300.0f) * f7) + this.d;
                    }
                }
                z11 = true;
            }
            float f11 = this.l;
            if (f11 > 0.0f && this.k != -2) {
                float f12 = f11 - (j3 / 200.0f);
                this.l = f12;
                if (f12 <= 0.0f) {
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
            if (i10 >= fArr.length) {
                break;
            }
            float f13 = fArr[i10];
            float[] fArr2 = this.m;
            float f14 = fArr2[i10];
            if (f13 > f14) {
                fArr2[i10] = Math.min(1.0f, (j3 / 200.0f) + f14);
            } else if (f13 < f14) {
                fArr2[i10] = Math.max(0.0f, f14 - (j3 / 200.0f));
            } else {
                i10++;
            }
            z11 = true;
            i10++;
        }
        if (z11) {
            this.i.postInvalidateOnAnimation();
        }
    }
}
