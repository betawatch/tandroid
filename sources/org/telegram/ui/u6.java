package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u6 extends q6 {
    public final /* synthetic */ d7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(d7 d7Var, Context context) {
        super(context);
        this.d = d7Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.a.setOnClickListener(new a(this, 6));
    }
}
