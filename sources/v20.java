// default package

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v20 extends ro {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(tsc tscVar) {
        super("progress", (byte) 0);
        this.b = (byte) 5;
        this.c = tscVar;
    }

    @Override // ro
    public final void c(Object obj, float f) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                i30 i30Var = (i30) obj2;
                i30Var.K2 = f;
                lka titleTextView = aVar.getTitleTextView();
                ImageView backButton = aVar.getBackButton();
                float f2 = 1.0f - f;
                titleTextView.setTranslationX(gm.L(-52.0f) * f2);
                backButton.setTranslationX(gm.L(-52.0f) * f2);
                r7 r7Var = i30Var.e2;
                if (r7Var != null && r7Var.getSearchContainer() != null) {
                    r7Var.getSearchContainer().setClipChildren(false);
                    r7Var.getSearchContainer().setClipToPadding(false);
                    r7Var.getSearchContainer().setPadding(0, 0, gm.L(gm.O1() ? 74.0f : 66.0f), 0);
                    r7Var.getSearchContainer().setTranslationX((gm.L(-52.0f) * f2) + gm.L(gm.O1() ? 74.0f : 66.0f));
                    if (r7Var.getSearchClearButton() != null) {
                        r7Var.getSearchClearButton().setTranslationX(gm.L(52.0f) * f2);
                    }
                }
                backButton.setScaleX(gm.R1(0.6f, 1.0f, f));
                backButton.setScaleY(gm.R1(0.6f, 1.0f, f));
                backButton.setAlpha(gm.R1(0.0f, 1.0f, f));
                i30Var.b.invalidate();
                break;
            case 1:
                yv1.yd = f;
                yv1 yv1Var = (yv1) obj2;
                ColorMatrix colorMatrix = yv1Var.j7;
                colorMatrix.setSaturation(f);
                yv1Var.i7.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 2:
                lx2 lx2Var = (lx2) obj2;
                lx2Var.i0 = f;
                lx2Var.invalidate();
                break;
            case 3:
                ig4 ig4Var = (ig4) obj2;
                ig4Var.x0 = f;
                int i = ig4Var.V;
                ylb ylbVar = ig4Var.a;
                ig4Var.U.setColor(on2.f(f, cmb.v0(i, ylbVar), cmb.v0(ig4Var.d0, ylbVar)));
                fv fvVar = ig4Var.G;
                fvVar.h1();
                fvVar.invalidate();
                ((ig4) obj).invalidate();
                break;
            case 4:
                ((View) obj).setAlpha(f);
                x68 x68Var = ((PhotoViewer) obj2).D1;
                if (x68Var != null) {
                    x68Var.setVideoThumbFlashAlpha(f);
                    break;
                }
                break;
            case 5:
                tsc tscVar = (tsc) obj2;
                tscVar.y = f;
                tscVar.invalidate();
                break;
            default:
                b1d b1dVar = (b1d) obj2;
                b1dVar.F = f;
                a1d a1dVar = b1dVar.M;
                if (a1dVar != null) {
                    a1dVar.b(f);
                }
                b1dVar.invalidate();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(((i30) obj2).K2);
            case 1:
                return Float.valueOf(yv1.yd);
            case 2:
                return Float.valueOf(((lx2) obj2).i0);
            case 3:
                return Float.valueOf(((ig4) obj2).x0);
            case 4:
                return Float.valueOf(((View) obj).getAlpha());
            case 5:
                return Float.valueOf(((tsc) obj2).y);
            default:
                return Float.valueOf(((b1d) obj2).F);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v20(FrameLayout frameLayout, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        this.c = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(b1d b1dVar) {
        super("clipProgress", (byte) 0);
        this.b = (byte) 6;
        this.c = b1dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(PhotoViewer photoViewer) {
        super("flashViewAlpha", (byte) 0);
        this.b = (byte) 4;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(yv1 yv1Var) {
        super("", (byte) 0);
        this.b = (byte) 1;
        this.c = yv1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(i30 i30Var) {
        super("actionBarSlide", (byte) 0);
        this.b = (byte) 0;
        this.c = i30Var;
    }
}
