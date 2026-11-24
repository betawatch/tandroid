// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ov extends View {
    public final /* synthetic */ pv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(pv pvVar, Activity activity) {
        super(activity);
        this.a = pvVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float i;
        pv pvVar = this.a;
        if (pvVar.e == null) {
            return;
        }
        int b = pvVar.c.b();
        int L = gl.L(4.0f) + de9.y(6.0f, b - 1, gl.L(7.0f) * b);
        float f = pvVar.x + pvVar.w;
        if (L < getMeasuredWidth()) {
            i = (getMeasuredWidth() - L) / 2.0f;
        } else {
            float L2 = gl.L(4.0f);
            int L3 = gl.L(13.0f);
            i = L2 - (Utilities.i(f - (((getMeasuredWidth() - gl.L(8.0f)) / 2) / L3), Math.max(0, (b - (r10 << 1)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i2 = 0; i2 < pvVar.e.items.size(); i2++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i2 - f));
            o.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(gl.L(4.0f) + i + (gl.L(13.0f) * i2), getMeasuredHeight() / 2.0f, (gl.L(1.0f) * max) + gl.L(2.0f), o.D1);
        }
        canvas.restore();
    }
}
