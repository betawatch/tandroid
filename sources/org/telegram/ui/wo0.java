package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class wo0 {
    public final View i;
    public boolean p;
    public final org.telegram.ui.Components.mq q;
    public final org.telegram.ui.Components.ue0 r;
    public final /* synthetic */ PhotoViewer s;
    public final /* synthetic */ PhotoViewer t;
    public long a = 0;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f = 0.0f;
    public final RectF g = new RectF();
    public int h = -1;
    public final int j = org.telegram.messenger.g0.L(64.0f);
    public int k = -2;
    public float l = 1.0f;
    public final float[] m = new float[3];
    public final float[] n = new float[3];
    public float o = 1.0f;

    public wo0(PhotoViewer photoViewer, View view) {
        this.t = photoViewer;
        this.s = photoViewer;
        if (PhotoViewer.c9 == null) {
            PhotoViewer.c9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.d9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.d9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.d9.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.d9.setColor(-1);
        }
        this.i = view;
        int i7 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i7 >= fArr.length) {
                a();
                org.telegram.ui.Components.ue0 ue0Var = new org.telegram.ui.Components.ue0(28);
                this.r = ue0Var;
                ue0Var.h = org.telegram.messenger.ks.e3;
                this.q = new org.telegram.ui.Components.mq(photoViewer.E.getDrawable(R.drawable.circle_big).mutate(), ue0Var);
                return;
            }
            this.m[i7] = 1.0f;
            fArr[i7] = 1.0f;
            i7++;
        }
    }

    public final void a() {
        boolean z10;
        int i7 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i7 >= fArr.length) {
                z10 = true;
                break;
            } else {
                if (fArr[i7] != 1.0f) {
                    z10 = false;
                    break;
                }
                i7++;
            }
        }
        if (z10 != this.p) {
            this.p = z10;
            PhotoViewer photoViewer = this.t;
            if (this == photoViewer.X0[0]) {
                photoViewer.p3();
            }
        }
    }

    public final int b() {
        int i7 = org.telegram.messenger.g0.q.y;
        PhotoViewer photoViewer = this.s;
        float f10 = ((i7 + (!photoViewer.s ? org.telegram.messenger.g0.m : 0)) - ((int) (this.j * this.o))) / 2;
        photoViewer.getClass();
        int i10 = (int) (f10 + 0.0f);
        return photoViewer.d2 == 1 ? i10 - org.telegram.messenger.g0.L(38.0f) : i10;
    }

    public final void c(Canvas canvas) {
        int i7;
        float f10 = this.j;
        int i10 = (int) (this.o * f10);
        int width = (this.s.f0.getWidth() - ((int) (f10 * this.o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.m;
            if (i11 >= fArr.length) {
                break;
            }
            f11 = i11 == 2 ? org.telegram.messenger.g0.G.getInterpolation(fArr[i11]) * f11 : f11 * fArr[i11];
            i11++;
        }
        int i12 = this.k;
        Drawable drawable = this.q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Z8;
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
            Drawable[] drawableArr2 = PhotoViewer.Z8;
            if (i13 < drawableArr2.length + 2) {
                if (i13 < drawableArr2.length) {
                    drawable = drawableArr2[i13];
                }
                if (drawable != null) {
                    if (this.k != -2) {
                        drawable.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.l, 255.0f, f11));
                    } else {
                        drawable.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable.setBounds(width, b10, width + i10, b10 + i10);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i7 = this.k) != 0 && i7 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.k != -2) {
            PhotoViewer.d9.setAlpha((int) (this.l * 255.0f * f11));
        } else {
            PhotoViewer.d9.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), false, PhotoViewer.d9);
        g(true);
    }

    public final void d(int i7, boolean z10, boolean z11) {
        int i10;
        int i11 = this.h;
        if (i11 == i7) {
            return;
        }
        View view = this.i;
        org.telegram.ui.Components.ue0 ue0Var = this.r;
        if (ue0Var != null) {
            boolean z12 = z11 && (i11 == 3 || i11 == 4);
            if (i7 == 3) {
                ue0Var.a(false, z12);
            } else if (i7 == 4) {
                ue0Var.a(true, z12);
            }
            ue0Var.f = view;
            ue0Var.invalidateSelf();
        }
        this.a = System.currentTimeMillis();
        if (!z10 || (i10 = this.h) == i7) {
            this.k = -2;
        } else {
            this.k = i10;
            this.l = 1.0f;
        }
        this.h = i7;
        PhotoViewer photoViewer = this.t;
        if (this == photoViewer.X0[0]) {
            photoViewer.p3();
        }
        view.invalidate();
    }

    public final void e(int i7, float f10, boolean z10) {
        float[] fArr = this.n;
        if (fArr[i7] != f10) {
            fArr[i7] = f10;
            if (!z10) {
                this.m[i7] = f10;
            }
            a();
            this.i.invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
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
        long j3 = currentTimeMillis - this.a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.a = currentTimeMillis;
        int i7 = 0;
        if (z10) {
            if (this.f == 1.0f && this.c == 1.0f) {
                z11 = false;
            } else {
                this.b = ((360 * j3) / 3000.0f) + this.b;
                float f10 = this.c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        float f11 = this.c;
                        this.f = f11;
                        this.d = f11;
                        this.e = 0L;
                    } else {
                        this.f = (PhotoViewer.c9.getInterpolation(j10 / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.l;
            if (f12 > 0.0f && this.k != -2) {
                float f13 = f12 - (j3 / 200.0f);
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
            if (i7 >= fArr.length) {
                break;
            }
            float f14 = fArr[i7];
            float[] fArr2 = this.m;
            float f15 = fArr2[i7];
            if (f14 > f15) {
                fArr2[i7] = org.telegram.ui.Cells.c0.f(j3, 200.0f, f15, 1.0f);
            } else if (f14 < f15) {
                fArr2[i7] = org.telegram.ui.Cells.c0.B(j3, 200.0f, f15, 0.0f);
            } else {
                i7++;
            }
            z11 = true;
            i7++;
        }
        if (z11) {
            this.i.postInvalidateOnAnimation();
        }
    }
}
