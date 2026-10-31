package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vr0 extends nh.p {
    public final org.telegram.ui.Cells.t9 U;
    public ArrayList V;
    public boolean W;
    public Layout a0;
    public org.telegram.ui.Components.k5 b0;
    public boolean c0;
    public org.telegram.ui.Components.t80 d0;
    public Layout e0;
    public Path f0;

    public vr0(Context context, tr0 tr0Var, org.telegram.ui.Cells.t9 t9Var, final org.telegram.messenger.j20 j20Var, final org.telegram.messenger.l20 l20Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i10 = 0;
        this.F = new org.telegram.ui.Components.o80(this) { // from class: org.telegram.ui.ur0
            public final /* synthetic */ vr0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        org.telegram.messenger.j20 j20Var2 = (org.telegram.messenger.j20) j20Var;
                        vr0 vr0Var = this.b;
                        vr0Var.getClass();
                        j20Var2.a(clickableSpan, vr0Var);
                        break;
                    default:
                        org.telegram.messenger.l20 l20Var2 = (org.telegram.messenger.l20) j20Var;
                        vr0 vr0Var2 = this.b;
                        l20Var2.a(clickableSpan, vr0Var2, new mg0(vr0Var2, 25));
                        break;
                }
            }
        };
        final int i11 = 1;
        this.G = new org.telegram.ui.Components.o80(this) { // from class: org.telegram.ui.ur0
            public final /* synthetic */ vr0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        org.telegram.messenger.j20 j20Var2 = (org.telegram.messenger.j20) l20Var;
                        vr0 vr0Var = this.b;
                        vr0Var.getClass();
                        j20Var2.a(clickableSpan, vr0Var);
                        break;
                    default:
                        org.telegram.messenger.l20 l20Var2 = (org.telegram.messenger.l20) l20Var;
                        vr0 vr0Var2 = this.b;
                        l20Var2.a(clickableSpan, vr0Var2, new mg0(vr0Var2, 25));
                        break;
                }
            }
        };
        this.U = t9Var;
        w7.i6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(w7.b6.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new f50(tr0Var, 20));
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
                    float L = org.telegram.messenger.i0.L(16.0f);
                    float L2 = org.telegram.messenger.i0.L(8.0f);
                    float f7 = 0.0f;
                    int i10 = 0;
                    while (i10 < layout.getLineCount()) {
                        float f10 = L / 3.0f;
                        float lineLeft = layout.getLineLeft(i10) - f10;
                        float lineRight = layout.getLineRight(i10) + f10;
                        if (i10 == 0) {
                            f7 = layout.getLineTop(i10) - (L2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i10);
                        float f11 = i10 >= layout.getLineCount() + (-1) ? (L2 / 3.0f) + lineBottom : lineBottom;
                        this.f0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f7, getPaddingLeft() + lineRight, getPaddingTop() + f11, Path.Direction.CW);
                        i10++;
                        f7 = f11;
                    }
                }
                this.e0 = layout;
            }
            if (this.d0 == null) {
                org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80();
                this.d0 = t80Var;
                t80Var.y = this.f0;
                t80Var.k(4.0f);
                this.d0.g(org.telegram.ui.ActionBar.t6.r1(0.3f, -1), org.telegram.ui.ActionBar.t6.r1(0.1f, -1), org.telegram.ui.ActionBar.t6.r1(0.2f, -1), org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
                this.d0.setCallback(this);
            }
            this.d0.setBounds(0, 0, getWidth(), getHeight());
            this.d0.draw(canvas);
        }
        if (this.c0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.I2, 31);
        }
        if (this.V != null && this.W) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.V.size(); i11++) {
                org.telegram.ui.Components.sh0 sh0Var = (org.telegram.ui.Components.sh0) this.V.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int L3 = this.W ? org.telegram.messenger.i0.L(32.0f) : 0;
                getPaint();
                sh0Var.a(canvas, width + L3, -1);
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
        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, getLayout(), this.b0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5.release(this, this.b0);
        this.V = org.telegram.ui.Components.wh0.e(null, this.V);
    }

    @Override // nh.p, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.t9 t9Var = this.U;
        if (t9Var != null && t9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (t9Var != null && getStaticTextLayout() != null && t9Var.p0 == this) {
                t9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.a0 != getLayout()) {
            this.b0 = org.telegram.ui.Components.o5.update(0, this, this.b0, getLayout());
            this.V = org.telegram.ui.Components.wh0.e(getLayout(), this.V);
            boolean z10 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.vh0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.vh0.class)).length > 0;
            this.W = z10;
            w7.i6.a(this, 16.0f, 8.0f, (z10 ? 32 : 0) + 16, 8.0f);
            this.a0 = getLayout();
        }
    }

    @Override // nh.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.b0 = org.telegram.ui.Components.o5.update(0, this, this.b0, getLayout());
        this.V = org.telegram.ui.Components.wh0.e(getLayout(), this.V);
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
