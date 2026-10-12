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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.b31;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ j1(s2 s2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.a = 2;
        this.b = s2Var;
        this.e = starGift;
        this.d = arrayList;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r3.T0((r3) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 1:
                r3 r3Var = (r3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
                    r3Var.getBulletinFactory().f0(tL_error, false);
                    break;
                } else {
                    r3Var.r0 = true;
                    r3Var.m1 = null;
                    r3Var.s1(inputSavedStarGift, (TLRPC.Updates) tLObject, new a1(r3Var, 5));
                    Utilities.stageQueue.postRunnable(new m(4, r3Var, tLObject));
                    break;
                }
            default:
                s2 s2Var = (s2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Components.s6 s6Var = s2Var.H;
                s2Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    bk0 bk0Var = s2Var.l0;
                    if (bk0Var != null) {
                        bk0Var.d();
                        AndroidUtilities.runOnUIThread(new b31(22), 750L);
                    }
                    s2Var.Q.animate().alpha(0.0f).start();
                    s2Var.S.animate().alpha(1.0f).start();
                    s2Var.G.animate().alpha(1.0f).start();
                    s2Var.R.animate().alpha(0.0f).start();
                    s2Var.P.animate().alpha(1.0f).start();
                    s2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    s6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    s6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    s2Var.I.setAlpha(0.0f);
                    if (s2Var.O != null) {
                        int i10 = 0;
                        while (true) {
                            yh.h1[] h1VarArr = s2Var.O;
                            if (i10 < h1VarArr.length) {
                                AndroidUtilities.removeFromParent(h1VarArr[i10]);
                                i10++;
                            } else {
                                s2Var.O = null;
                            }
                        }
                    }
                    s2Var.O = new yh.h1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        yh.h1 h1Var = new yh.h1(s2Var.getContext(), s2Var.W, s2Var.a);
                        h1Var.g(starGift2, false, false, false, false, true);
                        h1Var.x.setVisibility(8);
                        h1Var.setRibbonColor(-3065286);
                        z9 z9Var = h1Var.y;
                        FrameLayout.LayoutParams e = w7.a6.e(42, 42, 17);
                        h1Var.E = e;
                        z9Var.setLayoutParams(e);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = s2Var.N;
                        s2Var.O[i11] = h1Var;
                        linearLayout.addView(h1Var, w7.a6.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ j1(r3 r3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = r3Var;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
