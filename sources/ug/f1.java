package ug;

import android.content.Context;
import bi.b9;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ev;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
