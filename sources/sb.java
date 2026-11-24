// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sb extends View {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(LaunchActivity launchActivity, pc pcVar) {
        super(launchActivity);
        this.a = (byte) 14;
        this.b = pcVar;
        kk7.i(this);
        setOnClickListener(new xf3((Object) this, (Object) launchActivity, (byte) 21));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                ql0 ql0Var = ((j92) this.b).L;
                if (ql0Var != null) {
                    ql0Var.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            case 14:
                super.dispatchDraw(canvas);
                pc pcVar = (pc) this.b;
                if (pcVar != null && pcVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            case 18:
                super.dispatchDraw(canvas);
                lw5 lw5Var = ((q88) this.b).M0;
                if (lw5Var != null) {
                    lw5Var.d(canvas);
                    break;
                }
                break;
            case 22:
                super.dispatchDraw(canvas);
                rt7 rt7Var = ((x6b) this.b).E0;
                if (rt7Var != null) {
                    rt7Var.d(canvas);
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
            case 15:
                super.draw(canvas);
                ((tgb) this.b).e(canvas, (getMeasuredWidth() - ((tgb) this.b).j()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 12:
                super.onAttachedToWindow();
                sv4 sv4Var = (sv4) this.b;
                if (sv4Var != null && !sv4Var.i) {
                    sv4Var.i = true;
                    sv4Var.a();
                    hj3 hj3Var = new hj3(sv4Var, (byte) 12);
                    sv4Var.h = hj3Var;
                    e66.a(hj3Var);
                    break;
                }
                break;
            case 14:
                super.onAttachedToWindow();
                pc pcVar = (pc) this.b;
                if (pcVar != null) {
                    pcVar.i = this;
                    int i = 0;
                    while (true) {
                        w65[] w65VarArr = (w65[]) pcVar.e;
                        if (i >= w65VarArr.length) {
                            break;
                        } else {
                            w65 w65Var = w65VarArr[i];
                            w65Var.i.add(this);
                            w65Var.a();
                            i++;
                        }
                    }
                }
                break;
            case 21:
                super.onAttachedToWindow();
                ((or7) this.b).f = true;
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
            case 12:
                super.onDetachedFromWindow();
                sv4 sv4Var = (sv4) this.b;
                if (sv4Var != null && sv4Var.i) {
                    sv4Var.i = false;
                    sv4Var.a();
                    hj3 hj3Var = sv4Var.h;
                    HashSet hashSet = e66.n;
                    if (hashSet != null) {
                        hashSet.remove(hj3Var);
                        break;
                    }
                }
                break;
            case 14:
                super.onDetachedFromWindow();
                pc pcVar = (pc) this.b;
                if (pcVar != null && ((sb) pcVar.i) != this) {
                    while (true) {
                        w65[] w65VarArr = (w65[]) pcVar.e;
                        if (i >= w65VarArr.length) {
                            pcVar.i = null;
                            break;
                        } else {
                            w65 w65Var = w65VarArr[i];
                            w65Var.i.remove(this);
                            w65Var.a();
                            i++;
                        }
                    }
                }
                break;
            case 21:
                super.onDetachedFromWindow();
                ((or7) this.b).f = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 8:
                super.onDraw(canvas);
                eo2 eo2Var = (eo2) this.b;
                jz4 jz4Var = eo2Var.E1;
                float max = Math.max(eo2Var.l1.e, eo2Var.m1.e);
                jz4 jz4Var2 = eo2Var.D1;
                jz4Var2.c(gl.L(42.0f) + eo2Var.O1.b, 0);
                jz4Var2.setBounds(0, 0, getWidth(), gl.L(56.0f) + eo2Var.O1.b);
                int i = bkb.Z6;
                jz4Var2.b(bkb.p1(gl.R1(1.0f, 0.8f, max), bkb.v0(i, eo2Var.J0)));
                jz4Var2.draw(canvas);
                if (eo2Var.H1) {
                    max = 1.0f;
                }
                int U1 = gl.U1(max, gl.L(48.0f) + eo2Var.O1.d, 0);
                int U12 = gl.U1(max, gl.L(72.0f), 0) + eo2Var.O1.d;
                float R1 = gl.R1(0.8f, gl.Q0(eo2Var.O1.d), max);
                jz4Var.c(0, U1);
                jz4Var.setBounds(0, getHeight() - U12, getWidth(), getHeight());
                jz4Var.b(bkb.p1(R1, bkb.v0(i, eo2Var.J0)));
                jz4Var.draw(canvas);
                break;
            case 9:
                if (((o03) this.b).U1) {
                    canvas.drawRect(r2.u0, 0.0f, getMeasuredWidth() - r2.u0, 1.0f, bkb.j0);
                    break;
                }
                break;
            case 10:
                tl tlVar = ((ue3) this.b).o4;
                tlVar.setBounds(0, 0, getWidth(), getHeight());
                tlVar.draw(canvas);
                break;
            case 19:
                super.onDraw(canvas);
                h26 h26Var = (h26) this.b;
                if (h26Var.k2 - h26Var.j2 > 1) {
                    Paint U0 = bkb.U0("paintDivider", h26Var.J0);
                    if (U0 == null) {
                        U0 = bkb.j0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    break;
                }
                break;
            case 20:
                canvas.drawColor(bkb.v0(bkb.d7, ((gg7) this.b).J0));
                break;
            case 23:
                g48 g48Var = (g48) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, g48Var.c.size())));
                TextPaint textPaint = g48Var.T;
                int max2 = Math.max(gl.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), gl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint.setColor(bkb.w0(null, bkb.B5, false));
                Paint paint = g48Var.V;
                paint.setColor(bkb.w0(null, bkb.g5, false));
                RectF rectF = g48Var.U;
                int i2 = max2 / 2;
                rectF.set(measuredWidth - i2, 0.0f, i2 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
                paint.setColor(bkb.w0(null, bkb.A5, false));
                rectF.set(gl.L(2.0f) + r11, gl.L(2.0f), r6 - gl.L(2.0f), getMeasuredHeight() - gl.L(2.0f));
                canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (r5 / 2), gl.L(16.2f), textPaint);
                break;
            case 24:
                u58 u58Var = (u58) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, u58Var.c.size())));
                TextPaint textPaint2 = u58Var.i0;
                int max3 = Math.max(gl.L(16.0f) + ((int) Math.ceil(textPaint2.measureText(format2))), gl.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint2.setColor(bkb.w0(null, bkb.B5, false));
                Paint paint2 = u58Var.k0;
                paint2.setColor(bkb.w0(null, u58Var.v0, false));
                RectF rectF2 = u58Var.j0;
                int i3 = max3 / 2;
                rectF2.set(measuredWidth2 - i3, 0.0f, i3 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), paint2);
                paint2.setColor(bkb.w0(null, bkb.A5, false));
                rectF2.set(gl.L(2.0f) + r3, gl.L(2.0f), r9 - gl.L(2.0f), getMeasuredHeight() - gl.L(2.0f));
                canvas.drawRoundRect(rectF2, gl.L(10.0f), gl.L(10.0f), paint2);
                canvas.drawText(format2, measuredWidth2 - (r14 / 2), gl.L(16.2f), textPaint2);
                break;
            case 25:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 26:
                super.onDraw(canvas);
                ((x88) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 29:
                canvas.save();
                canvas.translate(gl.N(22.6f), gl.N(21.66f));
                ((ac9) this.b).c.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a aVar;
        int i4;
        int i5 = 0;
        switch (this.a) {
            case 0:
                bc bcVar = (bc) this.b;
                if (bcVar.I) {
                    int i6 = bcVar.J;
                    aVar = ((d) bcVar).actionBar;
                    i3 = (aVar.getMeasuredHeight() + i6) - gl.L(16.0f);
                } else {
                    int L = gl.L(140.0f) + bcVar.J;
                    if (gl.L(24.0f) + bcVar.E.getMeasuredHeight() > L) {
                        L = gl.L(24.0f) + bcVar.E.getMeasuredHeight();
                    }
                    i3 = L;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), TLObject.FLAG_30));
                break;
            case 1:
                t26 t26Var = ((eo0) this.b).d.G;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, t26Var instanceof wb4 ? ((wb4) t26Var).J : 0), TLObject.FLAG_30));
                break;
            case 2:
                fy0 fy0Var = (fy0) this.b;
                int i7 = fy0Var.q1;
                int L2 = (i7 == 0 ? gl.L(300.0f) : (int) (i7 * fy0Var.u1)) - (((fy0Var.A1 - fy0Var.B1) - fy0Var.C1) - fy0Var.D1);
                if (L2 < 1) {
                    L2 = 1;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((e52) this.b).w.K, TLObject.FLAG_30));
                break;
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((k62) ((s20) this.b).e).S0);
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((f72) ((jr) this.b).d).x, TLObject.FLAG_30));
                break;
            case 13:
                iz4 iz4Var = (iz4) this.b;
                if (iz4Var.I) {
                    i4 = (iz4Var.o0().getMeasuredHeight() + iz4Var.J) - gl.L(16.0f);
                    iz4Var.K = i4;
                } else {
                    int L3 = gl.L(140.0f) + iz4Var.J;
                    if (gl.L(24.0f) + iz4Var.E.getMeasuredHeight() > L3) {
                        L3 = Math.max(L3, (gl.L(24.0f) + iz4Var.E.getMeasuredHeight()) - iz4Var.M);
                    }
                    i4 = L3;
                    iz4Var.K = i4;
                }
                int i8 = (int) (i4 - 0.0f);
                iz4Var.K = i8;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30));
                break;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(38.0f));
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((tgb) this.b).j()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((tgb) this.b).h()), gl.L(26.0f)), TLObject.FLAG_30));
                break;
            case 16:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f) + ((dr5) this.b).c.i2, TLObject.FLAG_30));
                break;
            case 17:
                int L4 = gl.L(48.0f);
                jr5 jr5Var = ((fr5) this.b).n;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L4 + jr5Var.i2 + jr5Var.o2, TLObject.FLAG_30));
                break;
            case 21:
                ((View) getParent()).getMeasuredHeight();
                or7 or7Var = (or7) this.b;
                Integer num = or7Var.d;
                if (num != null) {
                    i5 = num.intValue();
                    or7Var.h = i5;
                } else {
                    or7Var.h = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30));
                break;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) this.b).c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L5 = gl.L(64.0f);
                    if (gl.L(8.0f) + premiumPreviewFragment.V.getMeasuredHeight() > L5) {
                        L5 = premiumPreviewFragment.V.getMeasuredHeight() + gl.L(8.0f);
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
    public final void setAlpha(float f) {
        switch (this.a) {
            case 3:
                super.setAlpha(f);
                View view = ((w71) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 11:
                super.setAlpha(f);
                View view2 = ((cj3) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 28:
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
            case 12:
                if (((sv4) this.b) != null) {
                    if (isAttachedToWindow()) {
                        sv4 sv4Var = (sv4) this.b;
                        if (sv4Var.i) {
                            sv4Var.i = false;
                            sv4Var.a();
                            hj3 hj3Var = sv4Var.h;
                            HashSet hashSet = e66.n;
                            if (hashSet != null) {
                                hashSet.remove(hj3Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof sv4) {
                    this.b = (sv4) drawable;
                    if (isAttachedToWindow()) {
                        sv4 sv4Var2 = (sv4) this.b;
                        if (!sv4Var2.i) {
                            sv4Var2.i = true;
                            sv4Var2.a();
                            hj3 hj3Var2 = new hj3(sv4Var2, (byte) 12);
                            sv4Var2.h = hj3Var2;
                            e66.a(hj3Var2);
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
            case 2:
                super.setTranslationY(f);
                fy0 fy0Var = (fy0) this.b;
                int i = fy0.R1;
                fy0Var.b.invalidate();
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
    public sb(fy0 fy0Var, Context context) {
        super(context);
        this.a = (byte) 2;
        this.b = fy0Var;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
