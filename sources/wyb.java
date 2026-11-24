// default package

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wyb implements oac, pac, g94 {
    public final /* synthetic */ mzb a;

    public /* synthetic */ wyb(mzb mzbVar) {
        this.a = mzbVar;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.e();
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        mzb mzbVar = this.a;
        boolean z = false;
        if (!mzbVar.K.k3 && !mzbVar.y.k3) {
            Object obj = c6cVar.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z = mzbVar.l((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c6c c6cVar = (c6c) obj;
        mzb mzbVar = this.a;
        if (mzbVar.n) {
            jac jacVar = mzbVar.j0;
            if (jacVar != null) {
                jacVar.a(Long.valueOf(c6cVar.C), Boolean.FALSE);
                return;
            }
            return;
        }
        if (c6cVar.C == -2) {
            Runnable runnable = mzbVar.i0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        jac jacVar2 = mzbVar.h0;
        if (jacVar2 != null) {
            jacVar2.a(Integer.valueOf(c6cVar.d), Boolean.FALSE);
        }
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
