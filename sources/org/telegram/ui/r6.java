package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class r6 extends n6 {
    public final /* synthetic */ a7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(a7 a7Var, Context context) {
        super(context);
        this.d = a7Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.a.setOnClickListener(new a(this, 6));
    }
}
