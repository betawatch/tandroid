package th;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p6 {
    public final x2 a;
    public final org.telegram.ui.Components.t5 b;
    public final TextPaint c;
    public final StaticLayout d;
    public final float e;
    public final float f;
    public float g;
    public boolean h;
    public int i;

    public p6(z2 z2Var, x2 x2Var) {
        this.a = x2Var;
        this.b = new org.telegram.ui.Components.t5(z2Var, 0L, 360L, gr.h);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.i0.L(3.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(cd.L0(2131744506, null), textPaint, org.telegram.messenger.i0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
