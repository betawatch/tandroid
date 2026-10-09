package qg;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.ke0;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w2 extends j {
    public String A0;
    public final v2 q0;
    public pg.s1 r0;
    public int s0;
    public int t0;
    public int u0;
    public pg.k0 v0;
    public int w0;
    public int x0;
    public Runnable y0;
    public boolean z0;

    public w2(Context context, PointF pointF, int i10, CharSequence charSequence, pg.s1 s1Var, int i11) {
        super(context, pointF);
        this.v0 = pg.k0.e;
        this.t0 = i10;
        v2 v2Var = new v2(this, context);
        this.q0 = v2Var;
        NotificationCenter.listenEmojiLoading(v2Var);
        v2Var.setGravity(19);
        v2Var.setBackgroundColor(0);
        v2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        v2Var.setClickable(false);
        v2Var.setEnabled(false);
        v2Var.setCursorColor(-1);
        v2Var.setTextSize(0, this.t0);
        v2Var.setCursorSize(AndroidUtilities.dp(this.t0 * 0.4f));
        v2Var.setText(charSequence);
        s();
        v2Var.setTextColor(s1Var.a);
        v2Var.setTypeface(null, 1);
        v2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            v2Var.setImeOptions(285212672);
        } else {
            v2Var.setImeOptions(TLObject.FLAG_28);
        }
        v2Var.setFocusableInTouchMode(true);
        v2Var.setInputType(16384);
        v2Var.setSingleLine(false);
        addView(v2Var, x5.e(-2, -2, 51));
        if (i12 >= 29) {
            v2Var.setBreakStrategy(0);
        } else {
            v2Var.setBreakStrategy(0);
        }
        setSwatch(s1Var);
        setType(i11);
        k();
        v2Var.addTextChangedListener(new ke0(this));
    }

    @Override // qg.j
    public final i a() {
        return new p0(this, getContext());
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

    @Override // qg.j
    public ml0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ml0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y3 = bi.y(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        v2 v2Var = this.q0;
        return new ml0(y3, (positionY - (((dp2 - v2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + y3) - y3, (dp2 - v2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // qg.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // qg.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // qg.j
    public float getStickyPaddingRight() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // qg.j
    public float getStickyPaddingTop() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public pg.s1 getSwatch() {
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

    public pg.k0 getTypeface() {
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
        v2 v2Var = this.q0;
        v2Var.setEnabled(true);
        v2Var.setClickable(true);
        v2Var.requestFocus();
        v2Var.setSelection(v2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 18), 300L);
    }

    public final void r() {
        v2 v2Var = this.q0;
        v2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.r0.a;
        int i11 = this.s0;
        if (i11 == 0) {
            v2Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.r0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            v2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            v2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            v2Var.setFrameColor(0);
        }
        v2Var.setTextColor(i10);
        v2Var.setCursorColor(i10);
        v2Var.setHandlesColor(i10);
        v2Var.setHighlightColor(i6.m1(0.4f, i10));
    }

    public final void s() {
        v2 v2Var = this.q0;
        if (v2Var.getText().length() > 0) {
            v2Var.setHint((CharSequence) null);
        } else {
            v2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            v2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.t0 = i10;
        float f7 = i10;
        v2 v2Var = this.q0;
        v2Var.setTextSize(0, f7);
        v2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (v2Var.getText() != null) {
            Editable text = v2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (b6 b6Var : (b6[]) text.getSpans(0, text.length(), b6.class)) {
                b6Var.replaceFontMetrics(getFontMetricsInt());
            }
            v2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setSwatch(pg.s1 s1Var) {
        this.r0 = new pg.s1(s1Var.b, s1Var.c, s1Var.a);
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

    public void setTypeface(pg.k0 k0Var) {
        this.v0 = k0Var;
        if (k0Var != null) {
            this.q0.setTypeface(k0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = pg.k0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            pg.k0 k0Var = (pg.k0) it.next();
            if (k0Var.a.equals(str)) {
                setTypeface(k0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public w2(Context context, w2 w2Var, PointF pointF) {
        this(context, pointF, w2Var.t0, w2Var.getText(), w2Var.getSwatch(), w2Var.s0);
        setRotation(w2Var.getRotation());
        setScale(w2Var.getScale());
        setTypeface(w2Var.getTypeface());
        setAlign(w2Var.getAlign());
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
