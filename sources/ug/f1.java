package ug;

import android.content.Context;
import bi.b9;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ev;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f1 extends ev {
    public final /* synthetic */ h1 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, b9 b9Var, Context context, h6 h6Var, ArrayList arrayList) {
        super(b9Var, context, h6Var, arrayList);
        this.R1 = h1Var;
    }

    @Override // org.telegram.ui.Components.ev
    public final void M0() {
        this.R1.dismiss();
    }
}
