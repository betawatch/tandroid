// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zs extends u46 {
    public final /* synthetic */ byte I;

    public zs(vg1 vg1Var) {
        this.I = (byte) 2;
    }

    @Override // u46
    public final int V0(r69 r69Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 12:
                return gm.L(4000.0f);
            default:
                return super.V0(r69Var);
        }
    }

    @Override // u46, f69
    public final boolean e() {
        switch (this.I) {
            case 7:
                return false;
            default:
                return super.e();
        }
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.I) {
            case 2:
                w46 w46Var = new w46(recyclerView.getContext(), 0);
                w46Var.a = i;
                v0(w46Var);
                break;
            case 11:
                ca8 ca8Var = new ca8(recyclerView.getContext());
                ca8Var.a = i;
                v0(ca8Var);
                break;
            default:
                super.u0(recyclerView, r69Var, i);
                break;
        }
    }

    @Override // u46, f69
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
    public /* synthetic */ zs(byte b, int i, boolean z) {
        super(i, z);
        this.I = b;
    }

    public /* synthetic */ zs(byte b) {
        this.I = b;
    }
}
