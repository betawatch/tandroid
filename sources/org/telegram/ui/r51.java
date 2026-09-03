package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ x61 c;

    public r51(x61 x61Var, Integer num) {
        this.c = x61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        x61 x61Var = this.c;
        boolean n10 = x61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (x61Var.X0 * width)) + view.getPaddingLeft()), (int) e2.c.w(1.0f, x61Var.Y0, AndroidUtilities.dp(x61Var.a1), e2.c.w(1.0f, x61Var.Y0, height, view.getPaddingTop())), (int) (((width2 - width) * x61Var.X0) + view.getPaddingLeft() + width), (int) e2.c.w(1.0f, x61Var.Y0, AndroidUtilities.dp(x61Var.a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (x61Var.X0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * x61Var.X0) + view.getPaddingLeft() + width), (int) ((height * x61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
