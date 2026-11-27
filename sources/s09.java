// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class s09 implements ncc, occ {
    public final /* synthetic */ x09 a;

    public /* synthetic */ s09(x09 x09Var) {
        this.a = x09Var;
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
