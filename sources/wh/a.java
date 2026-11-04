package wh;

import android.view.View;
import gi.v5;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.an;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ a(h hVar, int i3) {
        this.a = i3;
        this.b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        h hVar = this.b;
        switch (i3) {
            case 0:
                v5 v5Var = hVar.d2;
                if (v5Var != null) {
                    ArrayList arrayList = new ArrayList(hVar.c2.keySet());
                    an anVar = (an) v5Var.b;
                    ArrayList arrayList2 = anVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = anVar.M0;
                    if (i10 >= 0) {
                        anVar.r.g(i10);
                    }
                }
                hVar.dismiss();
                break;
            case 1:
                v5 v5Var2 = hVar.d2;
                if (v5Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(hVar.c2.keySet());
                    an anVar2 = (an) v5Var2.b;
                    ArrayList arrayList4 = anVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = anVar2.M0;
                    if (i11 >= 0) {
                        anVar2.r.g(i11);
                    }
                }
                hVar.dismiss();
                break;
            case 2:
                HashMap hashMap = hVar.c2;
                hashMap.clear();
                hVar.a2.b();
                hVar.W1.O(true);
                hVar.X1.c(hashMap.size(), true);
                break;
            case 3:
                hVar.g1(view);
                break;
            default:
                int i12 = h.k2;
                hVar.g1(view);
                break;
        }
    }
}
