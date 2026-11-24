// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uq1 extends ua2 {
    public final /* synthetic */ yv1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq1(yv1 yv1Var, Activity activity, int i, TLRPC.Document document, ylb ylbVar) {
        super(activity, i, document, ylbVar);
        this.N = yv1Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        yv1 yv1Var = this.N;
        float y2 = yv1Var.g1.getY() + y;
        this.K = yv1Var.m1.getBackgroundSizeY();
        this.J = y2;
    }
}
