package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.w3;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final y8 a;
    public final TextView b;
    public i c;

    public n(int i7, Context context, e6 e6Var) {
        super(context);
        this.a = new y8(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        q6.U(textView, j6.E8, e6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, ja.g());
    }

    public final u41 a(e2 e2Var, long j3, int i7, byte[] bArr, int i10, z10 z10Var) {
        i iVar = this.c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(e2Var.getCurrentAccount(), e2Var.getMessagesController().j1(j3), i7, bArr, new q2.d(this, 14), z10Var);
        g0.i3(new q2.d(mVar, 15), 1000L);
        i iVar2 = new i(e2Var, new h(mVar, 0), i10);
        this.c = iVar2;
        iVar2.g3.r = false;
        iVar2.j(new w3(10, this, mVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        y8 y8Var = this.a;
        y8Var.setBounds(width - ((int) y8Var.c.d.f.a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        y8Var.c(canvas);
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
