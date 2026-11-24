// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xw2 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xw2(dx2 dx2Var, ArrayList arrayList, boolean z) {
        this.c = dx2Var;
        this.d = arrayList;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                hx2 hx2Var = ((dx2) obj2).a;
                if (hx2Var.w != null && hx2Var.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        hx2Var.l.A(hx2Var.W);
                    } else if (intValue == 1) {
                        hx2Var.l.r(hx2Var.W);
                    } else if (intValue == 2) {
                        hx2Var.l.r(null);
                    } else if (intValue == 3) {
                        hx2Var.l.G(hx2Var.W);
                    } else if (intValue == 4) {
                        hx2Var.l.o(hx2Var.W);
                    } else if (intValue == 5) {
                        hs6.d0(hx2Var.r).d(2, hx2Var.b0, hx2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    hx2Var.d();
                    break;
                }
                break;
            case 1:
                p71 p71Var = (p71) obj2;
                Runnable runnable = (Runnable) obj;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, z ? "lastseen" : "readtime"));
                    p71Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                et8 et8Var = (et8) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (z) {
                    ((nha) et8Var.b).J.p();
                }
                runnable2.run();
                break;
        }
    }

    public /* synthetic */ xw2(et8 et8Var, boolean z, Runnable runnable) {
        this.c = et8Var;
        this.b = z;
        this.d = runnable;
    }

    public /* synthetic */ xw2(boolean z, p71 p71Var, Runnable runnable) {
        this.b = z;
        this.c = p71Var;
        this.d = runnable;
    }
}
