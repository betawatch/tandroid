package zh;

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
import org.telegram.ui.Components.x9;
import org.telegram.ui.q31;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ k1(x2 x2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.a = 2;
        this.b = x2Var;
        this.e = starGift;
        this.d = arrayList;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w3.S0((w3) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 1:
                w3 w3Var = (w3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
                    w3Var.getBulletinFactory().d0(tL_error, false);
                    break;
                } else {
                    w3Var.q0 = true;
                    w3Var.l1 = null;
                    w3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(w3Var, 5));
                    Utilities.stageQueue.postRunnable(new ug.r(19, w3Var, tLObject));
                    break;
                }
            default:
                x2 x2Var = (x2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Components.q6 q6Var = x2Var.H;
                x2Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    aj0 aj0Var = x2Var.l0;
                    if (aj0Var != null) {
                        aj0Var.d();
                        AndroidUtilities.runOnUIThread(new q31(18), 750L);
                    }
                    x2Var.Q.animate().alpha(0.0f).start();
                    x2Var.S.animate().alpha(1.0f).start();
                    x2Var.G.animate().alpha(1.0f).start();
                    x2Var.R.animate().alpha(0.0f).start();
                    x2Var.P.animate().alpha(1.0f).start();
                    x2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    q6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    q6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    x2Var.I.setAlpha(0.0f);
                    if (x2Var.O != null) {
                        int i10 = 0;
                        while (true) {
                            yh.h1[] h1VarArr = x2Var.O;
                            if (i10 < h1VarArr.length) {
                                AndroidUtilities.removeFromParent(h1VarArr[i10]);
                                i10++;
                            } else {
                                x2Var.O = null;
                            }
                        }
                    }
                    x2Var.O = new yh.h1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        yh.h1 h1Var = new yh.h1(x2Var.getContext(), x2Var.W, x2Var.a);
                        h1Var.g(starGift2, false, false, false, false, true);
                        h1Var.x.setVisibility(8);
                        h1Var.setRibbonColor(-3065286);
                        x9 x9Var = h1Var.y;
                        FrameLayout.LayoutParams e7 = w7.x5.e(42, 42, 17);
                        h1Var.E = e7;
                        x9Var.setLayoutParams(e7);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = x2Var.N;
                        x2Var.O[i11] = h1Var;
                        linearLayout.addView(h1Var, w7.x5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ k1(w3 w3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = w3Var;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
