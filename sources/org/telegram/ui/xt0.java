package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xt0 extends jh.s {
    public final org.telegram.ui.Cells.w9 O;
    public ArrayList P;
    public boolean Q;
    public Layout R;
    public org.telegram.ui.Components.q5 S;
    public boolean T;
    public org.telegram.ui.Components.k90 U;
    public Layout V;
    public Path W;

    public xt0(Context context, vt0 vt0Var, org.telegram.ui.Cells.w9 w9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i10 = 0;
        this.x = new org.telegram.ui.Components.f90(this) { // from class: org.telegram.ui.wt0
            public final /* synthetic */ xt0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.f90
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback2;
                        xt0 xt0Var = this.b;
                        xt0Var.getClass();
                        callback22.run(clickableSpan, xt0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback2;
                        xt0 xt0Var2 = this.b;
                        callback32.run(clickableSpan, xt0Var2, new gl0(xt0Var2, 22));
                        break;
                }
            }
        };
        final int i11 = 1;
        this.y = new org.telegram.ui.Components.f90(this) { // from class: org.telegram.ui.wt0
            public final /* synthetic */ xt0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.f90
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback3;
                        xt0 xt0Var = this.b;
                        xt0Var.getClass();
                        callback22.run(clickableSpan, xt0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback3;
                        xt0 xt0Var2 = this.b;
                        callback32.run(clickableSpan, xt0Var2, new gl0(xt0Var2, 22));
                        break;
                }
            }
        };
        this.O = w9Var;
        k7.i6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(k7.c6.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new f60(vt0Var, 20));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.T) {
            Layout layout = getLayout();
            Path path = this.W;
            if (path == null || this.V != layout) {
                if (path == null) {
                    this.W = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    int i10 = 0;
                    float f10 = 0.0f;
                    while (i10 < layout.getLineCount()) {
                        float f11 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i10) - f11;
                        float lineRight = layout.getLineRight(i10) + f11;
                        if (i10 == 0) {
                            f10 = layout.getLineTop(i10) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i10);
                        float f12 = i10 >= layout.getLineCount() + (-1) ? (dp2 / 3.0f) + lineBottom : lineBottom;
                        this.W.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f12, Path.Direction.CW);
                        i10++;
                        f10 = f12;
                    }
                }
                this.V = layout;
            }
            if (this.U == null) {
                org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90();
                this.U = k90Var;
                k90Var.x = this.W;
                k90Var.j(4.0f);
                this.U.f(org.telegram.ui.ActionBar.k6.l1(0.3f, -1), org.telegram.ui.ActionBar.k6.l1(0.1f, -1), org.telegram.ui.ActionBar.k6.l1(0.2f, -1), org.telegram.ui.ActionBar.k6.l1(0.7f, -1));
                this.U.setCallback(this);
            }
            this.U.setBounds(0, 0, getWidth(), getHeight());
            this.U.draw(canvas);
        }
        if (this.T) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.P != null && this.Q) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.P.size(); i11++) {
                org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.P.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int dp3 = this.Q ? AndroidUtilities.dp(32.0f) : 0;
                getPaint();
                xi0Var.a(canvas, width + dp3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.T) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, getLayout(), this.S, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release(this, this.S);
        this.P = org.telegram.ui.Components.bj0.e(null, this.P);
    }

    @Override // jh.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.w9 w9Var = this.O;
        if (w9Var != null && w9Var.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (w9Var != null && getStaticTextLayout() != null && w9Var.u0 == this) {
                w9Var.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.R != getLayout()) {
            this.S = org.telegram.ui.Components.u5.update(0, this, this.S, getLayout());
            this.P = org.telegram.ui.Components.bj0.e(getLayout(), this.P);
            boolean z4 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.aj0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.aj0.class)).length > 0;
            this.Q = z4;
            k7.i6.a(this, 16.0f, 8.0f, (z4 ? 32 : 0) + 16, 8.0f);
            this.R = getLayout();
        }
    }

    @Override // jh.s, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.S = org.telegram.ui.Components.u5.update(0, this, this.S, getLayout());
        this.P = org.telegram.ui.Components.bj0.e(getLayout(), this.P);
    }

    public void setLoading(boolean z4) {
        if (this.T == z4) {
            return;
        }
        this.T = z4;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        boolean z10 = z4 != isPressed();
        super.setPressed(z4);
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.U || super.verifyDrawable(drawable);
    }
}
