// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zab extends FrameLayout {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zab(Context context) {
        super(context);
        this.a = (byte) 7;
        this.b = new Path();
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        ArrayList arrayList;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dbb dbbVar = (dbb) obj;
                bbb bbbVar = dbbVar.c;
                if (bbbVar != null && bbbVar.getEditField() != null) {
                    su3 su3Var = dbbVar.W;
                    if (su3Var != null && su3Var.h) {
                        float x = dbbVar.c.getEditField().getX() + dbbVar.c.getEditField().getPaddingLeft();
                        su3 su3Var2 = dbbVar.W;
                        dbbVar.d0 = x + su3Var2.n;
                        dbbVar.a0 = su3Var2.r;
                    } else if (dbbVar.b0 != null && dbbVar.c0 != null) {
                        dbbVar.d0 = dbbVar.c.getEditField().getX() + dbbVar.c.getEditField().getPaddingLeft() + gl.L(12.0f);
                    }
                }
                boolean z = (!dbbVar.s || dbbVar.w || (arrayList = dbbVar.x) == null || arrayList.isEmpty() || dbbVar.y) ? false : true;
                float e = dbbVar.S.e(false, z ? 1.0f : 0.0f);
                float e2 = dbbVar.T.e(false, z ? 1.0f : 0.0f);
                float e3 = dbbVar.e0.e(false, dbbVar.d0);
                if (e <= 0.0f && e2 <= 0.0f && !z) {
                    dbbVar.d.setVisibility(8);
                }
                dbbVar.P.rewind();
                float left = dbbVar.e.getLeft();
                int left2 = dbbVar.e.getLeft();
                ArrayList arrayList2 = dbbVar.x;
                float y = de9.y(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                lm lmVar = dbbVar.g0;
                float f3 = lmVar.c;
                boolean z2 = f3 <= 0.0f;
                float f4 = y - left;
                if (f4 > 0.0f) {
                    f3 = lmVar.e(z2, f4);
                }
                float e4 = dbbVar.f0.e(z2, (left + y) / 2.0f);
                bbb bbbVar2 = dbbVar.c;
                if (bbbVar2 != null && bbbVar2.getEditField() != null) {
                    int i = dbbVar.h;
                    if (i == 0) {
                        dbbVar.d.setTranslationY(((((-dbbVar.c.getEditField().getHeight()) - dbbVar.c.getEditField().getScrollY()) + dbbVar.a0) + gl.L(5.0f)) - dbbVar.c.getEditFieldBottomOffset());
                    } else if (i == 1) {
                        dbbVar.d.setTranslationY((((((-dbbVar.getMeasuredHeight()) - dbbVar.c.getEditField().getScrollY()) + dbbVar.a0) + gl.L(20.0f)) + dbbVar.d.getHeight()) - dbbVar.c.getEditFieldBottomOffset());
                    }
                }
                float f5 = f3 / 4.0f;
                float f6 = f3 / 2.0f;
                int max = (int) Math.max((dbbVar.d0 - Math.max(f5, Math.min(f6, gl.L(66.0f)))) - dbbVar.e.getLeft(), 0.0f);
                if (dbbVar.e.getPaddingLeft() != max) {
                    int paddingLeft = dbbVar.e.getPaddingLeft() - max;
                    f = 1.0f;
                    dbbVar.e.setPadding(max, 0, 0, 0);
                    dbbVar.e.scrollBy(paddingLeft, 0);
                } else {
                    f = 1.0f;
                }
                dbbVar.e.setTranslationX(((int) Math.max((e3 - Math.max(f5, Math.min(f6, gl.L(66.0f)))) - dbbVar.e.getLeft(), 0.0f)) - max);
                float translationX = dbbVar.e.getTranslationX() + (e4 - f6) + dbbVar.e.getPaddingLeft();
                float translationY = dbbVar.e.getTranslationY() + dbbVar.e.getTop() + dbbVar.e.getPaddingTop() + (dbbVar.h == 0 ? 0 : gl.L(6.66f));
                float min = Math.min(dbbVar.e.getTranslationX() + e4 + f6 + dbbVar.e.getPaddingLeft(), dbbVar.getWidth() - dbbVar.d.getPaddingRight());
                float translationY2 = (dbbVar.e.getTranslationY() + dbbVar.e.getBottom()) - (dbbVar.h == 0 ? gl.L(6.66f) : 0);
                float min2 = Math.min(gl.L(9.0f), f6) * 2.0f;
                int i2 = dbbVar.h;
                if (i2 == 0) {
                    RectF rectF = gl.P;
                    float f7 = translationY2 - min2;
                    float f8 = translationX + min2;
                    rectF.set(translationX, f7, f8, translationY2);
                    dbbVar.P.arcTo(rectF, 90.0f, 90.0f);
                    float f9 = translationY + min2;
                    rectF.set(translationX, translationY, f8, f9);
                    dbbVar.P.arcTo(rectF, -180.0f, 90.0f);
                    float f10 = min - min2;
                    rectF.set(f10, translationY, min, f9);
                    dbbVar.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f10, f7, min, translationY2);
                    dbbVar.P.arcTo(rectF, 0.0f, 90.0f);
                    dbbVar.P.lineTo(gl.L(8.66f) + e3, translationY2);
                    dbbVar.P.lineTo(e3, gl.L(6.66f) + translationY2);
                    dbbVar.P.lineTo(e3 - gl.L(8.66f), translationY2);
                } else if (i2 == 1) {
                    RectF rectF2 = gl.P;
                    float f11 = min - min2;
                    float f12 = translationY + min2;
                    rectF2.set(f11, translationY, min, f12);
                    dbbVar.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f13 = translationY2 - min2;
                    rectF2.set(f11, f13, min, translationY2);
                    dbbVar.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f14 = min2 + translationX;
                    rectF2.set(translationX, f13, f14, translationY2);
                    dbbVar.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f14, f12);
                    dbbVar.P.arcTo(rectF2, -180.0f, 90.0f);
                    dbbVar.P.lineTo(e3 - gl.L(8.66f), translationY);
                    dbbVar.P.lineTo(e3, translationY - gl.L(6.66f));
                    dbbVar.P.lineTo(gl.L(8.66f) + e3, translationY);
                }
                dbbVar.P.close();
                if (dbbVar.R == null) {
                    Paint paint = new Paint(1);
                    dbbVar.R = paint;
                    paint.setPathEffect(new CornerPathEffect(gl.L(2.0f)));
                    dbbVar.R.setShadowLayer(gl.L(4.33f), 0.0f, gl.L(0.33333334f), 855638016);
                    dbbVar.R.setColor(bkb.v0(bkb.sf, dbbVar.b));
                }
                if (e < f) {
                    dbbVar.Q.rewind();
                    float L = dbbVar.h == 0 ? gl.L(6.66f) + translationY2 : translationY - gl.L(6.66f);
                    double d = e3 - translationX;
                    double d2 = L - translationY;
                    f2 = 255.0f;
                    double d3 = e3 - min;
                    double d4 = L - translationY2;
                    dbbVar.Q.addCircle(e3, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d4, 2.0d) + Math.pow(d, 2.0d), Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(dbbVar.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, dbbVar.getWidth(), dbbVar.getHeight(), (int) (e * 255.0f), 31);
                } else {
                    f2 = 255.0f;
                }
                canvas.drawPath(dbbVar.P, dbbVar.R);
                canvas.save();
                canvas.clipPath(dbbVar.P);
                super.dispatchDraw(canvas);
                float f15 = dbbVar.g0.c;
                float f16 = dbbVar.f0.c;
                float f17 = f15 / 2.0f;
                float translationX2 = dbbVar.e.getTranslationX() + (f16 - f17) + dbbVar.e.getPaddingLeft();
                float paddingTop = dbbVar.e.getPaddingTop() + dbbVar.e.getTop();
                float min3 = Math.min(dbbVar.e.getTranslationX() + f16 + f17 + dbbVar.e.getPaddingLeft(), dbbVar.getWidth() - dbbVar.d.getPaddingRight());
                float bottom = dbbVar.e.getBottom();
                float e5 = dbbVar.U.e(false, dbbVar.e.canScrollHorizontally(-1) ? f : 0.0f);
                if (e5 > 0.0f) {
                    int i3 = (int) translationX2;
                    bkb.E4.setBounds(i3, (int) paddingTop, gl.L(32.0f) + i3, (int) bottom);
                    bkb.E4.setAlpha((int) (e5 * f2));
                    bkb.E4.draw(canvas);
                }
                float e6 = dbbVar.V.e(false, dbbVar.e.canScrollHorizontally(1) ? f : 0.0f);
                if (e6 > 0.0f) {
                    int i4 = (int) min3;
                    bkb.D4.setBounds(i4 - gl.L(32.0f), (int) paddingTop, i4, (int) bottom);
                    bkb.D4.setAlpha((int) (e6 * f2));
                    bkb.D4.draw(canvas);
                }
                canvas.restore();
                if (dbbVar.S.c < f) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 7:
                int save = canvas.save();
                canvas.clipPath((Path) obj);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 3:
                float a = ((n41) this.b).a(0.03f);
                canvas.save();
                canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        ui5 ui5Var;
        ui5 ui5Var2;
        a aVar2;
        a aVar3;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 1:
                boolean drawChild = super.drawChild(canvas, view, j);
                qmb qmbVar = (qmb) obj;
                aVar = ((d) qmbVar).actionBar;
                if (view == aVar) {
                    ui5Var = ((d) qmbVar).parentLayout;
                    if (ui5Var != null) {
                        ui5Var2 = ((d) qmbVar).parentLayout;
                        aVar2 = ((d) qmbVar).actionBar;
                        if (aVar2.getVisibility() == 0) {
                            aVar3 = ((d) qmbVar).actionBar;
                            i = aVar3.getMeasuredHeight();
                        }
                        ((ActionBarLayout) ui5Var2).o(canvas, i);
                    }
                }
                return drawChild;
            case 2:
                qvb qvbVar = (qvb) obj;
                if (view == qvbVar.b1 && qvbVar.isInPreviewMode()) {
                    ((ActionBarLayout) qvbVar.getParentLayout()).n(canvas, (int) (qvbVar.X * 255.0f), (int) (qvbVar.b1.getY() + qvbVar.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            case 6:
                if (!((mmc) obj).a || view.getTag() == mmc.o0) {
                    return super.drawChild(canvas, view, j);
                }
                return false;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                j6c j6cVar = (j6c) this.b;
                int translationY = (int) ((j6cVar.q1 - j6cVar.t0) - getTranslationY());
                Drawable drawable = j6cVar.l1;
                drawable.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                j6c j6cVar = (j6c) obj;
                if (motionEvent.getAction() != 0 || j6cVar.q1 == 0 || motionEvent.getY() >= j6cVar.q1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                j6cVar.dismiss();
                return true;
            case 6:
                return ((mmc) obj).a || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dbb dbbVar = (dbb) obj;
                setPadding(dbbVar.n, dbbVar.h == 0 ? gl.L(8.0f) : gl.L(6.66f), dbbVar.n, dbbVar.h == 0 ? gl.L(6.66f) : gl.L(8.0f));
                super.onMeasure(i, i2);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                qmb qmbVar = (qmb) obj;
                aVar = ((d) qmbVar).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                aVar2 = ((d) qmbVar).actionBar;
                int measuredHeight = aVar2.getMeasuredHeight();
                aVar3 = ((d) qmbVar).actionBar;
                if (aVar3.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                ((FrameLayout.LayoutParams) qmbVar.p0.getLayoutParams()).topMargin = measuredHeight;
                qmbVar.p0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                measureChildWithMargins(qmbVar.r0, i, 0, i2, 0);
                break;
            case 2:
            case 3:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                super.onMeasure(i, i2);
                ((ViewGroup.MarginLayoutParams) ((p3c) obj).M.getLayoutParams()).topMargin = gl.L(16.0f) + gl.m;
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 7:
                super.onSizeChanged(i, i2, i3, i4);
                Path path = (Path) this.b;
                float paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path.offset(getPaddingLeft(), getPaddingTop());
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                return !((j6c) this.b).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 8:
                super.onWindowFocusChanged(z);
                if (z) {
                    ((ypc) this.b).j0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        switch (this.a) {
            case 3:
                super.setPressed(z);
                ((n41) this.b).c(z);
                break;
            default:
                super.setPressed(z);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f);
                ((j6c) this.b).E0();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 0:
                dbb dbbVar = (dbb) this.b;
                boolean z = getVisibility() == i;
                super.setVisibility(i);
                if (!z) {
                    boolean z2 = i == 0;
                    if (dbbVar.e != null) {
                        for (int i2 = 0; i2 < dbbVar.e.getChildCount(); i2++) {
                            abb abbVar = dbbVar.e;
                            if (z2) {
                                cbb cbbVar = (cbb) abbVar.getChildAt(i2);
                                Drawable drawable = cbbVar.b;
                                if (drawable instanceof vl) {
                                    ((vl) drawable).b(cbbVar);
                                }
                                cbbVar.c = true;
                            } else {
                                cbb cbbVar2 = (cbb) abbVar.getChildAt(i2);
                                Drawable drawable2 = cbbVar2.b;
                                if (drawable2 instanceof vl) {
                                    ((vl) drawable2).o(cbbVar2);
                                }
                                cbbVar2.c = false;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zab(Activity activity) {
        super(activity);
        this.a = (byte) 3;
        this.b = new n41(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zab(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
