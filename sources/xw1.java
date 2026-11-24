// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
