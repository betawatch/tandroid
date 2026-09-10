package sh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m.g3;
import org.telegram.ui.Components.zn;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                g3 g3Var = fVar.k0;
                if (g3Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    zn znVar = (zn) g3Var.b;
                    ArrayList arrayList2 = znVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = znVar.L0;
                    if (i11 >= 0) {
                        znVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                g3 g3Var2 = fVar.k0;
                if (g3Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    zn znVar2 = (zn) g3Var2.b;
                    ArrayList arrayList4 = znVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = znVar2.L0;
                    if (i12 >= 0) {
                        znVar2.r.m(i12);
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
