package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z31 extends org.telegram.ui.Components.uj0 {
    public int f3;
    public final /* synthetic */ z41 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(z41 z41Var, Context context) {
        super(context, null);
        this.g3 = z41Var;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        e41 e41Var;
        super.onMeasure(i7, i10);
        if (this.f3 != getMeasuredHeight() && (e41Var = this.g3.X) != null) {
            e41Var.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
