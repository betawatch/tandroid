package ug;

import android.content.Context;
import bi.c9;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ev;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f1 extends ev {
    public final /* synthetic */ h1 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, c9 c9Var, Context context, h6 h6Var, ArrayList arrayList) {
        super(c9Var, context, h6Var, arrayList);
        this.R1 = h1Var;
    }

    @Override // org.telegram.ui.Components.ev
    public final void M0() {
        this.R1.dismiss();
    }
}
