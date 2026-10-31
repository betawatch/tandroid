package th;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j3 implements ik0 {
    public final /* synthetic */ o7 a;
    public final /* synthetic */ y3 b;

    public j3(y3 y3Var, o7 o7Var) {
        this.b = y3Var;
        this.a = o7Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public final boolean f(int i10, View view) {
        final TL_stories.StoryView storyView;
        final vp r12;
        final TLRPC.User Z1;
        boolean z10;
        TLRPC.InputStickerSet c10;
        y3 y3Var = this.b;
        b bVar = y3Var.s;
        int i11 = y3Var.w;
        if (view instanceof org.telegram.ui.Cells.q6) {
            final org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) view;
            o7 o7Var = this.a;
            if (o7Var.w != null && (storyView = ((q3) y3Var.x.c.get(i10)).b) != null && (Z1 = (r12 = vp.r1(i11)).Z1(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = r12.G0.indexOfKey(Z1.id) >= 0;
                boolean z12 = Z1.contact || org.telegram.messenger.i5.r(i11).f0.get(Long.valueOf(Z1.id)) != null;
                boolean d = y3Var.d(storyView);
                boolean N = r12.O1().N(storyView);
                boolean B = h20.B(Z1);
                String str = TextUtils.isEmpty(Z1.first_name) ? TextUtils.isEmpty(Z1.last_name) ? "" : Z1.last_name : Z1.first_name;
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (B) {
                    return false;
                }
                z60 F = z60.F(o7Var.w, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || N || z11 || B) ? false : true;
                final int i12 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, cd.a0(null, null, 2131744681, str), new Runnable(this) { // from class: th.h3
                    public final /* synthetic */ j3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.q6 q6Var2 = q6Var;
                        String str3 = str2;
                        TLRPC.User user = Z1;
                        vp vpVar = r12;
                        j3 j3Var = this.b;
                        switch (i13) {
                            case 0:
                                vpVar.O1().m0(user.id, true, true);
                                y3 y3Var2 = j3Var.b;
                                new cc(y3Var2, y3Var2.s).Q(R.raw.ic_ban, 36, cd.a0(null, null, 2131744682, str3)).j();
                                q6Var2.a(true, y3Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                vpVar.O1().m0(user.id, false, true);
                                y3 y3Var3 = j3Var.b;
                                new cc(y3Var3, y3Var3.s).Q(R.raw.contact_check, 36, cd.a0(null, null, 2131744487, str3)).j();
                                q6Var2.a(true, y3Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i13 = 1;
                F.l(R.drawable.msg_menu_stories, cd.a0(null, null, 2131744488, str2), new Runnable(this) { // from class: th.h3
                    public final /* synthetic */ j3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i13;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.q6 q6Var2 = q6Var;
                        String str3 = str2;
                        TLRPC.User user = Z1;
                        vp vpVar = r12;
                        j3 j3Var = this.b;
                        switch (i132) {
                            case 0:
                                vpVar.O1().m0(user.id, true, true);
                                y3 y3Var2 = j3Var.b;
                                new cc(y3Var2, y3Var2.s).Q(R.raw.ic_ban, 36, cd.a0(null, null, 2131744682, str3)).j();
                                q6Var2.a(true, y3Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                vpVar.O1().m0(user.id, false, true);
                                y3 y3Var3 = j3Var.b;
                                new cc(y3Var3, y3Var3.s).Q(R.raw.contact_check, 36, cd.a0(null, null, 2131744487, str3)).j();
                                q6Var2.a(true, y3Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (!N || z11 || B) ? false : true);
                F.E();
                F.t();
                final int i14 = 0;
                F.m(R.drawable.msg_user_remove, new Runnable(this) { // from class: th.i3
                    public final /* synthetic */ j3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                r12.w(Z1.id);
                                y3 y3Var2 = this.b.b;
                                new cc(y3Var2, y3Var2.s).e(true).j();
                                q6Var.a(true, y3Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                vp vpVar = r12;
                                e5 O1 = vpVar.O1();
                                TLRPC.User user = Z1;
                                O1.m0(user.id, false, true);
                                vpVar.c5(null, user.id);
                                y3 y3Var3 = this.b.b;
                                new cc(y3Var3, y3Var3.s).e(false).j();
                                q6Var.a(true, y3Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, cd.L0(2131753692, null), (z12 || z11 || B) ? false : true, true);
                final int i15 = 1;
                F.l(R.drawable.msg_block, cd.L0(2131743936, null), new Runnable(this) { // from class: th.i3
                    public final /* synthetic */ j3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                r12.w(Z1.id);
                                y3 y3Var2 = this.b.b;
                                new cc(y3Var2, y3Var2.s).e(true).j();
                                q6Var.a(true, y3Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                vp vpVar = r12;
                                e5 O1 = vpVar.O1();
                                TLRPC.User user = Z1;
                                O1.m0(user.id, false, true);
                                vpVar.c5(null, user.id);
                                y3 y3Var3 = this.b.b;
                                new cc(y3Var3, y3Var3.s).e(false).j();
                                q6Var.a(true, y3Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (z12 || !z11 || B) ? false : true);
                F.m(R.drawable.msg_user_remove, new rh.r4(this, Z1, str2, q6Var, storyView, 10), cd.L0(2131744705, null), z12 && !B, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.f5.g(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    da0 da0Var = new da0(y3Var.w, 3, y3Var.getContext(), arrayList, bVar);
                    da0Var.setOnClickListener(new rh.e7(this, arrayList, F, 5));
                    F.q(da0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    y3Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
