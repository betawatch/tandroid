package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import ji.u4;
import org.telegram.ui.Components.tn;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ a(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        f fVar = this.b;
        switch (i10) {
            case 0:
                u4 u4Var = fVar.k0;
                if (u4Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    tn tnVar = (tn) u4Var.b;
                    ArrayList arrayList2 = tnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = tnVar.L0;
                    if (i11 >= 0) {
                        tnVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                u4 u4Var2 = fVar.k0;
                if (u4Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    tn tnVar2 = (tn) u4Var2.b;
                    ArrayList arrayList4 = tnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = tnVar2.L0;
                    if (i12 >= 0) {
                        tnVar2.r.m(i12);
                    }
                }
                fVar.dismiss();
                break;
            case 2:
                HashMap hashMap = fVar.j0;
                hashMap.clear();
                fVar.h0.b();
                fVar.d0.N(true);
                fVar.e0.b(hashMap.size(), true);
                break;
            case 3:
                fVar.S(view);
                break;
            default:
                int i13 = f.r0;
                fVar.S(view);
                break;
        }
    }
}
