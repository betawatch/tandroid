// default package

import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yr5 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ yr5(View view, float f, float f2, byte b) {
        this.a = b;
        this.d = view;
        this.b = f;
        this.c = f2;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        View view = this.d;
        switch (b) {
            case 0:
                ((zr5) view).y.addPath((Path) obj, f2, f);
                break;
            default:
                ((qfa) view).n(f2, f);
                break;
        }
    }
}
