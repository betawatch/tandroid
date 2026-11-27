// default package

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w10 extends rn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(fvc fvcVar) {
        super("progress", (byte) 0);
        this.b = (byte) 5;
        this.c = fvcVar;
    }

    @Override // rn
    public final void c(Object obj, float f) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                j20 j20Var = (j20) obj2;
                j20Var.K2 = f;
                ema titleTextView = aVar.getTitleTextView();
                ImageView backButton = aVar.getBackButton();
                float f2 = 1.0f - f;
                titleTextView.setTranslationX(hl.L(-52.0f) * f2);
                backButton.setTranslationX(hl.L(-52.0f) * f2);
                s7 s7Var = j20Var.e2;
                if (s7Var != null && s7Var.getSearchContainer() != null) {
                    s7Var.getSearchContainer().setClipChildren(false);
                    s7Var.getSearchContainer().setClipToPadding(false);
                    s7Var.getSearchContainer().setPadding(0, 0, hl.L(hl.O1() ? 74.0f : 66.0f), 0);
                    s7Var.getSearchContainer().setTranslationX((hl.L(-52.0f) * f2) + hl.L(hl.O1() ? 74.0f : 66.0f));
                    if (s7Var.getSearchClearButton() != null) {
                        s7Var.getSearchClearButton().setTranslationX(hl.L(52.0f) * f2);
                    }
                }
                backButton.setScaleX(hl.R1(0.6f, 1.0f, f));
                backButton.setScaleY(hl.R1(0.6f, 1.0f, f));
                backButton.setAlpha(hl.R1(0.0f, 1.0f, f));
                j20Var.b.invalidate();
                break;
            case 1:
                zu1.Bd = f;
                zu1 zu1Var = (zu1) obj2;
                ColorMatrix colorMatrix = zu1Var.j7;
                colorMatrix.setSaturation(f);
                zu1Var.i7.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 2:
                vw2 vw2Var = (vw2) obj2;
                vw2Var.i0 = f;
                vw2Var.invalidate();
                break;
            case 3:
                fg4 fg4Var = (fg4) obj2;
                fg4Var.y0 = f;
                int i = fg4Var.W;
                vnb vnbVar = fg4Var.a;
                fg4Var.V.setColor(vm2.f(f, aob.v0(i, vnbVar), aob.v0(fg4Var.e0, vnbVar)));
                gu guVar = fg4Var.G;
                guVar.i1();
                guVar.invalidate();
                ((fg4) obj).invalidate();
                break;
            case 4:
                ((View) obj).setAlpha(f);
                k88 k88Var = ((PhotoViewer) obj2).D1;
                if (k88Var != null) {
                    k88Var.setVideoThumbFlashAlpha(f);
                    break;
                }
                break;
            case 5:
                fvc fvcVar = (fvc) obj2;
                fvcVar.y = f;
                fvcVar.invalidate();
                break;
            default:
                r3d r3dVar = (r3d) obj2;
                r3dVar.F = f;
                q3d q3dVar = r3dVar.M;
                if (q3dVar != null) {
                    q3dVar.b(f);
                }
                r3dVar.invalidate();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(((j20) obj2).K2);
            case 1:
                return Float.valueOf(zu1.Bd);
            case 2:
                return Float.valueOf(((vw2) obj2).i0);
            case 3:
                return Float.valueOf(((fg4) obj2).y0);
            case 4:
                return Float.valueOf(((View) obj).getAlpha());
            case 5:
                return Float.valueOf(((fvc) obj2).y);
            default:
                return Float.valueOf(((r3d) obj2).F);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w10(FrameLayout frameLayout, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        this.c = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(r3d r3dVar) {
        super("clipProgress", (byte) 0);
        this.b = (byte) 6;
        this.c = r3dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(PhotoViewer photoViewer) {
        super("flashViewAlpha", (byte) 0);
        this.b = (byte) 4;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(zu1 zu1Var) {
        super("", (byte) 0);
        this.b = (byte) 1;
        this.c = zu1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(j20 j20Var) {
        super("actionBarSlide", (byte) 0);
        this.b = (byte) 0;
        this.c = j20Var;
    }
}
