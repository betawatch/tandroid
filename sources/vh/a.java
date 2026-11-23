package vh;

import android.view.View;
import j6.r;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.qn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                r rVar = gVar.g2;
                if (rVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f2.keySet());
                    qn qnVar = (qn) rVar.b;
                    ArrayList arrayList2 = qnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = qnVar.M0;
                    if (i10 >= 0) {
                        qnVar.r.g(i10);
                    }
                }
                gVar.dismiss();
                break;
            case 1:
                r rVar2 = gVar.g2;
                if (rVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f2.keySet());
                    qn qnVar2 = (qn) rVar2.b;
                    ArrayList arrayList4 = qnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = qnVar2.M0;
                    if (i11 >= 0) {
                        qnVar2.r.g(i11);
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
