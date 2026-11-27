// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tga extends tk4 {
    public final /* synthetic */ gga V;
    public final /* synthetic */ eja W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tga(eja ejaVar, Context context, gga ggaVar) {
        super(context, null);
        this.W = ejaVar;
        this.V = ggaVar;
    }

    @Override // tk4
    public final int getColumnsCount() {
        return this.W.p1[eja.j0(this.V.F) ? 1 : 0];
    }

    @Override // tk4
    public final int getViewType() {
        setIsSingleCell(false);
        int i = this.V.F;
        if (i == 0 || i == 5) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2 && i != 4) {
            if (i == 3) {
                return 5;
            }
            if (i != 7) {
                if (i == 6) {
                    if (this.W.L0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (eja.j0(i)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // tk4, android.view.View
    public final void onDraw(Canvas canvas) {
        eja ejaVar = this.W;
        Paint paint = ejaVar.W0;
        paint.setColor(ejaVar.c0(aob.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
