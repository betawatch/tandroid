// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wfb extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final wjb c;
    public final vea d;
    public final pb0 e;
    public final be0 f;
    public final le8 h;
    public final hn n;
    public k27 r;
    public boolean s;
    public boolean w;
    public p8c x;
    public boolean y;

    public wfb(int i, long j, wjb wjbVar, Context context) {
        super(context);
        this.E = -6.0f;
        this.a = i;
        this.b = j;
        this.c = wjbVar;
        setOrientation(1);
        n81 n81Var = new n81((byte) 9, context, this);
        n81Var.U(zi8.d(null, i, j, bkb.I.o()));
        vea veaVar = new vea(context, i);
        this.d = veaVar;
        n81Var.addView(veaVar, nme.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.f = be0Var;
        be0Var.setRoundRadius(gl.L(21.0f));
        n81Var.addView(be0Var, nme.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(n81Var, nme.r(-1, -2, 7));
        le8 le8Var = new le8(context, 0, null, wjbVar);
        this.h = le8Var;
        EditTextBoldCursor textView = le8Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        le8Var.setTextRight(kk7.y1);
        ImageView k = tb4.k(context, R.drawable.menu_delete_old);
        zkb.s(k, bkb.x6, wjbVar, PorterDuff.Mode.SRC_IN);
        le8Var.addView(k, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        ote.a(k);
        k.setOnClickListener(new k(textView, (byte) 1));
        hn hnVar = new hn(context, false, true, false);
        this.n = hnVar;
        hnVar.n = false;
        hnVar.setTypeface(gl.o());
        zkb.U(hnVar, bkb.p7, wjbVar);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setGravity(17);
        hnVar.setAllowCancel(true);
        hnVar.setScaleProperty(0.6f);
        le8Var.addView(hnVar, nme.d(56, 50.0f, kk7.B1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new jf6(this, (byte) 16));
        addView(le8Var, nme.r(-1, -2, 7));
        veaVar.setDelegate(new sk4(this, textView, false, (byte) 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(final Context context, final int i, final long j, final TLRPC.User user, final String str, final boolean z, final boolean z2, boolean z3, final wjb wjbVar) {
        String str2;
        int i2;
        fx0 fx0Var;
        int i3;
        int i4;
        boolean z4;
        fx0 fx0Var2;
        int i5;
        int i6 = i;
        boolean z5 = z2;
        wjb wjbVar2 = wjbVar;
        TLRPC.Chat K0 = na7.q1(i6).K0(Long.valueOf(-j));
        if (K0 == null) {
            return;
        }
        fx0 h = de9.h(1, wjbVar2, context, true);
        LinearLayout j2 = de9.j(context, 1);
        h.O = j2;
        int i7 = z5 ? -6988581 : z ? -12539616 : -6905171;
        be0 be0Var = new be0(context);
        be0Var.setImageResource(R.drawable.large_user_tag);
        be0Var.setBackground(bkb.K(gl.L(80.0f), i7));
        j2.addView(be0Var, nme.t(80, 80, 49, 0, 18, 0, 0));
        int i8 = bkb.F6;
        TextView b = hve.b(context, 20.0f, i8, true, null);
        b.setGravity(17);
        b.setText(k96.M0(z5 ? 2131744036 : z ? 2131744044 : 2131744038, null));
        j2.addView(b, nme.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b2 = hve.b(context, 14.0f, i8, false, null);
        b2.setGravity(17);
        b2.setLineSpacing(gl.L(3.0f), 1.0f);
        if (str == null) {
            if (z5) {
                i5 = 2131752195;
            } else if (z) {
                i5 = 2131752196;
            } else {
                str2 = "";
            }
            str2 = k96.M0(i5, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z5) {
            i2 = -6988581;
        } else {
            if (!z) {
                fx0Var = h;
                spannableStringBuilder.setSpan(new cm4(bkb.de, null), 0, spannableStringBuilder.length(), 33);
                i3 = 2;
                b2.setText(gl.G2(gl.S2(k96.a0(null, null, !z5 ? 2131744037 : z ? 2131744045 : 2131744039, l7c.k(user, true), K0.title)), spannableStringBuilder, "un1"));
                j2.addView(b2, nme.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                j2.addView(linearLayout, nme.t(-1, -2, 7, 16, 0, 16, 16));
                i4 = 0;
                while (i4 < i3) {
                    tfb tfbVar = new tfb(context, i6);
                    tfbVar.setDelegate(new ufb(i4 == 1, z5));
                    vfb vfbVar = new vfb(context, wjbVar2, tfbVar);
                    vfbVar.U(zi8.d(null, i6, j, bkb.I.o()));
                    vfbVar.addView(tfbVar, nme.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
                    linearLayout.addView(vfbVar, nme.q(0, -1, 1.0f, kk7.D1, i4 == 1 ? 6 : 0, 0, i4 == 0 ? 6 : 0, 0));
                    vfbVar.setClipToOutline(true);
                    vfbVar.setOutlineProvider(new qfb());
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.from_id = na7.q1(i6).w1(user.id);
                    tL_message.peer_id = na7.q1(i6).w1(j);
                    tL_message.message = "";
                    tL_message.date = ConnectionsManager.getInstance(i6).getCurrentTime();
                    tL_message.out = false;
                    k27 k27Var = new k27(i6, tL_message, true, false);
                    k27Var.l2 = true;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
                    spannableStringBuilder2.setSpan(new x08(gl.L(200.0f)), 0, 1, 33);
                    i3 = 2;
                    spannableStringBuilder2.setSpan(new x08(gl.L(160.0f)), 2, 3, 33);
                    k27Var.v = spannableStringBuilder2;
                    tfbVar.f6 = true;
                    tfbVar.k6 = hc2.T(K0) && K0.megagroup;
                    k27Var.n0(null);
                    tfbVar.z3(k27Var, null, false, false, false, false);
                    tfbVar.setTranslationX(-gl.L(140.0f));
                    i4++;
                    i6 = i;
                    z5 = z2;
                    wjbVar2 = wjbVar;
                }
                u41 i9 = yjb.i(24, wjbVar, context, true);
                z4 = (!hc2.w(25, K0) && (!z || ((!z2 && z3) || l7c.D(user)))) || (hc2.h(K0) && l7c.D(user));
                if (!z4 && !hc2.w(25, K0) && !K0.creator && K0.admin_rights == null && !z2) {
                    TextView b3 = hve.b(context, 12.0f, bkb.x6, false, null);
                    de9.q(b3, 1, null, 2131752551);
                    j2.addView(b3, nme.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
                }
                j2.addView(i9, nme.t(-1, 48, 7, 16, 16, 16, 16));
                final boolean[] zArr = new boolean[1];
                if (z4) {
                    i9.setText(vqa.k2(k96.M0(2131743649, null)));
                    fx0 fx0Var3 = fx0Var;
                    i9.setOnClickListener(new b99(fx0Var3, zArr, (byte) 27));
                    fx0Var2 = fx0Var3;
                } else {
                    final fx0 fx0Var4 = fx0Var;
                    i9.setText(k96.M0(l7c.D(user) ? TextUtils.isEmpty(str) ? 2131744043 : 2131744041 : TextUtils.isEmpty(str) ? 2131744042 : 2131744040, null));
                    fx0Var2 = fx0Var4;
                    i9.setOnClickListener(new View.OnClickListener() { // from class: pfb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            fx0.this.dismiss();
                            wfb.c(context, i, j, user, str, z, z2, wjbVar);
                            boolean[] zArr2 = zArr;
                            if (zArr2[0]) {
                                return;
                            }
                            na7.c1().edit().putInt("showchattagsinfo", 0).apply();
                            zArr2[0] = true;
                        }
                    });
                }
                fx0Var2.Q0 = true;
                fx0Var2.t0(bkb.c6);
                fx0Var2.n(new il1(zArr, (byte) 7));
                if (na7.c1().getInt("showchattagsinfo", 3) <= 0 || !z4) {
                    fx0Var2.show();
                } else {
                    c(context, i, j, user, str, z, z2, wjbVar);
                    return;
                }
            }
            i2 = -12539616;
        }
        fx0Var = h;
        Paint paint = new Paint(1);
        paint.setColor(bkb.p1(0.1f, i2));
        spannableStringBuilder.setSpan(new sfb(i2, paint, str2), 0, spannableStringBuilder.length(), 33);
        i3 = 2;
        b2.setText(gl.G2(gl.S2(k96.a0(null, null, !z5 ? 2131744037 : z ? 2131744045 : 2131744039, l7c.k(user, true), K0.title)), spannableStringBuilder, "un1"));
        j2.addView(b2, nme.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        j2.addView(linearLayout2, nme.t(-1, -2, 7, 16, 0, 16, 16));
        i4 = 0;
        while (i4 < i3) {
        }
        u41 i92 = yjb.i(24, wjbVar, context, true);
        if (hc2.w(25, K0)) {
        }
        if (!z4) {
            TextView b32 = hve.b(context, 12.0f, bkb.x6, false, null);
            de9.q(b32, 1, null, 2131752551);
            j2.addView(b32, nme.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        j2.addView(i92, nme.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr2 = new boolean[1];
        if (z4) {
        }
        fx0Var2.Q0 = true;
        fx0Var2.t0(bkb.c6);
        fx0Var2.n(new il1(zArr2, (byte) 7));
        if (na7.c1().getInt("showchattagsinfo", 3) <= 0) {
        }
        fx0Var2.show();
    }

    public static void c(Context context, int i, long j, TLRPC.User user, String str, final boolean z, boolean z2, wjb wjbVar) {
        na7 q1 = na7.q1(i);
        q1.K0(Long.valueOf(-j));
        fx0 h = de9.h(1, wjbVar, context, true);
        LinearLayout j2 = de9.j(context, 1);
        h.O = j2;
        LinearLayout linearLayout = new LinearLayout(context);
        int i2 = bkb.F6;
        TextView b = hve.b(context, 20.0f, i2, true, null);
        b.setText(k96.M0(2131748435, null));
        linearLayout.addView(b, nme.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, gl.L(18.0f));
        vkb M = zkb.M(i3);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        linearLayout.addView(imageView, nme.t(32, 32, 21, 0, 0, 10, 0));
        j2.addView(linearLayout, nme.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final u41 i4 = yjb.i(24, wjbVar, context, true);
        boolean z3 = !TextUtils.isEmpty(str) || z;
        i4.setText(k96.M0((TextUtils.isEmpty(str) && !z && z3) ? 2131748440 : z3 ? 2131748441 : 2131748442, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z4 = z3;
        wfb wfbVar = new wfb(i, j, wjbVar, context);
        wfbVar.setClipToOutline(true);
        wfbVar.setOutlineProvider(new rfb());
        zkb.h(bkb.c6, wjbVar, wfbVar);
        wfbVar.a(user, str, z, z2, new p8c() { // from class: nfb
            @Override // p8c
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z5 = z4;
                i4.i(k96.M0((isEmpty && !z && z5) ? 2131748440 : z5 ? 2131748441 : 2131748442, null), true, true);
            }
        });
        j2.addView(wfbVar, nme.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        mhb mhbVar = new mhb(22, wjbVar, context);
        mhbVar.setText(l7c.D(user) ? k96.M0(2131748437, null) : k96.a0(null, null, 2131748436, l7c.r(user)));
        j2.addView(mhbVar, nme.t(-1, -2, 7, 0, 0, 0, 0));
        j2.addView(i4, nme.t(-1, 48, 7, 14, 19, 14, 12));
        h.Q0 = true;
        h.t0(bkb.Z6);
        i4.setOnClickListener(new wf1(i4, wfbVar, q1, j, user, strArr, i, h, (!TextUtils.isEmpty(str) || z || z2) ? false : true, wjbVar));
        imageView.setOnClickListener(new dh(h, (byte) 6));
        h.show();
        EditTextBoldCursor textView = wfbVar.h.getTextView();
        textView.post(new l(textView, (byte) 11));
    }

    public final void a(TLRPC.User user, String str, boolean z, boolean z2, p8c p8cVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i = this.a;
        tL_message.from_id = na7.q1(i).w1(user.id);
        na7 q1 = na7.q1(i);
        long j = this.b;
        tL_message.peer_id = q1.w1(j);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_message.out = false;
        this.s = z;
        this.w = z2;
        k27 k27Var = new k27(i, tL_message, true, false);
        this.r = k27Var;
        k27Var.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = gl.q;
        spannableStringBuilder.setSpan(new x08((int) Math.min(point.x * 0.5f, gl.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new x08((int) Math.min(point.x * 0.44f, gl.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        boolean z3 = K0 != null;
        vea veaVar = this.d;
        veaVar.f6 = z3;
        veaVar.k6 = hc2.T(K0) && K0.megagroup;
        this.r.n0(null);
        veaVar.z3(this.r, null, false, false, false, false);
        pb0 pb0Var = this.e;
        pb0Var.q(user);
        this.f.f(user, pb0Var);
        this.x = p8cVar;
        this.y = true;
        this.h.o(str, k96.M0((!TextUtils.isEmpty(str) || z) ? 2131748438 : 2131748439, null), false);
        this.y = false;
    }
}
