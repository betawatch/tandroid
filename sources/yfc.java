// default package

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yfc extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public yfc(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i = this.a;
        int height = view.getHeight() - i;
        float f = this.b;
        int i2 = this.a;
        outline.setRoundRect(i2, i2, width - i, height, f);
    }
}
