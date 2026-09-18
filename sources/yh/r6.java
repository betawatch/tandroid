package yh;

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
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r6(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
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
                ((ci.d) callback).setLoading(false);
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.ActionBar.g3[]) obj2)[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                v5.y(this.b, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    vc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
            default:
                xh.q1 q1Var = (xh.q1) callback;
                Context context = (Context) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) tLObject;
                long j3 = q1Var.c0;
                xh.m0 m0Var = new xh.m0(q1Var, (Utilities.Callback) obj, 2);
                boolean z10 = starGift.limited;
                new xh.s0(q1Var, context, this.b, starGift, j3, m0Var, z10 && (disallowedGiftsSettings2 = q1Var.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z10 && (disallowedGiftsSettings = q1Var.b0) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
        }
    }
}
