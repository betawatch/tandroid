package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Components.hn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                ((SharedPreferences) hn.m().b).edit().putFloat("x", f10).apply();
                hVar.a.b.f();
                break;
            case 1:
                h hVar2 = (h) this.b;
                ((SharedPreferences) hn.m().b).edit().putFloat("y", f10).apply();
                hVar2.a.b.f();
                break;
            default:
                ((h2.f) this.b).e();
                break;
        }
    }
}
