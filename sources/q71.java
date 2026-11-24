// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q71 extends n71 {
    public final /* synthetic */ y71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q71(y71 y71Var, Context context) {
        super(context);
        this.d = y71Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gm.L(5.0f);
        this.a.setOnClickListener(new j1(this, (byte) 28));
    }
}
