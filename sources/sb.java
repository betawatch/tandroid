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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b0;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sb extends View {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(LaunchActivity launchActivity, pd pdVar) {
        super(launchActivity);
        this.a = (byte) 15;
        this.b = pdVar;
        nm7.i(this);
        setOnClickListener(new tf3(this, launchActivity, (byte) 22));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 8:
                qm0 qm0Var = ((va2) this.b).L;
                if (qm0Var != null) {
                    qm0Var.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            case 15:
                super.dispatchDraw(canvas);
                pd pdVar = (pd) this.b;
                if (pdVar != null && pdVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            case 19:
                super.dispatchDraw(canvas);
                ly5 ly5Var = ((sa8) this.b).M0;
                if (ly5Var != null) {
                    ly5Var.d(canvas);
                    break;
                }
                break;
            case 23:
                super.dispatchDraw(canvas);
                sv7 sv7Var = ((z8b) this.b).E0;
                if (sv7Var != null) {
                    sv7Var.d(canvas);
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
                ((uib) this.b).e(canvas, (getMeasuredWidth() - ((uib) this.b).j()) / 2.0f, getMeasuredHeight() / 2.0f);
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
                tx4 tx4Var = (tx4) this.b;
                if (tx4Var != null && !tx4Var.i) {
                    tx4Var.i = true;
                    tx4Var.a();
                    sk3 sk3Var = new sk3(tx4Var, (byte) 12);
                    tx4Var.h = sk3Var;
                    e86.a(sk3Var);
                    break;
                }
                break;
            case 15:
                super.onAttachedToWindow();
                pd pdVar = (pd) this.b;
                if (pdVar != null) {
                    pdVar.i = this;
                    int i = 0;
                    while (true) {
                        u85[] u85VarArr = (u85[]) pdVar.e;
                        if (i >= u85VarArr.length) {
                            break;
                        } else {
                            u85 u85Var = u85VarArr[i];
                            u85Var.i.add(this);
                            u85Var.a();
                            i++;
                        }
                    }
                }
                break;
            case 22:
                super.onAttachedToWindow();
                ((pt7) this.b).f = true;
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
                tx4 tx4Var = (tx4) this.b;
                if (tx4Var != null && tx4Var.i) {
                    tx4Var.i = false;
                    tx4Var.a();
                    sk3 sk3Var = tx4Var.h;
                    HashSet hashSet = e86.n;
                    if (hashSet != null) {
                        hashSet.remove(sk3Var);
                        break;
                    }
                }
                break;
            case 15:
                super.onDetachedFromWindow();
                pd pdVar = (pd) this.b;
                if (pdVar != null && ((sb) pdVar.i) != this) {
                    while (true) {
                        u85[] u85VarArr = (u85[]) pdVar.e;
                        if (i >= u85VarArr.length) {
                            pdVar.i = null;
                            break;
                        } else {
                            u85 u85Var = u85VarArr[i];
                            u85Var.i.remove(this);
                            u85Var.a();
                            i++;
                        }
                    }
                }
                break;
            case 22:
                super.onDetachedFromWindow();
                ((pt7) this.b).f = false;
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
                ss0 ss0Var = (ss0) this.b;
                canvas.drawColor(ss0Var.s);
                if (ss0Var.e.c(canvas, getWidth())) {
                    invalidate();
                    break;
                }
                break;
            case 9:
                super.onDraw(canvas);
                pp2 pp2Var = (pp2) this.b;
                i15 i15Var = pp2Var.E1;
                float max = Math.max(pp2Var.l1.e, pp2Var.m1.e);
                i15 i15Var2 = pp2Var.D1;
                i15Var2.c(gm.L(42.0f) + pp2Var.O1.b, 0);
                i15Var2.setBounds(0, 0, getWidth(), gm.L(56.0f) + pp2Var.O1.b);
                int i = cmb.Z6;
                i15Var2.b(cmb.p1(gm.R1(1.0f, 0.8f, max), cmb.v0(i, pp2Var.J0)));
                i15Var2.draw(canvas);
                if (pp2Var.H1) {
                    max = 1.0f;
                }
                int U1 = gm.U1(max, gm.L(48.0f) + pp2Var.O1.d, 0);
                int U12 = gm.U1(max, gm.L(72.0f), 0) + pp2Var.O1.d;
                float R1 = gm.R1(0.8f, gm.Q0(pp2Var.O1.d), max);
                i15Var.c(0, U1);
                i15Var.setBounds(0, getHeight() - U12, getWidth(), getHeight());
                i15Var.b(cmb.p1(R1, cmb.v0(i, pp2Var.J0)));
                i15Var.draw(canvas);
                break;
            case 10:
                if (((a23) this.b).U1) {
                    canvas.drawRect(r2.u0, 0.0f, getMeasuredWidth() - r2.u0, 1.0f, cmb.j0);
                    break;
                }
                break;
            case 11:
                tm tmVar = ((hg3) this.b).o4;
                tmVar.setBounds(0, 0, getWidth(), getHeight());
                tmVar.draw(canvas);
                break;
            case 20:
                super.onDraw(canvas);
                i46 i46Var = (i46) this.b;
                if (i46Var.k2 - i46Var.j2 > 1) {
                    Paint U0 = cmb.U0("paintDivider", i46Var.J0);
                    if (U0 == null) {
                        U0 = cmb.j0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    break;
                }
                break;
            case 21:
                canvas.drawColor(cmb.v0(cmb.d7, ((ji7) this.b).J0));
                break;
            case 24:
                j68 j68Var = (j68) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, j68Var.c.size())));
                TextPaint textPaint = j68Var.T;
                int max2 = Math.max(gm.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), gm.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint.setColor(cmb.w0(null, cmb.B5, false));
                Paint paint = j68Var.V;
                paint.setColor(cmb.w0(null, cmb.g5, false));
                RectF rectF = j68Var.U;
                int i2 = max2 / 2;
                rectF.set(measuredWidth - i2, 0.0f, i2 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), paint);
                paint.setColor(cmb.w0(null, cmb.A5, false));
                rectF.set(gm.L(2.0f) + r11, gm.L(2.0f), r6 - gm.L(2.0f), getMeasuredHeight() - gm.L(2.0f));
                canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (r5 / 2), gm.L(16.2f), textPaint);
                break;
            case 25:
                w78 w78Var = (w78) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, w78Var.c.size())));
                TextPaint textPaint2 = w78Var.i0;
                int max3 = Math.max(gm.L(16.0f) + ((int) Math.ceil(textPaint2.measureText(format2))), gm.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint2.setColor(cmb.w0(null, cmb.B5, false));
                Paint paint2 = w78Var.k0;
                paint2.setColor(cmb.w0(null, w78Var.v0, false));
                RectF rectF2 = w78Var.j0;
                int i3 = max3 / 2;
                rectF2.set(measuredWidth2 - i3, 0.0f, i3 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(rectF2, gm.L(12.0f), gm.L(12.0f), paint2);
                paint2.setColor(cmb.w0(null, cmb.A5, false));
                rectF2.set(gm.L(2.0f) + r3, gm.L(2.0f), r9 - gm.L(2.0f), getMeasuredHeight() - gm.L(2.0f));
                canvas.drawRoundRect(rectF2, gm.L(10.0f), gm.L(10.0f), paint2);
                canvas.drawText(format2, measuredWidth2 - (r14 / 2), gm.L(16.2f), textPaint2);
                break;
            case 26:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 27:
                super.onDraw(canvas);
                ((ya8) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
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
                ss0 ss0Var = (ss0) this.b;
                if (ss0Var.G) {
                    ss0Var.e.m(motionEvent, true);
                }
                return ss0Var.G;
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
                bc bcVar = (bc) this.b;
                if (bcVar.I) {
                    int i6 = bcVar.J;
                    aVar = ((d) bcVar).actionBar;
                    i3 = (aVar.getMeasuredHeight() + i6) - gm.L(16.0f);
                } else {
                    int L = gm.L(140.0f) + bcVar.J;
                    if (gm.L(24.0f) + bcVar.E.getMeasuredHeight() > L) {
                        L = gm.L(24.0f) + bcVar.E.getMeasuredHeight();
                    }
                    i3 = L;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), TLObject.FLAG_30));
                break;
            case 1:
                u46 u46Var = ((ep0) this.b).d.G;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, u46Var instanceof wd4 ? ((wd4) u46Var).J : 0), TLObject.FLAG_30));
                break;
            case 2:
                int size = View.MeasureSpec.getSize(i);
                ss0 ss0Var = (ss0) this.b;
                int height = ss0Var.getHeight();
                hyc hycVar = ss0Var.e;
                cyc cycVar = hycVar.p;
                if (cycVar == null || (round = cycVar.h) <= 0) {
                    round = Math.round(hycVar.b * 160.0f);
                }
                setMeasuredDimension(size, Math.max(height, round));
                break;
            case 3:
                mz0 mz0Var = (mz0) this.b;
                int i7 = mz0Var.q1;
                int L2 = (i7 == 0 ? gm.L(300.0f) : (int) (i7 * mz0Var.u1)) - (((mz0Var.A1 - mz0Var.B1) - mz0Var.C1) - mz0Var.D1);
                if (L2 < 1) {
                    L2 = 1;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((p62) this.b).w.K, TLObject.FLAG_30));
                break;
            case 6:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((v72) ((s30) this.b).e).S0);
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((q82) ((js) this.b).d).x, TLObject.FLAG_30));
                break;
            case 14:
                h15 h15Var = (h15) this.b;
                if (h15Var.I) {
                    i4 = (h15Var.p0().getMeasuredHeight() + h15Var.J) - gm.L(16.0f);
                    h15Var.K = i4;
                } else {
                    int L3 = gm.L(140.0f) + h15Var.J;
                    if (gm.L(24.0f) + h15Var.E.getMeasuredHeight() > L3) {
                        L3 = Math.max(L3, (gm.L(24.0f) + h15Var.E.getMeasuredHeight()) - h15Var.M);
                    }
                    i4 = L3;
                    h15Var.K = i4;
                }
                int i8 = (int) (i4 - 0.0f);
                h15Var.K = i8;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30));
                break;
            case 15:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(38.0f));
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((uib) this.b).j()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((uib) this.b).h()), gm.L(26.0f)), TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f) + ((bt5) this.b).c.i2, TLObject.FLAG_30));
                break;
            case 18:
                int L4 = gm.L(48.0f);
                it5 it5Var = ((et5) this.b).n;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L4 + it5Var.i2 + it5Var.o2, TLObject.FLAG_30));
                break;
            case 22:
                ((View) getParent()).getMeasuredHeight();
                pt7 pt7Var = (pt7) this.b;
                Integer num = pt7Var.d;
                if (num != null) {
                    i5 = num.intValue();
                    pt7Var.h = i5;
                } else {
                    pt7Var.h = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30));
                break;
            case 28:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) this.b).c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L5 = gm.L(64.0f);
                    if (gm.L(8.0f) + premiumPreviewFragment.V.getMeasuredHeight() > L5) {
                        L5 = premiumPreviewFragment.V.getMeasuredHeight() + gm.L(8.0f);
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
                ss0 ss0Var = (ss0) this.b;
                return ss0Var.G && ss0Var.e.n(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 4:
                super.setAlpha(f);
                View view = ((f91) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 12:
                super.setAlpha(f);
                View view2 = ((nk3) this.b).fragmentView;
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
                if (((tx4) this.b) != null) {
                    if (isAttachedToWindow()) {
                        tx4 tx4Var = (tx4) this.b;
                        if (tx4Var.i) {
                            tx4Var.i = false;
                            tx4Var.a();
                            sk3 sk3Var = tx4Var.h;
                            HashSet hashSet = e86.n;
                            if (hashSet != null) {
                                hashSet.remove(sk3Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof tx4) {
                    this.b = (tx4) drawable;
                    if (isAttachedToWindow()) {
                        tx4 tx4Var2 = (tx4) this.b;
                        if (!tx4Var2.i) {
                            tx4Var2.i = true;
                            tx4Var2.a();
                            sk3 sk3Var2 = new sk3(tx4Var2, (byte) 12);
                            tx4Var2.h = sk3Var2;
                            e86.a(sk3Var2);
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
                mz0 mz0Var = (mz0) this.b;
                int i = mz0.R1;
                mz0Var.b.invalidate();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(mz0 mz0Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.b = mz0Var;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
