package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.vn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                l.d dVar = fVar.k0;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    vn vnVar = (vn) dVar.a;
                    ArrayList arrayList2 = vnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = vnVar.L0;
                    if (i11 >= 0) {
                        vnVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                l.d dVar2 = fVar.k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    vn vnVar2 = (vn) dVar2.a;
                    ArrayList arrayList4 = vnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = vnVar2.L0;
                    if (i12 >= 0) {
                        vnVar2.r.m(i12);
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
