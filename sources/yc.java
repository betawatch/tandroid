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
import android.os.SystemClock;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yc extends View {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(tl4 tl4Var, Activity activity) {
        super(activity);
        this.d = tl4Var;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gm.L(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gm.L(2.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        a aVar;
        int textColor;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                int[] iArr = (int[]) obj;
                sb sbVar = (sb) this.c;
                t85 t85Var = (t85) this.d;
                Matrix matrix = t85Var.f;
                if (t85Var.h <= 0.0f || t85Var.d == null) {
                    canvas2 = canvas;
                } else {
                    matrix.reset();
                    float width = getWidth() / t85Var.c.getWidth();
                    matrix.postScale(width, width);
                    t85Var.e.setLocalMatrix(matrix);
                    t85Var.d.setAlpha((int) (t85Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t85Var.d);
                }
                if (!sbVar.isAttachedToWindow() || sbVar.getAlpha() <= 0.5f) {
                    t85Var.dismiss();
                } else {
                    sbVar.getLocationInWindow(iArr);
                }
                canvas2.save();
                canvas2.translate(iArr[0] - ((1.0f - sbVar.getScaleX()) * sbVar.getMeasuredWidth()), iArr[1] - ((1.0f - sbVar.getScaleY()) * sbVar.getMeasuredHeight()));
                if (((pd) sbVar.b).a(canvas2, sbVar.getMeasuredWidth(), t85Var.h)) {
                    invalidate();
                }
                canvas2.restore();
                break;
            case 3:
                super.dispatchDraw(canvas);
                int L = gm.L(48.0f);
                oc5 oc5Var = (oc5) this.d;
                int i = L + ((int) oc5Var.b.f);
                Paint paint = (Paint) obj;
                paint.setColor(oc5Var.getThemedColor(cmb.r8));
                RectF rectF = (RectF) this.c;
                float measuredWidth = getMeasuredWidth();
                aVar = ((d) oc5Var).actionBar;
                rectF.set(0.0f, 0.0f, measuredWidth, aVar.getMeasuredHeight() + i);
                oc5Var.n0(canvas, rectF, paint);
                break;
            case 4:
            case 5:
            default:
                super.dispatchDraw(canvas);
                break;
            case 6:
                hzb hzbVar = (hzb) this.d;
                ho hoVar = hzbVar.e;
                float i2 = hoVar.i();
                if (i2 > 0.0f) {
                    float R1 = gm.R1(0.6f, 1.0f, i2);
                    float max = Math.max(gm.L(16.66f), hoVar.c() + gm.L(10.0f));
                    RectF rectF2 = gm.P;
                    rectF2.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
                    float L2 = gm.L(8.33f);
                    float L3 = gm.L(8.33f);
                    rn rnVar = (rn) obj;
                    rnVar.setColor(rnVar.b.a(cmb.v0(hzbVar.J, rnVar.a), false));
                    textColor = hzbVar.getTextColor();
                    rnVar.setColor(on2.f(hzbVar.G, rnVar.getColor(), textColor));
                    rnVar.setAlpha((int) (rnVar.getAlpha() * i2));
                    canvas.drawRoundRect(rectF2, L2, L3, rnVar);
                    hoVar.p(rectF2);
                    hoVar.C = (int) (i2 * 255.0f);
                    hoVar.u(cmb.v0(cmb.V8, (ylb) this.c));
                    hoVar.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((hr4) this.c);
                break;
            case 8:
                super.onAttachedToWindow();
                if (((hx8) this.c) != null) {
                    postDelayed((f8c) this.d, 200L);
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
            case 7:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((hr4) this.c);
                }
                this.d = null;
                break;
            case 8:
                super.onDetachedFromWindow();
                f8c f8cVar = (f8c) this.d;
                removeCallbacks(f8cVar);
                f8cVar.run();
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
                RectF rectF = (RectF) this.c;
                Paint paint = (Paint) obj;
                paint.setColor(cmb.p1((((((float) Math.sin(SystemClock.elapsedRealtime() / 220.0d)) * 0.5f) + 0.5f) * 0.05f) + 0.06f, cmb.v0(cmb.D8, ((ad) this.d).d)));
                float width = jb6.a0 ? getWidth() - gm.L(16.0f) : gm.L(16.0f);
                float f2 = jb6.a0 ? -1.0f : 1.0f;
                rectF.set(Math.min(width, (gm.L(110.0f) * f2) + width), gm.L(11.0f), Math.max(width, (gm.L(110.0f) * f2) + width), gm.L(23.0f));
                canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
                rectF.set(Math.min(width, (gm.L(170.0f) * f2) + width), gm.L(32.0f), Math.max(width, (f2 * gm.L(170.0f)) + width), gm.L(42.0f));
                canvas.drawRoundRect(rectF, gm.L(5.0f), gm.L(5.0f), paint);
                invalidate();
                return;
            case 1:
                int width2 = getWidth();
                float L = gm.L(10.0f);
                float L2 = (width2 - L) - gm.L(10.0f);
                float height = getHeight() - gm.L(8.0f);
                tl4 tl4Var = (tl4) this.d;
                float f3 = tl4Var.J;
                if (f3 != 0.0f) {
                    f = L;
                    canvas.drawLine(f, height, (f3 * L2) + L, height, (Paint) this.c);
                } else {
                    f = L;
                }
                canvas.drawLine(f, height, (L2 * tl4Var.I) + f, height, (Paint) obj);
                return;
            case 2:
            case 3:
            case 6:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                float L3 = gm.L(10.0f);
                float f4 = L3 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f4;
                float measuredHeight = getMeasuredHeight() - f4;
                canvas.save();
                RectF rectF2 = gm.P;
                float f5 = L3 + measuredWidth;
                rectF2.set(L3, L3, f5, f5);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f6 = measuredWidth / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF2, f6, f6, Path.Direction.CW);
                canvas.clipPath(path);
                int L4 = gm.L(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f7 = L4;
                int width3 = ((int) (rectF2.width() / f7)) + 1;
                int height2 = ((int) (rectF2.height() / f7)) + 1;
                for (int i = 0; i < height2; i++) {
                    canvas.save();
                    for (int i2 = 0; i2 < width3; i2++) {
                        int i3 = i2 % 2;
                        if ((i3 == 0 && i % 2 == 0) || (i3 != 0 && i % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f7, f7, (Paint) obj);
                        }
                        canvas.translate(f7, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f7);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 5:
                super.onDraw(canvas);
                float f8 = ((fn0) obj).e;
                ur3.b(canvas, (Drawable) this.c, 1.0f - f8);
                ur3.b(canvas, (Drawable) this.d, f8);
                return;
            case 7:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((g79) obj).iterator();
                    while (it.hasNext()) {
                        ((jy4) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 8:
                ix8 ix8Var = (ix8) obj;
                ix8Var.e(canvas, 0.0f, 0.0f, getWidth());
                if (ix8Var.o < 1.0f || ix8Var.l > 0) {
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(gm.L(16.66f), ((hzb) this.d).e.d + gm.L(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 5:
                super.onSizeChanged(i, i2, i3, i4);
                float f = i / 2.0f;
                float f2 = i2 / 2.0f;
                ur3.d((Drawable) this.c, f, f2, 17);
                ur3.d((Drawable) this.d, f, f2, 17);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 4:
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
            case 6:
                return ((hzb) this.d).e == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public yc(Activity activity) {
        super(activity);
        this.b = new fn0(320L, this, d53.h);
        this.c = activity.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.d = activity.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(ad adVar, Context context) {
        super(context);
        this.d = adVar;
        this.b = new Paint(1);
        this.c = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(oc5 oc5Var, Context context) {
        super(context);
        this.d = oc5Var;
        this.c = new RectF();
        this.b = new Paint(1);
    }

    public yc(Context context) {
        super(context);
        this.b = new g79(0, false);
        this.c = new hr4(this, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(hzb hzbVar, Context context, ylb ylbVar) {
        super(context);
        this.d = hzbVar;
        this.c = ylbVar;
        this.b = new rn(this, ylbVar);
        hzbVar.e.setCallback(this);
    }

    public yc(Context context, hx8 hx8Var) {
        super(context);
        ix8 ix8Var = new ix8();
        this.b = ix8Var;
        this.d = new f8c(this, (byte) 29);
        if (ix8Var.y != -16777216 || ix8Var.z == null) {
            ix8Var.y = -16777216;
            ix8Var.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = hx8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
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
    public yc(t85 t85Var, LaunchActivity launchActivity, sb sbVar) {
        super(launchActivity);
        this.d = t85Var;
        this.c = sbVar;
        this.b = new int[2];
    }
}
