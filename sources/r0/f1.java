package r0;

import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import tg.f2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements g9.k, sg.y, t3.g, OnFailureListener, u9.e, ua.a {
    public final /* synthetic */ int a;

    public /* synthetic */ f1(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // sg.y
    public Typeface a() {
        switch (this.a) {
            case 18:
                return org.telegram.messenger.g0.o1("fonts/rmedium.ttf");
            case 19:
                return org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf");
            case 20:
                return Typeface.create("serif", 1);
            case 21:
                return org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf");
            case 22:
                return org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            default:
                return org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        r2.p pVar = (r2.p) obj;
        pVar.h();
        return h9.i0.q(h9.o.y(pVar.Z.b, new x2.z0(1)));
    }

    @Override // t3.g
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // u9.e
    public List k(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i7 = f2.s0;
    }

    @Override // ua.a
    public void b(ua.b bVar) {
    }
}
