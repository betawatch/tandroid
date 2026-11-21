package org.telegram.ui.web;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(v0 v0Var, String str, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b.a;
                if (s0Var != null) {
                    s0Var.d(this.c);
                    break;
                }
                break;
            default:
                v0 v0Var = this.b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.c;
                v0Var.b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
