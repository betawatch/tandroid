package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.an;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(g gVar, int i7) {
        this.a = i7;
        this.b = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        g gVar = this.b;
        switch (i7) {
            case 0:
                gf.g gVar2 = gVar.f2;
                if (gVar2 != null) {
                    ArrayList arrayList = new ArrayList(gVar.e2.keySet());
                    an anVar = (an) gVar2.b;
                    ArrayList arrayList2 = anVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = anVar.L0;
                    if (i10 >= 0) {
                        anVar.r.g(i10);
                    }
                }
                gVar.dismiss();
                break;
            case 1:
                gf.g gVar3 = gVar.f2;
                if (gVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.e2.keySet());
                    an anVar2 = (an) gVar3.b;
                    ArrayList arrayList4 = anVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = anVar2.L0;
                    if (i11 >= 0) {
                        anVar2.r.g(i11);
                    }
                }
                gVar.dismiss();
                break;
            case 2:
                HashMap hashMap = gVar.e2;
                hashMap.clear();
                gVar.c2.b();
                gVar.Y1.O(true);
                gVar.Z1.c(hashMap.size(), true);
                break;
            case 3:
                gVar.g1(view);
                break;
            default:
                int i12 = g.m2;
                gVar.g1(view);
                break;
        }
    }
}
