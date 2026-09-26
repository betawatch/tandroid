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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.l21;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x3.R0((x3) this.b, (TLObject) this.c, (tg.r) this.d, (TLRPC.TL_error) this.e);
                break;
            case 1:
                x3.S0((x3) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 2:
                x3 x3Var = (x3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
                    x3Var.getBulletinFactory().d0(tL_error, false);
                    break;
                } else {
                    x3Var.q0 = true;
                    x3Var.l1 = null;
                    x3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(x3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.p0(18, x3Var, tLObject));
                    break;
                }
            default:
                x2 x2Var = (x2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.p6 p6Var = x2Var.H;
                x2Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    lj0 lj0Var = x2Var.l0;
                    if (lj0Var != null) {
                        lj0Var.d();
                        AndroidUtilities.runOnUIThread(new l21(19), 750L);
                    }
                    x2Var.Q.animate().alpha(0.0f).start();
                    x2Var.S.animate().alpha(1.0f).start();
                    x2Var.G.animate().alpha(1.0f).start();
                    x2Var.R.animate().alpha(0.0f).start();
                    x2Var.P.animate().alpha(1.0f).start();
                    x2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    p6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    p6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    x2Var.I.setAlpha(0.0f);
                    if (x2Var.O != null) {
                        int i10 = 0;
                        while (true) {
                            xh.j1[] j1VarArr = x2Var.O;
                            if (i10 < j1VarArr.length) {
                                AndroidUtilities.removeFromParent(j1VarArr[i10]);
                                i10++;
                            } else {
                                x2Var.O = null;
                            }
                        }
                    }
                    x2Var.O = new xh.j1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        xh.j1 j1Var = new xh.j1(x2Var.getContext(), x2Var.W, x2Var.a);
                        j1Var.g(starGift2, false, false, false, false, true);
                        j1Var.x.setVisibility(8);
                        j1Var.setRibbonColor(-3065286);
                        w9 w9Var = j1Var.y;
                        FrameLayout.LayoutParams e = w7.y5.e(42, 42, 17);
                        j1Var.E = e;
                        w9Var.setLayoutParams(e);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = x2Var.N;
                        x2Var.O[i11] = j1Var;
                        linearLayout.addView(j1Var, w7.y5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ j1(TLObject tLObject, TLRPC.TL_error tL_error, TL_stars.InputSavedStarGift inputSavedStarGift, x3 x3Var) {
        this.a = 2;
        this.b = x3Var;
        this.e = tL_error;
        this.c = tLObject;
        this.d = inputSavedStarGift;
    }
}
