package vh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c6 extends org.telegram.ui.ActionBar.z2 implements us {
    public final int i1;
    public ArrayList j1;
    public final TLRPC.InputPeer k1;
    public final tk0 l1;
    public final b6 m1;
    public final TextView n1;

    public c6(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final q20 q20Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        O();
        vp.r1(i10).O1().U();
        this.i1 = i10;
        this.j1 = vp.r1(i10).O1().T;
        this.k1 = inputPeer;
        this.b = new z5(this, context, p6Var);
        tk0 tk0Var = new tk0(context, p6Var);
        this.l1 = tk0Var;
        int i11 = this.t0;
        tk0Var.setPadding(i11, 0, i11, 0);
        b6 b6Var = new b6(this);
        this.m1 = b6Var;
        tk0Var.setAdapter(b6Var);
        tk0Var.setLayoutManager(new s4.a0());
        this.b.addView(tk0Var, w7.b6.e(-1, -1, zs.E1));
        tk0Var.setOnItemClickListener(new gk0() { // from class: vh.y5
            @Override // org.telegram.ui.Components.gk0
            public final void f(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                c6 c6Var = c6.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) c6Var.j1.get(i12 - 2);
                long j10 = inputPeer2.channel_id;
                q20 q20Var2 = q20Var;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    q20Var2.a(inputPeer2);
                    c6Var.dismiss();
                    return;
                }
                Context context2 = c6Var.getContext();
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context2, p6Var2);
                x1Var.r(200L);
                vp.r1(i10).O1().k(org.telegram.messenger.o5.n(inputPeer2), new kg.d0(x1Var, q20Var2, inputPeer2, 13), true, p6Var2);
                c6Var.dismiss();
            }
        });
        tk0Var.setOnScrollListener(new a6(this));
        TextView textView = new TextView(getContext());
        this.n1 = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.i0.L(22.0f) + this.t0, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(22.0f) + this.t0, org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, textView, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(z10 ? 2131744543 : 2131744544, null));
        this.b.addView(textView, w7.b6.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return I0() > ((float) ((int) (((float) org.telegram.messenger.i0.q.y) * 0.5f)));
    }

    public final float I0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            tk0 tk0Var = this.l1;
            if (i10 >= tk0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = tk0Var.getChildAt(i10);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(org.telegram.messenger.i0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.c3) {
            this.j1 = vp.r1(this.i1).O1().T;
            this.m1.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.i1).c(this, zs.c3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.i1).n(this, zs.c3);
    }
}
