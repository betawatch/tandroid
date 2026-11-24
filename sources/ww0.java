// default package

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ww0 extends dx0 {
    public final /* synthetic */ fx0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(fx0 fx0Var, Context context) {
        super(fx0Var, context);
        this.I = fx0Var;
    }

    @Override // dx0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.W(canvas);
    }

    @Override // dx0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Exception e) {
            fa4.g(e, true);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new oy((byte) 3));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        fx0 fx0Var = this.I;
        fx0Var.h = null;
        fx0Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
