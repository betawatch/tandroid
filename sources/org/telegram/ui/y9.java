package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class y9 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ z9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = z9Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
