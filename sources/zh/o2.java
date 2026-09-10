package zh;

import android.content.Context;
import android.view.View;
import bi.kb;
import bi.rb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.wc;
import org.telegram.ui.h41;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ u7 d;

    public /* synthetic */ o2(v2 v2Var, org.telegram.ui.ActionBar.f6 f6Var, u7 u7Var, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = f6Var;
        this.d = u7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        View view2;
        View view3;
        int i10 = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        u7 u7Var = this.d;
        v2 v2Var = this.b;
        switch (i10) {
            case 0:
                a3 a3Var = v2Var.l;
                u7Var.k1 = true;
                u7Var.P();
                int i11 = a3Var.C2;
                Context context = a3Var.getContext();
                TL_stories.StoryItem storyItem = a3Var.O1.a;
                h2 h2Var = a3Var.c1;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.c;
                wc wcVar = new wc(h2Var, f6Var2);
                org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(u7Var, 25);
                int i12 = h41.v;
                h41.K(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), wcVar, f6Var2, new byte[0], null, y1Var);
                v2 v2Var2 = a3Var.t1;
                if (v2Var2 != null) {
                    v2Var2.a();
                    break;
                }
                break;
            case 1:
                a3 a3Var2 = v2Var.l;
                v2 v2Var3 = a3Var2.t1;
                z2 z2Var = a3Var2.O1;
                if (v2Var3 != null) {
                    v2Var3.a();
                }
                rb rbVar = new rb(a3Var2.getContext(), 86400, f6Var);
                rbVar.o1();
                rbVar.p1(MessagesController.getInstance(a3Var2.C2).getInputPeer(a3Var2.B1));
                rbVar.L = true;
                View[] viewPages = rbVar.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof kb) {
                    kb kbVar = (kb) view4;
                    kbVar.b(kbVar.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof kb) {
                    kb kbVar2 = (kb) view5;
                    kbVar2.b(kbVar2.a);
                }
                rbVar.e1(false);
                rbVar.m1(1);
                rbVar.k1(false);
                t0 t0Var = u7Var.A0;
                if (t0Var != null) {
                    TLRPC.GroupCall groupCall = t0Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = z2Var.d();
                        TL_stories.StoryItem storyItem2 = z2Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        t0 t0Var2 = u7Var.A0;
                        int j3 = t0Var2 != null ? 0 : (int) t0Var2.j();
                        rbVar.w = z10;
                        rbVar.x = d;
                        rbVar.y = z11;
                        rbVar.H = j3;
                        View[] viewPages2 = rbVar.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof kb) {
                            kb kbVar3 = (kb) view2;
                            kbVar3.b(kbVar3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof kb) {
                            kb kbVar4 = (kb) view3;
                            kbVar4.b(kbVar4.a);
                        }
                        rbVar.T = new sg.f0(16, v2Var, rbVar);
                        rbVar.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = z2Var.d();
                TL_stories.StoryItem storyItem22 = z2Var.a;
                if (storyItem22 == null) {
                }
                t0 t0Var22 = u7Var.A0;
                if (t0Var22 != null) {
                }
                rbVar.w = z10;
                rbVar.x = d10;
                rbVar.y = z11;
                rbVar.H = j3;
                View[] viewPages22 = rbVar.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof kb) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof kb) {
                }
                rbVar.T = new sg.f0(16, v2Var, rbVar);
                rbVar.show();
            default:
                a3 a3Var3 = v2Var.l;
                v2 v2Var4 = a3Var3.t1;
                if (v2Var4 != null) {
                    v2Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a3Var3.getContext(), 0, f6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                d2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new sg.f0(17, v2Var, u7Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ o2(v2 v2Var, u7 u7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 0;
        this.b = v2Var;
        this.d = u7Var;
        this.c = f6Var;
    }
}
