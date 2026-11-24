// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yp8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ yp8(FrameLayout frameLayout, boolean z, int i, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.b = z;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                lca lcaVar = (lca) frameLayout;
                if (lcaVar.e.h() && lcaVar.h.getCurrentPosition() != 0) {
                    lcaVar.a();
                    break;
                } else {
                    int i = this.c;
                    if (!z) {
                        xu4.f1(false, oj0.a(i).b());
                        break;
                    } else {
                        tv4 tv4Var = new tv4(lcaVar.getContext(), i, lcaVar.c, null, null);
                        tv4Var.a1(oj0.a(i).c(lcaVar.c));
                        tv4Var.show();
                        break;
                    }
                }
                break;
            default:
                nfa nfaVar = (nfa) frameLayout;
                d dVar = nfaVar.y1;
                if (!z) {
                    dVar.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                    t7b.C(dVar.getParentActivity(), dVar.getCurrentAccount()).Q(null);
                    break;
                } else {
                    nfaVar.U0(this.c, nfaVar.m1, dVar);
                    break;
                }
        }
    }
}
