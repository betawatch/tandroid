package r2;

import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import h9.i0;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import sg.y;
import tg.f2;
import x2.p1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements g9.k, y, t3.g, OnFailureListener, u9.e, ua.a, q1 {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // sg.y
    public Typeface a() {
        switch (this.a) {
            case 17:
                return g0.o1("fonts/rmedium.ttf");
            case 18:
                return g0.o1("fonts/rmediumitalic.ttf");
            case 19:
                return Typeface.create("serif", 1);
            case 20:
                return g0.o1("fonts/rcondensedbold.ttf");
            case 21:
                return g0.o1("fonts/rmono.ttf");
            default:
                return g0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        q qVar = (q) obj;
        qVar.n();
        return i0.q(h9.o.y(qVar.Z.b, new p1(0)));
    }

    @Override // t3.g
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        t1Var.dismiss();
    }

    @Override // u9.e
    public List l(ComponentRegistrar componentRegistrar) {
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
