package yf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import g7.e6;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.ud0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v2 extends j {
    public final u2 m0;
    public xf.q1 n0;
    public int o0;
    public int p0;
    public int q0;
    public xf.i0 r0;
    public int s0;
    public int t0;
    public Runnable u0;
    public boolean v0;
    public String w0;

    public v2(Context context, PointF pointF, int i9, CharSequence charSequence, xf.q1 q1Var, int i10) {
        super(context, pointF);
        this.r0 = xf.i0.e;
        this.p0 = i9;
        u2 u2Var = new u2(this, context);
        this.m0 = u2Var;
        NotificationCenter.listenEmojiLoading(u2Var);
        u2Var.setGravity(19);
        u2Var.setBackgroundColor(0);
        u2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        u2Var.setClickable(false);
        u2Var.setEnabled(false);
        u2Var.setCursorColor(-1);
        u2Var.setTextSize(0, this.p0);
        u2Var.setCursorSize(AndroidUtilities.dp(this.p0 * 0.4f));
        u2Var.setText(charSequence);
        s();
        u2Var.setTextColor(q1Var.a);
        u2Var.setTypeface(null, 1);
        u2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            u2Var.setImeOptions(285212672);
        } else {
            u2Var.setImeOptions(TLObject.FLAG_28);
        }
        u2Var.setFocusableInTouchMode(true);
        u2Var.setInputType(16384);
        u2Var.setSingleLine(false);
        addView(u2Var, e6.e(-2, -2, 51));
        if (i11 >= 29) {
            u2Var.setBreakStrategy(0);
        } else if (i11 >= 23) {
            u2Var.setBreakStrategy(0);
        }
        setSwatch(q1Var);
        setType(i10);
        k();
        u2Var.addTextChangedListener(new ud0(this));
    }

    @Override // yf.j
    public final i a() {
        return new o0(this, getContext());
    }

    public int getAlign() {
        return this.q0;
    }

    public int getBaseFontSize() {
        return this.p0;
    }

    public b getEditText() {
        return this.m0;
    }

    public View getFocusedView() {
        return this.m0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.m0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.m0.getTextSize();
    }

    @Override // yf.j
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new wj0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        u2 u2Var = this.m0;
        return new wj0(v, (positionY - (((dp2 - u2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + v) - v, (dp2 - u2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // yf.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // yf.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // yf.j
    public float getStickyPaddingRight() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // yf.j
    public float getStickyPaddingTop() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public xf.q1 getSwatch() {
        return this.n0;
    }

    public CharSequence getText() {
        return this.m0.getText();
    }

    public int getTextSize() {
        return (int) this.m0.getTextSize();
    }

    public int getType() {
        return this.o0;
    }

    public xf.i0 getTypeface() {
        return this.r0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        k();
    }

    public final void q() {
        u2 u2Var = this.m0;
        u2Var.setEnabled(true);
        u2Var.setClickable(true);
        u2Var.requestFocus();
        u2Var.setSelection(u2Var.getText().length());
        AndroidUtilities.runOnUIThread(new pf.o1(this, 20), 300L);
    }

    public final void r() {
        u2 u2Var = this.m0;
        u2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i9 = this.n0.a;
        int i10 = this.o0;
        if (i10 == 0) {
            u2Var.setFrameColor(i9);
            i9 = AndroidUtilities.computePerceivedBrightness(this.n0.a) >= 0.721f ? -16777216 : -1;
        } else if (i10 == 1) {
            u2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i9) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i10 == 2) {
            u2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i9) >= 0.25f ? -16777216 : -1);
        } else {
            u2Var.setFrameColor(0);
        }
        u2Var.setTextColor(i9);
        u2Var.setCursorColor(i9);
        u2Var.setHandlesColor(i9);
        u2Var.setHighlightColor(f6.l1(0.4f, i9));
    }

    public final void s() {
        u2 u2Var = this.m0;
        if (u2Var.getText().length() > 0) {
            u2Var.setHint((CharSequence) null);
        } else {
            u2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            u2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i9) {
        this.q0 = i9;
    }

    public void setBaseFontSize(int i9) {
        this.p0 = i9;
        float f10 = i9;
        u2 u2Var = this.m0;
        u2Var.setTextSize(0, f10);
        u2Var.setCursorSize(AndroidUtilities.dp(f10 * 0.4f));
        if (u2Var.getText() != null) {
            Editable text = u2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i10 = 0; i10 < emojiSpanArr.length; i10++) {
                emojiSpanArr[i10].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i10].scale = 0.85f;
            }
            for (t5 t5Var : (t5[]) text.getSpans(0, text.length(), t5.class)) {
                t5Var.replaceFontMetrics(getFontMetricsInt());
            }
            u2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i9) {
        this.m0.setMaxWidth(i9);
    }

    public void setSwatch(xf.q1 q1Var) {
        this.n0 = new xf.q1(q1Var.b, q1Var.c, q1Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.m0.setText(charSequence);
        s();
    }

    public void setType(int i9) {
        this.o0 = i9;
        r();
    }

    public void setTypeface(xf.i0 i0Var) {
        this.r0 = i0Var;
        if (i0Var != null) {
            this.m0.setTypeface(i0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = xf.i0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xf.i0 i0Var = (xf.i0) it.next();
            if (i0Var.a.equals(str)) {
                setTypeface(i0Var);
                str = null;
                break;
            }
        }
        this.w0 = str;
        m();
    }

    public v2(Context context, v2 v2Var, PointF pointF) {
        this(context, pointF, v2Var.p0, v2Var.getText(), v2Var.getSwatch(), v2Var.o0);
        setRotation(v2Var.getRotation());
        setScale(v2Var.getScale());
        setTypeface(v2Var.getTypeface());
        setAlign(v2Var.getAlign());
        int align = getAlign();
        int i9 = 2;
        this.m0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i9 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i9 = 3;
        }
        this.m0.setTextAlignment(i9);
    }
}
