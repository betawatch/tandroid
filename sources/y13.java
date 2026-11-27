// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class y13 extends ny0 {
    public final boolean S1;
    public final zv5 T1;
    public TLRPC.InputPeer U1;
    public final boolean V1;
    public String W1;
    public String X1;
    public SpannableStringBuilder Y1;
    public l9c Z1;
    public final boolean a2;
    public u1 b2;

    public y13(e eVar, TLRPC.Peer peer, long j, boolean z, zv5 zv5Var) {
        super(eVar, false);
        this.S1 = false;
        this.u1 = 0.26f;
        this.T1 = zv5Var;
        this.V1 = z;
        Context context = this.b.getContext();
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-j));
        boolean z2 = M0 != null && M0.creator;
        this.a2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131743108, null));
        yob.X(textView, aob.Ji, this.J0);
        int L = hl.L(8.0f);
        int i = aob.Fi;
        int v0 = aob.v0(i, this.J0);
        int i2 = aob.d6;
        int o = vm2.o(aob.w0(null, i2, false), jn7.E1);
        hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
        uob M = yob.M(i);
        uob g = yob.g(i2, jn7.E1);
        vnb vnbVar = this.J0;
        textView.setBackground(i0);
        yob.j(textView, i0, M, g, vnbVar);
        this.b.addView(textView, tre.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z2 ? 52 : 0) + 12));
        textView.setOnClickListener(new sb1((Object) this, (Object) peer, (byte) 26));
        if (z2) {
            c51 c51Var = new c51(this.J0, context, false);
            c51Var.setColor(aob.w0(null, aob.r7, false));
            c51Var.d.x(hl.o());
            c51Var.i(ob6.M0(2131748554, null), false, true);
            c51Var.setOnClickListener(new yn0(this, context, c51Var, j, (byte) 1));
            this.b.addView(c51Var, tre.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, hl.L((z2 ? 52 : 0) + 72));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        J();
        X0();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = uc7.s1(this.a).j1(j);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.a).sendRequest(getgroupcallstreamrtmpurl, new ye(this, (byte) 16));
    }

    @Override // nx0
    public final void H() {
        TLRPC.InputPeer inputPeer;
        super.H();
        zv5 zv5Var = this.T1;
        if (zv5Var == null || (inputPeer = this.U1) == null) {
            return;
        }
        zv5Var.a(inputPeer, this.V1, false, true);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new n82(this, (byte) 15), this.J0);
        this.Z1 = l9cVar;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return ob6.M0(2131744091, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [nx0, ny0, y13] */
    /* JADX WARN: Type inference failed for: r0v4, types: [nx0] */
    public y13(Context context, int i, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ku9 ku9Var, x53 x53Var) {
        int i2;
        TLRPC.Chat M0;
        y13 ny0Var = new ny0(context, null, false, false, x53Var);
        ny0Var.S1 = true;
        ny0Var.u1 = 0.126f;
        ny0Var.T1 = null;
        ny0Var.V1 = false;
        long m = wf3.m(getgroupcallstreamrtmpurl.peer);
        boolean z = ku9Var != null && (m >= 0 || ((M0 = uc7.s1(i).M0(Long.valueOf(-m))) != null && M0.creator));
        if (ku9Var != null) {
            ny0Var.a2 = true;
            c51 c51Var = new c51(x53Var, context, true);
            c51Var.i(ob6.M0(2131748556, null), false, true);
            ny0Var.b.addView(c51Var, tre.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z ? 52 : 0) + 12));
            c51Var.setOnClickListener(new r81(ny0Var, ku9Var, c51Var));
            if (z) {
                c51 c51Var2 = new c51(x53Var, context, false);
                c51Var2.setColor(aob.w0(null, aob.r7, false));
                c51Var2.d.x(hl.o());
                c51Var2.i(ob6.M0(2131748554, null), false, true);
                ny0Var = this;
                c51Var2.setOnClickListener(new be(this, context, x53Var, i, c51Var2, getgroupcallstreamrtmpurl, (byte) 3));
                ny0Var.b.addView(c51Var2, tre.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        ny0Var.n1.setItemAnimator(zb3Var);
        d79 d79Var = ny0Var.n1;
        int i3 = ny0Var.u0;
        if (ny0Var.a2) {
            i2 = hl.L(z ? 124.0f : 72.0f);
        } else {
            i2 = 0;
        }
        d79Var.setPadding(i3, 0, i3, i2);
        ny0Var.J();
        ny0Var.X0();
        ny0Var.W1 = groupcallstreamrtmpurl.url;
        ny0Var.X1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ny0Var.X1);
        ny0Var.Y1 = spannableStringBuilder;
        rmb rmbVar = new rmb();
        rmbVar.a |= 256;
        rmbVar.b = 0;
        rmbVar.c = spannableStringBuilder.length();
        ny0Var.Y1.setSpan(new smb(rmbVar, 0), 0, ny0Var.Y1.length(), 0);
        ny0Var.Z1.O(false);
    }
}
