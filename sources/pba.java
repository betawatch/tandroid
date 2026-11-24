// default package

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pba implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfa b;

    public /* synthetic */ pba(nfa nfaVar, byte b) {
        this.a = b;
        this.b = nfaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        nfa nfaVar = this.b;
        switch (b) {
            case 0:
                int closestTab = nfaVar.getClosestTab();
                cs5 I = cs5.I(nfaVar.y1, view);
                I.J = false;
                if (nfaVar.K(closestTab, new u39(I, (byte) 12))) {
                    if (closestTab == 13 || closestTab == 11) {
                        I.b0(0.0f, -gl.L(52.0f));
                    } else {
                        I.b0 = true;
                    }
                    I.s = (short) 0;
                    I.a0();
                    break;
                }
                break;
            case 1:
                xha xhaVar = nfaVar.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = xhaVar.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (nfaVar.K(nfaVar.getClosestTab(), new g29(nfaVar, (byte) 10))) {
                    xhaVar.U(null, null);
                    break;
                }
                break;
            case 2:
                nfaVar.E(true);
                break;
            case 3:
                oca ocaVar = nfaVar.c0;
                lca lcaVar = nfaVar.b0;
                if (nfaVar.t0.getAlpha() >= 0.1f) {
                    if (lcaVar != null && lcaVar.g()) {
                        lcaVar.i();
                    }
                    if (ocaVar != null && ocaVar.f) {
                        mfa t1 = nfaVar.t1(nfaVar.s1(nfaVar.getClosestTab()));
                        iea P = nfaVar.P(t1.a);
                        if (P != null) {
                            ocaVar.setReorderingAlbums(false);
                            sca scaVar = P.h;
                            for (int i = 0; i < scaVar.getChildCount(); i++) {
                                View childAt = scaVar.getChildAt(i);
                                if (childAt instanceof qfa) {
                                    ((qfa) childAt).l(false, true);
                                }
                            }
                            lfa lfaVar = t1.c;
                            if (lfaVar != null && lfaVar.y) {
                                lfaVar.y = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                d dVar = nfaVar.y1;
                dVar.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                t7b.C(dVar.getParentActivity(), dVar.getCurrentAccount()).Q(null);
                break;
        }
    }
}
