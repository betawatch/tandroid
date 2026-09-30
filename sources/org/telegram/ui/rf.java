package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout b;

    public /* synthetic */ rf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.a = i10;
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getSwipeBack().b(true);
                break;
            case 1:
                this.b.getSwipeBack().b(true);
                break;
            default:
                this.b.getSwipeBack().b(true);
                break;
        }
    }
}
