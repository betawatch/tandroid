package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class s41 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ x51 c;

    public s41(x51 x51Var, Integer num) {
        this.c = x51Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        x51 x51Var = this.c;
        boolean n10 = x51Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (x51Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, x51Var.b1, AndroidUtilities.dp(x51Var.d1), com.google.android.gms.internal.play_billing.k3.y(1.0f, x51Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * x51Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, x51Var.b1, AndroidUtilities.dp(x51Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (x51Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * x51Var.a1) + view.getPaddingLeft() + width), (int) ((height * x51Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
