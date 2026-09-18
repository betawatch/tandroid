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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.me0;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class u2 extends j {
    public String A0;
    public final t2 q0;
    public pg.s1 r0;
    public int s0;
    public int t0;
    public int u0;
    public pg.k0 v0;
    public int w0;
    public int x0;
    public Runnable y0;
    public boolean z0;

    public u2(Context context, PointF pointF, int i10, CharSequence charSequence, pg.s1 s1Var, int i11) {
        super(context, pointF);
        this.v0 = pg.k0.e;
        this.t0 = i10;
        t2 t2Var = new t2(this, context);
        this.q0 = t2Var;
        NotificationCenter.listenEmojiLoading(t2Var);
        t2Var.setGravity(19);
        t2Var.setBackgroundColor(0);
        t2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        t2Var.setClickable(false);
        t2Var.setEnabled(false);
        t2Var.setCursorColor(-1);
        t2Var.setTextSize(0, this.t0);
        t2Var.setCursorSize(AndroidUtilities.dp(this.t0 * 0.4f));
        t2Var.setText(charSequence);
        s();
        t2Var.setTextColor(s1Var.a);
        t2Var.setTypeface(null, 1);
        t2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            t2Var.setImeOptions(285212672);
        } else {
            t2Var.setImeOptions(TLObject.FLAG_28);
        }
        t2Var.setFocusableInTouchMode(true);
        t2Var.setInputType(16384);
        t2Var.setSingleLine(false);
        addView(t2Var, y5.e(-2, -2, 51));
        if (i12 >= 29) {
            t2Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            t2Var.setBreakStrategy(0);
        }
        setSwatch(s1Var);
        setType(i11);
        k();
        t2Var.addTextChangedListener(new me0(this));
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
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new sk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = wh.x(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        t2 t2Var = this.q0;
        return new sk0(x10, (positionY - (((dp2 - t2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + x10) - x10, (dp2 - t2Var.getExtendedPaddingBottom()) * scaleX);
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
        t2 t2Var = this.q0;
        t2Var.setEnabled(true);
        t2Var.setClickable(true);
        t2Var.requestFocus();
        t2Var.setSelection(t2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 17), 300L);
    }

    public final void r() {
        t2 t2Var = this.q0;
        t2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.r0.a;
        int i11 = this.s0;
        if (i11 == 0) {
            t2Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.r0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            t2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            t2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            t2Var.setFrameColor(0);
        }
        t2Var.setTextColor(i10);
        t2Var.setCursorColor(i10);
        t2Var.setHandlesColor(i10);
        t2Var.setHighlightColor(j6.l1(0.4f, i10));
    }

    public final void s() {
        t2 t2Var = this.q0;
        if (t2Var.getText().length() > 0) {
            t2Var.setHint((CharSequence) null);
        } else {
            t2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            t2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.t0 = i10;
        float f7 = i10;
        t2 t2Var = this.q0;
        t2Var.setTextSize(0, f7);
        t2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (t2Var.getText() != null) {
            Editable text = t2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (z5 z5Var : (z5[]) text.getSpans(0, text.length(), z5.class)) {
                z5Var.replaceFontMetrics(getFontMetricsInt());
            }
            t2Var.invalidateForce();
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

    public u2(Context context, u2 u2Var, PointF pointF) {
        this(context, pointF, u2Var.t0, u2Var.getText(), u2Var.getSwatch(), u2Var.s0);
        setRotation(u2Var.getRotation());
        setScale(u2Var.getScale());
        setTypeface(u2Var.getTypeface());
        setAlign(u2Var.getAlign());
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
