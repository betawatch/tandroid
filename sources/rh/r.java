package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p9;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final p9 a;
    public final TextView b;
    public l c;

    public r(Context context, int i10, c6 c6Var) {
        super(context);
        this.a = new p9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(g6.w0(g6.E8, c6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, a6.g());
    }

    public final h71 a(m2 m2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        l lVar = this.c;
        if (lVar != null) {
            return lVar;
        }
        q qVar = new q(m2Var.getCurrentAccount(), m2Var.getMessagesController().getInputPeer(j10), i10, bArr, new org.telegram.ui.Components.voip.m2(this, 29), callback);
        AndroidUtilities.runOnUIThread(new j(qVar, 0), 1000L);
        l lVar2 = new l(m2Var, new k(qVar, 0), i11);
        this.c = lVar2;
        lVar2.W2.r = false;
        lVar2.j(new m(this, qVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        p9 p9Var = this.a;
        p9Var.setBounds(width - ((int) p9Var.c.d.f.a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        p9Var.c(canvas);
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
