package sg;

import a8.xa;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ xa c;

    public /* synthetic */ f0(i0 i0Var, xa xaVar, int i7) {
        this.a = i7;
        this.b = i0Var;
        this.c = xaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                i0 i0Var = this.b;
                i0Var.f.f(new f0(i0Var, this.c, 0));
                break;
        }
    }
}
