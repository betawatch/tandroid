package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.wn;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                    wn wnVar = (wn) dVar.a;
                    ArrayList arrayList2 = wnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = wnVar.L0;
                    if (i11 >= 0) {
                        wnVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                l.d dVar2 = fVar.k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    wn wnVar2 = (wn) dVar2.a;
                    ArrayList arrayList4 = wnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = wnVar2.L0;
                    if (i12 >= 0) {
                        wnVar2.r.m(i12);
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
