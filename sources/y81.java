// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y81 extends FrameLayout implements tjb {
    public final rr8 a;
    public final ls8 b;
    public TLRPC.Chat c;

    public y81(Context context) {
        super(context);
        String M0 = k96.M0(2131743200, null);
        ls8 ls8Var = new ls8(context);
        this.b = ls8Var;
        int ceil = (int) Math.ceil(ls8Var.getPaint().measureText(M0));
        rr8 rr8Var = new rr8(context, null);
        this.a = rr8Var;
        rr8Var.N0 = true;
        rr8Var.F0 = true;
        rr8Var.setPadding(k96.a0 ? gl.L(44.0f) + ceil : 0, 0, k96.a0 ? 0 : gl.L(44.0f) + ceil, 0);
        int i = -gl.L(4.0f);
        rr8Var.c0 = 0;
        rr8Var.d0 = i;
        addView(rr8Var, nme.c(-1.0f, -1));
        ls8Var.setText(M0);
        ls8Var.setTextSize(1, 14.0f);
        zkb.X(ls8Var, bkb.Ii, null);
        ls8Var.setProgressColor(bkb.w0(null, bkb.Di, false));
        int i2 = bkb.Xl;
        int w0 = bkb.w0(null, i2, false);
        bkb.w0(null, bkb.Gi, false);
        ls8Var.setBackground(sjb.e(w0, 16.0f));
        Drawable background = ls8Var.getBackground();
        vkb M = zkb.M(i2);
        ls8Var.setBackground(background);
        zkb.j(ls8Var, background, M, null, null);
        ls8Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        addView(ls8Var, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.b.setProgressColor(bkb.w0(null, bkb.Di, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
