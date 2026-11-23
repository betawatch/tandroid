package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Cells.aa;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                ((SharedPreferences) aa.F2().b).edit().putFloat("x", f10).apply();
                hVar.a.b.f();
                break;
            case 1:
                h hVar2 = (h) this.b;
                ((SharedPreferences) aa.F2().b).edit().putFloat("y", f10).apply();
                hVar2.a.b.f();
                break;
            default:
                ((h2.f) this.b).e();
                break;
        }
    }
}
