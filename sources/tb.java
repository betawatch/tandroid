// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b0;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tb extends View {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(LaunchActivity launchActivity, qc qcVar) {
        super(launchActivity);
        this.a = (byte) 15;
        this.b = qcVar;
        jn7.i(this);
        setOnClickListener(new je3(this, launchActivity, (byte) 24));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 8:
                rl0 rl0Var = ((z92) this.b).M;
                if (rl0Var != null) {
                    rl0Var.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            case 15:
                super.dispatchDraw(canvas);
                qc qcVar = (qc) this.b;
                if (qcVar != null && qcVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            case 19:
                super.dispatchDraw(canvas);
                qy5 qy5Var = ((hc8) this.b).G0;
                if (qy5Var != null) {
                    qy5Var.d(canvas);
                    break;
                }
                break;
            case 23:
                super.dispatchDraw(canvas);
                yw7 yw7Var = ((vab) this.b).y0;
                if (yw7Var != null) {
                    yw7Var.d(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 16:
                super.draw(canvas);
                ((pkb) this.b).e(canvas, (getMeasuredWidth() - ((pkb) this.b).j()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 13:
                super.onAttachedToWindow();
                xx4 xx4Var = (xx4) this.b;
                if (xx4Var != null && !xx4Var.i) {
                    xx4Var.i = true;
                    xx4Var.a();
                    zj3 zj3Var = new zj3(xx4Var, (byte) 12);
                    xx4Var.h = zj3Var;
                    i86.a(zj3Var);
                    break;
                }
                break;
            case 15:
                super.onAttachedToWindow();
                qc qcVar = (qc) this.b;
                if (qcVar != null) {
                    qcVar.i = this;
                    int i = 0;
                    while (true) {
                        y85[] y85VarArr = (y85[]) qcVar.e;
                        if (i >= y85VarArr.length) {
                            break;
                        } else {
                            y85 y85Var = y85VarArr[i];
                            y85Var.i.add(this);
                            y85Var.a();
                            i++;
                        }
                    }
                }
                break;
            case 22:
                super.onAttachedToWindow();
                ((uu7) this.b).f = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int i = 0;
        switch (this.a) {
            case 13:
                super.onDetachedFromWindow();
                xx4 xx4Var = (xx4) this.b;
                if (xx4Var != null && xx4Var.i) {
                    xx4Var.i = false;
                    xx4Var.a();
                    zj3 zj3Var = xx4Var.h;
                    HashSet hashSet = i86.n;
                    if (hashSet != null) {
                        hashSet.remove(zj3Var);
                        break;
                    }
                }
                break;
            case 15:
                super.onDetachedFromWindow();
                qc qcVar = (qc) this.b;
                if (qcVar != null && ((tb) qcVar.i) != this) {
                    while (true) {
                        y85[] y85VarArr = (y85[]) qcVar.e;
                        if (i >= y85VarArr.length) {
                            qcVar.i = null;
                            break;
                        } else {
                            y85 y85Var = y85VarArr[i];
                            y85Var.i.remove(this);
                            y85Var.a();
                            i++;
                        }
                    }
                }
                break;
            case 22:
                super.onDetachedFromWindow();
                ((uu7) this.b).f = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                sr0 sr0Var = (sr0) this.b;
                canvas.drawColor(sr0Var.s);
                if (sr0Var.e.c(canvas, getWidth())) {
                    invalidate();
                    break;
                }
                break;
            case 9:
                super.onDraw(canvas);
                xo2 xo2Var = (xo2) this.b;
                n15 n15Var = xo2Var.E1;
                float max = Math.max(xo2Var.l1.e, xo2Var.m1.e);
                n15 n15Var2 = xo2Var.D1;
                n15Var2.c(hl.L(42.0f) + xo2Var.O1.b, 0);
                n15Var2.setBounds(0, 0, getWidth(), hl.L(56.0f) + xo2Var.O1.b);
                int i = aob.a7;
                n15Var2.b(aob.p1(hl.R1(1.0f, 0.8f, max), aob.v0(i, xo2Var.J0)));
                n15Var2.draw(canvas);
                if (xo2Var.H1) {
                    max = 1.0f;
                }
                int U1 = hl.U1(max, hl.L(48.0f) + xo2Var.O1.d, 0);
                int U12 = hl.U1(max, hl.L(72.0f), 0) + xo2Var.O1.d;
                float R1 = hl.R1(0.8f, hl.Q0(xo2Var.O1.d), max);
                n15Var.c(0, U1);
                n15Var.setBounds(0, getHeight() - U12, getWidth(), getHeight());
                n15Var.b(aob.p1(R1, aob.v0(i, xo2Var.J0)));
                n15Var.draw(canvas);
                break;
            case 10:
                if (((h13) this.b).U1) {
                    canvas.drawRect(r2.u0, 0.0f, getMeasuredWidth() - r2.u0, 1.0f, aob.j0);
                    break;
                }
                break;
            case 11:
                ul ulVar = ((of3) this.b).o4;
                ulVar.setBounds(0, 0, getWidth(), getHeight());
                ulVar.draw(canvas);
                break;
            case 20:
                super.onDraw(canvas);
                l46 l46Var = (l46) this.b;
                if (l46Var.k2 - l46Var.j2 > 1) {
                    Paint U0 = aob.U0("paintDivider", l46Var.J0);
                    if (U0 == null) {
                        U0 = aob.j0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    break;
                }
                break;
            case 21:
                canvas.drawColor(aob.v0(aob.e7, ((pi7) this.b).J0));
                break;
            case 24:
                w78 w78Var = (w78) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, w78Var.c.size())));
                TextPaint textPaint = w78Var.T;
                int max2 = Math.max(hl.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), hl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint.setColor(aob.w0(null, aob.C5, false));
                Paint paint = w78Var.V;
                paint.setColor(aob.w0(null, aob.h5, false));
                RectF rectF = w78Var.U;
                int i2 = max2 / 2;
                rectF.set(measuredWidth - i2, 0.0f, i2 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
                paint.setColor(aob.w0(null, aob.B5, false));
                rectF.set(hl.L(2.0f) + r11, hl.L(2.0f), r6 - hl.L(2.0f), getMeasuredHeight() - hl.L(2.0f));
                canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (r5 / 2), hl.L(16.2f), textPaint);
                break;
            case 25:
                l98 l98Var = (l98) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, l98Var.c.size())));
                TextPaint textPaint2 = l98Var.i0;
                int max3 = Math.max(hl.L(16.0f) + ((int) Math.ceil(textPaint2.measureText(format2))), hl.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint2.setColor(aob.w0(null, aob.C5, false));
                Paint paint2 = l98Var.k0;
                paint2.setColor(aob.w0(null, l98Var.v0, false));
                RectF rectF2 = l98Var.j0;
                int i3 = max3 / 2;
                rectF2.set(measuredWidth2 - i3, 0.0f, i3 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(rectF2, hl.L(12.0f), hl.L(12.0f), paint2);
                paint2.setColor(aob.w0(null, aob.B5, false));
                rectF2.set(hl.L(2.0f) + r3, hl.L(2.0f), r9 - hl.L(2.0f), getMeasuredHeight() - hl.L(2.0f));
                canvas.drawRoundRect(rectF2, hl.L(10.0f), hl.L(10.0f), paint2);
                canvas.drawText(format2, measuredWidth2 - (r14 / 2), hl.L(16.2f), textPaint2);
                break;
            case 26:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 27:
                super.onDraw(canvas);
                ((nc8) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                sr0 sr0Var = (sr0) this.b;
                if (sr0Var.G) {
                    sr0Var.e.m(motionEvent, true);
                }
                return sr0Var.G;
            default:
                return super.onHoverEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a aVar;
        int round;
        int i4;
        int i5 = 0;
        switch (this.a) {
            case 0:
                cc ccVar = (cc) this.b;
                if (ccVar.I) {
                    int i6 = ccVar.J;
                    aVar = ((e) ccVar).actionBar;
                    i3 = (aVar.getMeasuredHeight() + i6) - hl.L(16.0f);
                } else {
                    int L = hl.L(140.0f) + ccVar.J;
                    if (hl.L(24.0f) + ccVar.E.getMeasuredHeight() > L) {
                        L = hl.L(24.0f) + ccVar.E.getMeasuredHeight();
                    }
                    i3 = L;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), TLObject.FLAG_30));
                break;
            case 1:
                x46 x46Var = ((eo0) this.b).d.G;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, x46Var instanceof td4 ? ((td4) x46Var).J : 0), TLObject.FLAG_30));
                break;
            case 2:
                int size = View.MeasureSpec.getSize(i);
                sr0 sr0Var = (sr0) this.b;
                int height = sr0Var.getHeight();
                v0d v0dVar = sr0Var.e;
                q0d q0dVar = v0dVar.p;
                if (q0dVar == null || (round = q0dVar.h) <= 0) {
                    round = Math.round(v0dVar.b * 160.0f);
                }
                setMeasuredDimension(size, Math.max(height, round));
                break;
            case 3:
                ny0 ny0Var = (ny0) this.b;
                int i7 = ny0Var.q1;
                int L2 = (i7 == 0 ? hl.L(300.0f) : (int) (i7 * ny0Var.u1)) - (((ny0Var.A1 - ny0Var.B1) - ny0Var.C1) - ny0Var.D1);
                if (L2 < 1) {
                    L2 = 1;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((u52) this.b).w.K, TLObject.FLAG_30));
                break;
            case 6:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((a72) ((t20) this.b).e).S0);
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((w72) ((kr) this.b).d).x, TLObject.FLAG_30));
                break;
            case 14:
                m15 m15Var = (m15) this.b;
                if (m15Var.I) {
                    i4 = (m15Var.o0().getMeasuredHeight() + m15Var.J) - hl.L(16.0f);
                    m15Var.K = i4;
                } else {
                    int L3 = hl.L(140.0f) + m15Var.J;
                    if (hl.L(24.0f) + m15Var.E.getMeasuredHeight() > L3) {
                        L3 = Math.max(L3, (hl.L(24.0f) + m15Var.E.getMeasuredHeight()) - m15Var.M);
                    }
                    i4 = L3;
                    m15Var.K = i4;
                }
                int i8 = (int) (i4 - 0.0f);
                m15Var.K = i8;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30));
                break;
            case 15:
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(38.0f));
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((pkb) this.b).j()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((pkb) this.b).h()), hl.L(26.0f)), TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f) + ((ft5) this.b).c.i2, TLObject.FLAG_30));
                break;
            case 18:
                int L4 = hl.L(48.0f);
                lt5 lt5Var = ((ht5) this.b).n;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L4 + lt5Var.i2 + lt5Var.o2, TLObject.FLAG_30));
                break;
            case 22:
                ((View) getParent()).getMeasuredHeight();
                uu7 uu7Var = (uu7) this.b;
                Integer num = uu7Var.d;
                if (num != null) {
                    i5 = num.intValue();
                    uu7Var.h = i5;
                } else {
                    uu7Var.h = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30));
                break;
            case 28:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) this.b).c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L5 = hl.L(64.0f);
                    if (hl.L(8.0f) + premiumPreviewFragment.V.getMeasuredHeight() > L5) {
                        L5 = premiumPreviewFragment.V.getMeasuredHeight() + hl.L(8.0f);
                    }
                    premiumPreviewFragment.Z = L5;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(premiumPreviewFragment.Z, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                sr0 sr0Var = (sr0) this.b;
                return sr0Var.G && sr0Var.e.n(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 4:
                super.setAlpha(f);
                View view = ((e81) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 12:
                super.setAlpha(f);
                View view2 = ((uj3) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 29:
                super.setAlpha(f);
                View view3 = ((ProfileActivity) this.b).fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        switch (this.a) {
            case 13:
                if (((xx4) this.b) != null) {
                    if (isAttachedToWindow()) {
                        xx4 xx4Var = (xx4) this.b;
                        if (xx4Var.i) {
                            xx4Var.i = false;
                            xx4Var.a();
                            zj3 zj3Var = xx4Var.h;
                            HashSet hashSet = i86.n;
                            if (hashSet != null) {
                                hashSet.remove(zj3Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xx4) {
                    this.b = (xx4) drawable;
                    if (isAttachedToWindow()) {
                        xx4 xx4Var2 = (xx4) this.b;
                        if (!xx4Var2.i) {
                            xx4Var2.i = true;
                            xx4Var2.a();
                            zj3 zj3Var2 = new zj3(xx4Var2, (byte) 12);
                            xx4Var2.h = zj3Var2;
                            i86.a(zj3Var2);
                            break;
                        }
                    }
                }
                break;
            default:
                super.setBackground(drawable);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f);
                ny0 ny0Var = (ny0) this.b;
                int i = ny0.R1;
                ny0Var.b.invalidate();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(ny0 ny0Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.b = ny0Var;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
