package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.g6;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.h51;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final g9 a;
    public final TextView b;
    public i c;

    public n(int i7, Context context, h6 h6Var) {
        super(context);
        this.a = new g9(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        t6.U(textView, m6.E8, h6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, ma.g());
    }

    public final h51 a(g2 g2Var, long j3, int i7, byte[] bArr, int i10, y10 y10Var) {
        i iVar = this.c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(g2Var.getCurrentAccount(), g2Var.getMessagesController().l1(j3), i7, bArr, new z0(this, 17), y10Var);
        g0.h3(new z0(mVar, 18), 1000L);
        i iVar2 = new i(g2Var, new h(mVar, 0), i10);
        this.c = iVar2;
        iVar2.g3.r = false;
        iVar2.j(new g6(10, this, mVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        g9 g9Var = this.a;
        g9Var.setBounds(width - ((int) g9Var.c.d.f.a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        g9Var.c(canvas);
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
