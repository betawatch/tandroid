package yg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr0;
import yh.e2;
import yh.m;
import yh.m2;
import yh.q2;
import yh.v;
import zh.a0;
import zh.e5;
import zh.l7;
import zh.v4;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                ((yh.e) obj3).dismiss();
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
                m2 m2Var = (m2) obj3;
                ((n70) obj2).u();
                nr0 nr0Var = m2Var.a;
                e2 e2Var = new e2(m2Var, (TL_stars.SavedStarGift) obj, i12);
                HashMap hashMap = q2.T;
                nr0Var.h(null, e2Var);
                break;
            case 6:
                Context context = (Context) obj2;
                f6 f6Var = (f6) obj;
                if (((a0) obj3).m0.a == zf.b.a) {
                    new l7(context, f6Var).show();
                    break;
                }
                break;
            case 7:
                final f3 f3Var = (f3) obj2;
                final di.d dVar = (di.d) obj;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((v4) obj3).run(new Utilities.Callback() { // from class: zh.g6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final di.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.m6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    f3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final di.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.m6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final f3 f3Var2 = (f3) obj2;
                final di.d dVar2 = (di.d) obj;
                f3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((e5) obj3).run(new Utilities.Callback() { // from class: zh.g6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i11) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var22 = f3Var2;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final di.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.m6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    f3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final di.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.m6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
