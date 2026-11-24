// default package

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ry9 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ vz9 c;

    public ry9(vz9 vz9Var, Integer num) {
        this.c = vz9Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        vz9 vz9Var = this.c;
        byte b = vz9Var.e1;
        float width = (this.b == null ? view.getWidth() / 2.0f : r2.intValue()) + gm.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        boolean m = vz9Var.m();
        Rect rect = this.a;
        if (m) {
            rect.set((int) ((width - (vz9Var.b1 * width)) + view.getPaddingLeft()), (int) td4.A(1.0f, vz9Var.c1, gm.L(b), td4.A(1.0f, vz9Var.c1, height, view.getPaddingTop())), (int) (((width2 - width) * vz9Var.b1) + view.getPaddingLeft() + width), (int) td4.A(1.0f, vz9Var.c1, gm.L(b), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (vz9Var.b1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * vz9Var.b1) + view.getPaddingLeft() + width), (int) ((height * vz9Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, gm.L(12.0f));
    }
}
