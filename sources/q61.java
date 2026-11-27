// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class q61 extends nx0 {
    public static final /* synthetic */ int m1 = 0;
    public final /* synthetic */ byte l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q61(int i, vnb vnbVar, Context context, boolean z) {
        super(i, vnbVar, context, z);
        this.l1 = (byte) 2;
    }

    @Override // nx0
    public final boolean E() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.E();
        }
    }

    @Override // nx0
    public final void p0() {
        switch (this.l1) {
            case 2:
                super.p0();
                try {
                    int v0 = aob.v0(aob.h5, this.J0);
                    if (this.H0 != v0) {
                        K(v0);
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            default:
                super.p0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q61(byte b, Context context, boolean z) {
        super(context, z);
        this.l1 = b;
    }
}
