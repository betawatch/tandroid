package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.xn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                l2.g gVar = fVar.k0;
                if (gVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    xn xnVar = (xn) gVar.b;
                    ArrayList arrayList2 = xnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = xnVar.L0;
                    if (i11 >= 0) {
                        xnVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                l2.g gVar2 = fVar.k0;
                if (gVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    xn xnVar2 = (xn) gVar2.b;
                    ArrayList arrayList4 = xnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = xnVar2.L0;
                    if (i12 >= 0) {
                        xnVar2.r.m(i12);
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
                fVar.Q(view);
                break;
            default:
                int i13 = f.r0;
                fVar.Q(view);
                break;
        }
    }
}
