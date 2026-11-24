// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ow extends View {
    public final /* synthetic */ pw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(pw pwVar, Activity activity) {
        super(activity);
        this.a = pwVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float i;
        pw pwVar = this.a;
        if (pwVar.e == null) {
            return;
        }
        int b = pwVar.c.b();
        int L = gm.L(4.0f) + hg9.y(6.0f, b - 1, gm.L(7.0f) * b);
        float f = pwVar.x + pwVar.w;
        if (L < getMeasuredWidth()) {
            i = (getMeasuredWidth() - L) / 2.0f;
        } else {
            float L2 = gm.L(4.0f);
            int L3 = gm.L(13.0f);
            i = L2 - (Utilities.i(f - (((getMeasuredWidth() - gm.L(8.0f)) / 2) / L3), Math.max(0, (b - (r10 << 1)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i2 = 0; i2 < pwVar.e.items.size(); i2++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i2 - f));
            o.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(gm.L(4.0f) + i + (gm.L(13.0f) * i2), getMeasuredHeight() / 2.0f, (gm.L(1.0f) * max) + gm.L(2.0f), o.D1);
        }
        canvas.restore();
    }
}
