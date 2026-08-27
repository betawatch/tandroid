package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final d9 a;
    public final TextView b;
    public l c;

    public r(Context context, int i10, c6 c6Var) {
        super(context);
        this.a = new d9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(g6.v0(g6.E8, c6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, z5.g());
    }

    public final k51 a(n2 n2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        l lVar = this.c;
        if (lVar != null) {
            return lVar;
        }
        q qVar = new q(n2Var.getCurrentAccount(), n2Var.getMessagesController().getInputPeer(j10), i10, bArr, new j(this, 0), callback);
        AndroidUtilities.runOnUIThread(new j(qVar, 1), 1000L);
        l lVar2 = new l(n2Var, new k(qVar, 0), i11);
        this.c = lVar2;
        lVar2.U2.r = false;
        lVar2.j(new m(this, qVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        d9 d9Var = this.a;
        d9Var.setBounds(width - ((int) d9Var.c.d.f.a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        d9Var.c(canvas);
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
