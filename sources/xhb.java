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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xhb extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final ylb c;
    public final vga d;
    public final pc0 e;
    public final bf0 f;
    public final ng8 h;
    public final io n;
    public k47 r;
    public boolean s;
    public boolean w;
    public qac x;
    public boolean y;

    public xhb(int i, long j, ylb ylbVar, Context context) {
        super(context);
        this.E = -6.0f;
        this.a = i;
        this.b = j;
        this.c = ylbVar;
        setOrientation(1);
        w91 w91Var = new w91((byte) 9, context, this);
        w91Var.U(cl8.d(null, i, j, cmb.I.o()));
        vga vgaVar = new vga(context, i);
        this.d = vgaVar;
        w91Var.addView(vgaVar, qoe.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.f = bf0Var;
        bf0Var.setRoundRadius(gm.L(21.0f));
        w91Var.addView(bf0Var, qoe.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w91Var, qoe.r(-1, -2, 7));
        ng8 ng8Var = new ng8(context, 0, null, ylbVar);
        this.h = ng8Var;
        EditTextBoldCursor textView = ng8Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        ng8Var.setTextRight(nm7.y1);
        ImageView k = td4.k(context, R.drawable.menu_delete_old);
        anb.s(k, cmb.x6, ylbVar, PorterDuff.Mode.SRC_IN);
        ng8Var.addView(k, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        rve.a(k);
        k.setOnClickListener(new k(textView, (byte) 1));
        io ioVar = new io(context, false, true, false);
        this.n = ioVar;
        ioVar.n = false;
        ioVar.setTypeface(gm.o());
        anb.U(ioVar, cmb.p7, ylbVar);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setGravity(17);
        ioVar.setAllowCancel(true);
        ioVar.setScaleProperty(0.6f);
        ng8Var.addView(ioVar, qoe.d(56, 50.0f, nm7.B1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new og6(this, (byte) 17));
        addView(ng8Var, qoe.r(-1, -2, 7));
        vgaVar.setDelegate(new rhb(this, textView, (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(final Context context, final int i, final long j, final TLRPC.User user, final String str, final boolean z, final boolean z2, boolean z3, final ylb ylbVar) {
        String str2;
        int i2;
        my0 my0Var;
        int i3;
        int i4;
        boolean z4;
        my0 my0Var2;
        int i5;
        int i6 = i;
        boolean z5 = z2;
        ylb ylbVar2 = ylbVar;
        TLRPC.Chat L0 = oc7.r1(i6).L0(Long.valueOf(-j));
        if (L0 == null) {
            return;
        }
        my0 h = hg9.h(1, ylbVar2, context, true);
        LinearLayout i7 = hg9.i(context, 1);
        h.O = i7;
        int i8 = z5 ? -6988581 : z ? -12539616 : -6905171;
        bf0 bf0Var = new bf0(context);
        bf0Var.setImageResource(R.drawable.large_user_tag);
        bf0Var.setBackground(cmb.K(gm.L(80.0f), i8));
        i7.addView(bf0Var, qoe.t(80, 80, 49, 0, 18, 0, 0));
        int i9 = cmb.F6;
        TextView b = jxe.b(context, 20.0f, i9, true, null);
        b.setGravity(17);
        b.setText(jb6.M0(z5 ? 2131743962 : z ? 2131743970 : 2131743964, null));
        i7.addView(b, qoe.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b2 = jxe.b(context, 14.0f, i9, false, null);
        b2.setGravity(17);
        b2.setLineSpacing(gm.L(3.0f), 1.0f);
        if (str == null) {
            if (z5) {
                i5 = 2131752144;
            } else if (z) {
                i5 = 2131752145;
            } else {
                str2 = "";
            }
            str2 = jb6.M0(i5, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z5) {
            i2 = -6988581;
        } else {
            if (!z) {
                my0Var = h;
                spannableStringBuilder.setSpan(new do4(cmb.de, null), 0, spannableStringBuilder.length(), 33);
                i3 = 2;
                b2.setText(gm.G2(gm.S2(jb6.a0(null, null, !z5 ? 2131743963 : z ? 2131743971 : 2131743965, m9c.k(user, true), L0.title)), spannableStringBuilder, "un1"));
                i7.addView(b2, qoe.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                i7.addView(linearLayout, qoe.t(-1, -2, 7, 16, 0, 16, 16));
                i4 = 0;
                while (i4 < i3) {
                    uhb uhbVar = new uhb(context, i6);
                    uhbVar.setDelegate(new vhb(i4 == 1, z5));
                    whb whbVar = new whb(context, ylbVar2, uhbVar);
                    whbVar.U(cl8.d(null, i6, j, cmb.I.o()));
                    whbVar.addView(uhbVar, qoe.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
                    linearLayout.addView(whbVar, qoe.q(0, -1, 1.0f, nm7.D1, i4 == 1 ? 6 : 0, 0, i4 == 0 ? 6 : 0, 0));
                    whbVar.setClipToOutline(true);
                    whbVar.setOutlineProvider(new qhb());
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.from_id = oc7.r1(i6).x1(user.id);
                    tL_message.peer_id = oc7.r1(i6).x1(j);
                    tL_message.message = "";
                    tL_message.date = ConnectionsManager.getInstance(i6).getCurrentTime();
                    tL_message.out = false;
                    k47 k47Var = new k47(i6, tL_message, true, false);
                    k47Var.l2 = true;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
                    spannableStringBuilder2.setSpan(new a38(gm.L(200.0f)), 0, 1, 33);
                    i3 = 2;
                    spannableStringBuilder2.setSpan(new a38(gm.L(160.0f)), 2, 3, 33);
                    k47Var.v = spannableStringBuilder2;
                    uhbVar.f6 = true;
                    uhbVar.k6 = sd2.T(L0) && L0.megagroup;
                    k47Var.n0(null);
                    uhbVar.z3(k47Var, null, false, false, false, false);
                    uhbVar.setTranslationX(-gm.L(140.0f));
                    i4++;
                    i6 = i;
                    z5 = z2;
                    ylbVar2 = ylbVar;
                }
                b61 i10 = mlb.i(24, ylbVar, context, true);
                z4 = (!sd2.w(25, L0) && (!z || ((!z2 && z3) || m9c.D(user)))) || (sd2.h(L0) && m9c.D(user));
                if (!z4 && !sd2.w(25, L0) && !L0.creator && L0.admin_rights == null && !z2) {
                    TextView b3 = jxe.b(context, 12.0f, cmb.x6, false, null);
                    hg9.p(b3, 1, null, 2131752516);
                    i7.addView(b3, qoe.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
                }
                i7.addView(i10, qoe.t(-1, 48, 7, 16, 16, 16, 16));
                final boolean[] zArr = new boolean[1];
                if (z4) {
                    i10.setText(wsa.k2(jb6.M0(2131743575, null)));
                    my0 my0Var3 = my0Var;
                    i10.setOnClickListener(new r39(my0Var3, zArr, (byte) 28));
                    my0Var2 = my0Var3;
                } else {
                    final my0 my0Var4 = my0Var;
                    i10.setText(jb6.M0(m9c.D(user) ? TextUtils.isEmpty(str) ? 2131743969 : 2131743967 : TextUtils.isEmpty(str) ? 2131743968 : 2131743966, null));
                    my0Var2 = my0Var4;
                    i10.setOnClickListener(new View.OnClickListener() { // from class: phb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            my0.this.dismiss();
                            xhb.c(context, i, j, user, str, z, z2, ylbVar);
                            boolean[] zArr2 = zArr;
                            if (zArr2[0]) {
                                return;
                            }
                            oc7.d1().edit().putInt("showchattagsinfo", 0).apply();
                            zArr2[0] = true;
                        }
                    });
                }
                my0Var2.Q0 = true;
                my0Var2.t0(cmb.c6);
                my0Var2.n(new rm1(zArr, (byte) 7));
                if (oc7.d1().getInt("showchattagsinfo", 3) <= 0 || !z4) {
                    my0Var2.show();
                } else {
                    c(context, i, j, user, str, z, z2, ylbVar);
                    return;
                }
            }
            i2 = -12539616;
        }
        my0Var = h;
        Paint paint = new Paint(1);
        paint.setColor(cmb.p1(0.1f, i2));
        spannableStringBuilder.setSpan(new thb(i2, paint, str2), 0, spannableStringBuilder.length(), 33);
        i3 = 2;
        b2.setText(gm.G2(gm.S2(jb6.a0(null, null, !z5 ? 2131743963 : z ? 2131743971 : 2131743965, m9c.k(user, true), L0.title)), spannableStringBuilder, "un1"));
        i7.addView(b2, qoe.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        i7.addView(linearLayout2, qoe.t(-1, -2, 7, 16, 0, 16, 16));
        i4 = 0;
        while (i4 < i3) {
        }
        b61 i102 = mlb.i(24, ylbVar, context, true);
        if (sd2.w(25, L0)) {
        }
        if (!z4) {
            TextView b32 = jxe.b(context, 12.0f, cmb.x6, false, null);
            hg9.p(b32, 1, null, 2131752516);
            i7.addView(b32, qoe.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        i7.addView(i102, qoe.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr2 = new boolean[1];
        if (z4) {
        }
        my0Var2.Q0 = true;
        my0Var2.t0(cmb.c6);
        my0Var2.n(new rm1(zArr2, (byte) 7));
        if (oc7.d1().getInt("showchattagsinfo", 3) <= 0) {
        }
        my0Var2.show();
    }

    public static void c(Context context, int i, long j, TLRPC.User user, String str, final boolean z, boolean z2, ylb ylbVar) {
        oc7 r1 = oc7.r1(i);
        r1.L0(Long.valueOf(-j));
        my0 h = hg9.h(1, ylbVar, context, true);
        LinearLayout i2 = hg9.i(context, 1);
        h.O = i2;
        LinearLayout linearLayout = new LinearLayout(context);
        int i3 = cmb.F6;
        TextView b = jxe.b(context, 20.0f, i3, true, null);
        b.setText(jb6.M0(2131748384, null));
        linearLayout.addView(b, qoe.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        anb.s(imageView, i3, ylbVar, PorterDuff.Mode.SRC_IN);
        int i4 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i4, ylbVar), 1, gm.L(18.0f));
        wmb M = anb.M(i4);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        linearLayout.addView(imageView, qoe.t(32, 32, 21, 0, 0, 10, 0));
        i2.addView(linearLayout, qoe.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final b61 i5 = mlb.i(24, ylbVar, context, true);
        boolean z3 = !TextUtils.isEmpty(str) || z;
        i5.setText(jb6.M0((TextUtils.isEmpty(str) && !z && z3) ? 2131748389 : z3 ? 2131748390 : 2131748391, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z4 = z3;
        xhb xhbVar = new xhb(i, j, ylbVar, context);
        xhbVar.setClipToOutline(true);
        xhbVar.setOutlineProvider(new shb());
        anb.h(cmb.c6, ylbVar, xhbVar);
        xhbVar.a(user, str, z, z2, new qac() { // from class: nhb
            @Override // qac
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z5 = z4;
                i5.i(jb6.M0((isEmpty && !z && z5) ? 2131748389 : z5 ? 2131748390 : 2131748391, null), true, true);
            }
        });
        i2.addView(xhbVar, qoe.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        njb njbVar = new njb(22, ylbVar, context);
        njbVar.setText(m9c.D(user) ? jb6.M0(2131748386, null) : jb6.a0(null, null, 2131748385, m9c.r(user)));
        i2.addView(njbVar, qoe.t(-1, -2, 7, 0, 0, 0, 0));
        i2.addView(i5, qoe.t(-1, 48, 7, 14, 19, 14, 12));
        h.Q0 = true;
        h.t0(cmb.Z6);
        i5.setOnClickListener(new eh1(i5, xhbVar, r1, j, user, strArr, i, h, (!TextUtils.isEmpty(str) || z || z2) ? false : true, ylbVar));
        imageView.setOnClickListener(new di(h, (byte) 6));
        h.show();
        EditTextBoldCursor textView = xhbVar.h.getTextView();
        textView.post(new l(textView, (byte) 11));
    }

    public final void a(TLRPC.User user, String str, boolean z, boolean z2, qac qacVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i = this.a;
        tL_message.from_id = oc7.r1(i).x1(user.id);
        oc7 r1 = oc7.r1(i);
        long j = this.b;
        tL_message.peer_id = r1.x1(j);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_message.out = false;
        this.s = z;
        this.w = z2;
        k47 k47Var = new k47(i, tL_message, true, false);
        this.r = k47Var;
        k47Var.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = gm.q;
        spannableStringBuilder.setSpan(new a38((int) Math.min(point.x * 0.5f, gm.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new a38((int) Math.min(point.x * 0.44f, gm.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        boolean z3 = L0 != null;
        vga vgaVar = this.d;
        vgaVar.f6 = z3;
        vgaVar.k6 = sd2.T(L0) && L0.megagroup;
        this.r.n0(null);
        vgaVar.z3(this.r, null, false, false, false, false);
        pc0 pc0Var = this.e;
        pc0Var.q(user);
        this.f.f(user, pc0Var);
        this.x = qacVar;
        this.y = true;
        this.h.o(str, jb6.M0((!TextUtils.isEmpty(str) || z) ? 2131748387 : 2131748388, null), false);
        this.y = false;
    }
}
