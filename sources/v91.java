// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v91 implements oac, pac, qq7 {
    public final /* synthetic */ ia1 a;

    public /* synthetic */ v91(ia1 ia1Var) {
        this.a = ia1Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        return this.a.onInsetsInternal(view, wzcVar);
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        Object obj = c6cVar.H;
        if (obj instanceof fa1) {
            this.a.a0(((fa1) obj).c, (ea1) view);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.j0((c6c) obj, (View) obj2);
    }
}
