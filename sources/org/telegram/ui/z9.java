package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z9 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ aa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(aa aaVar, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = aaVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
