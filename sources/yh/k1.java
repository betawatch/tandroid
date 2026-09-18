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
import org.telegram.ui.o91;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ k1(y2 y2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.a = 2;
        this.b = y2Var;
        this.e = starGift;
        this.d = arrayList;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y3.S0((y3) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 1:
                y3 y3Var = (y3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
                    y3Var.getBulletinFactory().d0(tL_error, false);
                    break;
                } else {
                    y3Var.q0 = true;
                    y3Var.l1 = null;
                    y3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(y3Var, 5));
                    Utilities.stageQueue.postRunnable(new uf.b(17, y3Var, tLObject));
                    break;
                }
            default:
                y2 y2Var = (y2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Components.p6 p6Var = y2Var.H;
                y2Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    lj0 lj0Var = y2Var.l0;
                    if (lj0Var != null) {
                        lj0Var.d();
                        AndroidUtilities.runOnUIThread(new o91(17), 750L);
                    }
                    y2Var.Q.animate().alpha(0.0f).start();
                    y2Var.S.animate().alpha(1.0f).start();
                    y2Var.G.animate().alpha(1.0f).start();
                    y2Var.R.animate().alpha(0.0f).start();
                    y2Var.P.animate().alpha(1.0f).start();
                    y2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    p6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    p6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    y2Var.I.setAlpha(0.0f);
                    if (y2Var.O != null) {
                        int i10 = 0;
                        while (true) {
                            xh.j1[] j1VarArr = y2Var.O;
                            if (i10 < j1VarArr.length) {
                                AndroidUtilities.removeFromParent(j1VarArr[i10]);
                                i10++;
                            } else {
                                y2Var.O = null;
                            }
                        }
                    }
                    y2Var.O = new xh.j1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        xh.j1 j1Var = new xh.j1(y2Var.getContext(), y2Var.W, y2Var.a);
                        j1Var.g(starGift2, false, false, false, false, true);
                        j1Var.x.setVisibility(8);
                        j1Var.setRibbonColor(-3065286);
                        w9 w9Var = j1Var.y;
                        FrameLayout.LayoutParams e = w7.y5.e(42, 42, 17);
                        j1Var.E = e;
                        w9Var.setLayoutParams(e);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = y2Var.N;
                        y2Var.O[i11] = j1Var;
                        linearLayout.addView(j1Var, w7.y5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ k1(y3 y3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
