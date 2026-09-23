package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ z61 c;

    public u51(z61 z61Var, Integer num) {
        this.c = z61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        z61 z61Var = this.c;
        boolean n10 = z61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (z61Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.b1, AndroidUtilities.dp(z61Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * z61Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.b1, AndroidUtilities.dp(z61Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (z61Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * z61Var.a1) + view.getPaddingLeft() + width), (int) ((height * z61Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
