// default package

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class t1a implements h59 {
    public final /* synthetic */ oab a;
    public final /* synthetic */ i2a b;

    public t1a(i2a i2aVar, oab oabVar) {
        this.b = i2aVar;
        this.a = oabVar;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        final TL_stories.StoryView storyView;
        final oc7 r1;
        final TLRPC.User W1;
        boolean z;
        TLRPC.InputStickerSet c;
        i2a i2aVar = this.b;
        r63 r63Var = i2aVar.s;
        int i2 = i2aVar.w;
        if (!(view instanceof r19)) {
            return false;
        }
        final r19 r19Var = (r19) view;
        oab oabVar = this.a;
        if (oabVar.w == null || (storyView = ((a2a) i2aVar.x.c.get(i)).b) == null || (W1 = (r1 = oc7.r1(i2)).W1(Long.valueOf(storyView.user_id))) == null) {
            return false;
        }
        boolean z2 = r1.x0.indexOfKey(W1.id) >= 0;
        boolean z3 = W1.contact || bw2.r(i2).g0.get(Long.valueOf(W1.id)) != null;
        boolean b = i2aVar.b(storyView);
        boolean M = r1.N1().M(storyView);
        boolean D = m9c.D(W1);
        String str = TextUtils.isEmpty(W1.first_name) ? TextUtils.isEmpty(W1.last_name) ? "" : W1.last_name : W1.first_name;
        int indexOf = str.indexOf(" ");
        if (indexOf > 2) {
            str = str.substring(0, indexOf);
        }
        if (D) {
            return false;
        }
        bu5 G = bu5.G(oabVar.w, r63Var, view);
        G.i = (byte) 3;
        G.j = true;
        G.X(new ColorDrawable(cmb.v0(cmb.g5, r63Var)));
        G.s = (short) 133;
        boolean z4 = (!b || M || z2 || D) ? false : true;
        final byte b2 = 0;
        final String str2 = str;
        G.k(R.drawable.msg_stories_myhide, jb6.a0(null, null, 2131744348, str), new Runnable(this) { // from class: r1a
            public final /* synthetic */ t1a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                TL_stories.StoryView storyView2 = storyView;
                r19 r19Var2 = r19Var;
                String str3 = str2;
                TLRPC.User user = W1;
                oc7 oc7Var = r1;
                t1a t1aVar = this.b;
                switch (b3) {
                    case 0:
                        oc7Var.N1().m0(user.id, true, true);
                        i2a i2aVar2 = t1aVar.b;
                        new c41(i2aVar2, i2aVar2.s).Q(R.raw.ic_ban, 36, jb6.a0(null, null, 2131744349, str3)).j();
                        r19Var2.a(true, i2aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        oc7Var.N1().m0(user.id, false, true);
                        i2a i2aVar3 = t1aVar.b;
                        new c41(i2aVar3, i2aVar3.s).Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131744147, str3)).j();
                        r19Var2.a(true, i2aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, z4);
        G.F();
        G.t();
        final byte b3 = 1;
        G.k(R.drawable.msg_menu_stories, jb6.a0(null, null, 2131744148, str2), new Runnable(this) { // from class: r1a
            public final /* synthetic */ t1a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                TL_stories.StoryView storyView2 = storyView;
                r19 r19Var2 = r19Var;
                String str3 = str2;
                TLRPC.User user = W1;
                oc7 oc7Var = r1;
                t1a t1aVar = this.b;
                switch (b32) {
                    case 0:
                        oc7Var.N1().m0(user.id, true, true);
                        i2a i2aVar2 = t1aVar.b;
                        new c41(i2aVar2, i2aVar2.s).Q(R.raw.ic_ban, 36, jb6.a0(null, null, 2131744349, str3)).j();
                        r19Var2.a(true, i2aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        oc7Var.N1().m0(user.id, false, true);
                        i2a i2aVar3 = t1aVar.b;
                        new c41(i2aVar3, i2aVar3.s).Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131744147, str3)).j();
                        r19Var2.a(true, i2aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, (!M || z2 || D) ? false : true);
        G.F();
        G.t();
        final byte b4 = 0;
        G.l(R.drawable.msg_user_remove, new Runnable(this) { // from class: s1a
            public final /* synthetic */ t1a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b4;
                TL_stories.StoryView storyView2 = storyView;
                r19 r19Var2 = r19Var;
                TLRPC.User user = W1;
                oc7 oc7Var = r1;
                t1a t1aVar = this.b;
                switch (b5) {
                    case 0:
                        oc7Var.t(user.id);
                        i2a i2aVar2 = t1aVar.b;
                        new c41(i2aVar2, i2aVar2.s).e(true).j();
                        r19Var2.a(true, i2aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        oc7Var.N1().m0(user.id, false, true);
                        oc7Var.n5(null, user.id);
                        i2a i2aVar3 = t1aVar.b;
                        new c41(i2aVar3, i2aVar3.s).e(false).j();
                        r19Var2.a(true, i2aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, jb6.M0(2131753657, null), (z3 || z2 || D) ? false : true, true);
        final byte b5 = 1;
        G.k(R.drawable.msg_block, jb6.M0(2131743598, null), new Runnable(this) { // from class: s1a
            public final /* synthetic */ t1a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b5;
                TL_stories.StoryView storyView2 = storyView;
                r19 r19Var2 = r19Var;
                TLRPC.User user = W1;
                oc7 oc7Var = r1;
                t1a t1aVar = this.b;
                switch (b52) {
                    case 0:
                        oc7Var.t(user.id);
                        i2a i2aVar2 = t1aVar.b;
                        new c41(i2aVar2, i2aVar2.s).e(true).j();
                        r19Var2.a(true, i2aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        oc7Var.N1().m0(user.id, false, true);
                        oc7Var.n5(null, user.id);
                        i2a i2aVar3 = t1aVar.b;
                        new c41(i2aVar3, i2aVar3.s).e(false).j();
                        r19Var2.a(true, i2aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, (z3 || !z2 || D) ? false : true);
        G.l(R.drawable.msg_user_remove, new hz7((Object) this, (Object) W1, (Object) str2, (Object) r19Var, (Object) storyView, (byte) 19), jb6.M0(2131744373, null), z3 && !D, true);
        TLRPC.Reaction reaction = storyView.reaction;
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c = vm.g(i2).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
            z = false;
        } else {
            G.j();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c);
            j37 j37Var = new j37(i2aVar.w, 3, r63Var, i2aVar.getContext(), arrayList);
            j37Var.setOnClickListener(new jw4(this, arrayList, G, (byte) 20));
            G.p(j37Var);
            z = true;
        }
        if (G.y() <= 0 && !z) {
            return false;
        }
        G.a0();
        try {
            i2aVar.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }
}
