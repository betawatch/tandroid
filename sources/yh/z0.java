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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.n21;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
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
                y3.Y((y3) this.b, (boolean[]) this.c, (TL_stars.StarGiftAttribute) this.d, (ad[]) this.e);
                break;
            case 1:
                y3.R0((y3) this.b, (TLObject) this.c, (tg.q) this.d, (TLRPC.TL_error) this.e);
                break;
            case 2:
                y3.S0((y3) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 3:
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
                    y3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new d1(y3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.i0(19, y3Var, tLObject));
                    break;
                }
            default:
                y2 y2Var = (y2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.p6 p6Var = y2Var.H;
                y2Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    nj0 nj0Var = y2Var.l0;
                    if (nj0Var != null) {
                        nj0Var.d();
                        AndroidUtilities.runOnUIThread(new n21(19), 750L);
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
                            xh.i1[] i1VarArr = y2Var.O;
                            if (i10 < i1VarArr.length) {
                                AndroidUtilities.removeFromParent(i1VarArr[i10]);
                                i10++;
                            } else {
                                y2Var.O = null;
                            }
                        }
                    }
                    y2Var.O = new xh.i1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        xh.i1 i1Var = new xh.i1(y2Var.getContext(), y2Var.W, y2Var.a);
                        i1Var.g(starGift2, false, false, false, false, true);
                        i1Var.x.setVisibility(8);
                        i1Var.setRibbonColor(-3065286);
                        w9 w9Var = i1Var.y;
                        FrameLayout.LayoutParams e7 = w7.z5.e(42, 42, 17);
                        i1Var.E = e7;
                        w9Var.setLayoutParams(e7);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = y2Var.N;
                        y2Var.O[i11] = i1Var;
                        linearLayout.addView(i1Var, w7.z5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }
}
