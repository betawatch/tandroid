// default package

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r23 implements a33 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ r23(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // a33
    public final boolean a() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                t23 t23Var = (t23) frameLayout;
                t23Var.d.invalidate();
                return t23Var.f.j();
            case 1:
                y23 y23Var = (y23) frameLayout;
                y23Var.e.invalidate();
                return y23Var.h.j();
            default:
                u48 u48Var = ((v48) frameLayout).a;
                if (u48Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((d78) u48Var).a;
                Drawable[] drawableArr = PhotoViewer.f9;
                return photoViewer.K();
        }
    }

    @Override // a33
    public final void b() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((t23) frameLayout).f.o();
                break;
            case 1:
                ((y23) frameLayout).h.o();
                break;
            default:
                ((v48) frameLayout).b.o();
                break;
        }
    }

    @Override // a33
    public final void c() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((t23) frameLayout).f.a.g(1, true);
                break;
            case 1:
                ((y23) frameLayout).h.a.g(1, true);
                break;
            default:
                ((v48) frameLayout).b.a.g(1, true);
                break;
        }
    }

    @Override // a33
    public final boolean d() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                t23 t23Var = (t23) frameLayout;
                q23 q23Var = t23Var.f;
                boolean m = q23Var.m(-90.0f);
                q23Var.i();
                t23Var.d.invalidate();
                return m;
            case 1:
                y23 y23Var = (y23) frameLayout;
                q23 q23Var2 = y23Var.h;
                boolean m2 = q23Var2.m(-90.0f);
                q23Var2.i();
                y23Var.e.invalidate();
                return m2;
            default:
                u48 u48Var = ((v48) frameLayout).a;
                if (u48Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((d78) u48Var).a;
                Drawable[] drawableArr = PhotoViewer.f9;
                return photoViewer.L(-90.0f, false, null);
        }
    }

    @Override // a33
    public final void e() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((t23) frameLayout).f.k();
                break;
            case 1:
                ((y23) frameLayout).h.k();
                break;
            default:
                ((v48) frameLayout).b.k();
                break;
        }
    }

    @Override // a33
    public final void f(float f) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((t23) frameLayout).f.setRotation(f);
                break;
            case 1:
                ((y23) frameLayout).h.setRotation(f);
                break;
            default:
                v48 v48Var = (v48) frameLayout;
                v48Var.b.setRotation(f);
                u48 u48Var = v48Var.a;
                if (u48Var != null) {
                    ((d78) u48Var).b(false);
                    break;
                }
                break;
        }
    }
}
