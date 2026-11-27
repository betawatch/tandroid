// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class uha extends c79 {
    public final Context c;
    public final /* synthetic */ eja d;

    public uha(eja ejaVar, Context context) {
        this.d = ejaVar;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        tia[] tiaVarArr = this.d.w1;
        return tiaVarArr[5].a.size() != 0 || tiaVarArr[5].g;
    }

    @Override // j79
    public final int b() {
        tia[] tiaVarArr = this.d.w1;
        if (tiaVarArr[5].a.size() != 0 || tiaVarArr[5].g) {
            return tiaVarArr[5].a.size();
        }
        return 1;
    }

    @Override // j79
    public final long c(int i) {
        return i;
    }

    @Override // j79
    public final int d(int i) {
        tia[] tiaVarArr = this.d.w1;
        return (tiaVarArr[5].a.size() != 0 || tiaVarArr[5].g) ? 12 : 11;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (f89Var.f == 12) {
            eja ejaVar = this.d;
            r47 r47Var = (r47) ejaVar.w1[5].a.get(i);
            TLRPC.Document F0 = r47Var.F0();
            if (F0 != null) {
                View view = f89Var.a;
                if (view instanceof vw2) {
                    vw2 vw2Var = (vw2) view;
                    vw2Var.d(r47Var.k.date, r47Var, F0);
                    if (ejaVar.F1) {
                        vw2Var.c(ejaVar.c1[(r47.B0(r47Var.k) > ejaVar.m1 ? 1 : (r47.B0(r47Var.k) == ejaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(r47Var.e1()) >= 0, !ejaVar.e1);
                    } else {
                        vw2Var.c(false, !ejaVar.e1);
                    }
                }
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        eja ejaVar = this.d;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        if (i == 11) {
            ci G = eja.G(5, ejaVar.m1, vnbVar, context);
            G.setLayoutParams(new r79(-1, -1));
            return new n69(G);
        }
        vw2 vw2Var = new vw2(vnbVar, context, true);
        vw2Var.setCanPreviewGif(true);
        return new n69(vw2Var);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof vw2) {
            ImageReceiver photoImage = ((vw2) view).getPhotoImage();
            if (this.d.n0[0].F == 5) {
                photoImage.u0 = true;
                photoImage.w0(false);
            } else {
                photoImage.u0 = false;
                photoImage.x0();
            }
        }
    }
}
