package zg;

import android.view.ViewParent;
import com.google.android.gms.internal.vision.e2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.gk0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.b;
                gk0 gk0Var = (gk0) this.c;
                c0Var.l = true;
                c0Var.a.invalidate();
                gk0Var.b1 = false;
                gk0Var.invalidate();
                c0Var.c(true);
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                b bVar = (b) this.c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                break;
            default:
                q0 q0Var = (q0) this.b;
                n0 n0Var = (n0) this.c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.a;
                ViewParent viewParent = q0Var.z;
                if (e2.u(viewParent)) {
                    ((n4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.Y.c(false);
                q0Var.S = null;
                q0Var.T = false;
                q0Var.U = null;
                break;
        }
    }
}
