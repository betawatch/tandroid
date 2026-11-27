// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tb7 implements fn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ jc7 e;
    public final /* synthetic */ uc7 f;

    /* JADX WARN: Multi-variable type inference failed */
    public tb7(uc7 uc7Var, int i, int i2, int i3, long j, jc7 jc7Var) {
        this.f = uc7Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = jc7Var;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.H;
        jc7 jc7Var = this.e;
        int i4 = this.a;
        uc7 uc7Var = this.f;
        int i5 = jn7.G;
        if (i != i5 || ((Integer) objArr[0]).intValue() != i4) {
            if (i == i3 && ((Integer) objArr[0]).intValue() == i4) {
                uc7Var.getNotificationCenter().n(this, i5);
                uc7Var.getNotificationCenter().n(this, i3);
                if (jc7Var != null) {
                    jc7Var.a();
                    return;
                }
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int intValue2 = ((Integer) objArr[4]).intValue();
        byte b = this.b;
        if (intValue >= b / 2 || booleanValue2 || !booleanValue) {
            uc7Var.getNotificationCenter().n(this, i5);
            uc7Var.getNotificationCenter().n(this, i3);
            if (jc7Var != null) {
                jc7Var.l(booleanValue);
                return;
            }
            return;
        }
        int i6 = this.c;
        long j = this.d;
        if (i6 != 0) {
            uc7Var.h3(j, 0L, false, b, i6, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            uc7Var.h3(j, 0L, false, b, i6, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
