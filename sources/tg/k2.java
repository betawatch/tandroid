package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import c8.ha;
import java.util.Iterator;
import org.telegram.messenger.f6;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k2 extends j {
    public String A0;
    public final j2 q0;
    public sg.j1 r0;
    public int s0;
    public int t0;
    public int u0;
    public sg.b0 v0;
    public int w0;
    public int x0;
    public Runnable y0;
    public boolean z0;

    public k2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.j1 j1Var, int i10) {
        super(context, pointF);
        this.v0 = sg.b0.e;
        this.t0 = i7;
        j2 j2Var = new j2(this, context);
        this.q0 = j2Var;
        qs.i(j2Var);
        j2Var.setGravity(19);
        j2Var.setBackgroundColor(0);
        j2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        j2Var.setClickable(false);
        j2Var.setEnabled(false);
        j2Var.setCursorColor(-1);
        j2Var.setTextSize(0, this.t0);
        j2Var.setCursorSize(org.telegram.messenger.g0.L(this.t0 * 0.4f));
        j2Var.setText(charSequence);
        s();
        j2Var.setTextColor(j1Var.a);
        j2Var.setTypeface(null, 1);
        j2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            j2Var.setImeOptions(285212672);
        } else {
            j2Var.setImeOptions(TLObject.FLAG_28);
        }
        j2Var.setFocusableInTouchMode(true);
        j2Var.setInputType(TLObject.FLAG_14);
        j2Var.setSingleLine(false);
        addView(j2Var, ha.e(-2, -2, 51));
        if (i11 >= 29) {
            j2Var.setBreakStrategy(0);
        } else {
            j2Var.setBreakStrategy(0);
        }
        setSwatch(j1Var);
        setType(i10);
        k();
        j2Var.addTextChangedListener(new tb0(2, this));
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAlign() {
        return this.u0;
    }

    public int getBaseFontSize() {
        return this.t0;
    }

    public b getEditText() {
        return this.q0;
    }

    public View getFocusedView() {
        return this.q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.q0.getTextSize();
    }

    @Override // tg.j
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ki0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        j2 j2Var = this.q0;
        return new ki0(x10, (positionY - (((L2 - j2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + x10) - x10, (L2 - j2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // tg.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // tg.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // tg.j
    public float getStickyPaddingRight() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // tg.j
    public float getStickyPaddingTop() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public sg.j1 getSwatch() {
        return this.r0;
    }

    public CharSequence getText() {
        return this.q0.getText();
    }

    public int getTextSize() {
        return (int) this.q0.getTextSize();
    }

    public int getType() {
        return this.s0;
    }

    public sg.b0 getTypeface() {
        return this.v0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public final void q() {
        j2 j2Var = this.q0;
        j2Var.setEnabled(true);
        j2Var.setClickable(true);
        j2Var.requestFocus();
        j2Var.setSelection(j2Var.getText().length());
        org.telegram.messenger.g0.i3(new sg.t0(this, 8), 300L);
    }

    public final void r() {
        j2 j2Var = this.q0;
        j2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i7 = this.r0.a;
        int i10 = this.s0;
        if (i10 == 0) {
            j2Var.setFrameColor(i7);
            i7 = org.telegram.messenger.g0.B(this.r0.a) >= 0.721f ? -16777216 : -1;
        } else if (i10 == 1) {
            j2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i10 == 2) {
            j2Var.setFrameColor(org.telegram.messenger.g0.B(i7) >= 0.25f ? -16777216 : -1);
        } else {
            j2Var.setFrameColor(0);
        }
        j2Var.setTextColor(i7);
        j2Var.setCursorColor(i7);
        j2Var.setHandlesColor(i7);
        j2Var.setHighlightColor(k6.r1(0.4f, i7));
    }

    public final void s() {
        j2 j2Var = this.q0;
        if (j2Var.getText().length() > 0) {
            j2Var.setHint((CharSequence) null);
        } else {
            j2Var.setHint(hd.M0(2131744194, null));
            j2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i7) {
        this.u0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.t0 = i7;
        float f10 = i7;
        j2 j2Var = this.q0;
        j2Var.setTextSize(0, f10);
        j2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (j2Var.getText() != null) {
            Editable text = j2Var.getText();
            f6[] f6VarArr = (f6[]) text.getSpans(0, text.length(), f6.class);
            for (int i10 = 0; i10 < f6VarArr.length; i10++) {
                f6 f6Var = f6VarArr[i10];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                f6Var.a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(f6Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                    f6Var.c = abs;
                    if (abs == 0) {
                        f6Var.c = org.telegram.messenger.g0.L(20.0f);
                    }
                }
                f6VarArr[i10].b = 0.85f;
            }
            for (r5 r5Var : (r5[]) text.getSpans(0, text.length(), r5.class)) {
                r5Var.replaceFontMetrics(getFontMetricsInt());
            }
            j2Var.q();
        }
    }

    public void setMaxWidth(int i7) {
        this.q0.setMaxWidth(i7);
    }

    public void setSwatch(sg.j1 j1Var) {
        this.r0 = new sg.j1(j1Var.b, j1Var.c, j1Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.q0.setText(charSequence);
        s();
    }

    public void setType(int i7) {
        this.s0 = i7;
        r();
    }

    public void setTypeface(sg.b0 b0Var) {
        this.v0 = b0Var;
        if (b0Var != null) {
            this.q0.setTypeface(b0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = sg.b0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            sg.b0 b0Var = (sg.b0) it.next();
            if (b0Var.a.equals(str)) {
                setTypeface(b0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public k2(Context context, k2 k2Var, PointF pointF) {
        this(context, pointF, k2Var.t0, k2Var.getText(), k2Var.getSwatch(), k2Var.s0);
        setRotation(k2Var.getRotation());
        setScale(k2Var.getScale());
        setTypeface(k2Var.getTypeface());
        setAlign(k2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !hd.a0 : hd.a0) {
            i7 = 3;
        }
        this.q0.setTextAlignment(i7);
    }
}
