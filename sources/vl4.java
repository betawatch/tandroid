// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vl4 extends View {
    public final /* synthetic */ byte a = 4;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(xl4 xl4Var, Activity activity) {
        super(activity);
        this.d = xl4Var;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(hl.L(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(hl.L(2.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        a aVar;
        int textColor;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                int[] iArr = (int[]) obj;
                tb tbVar = (tb) this.c;
                x85 x85Var = (x85) this.d;
                Matrix matrix = x85Var.f;
                if (x85Var.h <= 0.0f || x85Var.d == null) {
                    canvas2 = canvas;
                } else {
                    matrix.reset();
                    float width = getWidth() / x85Var.c.getWidth();
                    matrix.postScale(width, width);
                    x85Var.e.setLocalMatrix(matrix);
                    x85Var.d.setAlpha((int) (x85Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), x85Var.d);
                }
                if (!tbVar.isAttachedToWindow() || tbVar.getAlpha() <= 0.5f) {
                    x85Var.dismiss();
                } else {
                    tbVar.getLocationInWindow(iArr);
                }
                canvas2.save();
                canvas2.translate(iArr[0] - ((1.0f - tbVar.getScaleX()) * tbVar.getMeasuredWidth()), iArr[1] - ((1.0f - tbVar.getScaleY()) * tbVar.getMeasuredHeight()));
                if (((qc) tbVar.b).a(canvas2, tbVar.getMeasuredWidth(), x85Var.h)) {
                    invalidate();
                }
                canvas2.restore();
                break;
            case 2:
                super.dispatchDraw(canvas);
                int L = hl.L(48.0f);
                rc5 rc5Var = (rc5) this.d;
                int i = L + ((int) rc5Var.b.f);
                Paint paint = (Paint) obj;
                paint.setColor(rc5Var.getThemedColor(aob.s8));
                RectF rectF = (RectF) this.c;
                float measuredWidth = getMeasuredWidth();
                aVar = ((e) rc5Var).actionBar;
                rectF.set(0.0f, 0.0f, measuredWidth, aVar.getMeasuredHeight() + i);
                rc5Var.m0(canvas, rectF, paint);
                break;
            case 3:
            case 4:
            default:
                super.dispatchDraw(canvas);
                break;
            case 5:
                g1c g1cVar = (g1c) this.d;
                hn hnVar = g1cVar.e;
                float i2 = hnVar.i();
                if (i2 > 0.0f) {
                    float R1 = hl.R1(0.6f, 1.0f, i2);
                    float max = Math.max(hl.L(16.66f), hnVar.c() + hl.L(10.0f));
                    RectF rectF2 = hl.P;
                    rectF2.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
                    float L2 = hl.L(8.33f);
                    float L3 = hl.L(8.33f);
                    sm smVar = (sm) obj;
                    smVar.setColor(smVar.b.a(aob.v0(g1cVar.J, smVar.a), false));
                    textColor = g1cVar.getTextColor();
                    smVar.setColor(vm2.f(g1cVar.G, smVar.getColor(), textColor));
                    smVar.setAlpha((int) (smVar.getAlpha() * i2));
                    canvas.drawRoundRect(rectF2, L2, L3, smVar);
                    hnVar.p(rectF2);
                    hnVar.C = (int) (i2 * 255.0f);
                    hnVar.u(aob.v0(aob.W8, (vnb) this.c));
                    hnVar.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 6:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((kr4) this.c);
                break;
            case 7:
                super.onAttachedToWindow();
                if (((ry8) this.c) != null) {
                    postDelayed((olc) this.d, 200L);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((kr4) this.c);
                }
                this.d = null;
                break;
            case 7:
                super.onDetachedFromWindow();
                olc olcVar = (olc) this.d;
                removeCallbacks(olcVar);
                olcVar.run();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int width = getWidth();
                float L = hl.L(10.0f);
                float L2 = (width - L) - hl.L(10.0f);
                float height = getHeight() - hl.L(8.0f);
                xl4 xl4Var = (xl4) this.d;
                float f2 = xl4Var.M;
                if (f2 != 0.0f) {
                    f = L;
                    canvas.drawLine(f, height, (f2 * L2) + L, height, (Paint) this.c);
                } else {
                    f = L;
                }
                canvas.drawLine(f, height, (L2 * xl4Var.L) + f, height, (Paint) obj);
                return;
            case 1:
            case 2:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                float L3 = hl.L(10.0f);
                float f3 = L3 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f3;
                float measuredHeight = getMeasuredHeight() - f3;
                canvas.save();
                RectF rectF = hl.P;
                float f4 = L3 + measuredWidth;
                rectF.set(L3, L3, f4, f4);
                rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
                float f5 = measuredWidth / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
                canvas.clipPath(path);
                int L4 = hl.L(10.0f);
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                float f6 = L4;
                int width2 = ((int) (rectF.width() / f6)) + 1;
                int height2 = ((int) (rectF.height() / f6)) + 1;
                for (int i = 0; i < height2; i++) {
                    canvas.save();
                    for (int i2 = 0; i2 < width2; i2++) {
                        int i3 = i2 % 2;
                        if ((i3 == 0 && i % 2 == 0) || (i3 != 0 && i % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f6, f6, (Paint) obj);
                        }
                        canvas.translate(f6, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f6);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 4:
                super.onDraw(canvas);
                float f7 = ((fm0) obj).e;
                br3.b(canvas, (Drawable) this.c, 1.0f - f7);
                br3.b(canvas, (Drawable) this.d, f7);
                return;
            case 6:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((r89) obj).iterator();
                    while (it.hasNext()) {
                        ((my4) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 7:
                sy8 sy8Var = (sy8) obj;
                sy8Var.e(canvas, 0.0f, 0.0f, getWidth());
                if (sy8Var.o < 1.0f || sy8Var.l > 0) {
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(hl.L(16.66f), ((g1c) this.d).e.d + hl.L(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i, i2, i3, i4);
                float f = i / 2.0f;
                float f2 = i2 / 2.0f;
                br3.d((Drawable) this.c, f, f2, 17);
                br3.d((Drawable) this.d, f, f2, 17);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 3:
                super.setAlpha(f);
                ((PhotoViewer) this.d).h0.invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 5:
                return ((g1c) this.d).e == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public vl4(Activity activity) {
        super(activity);
        this.b = new fm0(320L, this, k43.h);
        this.c = activity.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.d = activity.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(rc5 rc5Var, Context context) {
        super(context);
        this.d = rc5Var;
        this.c = new RectF();
        this.b = new Paint(1);
    }

    public vl4(Context context) {
        super(context);
        this.b = new r89(0, false);
        this.c = new kr4(this, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(g1c g1cVar, Context context, vnb vnbVar) {
        super(context);
        this.d = g1cVar;
        this.c = vnbVar;
        this.b = new sm(this, vnbVar);
        g1cVar.e.setCallback(this);
    }

    public vl4(Context context, ry8 ry8Var) {
        super(context);
        sy8 sy8Var = new sy8();
        this.b = sy8Var;
        this.d = new olc(this, (byte) 8);
        if (sy8Var.y != -16777216 || sy8Var.z == null) {
            sy8Var.y = -16777216;
            sy8Var.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = ry8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(x85 x85Var, LaunchActivity launchActivity, tb tbVar) {
        super(launchActivity);
        this.d = x85Var;
        this.c = tbVar;
        this.b = new int[2];
    }
}
