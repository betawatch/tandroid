package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.v51;
import s4.c1;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class x extends FrameLayout {
    public org.telegram.ui.ActionBar.l a;
    public final bh.i b;
    public final FrameLayout c;
    public v51 d;
    public boolean e;
    public final /* synthetic */ z f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context) {
        super(context);
        this.f = zVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, b6.e(-1, -1, at.E1));
        bh.i iVar = new bh.i(getContext());
        this.b = iVar;
        iVar.setupColorKey(t6.a7);
        iVar.setFadeZoneBottom(i0.L(72.0f) + i0.n);
        iVar.setFadeHeightBottom(i0.L(24.0f));
        iVar.setFadeZoneTop(i0.L(64.0f) + i0.m);
        iVar.a.b(-i0.L(20.0f), false);
        frameLayout.addView(iVar, b6.g());
    }

    public final void a() {
        this.d.j(new o(this, 2));
        w wVar = new w(this);
        wVar.n(350L);
        wVar.o(gr.h);
        wVar.C = false;
        wVar.m = false;
        this.d.setItemAnimator(wVar);
    }

    public float b() {
        float f7 = i0.q.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                b51 G = this.d.f3.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.l lVar = this.a;
        if (lVar != null) {
            lVar.setTranslationY(Math.max(i0.m, b10));
        }
    }
}
