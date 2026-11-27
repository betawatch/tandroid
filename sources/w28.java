// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class w28 extends FrameLayout {
    public final Paint a;
    public float b;
    public vpa c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w28(p pVar, Context context) {
        super(context);
        this.d = pVar;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        vpa vpaVar = this.c;
        if (vpaVar != null) {
            vpaVar.d();
        }
        float f = z ? 1.0f : 0.0f;
        if (!z2) {
            this.b = f;
            TextView textView = this.d.V;
            if (textView != null) {
                textView.setAlpha((f * 0.2f) + 0.8f);
            }
            invalidate();
            return;
        }
        float f2 = this.b;
        if (f2 == f) {
            return;
        }
        vpa vpaVar2 = new vpa(new xk4(f2 * 100.0f));
        wpa wpaVar = new wpa(f * 100.0f);
        wpaVar.b(z ? 500.0f : 650.0f);
        wpaVar.a(1.0f);
        vpaVar2.m = wpaVar;
        this.c = vpaVar2;
        vpaVar2.b(new i10(this, (byte) 11));
        this.c.a(new iw0(this, (byte) 6));
        this.c.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = aob.O6;
        p pVar = this.d;
        canvas.drawColor(pVar.getThemedColor(i));
        int themedColor = pVar.getThemedColor(aob.Vi);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(ob6.a0 ? getWidth() - hl.L(28.0f) : hl.L(28.0f), -hl.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
