// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class xjb extends w44 {
    public Runnable A0;
    public boolean B0;
    public String C0;
    public final wjb s0;
    public oeb t0;
    public int u0;
    public int v0;
    public int w0;
    public ru7 x0;
    public int y0;
    public int z0;

    public xjb(Context context, PointF pointF, int i, CharSequence charSequence, oeb oebVar, int i2) {
        super(context, pointF);
        this.x0 = ru7.e;
        this.v0 = i;
        wjb wjbVar = new wjb(this, context);
        this.s0 = wjbVar;
        nm7.i(wjbVar);
        wjbVar.setGravity(19);
        wjbVar.setBackgroundColor(0);
        wjbVar.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        wjbVar.setClickable(false);
        wjbVar.setEnabled(false);
        wjbVar.setCursorColor(-1);
        wjbVar.setTextSize(0, this.v0);
        wjbVar.setCursorSize(gm.L(this.v0 * 0.4f));
        wjbVar.setText(charSequence);
        t();
        wjbVar.setTextColor(oebVar.a);
        wjbVar.setTypeface(null, 1);
        wjbVar.setHorizontallyScrolling(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            wjbVar.setImeOptions(285212672);
        } else {
            wjbVar.setImeOptions(TLObject.FLAG_28);
        }
        wjbVar.setFocusableInTouchMode(true);
        wjbVar.setInputType(TLObject.FLAG_14);
        wjbVar.setSingleLine(false);
        addView(wjbVar, qoe.e(-2, -2, 51));
        if (i3 >= 29) {
            wjbVar.setBreakStrategy(0);
        } else {
            wjbVar.setBreakStrategy(0);
        }
        setSwatch(oebVar);
        setType(i2);
        k();
        wjbVar.addTextChangedListener(new ef6((View) this, (byte) 2));
    }

    @Override // w44
    public final v44 a() {
        return new n66(this, getContext());
    }

    public int getAlign() {
        return this.w0;
    }

    public int getBaseFontSize() {
        return this.v0;
    }

    public dv3 getEditText() {
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

    @Override // w44
    public o49 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new o49();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (gm.L(64.0f) / scaleX) + (getScale() * getSelectionWidth());
        float L2 = (gm.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float e = hg9.e(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        wjb wjbVar = this.s0;
        return new o49(e, (positionY - (((L2 - wjbVar.getExtendedPaddingTop()) - gm.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + e) - e, (L2 - wjbVar.getExtendedPaddingBottom()) * scaleX);
    }

    public float getSelectionWidth() {
        return getMeasuredWidth();
    }

    @Override // w44
    public float getStickyPaddingBottom() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // w44
    public float getStickyPaddingLeft() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // w44
    public float getStickyPaddingRight() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // w44
    public float getStickyPaddingTop() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public oeb getSwatch() {
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

    public ru7 getTypeface() {
        return this.x0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    public void q() {
        wjb wjbVar = this.s0;
        wjbVar.setEnabled(true);
        wjbVar.setClickable(true);
        wjbVar.requestFocus();
        wjbVar.setSelection(wjbVar.getText().length());
        gm.d3(new zcb(this, (byte) 6), 300L);
    }

    public void r() {
        wjb wjbVar = this.s0;
        wjbVar.clearFocus();
        wjbVar.setEnabled(false);
        wjbVar.setClickable(false);
        m();
    }

    public void s() {
        wjb wjbVar = this.s0;
        wjbVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i = this.t0.a;
        int i2 = this.u0;
        if (i2 == 0) {
            wjbVar.setFrameColor(i);
            i = gm.B(this.t0.a) >= 0.721f ? -16777216 : -1;
        } else if (i2 == 1) {
            wjbVar.setFrameColor(gm.B(i) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i2 == 2) {
            wjbVar.setFrameColor(gm.B(i) >= 0.25f ? -16777216 : -1);
        } else {
            wjbVar.setFrameColor(0);
        }
        wjbVar.setTextColor(i);
        wjbVar.setCursorColor(i);
        wjbVar.setHandlesColor(i);
        wjbVar.setHighlightColor(cmb.p1(0.4f, i));
    }

    public void setAlign(int i) {
        this.w0 = i;
    }

    public void setBaseFontSize(int i) {
        this.v0 = i;
        float f = i;
        wjb wjbVar = this.s0;
        wjbVar.setTextSize(0, f);
        wjbVar.setCursorSize(gm.L(f * 0.4f));
        if (wjbVar.getText() != null) {
            Editable text = wjbVar.getText();
            dw3[] dw3VarArr = (dw3[]) text.getSpans(0, text.length(), dw3.class);
            for (int i2 = 0; i2 < dw3VarArr.length; i2++) {
                dw3 dw3Var = dw3VarArr[i2];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                dw3Var.a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(dw3Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                    dw3Var.c = abs;
                    if (abs == 0) {
                        dw3Var.c = gm.L(20.0f);
                    }
                }
                dw3VarArr[i2].b = 0.85f;
            }
            for (gn gnVar : (gn[]) text.getSpans(0, text.length(), gn.class)) {
                gnVar.replaceFontMetrics(getFontMetricsInt());
            }
            wjbVar.q();
        }
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setSwatch(oeb oebVar) {
        this.t0 = new oeb(oebVar.b, oebVar.c, oebVar.a);
        s();
    }

    public void setText(CharSequence charSequence) {
        this.s0.setText(charSequence);
        t();
    }

    public void setType(int i) {
        this.u0 = i;
        s();
    }

    public void setTypeface(String str) {
        Iterator it = ru7.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ru7 ru7Var = (ru7) it.next();
            if (ru7Var.a.equals(str)) {
                setTypeface(ru7Var);
                str = null;
                break;
            }
        }
        this.C0 = str;
        m();
    }

    public void t() {
        wjb wjbVar = this.s0;
        if (wjbVar.getText().length() > 0) {
            wjbVar.setHint((CharSequence) null);
        } else {
            wjbVar.setHint(jb6.M0(2131743878, null));
            wjbVar.setHintTextColor(1627389951);
        }
    }

    public void setTypeface(ru7 ru7Var) {
        this.x0 = ru7Var;
        if (ru7Var != null) {
            this.s0.setTypeface(ru7Var.b());
        }
        m();
    }

    public xjb(Context context, xjb xjbVar, PointF pointF) {
        this(context, pointF, xjbVar.v0, xjbVar.getText(), xjbVar.getSwatch(), xjbVar.u0);
        setRotation(xjbVar.getRotation());
        setScale(xjbVar.getScale());
        setTypeface(xjbVar.getTypeface());
        setAlign(xjbVar.getAlign());
        int align = getAlign();
        int i = 2;
        this.s0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 != 1) {
            boolean z = jb6.a0;
            if (align2 == 2 ? !z : z) {
                i = 3;
            }
        } else {
            i = 4;
        }
        this.s0.setTextAlignment(i);
    }
}
