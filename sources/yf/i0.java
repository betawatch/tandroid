package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public i0(int i10, float f7) {
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
