package ug;

import android.content.Context;
import bi.w4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ru;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d1 extends ru {
    public final /* synthetic */ f1 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, w4 w4Var, Context context, g6 g6Var, ArrayList arrayList) {
        super(w4Var, context, g6Var, arrayList);
        this.N1 = f1Var;
    }

    @Override // org.telegram.ui.Components.ru
    public final void L0() {
        this.N1.dismiss();
    }
}
