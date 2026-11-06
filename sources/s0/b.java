package s0;

import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kt0;
import sg.z;
import tg.c2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements z, t3.g, OnFailureListener, jt0, kt0, u9.e, ua.a, r1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // sg.z
    public Typeface a() {
        switch (this.a) {
            case 9:
                return g0.o1("fonts/rmedium.ttf");
            case 10:
                return g0.o1("fonts/rmediumitalic.ttf");
            case 11:
                return Typeface.create("serif", 1);
            case 12:
                return g0.o1("fonts/rcondensedbold.ttf");
            case 13:
                return g0.o1("fonts/rmono.ttf");
            default:
                return g0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override // t3.g
    public boolean b(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // org.telegram.ui.Components.kt0
    public void f(Object obj, float f10) {
        ti.i iVar = (ti.i) obj;
        switch (this.a) {
            case 20:
                WindowManager.LayoutParams layoutParams = iVar.e;
                iVar.B = f10;
                layoutParams.x = (int) f10;
                iVar.r();
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = iVar.e;
                iVar.C = f10;
                layoutParams2.y = (int) f10;
                iVar.r();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 27:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public float get(Object obj) {
        ti.i iVar = (ti.i) obj;
        switch (this.a) {
            case 19:
                return iVar.B;
            default:
                return iVar.C;
        }
    }

    @Override // u9.e
    public List i(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i7 = c2.r0;
    }

    @Override // ua.a
    public void c(ua.b bVar) {
    }
}
