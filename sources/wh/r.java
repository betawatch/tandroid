package wh;

import android.content.Context;
import android.view.View;
import bi.pb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.wv;
import xh.h5;
import xh.p7;
import zh.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10) {
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
                w.P((w) obj3, (boolean[]) obj2, (f6) obj);
                break;
            case 1:
                m2 m2Var = (m2) obj3;
                ((w70) obj2).u();
                wr0 wr0Var = m2Var.a;
                e2 e2Var = new e2(m2Var, (TL_stars.SavedStarGift) obj, i12);
                HashMap hashMap = q2.T;
                wr0Var.h(null, e2Var);
                break;
            case 2:
                Context context = (Context) obj2;
                f6 f6Var = (f6) obj;
                if (((xh.a0) obj3).m0.a == yf.b.a) {
                    new p7(context, f6Var).show();
                    break;
                }
                break;
            case 3:
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj2;
                final bi.d dVar = (bi.d) obj;
                h3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((xh.w4) obj3).run(new Utilities.Callback() { // from class: xh.j6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final bi.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    h3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final bi.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 4:
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                final bi.d dVar2 = (bi.d) obj;
                h3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((h5) obj3).run(new Utilities.Callback() { // from class: xh.j6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i11) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var22 = h3Var2;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final bi.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    h3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var2;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final bi.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.p6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 5:
                ((org.telegram.ui.web.y1) obj3).run(Long.valueOf(((long[]) obj2)[0]));
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                break;
            case 6:
                zh.a3 a3Var = ((zh.v2) obj3).l;
                a3Var.F0((pb) obj2, (TL_stories.StoryItem) obj);
                zh.v2 v2Var = a3Var.t1;
                if (v2Var != null) {
                    v2Var.a();
                    break;
                }
                break;
            case 7:
                zh.v2 v2Var2 = (zh.v2) obj3;
                u7 u7Var = (u7) obj;
                ((org.telegram.ui.ActionBar.g1) obj2).performHapticFeedback(3);
                wc X = wc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new yg.q(11, v2Var2, u7Var))).j();
                    break;
                }
                break;
            default:
                zh.k3 k3Var = (zh.k3) obj3;
                bi.o1 o1Var = new bi.o1(k3Var, 12);
                zh.z3 z3Var = k3Var.b;
                new wv(o1Var, z3Var.getContext(), z3Var.s, (ArrayList) obj2).show();
                ((w70) obj).u();
                break;
        }
    }
}
