// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t18 extends FrameLayout {
    public final Paint a;
    public float b;
    public zna c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t18(p pVar, Context context) {
        super(context);
        this.d = pVar;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        zna znaVar = this.c;
        if (znaVar != null) {
            znaVar.d();
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
        zna znaVar2 = new zna(new xk4(f2 * 100.0f));
        aoa aoaVar = new aoa(f * 100.0f);
        aoaVar.b(z ? 500.0f : 650.0f);
        aoaVar.a(1.0f);
        znaVar2.m = aoaVar;
        this.c = znaVar2;
        znaVar2.b(new h20(this, (byte) 10));
        this.c.a(new hx0(this, (byte) 5));
        this.c.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = cmb.N6;
        p pVar = this.d;
        canvas.drawColor(pVar.getThemedColor(i));
        int themedColor = pVar.getThemedColor(cmb.Ui);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(jb6.a0 ? getWidth() - gm.L(28.0f) : gm.L(28.0f), -gm.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
