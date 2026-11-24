// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vz8 extends pi4 {
    public final /* synthetic */ a09 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz8(a09 a09Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.V = a09Var;
    }

    @Override // pi4
    public final int getAdditionalHeight() {
        j17 j17Var;
        a09 a09Var = this.V;
        if (a09Var.I.isEmpty() || (j17Var = a09Var.K) == null) {
            return 0;
        }
        return gl.L(8.0f) + j17Var.getMeasuredHeight();
    }
}
