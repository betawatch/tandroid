// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
