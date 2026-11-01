package uh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.l10;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c extends qt0 {
    public final /* synthetic */ i u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, Context context) {
        super(context);
        this.u3 = iVar;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean A1() {
        return this.u3.b;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.qt0, org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f7 = i10;
        i iVar = this.u3;
        l10 l10Var = iVar.J;
        if (iVar.b) {
            ss0 ss0Var = iVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < ss0Var.getChildCount(); i13++) {
                int bottom2 = ss0Var.getChildAt(i13).getBottom() - ss0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = i0.T1(f7, i12, iVar.c);
        }
        l10Var.setVisibility(iVar.w.b() <= 0 ? 8 : 0);
        l10Var.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.qt0
    public final int getAnimateToColumnsCount() {
        return this.u3.e;
    }

    @Override // org.telegram.ui.Components.qt0
    public final float getChangeColumnsProgress() {
        return this.u3.c;
    }

    @Override // org.telegram.ui.Components.qt0
    public final int getColumnsCount() {
        return this.u3.d;
    }

    @Override // org.telegram.ui.Components.qt0
    public final bk0 getMovingAdapter() {
        i iVar = this.u3;
        if (iVar.G.D != 0 || iVar.W.G.E1) {
            return null;
        }
        return iVar.w;
    }

    @Override // org.telegram.ui.Components.qt0
    public final bk0 getSupportingAdapter() {
        return this.u3.x;
    }

    @Override // org.telegram.ui.Components.qt0
    public final ss0 getSupportingListView() {
        return this.u3.r;
    }
}
