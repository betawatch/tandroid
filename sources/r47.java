// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r47 extends ogc {
    public final /* synthetic */ Context a;
    public final /* synthetic */ l57 b;

    public r47(l57 l57Var, Context context) {
        this.b = l57Var;
        this.a = context;
    }

    @Override // ogc
    public final View d(int i) {
        return new f57(this.b, this.a, i);
    }

    @Override // ogc
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // ogc
    public final int h(int i) {
        return ((i57) this.b.e.a.get(i)).a;
    }
}
