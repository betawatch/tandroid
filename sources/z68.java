// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class z68 implements fn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ fn7[] c;

    public z68(int i, pcc pccVar, fn7[] fn7VarArr) {
        this.a = i;
        this.b = pccVar;
        this.c = fn7VarArr;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.s5;
        if (i == i3) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                pcc pccVar = this.b;
                if (pccVar != null) {
                    pccVar.a(iArr);
                }
                jn7.e().n(this.c[0], i3);
            }
        }
    }
}
