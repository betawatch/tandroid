// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qw9 extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw9(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, qoe.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(gm.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, qoe.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
            default:
                break;
        }
    }

    public final void a(int i, CharSequence charSequence, boolean z) {
        ImageView imageView = (ImageView) this.b;
        if (z) {
            gm.L3(imageView, i);
        } else {
            imageView.setImageResource(i);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                tw9 tw9Var = (tw9) this.c;
                RectF rectF = tw9Var.S;
                if (view == tw9Var.O || view == tw9Var.y) {
                    canvas.save();
                    canvas.clipRect(0.0f, gm.R1(tw9Var.U, 0.0f, tw9Var.s), getWidth(), gm.R1(tw9Var.V, getHeight(), tw9Var.s));
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                if (view != tw9Var.Q) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                path.rewind();
                path.addCircle(rectF.centerX() + tw9Var.O.getX(), rectF.centerY() + tw9Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.clipRect(0.0f, gm.R1(tw9Var.U, 0.0f, tw9Var.s), getWidth(), gm.R1(tw9Var.V, getHeight(), tw9Var.s));
                canvas.translate(-tw9Var.Q.getX(), -tw9Var.Q.getY());
                canvas.translate(tw9Var.O.getX() + rectF.left, tw9Var.O.getY() + rectF.top);
                canvas.scale(rectF.width() / tw9Var.Q.getMeasuredWidth(), rectF.height() / tw9Var.Q.getMeasuredHeight(), tw9Var.Q.getX(), tw9Var.Q.getY());
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            case 1:
                if (view != ((vz9) this.c).i0 || !oi5.b || !oi5.f) {
                    return super.drawChild(canvas, view, j);
                }
                for (int i = 0; i < ((vz9) this.c).i0.getChildCount(); i++) {
                    View childAt = ((vz9) this.c).i0.getChildAt(i);
                    if (childAt instanceof fz9) {
                        fz9 fz9Var = (fz9) childAt;
                        if (fz9Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        } else if (fz9Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r5.centerX() - (fz9Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (fz9Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((fz9Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((fz9Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(fz9Var.getAnimatedScale(), fz9Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof az9) || (childAt instanceof zy9) || (childAt instanceof bz9)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j);
                        canvas.restore();
                    }
                }
                return false;
            case 7:
                goc gocVar = (goc) this.c;
                if (view != gocVar.v0 || !gocVar.G) {
                    return super.drawChild(canvas, view, j);
                }
                int save = canvas.save();
                canvas.concat(gocVar.J);
                boolean drawChild3 = super.drawChild(canvas, view, j);
                canvas.restoreToCount(save);
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 5:
                super.invalidate();
                k7 k7Var = ((rob) this.c).v0;
                if (k7Var != null) {
                    k7Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((cc) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((cc) this.b);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                int intrinsicHeight = cmb.h3.getIntrinsicHeight();
                cmb.h3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                cmb.h3.draw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(((rob) this.c).getThemedColor(cmb.Ie));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                break;
            case 5:
                int[] iArr = (int[]) this.b;
                rob robVar = (rob) this.c;
                if (!gm.D) {
                    getLocationInWindow(iArr);
                    if (robVar.u0.getTranslationY() != iArr[1]) {
                        robVar.u0.setTranslationY(-r9);
                        robVar.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < robVar.R) {
                        invalidate();
                        break;
                    }
                }
                break;
            case 6:
                canvas.save();
                xic xicVar = ((yic) this.c).b;
                canvas.scale(xicVar.getScaleX(), xicVar.getScaleY(), xicVar.getPivotX() + xicVar.getLeft(), xicVar.getPivotY() + xicVar.getTop());
                Drawable drawable = (Drawable) this.b;
                drawable.setBounds(xicVar.getLeft() - gm.L(2.0f), xicVar.getTop() - gm.L(2.0f), gm.L(2.0f) + xicVar.getRight(), gm.L(2.0f) + xicVar.getBottom());
                drawable.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float f;
        StaticLayout staticLayout;
        float f2;
        switch (this.a) {
            case 3:
                int size = View.MeasureSpec.getSize(i) - gm.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(gm.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f3 = size;
                    if (measureText > f3) {
                        textPaint.setTextSize(gm.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                f2 = 12.0f;
                                z = true;
                                i3 = 2;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else if (textPaint.measureText(split[i5]) > f3) {
                                staticLayout = null;
                                z = true;
                                f2 = 12.0f;
                                i3 = 2;
                            } else {
                                i5++;
                            }
                        }
                        if (staticLayout == null || staticLayout.getLineCount() > i3) {
                            f = Math.max(8.0f, (f3 * f2) / measureText);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i3;
                            f = 11.0f;
                        }
                    } else {
                        z = true;
                        i3 = 2;
                        i4 = 1;
                        f = 12.0f;
                    }
                    textView.setTextSize(z ? 1 : 0, f);
                    textView.setMaxLines(i4);
                    textView.setSingleLine(i4 == z ? z ? 1 : 0 : false);
                    textView.setLineSpacing(0.0f, i4 == i3 ? 0.85f : 1.0f);
                    if (i4 == i3) {
                        z = false;
                    }
                    textView.setIncludeFontPadding(z);
                    layoutParams.topMargin = gm.L(i4 == i3 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = gm.L(i4 == i3 ? 4.0f : 8.0f);
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw9(yic yicVar, Context context, Drawable drawable) {
        super(context);
        this.a = (byte) 6;
        this.c = yicVar;
        this.b = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw9(goc gocVar, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = gocVar;
        this.b = new cc(this, (byte) 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw9(vz9 vz9Var, Context context) {
        super(context);
        this.a = (byte) 1;
        this.c = vz9Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw9(rob robVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 5:
                this.c = robVar;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = robVar;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw9(tw9 tw9Var, Activity activity) {
        super(activity);
        this.a = (byte) 0;
        this.c = tw9Var;
        this.b = new Path();
    }
}
