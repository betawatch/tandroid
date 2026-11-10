package ug;

import android.content.Context;
import bi.w4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qu;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d1 extends qu {
    public final /* synthetic */ f1 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, w4 w4Var, Context context, h6 h6Var, ArrayList arrayList) {
        super(w4Var, context, h6Var, arrayList);
        this.Q1 = f1Var;
    }

    @Override // org.telegram.ui.Components.qu
    public final void L0() {
        this.Q1.dismiss();
    }
}
