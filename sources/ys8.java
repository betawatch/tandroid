// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ys8 implements dic {
    public final /* synthetic */ jq8 a;

    public ys8(jq8 jq8Var) {
        this.a = jq8Var;
    }

    @Override // dic
    public final void a(int i) {
        jq8 jq8Var = this.a;
        int i2 = jq8Var.p1;
        boolean z = i >= i2;
        if (i != i2) {
            jq8Var.p1 = i;
        }
        dc7 dc7Var = jq8Var.T0;
        if (dc7Var != null) {
            dt8 dt8Var = jq8Var.E0;
            dc7Var.b(i - (dt8Var != null ? dt8Var.j() : 0), z);
        }
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        jn5 jn5Var;
        jq8 jq8Var = this.a;
        jq8Var.B(f, i);
        if (i2 == 0) {
            int k = jq8Var.E0.k(i);
            jq8Var.getCurrentItemView();
            int childCount = jq8Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = jq8Var.getChildAt(i3);
                if (childAt instanceof de0) {
                    dt8 dt8Var = jq8Var.E0;
                    int k2 = dt8Var.k(dt8Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((de0) childAt).getImageReceiver();
                    boolean z = imageReceiver.u0;
                    if (k2 >= 0 && k2 < jq8Var.X0.size()) {
                        if (k2 == k) {
                            if (!z) {
                                imageReceiver.u0 = true;
                                imageReceiver.w0(false);
                            }
                            jn5 jn5Var2 = (jn5) jq8Var.X0.get(k2);
                            if (jn5Var2 != null) {
                                xb4 G = xb4.G(jq8Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jn5Var2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    xb4.K.c(new vx3(G, tL_fileLocationToBeDeprecated, (byte) 18));
                                }
                            }
                        } else if (z) {
                            lm m = imageReceiver.m();
                            if (m != null && (jn5Var = (jn5) jq8Var.X0.get(k2)) != null) {
                                m.y(jn5Var.j, false, true);
                            }
                            imageReceiver.u0 = false;
                            imageReceiver.x0();
                        }
                    }
                }
            }
        }
    }

    @Override // dic
    public final void c(int i) {
    }
}
