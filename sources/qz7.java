// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qz7 extends FrameLayout {
    public final Paint a;
    public float b;
    public yla c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz7(p pVar, Context context) {
        super(context);
        this.d = pVar;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        yla ylaVar = this.c;
        if (ylaVar != null) {
            ylaVar.d();
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
        yla ylaVar2 = new yla(new ti4(f2 * 100.0f));
        zla zlaVar = new zla(f * 100.0f);
        zlaVar.b(z ? 500.0f : 650.0f);
        zlaVar.a(1.0f);
        ylaVar2.m = zlaVar;
        this.c = ylaVar2;
        ylaVar2.b(new h10(this, (byte) 10));
        this.c.a(new zv0(this, (byte) 5));
        this.c.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = bkb.N6;
        p pVar = this.d;
        canvas.drawColor(pVar.getThemedColor(i));
        int themedColor = pVar.getThemedColor(bkb.Ui);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(k96.a0 ? getWidth() - gl.L(28.0f) : gl.L(28.0f), -gl.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
