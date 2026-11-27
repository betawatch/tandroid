// default package

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qx1 extends ap0 {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new m09((byte) 3);
        gu guVar = new gu((byte) 1, context, (Object) this);
        this.c = guVar;
        guVar.setOverScrollMode(2);
        guVar.setClipToPadding(false);
        guVar.setClipToOutline(true);
        guVar.j(new y(this, (byte) 7));
        addView(guVar);
        paint.setColor(aob.w0(null, aob.zj, false));
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.s) {
            return;
        }
        this.s = true;
        this.w.u2();
    }
}
