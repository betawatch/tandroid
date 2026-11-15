package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.jn;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ a(h hVar, int i7) {
        this.a = i7;
        this.b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        h hVar = this.b;
        switch (i7) {
            case 0:
                ou ouVar = hVar.g2;
                if (ouVar != null) {
                    ArrayList arrayList = new ArrayList(hVar.f2.keySet());
                    jn jnVar = (jn) ouVar.b;
                    ArrayList arrayList2 = jnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = jnVar.M0;
                    if (i10 >= 0) {
                        jnVar.r.g(i10);
                    }
                }
                hVar.dismiss();
                break;
            case 1:
                ou ouVar2 = hVar.g2;
                if (ouVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(hVar.f2.keySet());
                    jn jnVar2 = (jn) ouVar2.b;
                    ArrayList arrayList4 = jnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = jnVar2.M0;
                    if (i11 >= 0) {
                        jnVar2.r.g(i11);
                    }
                }
                hVar.dismiss();
                break;
            case 2:
                HashMap hashMap = hVar.f2;
                hashMap.clear();
                hVar.d2.b();
                hVar.Z1.O(true);
                hVar.a2.c(hashMap.size(), true);
                break;
            case 3:
                hVar.g1(view);
                break;
            default:
                int i12 = h.n2;
                hVar.g1(view);
                break;
        }
    }
}
