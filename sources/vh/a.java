package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.bn;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                gf.g gVar2 = gVar.c2;
                if (gVar2 != null) {
                    ArrayList arrayList = new ArrayList(gVar.b2.keySet());
                    bn bnVar = (bn) gVar2.b;
                    ArrayList arrayList2 = bnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = bnVar.L0;
                    if (i10 >= 0) {
                        bnVar.r.g(i10);
                    }
                }
                gVar.dismiss();
                break;
            case 1:
                gf.g gVar3 = gVar.c2;
                if (gVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.b2.keySet());
                    bn bnVar2 = (bn) gVar3.b;
                    ArrayList arrayList4 = bnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = bnVar2.L0;
                    if (i11 >= 0) {
                        bnVar2.r.g(i11);
                    }
                }
                gVar.dismiss();
                break;
            case 2:
                HashMap hashMap = gVar.b2;
                hashMap.clear();
                gVar.Z1.b();
                gVar.V1.O(true);
                gVar.W1.c(hashMap.size(), true);
                break;
            case 3:
                gVar.g1(view);
                break;
            default:
                int i12 = g.j2;
                gVar.g1(view);
                break;
        }
    }
}
