package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.tv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g1 extends tv {
    public final /* synthetic */ k1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k1 k1Var, y3 y3Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(y3Var, context, f6Var, arrayList);
        this.W = k1Var;
    }

    @Override // org.telegram.ui.Components.tv
    public final void Y() {
        this.W.dismiss();
    }
}
