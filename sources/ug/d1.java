package ug;

import android.content.Context;
import bi.w4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ru;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d1 extends ru {
    public final /* synthetic */ f1 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, w4 w4Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(w4Var, context, f6Var, arrayList);
        this.N1 = f1Var;
    }

    @Override // org.telegram.ui.Components.ru
    public final void L0() {
        this.N1.dismiss();
    }
}
