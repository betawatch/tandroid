package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.c0;
import c8.ha;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.vy;
import tg.f0;
import ug.w0;
import ug.y0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                c0 c0Var = (c0) this.c;
                c0Var.b(k6.r1(0.65f, k6.w0(k6.d6, (f6) this.b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 2:
            default:
                super.dispatchDraw(canvas);
                break;
            case 3:
                ((y0) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = g0.P;
                rectF.set(0.0f, g0.L(2.0f), getMeasuredWidth(), g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                y0 y0Var = (y0) this.b;
                y0Var.f.setAlpha(((w0) this.c).B1);
                canvas.drawRoundRect(rectF, g0.L(24.0f) - 1, g0.L(24.0f) - 1, y0Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        switch (this.a) {
            case 2:
                Path path = (Path) this.b;
                f0 f0Var = (f0) this.c;
                if (f0Var.h == null || (!((z9 = f0Var.f) && view == f0Var.d) && (z9 || view != f0Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth = ((z9 ? f0Var.e : 1.0f - f0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                ((j) this.c).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 3:
                super.onMeasure(i7, q.B(2.0f, ((w0) this.c).q1, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                c0 c0Var = (c0) this.c;
                c0Var.setBounds(0, 0, i7, i10);
                c0Var.c(0, g0.L(24.0f) + getPaddingBottom());
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                d dVar = jVar.r;
                boolean onTouchEvent = ((GestureDetector) ((vy) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    g0.i3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    g0.r(dVar);
                    if (!jVar.h) {
                        r1.h hVar = jVar.c.m;
                        if (((float) hVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.14748365E9f;
                        }
                        hVar.i = j.a(displayMetrics, f10);
                        jVar.d.m.i = j.b(getResources().getDisplayMetrics(), (float) jVar.d.m.i);
                        jVar.c.h();
                        jVar.d.h();
                    }
                    jVar.n = false;
                    jVar.f = false;
                    jVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationX(f10);
                ((j) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f10);
                ((j) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i7, Context context, f6 f6Var) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 4:
                super(context);
                LinearLayout f10 = k5.f(context, 1);
                j6 j6Var = new j6(context, false, false, false);
                this.b = j6Var;
                int i10 = k6.G6;
                r6.Z(j6Var, i10, f6Var);
                j6Var.setTextSize(g0.L(17.0f));
                j6Var.setTypeface(g0.o());
                f10.addView(j6Var, ha.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                r6.V(textView, i10, f6Var);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, ha.r(-2, -2, 1));
                addView(f10, ha.e(-2, -2, 17));
                break;
            default:
                this.c = new c0(8);
                this.b = f6Var;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f0 f0Var, Context context) {
        super(context);
        this.a = 2;
        this.c = f0Var;
        this.b = new Path();
    }
}
