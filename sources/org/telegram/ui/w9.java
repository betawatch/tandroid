package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w9 extends EditTextBoldCursor {
    public final /* synthetic */ int H1;
    public final /* synthetic */ x9 I1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9(x9 x9Var, Context context, int i3) {
        super(context);
        this.H1 = i3;
        this.I1 = x9Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.H1) {
        }
        return this.I1.d;
    }
}
