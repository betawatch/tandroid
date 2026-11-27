// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class v81 implements ncc, occ, nr7 {
    public final /* synthetic */ i91 a;

    public /* synthetic */ v81(i91 i91Var) {
        this.a = i91Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        return this.a.onInsetsInternal(view, l2dVar);
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        Object obj = b8cVar.H;
        if (obj instanceof f91) {
            this.a.Z(((f91) obj).c, (e91) view);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.i0((b8c) obj, (View) obj2);
    }
}
