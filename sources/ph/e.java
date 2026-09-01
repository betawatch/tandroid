package ph;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.qt0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class e extends pu0 {
    public final /* synthetic */ l n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, Context context) {
        super(context);
        this.n3 = lVar;
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean A1() {
        return true;
    }

    @Override // org.telegram.ui.Components.pu0, org.telegram.ui.Components.aa, org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f10 = i10;
        l lVar = this.n3;
        i iVar = lVar.G;
        if (lVar.b) {
            qt0 qt0Var = lVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < qt0Var.getChildCount(); i13++) {
                int bottom2 = qt0Var.getChildAt(i13).getBottom() - qt0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i12, lVar.c);
        }
        iVar.setVisibility(lVar.v.h() <= 0 ? 8 : 0);
        iVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.pu0
    public final int getAnimateToColumnsCount() {
        return this.n3.e;
    }

    @Override // org.telegram.ui.Components.pu0
    public final float getChangeColumnsProgress() {
        return this.n3.c;
    }

    @Override // org.telegram.ui.Components.pu0
    public final int getColumnsCount() {
        return this.n3.d;
    }

    @Override // org.telegram.ui.Components.pu0
    public final dl0 getMovingAdapter() {
        l lVar = this.n3;
        if (lVar.D.y != 0 || lVar.T.D.z1) {
            return null;
        }
        return lVar.v;
    }

    @Override // org.telegram.ui.Components.pu0
    public final dl0 getSupportingAdapter() {
        return this.n3.w;
    }

    @Override // org.telegram.ui.Components.pu0
    public final qt0 getSupportingListView() {
        return this.n3.r;
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean z1() {
        return this.n3.b;
    }
}
