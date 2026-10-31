package zf;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout implements k6 {
    public final p6 a;
    public final g9 b;
    public final TextView c;
    public eq d;
    public e0 e;

    public d0(Context context, p6 p6Var) {
        super(context);
        this.a = p6Var;
        g9 g9Var = new g9(context);
        this.b = g9Var;
        addView(g9Var, b6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(e0 e0Var) {
        this.e = e0Var;
        g9 g9Var = this.b;
        g9Var.getImageReceiver().f();
        int i10 = e0Var.d;
        String str = e0Var.c;
        TextView textView = this.c;
        p6 p6Var = this.a;
        if (i10 == 7) {
            eq N = t6.N(org.telegram.messenger.i0.L(32.0f), R.drawable.chats_archive);
            this.d = N;
            int L = org.telegram.messenger.i0.L(16.0f);
            int L2 = org.telegram.messenger.i0.L(16.0f);
            N.e = L;
            N.f = L2;
            t6.B1(this.d, t6.w0(t6.Ci, p6Var), false);
            t6.B1(this.d, t6.w0(t6.Gi, p6Var), true);
            g9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        eq N2 = t6.N(org.telegram.messenger.i0.L(32.0f), e0Var.a);
        this.d = N2;
        int i11 = t6.Ci;
        t6.B1(N2, t6.w0(i11, p6Var), false);
        eq eqVar = this.d;
        int i12 = t6.Gi;
        t6.B1(eqVar, t6.w0(i12, p6Var), true);
        if (e0Var.d == 4) {
            TLObject tLObject = e0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (d20.i(d20.s0).f().id == user.id) {
                    eq N3 = t6.N(org.telegram.messenger.i0.L(32.0f), R.drawable.chats_saved);
                    int L3 = org.telegram.messenger.i0.L(16.0f);
                    int L4 = org.telegram.messenger.i0.L(16.0f);
                    N3.e = L3;
                    N3.f = L4;
                    t6.B1(N3, t6.w0(i11, p6Var), false);
                    t6.B1(N3, t6.w0(i12, p6Var), true);
                    g9Var.setImageDrawable(N3);
                } else {
                    g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(16.0f));
                    g9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(w3.Y(chat) ? 10.0f : 16.0f));
                g9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            g9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        e0 e0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        p6 p6Var = this.a;
        if (z10) {
            t6.C1(t6.w0(t6.Qi, p6Var), getBackground());
            invalidate();
        } else {
            setBackground(t6.d0(org.telegram.messenger.i0.L(28.0f), t6.w0(t6.Qi, p6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(t6.w0(t6.G6, p6Var));
        }
        eq eqVar = this.d;
        if (eqVar == null || (e0Var = this.e) == null) {
            return;
        }
        if (e0Var.d == 7) {
            t6.B1(eqVar, t6.w0(t6.Ci, p6Var), false);
            t6.B1(this.d, t6.w0(t6.Gi, p6Var), true);
        } else {
            t6.B1(eqVar, t6.w0(t6.Ci, p6Var), false);
            t6.B1(this.d, t6.w0(t6.Gi, p6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
