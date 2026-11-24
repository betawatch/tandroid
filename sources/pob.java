// default package

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pob extends q59 {
    public final Context c;
    public final /* synthetic */ rob d;

    public pob(rob robVar, Context context) {
        this.d = robVar;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // y59
    public final int d(int i) {
        return 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        BlendMode blendMode;
        n08 n08Var = (n08) u69Var.a;
        rob robVar = this.d;
        n08Var.setPattern((TLRPC.TL_wallPaper) robVar.W0.get(i));
        n08Var.getImageReceiver().p1 = new PorterDuffColorFilter(robVar.l1, robVar.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = 0;
            if (robVar.b == 1) {
                int C0 = cmb.C0(cmb.Fe);
                long j = robVar.w.l;
                int i3 = (int) j;
                if (i3 != 0) {
                    i2 = i3;
                } else if (j == 0) {
                    i2 = C0;
                }
            } else if (robVar.D1 instanceof mtc) {
                i2 = robVar.e1;
            }
            if (i2 == 0 || robVar.n1 < 0.0f) {
                n08Var.getImageReceiver().P(null);
                return;
            }
            ImageReceiver imageReceiver = robVar.z0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.P(blendMode);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2 = this.d.J1;
        oob oobVar = new oob(this);
        n08 n08Var = new n08(this.c);
        n08Var.H = new RectF();
        int i3 = z8c.t0;
        n08Var.K = i3;
        n08Var.setRoundRadius(gm.L(6.0f));
        n08Var.V = i2;
        n08Var.U = oobVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(n08Var, null);
        n08Var.I = radialProgress2;
        radialProgress2.p(gm.L(30.0f), gm.L(30.0f), gm.L(70.0f), gm.L(70.0f));
        n08Var.R = new Paint(3);
        n08Var.T = er3.q(i3).k();
        n08Var.setOutlineProvider(new xj((byte) 7));
        n08Var.setClipToOutline(true);
        return new b59(n08Var);
    }
}
