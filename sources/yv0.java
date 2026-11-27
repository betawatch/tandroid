// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yv0 implements vma {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // vma
    public final void L(int i, boolean z) {
        fh6 fh6Var;
        my7 my7Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ow0 ow0Var = ((xw0) obj).x;
                if (i > hl.L(20.0f)) {
                    ow0Var.d(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()));
                    break;
                }
                break;
            case 1:
                qh6 qh6Var = (qh6) obj;
                if (i > hl.L(20.0f) && qh6Var.s1()) {
                    hl.t1(qh6Var.fragmentView);
                }
                if (i <= hl.L(20.0f) && (fh6Var = qh6Var.U) != null) {
                    fh6Var.run();
                    qh6Var.U = null;
                    break;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (i >= hl.L(20.0f) && (my7Var = passcodeActivity.U) != null) {
                    my7Var.run();
                    passcodeActivity.U = null;
                    break;
                }
                break;
            default:
                tuc tucVar = (tuc) obj;
                if (i <= hl.L(20.0f)) {
                    i = 0;
                }
                tucVar.n = i;
                tucVar.onInsets(tucVar.r, tucVar.s, tucVar.w, tucVar.x);
                break;
        }
    }
}
