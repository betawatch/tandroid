// default package

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yyc extends ehc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ azc b;

    public /* synthetic */ yyc(azc azcVar, byte b) {
        this.a = b;
        this.b = azcVar;
    }

    @Override // dhc
    public final void c() {
        View view;
        byte b = this.a;
        azc azcVar = this.b;
        switch (b) {
            case 0:
                if (azcVar.o && (view = azcVar.g) != null) {
                    view.setTranslationY(0.0f);
                    azcVar.d.setTranslationY(0.0f);
                }
                azcVar.d.setVisibility(8);
                azcVar.d.setTransitioning(false);
                azcVar.s = null;
                lx6 lx6Var = azcVar.k;
                if (lx6Var != null) {
                    lx6Var.B(azcVar.j);
                    azcVar.j = null;
                    azcVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = azcVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = kfc.a;
                    afc.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                azcVar.s = null;
                azcVar.d.requestLayout();
                break;
        }
    }
}
