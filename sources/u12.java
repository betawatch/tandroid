// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u12 extends qqc {
    public final /* synthetic */ byte x;
    public final /* synthetic */ n39 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(dy0 dy0Var, Context context) {
        super(context, 1);
        this.x = (byte) 0;
        this.y = dy0Var;
    }

    @Override // qqc
    public final void a(int i, Object obj) {
        byte b = this.x;
        n39 n39Var = this.y;
        switch (b) {
            case 0:
                vs2 vs2Var = ((v12) ((dy0) n39Var).f).y;
                if (vs2Var != null) {
                    vs2Var.accept(obj);
                    break;
                }
                break;
            case 1:
                ((mrc) n39Var).d.E0(this, obj, i);
                break;
            default:
                ((orc) n39Var).F.presentFragment(new qmb(obj, null, true));
                break;
        }
    }

    @Override // qqc
    public final boolean b(Object obj, int i) {
        switch (this.x) {
            case 1:
                return ((mrc) this.y).d.F0(this, obj, i);
            default:
                return super.b(obj, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u12(n39 n39Var, Context context, byte b) {
        super(context, 5);
        this.x = b;
        this.y = n39Var;
    }
}
