package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.w8;
import v4.d1;
import wg.z0;
import yg.c0;
import yg.d0;
import yg.r;
import yg.t;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class f extends oj0 {
    public final f6 c;
    public boolean d;
    public f2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public l2 n;

    public f(f6 f6Var) {
        this.c = f6Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(d1 d1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // v4.g0
    public final int b() {
        return 5;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                i10 = 3;
                if (i7 != 3) {
                    i10 = 4;
                    if (i7 != 4) {
                        return 5;
                    }
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0342  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(d1 d1Var, int i7) {
        int i10;
        char c10;
        String G;
        c0 c0Var;
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = 1;
        final int i13 = 0;
        if (i11 == 0) {
            r rVar = (r) view;
            if (this.d) {
                rVar.c.setText(id.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                rVar.d.setText(g0.X2(id.a0("BoostingLinkAllows", null, 2131753343, new Object[0])));
            } else {
                rVar.c.setText(id.a0("BoostingUsedGiftLink", null, 2131753173, new Object[0]));
                rVar.d.setText(g0.X2(id.a0("BoostingLinkUsed", null, 2131753339, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j3 = tL_payments_checkedGiftCode.to_id;
                final a aVar = new a(this, 1);
                rVar.c.setText(id.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                SpannableStringBuilder X2 = g0.X2(id.M0(2131753341, null));
                final TLRPC.User a22 = qp.s1(p10.s0).a2(Long.valueOf(j3));
                final int i14 = 0;
                rVar.d.setText(g0.K2(X2, g0.S2("**" + t10.p(a22) + "**", k6.Uc, 2, new Runnable() { // from class: yg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                aVar.a(a22);
                                break;
                            default:
                                aVar.a(a22);
                                break;
                        }
                    }
                }, rVar.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                rVar.c.setText(id.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                rVar.d.setText(g0.X2(id.a0("BoostingLinkAllowsAnyone", null, 2131753342, new Object[0])));
                return;
            }
            return;
        }
        if (i11 == 1) {
            t tVar = (t) view;
            tVar.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                tVar.a(new d(this, 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                tVar.a(new d(this, 0));
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                yg.a aVar2 = (yg.a) view;
                aVar2.setOkStyle(this.d);
                aVar2.setOnClickListener(new z0(2, this, aVar2));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar2.e = false;
                    fi.d dVar = aVar2.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.i(id.a0("Close", null, 2131752041, new Object[0]), false, true);
                    aVar2.setOnClickListener(new ii.g(this, 29));
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
                    d0Var.setText(g0.S2(tL_payments_checkedGiftCode3.to_id == -1 ? id.M0(2131753271, null) : id.M0(2131753270, null), k6.Uc, 0, new d(this, i12), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    d0Var.setText(id.a0("BoostingUsedLinkDate", null, 2131753172, id.a0("formatDateAtTime", null, 2131742786, id.E0().C0().format(date), id.E0().p0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                d0Var.setText(id.M0(2131753340, null));
                return;
            } else {
                d0Var.setFixedSize(14);
                d0Var.setText(null);
                return;
            }
        }
        c0 c0Var2 = (c0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final a aVar3 = new a(this, 1);
        l9 l9Var = c0Var2.h;
        FrameLayout frameLayout = c0Var2.x;
        l9 l9Var2 = c0Var2.f;
        TextView textView = c0Var2.a;
        TextView textView2 = c0Var2.b;
        f6 f6Var = c0Var2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        c0Var2.e.setText(id.a0("formatDateAtTime", null, 2131742786, id.E0().C0().format(date2), id.E0().p0().format(date2)));
        TextView textView3 = c0Var2.d;
        r6.V(textView3, tL_payments_checkedGiftCode4.via_giveaway ? k6.m5 : k6.j5, f6Var);
        TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(-m5.o(tL_payments_checkedGiftCode4.from_id)));
        boolean V = t3.V(M0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) id.M0(2131753492, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(g0.S2(spannableStringBuilder.toString(), k6.Uc, 0, new Runnable() { // from class: yg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            aVar3.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            aVar3.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, f6Var));
            textView3.setOnClickListener(new z0(4, aVar3, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(id.M0(V ? 2131753165 : 2131753164, null));
            textView3.setOnClickListener(null);
        }
        int i15 = tL_payments_checkedGiftCode4.months;
        if (i15 == 12) {
            i10 = 1;
            G = id.G(1, "Years", new Object[0]);
            c10 = 0;
        } else {
            i10 = 1;
            c10 = 0;
            G = id.G(i15, "Months", new Object[0]);
        }
        TextView textView4 = c0Var2.c;
        Object[] objArr = new Object[i10];
        objArr[c10] = G;
        textView4.setText(id.a0("BoostingTelegramPremiumFor", null, 2131753180, objArr));
        if (M0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) M0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(i6.m(g0.S2(spannableStringBuilder2.toString(), k6.Uc, 0, new yf.b(3, aVar3, M0), f6Var), textView.getPaint().getFontMetricsInt(), false, null, 0));
            l9Var2.e(M0, new w8(M0));
            frameLayout.setOnClickListener(new z0(5, aVar3, M0));
        } else {
            final TLRPC.User a23 = qp.s1(p10.s0).a2(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i16 = 0;
            textView.setText(i6.m(t10.j(a23, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            l9Var2.e(a23, new w8(0, a23));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: yg.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            aVar3.a(a23);
                            break;
                        default:
                            aVar3.a(a23);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) id.M0(2131753345, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i17 = 1;
            textView3.setText(g0.S2(spannableStringBuilder3.toString(), k6.Uc, 0, new Runnable() { // from class: yg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            aVar3.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            aVar3.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, f6Var));
            textView2.setText(id.M0(2131753335, null));
            r6.V(textView2, k6.j5, f6Var);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            l9Var.setVisibility(8);
        } else {
            final TLRPC.User a24 = qp.s1(p10.s0).a2(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (a24 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final int i18 = 1;
                spannableStringBuilder4.append((CharSequence) t10.j(a24, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(i6.m(g0.S2(spannableStringBuilder4.toString(), k6.Uc, 0, new Runnable() { // from class: yg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                aVar3.a(a24);
                                break;
                            default:
                                aVar3.a(a24);
                                break;
                        }
                    }
                }, f6Var), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                l9Var.e(a24, new w8(0, a24));
                c0Var = c0Var2;
                c0Var.y.setOnClickListener(new View.OnClickListener() { // from class: yg.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i18) {
                            case 0:
                                aVar3.a(a24);
                                break;
                            default:
                                aVar3.a(a24);
                                break;
                        }
                    }
                });
                if (tL_payments_checkedGiftCode4.boost == null) {
                    c0Var.D.setVisibility(8);
                    return;
                }
                return;
            }
        }
        c0Var = c0Var2;
        if (tL_payments_checkedGiftCode4.boost == null) {
        }
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        View tVar;
        Context context = viewGroup.getContext();
        f6 f6Var = this.c;
        if (i7 == 1) {
            tVar = new t(context, f6Var);
        } else if (i7 == 2) {
            tVar = new c0(context, f6Var);
        } else if (i7 == 3) {
            tVar = new d0(context, f6Var);
        } else if (i7 != 4) {
            tVar = i7 != 5 ? new r(context, f6Var) : new View(context);
        } else {
            tVar = new yg.a(context, f6Var);
            tVar.setPadding(0, 0, 0, g0.L(14.0f));
        }
        return jg.g.r(tVar, tVar, -1, -2);
    }
}
