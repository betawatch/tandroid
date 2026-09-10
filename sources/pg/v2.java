package pg;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.le0;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v2 extends j {
    public String A0;
    public final u2 q0;
    public og.v1 r0;
    public int s0;
    public int t0;
    public int u0;
    public og.m0 v0;
    public int w0;
    public int x0;
    public Runnable y0;
    public boolean z0;

    public v2(Context context, PointF pointF, int i10, CharSequence charSequence, og.v1 v1Var, int i11) {
        super(context, pointF);
        this.v0 = og.m0.e;
        this.t0 = i10;
        u2 u2Var = new u2(this, context);
        this.q0 = u2Var;
        NotificationCenter.listenEmojiLoading(u2Var);
        u2Var.setGravity(19);
        u2Var.setBackgroundColor(0);
        u2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        u2Var.setClickable(false);
        u2Var.setEnabled(false);
        u2Var.setCursorColor(-1);
        u2Var.setTextSize(0, this.t0);
        u2Var.setCursorSize(AndroidUtilities.dp(this.t0 * 0.4f));
        u2Var.setText(charSequence);
        s();
        u2Var.setTextColor(v1Var.a);
        u2Var.setTypeface(null, 1);
        u2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            u2Var.setImeOptions(285212672);
        } else {
            u2Var.setImeOptions(TLObject.FLAG_28);
        }
        u2Var.setFocusableInTouchMode(true);
        u2Var.setInputType(16384);
        u2Var.setSingleLine(false);
        addView(u2Var, a6.e(-2, -2, 51));
        if (i12 >= 29) {
            u2Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            u2Var.setBreakStrategy(0);
        }
        setSwatch(v1Var);
        setType(i11);
        k();
        u2Var.addTextChangedListener(new le0(this));
    }

    @Override // pg.j
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

    @Override // pg.j
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new rk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float u10 = em.u(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        u2 u2Var = this.q0;
        return new rk0(u10, (positionY - (((dp2 - u2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + u10) - u10, (dp2 - u2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // pg.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // pg.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // pg.j
    public float getStickyPaddingRight() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // pg.j
    public float getStickyPaddingTop() {
        RectF rectF = this.q0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public og.v1 getSwatch() {
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

    public og.m0 getTypeface() {
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
        u2 u2Var = this.q0;
        u2Var.setEnabled(true);
        u2Var.setClickable(true);
        u2Var.requestFocus();
        u2Var.setSelection(u2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.x(this, 24), 300L);
    }

    public final void r() {
        u2 u2Var = this.q0;
        u2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.r0.a;
        int i11 = this.s0;
        if (i11 == 0) {
            u2Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.r0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            u2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            u2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            u2Var.setFrameColor(0);
        }
        u2Var.setTextColor(i10);
        u2Var.setCursorColor(i10);
        u2Var.setHandlesColor(i10);
        u2Var.setHighlightColor(j6.l1(0.4f, i10));
    }

    public final void s() {
        u2 u2Var = this.q0;
        if (u2Var.getText().length() > 0) {
            u2Var.setHint((CharSequence) null);
        } else {
            u2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            u2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.t0 = i10;
        float f7 = i10;
        u2 u2Var = this.q0;
        u2Var.setTextSize(0, f7);
        u2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (u2Var.getText() != null) {
            Editable text = u2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (y5 y5Var : (y5[]) text.getSpans(0, text.length(), y5.class)) {
                y5Var.replaceFontMetrics(getFontMetricsInt());
            }
            u2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setSwatch(og.v1 v1Var) {
        this.r0 = new og.v1(v1Var.b, v1Var.c, v1Var.a);
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

    public void setTypeface(og.m0 m0Var) {
        this.v0 = m0Var;
        if (m0Var != null) {
            this.q0.setTypeface(m0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = og.m0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            og.m0 m0Var = (og.m0) it.next();
            if (m0Var.a.equals(str)) {
                setTypeface(m0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public v2(Context context, v2 v2Var, PointF pointF) {
        this(context, pointF, v2Var.t0, v2Var.getText(), v2Var.getSwatch(), v2Var.s0);
        setRotation(v2Var.getRotation());
        setScale(v2Var.getScale());
        setTypeface(v2Var.getTypeface());
        setAlign(v2Var.getAlign());
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
