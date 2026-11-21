package sg;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ j0 c;

    public /* synthetic */ t(v vVar, j0 j0Var, int i7) {
        this.a = i7;
        this.b = vVar;
        this.c = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.b, this.c, 1));
                break;
            default:
                v vVar = this.b;
                vVar.getClass();
                vVar.i = this.c.a;
                break;
        }
    }
}
