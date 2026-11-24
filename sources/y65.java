// default package

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y65 extends r59 {
    public final /* synthetic */ g95 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y65(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = g95Var;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        l95 l95Var = (l95) view;
        g95 g95Var = this.f3;
        p85 p85Var = g95Var.J1;
        c75 c75Var = g95Var.T3;
        if (c75Var.r == null && !g95Var.D4.k()) {
            l95Var.setAlpha(1.0f);
            l95Var.setTranslationX(0.0f);
            l95Var.setTranslationY(0.0f);
        }
        y65 y65Var = g95Var.e4;
        l95Var.getClass();
        y65Var.getClass();
        if (RecyclerView.R(l95Var) == -1 && l95Var.getRenderer() != null) {
            return true;
        }
        if (l95Var.getTranslationY() == 0.0f || l95Var.getRenderer() == null || l95Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j);
        }
        float top = p85Var.getTop() - getTop();
        float measuredHeight = p85Var.getMeasuredHeight() + top;
        float f = c75Var.c;
        canvas.save();
        float f2 = 1.0f - f;
        canvas.clipRect(0.0f, top * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}
