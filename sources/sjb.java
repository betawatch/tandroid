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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sjb extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final vnb c;
    public final mia d;
    public final rb0 e;
    public final de0 f;
    public final zh8 h;
    public final in n;
    public r47 r;
    public boolean s;
    public boolean w;
    public pcc x;
    public boolean y;

    public sjb(int i, long j, vnb vnbVar, Context context) {
        super(context);
        this.E = -6.0f;
        this.a = i;
        this.b = j;
        this.c = vnbVar;
        setOrientation(1);
        w81 w81Var = new w81((byte) 9, context, this);
        w81Var.U(mm8.d(null, i, j, aob.I.o()));
        mia miaVar = new mia(context, i);
        this.d = miaVar;
        w81Var.addView(miaVar, tre.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.f = de0Var;
        de0Var.setRoundRadius(hl.L(21.0f));
        w81Var.addView(de0Var, tre.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w81Var, tre.r(-1, -2, 7));
        zh8 zh8Var = new zh8(context, 0, null, vnbVar);
        this.h = zh8Var;
        EditTextBoldCursor textView = zh8Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        zh8Var.setTextRight(jn7.y1);
        ImageView k = qd4.k(context, R.drawable.menu_delete_old);
        yob.s(k, aob.y6, vnbVar, PorterDuff.Mode.SRC_IN);
        zh8Var.addView(k, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        iye.a(k);
        k.setOnClickListener(new k(textView, (byte) 1));
        in inVar = new in(context, false, true, false);
        this.n = inVar;
        inVar.n = false;
        inVar.setTypeface(hl.o());
        yob.U(inVar, aob.q7, vnbVar);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setGravity(17);
        inVar.setAllowCancel(true);
        inVar.setScaleProperty(0.6f);
        zh8Var.addView(inVar, tre.d(56, 50.0f, jn7.B1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new nh6(this, (byte) 17));
        addView(zh8Var, tre.r(-1, -2, 7));
        miaVar.setDelegate(new ym4(this, textView, false, (byte) 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(final Context context, final int i, final long j, final TLRPC.User user, final String str, final boolean z, final boolean z2, boolean z3, final vnb vnbVar) {
        String str2;
        int i2;
        nx0 nx0Var;
        int i3;
        int i4;
        boolean z4;
        nx0 nx0Var2;
        int i5;
        int i6 = i;
        boolean z5 = z2;
        vnb vnbVar2 = vnbVar;
        TLRPC.Chat M0 = uc7.s1(i6).M0(Long.valueOf(-j));
        if (M0 == null) {
            return;
        }
        nx0 h = uh9.h(1, vnbVar2, context, true);
        LinearLayout j2 = uh9.j(context, 1);
        h.O = j2;
        int i7 = z5 ? -6988581 : z ? -12539616 : -6905171;
        de0 de0Var = new de0(context);
        de0Var.setImageResource(R.drawable.large_user_tag);
        de0Var.setBackground(aob.K(hl.L(80.0f), i7));
        j2.addView(de0Var, tre.t(80, 80, 49, 0, 18, 0, 0));
        int i8 = aob.G6;
        TextView b = zze.b(context, 20.0f, i8, true, null);
        b.setGravity(17);
        b.setText(ob6.M0(z5 ? 2131743930 : z ? 2131743938 : 2131743932, null));
        j2.addView(b, tre.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b2 = zze.b(context, 14.0f, i8, false, null);
        b2.setGravity(17);
        b2.setLineSpacing(hl.L(3.0f), 1.0f);
        if (str == null) {
            if (z5) {
                i5 = 2131752172;
            } else if (z) {
                i5 = 2131752173;
            } else {
                str2 = "";
            }
            str2 = ob6.M0(i5, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z5) {
            i2 = -6988581;
        } else {
            if (!z) {
                nx0Var = h;
                spannableStringBuilder.setSpan(new ho4(aob.ee, null), 0, spannableStringBuilder.length(), 33);
                i3 = 2;
                b2.setText(hl.G2(hl.S2(ob6.a0(null, null, !z5 ? 2131743931 : z ? 2131743939 : 2131743933, lbc.k(user, true), M0.title)), spannableStringBuilder, "un1"));
                j2.addView(b2, tre.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                j2.addView(linearLayout, tre.t(-1, -2, 7, 16, 0, 16, 16));
                i4 = 0;
                while (i4 < i3) {
                    pjb pjbVar = new pjb(context, i6);
                    pjbVar.setDelegate(new qjb(i4 == 1, z5));
                    rjb rjbVar = new rjb(context, vnbVar2, pjbVar);
                    rjbVar.U(mm8.d(null, i6, j, aob.I.o()));
                    rjbVar.addView(pjbVar, tre.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
                    linearLayout.addView(rjbVar, tre.q(0, -1, 1.0f, jn7.D1, i4 == 1 ? 6 : 0, 0, i4 == 0 ? 6 : 0, 0));
                    rjbVar.setClipToOutline(true);
                    rjbVar.setOutlineProvider(new mjb());
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.from_id = uc7.s1(i6).y1(user.id);
                    tL_message.peer_id = uc7.s1(i6).y1(j);
                    tL_message.message = "";
                    tL_message.date = ConnectionsManager.getInstance(i6).getCurrentTime();
                    tL_message.out = false;
                    r47 r47Var = new r47(i6, tL_message, true, false);
                    r47Var.l2 = true;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
                    spannableStringBuilder2.setSpan(new e48(hl.L(200.0f)), 0, 1, 33);
                    i3 = 2;
                    spannableStringBuilder2.setSpan(new e48(hl.L(160.0f)), 2, 3, 33);
                    r47Var.v = spannableStringBuilder2;
                    pjbVar.f6 = true;
                    pjbVar.k6 = xc2.T(M0) && M0.megagroup;
                    r47Var.n0(null);
                    pjbVar.z3(r47Var, null, false, false, false, false);
                    pjbVar.setTranslationX(-hl.L(140.0f));
                    i4++;
                    i6 = i;
                    z5 = z2;
                    vnbVar2 = vnbVar;
                }
                c51 i9 = xnb.i(24, vnbVar, context, true);
                z4 = (!xc2.w(25, M0) && (!z || ((!z2 && z3) || lbc.D(user)))) || (xc2.h(M0) && lbc.D(user));
                if (!z4 && !xc2.w(25, M0) && !M0.creator && M0.admin_rights == null && !z2) {
                    TextView b3 = zze.b(context, 12.0f, aob.y6, false, null);
                    uh9.q(b3, 1, null, 2131752544);
                    j2.addView(b3, tre.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
                }
                j2.addView(i9, tre.t(-1, 48, 7, 16, 16, 16, 16));
                final boolean[] zArr = new boolean[1];
                if (z4) {
                    i9.setText(wua.l2(ob6.M0(2131743543, null)));
                    nx0 nx0Var3 = nx0Var;
                    i9.setOnClickListener(new jjb((Object) nx0Var3, (Object) zArr, (byte) 0));
                    nx0Var2 = nx0Var3;
                } else {
                    final nx0 nx0Var4 = nx0Var;
                    i9.setText(ob6.M0(lbc.D(user) ? TextUtils.isEmpty(str) ? 2131743937 : 2131743935 : TextUtils.isEmpty(str) ? 2131743936 : 2131743934, null));
                    nx0Var2 = nx0Var4;
                    i9.setOnClickListener(new View.OnClickListener() { // from class: kjb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            nx0.this.dismiss();
                            sjb.c(context, i, j, user, str, z, z2, vnbVar);
                            boolean[] zArr2 = zArr;
                            if (zArr2[0]) {
                                return;
                            }
                            uc7.e1().edit().putInt("showchattagsinfo", 0).apply();
                            zArr2[0] = true;
                        }
                    });
                }
                nx0Var2.Q0 = true;
                nx0Var2.t0(aob.d6);
                nx0Var2.n(new om1(zArr, (byte) 7));
                if (uc7.e1().getInt("showchattagsinfo", 3) <= 0 || !z4) {
                    nx0Var2.show();
                } else {
                    c(context, i, j, user, str, z, z2, vnbVar);
                    return;
                }
            }
            i2 = -12539616;
        }
        nx0Var = h;
        Paint paint = new Paint(1);
        paint.setColor(aob.p1(0.1f, i2));
        spannableStringBuilder.setSpan(new ojb(i2, paint, str2), 0, spannableStringBuilder.length(), 33);
        i3 = 2;
        b2.setText(hl.G2(hl.S2(ob6.a0(null, null, !z5 ? 2131743931 : z ? 2131743939 : 2131743933, lbc.k(user, true), M0.title)), spannableStringBuilder, "un1"));
        j2.addView(b2, tre.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        j2.addView(linearLayout2, tre.t(-1, -2, 7, 16, 0, 16, 16));
        i4 = 0;
        while (i4 < i3) {
        }
        c51 i92 = xnb.i(24, vnbVar, context, true);
        if (xc2.w(25, M0)) {
        }
        if (!z4) {
            TextView b32 = zze.b(context, 12.0f, aob.y6, false, null);
            uh9.q(b32, 1, null, 2131752544);
            j2.addView(b32, tre.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        j2.addView(i92, tre.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr2 = new boolean[1];
        if (z4) {
        }
        nx0Var2.Q0 = true;
        nx0Var2.t0(aob.d6);
        nx0Var2.n(new om1(zArr2, (byte) 7));
        if (uc7.e1().getInt("showchattagsinfo", 3) <= 0) {
        }
        nx0Var2.show();
    }

    public static void c(Context context, int i, long j, TLRPC.User user, String str, final boolean z, boolean z2, vnb vnbVar) {
        uc7 s1 = uc7.s1(i);
        s1.M0(Long.valueOf(-j));
        nx0 h = uh9.h(1, vnbVar, context, true);
        LinearLayout j2 = uh9.j(context, 1);
        h.O = j2;
        LinearLayout linearLayout = new LinearLayout(context);
        int i2 = aob.G6;
        TextView b = zze.b(context, 20.0f, i2, true, null);
        b.setText(ob6.M0(2131748381, null));
        linearLayout.addView(b, tre.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.SRC_IN);
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, hl.L(18.0f));
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        linearLayout.addView(imageView, tre.t(32, 32, 21, 0, 0, 10, 0));
        j2.addView(linearLayout, tre.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final c51 i4 = xnb.i(24, vnbVar, context, true);
        boolean z3 = !TextUtils.isEmpty(str) || z;
        i4.setText(ob6.M0((TextUtils.isEmpty(str) && !z && z3) ? 2131748386 : z3 ? 2131748387 : 2131748388, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z4 = z3;
        sjb sjbVar = new sjb(i, j, vnbVar, context);
        sjbVar.setClipToOutline(true);
        sjbVar.setOutlineProvider(new njb());
        yob.h(aob.d6, vnbVar, sjbVar);
        sjbVar.a(user, str, z, z2, new pcc() { // from class: ijb
            @Override // pcc
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z5 = z4;
                i4.i(ob6.M0((isEmpty && !z && z5) ? 2131748386 : z5 ? 2131748387 : 2131748388, null), true, true);
            }
        });
        j2.addView(sjbVar, tre.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        ilb ilbVar = new ilb(22, vnbVar, context);
        ilbVar.setText(lbc.D(user) ? ob6.M0(2131748383, null) : ob6.a0(null, null, 2131748382, lbc.r(user)));
        j2.addView(ilbVar, tre.t(-1, -2, 7, 0, 0, 0, 0));
        j2.addView(i4, tre.t(-1, 48, 7, 14, 19, 14, 12));
        h.Q0 = true;
        h.t0(aob.a7);
        i4.setOnClickListener(new zf1(i4, sjbVar, s1, j, user, strArr, i, h, (!TextUtils.isEmpty(str) || z || z2) ? false : true, vnbVar));
        imageView.setOnClickListener(new rg(h, (byte) 6));
        h.show();
        EditTextBoldCursor textView = sjbVar.h.getTextView();
        textView.post(new l(textView, (byte) 11));
    }

    public final void a(TLRPC.User user, String str, boolean z, boolean z2, pcc pccVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i = this.a;
        tL_message.from_id = uc7.s1(i).y1(user.id);
        uc7 s1 = uc7.s1(i);
        long j = this.b;
        tL_message.peer_id = s1.y1(j);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_message.out = false;
        this.s = z;
        this.w = z2;
        r47 r47Var = new r47(i, tL_message, true, false);
        this.r = r47Var;
        r47Var.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = hl.q;
        spannableStringBuilder.setSpan(new e48((int) Math.min(point.x * 0.5f, hl.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new e48((int) Math.min(point.x * 0.44f, hl.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
        boolean z3 = M0 != null;
        mia miaVar = this.d;
        miaVar.f6 = z3;
        miaVar.k6 = xc2.T(M0) && M0.megagroup;
        this.r.n0(null);
        miaVar.z3(this.r, null, false, false, false, false);
        rb0 rb0Var = this.e;
        rb0Var.q(user);
        this.f.f(user, rb0Var);
        this.x = pccVar;
        this.y = true;
        this.h.o(str, ob6.M0((!TextUtils.isEmpty(str) || z) ? 2131748384 : 2131748385, null), false);
        this.y = false;
    }
}
