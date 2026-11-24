// default package

import android.util.SparseIntArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class plb extends m37 {
    public final /* synthetic */ byte U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ plb(boolean z, SparseIntArray sparseIntArray, byte b) {
        super(2, z, false, null);
        this.U = b;
        this.V = sparseIntArray;
    }

    @Override // m37
    public final int g(int i) {
        byte b = this.U;
        Object obj = this.V;
        switch (b) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) obj;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : cmb.gm[i];
            case 1:
                return ((SparseIntArray) obj).get(i);
            default:
                return super.g(i);
        }
    }

    @Override // m37
    public final int i(int i) {
        byte b = this.U;
        Object obj = this.V;
        switch (b) {
            case 0:
                return ((SparseIntArray) obj).get(i);
            case 1:
                return ((SparseIntArray) obj).get(i);
            default:
                return super.i(i);
        }
    }

    @Override // m37
    public final void o(int i, int i2, int i3) {
        switch (this.U) {
            case 2:
                if (!((rob) this.V).f2) {
                    super.o(i, i2, i3);
                    break;
                }
                break;
            default:
                super.o(i, i2, i3);
                break;
        }
    }

    @Override // m37
    public final void p(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        switch (this.U) {
            case 2:
                if (!((rob) this.V).f2) {
                    super.p(i, i2, i3, i4, i5, i6, z, z2);
                    break;
                }
                break;
            default:
                super.p(i, i2, i3, i4, i5, i6, z, z2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plb(rob robVar, int i, boolean z) {
        super(i, true, z, null);
        this.U = (byte) 2;
        this.V = robVar;
    }
}
