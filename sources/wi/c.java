package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Components.jn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                ((SharedPreferences) jn.m().b).edit().putFloat("x", f10).apply();
                hVar.a.b.f();
                break;
            case 1:
                h hVar2 = (h) this.b;
                ((SharedPreferences) jn.m().b).edit().putFloat("y", f10).apply();
                hVar2.a.b.f();
                break;
            default:
                ((h2.f) this.b).e();
                break;
        }
    }
}
