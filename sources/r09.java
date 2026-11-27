// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r09 implements ncc, occ {
    public final /* synthetic */ w09 a;

    public /* synthetic */ r09(w09 w09Var) {
        this.a = w09Var;
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        boolean z = false;
        if (b8cVar.a == 16) {
            Object obj = b8cVar.H;
            if (!(obj instanceof a19) || !((a19) obj).g) {
                this.a.h0(b8cVar, view);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.f0((b8c) obj, (View) obj2);
    }
}
