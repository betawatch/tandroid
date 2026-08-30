package sh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.l1;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class f0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final wg.f b;
    public final FrameLayout c;
    public g61 d;
    public boolean e;
    public final /* synthetic */ i0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Context context) {
        super(context);
        this.f = i0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, b6.e(-1, -1, 119));
        wg.f fVar = new wg.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(j6.a7);
        fVar.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        fVar.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        fVar.a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView(fVar, b6.g());
    }

    public final void a() {
        this.d.j(new lb0(this, 17));
        e0 e0Var = new e0(this);
        e0Var.n(350L);
        e0Var.o(nr.h);
        e0Var.C = false;
        e0Var.m = false;
        this.d.setItemAnimator(e0Var);
    }

    public float b() {
        float f10 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            l1 T = this.d.T(childAt);
            if (T != null) {
                i51 G = this.d.V2.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
