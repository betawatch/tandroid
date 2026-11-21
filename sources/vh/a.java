package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.tn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                jn jnVar = gVar.g2;
                if (jnVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f2.keySet());
                    tn tnVar = (tn) jnVar.b;
                    ArrayList arrayList2 = tnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = tnVar.M0;
                    if (i10 >= 0) {
                        tnVar.r.g(i10);
                    }
                }
                gVar.dismiss();
                break;
            case 1:
                jn jnVar2 = gVar.g2;
                if (jnVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f2.keySet());
                    tn tnVar2 = (tn) jnVar2.b;
                    ArrayList arrayList4 = tnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = tnVar2.M0;
                    if (i11 >= 0) {
                        tnVar2.r.g(i11);
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
