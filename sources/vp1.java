// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vp1 extends y92 {
    public final /* synthetic */ zu1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp1(zu1 zu1Var, Activity activity, int i, TLRPC.Document document, vnb vnbVar) {
        super(activity, i, document, vnbVar);
        this.N = zu1Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        zu1 zu1Var = this.N;
        float y2 = zu1Var.g1.getY() + y;
        this.K = zu1Var.m1.getBackgroundSizeY();
        this.J = y2;
    }
}
