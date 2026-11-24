// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xw1 implements yr3 {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ bia c;

    public xw1(float f, bia biaVar) {
        this.b = f;
        this.c = biaVar;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        if (this.a || f < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
