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
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.sc1;
import tg.h2;
import ug.p1;
import ug.t1;
import v4.e1;
import yg.c0;
import yg.d0;
import yg.r;
import yg.t;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class f extends tj0 {
    public final e6 c;
    public boolean d;
    public e2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public k2 n;

    public f(e6 e6Var) {
        this.c = e6Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(e1 e1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // v4.h0
    public final int b() {
        return 5;
    }

    @Override // v4.h0
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0347  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(e1 e1Var, int i7) {
        int i10;
        char c10;
        String G;
        c0 c0Var;
        int i11 = e1Var.f;
        View view = e1Var.a;
        int i12 = 6;
        final int i13 = 0;
        if (i11 == 0) {
            r rVar = (r) view;
            if (this.d) {
                rVar.c.setText(hd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                rVar.d.setText(g0.X2(hd.a0("BoostingLinkAllows", null, 2131753343, new Object[0])));
            } else {
                rVar.c.setText(hd.a0("BoostingUsedGiftLink", null, 2131753173, new Object[0]));
                rVar.d.setText(g0.X2(hd.a0("BoostingLinkUsed", null, 2131753339, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j3 = tL_payments_checkedGiftCode.to_id;
                final p1 p1Var = new p1(this, i12);
                rVar.c.setText(hd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                SpannableStringBuilder X2 = g0.X2(hd.M0(2131753341, null));
                final TLRPC.User a22 = np.s1(m10.t0).a2(Long.valueOf(j3));
                final int i14 = 0;
                rVar.d.setText(g0.K2(X2, g0.S2("**" + q10.p(a22) + "**", j6.Xc, 2, new Runnable() { // from class: yg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                p1Var.a(a22);
                                break;
                            default:
                                p1Var.a(a22);
                                break;
                        }
                    }
                }, rVar.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                rVar.c.setText(hd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                rVar.d.setText(g0.X2(hd.a0("BoostingLinkAllowsAnyone", null, 2131753342, new Object[0])));
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
                aVar.setOnClickListener(new sc1(9, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    hi.d dVar = aVar.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.i(hd.a0("Close", null, 2131752041, new Object[0]), false, true);
                    aVar.setOnClickListener(new h2(this, 5));
                    return;
                }
                return;
            }
            d0 d0Var = (d0) view;
            d0Var.setTextGravity(17);
            q6.U(d0Var.getTextView(), j6.G6, null);
            d0Var.setTopPadding(14);
            d0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    d0Var.setText(g0.S2(tL_payments_checkedGiftCode3.to_id == -1 ? hd.M0(2131753271, null) : hd.M0(2131753270, null), j6.Xc, 0, new c(this, i15), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    d0Var.setText(hd.a0("BoostingUsedLinkDate", null, 2131753172, hd.a0("formatDateAtTime", null, 2131742783, hd.E0().C0().format(date), hd.E0().p0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                d0Var.setText(hd.M0(2131753340, null));
                return;
            } else {
                d0Var.setFixedSize(14);
                d0Var.setText(null);
                return;
            }
        }
        c0 c0Var2 = (c0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final p1 p1Var2 = new p1(this, i12);
        i9 i9Var = c0Var2.h;
        FrameLayout frameLayout = c0Var2.x;
        i9 i9Var2 = c0Var2.f;
        TextView textView = c0Var2.a;
        TextView textView2 = c0Var2.b;
        e6 e6Var = c0Var2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        c0Var2.e.setText(hd.a0("formatDateAtTime", null, 2131742783, hd.E0().C0().format(date2), hd.E0().p0().format(date2)));
        TextView textView3 = c0Var2.d;
        q6.U(textView3, tL_payments_checkedGiftCode4.via_giveaway ? j6.m5 : j6.j5, e6Var);
        TLRPC.Chat M0 = np.s1(m10.t0).M0(Long.valueOf(-m5.o(tL_payments_checkedGiftCode4.from_id)));
        boolean V = t3.V(M0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) hd.M0(2131753492, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(g0.S2(spannableStringBuilder.toString(), j6.Xc, 0, new Runnable() { // from class: yg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            p1Var2.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            p1Var2.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, e6Var));
            textView3.setOnClickListener(new sc1(11, p1Var2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(hd.M0(V ? 2131753165 : 2131753164, null));
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
        textView4.setText(hd.a0("BoostingTelegramPremiumFor", null, 2131753180, objArr));
        if (M0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) M0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(org.telegram.messenger.j6.m(g0.S2(spannableStringBuilder2.toString(), j6.Xc, 0, new t1(25, p1Var2, M0), e6Var), textView.getPaint().getFontMetricsInt(), false, null, 0));
            i9Var2.f(M0, new t8(M0));
            frameLayout.setOnClickListener(new sc1(12, p1Var2, M0));
        } else {
            final TLRPC.User a23 = np.s1(m10.t0).a2(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i17 = 0;
            textView.setText(org.telegram.messenger.j6.m(q10.j(a23, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            i9Var2.f(a23, new t8(0, a23));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: yg.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            p1Var2.a(a23);
                            break;
                        default:
                            p1Var2.a(a23);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) hd.M0(2131753345, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i18 = 1;
            textView3.setText(g0.S2(spannableStringBuilder3.toString(), j6.Xc, 0, new Runnable() { // from class: yg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            p1Var2.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            p1Var2.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, e6Var));
            textView2.setText(hd.M0(2131753335, null));
            q6.U(textView2, j6.j5, e6Var);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            i9Var.setVisibility(8);
        } else {
            final TLRPC.User a24 = np.s1(m10.t0).a2(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (a24 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final int i19 = 1;
                spannableStringBuilder4.append((CharSequence) q10.j(a24, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(org.telegram.messenger.j6.m(g0.S2(spannableStringBuilder4.toString(), j6.Xc, 0, new Runnable() { // from class: yg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                p1Var2.a(a24);
                                break;
                            default:
                                p1Var2.a(a24);
                                break;
                        }
                    }
                }, e6Var), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                i9Var.f(a24, new t8(0, a24));
                c0Var = c0Var2;
                c0Var.y.setOnClickListener(new View.OnClickListener() { // from class: yg.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                p1Var2.a(a24);
                                break;
                            default:
                                p1Var2.a(a24);
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

    @Override // v4.h0
    public final e1 x(ViewGroup viewGroup, int i7) {
        View tVar;
        Context context = viewGroup.getContext();
        e6 e6Var = this.c;
        if (i7 == 1) {
            tVar = new t(context, e6Var);
        } else if (i7 == 2) {
            tVar = new c0(context, e6Var);
        } else if (i7 == 3) {
            tVar = new d0(context, e6Var);
        } else if (i7 != 4) {
            tVar = i7 != 5 ? new r(context, e6Var) : new View(context);
        } else {
            tVar = new yg.a(context, e6Var);
            tVar.setPadding(0, 0, 0, g0.L(14.0f));
        }
        return i5.c.q(tVar, tVar, -1, -2);
    }
}
