// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class v9d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rad b;

    public /* synthetic */ v9d(rad radVar, byte b) {
        this.a = b;
        this.b = radVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rad radVar = this.b;
        switch (b) {
            case 0:
                v8b v8bVar = radVar.e;
                gu6 gu6Var = (gu6) v8bVar.c;
                if (gu6Var == null) {
                    gu6Var = gu6.d((Context) v8bVar.b);
                    v8bVar.c = gu6Var;
                }
                gu6Var.h(radVar);
                break;
            default:
                radVar.n();
                break;
        }
    }
}
