// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class za extends og2 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(st4 st4Var, Context context, x53 x53Var) {
        super(24, x53Var, context);
        this.d = (byte) 2;
        this.e = st4Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.d;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                super.invalidate();
                ((cb) viewGroup).invalidate();
                break;
            case 1:
                super.invalidate();
                ((of3) viewGroup).invalidate();
                break;
            default:
                super.invalidate();
                ((st4) viewGroup).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za(ViewGroup viewGroup, Context context, vnb vnbVar, byte b) {
        super(21, vnbVar, context);
        this.d = b;
        this.e = viewGroup;
    }
}
