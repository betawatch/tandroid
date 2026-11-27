// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ut1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wb2 b;
    public final /* synthetic */ RectF c;

    public /* synthetic */ ut1(wb2 wb2Var, RectF rectF, byte b) {
        this.a = b;
        this.b = wb2Var;
        this.c = rectF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RectF rectF = this.c;
        wb2 wb2Var = this.b;
        switch (b) {
            case 0:
                hl.d3(new ut1(wb2Var, rectF, (byte) 1), 400L);
                break;
            default:
                if (wb2Var.getScrimBlockBounds() == rectF) {
                    wb2Var.setScrimBlockBounds(null);
                    break;
                }
                break;
        }
    }
}
