// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qm2 extends fy0 {
    public l5c S1;
    public boolean T1;
    public final FrameLayout U1;
    public final boolean V1;
    public final boolean W1;
    public int X1;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qm2(Context context, TLRPC.Chat chat, long j, p8c p8cVar) {
        super((wjb) null, context, false);
        rr8 rr8Var;
        int i;
        int i2;
        rr8 rr8Var2;
        TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(j));
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-j));
        this.W1 = l7c.v(V1);
        this.V1 = hc2.V(K0);
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        this.o1.setTitle(J0());
        t0(bkb.Z6);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        frameLayout.setPadding(0, gl.L(3.0f), 0, gl.L(3.0f));
        frameLayout.setLayoutParams(new e49(-1, -2));
        rr8 rr8Var3 = new rr8(context, null);
        if (K0 != null) {
            rr8Var = rr8Var3;
            i = -1;
            rr8Var.z(K0, null, K0.title, k96.H(' ', "Members", K0.participants_count), false, false);
        } else {
            rr8Var = rr8Var3;
            i = -1;
            if (V1 != null) {
                i2 = -1;
                rr8Var2 = rr8Var;
                rr8Var2.z(V1, null, cf3.l(V1), k96.M0(2131753153, null), false, false);
                frameLayout.addView(rr8Var2, nme.c(-2.0f, i2));
                o39 o39Var = this.n1;
                int i3 = this.u0;
                o39Var.setPadding(i3, 0, i3, gl.L(64.0f) + gl.n);
                this.n1.r1();
                this.n1.setClipToPadding(false);
                this.n1.setOnItemClickListener(new u(this, (byte) 15));
                u41 u41Var = new u41(this.J0, context, true);
                if (chat == null) {
                    u41Var.setText(k96.M0(hc2.w(27, chat) ? 2131751962 : 2131751959, null));
                } else {
                    u41Var.setText(k96.M0(2131751927, null));
                }
                u41Var.f();
                u41Var.setOnClickListener(new b0(this, p8cVar, chat, (byte) 25));
                this.b.addView(u41Var, nme.f(48.0f, -1, 80, gl.L(12.0f) + this.u0, 0, gl.L(12.0f) + this.u0, gl.L(12.0f) + gl.n));
                this.S1.O(false);
            }
        }
        i2 = i;
        rr8Var2 = rr8Var;
        frameLayout.addView(rr8Var2, nme.c(-2.0f, i2));
        o39 o39Var2 = this.n1;
        int i32 = this.u0;
        o39Var2.setPadding(i32, 0, i32, gl.L(64.0f) + gl.n);
        this.n1.r1();
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new u(this, (byte) 15));
        u41 u41Var2 = new u41(this.J0, context, true);
        if (chat == null) {
        }
        u41Var2.f();
        u41Var2.setOnClickListener(new b0(this, p8cVar, chat, (byte) 25));
        this.b.addView(u41Var2, nme.f(48.0f, -1, 80, gl.L(12.0f) + this.u0, 0, gl.L(12.0f) + this.u0, gl.L(12.0f) + gl.n));
        this.S1.O(false);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, false, new w72(this, (byte) 7), this.J0);
        this.S1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(this.W1 ? 2131751970 : 2131751965, null);
    }

    public final void Y0(p8c p8cVar, boolean z, boolean z2) {
        if (z2 && !z && !this.W1) {
            ij.M(getContext(), this.J0, k96.M0(2131751958, null), k96.M0(this.V1 ? 2131751961 : 2131751960, null), k96.M0(2131754483, null), new mn6((Object) this, (Object) p8cVar, z, (byte) 16)).show();
        } else {
            p8cVar.a(Boolean.valueOf(z));
            dismiss();
        }
    }

    public final void Z0(boolean z) {
        boolean z2;
        if (this.T1 != z) {
            this.T1 = z;
            int i = this.X1 + 1;
            o39 o39Var = this.n1;
            View U0 = o39Var.U0(i);
            if (U0 instanceof uy8) {
                ((uy8) U0).a(!z);
                z2 = false;
            } else {
                z2 = true;
            }
            View U02 = o39Var.U0(this.X1 + 2);
            if (U02 instanceof uy8) {
                ((uy8) U02).a(z);
            } else {
                z2 = true;
            }
            if (z2) {
                this.S1.O(true);
            }
        }
    }
}
