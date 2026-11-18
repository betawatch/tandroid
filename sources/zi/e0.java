package zi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ e0(u0 u0Var, Exception exc, int i7) {
        this.a = i7;
        this.b = u0Var;
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
