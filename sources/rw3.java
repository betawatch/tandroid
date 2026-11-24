// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rw3 extends w46 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw3(byte b, Context context, Object obj) {
        super(context, 2);
        this.q = b;
        this.r = obj;
    }

    @Override // w46, q69
    public final void e() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((uw3) obj).j3 = true;
                break;
            case 1:
                ((e34) obj).g0 = true;
                break;
            case 4:
                ((vz9) obj).y1 = true;
                break;
        }
    }

    @Override // w46
    public final void i() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((uw3) obj).j3 = false;
                break;
            case 1:
                ((e34) obj).g0 = false;
                break;
            case 2:
                ((f14) obj).Q.g0 = false;
                break;
            case 3:
                ((ky9) obj).R.y1 = false;
                break;
            case 4:
                ((vz9) obj).y1 = false;
                break;
            default:
                ((ky9) obj).R.y1 = false;
                break;
        }
    }
}
