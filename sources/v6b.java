// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class v6b extends vu7 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ lcb d;
    public final /* synthetic */ x53 e;
    public final /* synthetic */ bcb f;

    public v6b(bcb bcbVar, Context context, lcb lcbVar, x53 x53Var) {
        this.f = bcbVar;
        this.c = context;
        this.d = lcbVar;
        this.e = x53Var;
    }

    @Override // vu7
    public final void a(fic ficVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        ficVar.removeView(frameLayout);
        o68 o68Var = (o68) frameLayout.getChildAt(0);
        hl.B2(o68Var);
        this.f.Q0.add(o68Var);
    }

    @Override // vu7
    public final int b() {
        bcb bcbVar = this.f;
        ArrayList arrayList = bcbVar.y0;
        return arrayList != null ? arrayList.size() : bcbVar.B0.size();
    }

    @Override // vu7
    public final Object e(fic ficVar, int i) {
        o68 u6bVar;
        Context context = this.c;
        bcb bcbVar = this.f;
        w6b w6bVar = new w6b(bcbVar, context);
        ArrayList arrayList = bcbVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        lcb lcbVar = this.d;
        if (isEmpty) {
            u6bVar = new u6b(this, this.c, lcbVar, bcbVar.I0, this.e);
        } else {
            u6bVar = (o68) arrayList.remove(0);
            u6bVar.Y0.a.getImageReceiver().v0(true, true);
            if (u6bVar.O1 != null) {
                u6bVar.L1.z1();
                u6bVar.L1.setAlpha(1.0f - u6bVar.N3);
            }
            i49 i49Var = u6bVar.P1;
            if (i49Var != null) {
                i49Var.k();
            }
            i49 i49Var2 = u6bVar.b3;
            if (i49Var2 != null) {
                i49Var2.k();
            }
            q qVar = u6bVar.t2;
            if (qVar != null) {
                hl.B2(qVar);
                u6bVar.t2.m();
                u6bVar.t2 = null;
            }
            u6bVar.setActive(false);
            u6bVar.setIsVisible(false);
            u6bVar.v2 = false;
            u6bVar.y2.e(false, 0.0f);
            u6bVar.V0 = null;
            u6bVar.S2 = false;
            u6bVar.f0();
        }
        w6bVar.a = u6bVar;
        u6bVar.setAccount(bcbVar.z0);
        u6bVar.setDelegate(bcbVar.C0);
        u6bVar.setLongpressed(lcbVar.a1);
        w6bVar.setTag(Integer.valueOf(i));
        ArrayList arrayList2 = bcbVar.y0;
        if (arrayList2 != null) {
            if (lcbVar.R0) {
                i = (arrayList2.size() - 1) - i;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i);
            w6bVar.c = arrayList3;
            v5b v5bVar = lcbVar.O0;
            if ((v5bVar instanceof q5b) || (v5bVar instanceof x5b)) {
                r47 f = v5bVar.f(((Integer) arrayList3.get(0)).intValue());
                w6bVar.b = f == null ? bcbVar.x0 : r47.B0(f.k);
            } else {
                w6bVar.b = bcbVar.x0;
            }
        } else {
            w6bVar.c = null;
            w6bVar.b = ((Long) bcbVar.B0.get(i)).longValue();
        }
        w6bVar.addView(u6bVar);
        u6bVar.requestLayout();
        ficVar.addView(w6bVar);
        return w6bVar;
    }

    @Override // vu7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
