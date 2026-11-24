// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ya extends wf2 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(or4 or4Var, Context context, f53 f53Var) {
        super(24, f53Var, context);
        this.d = (byte) 2;
        this.e = or4Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.d;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                super.invalidate();
                ((bb) viewGroup).invalidate();
                break;
            case 1:
                super.invalidate();
                ((ue3) viewGroup).invalidate();
                break;
            default:
                super.invalidate();
                ((or4) viewGroup).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya(ViewGroup viewGroup, Context context, wjb wjbVar, byte b) {
        super(21, wjbVar, context);
        this.d = b;
        this.e = viewGroup;
    }
}
