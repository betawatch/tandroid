package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m2.t;
import org.telegram.ui.Components.lo;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                t tVar = fVar.k0;
                if (tVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    lo loVar = (lo) tVar.b;
                    ArrayList arrayList2 = loVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = loVar.L0;
                    if (i11 >= 0) {
                        loVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                t tVar2 = fVar.k0;
                if (tVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    lo loVar2 = (lo) tVar2.b;
                    ArrayList arrayList4 = loVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = loVar2.L0;
                    if (i12 >= 0) {
                        loVar2.r.m(i12);
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
                fVar.T(view);
                break;
            default:
                int i13 = f.r0;
                fVar.T(view);
                break;
        }
    }
}
