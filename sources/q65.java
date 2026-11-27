// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q65 extends zo {
    public final /* synthetic */ j95 c;

    public q65(j95 j95Var) {
        this.c = j95Var;
    }

    @Override // zo
    public final int i(int i) {
        int size = this.c.g4.e.size();
        if (size <= 1 || size == 2) {
            return 6;
        }
        return (size != 3 || i == 0 || i == 1) ? 3 : 6;
    }
}
