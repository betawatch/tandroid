// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ukc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u41 b;
    public final /* synthetic */ fx0 c;
    public final /* synthetic */ wjb d;

    public /* synthetic */ ukc(u41 u41Var, fx0 fx0Var, wjb wjbVar, byte b) {
        this.a = b;
        this.b = u41Var;
        this.c = fx0Var;
        this.d = wjbVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        wjb wjbVar = this.d;
        fx0 fx0Var = this.c;
        u41 u41Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                u41Var.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    new u21(fx0Var.F, wjbVar).f0(str, false);
                    break;
                } else {
                    fx0Var.dismiss();
                    break;
                }
            default:
                u41Var.setLoading(false);
                if (str == null) {
                    fx0Var.dismiss();
                    break;
                } else {
                    new u21(fx0Var.F, wjbVar).f0(str, false);
                    break;
                }
        }
    }
}
