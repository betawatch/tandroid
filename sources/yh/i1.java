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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.t21;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
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
                s3.S0((s3) this.b, (TLObject) this.c, (tg.q) this.d, (TLRPC.TL_error) this.e);
                break;
            case 1:
                s3.T0((s3) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 2:
                s3 s3Var = (s3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
                    s3Var.getBulletinFactory().f0(tL_error, false);
                    break;
                } else {
                    s3Var.r0 = true;
                    s3Var.m1 = null;
                    s3Var.s1(inputSavedStarGift, (TLRPC.Updates) tLObject, new a1(s3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.p0(18, s3Var, tLObject));
                    break;
                }
            default:
                t2 t2Var = (t2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.r6 r6Var = t2Var.H;
                t2Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                } else {
                    fk0 fk0Var = t2Var.l0;
                    if (fk0Var != null) {
                        fk0Var.d();
                        AndroidUtilities.runOnUIThread(new t21(21), 750L);
                    }
                    t2Var.Q.animate().alpha(0.0f).start();
                    t2Var.S.animate().alpha(1.0f).start();
                    t2Var.G.animate().alpha(1.0f).start();
                    t2Var.R.animate().alpha(0.0f).start();
                    t2Var.P.animate().alpha(1.0f).start();
                    t2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    r6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    r6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    t2Var.I.setAlpha(0.0f);
                    if (t2Var.O != null) {
                        int i10 = 0;
                        while (true) {
                            xh.j1[] j1VarArr = t2Var.O;
                            if (i10 < j1VarArr.length) {
                                AndroidUtilities.removeFromParent(j1VarArr[i10]);
                                i10++;
                            } else {
                                t2Var.O = null;
                            }
                        }
                    }
                    t2Var.O = new xh.j1[arrayList.size()];
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i11);
                        xh.j1 j1Var = new xh.j1(t2Var.getContext(), t2Var.W, t2Var.a);
                        j1Var.g(starGift2, false, false, false, false, true);
                        j1Var.x.setVisibility(8);
                        j1Var.setRibbonColor(-3065286);
                        y9 y9Var = j1Var.y;
                        FrameLayout.LayoutParams e7 = w7.x5.e(42, 42, 17);
                        j1Var.E = e7;
                        y9Var.setLayoutParams(e7);
                        int i12 = i11 + 1;
                        boolean z10 = i12 >= arrayList.size();
                        LinearLayout linearLayout = t2Var.N;
                        t2Var.O[i11] = j1Var;
                        linearLayout.addView(j1Var, w7.x5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                        i11 = i12;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ i1(TLObject tLObject, TLRPC.TL_error tL_error, TL_stars.InputSavedStarGift inputSavedStarGift, s3 s3Var) {
        this.a = 2;
        this.b = s3Var;
        this.e = tL_error;
        this.c = tLObject;
        this.d = inputSavedStarGift;
    }
}
