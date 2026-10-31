package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y5 extends z4.a {
    public final /* synthetic */ Context c;
    public final /* synthetic */ o7 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 e;
    public final /* synthetic */ q f;

    public y5(q qVar, Context context, o7 o7Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f = qVar;
        this.c = context;
        this.d = o7Var;
        this.e = p6Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        z2 z2Var = (z2) frameLayout.getChildAt(0);
        org.telegram.messenger.i0.E2(z2Var);
        this.f.P0.add(z2Var);
    }

    @Override // z4.a
    public final int b() {
        q qVar = this.f;
        ArrayList arrayList = qVar.x0;
        return arrayList != null ? arrayList.size() : qVar.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        z2 x5Var;
        Context context = this.c;
        q qVar = this.f;
        z5 z5Var = new z5(qVar, context);
        ArrayList arrayList = qVar.P0;
        boolean isEmpty = arrayList.isEmpty();
        o7 o7Var = this.d;
        if (isEmpty) {
            x5Var = new x5(this, this.c, o7Var, qVar.H0, this.e);
        } else {
            x5Var = (z2) arrayList.remove(0);
            x5Var.X0.a.getImageReceiver().O0(true, true);
            if (x5Var.N1 != null) {
                x5Var.K1.N0();
                x5Var.K1.setAlpha(1.0f - x5Var.N3);
            }
            mj0 mj0Var = x5Var.O1;
            if (mj0Var != null) {
                mj0Var.n();
            }
            mj0 mj0Var2 = x5Var.a3;
            if (mj0Var2 != null) {
                mj0Var2.n();
            }
            e50 e50Var = x5Var.s2;
            if (e50Var != null) {
                org.telegram.messenger.i0.E2(e50Var);
                x5Var.s2.c(true);
                x5Var.s2 = null;
            }
            x5Var.setActive(false);
            x5Var.setIsVisible(false);
            x5Var.u2 = false;
            x5Var.x2.e(false, 0.0f);
            x5Var.U0 = null;
            x5Var.R2 = false;
            x5Var.n0();
        }
        z5Var.a = x5Var;
        x5Var.setAccount(qVar.y0);
        x5Var.setDelegate(qVar.B0);
        x5Var.setLongpressed(o7Var.a1);
        z5Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = qVar.x0;
        if (arrayList2 != null) {
            if (o7Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            z5Var.c = arrayList3;
            x4 x4Var = o7Var.O0;
            if ((x4Var instanceof r4) || (x4Var instanceof z4)) {
                jj f7 = x4Var.f(((Integer) arrayList3.get(0)).intValue());
                z5Var.b = f7 == null ? qVar.w0 : jj.B0(f7.k);
            } else {
                z5Var.b = qVar.w0;
            }
        } else {
            z5Var.c = null;
            z5Var.b = ((Long) qVar.A0.get(i10)).longValue();
        }
        z5Var.addView(x5Var);
        x5Var.requestLayout();
        gVar.addView(z5Var);
        return z5Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
