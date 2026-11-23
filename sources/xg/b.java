package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import di.xa;
import fi.u3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.r1;
import org.telegram.messenger.ur;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.q9;
import ug.z;
import v4.f1;
import wg.q;
import wg.u;
import yg.d0;
import yg.i;
import yg.l;
import yg.r;
import yg.v;
import yg.w;
import yg.x;
import yg.y;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b extends rg.b {
    public final h6 d;
    public ek0 f;
    public u h;
    public u n;
    public r r;
    public u s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public b(h6 h6Var) {
        this.d = h6Var;
        z zVar = new z(this, 6);
        ur a02 = ur.a0(k10.t0);
        a02.a.c(new q(2, a02, zVar));
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 2 || i7 == 11 || i7 == 8 || i7 == 10 || i7 == 15 || i7 == 12 || i7 == 17 || i7 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = np.u1(k10.t0).P0(chat.id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.x;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i7 = 0; i7 < this.e.size(); i7++) {
            if (((a) this.e.get(i7)).a == 7) {
                g(i7);
            }
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((a) this.e.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        a aVar = (a) this.e.get(i7);
        if (i10 == 0) {
            r rVar = (r) view;
            this.r = rVar;
            rVar.setBoostViaGifsText(this.w);
            this.r.setStars(aVar.g);
            return;
        }
        if (i10 == 2) {
            yg.d dVar = (yg.d) view;
            int i11 = aVar.l;
            int i12 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            q9 q9Var = dVar.c;
            h6 h6Var = dVar.a;
            u3 u3Var = dVar.d;
            m5 m5Var = dVar.e;
            b9 b9Var = dVar.b;
            boolean z11 = dVar.s == i11;
            dVar.s = i11;
            if (i11 == 0) {
                u3Var.k(hd.N0(2131753538, null));
                dVar.setSubtitle(hd.N0(2131753164, null));
                t6.X(m5Var, m6.r5, h6Var);
                b9Var.g(16);
                b9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                t6.Z(dVar, dVar.getContext(), R.drawable.greydivider_bottom, m6.b7);
            } else if (i11 == 1) {
                u3Var.k(hd.N0(2131753590, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(j6.m(p10.q(user), m5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.N0(2131753282, null)));
                }
                t6.X(m5Var, m6.n5, h6Var);
                b9Var.g(6);
                b9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                t6.Z(dVar, dVar.getContext(), R.drawable.greydivider_top, m6.b7);
            } else if (i11 == 2) {
                u3Var.k(hd.N0(2131753329, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(j6.m(p10.q(user), m5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.N0(2131753164, null)));
                }
                t6.X(m5Var, m6.n5, h6Var);
                b9Var.g(25);
                b9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                t6.Z(dVar, dVar.getContext(), R.drawable.greydivider_bottom, m6.b7);
            } else if (i11 == 3) {
                u3Var.k(n8.b(hd.N0(2131753254, null)));
                dVar.setSubtitle(hd.N0(2131753164, null));
                t6.X(m5Var, m6.r5, h6Var);
                b9Var.g(26);
                b9Var.i(-146917, -625593);
                dVar.setDivider(false);
                t6.Z(dVar, dVar.getContext(), R.drawable.greydivider_top, m6.b7);
            }
            dVar.f.a(z10, z11);
            q9Var.setImageDrawable(b9Var);
            q9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        if (i10 == 5) {
            v vVar = (v) view;
            List list = aVar.k;
            int i13 = aVar.i;
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
            ((o4) view).setText(aVar.c);
            return;
        }
        if (i10 == 7) {
            d0 d0Var = (d0) view;
            d0Var.setText(aVar.c);
            d0Var.setBackground(aVar.g);
            return;
        }
        switch (i10) {
            case 9:
                yg.g gVar = (yg.g) view;
                TLRPC.InputPeer inputPeer = aVar.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = aVar.e;
                    gVar.f(chat, aVar.i, aVar.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(inputPeer.chat_id));
                    gVar.f(O0, aVar.i, aVar.g, F(O0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat O02 = np.u1(k10.t0).O0(Long.valueOf(inputPeer.channel_id));
                    gVar.f(O02, aVar.i, aVar.g, F(O02));
                }
                gVar.setChatDeleteListener(this.n);
                break;
            case 10:
                ((yg.h) view).setDate(aVar.h);
                break;
            case 11:
                yg.u uVar = (yg.u) view;
                int i15 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat2 = this.w;
                u3 u3Var2 = uVar.d;
                uVar.s = i15;
                boolean V = v3.V(chat2);
                if (i15 == 0) {
                    u3Var2.k(hd.a0(null, null, V ? 2131753595 : 2131753596, new Object[0]));
                } else if (i15 == 1) {
                    u3Var2.k(hd.a0(null, null, V ? 2131753333 : 2131753334, new Object[0]));
                }
                uVar.f.a(z12, false);
                uVar.setDivider(z13);
                t6.X(uVar.e, m6.n5, uVar.a);
                if (list2.size() == 0) {
                    uVar.setSubtitle(uVar.e(hd.N0(2131753519, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries1", null, 2131753518, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries2", null, 2131753517, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries3", null, 2131753516, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    uVar.setSubtitle(uVar.e(hd.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                i iVar = (i) view;
                TLObject tLObject = aVar.m;
                int i16 = aVar.i;
                int i17 = aVar.j;
                long j3 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                u3 u3Var3 = iVar.d;
                iVar.w = tLObject;
                if (i16 >= 12) {
                    u3Var3.k(hd.G(1, "Years", new Object[0]));
                } else {
                    u3Var3.k(hd.G(i16, "Months", new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r1.i().f(i17 > 0 ? j3 / i17 : j3, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i17);
                iVar.setSubtitle(sb2.toString());
                m5 m5Var2 = iVar.s;
                r1 i18 = r1.i();
                if (i17 <= 0) {
                    j3 = 0;
                }
                m5Var2.l(i18.f(j3, charSequence.toString()), false);
                iVar.setDivider(z14);
                iVar.f.a(z15, false);
                break;
            case 13:
                x xVar = (x) view;
                xVar.setText(aVar.c);
                int i19 = aVar.i;
                o6 o6Var = xVar.r;
                String G = i19 > 0 ? hd.G(i19, "BoostingBoostsCountTitle", Integer.valueOf(i19)) : "";
                o6Var.a();
                o6Var.c(G, true, true);
                break;
            case 14:
                ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
                break;
            case 15:
                y yVar = (y) view;
                CharSequence charSequence2 = aVar.c;
                boolean z16 = aVar.b;
                boolean z17 = aVar.g;
                yVar.L = aVar.l;
                yVar.f(charSequence2, z16, z17);
                break;
            case 16:
                l lVar = (l) view;
                lVar.setCount(aVar.i);
                lVar.setAfterTextChangedListener(this.s);
                break;
            case 17:
                w wVar = (w) view;
                TLObject tLObject2 = aVar.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i20 = aVar.i;
                long j10 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = wVar.f;
                o6 o6Var2 = wVar.d;
                o6 o6Var3 = wVar.e;
                boolean z19 = wVar.r == tL_starsGiveawayOption;
                wVar.a.a(z18, z19);
                wVar.r = tL_starsGiveawayOption;
                if (z19) {
                    o6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    o6Var2.c(wVar.h, false, true);
                    o6Var3.c(wVar.n, z19, true);
                    textView.setText("");
                } else {
                    o6Var2.c(hd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    o6Var3.c(hd.H(',', "BoostingStarOptionPerUser", (int) j10), z19, true);
                    textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i21 = i20 + 1;
                wVar.s = i21;
                if (!z19) {
                    wVar.w.e(true, i21);
                }
                wVar.invalidate();
                break;
        }
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        h6 h6Var = this.d;
        switch (i7) {
            case 2:
                view = new yg.d(context, h6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i10 = m6.a7;
                View z6Var = new z6(context, m6.w0(i10, h6Var), 0);
                t6.h(i10, z6Var, h6Var);
                view = z6Var;
                break;
            case 5:
                view = new v(context, h6Var);
                break;
            case 6:
                View o4Var = new o4(context, m6.L6, 21, 15, 3, false, false, this.d);
                t6.h(m6.h5, o4Var, h6Var);
                view = o4Var;
                break;
            case 7:
                view = new d0(context, h6Var);
                break;
            case 8:
                view = new yg.b(context, h6Var);
                break;
            case 9:
                view = new yg.g(context, h6Var);
                break;
            case 10:
                view = new yg.h(context, h6Var);
                break;
            case 11:
                yg.u uVar = new yg.u(context, h6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new i(context, h6Var);
                break;
            case 13:
                View xVar = new x(context, h6Var);
                t6.h(m6.h5, xVar, h6Var);
                view = xVar;
                break;
            case 14:
                view = new yg.e(context, h6Var);
                break;
            case 15:
                y yVar = new y(context, h6Var);
                yVar.setHeight(50);
                view = yVar;
                break;
            case 16:
                view = new l(context, h6Var);
                break;
            case 17:
                view = new w(context, h6Var);
                break;
            case 18:
                xa xaVar = new xa(context);
                String N0 = hd.N0(2131747642, null);
                boolean z10 = xaVar.c == -1;
                xaVar.c = -1;
                o6 o6Var = xaVar.a;
                o6Var.c(N0, z10, true);
                int i11 = m6.o6;
                m6.v0(i11);
                t6.Y(o6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = xaVar.b;
                t6.s(imageView, i11, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(nr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                xaVar.d = false;
                xaVar.setWillNotDraw(true);
                view = xaVar;
                break;
            default:
                view = new r(context, h6Var);
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
