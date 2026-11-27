// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vb extends eva {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb(Context context, byte b) {
        super(context);
        this.r = b;
    }

    @Override // eva
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                dva dvaVar = this.a;
                dvaVar.q = true;
                dvaVar.J = false;
                dvaVar.K = true;
                dvaVar.H = true;
                dvaVar.c();
                break;
            case 1:
                super.a();
                dva dvaVar2 = this.a;
                dvaVar2.q = true;
                dvaVar2.J = false;
                dvaVar2.K = true;
                dvaVar2.H = true;
                dvaVar2.c();
                break;
            case 2:
                dva dvaVar3 = this.a;
                dvaVar3.q = true;
                dvaVar3.J = false;
                dvaVar3.H = true;
                dvaVar3.I = true;
                dvaVar3.k = hl.L(-14.0f);
                dva dvaVar4 = this.a;
                dvaVar4.x = (short) 2000;
                dvaVar4.y = (short) 3000;
                dvaVar4.r = (byte) 16;
                dvaVar4.G = false;
                dvaVar4.N = 28;
                dvaVar4.P = aob.Dk;
                dvaVar4.c();
                break;
            case 3:
                k15 k15Var = new k15(50);
                this.a = k15Var;
                k15Var.N = 100;
                k15Var.L = false;
                k15Var.G = false;
                k15Var.J = true;
                k15Var.H = true;
                k15Var.I = false;
                k15Var.r = (byte) 4;
                k15Var.w = 0.98f;
                k15Var.v = 0.98f;
                k15Var.u = 0.98f;
                k15Var.c();
                break;
            case 4:
                dva dvaVar5 = this.a;
                dvaVar5.q = true;
                dvaVar5.J = false;
                dvaVar5.H = true;
                dvaVar5.I = true;
                dvaVar5.k = hl.L(-14.0f);
                dva dvaVar6 = this.a;
                dvaVar6.x = (short) 2000;
                dvaVar6.y = (short) 3000;
                dvaVar6.r = (byte) 16;
                dvaVar6.G = false;
                dvaVar6.N = 28;
                dvaVar6.P = aob.Dk;
                dvaVar6.c();
                break;
            default:
                super.a();
                dva dvaVar7 = this.a;
                dvaVar7.q = true;
                dvaVar7.J = false;
                dvaVar7.K = true;
                dvaVar7.H = true;
                dvaVar7.c();
                break;
        }
    }

    @Override // eva
    public final int getStarsRectWidth() {
        switch (this.r) {
            case 0:
                return getMeasuredWidth();
            case 1:
                return getMeasuredWidth();
            case 2:
            default:
                return super.getStarsRectWidth();
            case 3:
                return getMeasuredWidth();
        }
    }

    @Override // eva, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.r) {
            case 2:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
                break;
            case 3:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
                break;
            case 5:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
                break;
        }
    }
}
