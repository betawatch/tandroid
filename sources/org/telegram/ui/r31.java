package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class r31 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ s31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r31(s31 s31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.x = s31Var;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        s31 s31Var = this.x;
        ci.d dVar = s31Var.s;
        if (dVar != null) {
            dVar.setEnabled(s31Var.d.optional || !TextUtils.isEmpty(s31Var.n.getText()));
        }
    }
}
