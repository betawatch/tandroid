package th;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.c01;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ o7 d;

    public /* synthetic */ n2(u2 u2Var, org.telegram.ui.ActionBar.p6 p6Var, o7 o7Var, int i10) {
        this.a = i10;
        this.b = u2Var;
        this.c = p6Var;
        this.d = o7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        View view2;
        View view3;
        int i10 = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        o7 o7Var = this.d;
        u2 u2Var = this.b;
        switch (i10) {
            case 0:
                z2 z2Var = u2Var.x;
                o7Var.k1 = true;
                o7Var.d0();
                int i11 = z2Var.l2;
                Context context = z2Var.getContext();
                TL_stories.StoryItem storyItem = z2Var.x1.a;
                g2 g2Var = z2Var.L0;
                org.telegram.ui.ActionBar.p6 p6Var2 = this.c;
                cc ccVar = new cc(g2Var, p6Var2);
                ph.h1 h1Var = new ph.h1(o7Var, 15);
                int i12 = c01.s1;
                c01.J0(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), ccVar, p6Var2, new byte[0], null, h1Var);
                u2 u2Var2 = z2Var.c1;
                if (u2Var2 != null) {
                    u2Var2.a();
                    break;
                }
                break;
            case 1:
                z2 z2Var2 = u2Var.x;
                u2 u2Var3 = z2Var2.c1;
                y2 y2Var = z2Var2.x1;
                if (u2Var3 != null) {
                    u2Var3.a();
                }
                vh.w6 w6Var = new vh.w6(86400, z2Var2.getContext(), p6Var);
                w6Var.U0();
                w6Var.V0(vp.r1(z2Var2.l2).i1(z2Var2.k1));
                w6Var.C1 = true;
                View[] viewPages = w6Var.i1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof vh.r6) {
                    vh.r6 r6Var = (vh.r6) view4;
                    r6Var.b(r6Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof vh.r6) {
                    vh.r6 r6Var2 = (vh.r6) view5;
                    r6Var2.b(r6Var2.a);
                }
                w6Var.L0(false);
                w6Var.S0(1);
                w6Var.Q0(false);
                s0 s0Var = o7Var.A0;
                if (s0Var != null) {
                    TLRPC.GroupCall groupCall = s0Var.w;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = y2Var.d();
                        TL_stories.StoryItem storyItem2 = y2Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        s0 s0Var2 = o7Var.A0;
                        int j10 = s0Var2 != null ? 0 : (int) s0Var2.j();
                        w6Var.s1 = z10;
                        w6Var.t1 = d;
                        w6Var.u1 = z11;
                        w6Var.y1 = j10;
                        View[] viewPages2 = w6Var.i1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof vh.r6) {
                            vh.r6 r6Var3 = (vh.r6) view2;
                            r6Var3.b(r6Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof vh.r6) {
                            vh.r6 r6Var4 = (vh.r6) view3;
                            r6Var4.b(r6Var4.a);
                        }
                        w6Var.K1 = new org.telegram.ui.web.k0(19, u2Var, w6Var);
                        w6Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = y2Var.d();
                TL_stories.StoryItem storyItem22 = y2Var.a;
                if (storyItem22 == null) {
                }
                s0 s0Var22 = o7Var.A0;
                if (s0Var22 != null) {
                }
                w6Var.s1 = z10;
                w6Var.t1 = d10;
                w6Var.u1 = z11;
                w6Var.y1 = j10;
                View[] viewPages22 = w6Var.i1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof vh.r6) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof vh.r6) {
                }
                w6Var.K1 = new org.telegram.ui.web.k0(19, u2Var, w6Var);
                w6Var.show();
            default:
                z2 z2Var3 = u2Var.x;
                u2 u2Var4 = z2Var3.c1;
                if (u2Var4 != null) {
                    u2Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z2Var3.getContext(), p6Var);
                String L0 = cd.L0(2131748827, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131748828, null);
                alertDialog$Builder.k(cd.L0(2131748829, null), new org.telegram.ui.web.k0(20, u2Var, o7Var));
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ n2(u2 u2Var, o7 o7Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = 0;
        this.b = u2Var;
        this.d = o7Var;
        this.c = p6Var;
    }
}
