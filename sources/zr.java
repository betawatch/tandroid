// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zr extends t26 {
    public final /* synthetic */ byte I;

    public zr(nf1 nf1Var) {
        this.I = (byte) 2;
    }

    @Override // t26
    public final int V0(p49 p49Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 12:
                return gl.L(4000.0f);
            default:
                return super.V0(p49Var);
        }
    }

    @Override // t26, d49
    public final boolean e() {
        switch (this.I) {
            case 7:
                return false;
            default:
                return super.e();
        }
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.I) {
            case 2:
                v26 v26Var = new v26(recyclerView.getContext(), 0);
                v26Var.a = i;
                v0(v26Var);
                break;
            case 11:
                z78 z78Var = new z78(recyclerView.getContext());
                z78Var.a = i;
                v0(z78Var);
                break;
            default:
                super.u0(recyclerView, p49Var, i);
                break;
        }
    }

    @Override // t26, d49
    public final boolean x0() {
        switch (this.I) {
            case 0:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
                return false;
            case 1:
            case 4:
            case 7:
            case 11:
            case 12:
            default:
                return super.x0();
            case 2:
            case 15:
            case 16:
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr(byte b, int i, boolean z) {
        super(i, z);
        this.I = b;
    }

    public /* synthetic */ zr(byte b) {
        this.I = b;
    }
}
