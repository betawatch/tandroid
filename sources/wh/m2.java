package wh;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ m2(r3 r3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = r3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View y12;
        View y13;
        switch (this.a) {
            case 0:
                r3 r3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    r3Var.getClass();
                    y12 = null;
                } else {
                    y12 = r3Var.y1(aVar);
                }
                if (y12 instanceof v5) {
                    v5 v5Var = (v5) y12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(Math.min(this.d, v5Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                r3 r3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    r3Var2.getClass();
                    y13 = null;
                } else {
                    y13 = r3Var2.y1(aVar2);
                }
                if (y13 instanceof v5) {
                    v5 v5Var2 = (v5) y13;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(Math.min(this.d, v5Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View y14 = this.b.y1(this.c);
                if (y14 instanceof v5) {
                    v5 v5Var3 = (v5) y14;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View y15 = this.b.y1(this.c);
                if (y15 instanceof v5) {
                    v5 v5Var4 = (v5) y15;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View y16 = this.b.y1(this.c);
                if (y16 instanceof v5) {
                    v5 v5Var5 = (v5) y16;
                    v5Var5.B();
                    v5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View y17 = this.b.y1(this.c);
                if (y17 instanceof v5) {
                    v5 v5Var6 = (v5) y17;
                    v5Var6.B();
                    v5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
