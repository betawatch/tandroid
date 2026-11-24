// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v19 extends y59 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ylb e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c29 h;

    public v19(c29 c29Var, int i, Context context, ylb ylbVar, boolean z) {
        this.h = c29Var;
        this.c = i;
        this.d = context;
        this.e = ylbVar;
        this.f = z;
    }

    @Override // y59
    public final int b() {
        c29 c29Var = this.h;
        return c29Var.n.size() + ((c29Var.I.isEmpty() || oc7.r1(this.c).H3()) ? 0 : 1);
    }

    @Override // y59
    public final int d(int i) {
        return i < this.h.n.size() ? 0 : 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        if (u69Var.f == 0) {
            ((r19) u69Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i));
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout r19Var;
        if (i != 0) {
            c29 c29Var = this.h;
            j37 j37Var = c29Var.K;
            if (j37Var == null) {
                c29Var.e();
            } else if (j37Var.getParent() != null) {
                ((ViewGroup) c29Var.K.getParent()).removeView(c29Var.K);
            }
            Context context = this.d;
            r19Var = new FrameLayout(context);
            View view = new View(context);
            anb.i(view, anb.K(0.06f, cmb.D8), this.e);
            r19Var.addView(view, qoe.c(8.0f, -1));
            r19Var.addView(c29Var.K, qoe.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            r19Var = new r19(0, this.c, this.e, this.d, true, this.f);
        }
        return new b59(r19Var);
    }
}
