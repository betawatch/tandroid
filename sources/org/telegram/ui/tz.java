package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ tz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.b);
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.b);
                break;
            default:
                AndroidUtilities.hideKeyboard(this.b);
                break;
        }
    }
}
