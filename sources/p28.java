// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p28 extends q59 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ w28 e;

    /* JADX WARN: Multi-variable type inference failed */
    public p28(w28 w28Var, Context context, int i) {
        this.e = w28Var;
        this.c = context;
        this.d = i;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 3 || i == 6 || i == 8 || i == 12;
    }

    @Override // y59
    public final int b() {
        return this.e.l0;
    }

    @Override // y59
    public final int d(int i) {
        w28 w28Var = this.e;
        if (i == w28Var.S || i == w28Var.h0 || i == w28Var.U || i == w28Var.a0) {
            return 2;
        }
        if (i == w28Var.R) {
            return 1;
        }
        if (i == w28Var.T) {
            return 3;
        }
        if (i == w28Var.V) {
            return 5;
        }
        if (i == w28Var.W) {
            return 6;
        }
        if (i == w28Var.i0) {
            return 10;
        }
        if (i == w28Var.j0) {
            return 11;
        }
        if (i == w28Var.b0) {
            return 7;
        }
        if (i >= w28Var.c0 && i < w28Var.d0) {
            return w28Var.L == null ? 8 : 12;
        }
        if (i < w28Var.e0 || i >= w28Var.f0) {
            return (i == w28Var.l0 - 1 || i == w28Var.k0) ? 4 : 2;
        }
        return 9;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String M0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = u69Var.a;
        w28 w28Var = this.e;
        HashMap hashMap = w28Var.N;
        ArrayList arrayList = w28Var.m0;
        d38 d38Var = w28Var.q0;
        ArrayList arrayList2 = w28Var.M;
        int d = d(i);
        boolean z = this.d;
        int i3 = 1;
        r11 = true;
        boolean z2 = true;
        byte b = 0;
        switch (d) {
            case 1:
                anb.h(cmb.c6, d38Var.getResourceProvider(), view);
                ((z28) view).updateColors();
                break;
            case 2:
                njb njbVar = (njb) view;
                njbVar.setFixedSize(0);
                if (i != w28Var.S) {
                    if (i != w28Var.a0) {
                        if (i == w28Var.h0) {
                            njbVar.setText(jb6.M0(2131743427, null));
                            break;
                        }
                    } else {
                        njbVar.setText("");
                        njbVar.setFixedSize(12);
                        break;
                    }
                } else {
                    if (z) {
                        M0 = jb6.M0(d38Var.a ? 2131752380 : 2131743439, null);
                    } else {
                        M0 = jb6.M0(d38Var.a ? 2131752264 : 2131743421, null);
                    }
                    njbVar.setText(gm.D2(gm.N2(M0, -1, 0, new n28(this, z ? 1 : 0), null), true));
                    break;
                }
                break;
            case 3:
                ((v28) view).updateColors();
                break;
            case 6:
                xib xibVar = (xib) view;
                xibVar.updateColors();
                anb.h(cmb.c6, d38Var.getResourceProvider(), xibVar);
                xibVar.updateColors();
                if (i == w28Var.W) {
                    xibVar.k(jb6.M0(d38Var.a ? 2131752266 : 2131743424, null), false);
                    break;
                }
                break;
            case 7:
                jf5 jf5Var = (jf5) view;
                if (i == w28Var.b0) {
                    jf5Var.c(jb6.M0(2131743428, null), false);
                }
                anb.h(cmb.c6, d38Var.getResourceProvider(), jf5Var);
                break;
            case 8:
                j28 j28Var = (j28) view;
                int i4 = i - w28Var.c0;
                if (i4 >= 0 && i4 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i4);
                    j28Var.a(i4, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = w28Var.r;
                    j28Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = w28Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    j28Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                w28Var.G = view;
                c38 c38Var = w28Var.F;
                arrayList2.clear();
                hashMap.clear();
                i2 = ((d) d38Var).currentAccount;
                ArrayList arrayList3 = jva.v(i2, false).I;
                arrayList2.add(jb6.M0(2131749879, null));
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i5);
                    if ((!z || (z == i3 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (w28Var.L == starGift) {
                            i6 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i3);
                        textPaint.setTextSize(gm.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        gn gnVar = new gn(starGift.getDocument(), textPaint.getFontMetricsInt());
                        gnVar.size = gm.L(14.0f);
                        spannableStringBuilder.setSpan(gnVar, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i5++;
                    i3 = 1;
                }
                o28 o28Var = new o28(this, b);
                ArrayList arrayList4 = c38Var.f;
                boolean z3 = c38Var.L == 0;
                c38Var.L = 0;
                c38Var.h = o28Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                c38Var.c.f();
                c38Var.a(i6, z3);
                w28Var.l(c38Var);
                view.post(new l28(w28Var, (byte) 3));
                break;
            case 11:
                ((u28) view).updateColors();
                break;
            case 12:
                ox4 ox4Var = (ox4) view;
                int i7 = i - w28Var.c0;
                if (w28Var.K != null && i7 >= 0 && i7 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
                    ox4Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = w28Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = w28Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z2 = false;
                    }
                    ox4Var.f(z2, false);
                    break;
                }
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        ylb ylbVar;
        View view;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        int i3;
        ylb ylbVar5;
        w28 w28Var = this.e;
        d38 d38Var = w28Var.q0;
        byte b = 1;
        switch (i) {
            case 1:
                Context context = w28Var.getContext();
                i2 = ((d) d38Var).currentAccount;
                ylbVar = ((d) d38Var).resourceProvider;
                z28 z28Var = new z28(this.d ? 1 : 0, i2, ylbVar, context);
                w28Var.f = z28Var;
                anb.h(cmb.c6, d38Var.getResourceProvider(), z28Var);
                z28Var.a(w28Var.h, false);
                z28Var.setOnColorClick(new o28(this, b));
                view = z28Var;
                break;
            case 2:
            default:
                view = new njb(w28Var.getContext(), d38Var.getResourceProvider());
                break;
            case 3:
                v28 v28Var = new v28(w28Var, w28Var.getContext());
                w28Var.E = v28Var;
                v28Var.b(false);
                view = v28Var;
                break;
            case 4:
                View o72Var = new o72(w28Var.getContext(), (byte) 18);
                o72Var.setTag(-33024);
                view = o72Var;
                break;
            case 5:
                View view2 = new View(w28Var.getContext());
                view2.setTag(-33024);
                view = view2;
                break;
            case 6:
                View xibVar = new xib(w28Var.getContext(), d38Var.getResourceProvider());
                anb.h(cmb.c6, d38Var.getResourceProvider(), xibVar);
                view = xibVar;
                break;
            case 7:
                Context context2 = w28Var.getContext();
                ylbVar2 = ((d) d38Var).resourceProvider;
                View jf5Var = new jf5(context2, ylbVar2);
                anb.h(cmb.c6, d38Var.getResourceProvider(), jf5Var);
                view = jf5Var;
                break;
            case 8:
                Context context3 = w28Var.getContext();
                ylbVar3 = ((d) d38Var).resourceProvider;
                View j28Var = new j28(ylbVar3, context3, false);
                j28Var.setTag(-33024);
                view = j28Var;
                break;
            case 9:
                Context context4 = this.c;
                ylbVar4 = ((d) d38Var).resourceProvider;
                tk4 tk4Var = new tk4(context4, ylbVar4);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(35);
                tk4Var.setTag(-33024);
                view = tk4Var;
                break;
            case 10:
                View o72Var2 = new o72(w28Var.getContext(), (byte) 19);
                o72Var2.setTag(-33024);
                view = o72Var2;
                break;
            case 11:
                view = new u28(w28Var, w28Var.getContext());
                break;
            case 12:
                Context context5 = w28Var.getContext();
                i3 = ((d) d38Var).currentAccount;
                ylbVar5 = ((d) d38Var).resourceProvider;
                View ox4Var = new ox4(i3, ylbVar5, context5);
                ox4Var.setTag(-33024);
                view = ox4Var;
                break;
        }
        return new b59(view);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        w28 w28Var = this.e;
        ArrayList arrayList = w28Var.m0;
        int i = u69Var.f;
        View view = u69Var.a;
        if (i == 10) {
            w28Var.G = view;
            view.post(new l28(w28Var, (byte) 2));
            return;
        }
        boolean z = true;
        if (i == 8) {
            j28 j28Var = (j28) view;
            int b = u69Var.b() - w28Var.c0;
            if (b < 0 || b >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b);
            j28Var.a(b, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = w28Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = w28Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z = false;
            }
            j28Var.b(z, false);
            return;
        }
        if (i == 12) {
            ox4 ox4Var = (ox4) view;
            int b2 = u69Var.b() - w28Var.c0;
            if (w28Var.K == null || b2 < 0 || b2 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b2);
            ox4Var.h(tL_starGiftUnique2, false, false, false, true, false);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = w28Var.r;
            if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = w28Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                z = false;
            }
            ox4Var.f(z, false);
        }
    }
}
