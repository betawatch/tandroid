// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p71 extends my0 {
    public static final /* synthetic */ int m1 = 0;
    public final /* synthetic */ byte l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p71(int i, ylb ylbVar, Context context, boolean z) {
        super(i, ylbVar, context, z);
        this.l1 = (byte) 2;
    }

    @Override // my0
    public final boolean E() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.E();
        }
    }

    @Override // my0
    public final void p0() {
        switch (this.l1) {
            case 2:
                super.p0();
                try {
                    int v0 = cmb.v0(cmb.g5, this.J0);
                    if (this.H0 != v0) {
                        K(v0);
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            default:
                super.p0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p71(byte b, Context context, boolean z) {
        super(context, z);
        this.l1 = b;
    }
}
