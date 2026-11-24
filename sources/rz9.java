// default package

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class rz9 implements e39 {
    public final /* synthetic */ m8b a;
    public final /* synthetic */ g0a b;

    public rz9(g0a g0aVar, m8b m8bVar) {
        this.b = g0aVar;
        this.a = m8bVar;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        final TL_stories.StoryView storyView;
        final na7 q1;
        final TLRPC.User V1;
        boolean z;
        TLRPC.InputStickerSet c;
        g0a g0aVar = this.b;
        f53 f53Var = g0aVar.s;
        int i2 = g0aVar.w;
        if (!(view instanceof qz8)) {
            return false;
        }
        final qz8 qz8Var = (qz8) view;
        m8b m8bVar = this.a;
        if (m8bVar.w == null || (storyView = ((yz9) g0aVar.x.c.get(i)).b) == null || (V1 = (q1 = na7.q1(i2)).V1(Long.valueOf(storyView.user_id))) == null) {
            return false;
        }
        boolean z2 = q1.x0.indexOfKey(V1.id) >= 0;
        boolean z3 = V1.contact || qu2.r(i2).g0.get(Long.valueOf(V1.id)) != null;
        boolean b = g0aVar.b(storyView);
        boolean M = q1.M1().M(storyView);
        boolean D = l7c.D(V1);
        String str = TextUtils.isEmpty(V1.first_name) ? TextUtils.isEmpty(V1.last_name) ? "" : V1.last_name : V1.first_name;
        int indexOf = str.indexOf(" ");
        if (indexOf > 2) {
            str = str.substring(0, indexOf);
        }
        if (D) {
            return false;
        }
        cs5 G = cs5.G(m8bVar.w, f53Var, view);
        G.i = (byte) 3;
        G.j = true;
        G.X(new ColorDrawable(bkb.v0(bkb.g5, f53Var)));
        G.s = (short) 133;
        boolean z4 = (!b || M || z2 || D) ? false : true;
        final byte b2 = 0;
        final String str2 = str;
        G.k(R.drawable.msg_stories_myhide, k96.a0(null, null, 2131744422, str), new Runnable(this) { // from class: pz9
            public final /* synthetic */ rz9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                TL_stories.StoryView storyView2 = storyView;
                qz8 qz8Var2 = qz8Var;
                String str3 = str2;
                TLRPC.User user = V1;
                na7 na7Var = q1;
                rz9 rz9Var = this.b;
                switch (b3) {
                    case 0:
                        na7Var.M1().m0(user.id, true, true);
                        g0a g0aVar2 = rz9Var.b;
                        new u21(g0aVar2, g0aVar2.s).Q(R.raw.ic_ban, 36, k96.a0(null, null, 2131744423, str3)).j();
                        qz8Var2.a(true, g0aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        na7Var.M1().m0(user.id, false, true);
                        g0a g0aVar3 = rz9Var.b;
                        new u21(g0aVar3, g0aVar3.s).Q(R.raw.contact_check, 36, k96.a0(null, null, 2131744221, str3)).j();
                        qz8Var2.a(true, g0aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, z4);
        G.F();
        G.t();
        final byte b3 = 1;
        G.k(R.drawable.msg_menu_stories, k96.a0(null, null, 2131744222, str2), new Runnable(this) { // from class: pz9
            public final /* synthetic */ rz9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                TL_stories.StoryView storyView2 = storyView;
                qz8 qz8Var2 = qz8Var;
                String str3 = str2;
                TLRPC.User user = V1;
                na7 na7Var = q1;
                rz9 rz9Var = this.b;
                switch (b32) {
                    case 0:
                        na7Var.M1().m0(user.id, true, true);
                        g0a g0aVar2 = rz9Var.b;
                        new u21(g0aVar2, g0aVar2.s).Q(R.raw.ic_ban, 36, k96.a0(null, null, 2131744423, str3)).j();
                        qz8Var2.a(true, g0aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        na7Var.M1().m0(user.id, false, true);
                        g0a g0aVar3 = rz9Var.b;
                        new u21(g0aVar3, g0aVar3.s).Q(R.raw.contact_check, 36, k96.a0(null, null, 2131744221, str3)).j();
                        qz8Var2.a(true, g0aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, (!M || z2 || D) ? false : true);
        G.F();
        G.t();
        final byte b4 = 0;
        G.l(R.drawable.msg_user_remove, new Runnable(this) { // from class: qz9
            public final /* synthetic */ rz9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b4;
                TL_stories.StoryView storyView2 = storyView;
                qz8 qz8Var2 = qz8Var;
                TLRPC.User user = V1;
                na7 na7Var = q1;
                rz9 rz9Var = this.b;
                switch (b5) {
                    case 0:
                        na7Var.t(user.id);
                        g0a g0aVar2 = rz9Var.b;
                        new u21(g0aVar2, g0aVar2.s).e(true).j();
                        qz8Var2.a(true, g0aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        na7Var.M1().m0(user.id, false, true);
                        na7Var.l5(null, user.id);
                        g0a g0aVar3 = rz9Var.b;
                        new u21(g0aVar3, g0aVar3.s).e(false).j();
                        qz8Var2.a(true, g0aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, k96.M0(2131753689, null), (z3 || z2 || D) ? false : true, true);
        final byte b5 = 1;
        G.k(R.drawable.msg_block, k96.M0(2131743672, null), new Runnable(this) { // from class: qz9
            public final /* synthetic */ rz9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b5;
                TL_stories.StoryView storyView2 = storyView;
                qz8 qz8Var2 = qz8Var;
                TLRPC.User user = V1;
                na7 na7Var = q1;
                rz9 rz9Var = this.b;
                switch (b52) {
                    case 0:
                        na7Var.t(user.id);
                        g0a g0aVar2 = rz9Var.b;
                        new u21(g0aVar2, g0aVar2.s).e(true).j();
                        qz8Var2.a(true, g0aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        na7Var.M1().m0(user.id, false, true);
                        na7Var.l5(null, user.id);
                        g0a g0aVar3 = rz9Var.b;
                        new u21(g0aVar3, g0aVar3.s).e(false).j();
                        qz8Var2.a(true, g0aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, (z3 || !z2 || D) ? false : true);
        G.l(R.drawable.msg_user_remove, new ex7((Object) this, (Object) V1, (Object) str2, (Object) qz8Var, (Object) storyView, (byte) 19), k96.M0(2131744447, null), z3 && !D, true);
        TLRPC.Reaction reaction = storyView.reaction;
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c = vl.g(i2).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
            z = false;
        } else {
            G.j();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c);
            j17 j17Var = new j17(g0aVar.w, 3, f53Var, g0aVar.getContext(), arrayList);
            j17Var.setOnClickListener(new hu4(this, arrayList, G, (byte) 20));
            G.p(j17Var);
            z = true;
        }
        if (G.y() <= 0 && !z) {
            return false;
        }
        G.a0();
        try {
            g0aVar.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }
}
