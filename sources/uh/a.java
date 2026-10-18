package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.fo;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
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
                l2.f fVar2 = fVar.k0;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    fo foVar = (fo) fVar2.b;
                    ArrayList arrayList2 = foVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = foVar.L0;
                    if (i11 >= 0) {
                        foVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                l2.f fVar3 = fVar.k0;
                if (fVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    fo foVar2 = (fo) fVar3.b;
                    ArrayList arrayList4 = foVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = foVar2.L0;
                    if (i12 >= 0) {
                        foVar2.r.m(i12);
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
