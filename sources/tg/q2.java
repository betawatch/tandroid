package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import bi.y5;
import c8.na;
import java.util.Iterator;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.x5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class q2 extends n {
    public Runnable A0;
    public boolean B0;
    public String C0;
    public final p2 s0;
    public sg.g1 t0;
    public int u0;
    public int v0;
    public int w0;
    public sg.a0 x0;
    public int y0;
    public int z0;

    public q2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.g1 g1Var, int i10) {
        super(context, pointF);
        this.x0 = sg.a0.e;
        this.v0 = i7;
        p2 p2Var = new p2(this, context);
        this.s0 = p2Var;
        ks.i(p2Var);
        p2Var.setGravity(19);
        p2Var.setBackgroundColor(0);
        p2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        p2Var.setClickable(false);
        p2Var.setEnabled(false);
        p2Var.setCursorColor(-1);
        p2Var.setTextSize(0, this.v0);
        p2Var.setCursorSize(org.telegram.messenger.g0.L(this.v0 * 0.4f));
        p2Var.setText(charSequence);
        t();
        p2Var.setTextColor(g1Var.a);
        p2Var.setTypeface(null, 1);
        p2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            p2Var.setImeOptions(285212672);
        } else {
            p2Var.setImeOptions(TLObject.FLAG_28);
        }
        p2Var.setFocusableInTouchMode(true);
        p2Var.setInputType(TLObject.FLAG_14);
        p2Var.setSingleLine(false);
        addView(p2Var, na.e(-2, -2, 51));
        if (i11 >= 29) {
            p2Var.setBreakStrategy(0);
        } else {
            p2Var.setBreakStrategy(0);
        }
        setSwatch(g1Var);
        setType(i10);
        k();
        p2Var.addTextChangedListener(new y5(3, this));
    }

    @Override // tg.n
    public final m a() {
        return new o0(this, getContext());
    }

    public int getAlign() {
        return this.w0;
    }

    public int getBaseFontSize() {
        return this.v0;
    }

    public f getEditText() {
        return this.s0;
    }

    public View getFocusedView() {
        return this.s0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.s0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.s0.getTextSize();
    }

    @Override // tg.n
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getSelectionWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        p2 p2Var = this.s0;
        return new aj0(y10, (positionY - (((L2 - p2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + y10) - y10, (L2 - p2Var.getExtendedPaddingBottom()) * scaleX);
    }

    public float getSelectionWidth() {
        return getMeasuredWidth();
    }

    @Override // tg.n
    public float getStickyPaddingBottom() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // tg.n
    public float getStickyPaddingLeft() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // tg.n
    public float getStickyPaddingRight() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // tg.n
    public float getStickyPaddingTop() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public sg.g1 getSwatch() {
        return this.t0;
    }

    public CharSequence getText() {
        return this.s0.getText();
    }

    public int getTextSize() {
        return (int) this.s0.getTextSize();
    }

    public int getType() {
        return this.u0;
    }

    public sg.a0 getTypeface() {
        return this.x0;
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

    public void q() {
        p2 p2Var = this.s0;
        p2Var.setEnabled(true);
        p2Var.setClickable(true);
        p2Var.requestFocus();
        p2Var.setSelection(p2Var.getText().length());
        org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(this, 22), 300L);
    }

    public void r() {
        p2 p2Var = this.s0;
        p2Var.clearFocus();
        p2Var.setEnabled(false);
        p2Var.setClickable(false);
        m();
    }

    public void s() {
        p2 p2Var = this.s0;
        p2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i7 = this.t0.a;
        int i10 = this.u0;
        if (i10 == 0) {
            p2Var.setFrameColor(i7);
            i7 = org.telegram.messenger.g0.B(this.t0.a) >= 0.721f ? -16777216 : -1;
        } else if (i10 == 1) {
            p2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i10 == 2) {
            p2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -16777216 : -1);
        } else {
            p2Var.setFrameColor(0);
        }
        p2Var.setTextColor(i7);
        p2Var.setCursorColor(i7);
        p2Var.setHandlesColor(i7);
        p2Var.setHighlightColor(n6.r1(0.4f, i7));
    }

    public void setAlign(int i7) {
        this.w0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.v0 = i7;
        float f10 = i7;
        p2 p2Var = this.s0;
        p2Var.setTextSize(0, f10);
        p2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (p2Var.getText() != null) {
            Editable text = p2Var.getText();
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
            p2Var.q();
        }
    }

    public void setMaxWidth(int i7) {
        this.s0.setMaxWidth(i7);
    }

    public void setSwatch(sg.g1 g1Var) {
        this.t0 = new sg.g1(g1Var.b, g1Var.c, g1Var.a);
        s();
    }

    public void setText(CharSequence charSequence) {
        this.s0.setText(charSequence);
        t();
    }

    public void setType(int i7) {
        this.u0 = i7;
        s();
    }

    public void setTypeface(sg.a0 a0Var) {
        this.x0 = a0Var;
        if (a0Var != null) {
            this.s0.setTypeface(a0Var.d());
        }
        m();
    }

    public void t() {
        p2 p2Var = this.s0;
        if (p2Var.getText().length() > 0) {
            p2Var.setHint((CharSequence) null);
        } else {
            p2Var.setHint(gd.N0(2131743948, null));
            p2Var.setHintTextColor(1627389951);
        }
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
        this.C0 = str;
        m();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.v0, q2Var.getText(), q2Var.getSwatch(), q2Var.u0);
        setRotation(q2Var.getRotation());
        setScale(q2Var.getScale());
        setTypeface(q2Var.getTypeface());
        setAlign(q2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.s0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !gd.a0 : gd.a0) {
            i7 = 3;
        }
        this.s0.setTextAlignment(i7);
    }
}
