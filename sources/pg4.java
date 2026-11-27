// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pg4 extends View implements snb {
    public final hn a;
    public jl0 b;
    public String c;

    public pg4(Activity activity) {
        super(activity);
        hn hnVar = new hn(true, false, false);
        this.a = hnVar;
        hnVar.u(-1);
        hnVar.b = 17;
        hnVar.x(hl.o());
        hnVar.w(hl.L(14.0f));
        hnVar.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hn hnVar = this.a;
        int N = (int) (hl.N(30.0f) + hnVar.c());
        int width = (getWidth() - N) / 2;
        int i = N + width;
        jl0 jl0Var = this.b;
        if (jl0Var != null) {
            jl0Var.setBounds(width, 0, i, getHeight());
            this.b.draw(canvas);
        }
        hnVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    @Override // snb
    public final void updateColors() {
        jl0 jl0Var = this.b;
        if (jl0Var != null) {
            jl0Var.updateColors();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
