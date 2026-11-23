package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.p9;
import tg.a0;
import ug.z;
import v4.f1;
import wg.x0;
import yg.c0;
import yg.d0;
import yg.r;
import yg.t;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class e extends dk0 {
    public final i6 c;
    public boolean d;
    public g2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public m2 n;

    public e(i6 i6Var) {
        this.c = i6Var;
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
                rVar.c.setText(gd.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                rVar.d.setText(g0.W2(gd.a0("BoostingLinkAllows", null, 2131753340, new Object[0])));
            } else {
                rVar.c.setText(gd.a0("BoostingUsedGiftLink", null, 2131753170, new Object[0]));
                rVar.d.setText(g0.W2(gd.a0("BoostingLinkUsed", null, 2131753336, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j3 = tL_payments_checkedGiftCode.to_id;
                final z zVar = new z(this, i12);
                rVar.c.setText(gd.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                SpannableStringBuilder W2 = g0.W2(gd.N0(2131753338, null));
                final TLRPC.User c22 = mp.u1(i10.t0).c2(Long.valueOf(j3));
                final int i14 = 0;
                rVar.d.setText(g0.K2(W2, g0.R2("**" + n10.q(c22) + "**", n6.Xc, 2, new Runnable() { // from class: yg.n
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
                rVar.c.setText(gd.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                rVar.d.setText(g0.W2(gd.a0("BoostingLinkAllowsAnyone", null, 2131753339, new Object[0])));
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
                aVar.setOnClickListener(new x0(2, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    hi.e eVar = aVar.a;
                    eVar.setShowZero(false);
                    eVar.setEnabled(true);
                    eVar.i(gd.a0("Close", null, 2131752029, new Object[0]), false, true);
                    aVar.setOnClickListener(new a0(this, 6));
                    return;
                }
                return;
            }
            d0 d0Var = (d0) view;
            d0Var.setTextGravity(17);
            u6.U(d0Var.getTextView(), n6.G6, null);
            d0Var.setTopPadding(14);
            d0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    d0Var.setText(g0.R2(tL_payments_checkedGiftCode3.to_id == -1 ? gd.N0(2131753268, null) : gd.N0(2131753267, null), n6.Xc, 0, new c(this, i15), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    d0Var.setText(gd.a0("BoostingUsedLinkDate", null, 2131753169, gd.a0("formatDateAtTime", null, 2131742512, gd.E0().C0().format(date), gd.E0().p0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                d0Var.setText(gd.N0(2131753337, null));
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
        p9 p9Var = c0Var2.h;
        FrameLayout frameLayout = c0Var2.x;
        p9 p9Var2 = c0Var2.f;
        TextView textView = c0Var2.a;
        TextView textView2 = c0Var2.b;
        i6 i6Var = c0Var2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        c0Var2.e.setText(gd.a0("formatDateAtTime", null, 2131742512, gd.E0().C0().format(date2), gd.E0().p0().format(date2)));
        TextView textView3 = c0Var2.d;
        u6.U(textView3, tL_payments_checkedGiftCode4.via_giveaway ? n6.m5 : n6.j5, i6Var);
        TLRPC.Chat O0 = mp.u1(i10.t0).O0(Long.valueOf(-n5.o(tL_payments_checkedGiftCode4.from_id)));
        boolean V = v3.V(O0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) gd.N0(2131753489, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(g0.R2(spannableStringBuilder.toString(), n6.Xc, 0, new Runnable() { // from class: yg.z
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
            }, i6Var));
            textView3.setOnClickListener(new x0(4, zVar2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(gd.N0(V ? 2131753162 : 2131753161, null));
            textView3.setOnClickListener(null);
        }
        int i16 = tL_payments_checkedGiftCode4.months;
        if (i16 == 12) {
            i10 = 1;
            G = gd.G(1, "Years", new Object[0]);
            c10 = 0;
        } else {
            i10 = 1;
            c10 = 0;
            G = gd.G(i16, "Months", new Object[0]);
        }
        TextView textView4 = c0Var2.c;
        Object[] objArr = new Object[i10];
        objArr[c10] = G;
        textView4.setText(gd.a0("BoostingTelegramPremiumFor", null, 2131753177, objArr));
        if (O0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) O0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(j6.m(g0.R2(spannableStringBuilder2.toString(), n6.Xc, 0, new v9.b(23, zVar2, O0), i6Var), textView.getPaint().getFontMetricsInt(), false, null, 0));
            p9Var2.f(O0, new a9(O0));
            frameLayout.setOnClickListener(new x0(5, zVar2, O0));
        } else {
            final TLRPC.User c23 = mp.u1(i10.t0).c2(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i17 = 0;
            textView.setText(j6.m(n10.k(c23, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            p9Var2.f(c23, new a9(0, c23));
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
            spannableStringBuilder3.append((CharSequence) gd.N0(2131753342, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i18 = 1;
            textView3.setText(g0.R2(spannableStringBuilder3.toString(), n6.Xc, 0, new Runnable() { // from class: yg.z
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
            }, i6Var));
            textView2.setText(gd.N0(2131753332, null));
            u6.U(textView2, n6.j5, i6Var);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            p9Var.setVisibility(8);
        } else {
            final TLRPC.User c24 = mp.u1(i10.t0).c2(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (c24 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final int i19 = 1;
                spannableStringBuilder4.append((CharSequence) n10.k(c24, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(j6.m(g0.R2(spannableStringBuilder4.toString(), n6.Xc, 0, new Runnable() { // from class: yg.n
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
                }, i6Var), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                p9Var.f(c24, new a9(0, c24));
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
        i6 i6Var = this.c;
        if (i7 == 1) {
            tVar = new t(context, i6Var);
        } else if (i7 == 2) {
            tVar = new c0(context, i6Var);
        } else if (i7 == 3) {
            tVar = new d0(context, i6Var);
        } else if (i7 != 4) {
            tVar = i7 != 5 ? new r(context, i6Var) : new View(context);
        } else {
            tVar = new yg.a(context, i6Var);
            tVar.setPadding(0, 0, 0, g0.L(14.0f));
        }
        return i5.c.q(tVar, tVar, -1, -2);
    }
}
