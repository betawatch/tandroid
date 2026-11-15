package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import bi.l3;
import c8.ja;
import java.util.Iterator;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o2 extends j {
    public boolean A0;
    public String B0;
    public final n2 r0;
    public sg.h1 s0;
    public int t0;
    public int u0;
    public int v0;
    public sg.a0 w0;
    public int x0;
    public int y0;
    public Runnable z0;

    public o2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.h1 h1Var, int i10) {
        super(context, pointF);
        this.w0 = sg.a0.e;
        this.u0 = i7;
        n2 n2Var = new n2(this, context);
        this.r0 = n2Var;
        ns.i(n2Var);
        n2Var.setGravity(19);
        n2Var.setBackgroundColor(0);
        n2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        n2Var.setClickable(false);
        n2Var.setEnabled(false);
        n2Var.setCursorColor(-1);
        n2Var.setTextSize(0, this.u0);
        n2Var.setCursorSize(org.telegram.messenger.g0.L(this.u0 * 0.4f));
        n2Var.setText(charSequence);
        s();
        n2Var.setTextColor(h1Var.a);
        n2Var.setTypeface(null, 1);
        n2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            n2Var.setImeOptions(285212672);
        } else {
            n2Var.setImeOptions(TLObject.FLAG_28);
        }
        n2Var.setFocusableInTouchMode(true);
        n2Var.setInputType(TLObject.FLAG_14);
        n2Var.setSingleLine(false);
        addView(n2Var, ja.e(-2, -2, 51));
        if (i11 >= 29) {
            n2Var.setBreakStrategy(0);
        } else {
            n2Var.setBreakStrategy(0);
        }
        setSwatch(h1Var);
        setType(i10);
        k();
        n2Var.addTextChangedListener(new l3(3, this));
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAlign() {
        return this.v0;
    }

    public int getBaseFontSize() {
        return this.u0;
    }

    public b getEditText() {
        return this.r0;
    }

    public View getFocusedView() {
        return this.r0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.r0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.r0.getTextSize();
    }

    @Override // tg.j
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new pi0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = i20.x(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        n2 n2Var = this.r0;
        return new pi0(x10, (positionY - (((L2 - n2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + x10) - x10, (L2 - n2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // tg.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // tg.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // tg.j
    public float getStickyPaddingRight() {
        RectF rectF = this.r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // tg.j
    public float getStickyPaddingTop() {
        RectF rectF = this.r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public sg.h1 getSwatch() {
        return this.s0;
    }

    public CharSequence getText() {
        return this.r0.getText();
    }

    public int getTextSize() {
        return (int) this.r0.getTextSize();
    }

    public int getType() {
        return this.t0;
    }

    public sg.a0 getTypeface() {
        return this.w0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public final void q() {
        n2 n2Var = this.r0;
        n2Var.setEnabled(true);
        n2Var.setClickable(true);
        n2Var.requestFocus();
        n2Var.setSelection(n2Var.getText().length());
        org.telegram.messenger.g0.i3(new q2.d(this, 18), 300L);
    }

    public final void r() {
        n2 n2Var = this.r0;
        n2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i7 = this.s0.a;
        int i10 = this.t0;
        if (i10 == 0) {
            n2Var.setFrameColor(i7);
            i7 = org.telegram.messenger.g0.B(this.s0.a) >= 0.721f ? -16777216 : -1;
        } else if (i10 == 1) {
            n2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i10 == 2) {
            n2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -16777216 : -1);
        } else {
            n2Var.setFrameColor(0);
        }
        n2Var.setTextColor(i7);
        n2Var.setCursorColor(i7);
        n2Var.setHandlesColor(i7);
        n2Var.setHighlightColor(j6.r1(0.4f, i7));
    }

    public final void s() {
        n2 n2Var = this.r0;
        if (n2Var.getText().length() > 0) {
            n2Var.setHint((CharSequence) null);
        } else {
            n2Var.setHint(hd.M0(2131744193, null));
            n2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i7) {
        this.v0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.u0 = i7;
        float f10 = i7;
        n2 n2Var = this.r0;
        n2Var.setTextSize(0, f10);
        n2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (n2Var.getText() != null) {
            Editable text = n2Var.getText();
            g6[] g6VarArr = (g6[]) text.getSpans(0, text.length(), g6.class);
            for (int i10 = 0; i10 < g6VarArr.length; i10++) {
                g6 g6Var = g6VarArr[i10];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                g6Var.a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(g6Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                    g6Var.c = abs;
                    if (abs == 0) {
                        g6Var.c = org.telegram.messenger.g0.L(20.0f);
                    }
                }
                g6VarArr[i10].b = 0.85f;
            }
            for (p5 p5Var : (p5[]) text.getSpans(0, text.length(), p5.class)) {
                p5Var.replaceFontMetrics(getFontMetricsInt());
            }
            n2Var.q();
        }
    }

    public void setMaxWidth(int i7) {
        this.r0.setMaxWidth(i7);
    }

    public void setSwatch(sg.h1 h1Var) {
        this.s0 = new sg.h1(h1Var.b, h1Var.c, h1Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.r0.setText(charSequence);
        s();
    }

    public void setType(int i7) {
        this.t0 = i7;
        r();
    }

    public void setTypeface(sg.a0 a0Var) {
        this.w0 = a0Var;
        if (a0Var != null) {
            this.r0.setTypeface(a0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = sg.a0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            sg.a0 a0Var = (sg.a0) it.next();
            if (a0Var.a.equals(str)) {
                setTypeface(a0Var);
                str = null;
                break;
            }
        }
        this.B0 = str;
        m();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.u0, o2Var.getText(), o2Var.getSwatch(), o2Var.t0);
        setRotation(o2Var.getRotation());
        setScale(o2Var.getScale());
        setTypeface(o2Var.getTypeface());
        setAlign(o2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.r0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !hd.a0 : hd.a0) {
            i7 = 3;
        }
        this.r0.setTextAlignment(i7);
    }
}
