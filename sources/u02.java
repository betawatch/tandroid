// default package

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u02 extends bz1 {
    public final /* synthetic */ n12 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u02(n12 n12Var, vnb vnbVar, Context context) {
        super(R.drawable.send_plane_24, vnbVar, context, false);
        this.z0 = n12Var;
    }

    @Override // bz1
    public final boolean b() {
        return false;
    }

    @Override // bz1
    public final boolean c() {
        return !this.z0.R2;
    }

    @Override // bz1
    public final int getFillColor() {
        return aob.v0(aob.S5, this.z0.J0);
    }
}
