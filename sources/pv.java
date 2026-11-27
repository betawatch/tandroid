// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pv extends View {
    public final /* synthetic */ qv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(qv qvVar, Activity activity) {
        super(activity);
        this.a = qvVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float i;
        qv qvVar = this.a;
        if (qvVar.e == null) {
            return;
        }
        int b = qvVar.c.b();
        int L = hl.L(4.0f) + uh9.y(6.0f, b - 1, hl.L(7.0f) * b);
        float f = qvVar.x + qvVar.w;
        if (L < getMeasuredWidth()) {
            i = (getMeasuredWidth() - L) / 2.0f;
        } else {
            float L2 = hl.L(4.0f);
            int L3 = hl.L(13.0f);
            i = L2 - (Utilities.i(f - (((getMeasuredWidth() - hl.L(8.0f)) / 2) / L3), Math.max(0, (b - (r10 << 1)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i2 = 0; i2 < qvVar.e.items.size(); i2++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i2 - f));
            o.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(hl.L(4.0f) + i + (hl.L(13.0f) * i2), getMeasuredHeight() / 2.0f, (hl.L(1.0f) * max) + hl.L(2.0f), o.D1);
        }
        canvas.restore();
    }
}
