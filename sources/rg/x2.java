package rg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.le0;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x2 extends k {
    public String A0;
    public final w2 q0;
    public qg.q1 r0;
    public int s0;
    public int t0;
    public int u0;
    public qg.j0 v0;
    public int w0;
    public int x0;
    public Runnable y0;
    public boolean z0;

    public x2(Context context, PointF pointF, int i10, CharSequence charSequence, qg.q1 q1Var, int i11) {
        super(context, pointF);
        this.v0 = qg.j0.e;
        this.t0 = i10;
        w2 w2Var = new w2(this, context);
        this.q0 = w2Var;
        NotificationCenter.listenEmojiLoading(w2Var);
        w2Var.setGravity(19);
        w2Var.setBackgroundColor(0);
        w2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        w2Var.setClickable(false);
        w2Var.setEnabled(false);
        w2Var.setCursorColor(-1);
        w2Var.setTextSize(0, this.t0);
        w2Var.setCursorSize(AndroidUtilities.dp(this.t0 * 0.4f));
        w2Var.setText(charSequence);
        s();
        w2Var.setTextColor(q1Var.a);
        w2Var.setTypeface(null, 1);
        w2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            w2Var.setImeOptions(285212672);
        } else {
            w2Var.setImeOptions(TLObject.FLAG_28);
        }
        w2Var.setFocusableInTouchMode(true);
        w2Var.setInputType(16384);
        w2Var.setSingleLine(false);
        addView(w2Var, x5.e(-2, -2, 51));
        if (i12 >= 29) {
            w2Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            w2Var.setBreakStrategy(0);
        }
        setSwatch(q1Var);
        setType(i11);
        k();
        w2Var.addTextChangedListener(new le0(this));
    }

    @Override // rg.k
    public final j a() {
        return new r0(this, getContext());
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

    @Override // rg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float u10 = wl.u(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        w2 w2Var = this.q0;
        return new hk0(u10, (positionY - (((dp2 - w2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + u10) - u10, (dp2 - w2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // rg.k
    public float getStickyPaddingBottom() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // rg.k
    public float getStickyPaddingLeft() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // rg.k
    public float getStickyPaddingRight() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // rg.k
    public float getStickyPaddingTop() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public qg.q1 getSwatch() {
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

    public qg.j0 getTypeface() {
        return this.v0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void q() {
        w2 w2Var = this.q0;
        w2Var.setEnabled(true);
        w2Var.setClickable(true);
        w2Var.requestFocus();
        w2Var.setSelection(w2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(this, 22), 300L);
    }

    public final void r() {
        w2 w2Var = this.q0;
        w2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.r0.a;
        int i11 = this.s0;
        if (i11 == 0) {
            w2Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.r0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            w2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            w2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            w2Var.setFrameColor(0);
        }
        w2Var.setTextColor(i10);
        w2Var.setCursorColor(i10);
        w2Var.setHandlesColor(i10);
        w2Var.setHighlightColor(j6.l1(0.4f, i10));
    }

    public final void s() {
        w2 w2Var = this.q0;
        if (w2Var.getText().length() > 0) {
            w2Var.setHint((CharSequence) null);
        } else {
            w2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            w2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.t0 = i10;
        float f7 = i10;
        w2 w2Var = this.q0;
        w2Var.setTextSize(0, f7);
        w2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (w2Var.getText() != null) {
            Editable text = w2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (z5 z5Var : (z5[]) text.getSpans(0, text.length(), z5.class)) {
                z5Var.replaceFontMetrics(getFontMetricsInt());
            }
            w2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setSwatch(qg.q1 q1Var) {
        this.r0 = new qg.q1(q1Var.b, q1Var.c, q1Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.s0 = i10;
        r();
    }

    public void setTypeface(qg.j0 j0Var) {
        this.v0 = j0Var;
        if (j0Var != null) {
            this.q0.setTypeface(j0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = qg.j0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            qg.j0 j0Var = (qg.j0) it.next();
            if (j0Var.a.equals(str)) {
                setTypeface(j0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public x2(Context context, x2 x2Var, PointF pointF) {
        this(context, pointF, x2Var.t0, x2Var.getText(), x2Var.getSwatch(), x2Var.s0);
        setRotation(x2Var.getRotation());
        setScale(x2Var.getScale());
        setTypeface(x2Var.getTypeface());
        setAlign(x2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.q0.setTextAlignment(i10);
    }
}
