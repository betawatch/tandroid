// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vw0 implements wg5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // wg5
    public final void a(tab tabVar, RectF rectF) {
        byte b = this.a;
        tabVar.b = true;
    }

    @Override // wg5
    public final void d(Canvas canvas, RectF rectF) {
        p02 p02Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fx0 fx0Var = (fx0) obj;
                ViewGroup viewGroup = fx0Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == fx0Var.c) {
                    canvas.save();
                    canvas.translate(viewGroup.getX(), viewGroup.getY());
                    viewGroup.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                ((lf1) obj).X(canvas, rectF);
                break;
            case 2:
                x02 x02Var = (x02) obj;
                int i = 0;
                while (i < 2) {
                    p02 p02Var2 = i == 0 ? x02Var.v2 : x02Var.w2;
                    if (p02Var2 != null && p02Var2.c != null && p02Var2.getVisibility() == 0) {
                        tk0.b(p02Var2.c, canvas, rectF, p02Var2.d, x02Var.b, (int) (((i == 0 && (p02Var = x02Var.w2) != null && p02Var.getVisibility() == 0) ? (1.0f - x02Var.w2.getAlpha()) * p02Var2.getAlpha() : p02Var2.getAlpha()) * 255.0f));
                    }
                    i++;
                }
                break;
            case 3:
                t14 t14Var = (t14) obj;
                g04 g04Var = t14Var.Q;
                tk0.a(g04Var, canvas, rectF, g04Var, t14Var);
                wy3 wy3Var = t14Var.i0;
                tk0.a(wy3Var, canvas, rectF, wy3Var, t14Var);
                bz3 bz3Var = t14Var.E0;
                tk0.a(bz3Var, canvas, rectF, bz3Var, t14Var);
                break;
            case 4:
                ((qa6) obj).d0(canvas, rectF);
                break;
            case 5:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                o39 o39Var = premiumPreviewFragment.a;
                tk0.a(o39Var, canvas, rectF, o39Var, premiumPreviewFragment.e0);
                break;
            case 6:
                RectF rectF2 = ProfileActivity.Z6;
                canvas.save();
                canvas.translate(-r0.getScrollX(), -r0.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 7:
                RectF rectF3 = ProfileActivity.Z6;
                wo8 wo8Var = ((ProfileActivity) obj).d1;
                int i2 = wo8.R;
                wo8Var.P = true;
                wo8Var.draw(canvas);
                wo8Var.P = false;
                break;
            case 8:
                om8 om8Var = (om8) obj;
                yj0 yj0Var = om8Var.S2;
                if (yj0Var == null) {
                    a39 a39Var = om8Var.H2;
                    if (a39Var != null) {
                        a39Var.d(canvas, rectF);
                        break;
                    }
                } else {
                    yj0Var.d(canvas, rectF);
                    break;
                }
                break;
            case 9:
                yx9 yx9Var = (yx9) obj;
                o39 o39Var2 = yx9Var.n1;
                tk0.b(o39Var2, canvas, rectF, o39Var2, yx9Var.b, kk7.d4);
                break;
            case 10:
                taa taaVar = (taa) obj;
                v9a v9aVar = taaVar.A1;
                tk0.a(v9aVar, canvas, rectF, v9aVar, taaVar.b);
                break;
            default:
                hmc hmcVar = (hmc) obj;
                va vaVar = hmcVar.a;
                tk0.a(vaVar, canvas, rectF, vaVar, (ViewGroup) hmcVar.fragmentView);
                vlc vlcVar = hmcVar.e;
                if (vlcVar != null && hmcVar.n != null && vlcVar.getVisibility() == 0 && hmcVar.e.getAlpha() > 0.0f) {
                    int save = canvas.save();
                    canvas.translate(hmcVar.n.getX() + hmcVar.e.getLeft(), hmcVar.n.getY() + hmcVar.e.getTop());
                    canvas.concat(hmcVar.e.getMatrix());
                    if (hmcVar.e.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, hmcVar.e.getWidth(), hmcVar.e.getHeight(), (int) (hmcVar.e.getAlpha() * 255.0f));
                    }
                    hmcVar.e.draw(canvas);
                    canvas.restoreToCount(save);
                    break;
                }
                break;
        }
    }
}
