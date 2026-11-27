// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r61 extends o61 {
    public final /* synthetic */ z61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r61(z61 z61Var, Context context) {
        super(context);
        this.d = z61Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = hl.L(5.0f);
        this.a.setOnClickListener(new k1(this, (byte) 27));
    }
}
