// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sg2 extends FrameLayout {
    public final byte E;
    public final byte F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final vnb b;
    public final te1 c;
    public final qg2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final og2 r;
    public View s;
    public final rg2 w;
    public final de0 x;
    public final rb0 y;

    /* JADX WARN: Multi-variable type inference failed */
    public sg2(Context context, int i, int i2, boolean z, vnb vnbVar) {
        super(context);
        this.b = vnbVar;
        this.E = i;
        this.I = z;
        byte b = 2;
        byte b2 = 0;
        boolean z2 = true;
        if (z) {
            qg2 qg2Var = new qg2(this, context, b2);
            this.d = qg2Var;
            jn7.i(qg2Var);
            qg2Var.setEllipsizeByGradient(true);
            qg2Var.setRightPadding(hl.L(8.0f));
            qg2Var.getDrawable().r(true, false);
            qg2Var.setTag(Integer.valueOf(aob.v0((i == 1 || i == 5) ? aob.j5 : aob.G6, vnbVar)));
            qg2Var.setTextSize(hl.L(16.0f));
            if (i == 7) {
                qg2Var.setTypeface(hl.o());
            }
            if (i == 3) {
                qg2Var.setGravity(19);
                addView(qg2Var, tre.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                qg2Var.setPadding(0, 0, 0, hl.L(3.0f));
            } else {
                qg2Var.setRightPadding(hl.L(i2));
                qg2Var.setGravity((ob6.a0 ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z3 = ob6.a0;
                    addView(qg2Var, tre.d(-1, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 8 : 29, 0.0f, z3 ? 29 : 8, 0.0f));
                } else {
                    int i3 = a() ? 56 : 46;
                    i3 = i == 7 ? i3 + 39 : i3;
                    boolean z4 = ob6.a0;
                    addView(qg2Var, tre.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i2 : (i2 - 17) + i3, 0.0f, z4 ? (i2 - 17) + i3 : i2, 0.0f));
                }
            }
            this.e = qg2Var;
        } else {
            te1 te1Var = new te1(b, context, this);
            this.c = te1Var;
            jn7.i(te1Var);
            te1Var.setTag(Integer.valueOf(aob.v0((i == 1 || i == 5) ? aob.j5 : aob.G6, vnbVar)));
            te1Var.setTextSize(1, 16.0f);
            te1Var.setLines(1);
            te1Var.setMaxLines(1);
            te1Var.setSingleLine(true);
            te1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 7) {
                te1Var.setTypeface(hl.o());
            }
            if (i == 3) {
                te1Var.setGravity(19);
                addView(te1Var, tre.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                te1Var.setPadding(0, 0, 0, hl.L(3.0f));
            } else {
                te1Var.setGravity((ob6.a0 ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z5 = ob6.a0;
                    addView(te1Var, tre.d(-1, -2.0f, (z5 ? 5 : 3) | 16, z5 ? 8 : 29, 0.0f, z5 ? 29 : 8, 0.0f));
                } else {
                    int i4 = a() ? 56 : 46;
                    i4 = i == 7 ? i4 + 39 : i4;
                    int i5 = a() ? -2 : -1;
                    boolean z6 = ob6.a0;
                    addView(te1Var, tre.d(i5, -2.0f, (z6 ? 5 : 3) | 16, z6 ? i2 : (i2 - 17) + i4, 0.0f, z6 ? (i2 - 17) + i4 : i2, 0.0f));
                }
            }
            this.e = te1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i == 1 || i == 5) ? aob.m5 : aob.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((ob6.a0 ? 3 : 5) | 16);
        float f = i2;
        addView(textView, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        if (a()) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.r = og2Var;
            this.h = og2Var;
            og2Var.setDrawUnchecked(true);
            og2Var.a(true, false);
            og2Var.setDrawBackgroundAsArc(10);
            this.F = (byte) 21;
            boolean z7 = ob6.a0;
            addView(og2Var, tre.d(21, 21.0f, (z7 ? 5 : 3) | 48, z7 ? 0 : i2, 16.0f, z7 ? i2 : 0, 0.0f));
        } else {
            if (i != 1 && i != 5) {
                z2 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(vnbVar, context, z2);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = (byte) 18;
            if (i == 5) {
                boolean z8 = ob6.a0;
                addView(checkBoxSquare, tre.d(18, 18.0f, (z8 ? 5 : 3) | 16, z8 ? 0 : i2, 0.0f, z8 ? i2 : 0, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, tre.d(18, 18.0f, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                boolean z9 = ob6.a0;
                if (i == 2) {
                    addView(checkBoxSquare, tre.d(18, 18.0f, (z9 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
                } else {
                    addView(checkBoxSquare, tre.d(18, 18.0f, (z9 ? 5 : 3) | 48, z9 ? 0 : i2, 16.0f, z9 ? i2 : 0, 0.0f));
                }
            }
        }
        if (i == 6) {
            rg2 rg2Var = new rg2(this, context, R.drawable.msg_folders_groups);
            this.w = rg2Var;
            addView(rg2Var, tre.i(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 8) {
            rg2 rg2Var2 = new rg2(this, context, 0);
            this.w = rg2Var2;
            addView(rg2Var2, tre.i(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 7) {
            this.y = new rb0((vnb) null);
            de0 de0Var = new de0(context);
            this.x = de0Var;
            de0Var.setRoundRadius(hl.L(17.0f));
            addView(de0Var, tre.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }

    public final boolean a() {
        byte b = this.E;
        return b == 4 || b == 8 || b == 6 || b == 7;
    }

    public final boolean b() {
        og2 og2Var = this.r;
        return og2Var != null ? og2Var.a.q : this.n.h;
    }

    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.r;
        if (og2Var != null) {
            og2Var.a(z, z2);
        } else {
            this.n.a(z, z2);
        }
    }

    public final void d(k1 k1Var, t tVar) {
        View view = this.J;
        if (k1Var != null) {
            if (view == null) {
                View view2 = new View(getContext());
                this.J = view2;
                int i = aob.i6;
                vnb vnbVar = this.b;
                hf0 f0 = aob.f0(aob.v0(i, vnbVar), 2, -1);
                uob M = yob.M(i);
                view2.setBackground(f0);
                yob.j(view2, f0, null, M, vnbVar);
                addView(this.J, tre.e(-1, -1, jn7.D1));
            }
            this.J.setOnClickListener(k1Var);
        } else if (view != null) {
            removeView(view);
            this.J = null;
        }
        View view3 = this.K;
        if (tVar == null) {
            if (view3 != null) {
                removeView(view3);
                this.K = null;
                return;
            }
            return;
        }
        if (view3 == null) {
            View view4 = new View(getContext());
            this.K = view4;
            addView(view4, tre.e(56, -1, ob6.a0 ? 5 : 3));
        }
        this.K.setOnClickListener(tVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3) {
        if (this.I) {
            qg2 qg2Var = this.d;
            qg2Var.c(pv3.m(charSequence, qg2Var.getPaint().getFontMetricsInt(), false, null, 0), z3, true);
        } else {
            this.c.setText(charSequence);
        }
        og2 og2Var = this.r;
        if (og2Var != null) {
            og2Var.a(z, z3);
        } else {
            this.n.a(z, z3);
        }
        this.f.setText(str);
        this.G = z2;
        setWillNotDraw(!z2);
    }

    public final void f() {
        float f;
        View view = this.e;
        if (this.s == null) {
            return;
        }
        try {
            f = view.getMeasuredWidth();
        } catch (Exception unused) {
            f = 0.0f;
        }
        this.s.setTranslationX(ob6.a0 ? (view.getRight() - f) - hl.L(20.0f) : view.getLeft() + f + hl.L(4.0f));
    }

    public final void g() {
        boolean z = this.I;
        vnb vnbVar = this.b;
        byte b = this.E;
        if (z) {
            yob.U(this.d, (b == 1 || b == 5) ? aob.j5 : aob.G6, vnbVar);
        } else {
            int i = (b == 1 || b == 5) ? aob.j5 : aob.G6;
            te1 te1Var = this.c;
            yob.X(te1Var, i, vnbVar);
            yob.G(te1Var, (b == 1 || b == 5) ? aob.k5 : aob.J6, vnbVar);
        }
        yob.X(this.f, (b == 1 || b == 5) ? aob.m5 : aob.I6, vnbVar);
    }

    public in getAnimatedTextView() {
        return this.d;
    }

    public og2 getCheckBoxRound() {
        return this.r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.c;
    }

    public TextView getValueTextView() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G) {
            int L = hl.L(a() ? 60.0f : 20.0f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.E == 7) {
                L += hl.L(39.0f);
            }
            vnb vnbVar = this.b;
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : null;
            if (d == null) {
                d = aob.j0;
            }
            Paint paint = d;
            float f = ob6.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!ob6.a0) {
                L = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        qg2 qg2Var = this.d;
        if (qg2Var != null) {
            accessibilityNodeInfo.setText(qg2Var.getText());
        } else {
            te1 te1Var = this.c;
            if (te1Var != null) {
                accessibilityNodeInfo.setText(te1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        View view = this.h;
        byte b = this.F;
        View view2 = this.e;
        TextView textView = this.f;
        byte b2 = this.E;
        if (b2 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(hl.L(10.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - hl.L(34.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_31));
            float f = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(f), TLObject.FLAG_30));
            setMeasuredDimension(hl.L(29.0f) + view2.getMeasuredWidth(), hl.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - hl.L(a() ? 60.0f : 34.0f);
            if (this.I) {
                measuredWidth += (int) this.d.getRightPadding();
            }
            if (b2 == 7) {
                measuredWidth -= hl.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i3 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            int measuredWidth2 = textView.getMeasuredWidth();
            rg2 rg2Var = this.w;
            if (rg2Var != null) {
                rg2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = c00.A(11.0f, rg2Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(ik8.f(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(ik8.f(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            de0 de0Var = this.x;
            if (de0Var != null) {
                de0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), TLObject.FLAG_30));
            }
            float f2 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(f2), TLObject.FLAG_30));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), TLObject.FLAG_30));
        }
    }

    public void setCollapsed(Boolean bool) {
        View view = this.s;
        if (bool == null) {
            if (view != null) {
                removeView(view);
                this.s = null;
                return;
            }
            return;
        }
        if (view == null) {
            this.s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            yob.x(this, mutate, aob.G6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, tre.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(k43.h).start();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.e.setAlpha(z ? 1.0f : 0.5f);
        this.f.setAlpha(z ? 1.0f : 0.5f);
        this.h.setAlpha(z ? 1.0f : 0.5f);
    }

    public void setIcon(int i) {
        this.r.setIcon(i);
    }

    public void setMultiline(boolean z) {
        if (this.I) {
            return;
        }
        this.H = z;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z2 = this.H;
        te1 te1Var = this.c;
        if (z2) {
            te1Var.setLines(0);
            te1Var.setMaxLines(0);
            te1Var.setSingleLine(false);
            te1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            te1Var.setLines(1);
            te1Var.setMaxLines(1);
            te1Var.setSingleLine(true);
            te1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = hl.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z) {
        this.G = z;
    }

    public void setPad(int i) {
        int L = hl.L(i * 40 * (ob6.a0 ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f = L;
        this.e.setTranslationX(f);
        de0 de0Var = this.x;
        if (de0Var != null) {
            de0Var.setTranslationX(f);
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setTranslationX(f);
        }
        View view3 = this.K;
        if (view3 != null) {
            view3.setTranslationX(f);
        }
    }

    public void setTextColor(int i) {
        if (this.I) {
            qg2 qg2Var = this.d;
            yob.q(qg2Var);
            qg2Var.setTextColor(i);
            return;
        }
        te1 te1Var = this.c;
        yob.q(te1Var);
        te1Var.setTextColor(i);
        byte b = this.E;
        int i2 = (b == 1 || b == 5) ? aob.k5 : aob.J6;
        if (te1Var.getLinkTextColors() != null) {
            int defaultColor = te1Var.getLinkTextColors().getDefaultColor();
            vnb vnbVar = this.b;
            if (defaultColor == aob.v0(i2, vnbVar)) {
                yob.G(te1Var, i2, vnbVar);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        rb0 rb0Var = this.y;
        rb0Var.k(tLObject);
        this.x.f(tLObject, rb0Var);
        boolean z = tLObject instanceof TLRPC.User;
        String r = z ? lbc.r((TLRPC.User) tLObject) : lv2.o(tLObject);
        if (z && ((TLRPC.User) tLObject).id == uc7.s1(yac.t0).M3) {
            r = ob6.M0(2131752435, null);
        }
        if (!this.I) {
            this.c.setText(r);
        } else {
            qg2 qg2Var = this.d;
            qg2Var.setText(pv3.m(r, qg2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public sg2(Context context, int i) {
        this(context, i, 17, false, null);
    }

    public sg2(int i, vnb vnbVar, Context context) {
        this(context, i, 17, false, vnbVar);
    }
}
