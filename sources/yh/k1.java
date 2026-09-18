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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.p91;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ k1(a3 a3Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.a = 2;
        this.b = a3Var;
        this.e = starGift;
        this.d = arrayList;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a4.S0((a4) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 1:
                a4 a4Var = (a4) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
                    a4Var.getBulletinFactory().d0(tL_error, false);
                    break;
                } else {
                    a4Var.q0 = true;
                    a4Var.l1 = null;
                    a4Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(a4Var, 5));
                    Utilities.stageQueue.postRunnable(new uh.i(13, a4Var, tLObject));
                    break;
                }
            default:
                a3 a3Var = (a3) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Components.n6 n6Var = a3Var.H;
                a3Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    bj0 bj0Var = a3Var.l0;
                    if (bj0Var != null) {
                        bj0Var.d();
                        AndroidUtilities.runOnUIThread(new p91(17), 750L);
                    }
                    a3Var.Q.animate().alpha(0.0f).start();
                    a3Var.S.animate().alpha(1.0f).start();
                    a3Var.G.animate().alpha(1.0f).start();
                    a3Var.R.animate().alpha(0.0f).start();
                    a3Var.P.animate().alpha(1.0f).start();
                    a3Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    n6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    n6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    a3Var.I.setAlpha(0.0f);
                    if (a3Var.O != null) {
                        int i10 = 0;
                        while (true) {
                            xh.i1[] i1VarArr = a3Var.O;
                            if (i10 < i1VarArr.length) {
                                AndroidUtilities.removeFromParent(i1VarArr[i10]);
                                i10++;
                            } else {
                                a3Var.O = null;
                            }
                        }
                    }
                    a3Var.O = new xh.i1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        xh.i1 i1Var = new xh.i1(a3Var.getContext(), a3Var.W, a3Var.a);
                        i1Var.g(starGift2, false, false, false, false, true);
                        i1Var.x.setVisibility(8);
                        i1Var.setRibbonColor(-3065286);
                        u9 u9Var = i1Var.y;
                        FrameLayout.LayoutParams e = w7.x5.e(42, 42, 17);
                        i1Var.E = e;
                        u9Var.setLayoutParams(e);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = a3Var.N;
                        a3Var.O[i11] = i1Var;
                        linearLayout.addView(i1Var, w7.x5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ k1(a4 a4Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = a4Var;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
