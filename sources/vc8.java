// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vc8 extends tpa {
    public final jmb V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public dm c0;
    public boolean d0;
    public va6 e0;
    public Layout f0;
    public Path g0;

    public vc8(Context context, tc8 tc8Var, jmb jmbVar, final icc iccVar, final kcc kccVar) {
        super(context);
        final byte b = 0;
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new o66(this) { // from class: uc8
            public final /* synthetic */ vc8 b;

            {
                this.b = this;
            }

            @Override // o66
            public final void a(ClickableSpan clickableSpan) {
                byte b2 = b;
                Object obj = iccVar;
                vc8 vc8Var = this.b;
                switch (b2) {
                    case 0:
                        ((icc) obj).a(clickableSpan, vc8Var);
                        break;
                    default:
                        ((kcc) obj).a(clickableSpan, vc8Var, new x38(vc8Var, (byte) 17));
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.H = new o66(this) { // from class: uc8
            public final /* synthetic */ vc8 b;

            {
                this.b = this;
            }

            @Override // o66
            public final void a(ClickableSpan clickableSpan) {
                byte b22 = b2;
                Object obj = kccVar;
                vc8 vc8Var = this.b;
                switch (b22) {
                    case 0:
                        ((icc) obj).a(clickableSpan, vc8Var);
                        break;
                    default:
                        ((kcc) obj).a(clickableSpan, vc8Var, new x38(vc8Var, (byte) 17));
                        break;
                }
            }
        };
        this.V = jmbVar;
        l2f.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(tre.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new am7(tc8Var, (byte) 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        if (this.d0) {
            Layout layout = getLayout();
            Path path = this.g0;
            if (path != null) {
                if (this.f0 != layout) {
                    path.rewind();
                }
                if (this.e0 == null) {
                    va6 va6Var = new va6();
                    this.e0 = va6Var;
                    va6Var.y = this.g0;
                    va6Var.j(4.0f);
                    this.e0.g(aob.p1(0.3f, -1), aob.p1(0.1f, -1), aob.p1(0.2f, -1), aob.p1(0.7f, -1));
                    this.e0.setCallback(this);
                }
                this.e0.setBounds(0, 0, getWidth(), getHeight());
                this.e0.draw(canvas);
            } else {
                this.g0 = new Path();
            }
            if (layout != null) {
                float L = hl.L(16.0f);
                float L2 = hl.L(8.0f);
                float f = 0.0f;
                int i = 0;
                while (i < layout.getLineCount()) {
                    float f2 = L / 3.0f;
                    float lineLeft = layout.getLineLeft(i) - f2;
                    float lineRight = layout.getLineRight(i) + f2;
                    if (i == 0) {
                        f = layout.getLineTop(i) - (L2 / 3.0f);
                    }
                    float lineBottom = layout.getLineBottom(i);
                    float f3 = i >= layout.getLineCount() + (-1) ? (L2 / 3.0f) + lineBottom : lineBottom;
                    this.g0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f, getPaddingLeft() + lineRight, getPaddingTop() + f3, Path.Direction.CW);
                    i++;
                    f = f3;
                }
            }
            this.f0 = layout;
            if (this.e0 == null) {
            }
            this.e0.setBounds(0, 0, getWidth(), getHeight());
            this.e0.draw(canvas);
        }
        if (this.d0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.H2, 31);
        }
        if (this.W != null && this.a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i2 = 0; i2 < this.W.size(); i2++) {
                n19 n19Var = (n19) this.W.get(i2);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int L3 = this.a0 ? hl.L(32.0f) : 0;
                getPaint();
                n19Var.a(canvas, width + L3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.d0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        hm.drawAnimatedEmojis(canvas, getLayout(), this.c0, 0.0f, this.b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm.release(this, this.c0);
        this.W = r19.e(null, this.W);
    }

    @Override // tpa, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        jmb jmbVar = this.V;
        if (jmbVar != null && jmbVar.w()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getStaticTextLayout() != null && jmbVar.p0 == this) {
                jmbVar.V(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            this.c0 = hm.update(0, this, this.c0, getLayout());
            this.W = r19.e(getLayout(), this.W);
            boolean z = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((q19[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), q19.class)).length > 0;
            this.a0 = z;
            l2f.a(this, 16.0f, 8.0f, (z ? 32 : 0) + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override // tpa, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.c0 = hm.update(0, this, this.c0, getLayout());
        this.W = r19.e(getLayout(), this.W);
    }

    public void setLoading(boolean z) {
        if (this.d0 == z) {
            return;
        }
        this.d0 = z;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        boolean z2 = z != isPressed();
        super.setPressed(z);
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e0 || super.verifyDrawable(drawable);
    }
}
