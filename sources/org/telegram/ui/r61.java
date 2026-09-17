package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class r61 extends sg.e1 {
    public final /* synthetic */ s61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r61(s61 s61Var, Context context) {
        super(context, 2, null);
        this.M = s61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        s61 s61Var = this.M;
        if (s61Var.getParent() instanceof View) {
            ((View) s61Var.getParent()).invalidate();
        }
    }
}
