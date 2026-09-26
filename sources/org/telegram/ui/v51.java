package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class v51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ a71 c;

    public v51(a71 a71Var, Integer num) {
        this.c = a71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        a71 a71Var = this.c;
        boolean n10 = a71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (a71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.b1, AndroidUtilities.dp(a71Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * a71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.b1, AndroidUtilities.dp(a71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (a71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * a71Var.a1) + view.getPaddingLeft() + width), (int) ((height * a71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
