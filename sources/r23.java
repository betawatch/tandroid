// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r23 extends mz0 {
    public final boolean S1;
    public final uv5 T1;
    public TLRPC.InputPeer U1;
    public final boolean V1;
    public String W1;
    public String X1;
    public SpannableStringBuilder Y1;
    public l7c Z1;
    public final boolean a2;
    public t1 b2;

    public r23(d dVar, TLRPC.Peer peer, long j, boolean z, uv5 uv5Var) {
        super(dVar, false);
        this.S1 = false;
        this.u1 = 0.26f;
        this.T1 = uv5Var;
        this.V1 = z;
        Context context = this.b.getContext();
        TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-j));
        boolean z2 = L0 != null && L0.creator;
        this.a2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131743140, null));
        anb.X(textView, cmb.Ii, this.J0);
        int L = gm.L(8.0f);
        int i = cmb.Ei;
        int v0 = cmb.v0(i, this.J0);
        int i2 = cmb.c6;
        int p = on2.p(cmb.w0(null, i2, false), nm7.E1);
        fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
        wmb M = anb.M(i);
        wmb g = anb.g(i2, nm7.E1);
        ylb ylbVar = this.J0;
        textView.setBackground(i0);
        anb.j(textView, i0, M, g, ylbVar);
        this.b.addView(textView, qoe.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z2 ? 52 : 0) + 12));
        textView.setOnClickListener(new rc1((Object) this, (Object) peer, (byte) 25));
        if (z2) {
            b61 b61Var = new b61(this.J0, context, false);
            b61Var.setColor(cmb.w0(null, cmb.q7, false));
            b61Var.d.x(gm.o());
            b61Var.i(jb6.M0(2131748557, null), false, true);
            b61Var.setOnClickListener(new yo0(this, context, b61Var, j, (byte) 1));
            this.b.addView(b61Var, qoe.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, gm.L((z2 ? 52 : 0) + 72));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        J();
        W0();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = oc7.r1(this.a).i1(j);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.a).sendRequest(getgroupcallstreamrtmpurl, new tg(this, (byte) 16));
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new h92(this, (byte) 15), this.J0);
        this.Z1 = l7cVar;
        return l7cVar;
    }

    @Override // my0
    public final void H() {
        TLRPC.InputPeer inputPeer;
        super.H();
        uv5 uv5Var = this.T1;
        if (uv5Var == null || (inputPeer = this.U1) == null) {
            return;
        }
        uv5Var.a(inputPeer, this.V1, false, true);
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(2131744123, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [my0, mz0, r23] */
    /* JADX WARN: Type inference failed for: r0v4, types: [my0] */
    public r23(Context context, int i, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ts9 ts9Var, r63 r63Var) {
        int i2;
        TLRPC.Chat L0;
        r23 mz0Var = new mz0(context, null, false, false, r63Var);
        mz0Var.S1 = true;
        mz0Var.u1 = 0.126f;
        mz0Var.T1 = null;
        mz0Var.V1 = false;
        long m = pg3.m(getgroupcallstreamrtmpurl.peer);
        boolean z = ts9Var != null && (m >= 0 || ((L0 = oc7.r1(i).L0(Long.valueOf(-m))) != null && L0.creator));
        if (ts9Var != null) {
            mz0Var.a2 = true;
            b61 b61Var = new b61(r63Var, context, true);
            b61Var.i(jb6.M0(2131748559, null), false, true);
            mz0Var.b.addView(b61Var, qoe.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z ? 52 : 0) + 12));
            b61Var.setOnClickListener(new k81(mz0Var, ts9Var, b61Var));
            if (z) {
                b61 b61Var2 = new b61(r63Var, context, false);
                b61Var2.setColor(cmb.w0(null, cmb.q7, false));
                b61Var2.d.x(gm.o());
                b61Var2.i(jb6.M0(2131748557, null), false, true);
                mz0Var = this;
                b61Var2.setOnClickListener(new xh(this, context, r63Var, i, b61Var2, getgroupcallstreamrtmpurl, (byte) 3));
                mz0Var.b.addView(b61Var2, qoe.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        mz0Var.n1.setItemAnimator(sc3Var);
        r59 r59Var = mz0Var.n1;
        int i3 = mz0Var.u0;
        if (mz0Var.a2) {
            i2 = gm.L(z ? 124.0f : 72.0f);
        } else {
            i2 = 0;
        }
        r59Var.setPadding(i3, 0, i3, i2);
        mz0Var.J();
        mz0Var.W0();
        mz0Var.W1 = groupcallstreamrtmpurl.url;
        mz0Var.X1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mz0Var.X1);
        mz0Var.Y1 = spannableStringBuilder;
        wkb wkbVar = new wkb();
        wkbVar.a |= 256;
        wkbVar.b = 0;
        wkbVar.c = spannableStringBuilder.length();
        mz0Var.Y1.setSpan(new xkb(wkbVar, 0), 0, mz0Var.Y1.length(), 0);
        mz0Var.Z1.O(false);
    }
}
