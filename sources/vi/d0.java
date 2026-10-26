package vi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ d0(s0 s0Var, Exception exc, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h(this.c);
                break;
            case 1:
                this.b.h(this.c);
                break;
            case 2:
                this.b.h(this.c);
                break;
            default:
                this.b.h(this.c);
                break;
        }
    }
}
