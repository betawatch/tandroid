package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class i0 extends ViewOutlineProvider {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public i0(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = z10;
        this.b = i10;
        this.c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z10 = this.a;
        int i10 = this.b;
        outline.setRoundRect(-(z10 ? 0 : i10), -(this.c ? 0 : i10), width + (this.d ? 0 : i10), height + (this.e ? 0 : i10), i10);
    }
}
