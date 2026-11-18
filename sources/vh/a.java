package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.rn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                hn hnVar = gVar.g2;
                if (hnVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f2.keySet());
                    rn rnVar = (rn) hnVar.b;
                    ArrayList arrayList2 = rnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = rnVar.M0;
                    if (i10 >= 0) {
                        rnVar.r.g(i10);
                    }
                }
                gVar.dismiss();
                break;
            case 1:
                hn hnVar2 = gVar.g2;
                if (hnVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f2.keySet());
                    rn rnVar2 = (rn) hnVar2.b;
                    ArrayList arrayList4 = rnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = rnVar2.M0;
                    if (i11 >= 0) {
                        rnVar2.r.g(i11);
                    }
                }
                gVar.dismiss();
                break;
            case 2:
                HashMap hashMap = gVar.f2;
                hashMap.clear();
                gVar.d2.b();
                gVar.Z1.O(true);
                gVar.a2.c(hashMap.size(), true);
                break;
            case 3:
                gVar.h1(view);
                break;
            default:
                int i12 = g.n2;
                gVar.h1(view);
                break;
        }
    }
}
