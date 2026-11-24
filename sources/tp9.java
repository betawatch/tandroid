// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class tp9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vp9 b;

    public /* synthetic */ tp9(vp9 vp9Var, byte b) {
        this.a = b;
        this.b = vp9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vp9 vp9Var = this.b;
        switch (b) {
            case 0:
                vp9Var.g(false);
                break;
            case 1:
                vp9Var.o = false;
                break;
            case 2:
                vp9Var.o = false;
                vp9Var.l = false;
                break;
            case 3:
                vp9Var.k();
                break;
            default:
                if (!vp9Var.o) {
                    vp9Var.o = true;
                    ArrayList arrayList = new ArrayList(vp9Var.j);
                    ad7 Y = ad7.Y(vp9Var.a);
                    Y.a.c(new gm8(vp9Var, Y, arrayList, (byte) 22));
                    break;
                }
                break;
        }
    }
}
