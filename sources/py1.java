// default package

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class py1 extends aq0 {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new az8((byte) 3);
        fv fvVar = new fv((byte) 1, context, (Object) this);
        this.c = fvVar;
        fvVar.setOverScrollMode(2);
        fvVar.setClipToPadding(false);
        fvVar.setClipToOutline(true);
        fvVar.j(new y(this, (byte) 8));
        addView(fvVar);
        paint.setColor(cmb.w0(null, cmb.yj, false));
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.updateColors();
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
        this.w.n2();
    }
}
