package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t6 extends p6 {
    public final /* synthetic */ c7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(c7 c7Var, Context context) {
        super(context);
        this.d = c7Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.a.setOnClickListener(new a(this, 5));
    }
}
