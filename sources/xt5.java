// default package

import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xt5 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ xt5(View view, float f, float f2, byte b) {
        this.a = b;
        this.d = view;
        this.b = f;
        this.c = f2;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        View view = this.d;
        switch (b) {
            case 0:
                ((yt5) view).y.addPath((Path) obj, f2, f);
                break;
            default:
                ((sha) view).n(f2, f);
                break;
        }
    }
}
