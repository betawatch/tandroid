// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class pv4 extends q59 {
    public final ylb c;
    public boolean d;
    public d e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public dy0 n;

    public pv4(ylb ylbVar) {
        this.c = ylbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // y59
    public final int b() {
        return 5;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 5 : 4;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        boolean z;
        String G;
        mgb mgbVar;
        int i2 = u69Var.f;
        View view = u69Var.a;
        final byte b = 0;
        if (i2 == 0) {
            if5 if5Var = (if5) view;
            if (this.d) {
                if5Var.c.setText(jb6.a0("BoostingGiftLink", null, 2131753465, new Object[0]));
                if5Var.d.setText(gm.S2(jb6.a0("BoostingLinkAllows", null, 2131753308, new Object[0])));
            } else {
                if5Var.c.setText(jb6.a0("BoostingUsedGiftLink", null, 2131753138, new Object[0]));
                if5Var.d.setText(gm.S2(jb6.a0("BoostingLinkUsed", null, 2131753304, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j = tL_payments_checkedGiftCode.to_id;
                final sk3 sk3Var = new sk3(this, (byte) 11);
                if5Var.c.setText(jb6.a0("BoostingGiftLink", null, 2131753465, new Object[0]));
                SpannableStringBuilder S2 = gm.S2(jb6.M0(2131753306, null));
                final TLRPC.User W1 = oc7.r1(z8c.t0).W1(Long.valueOf(j));
                final byte b2 = 0;
                if5Var.d.setText(gm.G2(S2, gm.N2("**" + m9c.r(W1) + "**", cmb.Wc, 2, new Runnable() { // from class: ef5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.User user = W1;
                        sk3 sk3Var2 = sk3Var;
                        switch (b3) {
                            case 0:
                                sk3Var2.a(user);
                                break;
                            default:
                                sk3Var2.a(user);
                                break;
                        }
                    }
                }, if5Var.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                if5Var.c.setText(jb6.a0("BoostingGiftLink", null, 2131753465, new Object[0]));
                if5Var.d.setText(gm.S2(jb6.a0("BoostingLinkAllowsAnyone", null, 2131753307, new Object[0])));
                return;
            }
            return;
        }
        byte b3 = 1;
        if (i2 == 1) {
            h56 h56Var = (h56) view;
            h56Var.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                h56Var.a(new mv4(this, (byte) 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                h56Var.a(new mv4(this, (byte) 0));
                return;
            }
            return;
        }
        if (i2 != 2) {
            byte b4 = 17;
            if (i2 != 3) {
                if (i2 == 4) {
                    n8 n8Var = (n8) view;
                    n8Var.setOkStyle(this.d);
                    n8Var.setOnClickListener(new tf3(this, n8Var, b4));
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                    if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                        n8Var.e = false;
                        b61 b61Var = n8Var.a;
                        b61Var.setShowZero(false);
                        b61Var.setEnabled(true);
                        b61Var.i(jb6.a0("Close", null, 2131751978, new Object[0]), false, true);
                        n8Var.setOnClickListener(new sf3(this, (byte) 24));
                        return;
                    }
                    return;
                }
                return;
            }
            mjb mjbVar = (mjb) view;
            mjbVar.setTextGravity(17);
            anb.X(mjbVar.getTextView(), cmb.F6, null);
            mjbVar.setTopPadding(14);
            mjbVar.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    mjbVar.setText(gm.N2(tL_payments_checkedGiftCode3.to_id == -1 ? jb6.M0(2131753236, null) : jb6.M0(2131753235, null), cmb.Wc, 0, new mv4(this, b3), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    mjbVar.setText(jb6.a0("BoostingUsedLinkDate", null, 2131753137, jb6.a0("formatDateAtTime", null, 2131742446, jb6.D0().B0().format(date), jb6.D0().o0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                mjbVar.setText(jb6.M0(2131753305, null));
                return;
            } else {
                mjbVar.setFixedSize(14);
                mjbVar.setText(null);
                return;
            }
        }
        mgb mgbVar2 = (mgb) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final sk3 sk3Var2 = new sk3(this, (byte) 11);
        bf0 bf0Var = mgbVar2.h;
        FrameLayout frameLayout = mgbVar2.x;
        bf0 bf0Var2 = mgbVar2.f;
        TextView textView = mgbVar2.a;
        TextView textView2 = mgbVar2.b;
        ylb ylbVar = mgbVar2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        mgbVar2.e.setText(jb6.a0("formatDateAtTime", null, 2131742446, jb6.D0().B0().format(date2), jb6.D0().o0().format(date2)));
        TextView textView3 = mgbVar2.d;
        anb.X(textView3, tL_payments_checkedGiftCode4.via_giveaway ? cmb.l5 : cmb.i5, ylbVar);
        TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-pg3.n(tL_payments_checkedGiftCode4.from_id)));
        boolean V = sd2.V(L0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) jb6.M0(2131753457, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(gm.N2(spannableStringBuilder.toString(), cmb.Wc, 0, new Runnable() { // from class: igb
                @Override // java.lang.Runnable
                public final void run() {
                    byte b5 = b;
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode5 = tL_payments_checkedGiftCode4;
                    sk3 sk3Var3 = sk3Var2;
                    switch (b5) {
                        case 0:
                            sk3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                        default:
                            sk3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                    }
                }
            }, ylbVar));
            textView3.setOnClickListener(new r39(sk3Var2, tL_payments_checkedGiftCode4, (byte) 25));
        } else {
            textView3.setText(jb6.M0(V ? 2131753130 : 2131753129, null));
            textView3.setOnClickListener(null);
        }
        int i3 = tL_payments_checkedGiftCode4.months;
        if (i3 == 12) {
            z = false;
            G = jb6.G(1, "Years", new Object[0]);
        } else {
            z = false;
            G = jb6.G(i3, "Months", new Object[0]);
        }
        TextView textView4 = mgbVar2.c;
        boolean z2 = z;
        Object[] objArr = new Object[1];
        objArr[z2 ? 1 : 0] = G;
        textView4.setText(jb6.a0("BoostingTelegramPremiumFor", null, 2131753145, objArr));
        if (L0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) L0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(gw3.m(gm.N2(spannableStringBuilder2.toString(), cmb.Wc, 0, new b7b(sk3Var2, L0, (byte) 7), ylbVar), textView.getPaint().getFontMetricsInt(), false, null, 0));
            bf0Var2.f(L0, new pc0(L0));
            frameLayout.setOnClickListener(new r39(sk3Var2, L0, (byte) 26));
        } else {
            final TLRPC.User W12 = oc7.r1(z8c.t0).W1(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final byte b5 = 0;
            textView.setText(gw3.m(m9c.k(W12, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            bf0Var2.f(W12, new pc0(0, W12));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: jgb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b6 = b5;
                    TLRPC.User user = W12;
                    sk3 sk3Var3 = sk3Var2;
                    switch (b6) {
                        case 0:
                            sk3Var3.a(user);
                            break;
                        default:
                            sk3Var3.a(user);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) jb6.M0(2131753310, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final byte b6 = 1;
            textView3.setText(gm.N2(spannableStringBuilder3.toString(), cmb.Wc, 0, new Runnable() { // from class: igb
                @Override // java.lang.Runnable
                public final void run() {
                    byte b52 = b6;
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode5 = tL_payments_checkedGiftCode4;
                    sk3 sk3Var3 = sk3Var2;
                    switch (b52) {
                        case 0:
                            sk3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                        default:
                            sk3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                    }
                }
            }, ylbVar));
            textView2.setText(jb6.M0(2131753300, null));
            anb.X(textView2, cmb.i5, ylbVar);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            bf0Var.setVisibility(8);
        } else {
            final TLRPC.User W13 = oc7.r1(z8c.t0).W1(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (W13 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final byte b7 = 1;
                spannableStringBuilder4.append((CharSequence) m9c.k(W13, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(gw3.m(gm.N2(spannableStringBuilder4.toString(), cmb.Wc, 0, new Runnable() { // from class: ef5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b7;
                        TLRPC.User user = W13;
                        sk3 sk3Var22 = sk3Var2;
                        switch (b32) {
                            case 0:
                                sk3Var22.a(user);
                                break;
                            default:
                                sk3Var22.a(user);
                                break;
                        }
                    }
                }, ylbVar), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                bf0Var.f(W13, new pc0(0, W13));
                mgbVar = mgbVar2;
                mgbVar.y.setOnClickListener(new View.OnClickListener() { // from class: jgb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b62 = b7;
                        TLRPC.User user = W13;
                        sk3 sk3Var3 = sk3Var2;
                        switch (b62) {
                            case 0:
                                sk3Var3.a(user);
                                break;
                            default:
                                sk3Var3.a(user);
                                break;
                        }
                    }
                });
                if (tL_payments_checkedGiftCode4.boost == null) {
                    mgbVar.E.setVisibility(8);
                    return;
                }
                return;
            }
        }
        mgbVar = mgbVar2;
        if (tL_payments_checkedGiftCode4.boost == null) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View h56Var;
        Context context = viewGroup.getContext();
        ylb ylbVar = this.c;
        if (i == 1) {
            h56Var = new h56(context, ylbVar);
        } else if (i == 2) {
            h56Var = new mgb(context, ylbVar);
        } else if (i == 3) {
            h56Var = new mjb(context, ylbVar);
        } else if (i != 4) {
            h56Var = i != 5 ? new if5(context, ylbVar) : new View(context);
        } else {
            h56Var = new n8(context, ylbVar);
            h56Var.setPadding(0, 0, 0, gm.L(14.0f));
        }
        return kt6.h(h56Var, h56Var, -1, -2);
    }
}
