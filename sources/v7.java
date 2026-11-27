// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class v7 extends wk4 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(ViewGroup viewGroup, byte b) {
        super(false);
        this.e = b;
        this.f = viewGroup;
    }

    @Override // sy9
    public final CharSequence d() {
        byte b = this.e;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                return zoa.a(((w7) viewGroup).getSpeed()) + "x  " + ob6.M0(2131754754, null);
            case 1:
            default:
                return super.d();
            case 2:
                ty9 ty9Var = ((uy9) viewGroup).y;
                if (ty9Var != null) {
                    return ty9Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // wk4
    public final float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int i0 = ((uy9) this.f).y.i0();
                if (i0 > 0) {
                    return 1.0f / i0;
                }
                return 0.05f;
        }
    }

    @Override // wk4
    public final float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // wk4
    public final float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // wk4
    public final float k() {
        float f;
        int i;
        int i2;
        byte b = this.e;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                return ((w7) viewGroup).getSpeed();
            case 1:
                wb2 wb2Var = (wb2) viewGroup;
                nb2 nb2Var = wb2Var.D4;
                if (wb2Var.Q5.I3()) {
                    f = nb2Var.b;
                    i = nb2Var.f;
                    i2 = ry9.E;
                } else {
                    if (!r47.Q4(wb2Var.Q5.k)) {
                        if (wb2Var.Q5.g4()) {
                            return wb2Var.Q5.b0;
                        }
                        return 0.0f;
                    }
                    if (wb2Var.C4) {
                        xy9 xy9Var = wb2Var.E4;
                        return xy9Var.a / xy9Var.g;
                    }
                    f = nb2Var.b;
                    i = nb2Var.f;
                    i2 = ry9.E;
                }
                return f / (i - i2);
            default:
                return ((uy9) viewGroup).getProgress();
        }
    }

    @Override // wk4
    public final void l(float f) {
        byte b = this.e;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                ((w7) viewGroup).e(true, f);
                break;
            case 1:
                wb2 wb2Var = (wb2) viewGroup;
                xy9 xy9Var = wb2Var.E4;
                nb2 nb2Var = wb2Var.D4;
                if (wb2Var.Q5.I3()) {
                    nb2Var.g(f);
                } else if (r47.Q4(wb2Var.Q5.k)) {
                    if (wb2Var.C4) {
                        xy9Var.f(false, f);
                    } else {
                        nb2Var.g(f);
                    }
                } else if (wb2Var.Q5.g4()) {
                    if (wb2Var.C4) {
                        if (xy9Var != null) {
                            xy9Var.f(false, f);
                        }
                    } else if (nb2Var != null) {
                        nb2Var.g(f);
                    }
                    wb2Var.Q5.b0 = f;
                }
                wb2Var.g(f);
                wb2Var.invalidate();
                break;
            default:
                uy9 uy9Var = (uy9) viewGroup;
                uy9Var.x = true;
                uy9Var.setProgress(f);
                uy9Var.f(true, f);
                uy9Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(uy9 uy9Var, boolean z) {
        super(z);
        this.e = (byte) 2;
        this.f = uy9Var;
    }
}
