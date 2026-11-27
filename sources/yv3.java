// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yv3 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;
    public final Object n;
    public final Object r;
    public Object s;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv3(sea seaVar, Activity activity, vnb vnbVar) {
        super(activity);
        this.w = seaVar;
        LinearLayout linearLayout = new LinearLayout(activity);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(aob.a0(aob.v0(aob.i6, vnbVar), 20, 20, 6, 6));
        iye.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, tre.d(-1, -1.0f, jn7.D1, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.lf, vnbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, tre.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, tre.t(-2, -1, jn7.z1, 6, 0, 0, 0));
        this.n = new de0[3];
        for (int i = 2; i >= 0; i--) {
            ((de0[]) this.n)[i] = new de0(activity);
            ((de0[]) this.n)[i].setRoundRadius(hl.L(6.0f));
            ((de0[]) this.n)[i].setVisibility(8);
            int i2 = 32 - (i << 2);
            ((FrameLayout) this.h).addView(((de0[]) this.n)[i], tre.d(i2, i2, 19, i * 12, 0.0f, 0.0f, 0.0f));
        }
        de0 de0Var = new de0(activity);
        this.r = de0Var;
        de0Var.setRoundRadius(hl.L(4.0f));
        de0Var.setVisibility(8);
        ((LinearLayout) this.b).addView(de0Var, tre.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        ((LinearLayout) this.b).addView(frameLayout2, tre.p(0, -1, 1.0f, jn7.D1));
        ema emaVar = new ema(activity);
        this.d = emaVar;
        emaVar.setTextSize(14);
        emaVar.setTypeface(hl.o());
        yob.W(emaVar, aob.nf, vnbVar);
        frameLayout2.addView(emaVar, tre.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        ema emaVar2 = new ema(activity);
        this.e = emaVar2;
        emaVar2.setTextSize(14);
        int i3 = aob.Ol;
        yob.W(emaVar2, i3, vnbVar);
        frameLayout2.addView(emaVar2, tre.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ema emaVar3 = new ema(activity);
        this.f = emaVar3;
        emaVar3.setTextSize(14);
        yob.W(emaVar3, i3, vnbVar);
        emaVar3.setAlpha(0.0f);
        frameLayout2.addView(emaVar3, tre.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(activity);
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        yob.s(imageView2, aob.Nl, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), 1, hl.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new jn8(this, (byte) 26));
        ((LinearLayout) this.b).addView(imageView2, tre.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.b;
                int i = aob.h5;
                zw3 zw3Var = (zw3) this.w;
                ir1 ir1Var = zw3Var.p1;
                paint2.setColor(aob.v0(i, zw3Var.J0));
                paint2.setAlpha((int) ((((Bitmap) this.e) == null ? 1.0f : 0.85f) * 255.0f));
                View[] viewPages = ir1Var.getViewPages();
                zw3Var.x1 = 0.0f;
                for (View view : viewPages) {
                    if (view instanceof iw3) {
                        iw3 iw3Var = (iw3) view;
                        zw3Var.x1 = (Utilities.i(1.0f - Math.abs(iw3Var.getTranslationX() / iw3Var.getMeasuredWidth()), 1.0f, 0.0f) * iw3Var.b()) + zw3Var.x1;
                        if (iw3Var.getVisibility() == 0) {
                            iw3Var.c();
                        }
                    }
                }
                boolean z = false;
                float e = ((mm) this.n).e(false, zw3Var.x1 <= 0.0f ? 1.0f : 0.0f);
                float paddingTop = (zw3Var.x1 + ir1Var.getPaddingTop()) - hl.U1(e, hl.L(8.0f), ir1Var.getPaddingTop());
                RectF rectF2 = hl.P;
                rectF2.set(zw3Var.u0, paddingTop, getWidth() - zw3Var.u0, hl.L(8.0f) + getHeight());
                if (((Bitmap) this.e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, hl.L(14.0f), hl.L(14.0f), (Paint) this.c);
                }
                boolean z2 = rectF2.top < ((float) hl.m);
                Boolean bool = (Boolean) this.s;
                if (bool == null || bool.booleanValue() != z2) {
                    this.s = Boolean.valueOf(z2);
                    Window window = zw3Var.getWindow();
                    if (z2 && hl.B(paint2.getColor()) >= 0.721f) {
                        z = true;
                    }
                    hl.n3(window, z);
                }
                float f = 1.0f - e;
                canvas.drawRoundRect(rectF2, hl.L(14.0f) * f, hl.L(14.0f) * f, paint2);
                rectF.set((getWidth() - hl.L(36.0f)) / 2.0f, hl.L(9.66f) + paddingTop, (hl.L(36.0f) + getWidth()) / 2.0f, paddingTop + hl.L(13.66f));
                paint.setColor(1367573379);
                paint.setAlpha((int) (f * 81.0f));
                canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
                canvas.save();
                canvas.clipRect(rectF2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y = motionEvent.getY();
                    zw3 zw3Var = (zw3) this.w;
                    if (y < zw3Var.x1) {
                        zw3Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.c).setShader(null);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                zw3 zw3Var = (zw3) this.w;
                if (((Bitmap) this.e) == null) {
                    vnb vnbVar = zw3Var.J0;
                    if (vnbVar == null) {
                        if (!aob.I.o()) {
                        }
                    } else if (!vnbVar.a()) {
                    }
                    if (zw3Var.w1 != null && xea.o() > 0 && !i86.f()) {
                        Point point = hl.q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        ((qbb) zw3Var.w1.b).X(16.0f, createBitmap);
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.e = createBitmap;
                        Paint paint = (Paint) this.c;
                        Bitmap bitmap = (Bitmap) this.e;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f = bitmapShader;
                        paint.setShader(bitmapShader);
                        Matrix matrix = (Matrix) this.h;
                        if (matrix == null) {
                            matrix = new Matrix();
                            this.h = matrix;
                        }
                        matrix.postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float min = Math.min(size2 * 0.45f, (hl.L(350.0f) / 0.55f) * 0.45f);
                zw3 zw3Var = (zw3) this.w;
                zw3Var.r1 = min;
                ir1 ir1Var = zw3Var.p1;
                ir1Var.setPadding(0, hl.m, 0, 0);
                ir1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                yw3 yw3Var = zw3Var.q1;
                if (yw3Var != null) {
                    yw3Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f);
                invalidate();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv3(zw3 zw3Var, Context context) {
        super(context);
        this.w = zw3Var;
        this.b = new Paint(1);
        this.c = new Paint(3);
        this.d = new Paint(1);
        this.n = new mm(this, 0L, 250L, k43.h);
        this.r = new RectF();
    }
}
