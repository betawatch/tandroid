package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xk extends UndoView {
    public final /* synthetic */ qn b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(qn qnVar, Activity activity, qn qnVar2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, qnVar2, true, b6Var);
        this.b0 = qnVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.b0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i9, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        vj vjVar = this.b0.T1;
        setAdditionalTranslationY((vjVar == null || !(((i10 = vjVar.P) == 1 || i10 == 3) && vjVar.O)) ? 0.0f : AndroidUtilities.dp(vjVar.getStyleHeight()));
        super.k(j10, i9, obj, obj2, runnable, runnable2);
    }
}
