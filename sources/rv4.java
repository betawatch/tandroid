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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class rv4 extends c79 {
    public final vnb c;
    public boolean d;
    public e e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public ex0 n;

    public rv4(vnb vnbVar) {
        this.c = vnbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // j79
    public final int b() {
        return 5;
    }

    @Override // j79
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        boolean z;
        String G;
        hib hibVar;
        int i2 = f89Var.f;
        View view = f89Var.a;
        final byte b = 0;
        if (i2 == 0) {
            lf5 lf5Var = (lf5) view;
            if (this.d) {
                lf5Var.c.setText(ob6.a0("BoostingGiftLink", null, 2131753493, new Object[0]));
                lf5Var.d.setText(hl.S2(ob6.a0("BoostingLinkAllows", null, 2131753336, new Object[0])));
            } else {
                lf5Var.c.setText(ob6.a0("BoostingUsedGiftLink", null, 2131753166, new Object[0]));
                lf5Var.d.setText(hl.S2(ob6.a0("BoostingLinkUsed", null, 2131753332, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j = tL_payments_checkedGiftCode.to_id;
                final zj3 zj3Var = new zj3(this, (byte) 11);
                lf5Var.c.setText(ob6.a0("BoostingGiftLink", null, 2131753493, new Object[0]));
                SpannableStringBuilder S2 = hl.S2(ob6.M0(2131753334, null));
                final TLRPC.User X1 = uc7.s1(yac.t0).X1(Long.valueOf(j));
                final byte b2 = 0;
                lf5Var.d.setText(hl.G2(S2, hl.N2("**" + lbc.r(X1) + "**", aob.Xc, 2, new Runnable() { // from class: hf5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.User user = X1;
                        zj3 zj3Var2 = zj3Var;
                        switch (b3) {
                            case 0:
                                zj3Var2.a(user);
                                break;
                            default:
                                zj3Var2.a(user);
                                break;
                        }
                    }
                }, lf5Var.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                lf5Var.c.setText(ob6.a0("BoostingGiftLink", null, 2131753493, new Object[0]));
                lf5Var.d.setText(hl.S2(ob6.a0("BoostingLinkAllowsAnyone", null, 2131753335, new Object[0])));
                return;
            }
            return;
        }
        byte b3 = 1;
        if (i2 == 1) {
            k56 k56Var = (k56) view;
            k56Var.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                k56Var.a(new pv4(this, (byte) 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                k56Var.a(new pv4(this, (byte) 0));
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    o8 o8Var = (o8) view;
                    o8Var.setOkStyle(this.d);
                    o8Var.setOnClickListener(new je3(this, o8Var, (byte) 19));
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                    if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                        o8Var.e = false;
                        c51 c51Var = o8Var.a;
                        c51Var.setShowZero(false);
                        c51Var.setEnabled(true);
                        c51Var.i(ob6.a0("Close", null, 2131752006, new Object[0]), false, true);
                        o8Var.setOnClickListener(new mh3(this, (byte) 23));
                        return;
                    }
                    return;
                }
                return;
            }
            hlb hlbVar = (hlb) view;
            hlbVar.setTextGravity(17);
            yob.X(hlbVar.getTextView(), aob.G6, null);
            hlbVar.setTopPadding(14);
            hlbVar.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    hlbVar.setText(hl.N2(tL_payments_checkedGiftCode3.to_id == -1 ? ob6.M0(2131753264, null) : ob6.M0(2131753263, null), aob.Xc, 0, new pv4(this, b3), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    hlbVar.setText(ob6.a0("BoostingUsedLinkDate", null, 2131753165, ob6.a0("formatDateAtTime", null, 2131742414, ob6.D0().B0().format(date), ob6.D0().o0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                hlbVar.setText(ob6.M0(2131753333, null));
                return;
            } else {
                hlbVar.setFixedSize(14);
                hlbVar.setText(null);
                return;
            }
        }
        hib hibVar2 = (hib) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final zj3 zj3Var2 = new zj3(this, (byte) 11);
        de0 de0Var = hibVar2.h;
        FrameLayout frameLayout = hibVar2.x;
        de0 de0Var2 = hibVar2.f;
        TextView textView = hibVar2.a;
        TextView textView2 = hibVar2.b;
        vnb vnbVar = hibVar2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        hibVar2.e.setText(ob6.a0("formatDateAtTime", null, 2131742414, ob6.D0().B0().format(date2), ob6.D0().o0().format(date2)));
        TextView textView3 = hibVar2.d;
        yob.X(textView3, tL_payments_checkedGiftCode4.via_giveaway ? aob.m5 : aob.j5, vnbVar);
        TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(-wf3.n(tL_payments_checkedGiftCode4.from_id)));
        boolean V = xc2.V(M0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) ob6.M0(2131753485, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(hl.N2(spannableStringBuilder.toString(), aob.Xc, 0, new Runnable() { // from class: dib
                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b;
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode5 = tL_payments_checkedGiftCode4;
                    zj3 zj3Var3 = zj3Var2;
                    switch (b4) {
                        case 0:
                            zj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                        default:
                            zj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                    }
                }
            }, vnbVar));
            textView3.setOnClickListener(new jy8(zj3Var2, tL_payments_checkedGiftCode4, (byte) 27));
        } else {
            textView3.setText(ob6.M0(V ? 2131753158 : 2131753157, null));
            textView3.setOnClickListener(null);
        }
        int i3 = tL_payments_checkedGiftCode4.months;
        if (i3 == 12) {
            z = false;
            G = ob6.G(1, "Years", new Object[0]);
        } else {
            z = false;
            G = ob6.G(i3, "Months", new Object[0]);
        }
        TextView textView4 = hibVar2.c;
        boolean z2 = z;
        Object[] objArr = new Object[1];
        objArr[z2 ? 1 : 0] = G;
        textView4.setText(ob6.a0("BoostingTelegramPremiumFor", null, 2131753173, objArr));
        if (M0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) M0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(pv3.m(hl.N2(spannableStringBuilder2.toString(), aob.Xc, 0, new bcb((Object) zj3Var2, (Object) M0, (byte) 2), vnbVar), textView.getPaint().getFontMetricsInt(), false, null, 0));
            de0Var2.f(M0, new rb0(M0));
            frameLayout.setOnClickListener(new jy8(zj3Var2, M0, (byte) 28));
        } else {
            final TLRPC.User X12 = uc7.s1(yac.t0).X1(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final byte b4 = 0;
            textView.setText(pv3.m(lbc.k(X12, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            de0Var2.f(X12, new rb0(0, X12));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: eib
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b5 = b4;
                    TLRPC.User user = X12;
                    zj3 zj3Var3 = zj3Var2;
                    switch (b5) {
                        case 0:
                            zj3Var3.a(user);
                            break;
                        default:
                            zj3Var3.a(user);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) ob6.M0(2131753338, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final byte b5 = 1;
            textView3.setText(hl.N2(spannableStringBuilder3.toString(), aob.Xc, 0, new Runnable() { // from class: dib
                @Override // java.lang.Runnable
                public final void run() {
                    byte b42 = b5;
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode5 = tL_payments_checkedGiftCode4;
                    zj3 zj3Var3 = zj3Var2;
                    switch (b42) {
                        case 0:
                            zj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                        default:
                            zj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                    }
                }
            }, vnbVar));
            textView2.setText(ob6.M0(2131753328, null));
            yob.X(textView2, aob.j5, vnbVar);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            de0Var.setVisibility(8);
        } else {
            final TLRPC.User X13 = uc7.s1(yac.t0).X1(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (X13 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final byte b6 = 1;
                spannableStringBuilder4.append((CharSequence) lbc.k(X13, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(pv3.m(hl.N2(spannableStringBuilder4.toString(), aob.Xc, 0, new Runnable() { // from class: hf5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b6;
                        TLRPC.User user = X13;
                        zj3 zj3Var22 = zj3Var2;
                        switch (b32) {
                            case 0:
                                zj3Var22.a(user);
                                break;
                            default:
                                zj3Var22.a(user);
                                break;
                        }
                    }
                }, vnbVar), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                de0Var.f(X13, new rb0(0, X13));
                hibVar = hibVar2;
                hibVar.y.setOnClickListener(new View.OnClickListener() { // from class: eib
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b52 = b6;
                        TLRPC.User user = X13;
                        zj3 zj3Var3 = zj3Var2;
                        switch (b52) {
                            case 0:
                                zj3Var3.a(user);
                                break;
                            default:
                                zj3Var3.a(user);
                                break;
                        }
                    }
                });
                if (tL_payments_checkedGiftCode4.boost == null) {
                    hibVar.E.setVisibility(8);
                    return;
                }
                return;
            }
        }
        hibVar = hibVar2;
        if (tL_payments_checkedGiftCode4.boost == null) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View k56Var;
        Context context = viewGroup.getContext();
        vnb vnbVar = this.c;
        if (i == 1) {
            k56Var = new k56(context, vnbVar);
        } else if (i == 2) {
            k56Var = new hib(context, vnbVar);
        } else if (i == 3) {
            k56Var = new hlb(context, vnbVar);
        } else if (i != 4) {
            k56Var = i != 5 ? new lf5(context, vnbVar) : new View(context);
        } else {
            k56Var = new o8(context, vnbVar);
            k56Var.setPadding(0, 0, 0, hl.L(14.0f));
        }
        return qu6.h(k56Var, k56Var, -1, -2);
    }
}
