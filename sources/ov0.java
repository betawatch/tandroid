// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ov0 implements bja {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ov0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // bja
    public final void L(int i, boolean z) {
        bf6 bf6Var;
        fv7 fv7Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fw0 fw0Var = ((ow0) obj).x;
                if (i > gl.L(20.0f)) {
                    fw0Var.d(fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY()));
                    break;
                }
                break;
            case 1:
                mf6 mf6Var = (mf6) obj;
                if (i > gl.L(20.0f) && mf6Var.r1()) {
                    gl.t1(mf6Var.fragmentView);
                }
                if (i <= gl.L(20.0f) && (bf6Var = mf6Var.U) != null) {
                    bf6Var.run();
                    mf6Var.U = null;
                    break;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (i >= gl.L(20.0f) && (fv7Var = passcodeActivity.U) != null) {
                    fv7Var.run();
                    passcodeActivity.U = null;
                    break;
                }
                break;
            default:
                fqc fqcVar = (fqc) obj;
                if (i <= gl.L(20.0f)) {
                    i = 0;
                }
                fqcVar.n = i;
                fqcVar.onInsets(fqcVar.r, fqcVar.s, fqcVar.w, fqcVar.x);
                break;
        }
    }
}
