package th;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g4 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ h4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var, Context context, float f7) {
        super(context);
        this.b = h4Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wb.a(this.b.c, new org.telegram.ui.Components.k7(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wb.h(this.b.c);
    }
}
