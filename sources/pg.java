// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pg implements dq7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ pg(int[] iArr, byte b) {
        this.a = b;
        this.b = iArr;
    }

    @Override // dq7
    public final String c(int i) {
        byte b = this.a;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                int i2 = iArr[i];
                return i2 == 0 ? ob6.M0(2131753842, null) : i2 < 10080 ? ob6.G(i2 / 1440, "Days", new Object[0]) : i2 < 44640 ? ob6.G(i2 / 10080, "Weeks", new Object[0]) : i2 < 525600 ? ob6.G(i2 / 44640, "Months", new Object[0]) : ob6.G(i2 / 525600, "Years", new Object[0]);
            default:
                int i3 = iArr[i];
                return i3 == 0 ? ob6.M0(2131748061, null) : i3 < 60 ? ob6.G(i3, "Minutes", new Object[0]) : i3 < 1440 ? ob6.G(i3 / 60, "Hours", new Object[0]) : i3 < 10080 ? ob6.G(i3 / 1440, "Days", new Object[0]) : i3 < 44640 ? ob6.G(i3 / 10080, "Weeks", new Object[0]) : i3 < 525600 ? ob6.G(i3 / 44640, "Months", new Object[0]) : ob6.G(i3 / 525600, "Years", new Object[0]);
        }
    }
}
