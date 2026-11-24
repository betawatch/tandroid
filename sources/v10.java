// default package

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v10 extends qn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(rqc rqcVar) {
        super("progress", (byte) 0);
        this.b = (byte) 5;
        this.c = rqcVar;
    }

    @Override // qn
    public final void c(Object obj, float f) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                i20 i20Var = (i20) obj2;
                i20Var.K2 = f;
                jia titleTextView = aVar.getTitleTextView();
                ImageView backButton = aVar.getBackButton();
                float f2 = 1.0f - f;
                titleTextView.setTranslationX(gl.L(-52.0f) * f2);
                backButton.setTranslationX(gl.L(-52.0f) * f2);
                r7 r7Var = i20Var.e2;
                if (r7Var != null && r7Var.getSearchContainer() != null) {
                    r7Var.getSearchContainer().setClipChildren(false);
                    r7Var.getSearchContainer().setClipToPadding(false);
                    r7Var.getSearchContainer().setPadding(0, 0, gl.L(gl.O1() ? 74.0f : 66.0f), 0);
                    r7Var.getSearchContainer().setTranslationX((gl.L(-52.0f) * f2) + gl.L(gl.O1() ? 74.0f : 66.0f));
                    if (r7Var.getSearchClearButton() != null) {
                        r7Var.getSearchClearButton().setTranslationX(gl.L(52.0f) * f2);
                    }
                }
                backButton.setScaleX(gl.R1(0.6f, 1.0f, f));
                backButton.setScaleY(gl.R1(0.6f, 1.0f, f));
                backButton.setAlpha(gl.R1(0.0f, 1.0f, f));
                i20Var.b.invalidate();
                break;
            case 1:
                mu1.nd = f;
                mu1 mu1Var = (mu1) obj2;
                ColorMatrix colorMatrix = mu1Var.j7;
                colorMatrix.setSaturation(f);
                mu1Var.i7.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 2:
                bw2 bw2Var = (bw2) obj2;
                bw2Var.i0 = f;
                bw2Var.invalidate();
                break;
            case 3:
                he4 he4Var = (he4) obj2;
                he4Var.x0 = f;
                int i = he4Var.V;
                wjb wjbVar = he4Var.a;
                he4Var.U.setColor(bm2.f(f, bkb.v0(i, wjbVar), bkb.v0(he4Var.d0, wjbVar)));
                fu fuVar = he4Var.G;
                fuVar.h1();
                fuVar.invalidate();
                ((he4) obj).invalidate();
                break;
            case 4:
                ((View) obj).setAlpha(f);
                v48 v48Var = ((PhotoViewer) obj2).D1;
                if (v48Var != null) {
                    v48Var.setVideoThumbFlashAlpha(f);
                    break;
                }
                break;
            case 5:
                rqc rqcVar = (rqc) obj2;
                rqcVar.y = f;
                rqcVar.invalidate();
                break;
            default:
                azc azcVar = (azc) obj2;
                azcVar.F = f;
                zyc zycVar = azcVar.M;
                if (zycVar != null) {
                    zycVar.b(f);
                }
                azcVar.invalidate();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(((i20) obj2).K2);
            case 1:
                return Float.valueOf(mu1.nd);
            case 2:
                return Float.valueOf(((bw2) obj2).i0);
            case 3:
                return Float.valueOf(((he4) obj2).x0);
            case 4:
                return Float.valueOf(((View) obj).getAlpha());
            case 5:
                return Float.valueOf(((rqc) obj2).y);
            default:
                return Float.valueOf(((azc) obj2).F);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v10(FrameLayout frameLayout, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        this.c = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(azc azcVar) {
        super("clipProgress", (byte) 0);
        this.b = (byte) 6;
        this.c = azcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(PhotoViewer photoViewer) {
        super("flashViewAlpha", (byte) 0);
        this.b = (byte) 4;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(mu1 mu1Var) {
        super("", (byte) 0);
        this.b = (byte) 1;
        this.c = mu1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(i20 i20Var) {
        super("actionBarSlide", (byte) 0);
        this.b = (byte) 0;
        this.c = i20Var;
    }
}
