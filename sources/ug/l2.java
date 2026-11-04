package ug;

import ai.w3;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import java.util.Iterator;
import org.telegram.messenger.bd;
import org.telegram.messenger.f6;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l2 extends j {
    public boolean A0;
    public String B0;
    public final k2 r0;
    public tg.h1 s0;
    public int t0;
    public int u0;
    public int v0;
    public tg.b0 w0;
    public int x0;
    public int y0;
    public Runnable z0;

    public l2(Context context, PointF pointF, int i3, CharSequence charSequence, tg.h1 h1Var, int i10) {
        super(context, pointF);
        this.w0 = tg.b0.e;
        this.u0 = i3;
        k2 k2Var = new k2(this, context);
        this.r0 = k2Var;
        hs.i(k2Var);
        k2Var.setGravity(19);
        k2Var.setBackgroundColor(0);
        k2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        k2Var.setClickable(false);
        k2Var.setEnabled(false);
        k2Var.setCursorColor(-1);
        k2Var.setTextSize(0, this.u0);
        k2Var.setCursorSize(org.telegram.messenger.g0.L(this.u0 * 0.4f));
        k2Var.setText(charSequence);
        s();
        k2Var.setTextColor(h1Var.a);
        k2Var.setTypeface(null, 1);
        k2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            k2Var.setImeOptions(285212672);
        } else {
            k2Var.setImeOptions(TLObject.FLAG_28);
        }
        k2Var.setFocusableInTouchMode(true);
        k2Var.setInputType(TLObject.FLAG_14);
        k2Var.setSingleLine(false);
        addView(k2Var, mf.e(-2, -2, 51));
        if (i11 >= 29) {
            k2Var.setBreakStrategy(0);
        } else {
            k2Var.setBreakStrategy(0);
        }
        setSwatch(h1Var);
        setType(i10);
        k();
        k2Var.addTextChangedListener(new w3(3, this));
    }

    @Override // ug.j
    public final i a() {
        return new i0(this, getContext());
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

    @Override // ug.j
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ni0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        k2 k2Var = this.r0;
        return new ni0(x10, (positionY - (((L2 - k2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + x10) - x10, (L2 - k2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // ug.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // ug.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // ug.j
    public float getStickyPaddingRight() {
        RectF rectF = this.r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // ug.j
    public float getStickyPaddingTop() {
        RectF rectF = this.r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public tg.h1 getSwatch() {
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

    public tg.b0 getTypeface() {
        return this.w0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        k();
    }

    public final void q() {
        k2 k2Var = this.r0;
        k2Var.setEnabled(true);
        k2Var.setClickable(true);
        k2Var.requestFocus();
        k2Var.setSelection(k2Var.getText().length());
        org.telegram.messenger.g0.i3(new r4.u(this, 16), 300L);
    }

    public final void r() {
        k2 k2Var = this.r0;
        k2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i3 = this.s0.a;
        int i10 = this.t0;
        if (i10 == 0) {
            k2Var.setFrameColor(i3);
            i3 = org.telegram.messenger.g0.B(this.s0.a) >= 0.721f ? -16777216 : -1;
        } else if (i10 == 1) {
            k2Var.setFrameColor(org.telegram.messenger.g0.B(i3) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i10 == 2) {
            k2Var.setFrameColor(org.telegram.messenger.g0.B(i3) >= 0.25f ? -16777216 : -1);
        } else {
            k2Var.setFrameColor(0);
        }
        k2Var.setTextColor(i3);
        k2Var.setCursorColor(i3);
        k2Var.setHandlesColor(i3);
        k2Var.setHighlightColor(k6.r1(0.4f, i3));
    }

    public final void s() {
        k2 k2Var = this.r0;
        if (k2Var.getText().length() > 0) {
            k2Var.setHint((CharSequence) null);
        } else {
            k2Var.setHint(bd.M0(2131744203, null));
            k2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i3) {
        this.v0 = i3;
    }

    public void setBaseFontSize(int i3) {
        this.u0 = i3;
        float f10 = i3;
        k2 k2Var = this.r0;
        k2Var.setTextSize(0, f10);
        k2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (k2Var.getText() != null) {
            Editable text = k2Var.getText();
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
            for (p5 p5Var : (p5[]) text.getSpans(0, text.length(), p5.class)) {
                p5Var.replaceFontMetrics(getFontMetricsInt());
            }
            k2Var.q();
        }
    }

    public void setMaxWidth(int i3) {
        this.r0.setMaxWidth(i3);
    }

    public void setSwatch(tg.h1 h1Var) {
        this.s0 = new tg.h1(h1Var.b, h1Var.c, h1Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.r0.setText(charSequence);
        s();
    }

    public void setType(int i3) {
        this.t0 = i3;
        r();
    }

    public void setTypeface(tg.b0 b0Var) {
        this.w0 = b0Var;
        if (b0Var != null) {
            this.r0.setTypeface(b0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = tg.b0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            tg.b0 b0Var = (tg.b0) it.next();
            if (b0Var.a.equals(str)) {
                setTypeface(b0Var);
                str = null;
                break;
            }
        }
        this.B0 = str;
        m();
    }

    public l2(Context context, l2 l2Var, PointF pointF) {
        this(context, pointF, l2Var.u0, l2Var.getText(), l2Var.getSwatch(), l2Var.t0);
        setRotation(l2Var.getRotation());
        setScale(l2Var.getScale());
        setTypeface(l2Var.getTypeface());
        setAlign(l2Var.getAlign());
        int align = getAlign();
        int i3 = 2;
        this.r0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i3 = 4;
        } else if (align2 == 2 ? !bd.a0 : bd.a0) {
            i3 = 3;
        }
        this.r0.setTextAlignment(i3);
    }
}
