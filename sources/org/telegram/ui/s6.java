package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s6 extends o6 {
    public final /* synthetic */ b7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(b7 b7Var, Context context) {
        super(context);
        this.d = b7Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.a.setOnClickListener(new a(this, 6));
    }
}
