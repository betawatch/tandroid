package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ w61 c;

    public r51(w61 w61Var, Integer num) {
        this.c = w61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        w61 w61Var = this.c;
        boolean n10 = w61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (w61Var.X0 * width)) + view.getPaddingLeft()), (int) e2.c.w(1.0f, w61Var.Y0, AndroidUtilities.dp(w61Var.a1), e2.c.w(1.0f, w61Var.Y0, height, view.getPaddingTop())), (int) (((width2 - width) * w61Var.X0) + view.getPaddingLeft() + width), (int) e2.c.w(1.0f, w61Var.Y0, AndroidUtilities.dp(w61Var.a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (w61Var.X0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * w61Var.X0) + view.getPaddingLeft() + width), (int) ((height * w61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
