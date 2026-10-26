package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import li.e3;
import org.telegram.ui.Components.go;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                e3 e3Var = fVar.k0;
                if (e3Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    go goVar = (go) e3Var.b;
                    ArrayList arrayList2 = goVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = goVar.L0;
                    if (i11 >= 0) {
                        goVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                e3 e3Var2 = fVar.k0;
                if (e3Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    go goVar2 = (go) e3Var2.b;
                    ArrayList arrayList4 = goVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = goVar2.L0;
                    if (i12 >= 0) {
                        goVar2.r.m(i12);
                    }
                }
                fVar.dismiss();
                break;
            case 2:
                HashMap hashMap = fVar.j0;
                hashMap.clear();
                fVar.h0.b();
                fVar.d0.O(true);
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
