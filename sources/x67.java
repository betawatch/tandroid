// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x67 extends c79 {
    public final Context c;
    public final /* synthetic */ z67 d;

    public x67(z67 z67Var, Context context) {
        this.d = z67Var;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
            return ((lj6) f89Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // j79
    public final int b() {
        return this.d.R;
    }

    @Override // j79
    public final int d(int i) {
        z67 z67Var = this.d;
        if (z67Var.S.contains(Integer.valueOf(i))) {
            return 1;
        }
        if (i == z67Var.I || i == z67Var.P) {
            return 2;
        }
        if (i == z67Var.L) {
            return 3;
        }
        if (i == z67Var.M) {
            return 4;
        }
        if (i == z67Var.O) {
            return 5;
        }
        if (i == z67Var.Q) {
            return 6;
        }
        return i == z67Var.N ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        String format;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = f89Var.f;
        View view = f89Var.a;
        byte b = 11;
        z67 z67Var = this.d;
        if (i7 != 0) {
            if (i7 == 1) {
                yob.Z(view, this.c, R.drawable.greydivider_bottom, aob.b7);
                return;
            }
            if (i7 == 2) {
                mf5 mf5Var = (mf5) view;
                if (i == z67Var.P) {
                    mf5Var.setTopMargin(9);
                    mf5Var.setPadding(0, 0, 0, hl.L(8.0f));
                    mf5Var.setText(ob6.a0("StatisticOverview", null, 2131744552, new Object[0]));
                    return;
                } else {
                    mf5Var.setTopMargin(11);
                    mf5Var.setPadding(0, 0, 0, 0);
                    mf5Var.setText(ob6.a0("PublicShares", null, 2131746310, new Object[0]));
                    return;
                }
            }
            if (i7 == 4) {
                g1b g1bVar = (g1b) view;
                g1bVar.e(z67Var.r, false);
                g1bVar.setLayoutParams(new r79(-1, -2));
                return;
            }
            if (i7 != 5) {
                if (i7 == 7) {
                    g1b g1bVar2 = (g1b) view;
                    g1bVar2.e(z67Var.s, false);
                    g1bVar2.setLayoutParams(new r79(-1, -2));
                    return;
                }
                return;
            }
            y67 y67Var = (y67) view;
            TextView[] textViewArr = y67Var.a;
            TextView[] textViewArr2 = y67Var.b;
            z67 z67Var2 = y67Var.c;
            t1b t1bVar = z67Var2.f0;
            r47 r47Var = z67Var2.n;
            if (t1bVar != null) {
                i3 = t1bVar.d();
                i6 = t1bVar.a();
                i4 = t1bVar.c();
            } else {
                boolean w4 = r47Var.w4();
                TL_stories.StoryItem storyItem = r47Var.l;
                int i8 = w4 ? storyItem.views.views_count : r47Var.k.views;
                int i9 = r47Var.w4() ? storyItem.views.forwards_count : r47Var.k.forwards;
                if (r47Var.w4()) {
                    i5 = storyItem.views.reactions_count;
                } else if (r47Var.k.reactions != null) {
                    i5 = 0;
                    for (int i10 = 0; i10 < r47Var.k.reactions.results.size(); i10++) {
                        i5 += r47Var.k.reactions.results.get(i10).count;
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
            textViewArr[0].setText(hl.o0(i3, 0));
            textViewArr2[0].setText(ob6.M0(2131744550, null));
            textViewArr[1].setText(hl.o0(z67Var2.V, 0));
            textViewArr2[1].setText(ob6.a0("PublicShares", null, 2131746310, new Object[0]));
            textViewArr[2].setText(hl.o0(i4, 0));
            textViewArr2[2].setText(ob6.a0("Reactions", null, 2131746114, new Object[0]));
            TLRPC.ChatFull chatFull = z67Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i4 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(hl.o0(Math.max(0, i6 - z67Var2.V), 0));
            textViewArr2[3].setText(ob6.a0("PrivateShares", null, 2131746473, new Object[0]));
            y67Var.a();
            return;
        }
        lj6 lj6Var = (lj6) view;
        int i11 = z67Var.J;
        r47 r47Var2 = (i < i11 || i >= z67Var.K) ? null : (r47) z67Var.y.get(i - i11);
        TLRPC.Message message = r47Var2.k;
        TL_stories.StoryItem storyItem2 = r47Var2.l;
        long B0 = r47.B0(message);
        if (r47Var2.w4()) {
            TLObject X1 = wf3.D(B0) ? z67Var.getMessagesController().X1(Long.valueOf(B0)) : z67Var.getMessagesController().M0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            lj6Var.c(X1, null, (storyViews == null || (i2 = storyViews.views_count) == 0) ? ob6.M0(2131747863, null) : ob6.G(i2, "Views", new Object[0]), i != z67Var.K - 1);
            uv5 uv5Var = new uv5(this, r47Var2, b);
            lj6Var.r = storyItem2;
            lj6Var.a.setOnClickListener(uv5Var);
            return;
        }
        lj6Var.r = null;
        lj6Var.a.setOnClickListener(null);
        if (!wf3.D(B0)) {
            TLRPC.Chat M0 = z67Var.getMessagesController().M0(Long.valueOf(-B0));
            if (!xc2.T(M0) || M0.megagroup) {
                int i12 = M0.participants_count;
                chat2 = M0;
                if (i12 != 0) {
                    format = String.format("%1$s, %2$s", ob6.G(i12, "Members", new Object[0]), ob6.G(r47Var2.k.views, "Views", new Object[0]));
                    chat = M0;
                }
            } else {
                format = ob6.G(r47Var2.k.views, "Views", new Object[0]);
                chat = M0;
            }
            if (chat == null) {
                lj6Var.c(chat, null, format, i != z67Var.K - 1);
                return;
            }
            return;
        }
        chat2 = z67Var.getMessagesController().X1(Long.valueOf(B0));
        format = null;
        chat = chat2;
        if (chat == null) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        z67 z67Var = this.d;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                z67Var.getResourceProvider();
                view = new sca(context, (uh9) null);
            } else if (i != 2) {
                if (i != 4) {
                    if (i == 5) {
                        view = new y67(z67Var, context);
                        view.setLayoutParams(new r79(-1, -2));
                    } else if (i == 6) {
                        view = new t24(context, 16);
                        view.setLayoutParams(new r79(-1, 16));
                    } else if (i != 7) {
                        view = new ua6(context, hl.L(40.0f), hl.L(120.0f));
                    }
                }
                int i2 = i == 4 ? 1 : 2;
                of0 of0Var = new of0(z67Var.getResourceProvider());
                z67Var.d0 = of0Var;
                view = new w67(this, this.c, i2, of0Var, z67Var.getResourceProvider());
            } else {
                mf5 mf5Var = new mf5(this.c, aob.G6, 16, 11, false, z67Var.getResourceProvider());
                mf5Var.setHeight(43);
                view = mf5Var;
            }
        } else {
            lj6 lj6Var = new lj6(this.c, 6, 2, false, z67Var.getResourceProvider());
            lj6Var.setDividerColor(aob.d7);
            view = lj6Var;
        }
        return new n69(view);
    }
}
