package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.i51;
import pf.o1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q extends FrameLayout {
    public final e9 a;
    public final TextView b;
    public k c;

    public q(Context context, int i9, b6 b6Var) {
        super(context);
        this.a = new e9(i9, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(f6.v0(f6.E8, b6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, e6.g());
    }

    public final i51 a(o2 o2Var, long j10, int i9, byte[] bArr, int i10, Utilities.Callback callback) {
        k kVar = this.c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(o2Var.getCurrentAccount(), o2Var.getMessagesController().getInputPeer(j10), i9, bArr, new o1(this, 23), callback);
        AndroidUtilities.runOnUIThread(new o1(pVar, 24), 1000L);
        k kVar2 = new k(o2Var, new j(pVar, 0), i10);
        this.c = kVar2;
        kVar2.U2.r = false;
        kVar2.j(new l(this, pVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        e9 e9Var = this.a;
        e9Var.setBounds(width - ((int) e9Var.c.d.f.a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        e9Var.c(canvas);
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
