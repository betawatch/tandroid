package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import bi.s5;
import c8.ma;
import java.util.Iterator;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m2 extends j {
    public boolean A0;
    public String B0;
    public final l2 r0;
    public sg.h1 s0;
    public int t0;
    public int u0;
    public int v0;
    public sg.a0 w0;
    public int x0;
    public int y0;
    public Runnable z0;

    public m2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.h1 h1Var, int i10) {
        super(context, pointF);
        this.w0 = sg.a0.e;
        this.u0 = i7;
        l2 l2Var = new l2(this, context);
        this.r0 = l2Var;
        ks.i(l2Var);
        l2Var.setGravity(19);
        l2Var.setBackgroundColor(0);
        l2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        l2Var.setClickable(false);
        l2Var.setEnabled(false);
        l2Var.setCursorColor(-1);
        l2Var.setTextSize(0, this.u0);
        l2Var.setCursorSize(org.telegram.messenger.g0.L(this.u0 * 0.4f));
        l2Var.setText(charSequence);
        s();
        l2Var.setTextColor(h1Var.a);
        l2Var.setTypeface(null, 1);
        l2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            l2Var.setImeOptions(285212672);
        } else {
            l2Var.setImeOptions(TLObject.FLAG_28);
        }
        l2Var.setFocusableInTouchMode(true);
        l2Var.setInputType(TLObject.FLAG_14);
        l2Var.setSingleLine(false);
        addView(l2Var, ma.e(-2, -2, 51));
        if (i11 >= 29) {
            l2Var.setBreakStrategy(0);
        } else {
            l2Var.setBreakStrategy(0);
        }
        setSwatch(h1Var);
        setType(i10);
        k();
        l2Var.addTextChangedListener(new s5(3, this));
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
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yi0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        l2 l2Var = this.r0;
        return new yi0(y10, (positionY - (((L2 - l2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + y10) - y10, (L2 - l2Var.getExtendedPaddingBottom()) * scaleX);
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
        l2 l2Var = this.r0;
        l2Var.setEnabled(true);
        l2Var.setClickable(true);
        l2Var.requestFocus();
        l2Var.setSelection(l2Var.getText().length());
        org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(this, 21), 300L);
    }

    public final void r() {
        l2 l2Var = this.r0;
        l2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i7 = this.s0.a;
        int i10 = this.t0;
        if (i10 == 0) {
            l2Var.setFrameColor(i7);
            i7 = org.telegram.messenger.g0.B(this.s0.a) >= 0.721f ? -16777216 : -1;
        } else if (i10 == 1) {
            l2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i10 == 2) {
            l2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -16777216 : -1);
        } else {
            l2Var.setFrameColor(0);
        }
        l2Var.setTextColor(i7);
        l2Var.setCursorColor(i7);
        l2Var.setHandlesColor(i7);
        l2Var.setHighlightColor(n6.r1(0.4f, i7));
    }

    public final void s() {
        l2 l2Var = this.r0;
        if (l2Var.getText().length() > 0) {
            l2Var.setHint((CharSequence) null);
        } else {
            l2Var.setHint(gd.M0(2131743958, null));
            l2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i7) {
        this.v0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.u0 = i7;
        float f10 = i7;
        l2 l2Var = this.r0;
        l2Var.setTextSize(0, f10);
        l2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (l2Var.getText() != null) {
            Editable text = l2Var.getText();
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
            for (x5 x5Var : (x5[]) text.getSpans(0, text.length(), x5.class)) {
                x5Var.replaceFontMetrics(getFontMetricsInt());
            }
            l2Var.q();
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

    public m2(Context context, m2 m2Var, PointF pointF) {
        this(context, pointF, m2Var.u0, m2Var.getText(), m2Var.getSwatch(), m2Var.t0);
        setRotation(m2Var.getRotation());
        setScale(m2Var.getScale());
        setTypeface(m2Var.getTypeface());
        setAlign(m2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.r0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !gd.a0 : gd.a0) {
            i7 = 3;
        }
        this.r0.setTextAlignment(i7);
    }
}
