package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.q9;
import tg.u;
import ug.z;
import v4.f1;
import wg.q;
import wg.y0;
import yg.c0;
import yg.d0;
import yg.r;
import yg.t;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class e extends dk0 {
    public final h6 c;
    public boolean d;
    public g2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public m2 n;

    public e(h6 h6Var) {
        this.c = h6Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(f1 f1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // v4.i0
    public final int b() {
        return 5;
    }

    @Override // v4.i0
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

    /* JADX WARN: Removed duplicated region for block: B:59:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0343  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f1 f1Var, int i7) {
        int i10;
        char c10;
        String G;
        c0 c0Var;
        int i11 = f1Var.f;
        View view = f1Var.a;
        int i12 = 7;
        final int i13 = 0;
        if (i11 == 0) {
            r rVar = (r) view;
            if (this.d) {
                rVar.c.setText(hd.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                rVar.d.setText(g0.W2(hd.a0("BoostingLinkAllows", null, 2131753340, new Object[0])));
            } else {
                rVar.c.setText(hd.a0("BoostingUsedGiftLink", null, 2131753170, new Object[0]));
                rVar.d.setText(g0.W2(hd.a0("BoostingLinkUsed", null, 2131753336, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j3 = tL_payments_checkedGiftCode.to_id;
                final z zVar = new z(this, i12);
                rVar.c.setText(hd.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                SpannableStringBuilder W2 = g0.W2(hd.N0(2131753338, null));
                final TLRPC.User c22 = np.u1(k10.t0).c2(Long.valueOf(j3));
                final int i14 = 0;
                rVar.d.setText(g0.K2(W2, g0.R2("**" + p10.q(c22) + "**", m6.Xc, 2, new Runnable() { // from class: yg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                zVar.a(c22);
                                break;
                            default:
                                zVar.a(c22);
                                break;
                        }
                    }
                }, rVar.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                rVar.c.setText(hd.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                rVar.d.setText(g0.W2(hd.a0("BoostingLinkAllowsAnyone", null, 2131753339, new Object[0])));
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
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                yg.a aVar = (yg.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new y0(2, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    hi.e eVar = aVar.a;
                    eVar.setShowZero(false);
                    eVar.setEnabled(true);
                    eVar.i(hd.a0("Close", null, 2131752029, new Object[0]), false, true);
                    aVar.setOnClickListener(new u(this, 6));
                    return;
                }
                return;
            }
            d0 d0Var = (d0) view;
            d0Var.setTextGravity(17);
            t6.U(d0Var.getTextView(), m6.G6, null);
            d0Var.setTopPadding(14);
            d0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    d0Var.setText(g0.R2(tL_payments_checkedGiftCode3.to_id == -1 ? hd.N0(2131753268, null) : hd.N0(2131753267, null), m6.Xc, 0, new c(this, i15), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    d0Var.setText(hd.a0("BoostingUsedLinkDate", null, 2131753169, hd.a0("formatDateAtTime", null, 2131742517, hd.E0().C0().format(date), hd.E0().p0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                d0Var.setText(hd.N0(2131753337, null));
                return;
            } else {
                d0Var.setFixedSize(14);
                d0Var.setText(null);
                return;
            }
        }
        c0 c0Var2 = (c0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final z zVar2 = new z(this, i12);
        q9 q9Var = c0Var2.h;
        FrameLayout frameLayout = c0Var2.x;
        q9 q9Var2 = c0Var2.f;
        TextView textView = c0Var2.a;
        TextView textView2 = c0Var2.b;
        h6 h6Var = c0Var2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        c0Var2.e.setText(hd.a0("formatDateAtTime", null, 2131742517, hd.E0().C0().format(date2), hd.E0().p0().format(date2)));
        TextView textView3 = c0Var2.d;
        t6.U(textView3, tL_payments_checkedGiftCode4.via_giveaway ? m6.m5 : m6.j5, h6Var);
        TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(-n5.o(tL_payments_checkedGiftCode4.from_id)));
        boolean V = v3.V(O0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) hd.N0(2131753489, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(g0.R2(spannableStringBuilder.toString(), m6.Xc, 0, new Runnable() { // from class: yg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            zVar2.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            zVar2.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, h6Var));
            textView3.setOnClickListener(new y0(4, zVar2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(hd.N0(V ? 2131753162 : 2131753161, null));
            textView3.setOnClickListener(null);
        }
        int i16 = tL_payments_checkedGiftCode4.months;
        if (i16 == 12) {
            i10 = 1;
            G = hd.G(1, "Years", new Object[0]);
            c10 = 0;
        } else {
            i10 = 1;
            c10 = 0;
            G = hd.G(i16, "Months", new Object[0]);
        }
        TextView textView4 = c0Var2.c;
        Object[] objArr = new Object[i10];
        objArr[c10] = G;
        textView4.setText(hd.a0("BoostingTelegramPremiumFor", null, 2131753177, objArr));
        if (O0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) O0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(j6.m(g0.R2(spannableStringBuilder2.toString(), m6.Xc, 0, new q(19, zVar2, O0), h6Var), textView.getPaint().getFontMetricsInt(), false, null, 0));
            q9Var2.f(O0, new b9(O0));
            frameLayout.setOnClickListener(new y0(5, zVar2, O0));
        } else {
            final TLRPC.User c23 = np.u1(k10.t0).c2(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i17 = 0;
            textView.setText(j6.m(p10.k(c23, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            q9Var2.f(c23, new b9(0, c23));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: yg.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            zVar2.a(c23);
                            break;
                        default:
                            zVar2.a(c23);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) hd.N0(2131753342, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i18 = 1;
            textView3.setText(g0.R2(spannableStringBuilder3.toString(), m6.Xc, 0, new Runnable() { // from class: yg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            zVar2.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            zVar2.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, h6Var));
            textView2.setText(hd.N0(2131753332, null));
            t6.U(textView2, m6.j5, h6Var);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            q9Var.setVisibility(8);
        } else {
            final TLRPC.User c24 = np.u1(k10.t0).c2(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (c24 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final int i19 = 1;
                spannableStringBuilder4.append((CharSequence) p10.k(c24, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(j6.m(g0.R2(spannableStringBuilder4.toString(), m6.Xc, 0, new Runnable() { // from class: yg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                zVar2.a(c24);
                                break;
                            default:
                                zVar2.a(c24);
                                break;
                        }
                    }
                }, h6Var), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                q9Var.f(c24, new b9(0, c24));
                c0Var = c0Var2;
                c0Var.y.setOnClickListener(new View.OnClickListener() { // from class: yg.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                zVar2.a(c24);
                                break;
                            default:
                                zVar2.a(c24);
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

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        View tVar;
        Context context = viewGroup.getContext();
        h6 h6Var = this.c;
        if (i7 == 1) {
            tVar = new t(context, h6Var);
        } else if (i7 == 2) {
            tVar = new c0(context, h6Var);
        } else if (i7 == 3) {
            tVar = new d0(context, h6Var);
        } else if (i7 != 4) {
            tVar = i7 != 5 ? new r(context, h6Var) : new View(context);
        } else {
            tVar = new yg.a(context, h6Var);
            tVar.setPadding(0, 0, 0, g0.L(14.0f));
        }
        return i5.c.q(tVar, tVar, -1, -2);
    }
}
