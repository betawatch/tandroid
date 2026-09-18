package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class h0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public h0(int i10, float f7) {
        this.a = i10;
        this.b = f7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.a;
        int height = view.getHeight() - i10;
        float f7 = this.b;
        int i11 = this.a;
        outline.setRoundRect(i11, i11, width - i10, height, f7);
    }
}
