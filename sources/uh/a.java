package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m.h;
import org.telegram.ui.Components.io;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                h hVar = fVar.k0;
                if (hVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.j0.keySet());
                    io ioVar = (io) hVar.b;
                    ArrayList arrayList2 = ioVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = ioVar.L0;
                    if (i11 >= 0) {
                        ioVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                h hVar2 = fVar.k0;
                if (hVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.j0.keySet());
                    io ioVar2 = (io) hVar2.b;
                    ArrayList arrayList4 = ioVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = ioVar2.L0;
                    if (i12 >= 0) {
                        ioVar2.r.m(i12);
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
                fVar.T(view);
                break;
            default:
                int i13 = f.r0;
                fVar.T(view);
                break;
        }
    }
}
