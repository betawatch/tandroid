// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class psc extends View {
    public final /* synthetic */ wsc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psc(wsc wscVar, Context context) {
        super(context);
        this.a = wscVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        wsc wscVar = this.a;
        if (wscVar.Z0 > 0.0f) {
            boolean z = wscVar.Y0;
            float f = wscVar.V0;
            float B = z ? xnb.B(f, 2.0f, 3.0f, f * f) : 1.0f - ((float) Math.pow(1.0f - f, 4.0d));
            boolean z2 = wscVar.Y0;
            float f2 = (z2 || B >= 1.0f) ? -1.0f : wscVar.Z0 * 1.2f * B;
            vsc vscVar = wscVar.T0;
            if (vscVar == null || B >= 1.0f) {
                canvas2 = canvas;
            } else {
                float f3 = z2 ? 1.0f - B : 1.0f;
                canvas2 = canvas;
                wscVar.s(canvas2, vscVar, f3, f2, true);
            }
            vsc vscVar2 = wscVar.U0;
            if (vscVar2 != null) {
                wscVar.s(canvas2, vscVar2, wscVar.Y0 ? B : 1.0f, f2, false);
            }
        }
    }
}
