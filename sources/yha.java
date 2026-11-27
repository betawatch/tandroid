// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class yha extends d79 implements j6b {
    public int f3;
    public int g3;
    public int h3;
    public int i3;
    public boolean j3;

    @Override // j6b
    public final void b(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - hl.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        } else {
            iArr[0] = (getPaddingTop() - hl.L(2.0f)) - this.h3;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.i3;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f3 = i2;
        this.g3 = i4;
        super.setPadding(i, i2, i3, i4);
    }
}
