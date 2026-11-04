package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ci.eb;
import ei.e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.messenger.r1;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import u4.d1;
import xg.u;
import zg.d0;
import zg.i;
import zg.l;
import zg.r;
import zg.v;
import zg.w;
import zg.x;
import zg.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends sg.b {
    public final e6 d;
    public tj0 f;
    public u h;
    public u n;
    public r r;
    public u s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public b(e6 e6Var) {
        this.d = e6Var;
        xg.d dVar = new xg.d(this, 3);
        qr a02 = qr.a0(h10.t0);
        a02.a.c(new u9.a(25, a02, dVar));
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 2 || i3 == 11 || i3 == 8 || i3 == 10 || i3 == 15 || i3 == 12 || i3 == 17 || i3 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i3;
        TLRPC.ChatFull N0 = hp.s1(h10.t0).N0(chat.id);
        if (N0 != null && (i3 = N0.participants_count) > 0) {
            return i3;
        }
        HashMap hashMap = this.x;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            if (((a) this.e.get(i3)).a == 7) {
                g(i3);
            }
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.e.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((a) this.e.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        a aVar = (a) this.e.get(i3);
        if (i10 == 0) {
            r rVar = (r) view;
            this.r = rVar;
            rVar.setBoostViaGifsText(this.w);
            this.r.setStars(aVar.g);
            return;
        }
        if (i10 == 2) {
            zg.d dVar = (zg.d) view;
            int i11 = aVar.l;
            int i12 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            k9 k9Var = dVar.c;
            e6 e6Var = dVar.a;
            e4 e4Var = dVar.d;
            k5 k5Var = dVar.e;
            u8 u8Var = dVar.b;
            boolean z11 = dVar.s == i11;
            dVar.s = i11;
            if (i11 == 0) {
                e4Var.k(bd.M0(2131753541, null));
                dVar.setSubtitle(bd.M0(2131753167, null));
                r6.Y(k5Var, k6.r5, e6Var);
                u8Var.g(16);
                u8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_bottom, k6.b7);
            } else if (i11 == 1) {
                e4Var.k(bd.M0(2131753593, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(l10.p(user), k5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(bd.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(bd.M0(2131753285, null)));
                }
                r6.Y(k5Var, k6.n5, e6Var);
                u8Var.g(6);
                u8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_top, k6.b7);
            } else if (i11 == 2) {
                e4Var.k(bd.M0(2131753332, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(l10.p(user), k5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(bd.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(bd.M0(2131753167, null)));
                }
                r6.Y(k5Var, k6.n5, e6Var);
                u8Var.g(25);
                u8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_bottom, k6.b7);
            } else if (i11 == 3) {
                e4Var.k(l8.b(bd.M0(2131753257, null)));
                dVar.setSubtitle(bd.M0(2131753167, null));
                r6.Y(k5Var, k6.r5, e6Var);
                u8Var.g(26);
                u8Var.i(-146917, -625593);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), R.drawable.greydivider_top, k6.b7);
            }
            dVar.f.a(z10, z11);
            k9Var.setImageDrawable(u8Var);
            k9Var.setRoundRadius(g0.L(20.0f));
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
            ((n4) view).setText(aVar.c);
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
                zg.g gVar = (zg.g) view;
                TLRPC.InputPeer inputPeer = aVar.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = aVar.e;
                    gVar.f(chat, aVar.i, aVar.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M0 = hp.s1(h10.t0).M0(Long.valueOf(inputPeer.chat_id));
                    gVar.f(M0, aVar.i, aVar.g, F(M0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M02 = hp.s1(h10.t0).M0(Long.valueOf(inputPeer.channel_id));
                    gVar.f(M02, aVar.i, aVar.g, F(M02));
                }
                gVar.setChatDeleteListener(this.n);
                break;
            case 10:
                ((zg.h) view).setDate(aVar.h);
                break;
            case 11:
                zg.u uVar = (zg.u) view;
                int i15 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat2 = this.w;
                e4 e4Var2 = uVar.d;
                uVar.s = i15;
                boolean V = t3.V(chat2);
                if (i15 == 0) {
                    e4Var2.k(bd.a0(null, null, V ? 2131753598 : 2131753599, new Object[0]));
                } else if (i15 == 1) {
                    e4Var2.k(bd.a0(null, null, V ? 2131753336 : 2131753337, new Object[0]));
                }
                uVar.f.a(z12, false);
                uVar.setDivider(z13);
                r6.Y(uVar.e, k6.n5, uVar.a);
                if (list2.size() == 0) {
                    uVar.setSubtitle(uVar.e(bd.M0(2131753522, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        uVar.setSubtitle(uVar.e(bd.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        uVar.setSubtitle(uVar.e(bd.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        uVar.setSubtitle(uVar.e(bd.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    uVar.setSubtitle(uVar.e(bd.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                i iVar = (i) view;
                TLObject tLObject = aVar.m;
                int i16 = aVar.i;
                int i17 = aVar.j;
                long j10 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                e4 e4Var3 = iVar.d;
                iVar.w = tLObject;
                if (i16 >= 12) {
                    e4Var3.k(bd.G(1, "Years", new Object[0]));
                } else {
                    e4Var3.k(bd.G(i16, "Months", new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r1.i().f(i17 > 0 ? j10 / i17 : j10, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i17);
                iVar.setSubtitle(sb2.toString());
                k5 k5Var2 = iVar.s;
                r1 i18 = r1.i();
                if (i17 <= 0) {
                    j10 = 0;
                }
                k5Var2.l(i18.f(j10, charSequence.toString()), false);
                iVar.setDivider(z14);
                iVar.f.a(z15, false);
                break;
            case 13:
                x xVar = (x) view;
                xVar.setText(aVar.c);
                int i19 = aVar.i;
                h6 h6Var = xVar.r;
                String G = i19 > 0 ? bd.G(i19, "BoostingBoostsCountTitle", Integer.valueOf(i19)) : "";
                h6Var.a();
                h6Var.c(G, true, true);
                break;
            case 14:
                ((zg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
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
                long j11 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = wVar.f;
                h6 h6Var2 = wVar.d;
                h6 h6Var3 = wVar.e;
                boolean z19 = wVar.r == tL_starsGiveawayOption;
                wVar.a.a(z18, z19);
                wVar.r = tL_starsGiveawayOption;
                if (z19) {
                    h6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    h6Var2.c(wVar.h, false, true);
                    h6Var3.c(wVar.n, z19, true);
                    textView.setText("");
                } else {
                    h6Var2.c(bd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    h6Var3.c(bd.H(',', "BoostingStarOptionPerUser", (int) j11), z19, true);
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

    @Override // u4.h0
    public final d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = viewGroup.getContext();
        e6 e6Var = this.d;
        switch (i3) {
            case 2:
                view = new zg.d(context, e6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i10 = k6.a7;
                View x6Var = new x6(context, k6.w0(i10, e6Var), 0);
                r6.i(i10, x6Var, e6Var);
                view = x6Var;
                break;
            case 5:
                view = new v(context, e6Var);
                break;
            case 6:
                View n4Var = new n4(context, k6.L6, 21, 15, 3, false, false, this.d);
                r6.i(k6.h5, n4Var, e6Var);
                view = n4Var;
                break;
            case 7:
                view = new d0(context, e6Var);
                break;
            case 8:
                view = new zg.b(context, e6Var);
                break;
            case 9:
                view = new zg.g(context, e6Var);
                break;
            case 10:
                view = new zg.h(context, e6Var);
                break;
            case 11:
                zg.u uVar = new zg.u(context, e6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new i(context, e6Var);
                break;
            case 13:
                View xVar = new x(context, e6Var);
                r6.i(k6.h5, xVar, e6Var);
                view = xVar;
                break;
            case 14:
                view = new zg.e(context, e6Var);
                break;
            case 15:
                y yVar = new y(context, e6Var);
                yVar.setHeight(50);
                view = yVar;
                break;
            case 16:
                view = new l(context, e6Var);
                break;
            case 17:
                view = new w(context, e6Var);
                break;
            case 18:
                eb ebVar = new eb(context);
                String M0 = bd.M0(2131747844, null);
                boolean z10 = ebVar.c == -1;
                ebVar.c = -1;
                h6 h6Var = ebVar.a;
                h6Var.c(M0, z10, true);
                int i11 = k6.o6;
                k6.v0(i11);
                r6.Z(h6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = ebVar.b;
                r6.t(imageView, i11, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(xq.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                ebVar.d = false;
                ebVar.setWillNotDraw(true);
                view = ebVar;
                break;
            default:
                view = new r(context, e6Var);
                break;
        }
        return p1.p(view, view, -1, -2);
    }
}
