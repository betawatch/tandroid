package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x41 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ c61 c;

    public x41(c61 c61Var, Integer num) {
        this.c = c61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        c61 c61Var = this.c;
        boolean n10 = c61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (c61Var.a1 * width)) + view.getPaddingLeft()), (int) c3.h0.z(1.0f, c61Var.b1, AndroidUtilities.dp(c61Var.d1), c3.h0.z(1.0f, c61Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * c61Var.a1) + view.getPaddingLeft() + width), (int) c3.h0.z(1.0f, c61Var.b1, AndroidUtilities.dp(c61Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (c61Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * c61Var.a1) + view.getPaddingLeft() + width), (int) ((height * c61Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
