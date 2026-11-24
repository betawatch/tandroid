// default package

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xdc extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public xdc(int i, float f) {
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
