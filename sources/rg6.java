// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rg6 extends te6 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ cna f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg6(tg6 tg6Var, Context context, byte b) {
        super(tg6Var.v0, context);
        this.e = b;
        switch (b) {
            case 1:
                this.f = tg6Var;
                super(tg6Var.v0, context);
                break;
            default:
                this.f = tg6Var;
                break;
        }
    }

    @Override // te6
    public final boolean a() {
        byte b = this.e;
        cna cnaVar = this.f;
        switch (b) {
            case 0:
                return ((tg6) cnaVar).l0;
            case 1:
                return ((tg6) cnaVar).l0;
            default:
                return ((sf6) cnaVar).N;
        }
    }

    @Override // te6
    public final boolean b() {
        byte b = this.e;
        cna cnaVar = this.f;
        switch (b) {
            case 0:
                if (getVisibility() == 0) {
                    tg6 tg6Var = (tg6) cnaVar;
                    if (tg6Var.b0 <= 0 || tg6Var.U == null) {
                        break;
                    }
                }
                break;
            case 1:
                tg6 tg6Var2 = (tg6) cnaVar;
                if (isClickable() && getVisibility() == 0 && !tg6Var2.g0) {
                    rg6 rg6Var = tg6Var2.w;
                    if ((rg6Var == null || rg6Var.getVisibility() == 8) && !tg6Var2.l0) {
                        break;
                    }
                }
                break;
            default:
                if (getVisibility() == 0) {
                    sf6 sf6Var = (sf6) cnaVar;
                    if (sf6Var.Q <= 0 || sf6Var.O == null) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg6(sf6 sf6Var, Context context) {
        super(sf6Var.b0, context);
        this.e = (byte) 2;
        this.f = sf6Var;
    }
}
