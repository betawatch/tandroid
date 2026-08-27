package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zk extends UndoView {
    public final /* synthetic */ rn b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(rn rnVar, Activity activity, rn rnVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, rnVar2, true, c6Var);
        this.b0 = rnVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.b0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        xj xjVar = this.b0.T1;
        setAdditionalTranslationY((xjVar == null || !(((i11 = xjVar.P) == 1 || i11 == 3) && xjVar.O)) ? 0.0f : AndroidUtilities.dp(xjVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
