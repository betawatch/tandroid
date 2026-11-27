// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class tnc extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vnc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnc(vnc vncVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = vncVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        vnc vncVar = this.b;
        switch (b) {
            case 0:
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                vncVar.j(canvas, rectF, vncVar.h0 ? -1 : vncVar.i0, 1.0f);
                break;
            default:
                RectF rectF2 = hl.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                vncVar.e(canvas, rectF2, vncVar.h0 ? -1 : vncVar.i0, 1.0f);
                break;
        }
    }
}
