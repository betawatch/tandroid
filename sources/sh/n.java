package sh;

import ai.o0;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q41;
import sg.t0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final b9 a;
    public final TextView b;
    public i c;

    public n(int i7, Context context, f6 f6Var) {
        super(context);
        this.a = new b9(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        r6.V(textView, k6.E8, f6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, ha.g());
    }

    public final q41 a(f2 f2Var, long j3, int i7, byte[] bArr, int i10, c20 c20Var) {
        i iVar = this.c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(f2Var.getCurrentAccount(), f2Var.getMessagesController().j1(j3), i7, bArr, new t0(this, 4), c20Var);
        g0.i3(new t0(mVar, 5), 1000L);
        i iVar2 = new i(f2Var, new h(mVar, 0), i10);
        this.c = iVar2;
        iVar2.f3.r = false;
        iVar2.j(new o0(9, this, mVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        b9 b9Var = this.a;
        b9Var.setBounds(width - ((int) b9Var.c.d.f.a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        b9Var.c(canvas);
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
