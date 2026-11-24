// default package

import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.scilab.forge.jlatexmath.ParseException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qm0 implements ed, o8c, eia, fia, dz0, eja, r69, bha, xec, b39, gj, ll5, js4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ qm0(kc1 kc1Var, int i, y21 y21Var) {
        this.a = (byte) 16;
    }

    public static /* bridge */ /* synthetic */ RenderNode e(Object obj) {
        return (RenderNode) obj;
    }

    public static /* synthetic */ void g(String str) {
        throw new ParseException(str);
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Drawable t = imageReceiver.t();
        if (t instanceof oy8) {
            oy8 oy8Var = (oy8) t;
            oy8Var.K(0);
            oy8Var.stop();
            oy8Var.O(false, 0.0f);
        }
    }

    @Override // xec
    public final void a(View view, RectF rectF) {
        view.invalidate();
    }

    @Override // fia
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 8:
                ow0 ow0Var = (ow0) obj;
                ow0Var.c = f;
                ow0Var.f.invalidate();
                ow0Var.Y.setAlpha(f);
                ow0Var.J();
                ow0Var.H();
                break;
            case 26:
                ((m12) obj).setLoadProgress(f);
                break;
            default:
                ((r12) obj).setSwipeOffsetY(f);
                break;
        }
    }

    @Override // bha
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override // r69
    public final void call() {
        throw null;
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override // eia
    public final float get(Object obj) {
        switch (this.a) {
            case 7:
                return ((ow0) obj).c;
            case 25:
                return ((m12) obj).c;
            default:
                return ((r12) obj).getSwipeOffsetY();
        }
    }

    @Override // bha
    public final RecyclerView h(View view) {
        return ((ti1) view).a;
    }

    @Override // eja
    public final void k(int i) {
        if (i == 0) {
            gba.z(3);
            return;
        }
        if (i == 1) {
            gba.z(0);
        } else if (i == 2) {
            gba.z(1);
        } else if (i == 3) {
            gba.z(2);
        }
    }

    @Override // js4
    public final Object m(Object obj) {
        gia giaVar = r12.c0;
        return Boolean.FALSE;
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        switch (this.a) {
            case 22:
                MediaController.w().A0(1, i, z, false);
                break;
            default:
                MediaController.w().A0(1, i, z, false);
                break;
        }
    }

    @Override // bha
    public final /* synthetic */ void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 0:
                hdVar.dismiss();
                break;
            case 1:
                hdVar.dismiss();
                break;
            case 5:
                hdVar.dismiss();
                break;
            case 6:
                hdVar.dismiss();
                break;
            case 13:
                hdVar.dismiss();
                break;
            default:
                hdVar.dismiss();
                break;
        }
    }

    public /* synthetic */ qm0(byte b) {
        this.a = b;
    }

    public /* synthetic */ qm0(Object obj, byte b) {
        this.a = b;
    }

    @Override // dz0
    public final void cancel() {
    }

    @Override // eja
    public final void n() {
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}
