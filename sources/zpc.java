// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zpc extends EditTextBoldCursor {
    public int N1;
    public final ll O1;
    public final hn P1;
    public final /* synthetic */ vnb Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpc(Context context, vnb vnbVar) {
        super(context);
        this.Q1 = vnbVar;
        this.N1 = 960;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.P1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        hnVar.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.O1.a(aob.v0(this.N1 <= 0 ? aob.p7 : aob.P5, this.Q1), false);
        hn hnVar = this.P1;
        hnVar.u(a);
        int L = hl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
        int height = getHeight() + getScrollY();
        hnVar.setBounds(L - hl.L(48.0f), height - Math.min(hl.L(44.0f), getHeight()), L, height);
        hnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.P1;
        if (hnVar == null) {
            return;
        }
        this.N1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        hnVar.a();
        int i4 = this.N1;
        hnVar.t(i4 <= 100 ? Integer.toString(i4) : "", isAttachedToWindow(), true);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.P1 || super.verifyDrawable(drawable);
    }
}
