package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ zx(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(this.b);
                break;
            case 1:
                org.telegram.messenger.g0.v1(this.b);
                break;
            default:
                org.telegram.messenger.g0.v1(this.b);
                break;
        }
    }
}
