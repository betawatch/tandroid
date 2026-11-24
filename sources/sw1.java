// default package

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sw1 implements qac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sw1(d48 d48Var, boolean z, k39 k39Var, View view) {
        this.c = d48Var;
        this.b = z;
        this.d = k39Var;
        this.e = view;
    }

    @Override // qac
    public final void a(Object obj) {
        g39 g39Var;
        TLRPC.Document e;
        c41 c41Var;
        int i;
        int i2;
        String str;
        byte b = this.a;
        Object obj2 = this.e;
        boolean z = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i3 = ChatActivityEnterView.z7;
                ((he) obj3).dismiss();
                ux4 ux4Var = new ux4(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).id, oo0.d(oo0.c(1, (List) obj)), null);
                ux4Var.a1(z);
                ux4Var.show();
                break;
            case 1:
                d48 d48Var = (d48) obj4;
                k39 k39Var = (k39) obj3;
                View view = (View) obj2;
                Long l = (Long) obj;
                a58 a58Var = d48Var.a;
                if (!z || k39Var.f == null) {
                    g39Var = new g39(view.getContext(), null, a58Var.V1, null, view, a58Var.getMeasuredWidth() / 2.0f, a58Var.getMeasuredHeight() / 2.0f, k39Var, a58Var.s2, 2, true);
                } else {
                    try {
                        a58Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    g39Var = new g39(view.getContext(), null, a58Var.V1, null, view, a58Var.getMeasuredWidth() / 2.0f, a58Var.getMeasuredHeight() / 2.0f, k39Var, a58Var.s2, 0, true);
                }
                g39.B = g39Var;
                d39 d39Var = g39Var.i;
                d39Var.setTag(R.id.parent_tag, 1);
                a58Var.addView(d39Var);
                z48 z48Var = a58Var.E1;
                g39Var.s = true;
                g39Var.y = System.currentTimeMillis();
                String str2 = k39Var.f;
                int i4 = a58Var.s2;
                if (str2 != null) {
                    e = hs6.d0(i4).V(k39Var.f);
                    y5a a = y5a.a(a58Var.r1, k39Var.f);
                    a.H = z48Var.a;
                    a.Q = l.longValue();
                    a6a.B(a58Var.s2).q0(a);
                } else {
                    e = vm.e(i4, k39Var.g);
                    String V = k47.V(e, null, null);
                    if (V == null) {
                        if (a58Var.V1.getReactionsWindow() != null) {
                            a58Var.V1.getReactionsWindow().e();
                        }
                        a58Var.i0();
                        break;
                    } else {
                        y5a a2 = y5a.a(a58Var.r1, V);
                        a2.w = new ArrayList();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = k39Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = V.length();
                        a2.w.add(tL_messageEntityCustomEmoji);
                        a2.H = z48Var.a;
                        a2.Q = l.longValue();
                        a6a.B(a58Var.s2).q0(a2);
                    }
                }
                if (l.longValue() <= 0) {
                    u31 r = new c41(a58Var.S0, a58Var.r0).r(e, jb6.M0(2131746122, null), jb6.M0(2131743236, null), new kl7(d48Var, (byte) 23));
                    r.j = 5000;
                    r.j();
                }
                if (a58Var.V1.getReactionsWindow() != null) {
                    a58Var.V1.getReactionsWindow().e();
                }
                a58Var.i0();
                break;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                r63 r63Var = (r63) obj2;
                a58 a58Var2 = ((v48) obj4).x;
                g48 g48Var = a58Var2.S0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z;
                    boolean z2 = a58Var2.s1;
                    i = R.raw.chats_archived;
                    int i5 = R.raw.contact_check;
                    if (z2) {
                        c41 c41Var2 = new c41(g48Var, r63Var);
                        if (z) {
                            str = jb6.M0(2131744268, null);
                        } else {
                            String M0 = jb6.M0(2131744416, null);
                            i5 = R.raw.chats_archived;
                            str = M0;
                        }
                        c41Var2.Q(i5, 36, str).j();
                        break;
                    } else if (z) {
                        new c41(g48Var, r63Var).I(R.raw.contact_check, jb6.M0(2131744270, null), jb6.M0(2131744269, null)).j();
                        break;
                    } else {
                        c41Var = new c41(g48Var, r63Var);
                        i2 = 2131744140;
                    }
                } else {
                    c41Var = new c41(g48Var, r63Var);
                    i = R.raw.error;
                    i2 = 2131743566;
                }
                ts2.u(null, i2, c41Var, i, 36);
                break;
        }
    }

    public /* synthetic */ sw1(v48 v48Var, TL_stories.StoryItem storyItem, boolean z, r63 r63Var) {
        this.c = v48Var;
        this.d = storyItem;
        this.b = z;
        this.e = r63Var;
    }

    public /* synthetic */ sw1(ChatActivityEnterView chatActivityEnterView, he heVar, TLRPC.User user, boolean z) {
        this.c = chatActivityEnterView;
        this.d = heVar;
        this.e = user;
        this.b = z;
    }
}
