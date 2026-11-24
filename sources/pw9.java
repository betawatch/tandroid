// default package

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pw9 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ tx9 c;

    public pw9(tx9 tx9Var, Integer num) {
        this.c = tx9Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        tx9 tx9Var = this.c;
        byte b = tx9Var.e1;
        float width = (this.b == null ? view.getWidth() / 2.0f : r2.intValue()) + gl.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        boolean m = tx9Var.m();
        Rect rect = this.a;
        if (m) {
            rect.set((int) ((width - (tx9Var.b1 * width)) + view.getPaddingLeft()), (int) tb4.A(1.0f, tx9Var.c1, gl.L(b), tb4.A(1.0f, tx9Var.c1, height, view.getPaddingTop())), (int) (((width2 - width) * tx9Var.b1) + view.getPaddingLeft() + width), (int) tb4.A(1.0f, tx9Var.c1, gl.L(b), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (tx9Var.b1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * tx9Var.b1) + view.getPaddingLeft() + width), (int) ((height * tx9Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, gl.L(12.0f));
    }
}
