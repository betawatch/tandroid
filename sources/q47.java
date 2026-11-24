// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q47 extends n39 {
    public final Context c;
    public final /* synthetic */ s47 d;

    public q47(s47 s47Var, Context context) {
        this.d = s47Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
            return ((gh6) s49Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // w39
    public final int b() {
        return this.d.R;
    }

    @Override // w39
    public final int d(int i) {
        s47 s47Var = this.d;
        if (s47Var.S.contains(Integer.valueOf(i))) {
            return 1;
        }
        if (i == s47Var.I || i == s47Var.P) {
            return 2;
        }
        if (i == s47Var.L) {
            return 3;
        }
        if (i == s47Var.M) {
            return 4;
        }
        if (i == s47Var.O) {
            return 5;
        }
        if (i == s47Var.Q) {
            return 6;
        }
        return i == s47Var.N ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        String format;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6 = s49Var.f;
        View view = s49Var.a;
        byte b = 8;
        s47 s47Var = this.d;
        if (i6 != 0) {
            if (i6 == 1) {
                zkb.Z(view, this.c, R.drawable.greydivider_bottom, bkb.a7);
                return;
            }
            if (i6 == 2) {
                ld5 ld5Var = (ld5) view;
                if (i == s47Var.P) {
                    ld5Var.setTopMargin(9);
                    ld5Var.setPadding(0, 0, 0, gl.L(8.0f));
                    ld5Var.setText(k96.a0("StatisticOverview", null, 2131744658, new Object[0]));
                    return;
                } else {
                    ld5Var.setTopMargin(11);
                    ld5Var.setPadding(0, 0, 0, 0);
                    ld5Var.setText(k96.a0("PublicShares", null, 2131746390, new Object[0]));
                    return;
                }
            }
            if (i6 == 4) {
                dxa dxaVar = (dxa) view;
                dxaVar.e(s47Var.r, false);
                dxaVar.setLayoutParams(new e49(-1, -2));
                return;
            }
            if (i6 != 5) {
                if (i6 == 7) {
                    dxa dxaVar2 = (dxa) view;
                    dxaVar2.e(s47Var.s, false);
                    dxaVar2.setLayoutParams(new e49(-1, -2));
                    return;
                }
                return;
            }
            r47 r47Var = (r47) view;
            TextView[] textViewArr = r47Var.a;
            TextView[] textViewArr2 = r47Var.b;
            s47 s47Var2 = r47Var.c;
            rxa rxaVar = s47Var2.f0;
            k27 k27Var = s47Var2.n;
            if (rxaVar != null) {
                i3 = rxaVar.d();
                i4 = rxaVar.a();
                i5 = rxaVar.c();
                c = 1;
            } else {
                boolean w4 = k27Var.w4();
                TL_stories.StoryItem storyItem = k27Var.l;
                int i7 = w4 ? storyItem.views.views_count : k27Var.k.views;
                int i8 = k27Var.w4() ? storyItem.views.forwards_count : k27Var.k.forwards;
                if (k27Var.w4()) {
                    i3 = i7;
                    i5 = storyItem.views.reactions_count;
                    c = 1;
                } else {
                    c = 1;
                    if (k27Var.k.reactions != null) {
                        int i9 = 0;
                        for (int i10 = 0; i10 < k27Var.k.reactions.results.size(); i10++) {
                            i9 += k27Var.k.reactions.results.get(i10).count;
                        }
                        i3 = i7;
                        i5 = i9;
                    } else {
                        i3 = i7;
                        i4 = i8;
                        i5 = 0;
                    }
                }
                i4 = i8;
            }
            textViewArr[0].setText(gl.o0(i3, 0));
            textViewArr2[0].setText(k96.M0(2131744656, null));
            textViewArr[c].setText(gl.o0(s47Var2.V, 0));
            textViewArr2[c].setText(k96.a0("PublicShares", null, 2131746390, new Object[0]));
            textViewArr[2].setText(gl.o0(i5, 0));
            textViewArr2[2].setText(k96.a0("Reactions", null, 2131746194, new Object[0]));
            TLRPC.ChatFull chatFull = s47Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i5 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(gl.o0(Math.max(0, i4 - s47Var2.V), 0));
            textViewArr2[3].setText(k96.a0("PrivateShares", null, 2131746553, new Object[0]));
            r47Var.a();
            return;
        }
        gh6 gh6Var = (gh6) view;
        int i11 = s47Var.J;
        k27 k27Var2 = (i < i11 || i >= s47Var.K) ? null : (k27) s47Var.y.get(i - i11);
        TLRPC.Message message = k27Var2.k;
        TL_stories.StoryItem storyItem2 = k27Var2.l;
        long B0 = k27.B0(message);
        if (k27Var2.w4()) {
            TLObject V1 = cf3.D(B0) ? s47Var.getMessagesController().V1(Long.valueOf(B0)) : s47Var.getMessagesController().K0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            gh6Var.c(V1, null, (storyViews == null || (i2 = storyViews.views_count) == 0) ? k96.M0(2131747940, null) : k96.G(i2, "Views", new Object[0]), i != s47Var.K + (-1));
            v16 v16Var = new v16(this, k27Var2, b);
            gh6Var.r = storyItem2;
            gh6Var.a.setOnClickListener(v16Var);
            return;
        }
        gh6Var.r = null;
        gh6Var.a.setOnClickListener(null);
        if (!cf3.D(B0)) {
            TLRPC.Chat K0 = s47Var.getMessagesController().K0(Long.valueOf(-B0));
            if (!hc2.T(K0) || K0.megagroup) {
                int i12 = K0.participants_count;
                chat2 = K0;
                if (i12 != 0) {
                    format = String.format("%1$s, %2$s", k96.G(i12, "Members", new Object[0]), k96.G(k27Var2.k.views, "Views", new Object[0]));
                    chat = K0;
                }
            } else {
                format = k96.G(k27Var2.k.views, "Views", new Object[0]);
                chat = K0;
            }
            if (chat == null) {
                gh6Var.c(chat, null, format, i != s47Var.K + (-1));
                return;
            }
            return;
        }
        chat2 = s47Var.getMessagesController().V1(Long.valueOf(B0));
        format = null;
        chat = chat2;
        if (chat == null) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        s47 s47Var = this.d;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                s47Var.getResourceProvider();
                view = new b9a(context, (de9) null);
            } else if (i != 2) {
                if (i != 4) {
                    if (i == 5) {
                        view = new r47(s47Var, context);
                        view.setLayoutParams(new e49(-1, -2));
                    } else if (i == 6) {
                        view = new y14(context, 16);
                        view.setLayoutParams(new e49(-1, 16));
                    } else if (i != 7) {
                        view = new q86(context, gl.L(40.0f), gl.L(120.0f));
                    }
                }
                int i2 = i == 4 ? 1 : 2;
                mf0 mf0Var = new mf0(s47Var.getResourceProvider());
                s47Var.d0 = mf0Var;
                view = new p47(this, this.c, i2, mf0Var, s47Var.getResourceProvider());
            } else {
                ld5 ld5Var = new ld5(this.c, bkb.F6, 16, 11, false, s47Var.getResourceProvider());
                ld5Var.setHeight(43);
                view = ld5Var;
            }
        } else {
            gh6 gh6Var = new gh6(this.c, 6, 2, false, s47Var.getResourceProvider());
            gh6Var.setDividerColor(bkb.c7);
            view = gh6Var;
        }
        return new y29(view);
    }
}
