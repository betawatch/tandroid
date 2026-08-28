package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w41 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ b61 c;

    public w41(b61 b61Var, Integer num) {
        this.c = b61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        b61 b61Var = this.c;
        boolean n10 = b61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (b61Var.W0 * width)) + view.getPaddingLeft()), (int) e2.c.z(1.0f, b61Var.X0, AndroidUtilities.dp(b61Var.Z0), e2.c.z(1.0f, b61Var.X0, height, view.getPaddingTop())), (int) (((width2 - width) * b61Var.W0) + view.getPaddingLeft() + width), (int) e2.c.z(1.0f, b61Var.X0, AndroidUtilities.dp(b61Var.Z0), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (b61Var.W0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * b61Var.W0) + view.getPaddingLeft() + width), (int) ((height * b61Var.X0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
