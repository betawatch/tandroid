package zh;

import android.content.Context;
import android.widget.FrameLayout;
import bi.rd;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h4 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ i4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(i4 i4Var, Context context, float f7) {
        super(context);
        this.b = i4Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pc.a(this.b.container, new rd(this, 11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this.b.container);
    }
}
