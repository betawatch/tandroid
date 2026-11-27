// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xr1 implements be8, li1 {
    public final /* synthetic */ zu1 a;

    public /* synthetic */ xr1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override // be8
    public final TextureView D() {
        return this.a.M8;
    }

    @Override // be8
    public final void J(r47 r47Var) {
        zu1 zu1Var;
        if (r47Var == null) {
            return;
        }
        if (MediaController.z().H(r47Var)) {
            int i = 0;
            while (true) {
                int childCount = this.a.A0.getChildCount();
                zu1Var = this.a;
                if (i >= childCount) {
                    break;
                }
                if (zu1Var.A0.getChildAt(i) instanceof wb2) {
                    wb2 wb2Var = (wb2) this.a.A0.getChildAt(i);
                    if (wb2Var.getMessageObject() != null && wb2Var.getMessageObject().e1() == r47Var.e1()) {
                        lm m = wb2Var.getPhotoImage().m();
                        if (m.c0) {
                            m.stop();
                        }
                        Bitmap m2 = m.m();
                        if (m2 != null) {
                            try {
                                wr1 wr1Var = this.a.Ta;
                                int width = m2.getWidth();
                                int height = m2.getHeight();
                                m98 m98Var = wr1Var.d;
                                Bitmap bitmap = m98Var == null ? null : ((TextureView) m98Var.d).getBitmap(width, height);
                                new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                cc4.g(th, true);
                            }
                        }
                    }
                }
                i++;
            }
            zu1Var.e6(true);
            MediaController z = MediaController.z();
            zu1 zu1Var2 = this.a;
            z.s0(zu1Var2.M8, zu1Var2.L8, zu1Var2.J8, true);
        }
        this.a.A0.invalidate();
    }

    @Override // li1
    public final void f0(boolean z) {
        z92 z92Var = this.a.U;
        z92Var.e = !z;
        z92Var.invalidate();
    }

    @Override // be8
    public final void k(r47 r47Var) {
        zu1 zu1Var = this.a;
        zu1Var.A0.K0(true);
        zu1Var.A0.E0();
        if (MediaController.z().H(r47Var)) {
            zu1Var.m1.removeView(zu1Var.J8);
            zu1Var.J8 = null;
            zu1Var.M8 = null;
            zu1Var.L8 = null;
        }
        for (int i = 0; i < zu1Var.A0.getChildCount(); i++) {
            if (zu1Var.A0.getChildAt(i) instanceof wb2) {
                wb2 wb2Var = (wb2) zu1Var.A0.getChildAt(i);
                if (wb2Var.getMessageObject() != null && wb2Var.getMessageObject().e1() == r47Var.e1()) {
                    wb2Var.getPhotoImage().v0(false, true);
                }
            }
        }
    }

    @Override // li1
    public final void m0(RectF rectF) {
        rectF.set(this.a.U.r.S.m);
    }

    @Override // li1
    public final View x0() {
        return this.a.U;
    }
}
