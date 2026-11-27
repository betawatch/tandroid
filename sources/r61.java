// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
