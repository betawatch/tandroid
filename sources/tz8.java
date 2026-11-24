// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tz8 extends w39 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ wjb e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ a09 h;

    public tz8(a09 a09Var, int i, Context context, wjb wjbVar, boolean z) {
        this.h = a09Var;
        this.c = i;
        this.d = context;
        this.e = wjbVar;
        this.f = z;
    }

    @Override // w39
    public final int b() {
        a09 a09Var = this.h;
        return a09Var.n.size() + ((a09Var.I.isEmpty() || na7.q1(this.c).F3()) ? 0 : 1);
    }

    @Override // w39
    public final int d(int i) {
        return i < this.h.n.size() ? 0 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        if (s49Var.f == 0) {
            ((qz8) s49Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i));
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout qz8Var;
        if (i != 0) {
            a09 a09Var = this.h;
            j17 j17Var = a09Var.K;
            if (j17Var == null) {
                a09Var.e();
            } else if (j17Var.getParent() != null) {
                ((ViewGroup) a09Var.K.getParent()).removeView(a09Var.K);
            }
            Context context = this.d;
            qz8Var = new FrameLayout(context);
            View view = new View(context);
            zkb.i(view, zkb.K(0.06f, bkb.D8), this.e);
            qz8Var.addView(view, nme.c(8.0f, -1));
            qz8Var.addView(a09Var.K, nme.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            qz8Var = new qz8(0, this.c, this.e, this.d, true, this.f);
        }
        return new y29(qz8Var);
    }
}
