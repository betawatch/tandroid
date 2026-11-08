package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public Object d;
    public final Object e;
    public Object f;
    public Object h;

    public t4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = org.telegram.messenger.g0.L(64.0f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
        addView(l9Var, c8.ha.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    public void a(int i7) {
        TextView textView = (TextView) this.d;
        this.b = i7;
        ((sg.m) this.e).c = i7;
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.id.M0(2131747665, null).toUpperCase());
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.id.M0(2131747667, null).toUpperCase());
        } else if (i7 == 2) {
            textView.setText(org.telegram.messenger.id.M0(2131747668, null).toUpperCase());
        }
        b();
    }

    public void b() {
        sg.q qVar = (sg.q) this.h;
        this.c = true;
        sg.m mVar = (sg.m) this.e;
        mVar.d = i0.a.o(mVar.e.m1, org.telegram.messenger.qs.e4);
        mVar.a();
        mVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i7 = this.b;
        if (i7 == 0) {
            editTextBoldCursor.setText(String.valueOf(Color.red(qVar.m1)));
        } else if (i7 == 1) {
            editTextBoldCursor.setText(String.valueOf(Color.green(qVar.m1)));
        } else if (i7 == 2) {
            editTextBoldCursor.setText(String.valueOf(Color.blue(qVar.m1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.a;
        float f10 = 1.0f;
        Object obj = this.e;
        final int i10 = 0;
        switch (i7) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.c) {
                    Drawable t6 = ((org.telegram.ui.Components.l9) this.d).getImageReceiver().t();
                    final int i11 = 1;
                    if ((t6 instanceof org.telegram.ui.Components.v5) && ((org.telegram.ui.Components.v5) t6).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                                radialProgress2.p(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f = ofFloat;
                            ofFloat.addListener(new m.a(this, 16));
                            ((ValueAnimator) this.f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s4
                                public final /* synthetic */ t4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i10) {
                                        case 0:
                                            this.b.invalidate();
                                            break;
                                        default:
                                            this.b.invalidate();
                                            break;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f).setDuration(250L);
                            ((ValueAnimator) this.f).start();
                        } else {
                            this.c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s4
                            public final /* synthetic */ t4 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (i11) {
                                    case 0:
                                        this.b.invalidate();
                                        break;
                                    default:
                                        this.b.invalidate();
                                        break;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f;
                    if (valueAnimator2 == null) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) this.h;
                        if (valueAnimator3 != null) {
                            radialProgress2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                            radialProgress2.draw(canvas);
                            break;
                        }
                    } else {
                        radialProgress2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        break;
                    }
                }
                break;
            case 1:
                Paint paint = (Paint) obj;
                v71 v71Var = (v71) this.h;
                w61 w61Var = v71Var.a;
                if (this.c) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
                    org.telegram.ui.ActionBar.k6.t(this, v71Var.y0, w61Var);
                    Paint d = w61Var.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f);
                    l71 l71Var = v71Var.y0;
                    if (l71Var != null && (l71Var.getBackground() instanceof org.telegram.ui.Components.qa0) && v71Var.m1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (v71Var.N1) {
                        float f11 = v71Var.o1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * v71Var.p1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.b != getHeight()) {
                        int height = getHeight();
                        this.b = height;
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        this.d = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(rectF, paint);
                    canvas.restore();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                RadialProgress2 radialProgress2 = (RadialProgress2) this.e;
                int i13 = this.b;
                radialProgress2.r(width - i13, height - i13, width + i13, height + i13);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i7, i10);
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getMeasuredWidth() > org.telegram.messenger.g0.L(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(420.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
                break;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(sg.q qVar, Context context) {
        super(context);
        this.h = qVar;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        View mVar = new sg.m(qVar, context);
        this.e = mVar;
        addView(mVar, c8.ha.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(org.telegram.messenger.id.M0(2131751355, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new fi.h7(this));
        editTextBoldCursor.setOnFocusChangeListener(new bi.n(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.l2(4));
        addView(editTextBoldCursor, c8.ha.e(72, 36, 85));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(v71 v71Var, Context context, boolean z9) {
        super(context);
        this.h = v71Var;
        this.c = z9;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.4f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.65f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }
}
