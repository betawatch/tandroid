package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements org.telegram.ui.Components.pt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z5(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.pt0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) recyclerView;
                ih.d.a(ck0Var, canvas, rectF, ck0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.ck0 ck0Var2 = (org.telegram.ui.Components.ck0) recyclerView;
                ih.d.a(ck0Var2, canvas, rectF, ck0Var2, this.b);
                break;
        }
    }
}
