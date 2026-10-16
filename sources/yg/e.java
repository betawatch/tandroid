package yg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ns0;
import yh.e2;
import yh.m2;
import yh.n;
import yh.q2;
import yh.w;
import zh.a5;
import zh.f7;
import zh.q4;
import zh.z;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                new n((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((yh.f) obj3).dismiss();
                break;
            case 2:
                n.S((n) obj3, (boolean[]) obj2, (c6) obj);
                break;
            case 3:
                w.S((w) obj3, (Context) obj2, (c6) obj);
                break;
            case 4:
                w.Q((w) obj3, (boolean[]) obj2, (c6) obj);
                break;
            case 5:
                m2 m2Var = (m2) obj3;
                ((l80) obj2).u();
                ns0 ns0Var = m2Var.a;
                e2 e2Var = new e2(m2Var, (TL_stars.SavedStarGift) obj, i12);
                HashMap hashMap = q2.T;
                ns0Var.h(null, e2Var);
                break;
            case 6:
                Context context = (Context) obj2;
                c6 c6Var = (c6) obj;
                if (((z) obj3).m0.a == ag.b.a) {
                    new f7(context, c6Var).show();
                    break;
                }
                break;
            case 7:
                final e3 e3Var = (e3) obj2;
                final di.d dVar = (di.d) obj;
                e3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((q4) obj3).run(new Utilities.Callback() { // from class: zh.b6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final di.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    e3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final di.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final e3 e3Var2 = (e3) obj2;
                final di.d dVar2 = (di.d) obj;
                e3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((a5) obj3).run(new Utilities.Callback() { // from class: zh.b6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i11) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var22 = e3Var2;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final di.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    e3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final di.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
