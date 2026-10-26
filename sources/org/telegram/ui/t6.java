package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
