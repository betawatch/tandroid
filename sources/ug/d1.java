package ug;

import android.content.Context;
import bi.w4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qu;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d1 extends qu {
    public final /* synthetic */ f1 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, w4 w4Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(w4Var, context, f6Var, arrayList);
        this.N1 = f1Var;
    }

    @Override // org.telegram.ui.Components.qu
    public final void L0() {
        this.N1.dismiss();
    }
}
