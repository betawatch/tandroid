// default package

import android.graphics.Point;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zlb extends tnd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gk7 b;

    public /* synthetic */ zlb(gk7 gk7Var, byte b) {
        this.a = b;
        this.b = gk7Var;
    }

    @Override // tnd
    public final void a() {
        switch (this.a) {
            case 1:
                ((hgc) this.b).w.invalidate();
                break;
        }
    }

    @Override // tnd
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Point point = gl.q;
                if ((point.x <= point.y) == (i <= i2)) {
                    ((qmb) this.b).z0.invalidate();
                    break;
                }
                break;
        }
    }
}
