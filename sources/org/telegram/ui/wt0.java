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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class wt0 extends wh.n {
    public final org.telegram.ui.Cells.x9 U;
    public ArrayList V;
    public boolean W;
    public Layout a0;
    public org.telegram.ui.Components.w5 b0;
    public boolean c0;
    public org.telegram.ui.Components.ba0 d0;
    public Layout e0;
    public Path f0;

    public wt0(Context context, ut0 ut0Var, org.telegram.ui.Cells.x9 x9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i10 = 0;
        this.F = new org.telegram.ui.Components.w90(this) { // from class: org.telegram.ui.vt0
            public final /* synthetic */ wt0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.w90
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback2;
                        wt0 wt0Var = this.b;
                        wt0Var.getClass();
                        callback22.run(clickableSpan, wt0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback2;
                        wt0 wt0Var2 = this.b;
                        callback32.run(clickableSpan, wt0Var2, new ck0(wt0Var2, 22));
                        break;
                }
            }
        };
        final int i11 = 1;
        this.G = new org.telegram.ui.Components.w90(this) { // from class: org.telegram.ui.vt0
            public final /* synthetic */ wt0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.w90
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback3;
                        wt0 wt0Var = this.b;
                        wt0Var.getClass();
                        callback22.run(clickableSpan, wt0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback3;
                        wt0 wt0Var2 = this.b;
                        callback32.run(clickableSpan, wt0Var2, new ck0(wt0Var2, 22));
                        break;
                }
            }
        };
        this.U = x9Var;
        w7.f6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(w7.z5.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new s50(ut0Var, 19));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.c0) {
            Layout layout = getLayout();
            Path path = this.f0;
            if (path == null || this.e0 != layout) {
                if (path == null) {
                    this.f0 = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    float f7 = 0.0f;
                    int i10 = 0;
                    while (i10 < layout.getLineCount()) {
                        float f10 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i10) - f10;
                        float lineRight = layout.getLineRight(i10) + f10;
                        if (i10 == 0) {
                            f7 = layout.getLineTop(i10) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i10);
                        float f11 = i10 >= layout.getLineCount() + (-1) ? (dp2 / 3.0f) + lineBottom : lineBottom;
                        this.f0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f7, getPaddingLeft() + lineRight, getPaddingTop() + f11, Path.Direction.CW);
                        i10++;
                        f7 = f11;
                    }
                }
                this.e0 = layout;
            }
            if (this.d0 == null) {
                org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0();
                this.d0 = ba0Var;
                ba0Var.y = this.f0;
                ba0Var.k(4.0f);
                this.d0.g(org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1), org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
                this.d0.setCallback(this);
            }
            this.d0.setBounds(0, 0, getWidth(), getHeight());
            this.d0.draw(canvas);
        }
        if (this.c0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.V != null && this.W) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.V.size(); i11++) {
                org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.V.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int dp3 = this.W ? AndroidUtilities.dp(32.0f) : 0;
                getPaint();
                mj0Var.a(canvas, width + dp3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.c0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, getLayout(), this.b0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.a6.release(this, this.b0);
        this.V = org.telegram.ui.Components.qj0.e(null, this.V);
    }

    @Override // wh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.x9 x9Var = this.U;
        if (x9Var != null && x9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (x9Var != null && getStaticTextLayout() != null && x9Var.p0 == this) {
                x9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.a0 != getLayout()) {
            this.b0 = org.telegram.ui.Components.a6.update(0, this, this.b0, getLayout());
            this.V = org.telegram.ui.Components.qj0.e(getLayout(), this.V);
            boolean z10 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.pj0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.pj0.class)).length > 0;
            this.W = z10;
            w7.f6.a(this, 16.0f, 8.0f, (z10 ? 32 : 0) + 16, 8.0f);
            this.a0 = getLayout();
        }
    }

    @Override // wh.n, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.b0 = org.telegram.ui.Components.a6.update(0, this, this.b0, getLayout());
        this.V = org.telegram.ui.Components.qj0.e(getLayout(), this.V);
    }

    public void setLoading(boolean z10) {
        if (this.c0 == z10) {
            return;
        }
        this.c0 = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        boolean z11 = z10 != isPressed();
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d0 || super.verifyDrawable(drawable);
    }
}
