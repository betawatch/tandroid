package zh;

import android.content.Context;
import android.view.KeyEvent;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o6(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.b = i10;
        this.e = tLObject;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        int i10 = this.a;
        Object obj = this.f;
        TLObject tLObject = this.e;
        Object obj2 = this.d;
        KeyEvent.Callback callback = this.c;
        switch (i10) {
            case 0:
                String str = (String) obj;
                ((di.d) callback).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj2)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                s5.y(this.b, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    yc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
            default:
                yh.p1 p1Var = (yh.p1) callback;
                Context context = (Context) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) tLObject;
                long j3 = p1Var.c0;
                yh.m0 m0Var = new yh.m0(p1Var, (Utilities.Callback) obj, 2);
                boolean z10 = starGift.limited;
                new yh.s0(p1Var, context, this.b, starGift, j3, m0Var, z10 && (disallowedGiftsSettings2 = p1Var.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z10 && (disallowedGiftsSettings = p1Var.b0) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
        }
    }
}
