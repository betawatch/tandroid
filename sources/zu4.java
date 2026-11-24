// default package

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zu4 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv4 b;

    public /* synthetic */ zu4(tv4 tv4Var, byte b) {
        this.a = b;
        this.b = tv4Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        tv4 tv4Var = this.b;
        switch (b) {
            case 0:
                tv4Var.u2.setTitleMinSideInset(gl.L(6.0f) + ((Integer) obj).intValue());
                break;
            default:
                List list = (List) obj;
                if (tv4Var.getContext() != null && !tv4Var.J) {
                    ArrayList c = on0.c(1, list);
                    tv4Var.U1 = c;
                    List d = on0.d(c);
                    tv4Var.U1 = d;
                    if (!((ArrayList) d).isEmpty()) {
                        tv4Var.b1();
                        l5c l5cVar = tv4Var.T1;
                        if (l5cVar != null) {
                            l5cVar.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
