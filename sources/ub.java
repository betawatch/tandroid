// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ub extends dta {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub(Context context, byte b) {
        super(context);
        this.r = b;
    }

    @Override // dta
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                cta ctaVar = this.a;
                ctaVar.q = true;
                ctaVar.J = false;
                ctaVar.K = true;
                ctaVar.H = true;
                ctaVar.c();
                break;
            case 1:
                super.a();
                cta ctaVar2 = this.a;
                ctaVar2.q = true;
                ctaVar2.J = false;
                ctaVar2.K = true;
                ctaVar2.H = true;
                ctaVar2.c();
                break;
            case 2:
                cta ctaVar3 = this.a;
                ctaVar3.q = true;
                ctaVar3.J = false;
                ctaVar3.H = true;
                ctaVar3.I = true;
                ctaVar3.k = gm.L(-14.0f);
                cta ctaVar4 = this.a;
                ctaVar4.x = (short) 2000;
                ctaVar4.y = (short) 3000;
                ctaVar4.r = (byte) 16;
                ctaVar4.G = false;
                ctaVar4.N = 28;
                ctaVar4.P = cmb.Ck;
                ctaVar4.c();
                break;
            case 3:
                f15 f15Var = new f15(50);
                this.a = f15Var;
                f15Var.N = 100;
                f15Var.L = false;
                f15Var.G = false;
                f15Var.J = true;
                f15Var.H = true;
                f15Var.I = false;
                f15Var.r = (byte) 4;
                f15Var.w = 0.98f;
                f15Var.v = 0.98f;
                f15Var.u = 0.98f;
                f15Var.c();
                break;
            case 4:
                cta ctaVar5 = this.a;
                ctaVar5.q = true;
                ctaVar5.J = false;
                ctaVar5.H = true;
                ctaVar5.I = true;
                ctaVar5.k = gm.L(-14.0f);
                cta ctaVar6 = this.a;
                ctaVar6.x = (short) 2000;
                ctaVar6.y = (short) 3000;
                ctaVar6.r = (byte) 16;
                ctaVar6.G = false;
                ctaVar6.N = 28;
                ctaVar6.P = cmb.Ck;
                ctaVar6.c();
                break;
            default:
                super.a();
                cta ctaVar7 = this.a;
                ctaVar7.q = true;
                ctaVar7.J = false;
                ctaVar7.K = true;
                ctaVar7.H = true;
                ctaVar7.c();
                break;
        }
    }

    @Override // dta
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

    @Override // dta, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.r) {
            case 2:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
                break;
            case 3:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
                break;
            case 5:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
                break;
        }
    }
}
