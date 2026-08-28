package qh;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ k2(o3 o3Var, a aVar, int i9, int i10) {
        this.a = i10;
        this.b = o3Var;
        this.c = aVar;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View z12;
        View z13;
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    o3Var.getClass();
                    z12 = null;
                } else {
                    z12 = o3Var.z1(aVar);
                }
                if (z12 instanceof s5) {
                    s5 s5Var = (s5) z12;
                    s5Var.B();
                    s5Var.getEditText().setSelection(Math.min(this.d, s5Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                o3 o3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    o3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = o3Var2.z1(aVar2);
                }
                if (z13 instanceof s5) {
                    s5 s5Var2 = (s5) z13;
                    s5Var2.B();
                    s5Var2.getEditText().setSelection(Math.min(this.d, s5Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View z14 = this.b.z1(this.c);
                if (z14 instanceof s5) {
                    s5 s5Var3 = (s5) z14;
                    s5Var3.B();
                    s5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof s5) {
                    s5 s5Var4 = (s5) z15;
                    s5Var4.B();
                    s5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View z16 = this.b.z1(this.c);
                if (z16 instanceof s5) {
                    s5 s5Var5 = (s5) z16;
                    s5Var5.B();
                    s5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View z17 = this.b.z1(this.c);
                if (z17 instanceof s5) {
                    s5 s5Var6 = (s5) z17;
                    s5Var6.B();
                    s5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
