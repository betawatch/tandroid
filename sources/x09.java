// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x09 extends FrameLayout {
    public final tl a;
    public final /* synthetic */ y09 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x09(y09 y09Var, Context context) {
        super(context);
        this.b = y09Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, y09Var.getResourceProvider());
        textView.setText(k96.M0(2131751338, null));
        addView(textView, nme.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new tl(gl.L(24.0f), this);
    }

    public final void a(boolean z) {
        int i;
        int i2;
        y09 y09Var = this.b;
        i = ((d) y09Var).currentAccount;
        String S = hq6.d0(i).S();
        tl tlVar = this.a;
        if (S != null && S.startsWith("animated_")) {
            try {
                tlVar.j(Long.parseLong(S.substring(9)), z);
                return;
            } catch (Exception unused) {
            }
        }
        i2 = ((d) y09Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i2).r.get(S);
        if (tL_availableReaction != null) {
            tlVar.i(tL_availableReaction.static_icon, z);
        }
    }

    public final void b() {
        int width = getWidth();
        tl tlVar = this.a;
        tlVar.setBounds((width - tlVar.s) - gl.L(21.0f), (getHeight() - tlVar.s) / 2, getWidth() - gl.L(21.0f), (getHeight() + tlVar.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.a.draw(canvas);
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

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
    }
}
