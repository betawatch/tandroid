package th;

import ai.i4;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.g0;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z8;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final z8 a;
    public final TextView b;
    public i c;

    public n(int i3, Context context, e6 e6Var) {
        super(context);
        this.a = new z8(i3, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        r6.V(textView, k6.E8, e6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, mf.g());
    }

    public final l41 a(d2 d2Var, long j10, int i3, byte[] bArr, int i10, u10 u10Var) {
        i iVar = this.c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(d2Var.getCurrentAccount(), d2Var.getMessagesController().j1(j10), i3, bArr, new u(this, 11), u10Var);
        g0.i3(new u(mVar, 12), 1000L);
        i iVar2 = new i(d2Var, new h(mVar, 0), i10);
        this.c = iVar2;
        iVar2.g3.r = false;
        iVar2.j(new i4(10, this, mVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        z8 z8Var = this.a;
        z8Var.setBounds(width - ((int) z8Var.c.d.f.a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        z8Var.c(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    public void setText(String str) {
        this.b.setText(str);
    }
}
