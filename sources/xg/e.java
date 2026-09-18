package xg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.or0;
import xh.f2;
import xh.m;
import xh.n2;
import xh.r2;
import xh.v;
import yh.a0;
import yh.i5;
import yh.o7;
import yh.z4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                ((i) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                break;
            case 1:
                new m((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((xh.e) obj3).dismiss();
                break;
            case 2:
                m.R((m) obj3, (boolean[]) obj2, (f6) obj);
                break;
            case 3:
                v.R((v) obj3, (Context) obj2, (f6) obj);
                break;
            case 4:
                v.P((v) obj3, (boolean[]) obj2, (f6) obj);
                break;
            case 5:
                n2 n2Var = (n2) obj3;
                ((n70) obj2).u();
                or0 or0Var = n2Var.a;
                f2 f2Var = new f2(n2Var, (TL_stars.SavedStarGift) obj, i12);
                HashMap hashMap = r2.T;
                or0Var.h(null, f2Var);
                break;
            case 6:
                Context context = (Context) obj2;
                f6 f6Var = (f6) obj;
                if (((a0) obj3).m0.a == zf.b.a) {
                    new o7(context, f6Var).show();
                    break;
                }
                break;
            case 7:
                final g3 g3Var = (g3) obj2;
                final ci.d dVar = (ci.d) obj;
                g3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((z4) obj3).run(new Utilities.Callback() { // from class: yh.j6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final ci.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    g3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final ci.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final g3 g3Var2 = (g3) obj2;
                final ci.d dVar2 = (ci.d) obj;
                g3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((i5) obj3).run(new Utilities.Callback() { // from class: yh.j6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i11) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var22 = g3Var2;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final ci.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    g3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var2;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final ci.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
