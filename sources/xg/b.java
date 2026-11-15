package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import di.ta;
import fi.w3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.r1;
import org.telegram.messenger.t3;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.uj0;
import ug.p1;
import ug.t1;
import v4.e1;
import wg.s;
import yg.d0;
import yg.l;
import yg.r;
import yg.u;
import yg.v;
import yg.w;
import yg.x;
import yg.y;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b extends rg.b {
    public final e6 d;
    public uj0 f;
    public s h;
    public s n;
    public r r;
    public s s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public b(e6 e6Var) {
        this.d = e6Var;
        p1 p1Var = new p1(this, 5);
        vr a02 = vr.a0(m10.t0);
        a02.a.c(new t1(7, a02, p1Var));
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 2 || i7 == 11 || i7 == 8 || i7 == 10 || i7 == 15 || i7 == 12 || i7 == 17 || i7 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = np.s1(m10.t0).N0(chat.id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
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

    @Override // v4.h0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((a) this.e.get(i7)).a;
    }

    @Override // v4.h0
    public final void t(e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
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
            i9 i9Var = dVar.c;
            e6 e6Var = dVar.a;
            w3 w3Var = dVar.d;
            j5 j5Var = dVar.e;
            t8 t8Var = dVar.b;
            boolean z11 = dVar.s == i11;
            dVar.s = i11;
            if (i11 == 0) {
                w3Var.k(hd.M0(2131753541, null));
                dVar.setSubtitle(hd.M0(2131753167, null));
                q6.X(j5Var, j6.r5, e6Var);
                t8Var.g(16);
                t8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                q6.Z(dVar, dVar.getContext(), R.drawable.greydivider_bottom, j6.b7);
            } else if (i11 == 1) {
                w3Var.k(hd.M0(2131753593, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(org.telegram.messenger.j6.m(q10.p(user), j5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.M0(2131753285, null)));
                }
                q6.X(j5Var, j6.n5, e6Var);
                t8Var.g(6);
                t8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                q6.Z(dVar, dVar.getContext(), R.drawable.greydivider_top, j6.b7);
            } else if (i11 == 2) {
                w3Var.k(hd.M0(2131753332, null));
                if (i12 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(org.telegram.messenger.j6.m(q10.p(user), j5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i12 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i12, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.M0(2131753167, null)));
                }
                q6.X(j5Var, j6.n5, e6Var);
                t8Var.g(25);
                t8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                q6.Z(dVar, dVar.getContext(), R.drawable.greydivider_bottom, j6.b7);
            } else if (i11 == 3) {
                w3Var.k(l8.b(hd.M0(2131753257, null)));
                dVar.setSubtitle(hd.M0(2131753167, null));
                q6.X(j5Var, j6.r5, e6Var);
                t8Var.g(26);
                t8Var.i(-146917, -625593);
                dVar.setDivider(false);
                q6.Z(dVar, dVar.getContext(), R.drawable.greydivider_top, j6.b7);
            }
            dVar.f.a(z10, z11);
            i9Var.setImageDrawable(t8Var);
            i9Var.setRoundRadius(g0.L(20.0f));
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
                yg.g gVar = (yg.g) view;
                TLRPC.InputPeer inputPeer = aVar.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = aVar.e;
                    gVar.f(chat, aVar.i, aVar.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M0 = np.s1(m10.t0).M0(Long.valueOf(inputPeer.chat_id));
                    gVar.f(M0, aVar.i, aVar.g, F(M0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M02 = np.s1(m10.t0).M0(Long.valueOf(inputPeer.channel_id));
                    gVar.f(M02, aVar.i, aVar.g, F(M02));
                }
                gVar.setChatDeleteListener(this.n);
                break;
            case 10:
                ((yg.h) view).setDate(aVar.h);
                break;
            case 11:
                u uVar = (u) view;
                int i15 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat2 = this.w;
                w3 w3Var2 = uVar.d;
                uVar.s = i15;
                boolean V = t3.V(chat2);
                if (i15 == 0) {
                    w3Var2.k(hd.a0(null, null, V ? 2131753598 : 2131753599, new Object[0]));
                } else if (i15 == 1) {
                    w3Var2.k(hd.a0(null, null, V ? 2131753336 : 2131753337, new Object[0]));
                }
                uVar.f.a(z12, false);
                uVar.setDivider(z13);
                q6.X(uVar.e, j6.n5, uVar.a);
                if (list2.size() == 0) {
                    uVar.setSubtitle(uVar.e(hd.M0(2131753522, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    uVar.setSubtitle(uVar.e(hd.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                yg.i iVar = (yg.i) view;
                TLObject tLObject = aVar.m;
                int i16 = aVar.i;
                int i17 = aVar.j;
                long j3 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                w3 w3Var3 = iVar.d;
                iVar.w = tLObject;
                if (i16 >= 12) {
                    w3Var3.k(hd.G(1, "Years", new Object[0]));
                } else {
                    w3Var3.k(hd.G(i16, "Months", new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r1.i().f(i17 > 0 ? j3 / i17 : j3, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i17);
                iVar.setSubtitle(sb2.toString());
                j5 j5Var2 = iVar.s;
                r1 i18 = r1.i();
                if (i17 <= 0) {
                    j3 = 0;
                }
                j5Var2.l(i18.f(j3, charSequence.toString()), false);
                iVar.setDivider(z14);
                iVar.f.a(z15, false);
                break;
            case 13:
                x xVar = (x) view;
                xVar.setText(aVar.c);
                int i19 = aVar.i;
                h6 h6Var = xVar.r;
                String G = i19 > 0 ? hd.G(i19, "BoostingBoostsCountTitle", Integer.valueOf(i19)) : "";
                h6Var.a();
                h6Var.c(G, true, true);
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
                    h6Var2.c(hd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    h6Var3.c(hd.H(',', "BoostingStarOptionPerUser", (int) j10), z19, true);
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

    @Override // v4.h0
    public final e1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        e6 e6Var = this.d;
        switch (i7) {
            case 2:
                view = new yg.d(context, e6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i10 = j6.a7;
                View x6Var = new x6(context, j6.w0(i10, e6Var), 0);
                q6.h(i10, x6Var, e6Var);
                view = x6Var;
                break;
            case 5:
                view = new v(context, e6Var);
                break;
            case 6:
                View n4Var = new n4(context, j6.L6, 21, 15, 3, false, false, this.d);
                q6.h(j6.h5, n4Var, e6Var);
                view = n4Var;
                break;
            case 7:
                view = new d0(context, e6Var);
                break;
            case 8:
                view = new yg.b(context, e6Var);
                break;
            case 9:
                view = new yg.g(context, e6Var);
                break;
            case 10:
                view = new yg.h(context, e6Var);
                break;
            case 11:
                u uVar = new u(context, e6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new yg.i(context, e6Var);
                break;
            case 13:
                View xVar = new x(context, e6Var);
                q6.h(j6.h5, xVar, e6Var);
                view = xVar;
                break;
            case 14:
                view = new yg.e(context, e6Var);
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
                ta taVar = new ta(context);
                String M0 = hd.M0(2131747836, null);
                boolean z10 = taVar.c == -1;
                taVar.c = -1;
                h6 h6Var = taVar.a;
                h6Var.c(M0, z10, true);
                int i11 = j6.o6;
                j6.v0(i11);
                q6.Y(h6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = taVar.b;
                q6.s(imageView, i11, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(er.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                taVar.d = false;
                taVar.setWillNotDraw(true);
                view = taVar;
                break;
            default:
                view = new r(context, e6Var);
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
