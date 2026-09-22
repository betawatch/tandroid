package yh;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.o91;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ k1(z2 z2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.a = 2;
        this.b = z2Var;
        this.e = starGift;
        this.d = arrayList;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z3.S0((z3) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 1:
                z3 z3Var = (z3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
                    z3Var.getBulletinFactory().d0(tL_error, false);
                    break;
                } else {
                    z3Var.q0 = true;
                    z3Var.l1 = null;
                    z3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(z3Var, 5));
                    Utilities.stageQueue.postRunnable(new uh.i(13, z3Var, tLObject));
                    break;
                }
            default:
                z2 z2Var = (z2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Components.n6 n6Var = z2Var.H;
                z2Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    aj0 aj0Var = z2Var.l0;
                    if (aj0Var != null) {
                        aj0Var.d();
                        AndroidUtilities.runOnUIThread(new o91(17), 750L);
                    }
                    z2Var.Q.animate().alpha(0.0f).start();
                    z2Var.S.animate().alpha(1.0f).start();
                    z2Var.G.animate().alpha(1.0f).start();
                    z2Var.R.animate().alpha(0.0f).start();
                    z2Var.P.animate().alpha(1.0f).start();
                    z2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    n6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    n6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    z2Var.I.setAlpha(0.0f);
                    if (z2Var.O != null) {
                        int i10 = 0;
                        while (true) {
                            xh.i1[] i1VarArr = z2Var.O;
                            if (i10 < i1VarArr.length) {
                                AndroidUtilities.removeFromParent(i1VarArr[i10]);
                                i10++;
                            } else {
                                z2Var.O = null;
                            }
                        }
                    }
                    z2Var.O = new xh.i1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        xh.i1 i1Var = new xh.i1(z2Var.getContext(), z2Var.W, z2Var.a);
                        i1Var.g(starGift2, false, false, false, false, true);
                        i1Var.x.setVisibility(8);
                        i1Var.setRibbonColor(-3065286);
                        u9 u9Var = i1Var.y;
                        FrameLayout.LayoutParams e = w7.x5.e(42, 42, 17);
                        i1Var.E = e;
                        u9Var.setLayoutParams(e);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = z2Var.N;
                        z2Var.O[i11] = i1Var;
                        linearLayout.addView(i1Var, w7.x5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ k1(z3 z3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
