// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r67 extends q59 {
    public final Context c;
    public final /* synthetic */ t67 d;

    public r67(t67 t67Var, Context context) {
        this.d = t67Var;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
            return ((ij6) u69Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // y59
    public final int b() {
        return this.d.R;
    }

    @Override // y59
    public final int d(int i) {
        t67 t67Var = this.d;
        if (t67Var.S.contains(Integer.valueOf(i))) {
            return 1;
        }
        if (i == t67Var.I || i == t67Var.P) {
            return 2;
        }
        if (i == t67Var.L) {
            return 3;
        }
        if (i == t67Var.M) {
            return 4;
        }
        if (i == t67Var.O) {
            return 5;
        }
        if (i == t67Var.Q) {
            return 6;
        }
        return i == t67Var.N ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        String format;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = u69Var.f;
        View view = u69Var.a;
        byte b = 9;
        t67 t67Var = this.d;
        if (i7 != 0) {
            if (i7 == 1) {
                anb.Z(view, this.c, R.drawable.greydivider_bottom, cmb.a7);
                return;
            }
            if (i7 == 2) {
                jf5 jf5Var = (jf5) view;
                if (i == t67Var.P) {
                    jf5Var.setTopMargin(9);
                    jf5Var.setPadding(0, 0, 0, gm.L(8.0f));
                    jf5Var.setText(jb6.a0("StatisticOverview", null, 2131744584, new Object[0]));
                    return;
                } else {
                    jf5Var.setTopMargin(11);
                    jf5Var.setPadding(0, 0, 0, 0);
                    jf5Var.setText(jb6.a0("PublicShares", null, 2131746316, new Object[0]));
                    return;
                }
            }
            if (i7 == 4) {
                gza gzaVar = (gza) view;
                gzaVar.e(t67Var.r, false);
                gzaVar.setLayoutParams(new g69(-1, -2));
                return;
            }
            if (i7 != 5) {
                if (i7 == 7) {
                    gza gzaVar2 = (gza) view;
                    gzaVar2.e(t67Var.s, false);
                    gzaVar2.setLayoutParams(new g69(-1, -2));
                    return;
                }
                return;
            }
            s67 s67Var = (s67) view;
            TextView[] textViewArr = s67Var.a;
            TextView[] textViewArr2 = s67Var.b;
            t67 t67Var2 = s67Var.c;
            uza uzaVar = t67Var2.f0;
            k47 k47Var = t67Var2.n;
            if (uzaVar != null) {
                i3 = uzaVar.d();
                i6 = uzaVar.a();
                i4 = uzaVar.c();
            } else {
                boolean w4 = k47Var.w4();
                TL_stories.StoryItem storyItem = k47Var.l;
                int i8 = w4 ? storyItem.views.views_count : k47Var.k.views;
                int i9 = k47Var.w4() ? storyItem.views.forwards_count : k47Var.k.forwards;
                if (k47Var.w4()) {
                    i5 = storyItem.views.reactions_count;
                } else if (k47Var.k.reactions != null) {
                    i5 = 0;
                    for (int i10 = 0; i10 < k47Var.k.reactions.results.size(); i10++) {
                        i5 += k47Var.k.reactions.results.get(i10).count;
                    }
                } else {
                    i3 = i8;
                    i4 = 0;
                    i6 = i9;
                }
                i3 = i8;
                i4 = i5;
                i6 = i9;
            }
            textViewArr[0].setText(gm.o0(i3, 0));
            textViewArr2[0].setText(jb6.M0(2131744582, null));
            textViewArr[1].setText(gm.o0(t67Var2.V, 0));
            textViewArr2[1].setText(jb6.a0("PublicShares", null, 2131746316, new Object[0]));
            textViewArr[2].setText(gm.o0(i4, 0));
            textViewArr2[2].setText(jb6.a0("Reactions", null, 2131746120, new Object[0]));
            TLRPC.ChatFull chatFull = t67Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i4 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(gm.o0(Math.max(0, i6 - t67Var2.V), 0));
            textViewArr2[3].setText(jb6.a0("PrivateShares", null, 2131746479, new Object[0]));
            s67Var.a();
            return;
        }
        ij6 ij6Var = (ij6) view;
        int i11 = t67Var.J;
        k47 k47Var2 = (i < i11 || i >= t67Var.K) ? null : (k47) t67Var.y.get(i - i11);
        TLRPC.Message message = k47Var2.k;
        TL_stories.StoryItem storyItem2 = k47Var2.l;
        long B0 = k47.B0(message);
        if (k47Var2.w4()) {
            TLObject W1 = pg3.D(B0) ? t67Var.getMessagesController().W1(Long.valueOf(B0)) : t67Var.getMessagesController().L0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            ij6Var.c(W1, null, (storyViews == null || (i2 = storyViews.views_count) == 0) ? jb6.M0(2131747866, null) : jb6.G(i2, "Views", new Object[0]), i != t67Var.K - 1);
            n06 n06Var = new n06(this, k47Var2, b);
            ij6Var.r = storyItem2;
            ij6Var.a.setOnClickListener(n06Var);
            return;
        }
        ij6Var.r = null;
        ij6Var.a.setOnClickListener(null);
        if (!pg3.D(B0)) {
            TLRPC.Chat L0 = t67Var.getMessagesController().L0(Long.valueOf(-B0));
            if (!sd2.T(L0) || L0.megagroup) {
                int i12 = L0.participants_count;
                chat2 = L0;
                if (i12 != 0) {
                    format = String.format("%1$s, %2$s", jb6.G(i12, "Members", new Object[0]), jb6.G(k47Var2.k.views, "Views", new Object[0]));
                    chat = L0;
                }
            } else {
                format = jb6.G(k47Var2.k.views, "Views", new Object[0]);
                chat = L0;
            }
            if (chat == null) {
                ij6Var.c(chat, null, format, i != t67Var.K - 1);
                return;
            }
            return;
        }
        chat2 = t67Var.getMessagesController().W1(Long.valueOf(B0));
        format = null;
        chat = chat2;
        if (chat == null) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        t67 t67Var = this.d;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                t67Var.getResourceProvider();
                view = new bba(context, (hg9) null);
            } else if (i != 2) {
                if (i != 4) {
                    if (i == 5) {
                        view = new s67(t67Var, context);
                        view.setLayoutParams(new g69(-1, -2));
                    } else if (i == 6) {
                        view = new j34(context, 16);
                        view.setLayoutParams(new g69(-1, 16));
                    } else if (i != 7) {
                        view = new pa6(context, gm.L(40.0f), gm.L(120.0f));
                    }
                }
                int i2 = i == 4 ? 1 : 2;
                mg0 mg0Var = new mg0(t67Var.getResourceProvider());
                t67Var.d0 = mg0Var;
                view = new q67(this, this.c, i2, mg0Var, t67Var.getResourceProvider());
            } else {
                jf5 jf5Var = new jf5(this.c, cmb.F6, 16, 11, false, t67Var.getResourceProvider());
                jf5Var.setHeight(43);
                view = jf5Var;
            }
        } else {
            ij6 ij6Var = new ij6(this.c, 6, 2, false, t67Var.getResourceProvider());
            ij6Var.setDividerColor(cmb.c7);
            view = ij6Var;
        }
        return new b59(view);
    }
}
