package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class x51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ c71 c;

    public x51(c71 c71Var, Integer num) {
        this.c = c71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        c71 c71Var = this.c;
        boolean n10 = c71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (c71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.b1, AndroidUtilities.dp(c71Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * c71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.b1, AndroidUtilities.dp(c71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (c71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * c71Var.a1) + view.getPaddingLeft() + width), (int) ((height * c71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
