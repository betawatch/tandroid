package sg;

import ai.z4;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.aw;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class h1 extends aw {
    public final /* synthetic */ m1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var, z4 z4Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(z4Var, context, d6Var, arrayList);
        this.W = m1Var;
    }

    @Override // org.telegram.ui.Components.aw
    public final void Z() {
        this.W.dismiss();
    }
}
