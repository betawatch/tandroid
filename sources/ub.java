// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ub extends cra {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub(Context context, byte b) {
        super(context);
        this.r = b;
    }

    @Override // cra
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                bra braVar = this.a;
                braVar.q = true;
                braVar.J = false;
                braVar.K = true;
                braVar.H = true;
                braVar.c();
                break;
            case 1:
                super.a();
                bra braVar2 = this.a;
                braVar2.q = true;
                braVar2.J = false;
                braVar2.K = true;
                braVar2.H = true;
                braVar2.c();
                break;
            case 2:
                bra braVar3 = this.a;
                braVar3.q = true;
                braVar3.J = false;
                braVar3.H = true;
                braVar3.I = true;
                braVar3.k = gl.L(-14.0f);
                bra braVar4 = this.a;
                braVar4.x = (short) 2000;
                braVar4.y = (short) 3000;
                braVar4.r = (byte) 16;
                braVar4.G = false;
                braVar4.N = 28;
                braVar4.P = bkb.Ck;
                braVar4.c();
                break;
            case 3:
                gz4 gz4Var = new gz4(50);
                this.a = gz4Var;
                gz4Var.N = 100;
                gz4Var.L = false;
                gz4Var.G = false;
                gz4Var.J = true;
                gz4Var.H = true;
                gz4Var.I = false;
                gz4Var.r = (byte) 4;
                gz4Var.w = 0.98f;
                gz4Var.v = 0.98f;
                gz4Var.u = 0.98f;
                gz4Var.c();
                break;
            case 4:
                bra braVar5 = this.a;
                braVar5.q = true;
                braVar5.J = false;
                braVar5.H = true;
                braVar5.I = true;
                braVar5.k = gl.L(-14.0f);
                bra braVar6 = this.a;
                braVar6.x = (short) 2000;
                braVar6.y = (short) 3000;
                braVar6.r = (byte) 16;
                braVar6.G = false;
                braVar6.N = 28;
                braVar6.P = bkb.Ck;
                braVar6.c();
                break;
            default:
                super.a();
                bra braVar7 = this.a;
                braVar7.q = true;
                braVar7.J = false;
                braVar7.K = true;
                braVar7.H = true;
                braVar7.c();
                break;
        }
    }

    @Override // cra
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

    @Override // cra, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.r) {
            case 2:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
                break;
            case 3:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
                break;
            case 5:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
                break;
        }
    }
}
