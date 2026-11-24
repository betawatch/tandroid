// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yt5 extends View {
    public final int[] E;
    public final int[] F;
    public final /* synthetic */ bu5 G;
    public final Bitmap a;
    public final Paint b;
    public Bitmap c;
    public final Paint d;
    public final float e;
    public final float f;
    public final int h;
    public final Path n;
    public final RectF r;
    public float s;
    public float w;
    public float x;
    public final Path y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt5(bu5 bu5Var, Context context) {
        super(context);
        float f;
        this.G = bu5Var;
        this.n = new Path();
        this.r = new RectF();
        this.y = new Path();
        this.E = new int[2];
        this.F = new int[2];
        View view = bu5Var.f;
        Rect rect = bu5Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (bu5Var.L) {
                f = Math.min(gm.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f = 0.0f;
            }
            this.f = f;
        }
        byte b = 0;
        this.h = on2.p(0, bu5Var.s);
        if (bu5Var.t && (view instanceof w8c) && (bu5Var.c instanceof ProfileActivity)) {
            this.b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.b = null;
            this.a = null;
        }
        if (bu5Var.u || bu5Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = bu5Var.b;
            vt4 vt4Var = new vt4((Object) this, (byte) 12);
            if (viewGroup == null) {
                vs9.d(vt4Var);
            } else {
                int i = vs9.P;
                gm.j2(new ts9(viewGroup, vt4Var, b), 15.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        float f;
        char c;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float width;
        int height;
        int[] iArr2;
        float f7;
        float f8;
        int[] iArr3;
        int[] iArr4;
        yt5 yt5Var;
        Canvas canvas2 = canvas;
        bu5 bu5Var = this.G;
        float[] fArr = bu5Var.o;
        View view = bu5Var.f;
        Rect rect = bu5Var.z;
        super.onDraw(canvas);
        float f9 = 0.0f;
        if (this.c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.c.getWidth(), getHeight() / this.c.getHeight());
            canvas2.scale(max, max);
            int i = (int) (this.x * 255.0f);
            Paint paint = this.d;
            paint.setAlpha(i);
            canvas2.drawBitmap(this.c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(cmb.p1(this.x, this.h));
        }
        if (bu5Var.t) {
            float f10 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            char c2 = 0;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f10 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f10 * (bu5Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (bu5Var.L) {
                    bu5.B(view, bu5Var.b, fArr);
                    canvas2.translate(gm.R1(fArr[0], this.s, this.x), gm.R1(fArr[1], this.w, this.x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = bu5Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || bu5Var.g.getIntrinsicHeight() <= 0) {
                        bu5Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        bu5Var.g.setBounds((((view.getWidth() + rect.right) - bu5Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - bu5Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((bu5Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((bu5Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    bu5Var.g.draw(canvas2);
                }
                if (bu5Var.k > 0 || bu5Var.l > 0) {
                    path.rewind();
                    RectF rectF = gm.P;
                    float f11 = -rect.left;
                    float f12 = bu5Var.k;
                    rectF.set((this.x * f12) + f11, (getAlpha() * f12) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * bu5Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * bu5Var.k));
                    float f13 = bu5Var.l * this.x;
                    path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.b;
                paint2.setAlpha(nm7.d4);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
                return;
            }
            if (view == 0 || !(view.getParent() instanceof View)) {
                return;
            }
            canvas2.save();
            ArrayList arrayList = bu5Var.P;
            int[] iArr5 = this.F;
            int[] iArr6 = this.E;
            if (arrayList != null) {
                Path path2 = this.y;
                path2.rewind();
                getLocationInWindow(iArr5);
                ArrayList arrayList2 = bu5Var.P;
                f = 255.0f;
                int size = arrayList2.size();
                c = 1;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    View view2 = (View) obj;
                    if (view2.isShown() && view2.getAlpha() > f9) {
                        view2.getLocationInWindow(iArr6);
                        ((zt5) view2).e(new xt5(this, iArr6[c2] - iArr5[c2], iArr6[1] - iArr5[1], (byte) 0));
                        arrayList2 = arrayList2;
                        iArr5 = iArr5;
                        f9 = f9;
                        c2 = 0;
                    }
                }
                iArr = iArr5;
                if (!path2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path2);
                    } else {
                        canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    }
                }
            } else {
                iArr = iArr5;
                f = 255.0f;
                c = 1;
                float f14 = this.f;
                if (f10 < 1.0f || f14 != 0.0f) {
                    if (bu5Var.L) {
                        canvas2.clipRect(-rect.left, gm.R1((((-rect.top) + fArr[1]) - (f10 * (bu5Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, 0.0f, this.x), getMeasuredWidth() + rect.right, kt6.B(1.0f, this.x, f14, getMeasuredHeight() + rect.bottom));
                    } else {
                        float f15 = -rect.left;
                        float f16 = (-rect.top) + fArr[1];
                        if (bu5Var.u) {
                            f2 = 1.0f;
                            f3 = 1.0f - this.x;
                        } else {
                            f2 = 1.0f;
                            f3 = 1.0f;
                        }
                        canvas2.clipRect(f15, (f16 - (f10 * f3)) + f2, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                    }
                }
            }
            float f17 = this.x;
            if (bu5Var.L) {
                bu5.B(view, bu5Var.b, fArr);
                f4 = gm.R1(fArr[0], this.s, f17);
                f5 = gm.R1(fArr[c], this.w, f17);
                float R1 = gm.R1(1.0f, bu5Var.R, f17);
                canvas2.translate(f4, f5);
                if (R1 != 1.0f) {
                    canvas2.scale(R1, R1, view.getWidth() / 2.0f, 0.0f);
                }
                f6 = R1;
            } else {
                f4 = fArr[0];
                f5 = fArr[c];
                canvas2.translate(f4, f5);
                f6 = 1.0f;
            }
            float f18 = f5;
            float f19 = f4;
            if (bu5Var.N == 0 || bu5Var.O == 0) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = gm.U1(f17, view.getWidth(), bu5Var.N);
                height = gm.U1(f17, view.getHeight(), bu5Var.O);
            }
            float f20 = height;
            float f21 = width;
            Drawable drawable2 = bu5Var.g;
            if (drawable2 != null) {
                if (drawable2.getIntrinsicWidth() <= 0 || bu5Var.g.getIntrinsicHeight() <= 0) {
                    iArr2 = iArr6;
                    f7 = 2.0f;
                    f8 = f6;
                    bu5Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                } else {
                    f7 = 2.0f;
                    iArr2 = iArr6;
                    bu5Var.g.setBounds((((view.getWidth() + rect.right) - bu5Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - bu5Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((bu5Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((bu5Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    f8 = f6;
                }
                bu5Var.g.setAlpha((int) (this.x * f));
                if (Build.VERSION.SDK_INT >= 29) {
                    Drawable drawable3 = bu5Var.g;
                    if (drawable3 instanceof ShapeDrawable) {
                        Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                        paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), cmb.p1(this.x, bu5Var.h));
                    }
                }
                bu5Var.g.draw(canvas2);
            } else {
                iArr2 = iArr6;
                f7 = 2.0f;
                f8 = f6;
            }
            if (bu5Var.k > 0 || bu5Var.l > 0) {
                path.rewind();
                boolean z = view instanceof au5;
                RectF rectF2 = this.r;
                if (z) {
                    ((au5) view).e(rectF2);
                } else {
                    rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                }
                RectF rectF3 = gm.P;
                float f22 = -rect.left;
                float f23 = rectF2.left + f22;
                float f24 = bu5Var.k * this.x;
                float f25 = -rect.top;
                rectF3.set(f23 + f24, rectF2.top + f25 + f24, (f22 + rectF2.right) - f24, (f25 + rectF2.bottom) - f24);
                float f26 = bu5Var.l * this.x;
                path.addRoundRect(rectF3, f26, f26, Path.Direction.CW);
                canvas2.clipPath(path);
            }
            if (!(view instanceof sha)) {
                iArr3 = iArr;
                iArr4 = iArr2;
                if (!(view instanceof ox4) || bu5Var.N == 0 || bu5Var.O == 0) {
                    yt5Var = this;
                    if (bu5Var.L) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (yt5Var.x * f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    if (view instanceof au5) {
                        ((au5) view).g(canvas2, yt5Var.x);
                    } else {
                        canvas2.translate(-view.getScrollX(), -view.getScrollY());
                        view.draw(canvas2);
                    }
                    canvas2.restore();
                } else if (view.getAlpha() >= 1.0f) {
                    ((ox4) view).b(this, canvas, f21, f20, this.x);
                    canvas2 = canvas;
                    yt5Var = this;
                } else {
                    yt5Var = this;
                    canvas.saveLayerAlpha(0.0f, 0.0f, f21, f20, (int) (yt5Var.x * f), 31);
                    float R12 = gm.R1(1.0f, 0.9f, yt5Var.x);
                    canvas.scale(R12, R12, f21 / f7, f20 / f7);
                    ((ox4) view).b(yt5Var, canvas, f21, f20, yt5Var.x);
                    canvas.restore();
                    canvas2 = canvas;
                }
            } else if (view.getAlpha() >= 1.0f) {
                ((sha) view).a(canvas2, f21, f20, this.x);
                yt5Var = this;
                iArr3 = iArr;
                iArr4 = iArr2;
            } else {
                iArr3 = iArr;
                iArr4 = iArr2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, f21, f20, (int) (this.x * f), 31);
                float R13 = gm.R1(1.0f, 0.9f, this.x);
                canvas2.scale(R13, R13, f21 / f7, f20 / f7);
                ((sha) view).a(canvas2, f21, f20, this.x);
                canvas2.restore();
                yt5Var = this;
            }
            float f27 = 1.0f - yt5Var.x;
            ArrayList arrayList3 = bu5Var.Q;
            if (arrayList3 != null && !arrayList3.isEmpty() && f27 > 0.0f) {
                yt5Var.getLocationInWindow(iArr3);
                canvas2.save();
                canvas2.clipRect(0, 0, view.getWidth(), view.getHeight());
                float f28 = 1.0f / f8;
                canvas2.scale(f28, f28, view.getWidth() / f7, 0.0f);
                canvas2.translate(-f19, -f18);
                ArrayList arrayList4 = bu5Var.Q;
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    int i4 = i3 + 1;
                    View view3 = (View) arrayList4.get(i3);
                    if (view3.isShown() && view3.getAlpha() > 0.0f) {
                        view3.getLocationInWindow(iArr4);
                        canvas2.save();
                        canvas2.translate(iArr4[0] - iArr3[0], iArr4[c] - iArr3[c]);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, view3.getWidth(), view3.getHeight(), (int) (view3.getAlpha() * f27 * f));
                        view3.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                    i3 = i4;
                }
                canvas2.restore();
            }
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        bu5 bu5Var = this.G;
        tl0.c(bu5Var.n, this);
        ViewGroup viewGroup = bu5Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f) {
        if (this.x == f) {
            return;
        }
        this.x = f;
        invalidate();
    }
}
