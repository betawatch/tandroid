package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w9 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9(x9 x9Var, Context context, int i9) {
        super(context);
        this.b = i9;
        this.c = x9Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
