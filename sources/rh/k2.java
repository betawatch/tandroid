package rh;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ k2(p3 p3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = p3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View z12;
        View z13;
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    p3Var.getClass();
                    z12 = null;
                } else {
                    z12 = p3Var.z1(aVar);
                }
                if (z12 instanceof t5) {
                    t5 t5Var = (t5) z12;
                    t5Var.B();
                    t5Var.getEditText().setSelection(Math.min(this.d, t5Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                p3 p3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    p3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = p3Var2.z1(aVar2);
                }
                if (z13 instanceof t5) {
                    t5 t5Var2 = (t5) z13;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(Math.min(this.d, t5Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View z14 = this.b.z1(this.c);
                if (z14 instanceof t5) {
                    t5 t5Var3 = (t5) z14;
                    t5Var3.B();
                    t5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof t5) {
                    t5 t5Var4 = (t5) z15;
                    t5Var4.B();
                    t5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View z16 = this.b.z1(this.c);
                if (z16 instanceof t5) {
                    t5 t5Var5 = (t5) z16;
                    t5Var5.B();
                    t5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View z17 = this.b.z1(this.c);
                if (z17 instanceof t5) {
                    t5 t5Var6 = (t5) z17;
                    t5Var6.B();
                    t5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
