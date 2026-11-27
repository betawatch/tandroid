// default package

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t0c implements s84, ncc, occ {
    public final /* synthetic */ l1c a;

    public /* synthetic */ t0c(l1c l1cVar) {
        this.a = l1cVar;
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        l1c l1cVar = this.a;
        boolean z = false;
        if (!l1cVar.K.k3 && !l1cVar.y.k3) {
            Object obj = b8cVar.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z = l1cVar.l((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        l1c l1cVar = this.a;
        if (l1cVar.n) {
            icc iccVar = l1cVar.j0;
            if (iccVar != null) {
                iccVar.a(Long.valueOf(b8cVar.C), Boolean.FALSE);
                return;
            }
            return;
        }
        if (b8cVar.C == -2) {
            Runnable runnable = l1cVar.i0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        icc iccVar2 = l1cVar.h0;
        if (iccVar2 != null) {
            iccVar2.a(Integer.valueOf(b8cVar.d), Boolean.FALSE);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.a.e();
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
