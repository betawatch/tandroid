package yg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.u8;
import u4.d1;
import vg.b1;
import xh.i;
import zg.c0;
import zg.d0;
import zg.r;
import zg.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class e extends sj0 {
    public final e6 c;
    public boolean d;
    public d2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public j2 n;

    public e(e6 e6Var) {
        this.c = e6Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(d1 d1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // u4.h0
    public final int b() {
        return 5;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                i10 = 3;
                if (i3 != 3) {
                    i10 = 4;
                    if (i3 != 4) {
                        return 5;
                    }
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0345  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(d1 d1Var, int i3) {
        int i10;
        char c2;
        String G;
        c0 c0Var;
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = 4;
        final int i13 = 0;
        if (i11 == 0) {
            r rVar = (r) view;
            if (this.d) {
                rVar.c.setText(bd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                rVar.d.setText(g0.X2(bd.a0("BoostingLinkAllows", null, 2131753343, new Object[0])));
            } else {
                rVar.c.setText(bd.a0("BoostingUsedGiftLink", null, 2131753173, new Object[0]));
                rVar.d.setText(g0.X2(bd.a0("BoostingLinkUsed", null, 2131753339, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j10 = tL_payments_checkedGiftCode.to_id;
                final xg.d dVar = new xg.d(this, i12);
                rVar.c.setText(bd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                SpannableStringBuilder X2 = g0.X2(bd.M0(2131753341, null));
                final TLRPC.User a22 = hp.s1(h10.t0).a2(Long.valueOf(j10));
                final int i14 = 0;
                rVar.d.setText(g0.K2(X2, g0.S2("**" + l10.p(a22) + "**", k6.Uc, 2, new Runnable() { // from class: zg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                dVar.a(a22);
                                break;
                            default:
                                dVar.a(a22);
                                break;
                        }
                    }
                }, rVar.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                rVar.c.setText(bd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                rVar.d.setText(g0.X2(bd.a0("BoostingLinkAllowsAnyone", null, 2131753342, new Object[0])));
                return;
            }
            return;
        }
        int i15 = 1;
        if (i11 == 1) {
            t tVar = (t) view;
            tVar.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                tVar.a(new c(this, 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                tVar.a(new c(this, 0));
                return;
            }
            return;
        }
        int i16 = 8;
        if (i11 != 2) {
            int i17 = 3;
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                zg.a aVar = (zg.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new org.telegram.ui.web.d(i16, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    gi.d dVar2 = aVar.a;
                    dVar2.setShowZero(false);
                    dVar2.setEnabled(true);
                    dVar2.i(bd.a0("Close", null, 2131752041, new Object[0]), false, true);
                    aVar.setOnClickListener(new b1(this, i17));
                    return;
                }
                return;
            }
            d0 d0Var = (d0) view;
            d0Var.setTextGravity(17);
            r6.V(d0Var.getTextView(), k6.G6, null);
            d0Var.setTopPadding(14);
            d0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    d0Var.setText(g0.S2(tL_payments_checkedGiftCode3.to_id == -1 ? bd.M0(2131753271, null) : bd.M0(2131753270, null), k6.Uc, 0, new c(this, i15), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    d0Var.setText(bd.a0("BoostingUsedLinkDate", null, 2131753172, bd.a0("formatDateAtTime", null, 2131742793, bd.E0().C0().format(date), bd.E0().p0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                d0Var.setText(bd.M0(2131753340, null));
                return;
            } else {
                d0Var.setFixedSize(14);
                d0Var.setText(null);
                return;
            }
        }
        c0 c0Var2 = (c0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final xg.d dVar3 = new xg.d(this, i12);
        k9 k9Var = c0Var2.h;
        FrameLayout frameLayout = c0Var2.x;
        k9 k9Var2 = c0Var2.f;
        TextView textView = c0Var2.a;
        TextView textView2 = c0Var2.b;
        e6 e6Var = c0Var2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        c0Var2.e.setText(bd.a0("formatDateAtTime", null, 2131742793, bd.E0().C0().format(date2), bd.E0().p0().format(date2)));
        TextView textView3 = c0Var2.d;
        r6.V(textView3, tL_payments_checkedGiftCode4.via_giveaway ? k6.m5 : k6.j5, e6Var);
        TLRPC.Chat M0 = hp.s1(h10.t0).M0(Long.valueOf(-m5.o(tL_payments_checkedGiftCode4.from_id)));
        boolean V = t3.V(M0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) bd.M0(2131753492, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(g0.S2(spannableStringBuilder.toString(), k6.Uc, 0, new Runnable() { // from class: zg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            dVar3.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            dVar3.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, e6Var));
            textView3.setOnClickListener(new org.telegram.ui.web.d(10, dVar3, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(bd.M0(V ? 2131753165 : 2131753164, null));
            textView3.setOnClickListener(null);
        }
        int i18 = tL_payments_checkedGiftCode4.months;
        if (i18 == 12) {
            i10 = 1;
            G = bd.G(1, "Years", new Object[0]);
            c2 = 0;
        } else {
            i10 = 1;
            c2 = 0;
            G = bd.G(i18, "Months", new Object[0]);
        }
        TextView textView4 = c0Var2.c;
        Object[] objArr = new Object[i10];
        objArr[c2] = G;
        textView4.setText(bd.a0("BoostingTelegramPremiumFor", null, 2131753180, objArr));
        if (M0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) M0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            int i19 = 11;
            textView.setText(i6.m(g0.S2(spannableStringBuilder2.toString(), k6.Uc, 0, new i(i19, dVar3, M0), e6Var), textView.getPaint().getFontMetricsInt(), false, null, 0));
            k9Var2.e(M0, new u8(M0));
            frameLayout.setOnClickListener(new org.telegram.ui.web.d(i19, dVar3, M0));
        } else {
            final TLRPC.User a23 = hp.s1(h10.t0).a2(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i20 = 0;
            textView.setText(i6.m(l10.j(a23, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            k9Var2.e(a23, new u8(0, a23));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: zg.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i20) {
                        case 0:
                            dVar3.a(a23);
                            break;
                        default:
                            dVar3.a(a23);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) bd.M0(2131753345, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i21 = 1;
            textView3.setText(g0.S2(spannableStringBuilder3.toString(), k6.Uc, 0, new Runnable() { // from class: zg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            dVar3.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            dVar3.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, e6Var));
            textView2.setText(bd.M0(2131753335, null));
            r6.V(textView2, k6.j5, e6Var);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            k9Var.setVisibility(8);
        } else {
            final TLRPC.User a24 = hp.s1(h10.t0).a2(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (a24 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final int i22 = 1;
                spannableStringBuilder4.append((CharSequence) l10.j(a24, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(i6.m(g0.S2(spannableStringBuilder4.toString(), k6.Uc, 0, new Runnable() { // from class: zg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i22) {
                            case 0:
                                dVar3.a(a24);
                                break;
                            default:
                                dVar3.a(a24);
                                break;
                        }
                    }
                }, e6Var), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                k9Var.e(a24, new u8(0, a24));
                c0Var = c0Var2;
                c0Var.y.setOnClickListener(new View.OnClickListener() { // from class: zg.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i22) {
                            case 0:
                                dVar3.a(a24);
                                break;
                            default:
                                dVar3.a(a24);
                                break;
                        }
                    }
                });
                if (tL_payments_checkedGiftCode4.boost == null) {
                    c0Var.E.setVisibility(8);
                    return;
                }
                return;
            }
        }
        c0Var = c0Var2;
        if (tL_payments_checkedGiftCode4.boost == null) {
        }
    }

    @Override // u4.h0
    public final d1 x(ViewGroup viewGroup, int i3) {
        View tVar;
        Context context = viewGroup.getContext();
        e6 e6Var = this.c;
        if (i3 == 1) {
            tVar = new t(context, e6Var);
        } else if (i3 == 2) {
            tVar = new c0(context, e6Var);
        } else if (i3 == 3) {
            tVar = new d0(context, e6Var);
        } else if (i3 != 4) {
            tVar = i3 != 5 ? new r(context, e6Var) : new View(context);
        } else {
            tVar = new zg.a(context, e6Var);
            tVar.setPadding(0, 0, 0, g0.L(14.0f));
        }
        return p1.p(tVar, tVar, -1, -2);
    }
}
