// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z13 extends q59 {
    public final /* synthetic */ a23 c;

    public z13(a23 a23Var) {
        this.c = a23Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 3;
    }

    @Override // y59
    public final int b() {
        a23 a23Var = this.c;
        return a23Var.U1 ? a23Var.T1.size() + 3 : a23Var.V1 ? 2 : 1;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLObject L0;
        String str;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 3) {
            if (i2 != 2) {
                if (i2 == 1) {
                    ((njb) view).setText(gm.E2(gm.N2(jb6.M0(2131743114, null), cmb.K6, 0, new xf2(this, (byte) 18), null), true, gm.L(1.0f), gm.L(1.0f)));
                    return;
                }
                return;
            } else {
                jf5 jf5Var = (jf5) view;
                jf5Var.setTextSize(15.0f);
                jf5Var.setPadding(0, 0, 0, gm.L(2.0f));
                jf5Var.setText(jb6.M0(2131743127, null).replace(":", ""));
                return;
            }
        }
        a23 a23Var = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) a23Var.T1.get(i - 3);
        long B1 = k47.B1(peer);
        int i3 = a23Var.a;
        if (B1 > 0) {
            L0 = oc7.r1(i3).W1(Long.valueOf(B1));
            str = jb6.M0(2131743033, null);
        } else {
            L0 = oc7.r1(i3).L0(Long.valueOf(-B1));
            str = null;
        }
        xc5 xc5Var = (xc5) view;
        xc5Var.e(L0, null, str, i != b() - 1);
        xc5Var.c(peer == a23Var.Y1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.ViewGroup, android.widget.LinearLayout, t1] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        a23 a23Var = this.c;
        if (i == 1) {
            njb njbVar = new njb(context);
            anb.h(cmb.Z6, a23Var.J0, njbVar);
            njbVar.setTopPadding(17);
            njbVar.setBottomPadding(17);
            frameLayout = njbVar;
        } else if (i == 2) {
            frameLayout = new jf5(context, 22);
        } else if (i != 3) {
            boolean z = a23Var.W1;
            ?? t1Var = new t1((byte) 5, context, false);
            t1Var.setOrientation(1);
            s09 s09Var = new s09(context);
            s09Var.setAutoRepeat(true);
            s09Var.f(R.raw.utyan_schedule, nm7.w1, nm7.w1, null);
            s09Var.d();
            t1Var.addView(s09Var, qoe.t(nm7.w1, nm7.w1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(gm.o());
            textView.setText(z ? jb6.a0(null, null, 2131744592, new Object[0]) : jb6.a0(null, null, 2131744589, new Object[0]));
            textView.setTextSize(1, 20.0f);
            anb.X(textView, cmb.F6, null);
            t1Var.addView(textView, qoe.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            anb.X(textView2, cmb.i5, null);
            textView2.setText(z ? jb6.a0(null, null, 2131743142, new Object[0]) : jb6.a0(null, null, 2131743017, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            t1Var.addView(textView2, qoe.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = t1Var;
        } else {
            frameLayout = new xc5(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new g69(-1, -2));
        return new b59(frameLayout);
    }
}
