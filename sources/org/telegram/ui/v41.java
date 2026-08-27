package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v41 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ a61 c;

    public v41(a61 a61Var, Integer num) {
        this.c = a61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        a61 a61Var = this.c;
        boolean n10 = a61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (a61Var.W0 * width)) + view.getPaddingLeft()), (int) com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, AndroidUtilities.dp(a61Var.Z0), com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, height, view.getPaddingTop())), (int) (((width2 - width) * a61Var.W0) + view.getPaddingLeft() + width), (int) com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, AndroidUtilities.dp(a61Var.Z0), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (a61Var.W0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * a61Var.W0) + view.getPaddingLeft() + width), (int) ((height * a61Var.X0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
