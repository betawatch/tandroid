package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ad;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.or0;
import org.telegram.ui.rr0;
import yh.m5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f2(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
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
        l2 l2Var = null;
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.c;
                int i10 = this.b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                or0 or0Var = (or0) this.f;
                if (o2Var.I != null && !o2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / o2Var.I.getWidth(), 1.0f / o2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i10);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i10 / 90) % 2 != 0) {
                        matrix.postScale(o2Var.I.getHeight(), o2Var.I.getWidth());
                    } else {
                        matrix.postScale(o2Var.I.getWidth(), o2Var.I.getHeight());
                    }
                    if (!list.isEmpty()) {
                        int i11 = 0;
                        while (i11 < list.size()) {
                            n2 n2Var = (n2) list.get(i11);
                            l2 l2Var2 = new l2(o2Var);
                            l2Var2.h.set(n2Var.b, n2Var.c, r13 + n2Var.d, r15 + n2Var.e);
                            l2Var2.i.set(l2Var2.h);
                            matrix.mapRect(l2Var2.i);
                            l2Var2.c = i10;
                            Bitmap d = o2Var.d(n2Var.b, n2Var.c, n2Var.a, false);
                            l2Var2.d = d;
                            if (d != null) {
                                l2Var2.f = l2Var2.c();
                                o2.c(l2Var2, o2Var.T, o2Var.U);
                                o2Var.O = l2Var2.j;
                                o2Var.P = l2Var2.k;
                                arrayList.add(l2Var2);
                            }
                            i11++;
                            l2Var = null;
                        }
                        o2Var.E = l2Var;
                        o2Var.y = true;
                        o2Var.x = false;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(10, o2Var, arrayList));
                        break;
                    } else {
                        l2 l2Var3 = new l2(o2Var);
                        l2Var3.h.set(0.0f, 0.0f, o2Var.I.getWidth(), o2Var.I.getHeight());
                        l2Var3.i.set(l2Var3.h);
                        matrix.mapRect(l2Var3.i);
                        l2Var3.c = i10;
                        Bitmap d10 = o2Var.d(0, 0, o2Var.I, false);
                        l2Var3.d = d10;
                        if (d10 != null) {
                            l2Var3.f = l2Var3.c();
                            o2.c(l2Var3, o2Var.T, o2Var.U);
                            o2Var.O = l2Var3.j;
                            o2Var.P = l2Var3.k;
                            arrayList.add(l2Var3);
                            AndroidUtilities.runOnUIThread(new rr0(o2Var, arrayList, or0Var, l2Var3, 24));
                            o2Var.E = l2Var3;
                            o2Var.y = true;
                            o2Var.x = false;
                            break;
                        } else {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        }
                    }
                }
                break;
            case 1:
                xh.r1 r1Var = (xh.r1) this.c;
                Context context = (Context) this.d;
                int i12 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j3 = r1Var.c0;
                xh.o0 o0Var = new xh.o0(r1Var, callback, 2);
                boolean z10 = starGift.limited;
                new xh.u0(r1Var, context, i12, starGift, j3, o0Var, z10 && (disallowedGiftsSettings2 = r1Var.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z10 && (disallowedGiftsSettings = r1Var.b0) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            default:
                ci.d dVar = (ci.d) this.c;
                f3[] f3VarArr = (f3[]) this.d;
                int i13 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f;
                dVar.setLoading(false);
                f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                m5.y(i13, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    ad.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f2(o2 o2Var, int i10, List list, ArrayList arrayList, or0 or0Var) {
        this.a = 0;
        this.c = o2Var;
        this.b = i10;
        this.d = list;
        this.e = arrayList;
        this.f = or0Var;
    }
}
