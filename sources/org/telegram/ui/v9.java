package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v9 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ w9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9(w9 w9Var, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = w9Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
