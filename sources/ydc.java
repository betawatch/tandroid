// default package

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ydc extends ViewOutlineProvider {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public ydc(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z = this.a;
        int i = this.b;
        outline.setRoundRect(-(z ? 0 : i), -(this.c ? 0 : i), width + (this.d ? 0 : i), height + (this.e ? 0 : i), i);
    }
}
