package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.kc;
import di.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r1;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import v4.d1;
import wg.u;
import yg.d0;
import yg.l;
import yg.r;
import yg.v;
import yg.w;
import yg.x;
import yg.y;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c extends rg.b {
    public final f6 d;
    public pj0 f;
    public u h;
    public u n;
    public r r;
    public u s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public c(f6 f6Var) {
        this.d = f6Var;
        a aVar = new a(this, 0);
        yr a02 = yr.a0(p10.s0);
        a02.a.c(new u9.f(17, a02, aVar));
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 2 || i7 == 11 || i7 == 8 || i7 == 10 || i7 == 15 || i7 == 12 || i7 == 17 || i7 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(p10.s0).N0(chat.id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.x;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i7 = 0; i7 < this.e.size(); i7++) {
            if (((b) this.e.get(i7)).a == 7) {
                g(i7);
            }
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((b) this.e.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        b bVar = (b) this.e.get(i7);
        if (i10 == 0) {
            r rVar = (r) view;
            this.r = rVar;
            rVar.setBoostViaGifsText(this.w);
            this.r.setStars(bVar.g);
            return;
        }
        if (i10 == 2) {
            yg.d dVar = (yg.d) view;
            int i11 = bVar.l;
            int i12 = bVar.i;
            TLRPC.User user = (TLRPC.User) bVar.f;
            boolean z9 = bVar.b;
            l9 l9Var = dVar.c;
            f6 f6Var = dVar.a;
            d4 d4Var = dVar.d;
            k5 k5Var = dVar.e;
            w8 w8Var = dVar.b;
            boolean z10 = dVar.s == i11;
            dVar.s = i11;
            if (i11 == 0) {
                d4Var.k(id.M0(2131753541, null));
                dVar.setSubtitle(id.M0(2131753167, null));
                r6.Y(k5Var, k6.r5, f6Var);
                w8Var.g(16);
                w8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_bottom, k6.b7);
            } else if (i11 == 1) {
                d4Var.k(id.M0(2131753593, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(t10.p(user), k5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(id.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(id.M0(2131753285, null)));
                }
                r6.Y(k5Var, k6.n5, f6Var);
                w8Var.g(6);
                w8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_top, k6.b7);
            } else if (i11 == 2) {
                d4Var.k(id.M0(2131753332, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(t10.p(user), k5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(id.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(id.M0(2131753167, null)));
                }
                r6.Y(k5Var, k6.n5, f6Var);
                w8Var.g(25);
                w8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_bottom, k6.b7);
            } else if (i11 == 3) {
                d4Var.k(m8.b(id.M0(2131753257, null)));
                dVar.setSubtitle(id.M0(2131753167, null));
                r6.Y(k5Var, k6.r5, f6Var);
                w8Var.g(26);
                w8Var.i(-146917, -625593);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_top, k6.b7);
            }
            dVar.f.a(z9, z10);
            l9Var.setImageDrawable(w8Var);
            l9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        if (i10 == 5) {
            v vVar = (v) view;
            List list = bVar.k;
            int i13 = bVar.i;
            vVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                strArr[i14] = String.valueOf((Integer) list.get(i14));
            }
            vVar.a.b(i13, null, strArr);
            vVar.setCallBack(this.h);
            return;
        }
        if (i10 == 6) {
            ((n4) view).setText(bVar.c);
            return;
        }
        if (i10 == 7) {
            d0 d0Var = (d0) view;
            d0Var.setText(bVar.c);
            d0Var.setBackground(bVar.g);
            return;
        }
        switch (i10) {
            case 9:
                yg.g gVar = (yg.g) view;
                TLRPC.InputPeer inputPeer = bVar.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = bVar.e;
                    gVar.f(chat, bVar.i, bVar.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(inputPeer.chat_id));
                    gVar.f(M0, bVar.i, bVar.g, F(M0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M02 = qp.s1(p10.s0).M0(Long.valueOf(inputPeer.channel_id));
                    gVar.f(M02, bVar.i, bVar.g, F(M02));
                }
                gVar.setChatDeleteListener(this.n);
                break;
            case 10:
                ((yg.h) view).setDate(bVar.h);
                break;
            case 11:
                yg.u uVar = (yg.u) view;
                int i15 = bVar.l;
                boolean z11 = bVar.b;
                boolean z12 = bVar.g;
                List list2 = (List) bVar.f;
                TLRPC.Chat chat2 = this.w;
                d4 d4Var2 = uVar.d;
                uVar.s = i15;
                boolean V = t3.V(chat2);
                if (i15 == 0) {
                    d4Var2.k(id.a0(null, null, V ? 2131753598 : 2131753599, new Object[0]));
                } else if (i15 == 1) {
                    d4Var2.k(id.a0(null, null, V ? 2131753336 : 2131753337, new Object[0]));
                }
                uVar.f.a(z11, false);
                uVar.setDivider(z12);
                r6.Y(uVar.e, k6.n5, uVar.a);
                if (list2.size() == 0) {
                    uVar.setSubtitle(uVar.e(id.M0(2131753522, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        uVar.setSubtitle(uVar.e(id.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        uVar.setSubtitle(uVar.e(id.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        uVar.setSubtitle(uVar.e(id.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    uVar.setSubtitle(uVar.e(id.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                yg.i iVar = (yg.i) view;
                TLObject tLObject = bVar.m;
                int i16 = bVar.i;
                int i17 = bVar.j;
                long j3 = bVar.h;
                CharSequence charSequence = bVar.c;
                boolean z13 = bVar.g;
                boolean z14 = bVar.b;
                d4 d4Var3 = iVar.d;
                iVar.w = tLObject;
                if (i16 >= 12) {
                    d4Var3.k(id.G(1, "Years", new Object[0]));
                } else {
                    d4Var3.k(id.G(i16, "Months", new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r1.i().f(i17 > 0 ? j3 / i17 : j3, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i17);
                iVar.setSubtitle(sb2.toString());
                k5 k5Var2 = iVar.s;
                r1 i18 = r1.i();
                if (i17 <= 0) {
                    j3 = 0;
                }
                k5Var2.l(i18.f(j3, charSequence.toString()), false);
                iVar.setDivider(z13);
                iVar.f.a(z14, false);
                break;
            case 13:
                x xVar = (x) view;
                xVar.setText(bVar.c);
                int i19 = bVar.i;
                j6 j6Var = xVar.r;
                String G = i19 > 0 ? id.G(i19, "BoostingBoostsCountTitle", Integer.valueOf(i19)) : "";
                j6Var.a();
                j6Var.c(G, true, true);
                break;
            case 14:
                ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) bVar.f);
                break;
            case 15:
                y yVar = (y) view;
                CharSequence charSequence2 = bVar.c;
                boolean z15 = bVar.b;
                boolean z16 = bVar.g;
                yVar.K = bVar.l;
                yVar.f(charSequence2, z15, z16);
                break;
            case 16:
                l lVar = (l) view;
                lVar.setCount(bVar.i);
                lVar.setAfterTextChangedListener(this.s);
                break;
            case 17:
                w wVar = (w) view;
                TLObject tLObject2 = bVar.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i20 = bVar.i;
                long j10 = bVar.h;
                boolean z17 = bVar.b;
                TextView textView = wVar.f;
                j6 j6Var2 = wVar.d;
                j6 j6Var3 = wVar.e;
                boolean z18 = wVar.r == tL_starsGiveawayOption;
                wVar.a.a(z17, z18);
                wVar.r = tL_starsGiveawayOption;
                if (z18) {
                    j6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    j6Var2.c(wVar.h, false, true);
                    j6Var3.c(wVar.n, z18, true);
                    textView.setText("");
                } else {
                    j6Var2.c(id.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    j6Var3.c(id.H(',', "BoostingStarOptionPerUser", (int) j10), z18, true);
                    textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i21 = i20 + 1;
                wVar.s = i21;
                if (!z18) {
                    wVar.w.e(true, i21);
                }
                wVar.invalidate();
                break;
        }
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        f6 f6Var = this.d;
        switch (i7) {
            case 2:
                view = new yg.d(context, f6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i10 = k6.a7;
                View y6Var = new y6(context, k6.w0(i10, f6Var), 0);
                r6.i(i10, y6Var, f6Var);
                view = y6Var;
                break;
            case 5:
                view = new v(context, f6Var);
                break;
            case 6:
                View n4Var = new n4(context, k6.L6, 21, 15, 3, false, false, this.d);
                r6.i(k6.h5, n4Var, f6Var);
                view = n4Var;
                break;
            case 7:
                view = new d0(context, f6Var);
                break;
            case 8:
                view = new yg.b(context, f6Var);
                break;
            case 9:
                view = new yg.g(context, f6Var);
                break;
            case 10:
                view = new yg.h(context, f6Var);
                break;
            case 11:
                yg.u uVar = new yg.u(context, f6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new yg.i(context, f6Var);
                break;
            case 13:
                View xVar = new x(context, f6Var);
                r6.i(k6.h5, xVar, f6Var);
                view = xVar;
                break;
            case 14:
                view = new yg.e(context, f6Var);
                break;
            case 15:
                y yVar = new y(context, f6Var);
                yVar.setHeight(50);
                view = yVar;
                break;
            case 16:
                view = new l(context, f6Var);
                break;
            case 17:
                view = new w(context, f6Var);
                break;
            case 18:
                kc kcVar = new kc(context);
                String M0 = id.M0(2131747837, null);
                boolean z9 = kcVar.c == -1;
                kcVar.c = -1;
                j6 j6Var = kcVar.a;
                j6Var.c(M0, z9, true);
                int i11 = k6.o6;
                k6.v0(i11);
                r6.Z(j6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = kcVar.b;
                r6.t(imageView, i11, null, mode);
                if (z9) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(xq.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                kcVar.d = false;
                kcVar.setWillNotDraw(true);
                view = kcVar;
                break;
            default:
                view = new r(context, f6Var);
                break;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
