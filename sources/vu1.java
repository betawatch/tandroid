// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vu1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc2 b;
    public final /* synthetic */ RectF c;

    public /* synthetic */ vu1(rc2 rc2Var, RectF rectF, byte b) {
        this.a = b;
        this.b = rc2Var;
        this.c = rectF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RectF rectF = this.c;
        rc2 rc2Var = this.b;
        switch (b) {
            case 0:
                gm.d3(new vu1(rc2Var, rectF, (byte) 1), 400L);
                break;
            default:
                if (rc2Var.getScrimBlockBounds() == rectF) {
                    rc2Var.setScrimBlockBounds(null);
                    break;
                }
                break;
        }
    }
}
