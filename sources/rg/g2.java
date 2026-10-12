package rg;

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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.ss0;
import org.telegram.ui.ur0;
import zh.n5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g2(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
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
        m2 m2Var = null;
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.c;
                int i10 = this.b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ur0 ur0Var = (ur0) this.f;
                if (p2Var.I != null && !p2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / p2Var.I.getWidth(), 1.0f / p2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i10);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i10 / 90) % 2 != 0) {
                        matrix.postScale(p2Var.I.getHeight(), p2Var.I.getWidth());
                    } else {
                        matrix.postScale(p2Var.I.getWidth(), p2Var.I.getHeight());
                    }
                    if (!list.isEmpty()) {
                        int i11 = 0;
                        while (i11 < list.size()) {
                            o2 o2Var = (o2) list.get(i11);
                            m2 m2Var2 = new m2(p2Var);
                            m2Var2.h.set(o2Var.b, o2Var.c, r13 + o2Var.d, r15 + o2Var.e);
                            m2Var2.i.set(m2Var2.h);
                            matrix.mapRect(m2Var2.i);
                            m2Var2.c = i10;
                            Bitmap d = p2Var.d(o2Var.b, o2Var.c, o2Var.a, false);
                            m2Var2.d = d;
                            if (d != null) {
                                m2Var2.f = m2Var2.c();
                                p2.c(m2Var2, p2Var.T, p2Var.U);
                                p2Var.O = m2Var2.j;
                                p2Var.P = m2Var2.k;
                                arrayList.add(m2Var2);
                            }
                            i11++;
                            m2Var = null;
                        }
                        p2Var.E = m2Var;
                        p2Var.y = true;
                        p2Var.x = false;
                        AndroidUtilities.runOnUIThread(new t8(28, p2Var, arrayList));
                        break;
                    } else {
                        m2 m2Var3 = new m2(p2Var);
                        m2Var3.h.set(0.0f, 0.0f, p2Var.I.getWidth(), p2Var.I.getHeight());
                        m2Var3.i.set(m2Var3.h);
                        matrix.mapRect(m2Var3.i);
                        m2Var3.c = i10;
                        Bitmap d10 = p2Var.d(0, 0, p2Var.I, false);
                        m2Var3.d = d10;
                        if (d10 != null) {
                            m2Var3.f = m2Var3.c();
                            p2.c(m2Var3, p2Var.T, p2Var.U);
                            p2Var.O = m2Var3.j;
                            p2Var.P = m2Var3.k;
                            arrayList.add(m2Var3);
                            AndroidUtilities.runOnUIThread(new ss0(p2Var, arrayList, ur0Var, m2Var3, 23));
                            p2Var.E = m2Var3;
                            p2Var.y = true;
                            p2Var.x = false;
                            break;
                        } else {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        }
                    }
                }
                break;
            case 1:
                yh.p1 p1Var = (yh.p1) this.c;
                Context context = (Context) this.d;
                int i12 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j10 = p1Var.c0;
                yh.n0 n0Var = new yh.n0(p1Var, callback, 2);
                boolean z10 = starGift.limited;
                new yh.s0(p1Var, context, i12, starGift, j10, n0Var, z10 && (disallowedGiftsSettings2 = p1Var.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z10 && (disallowedGiftsSettings = p1Var.b0) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            default:
                di.d dVar = (di.d) this.c;
                e3[] e3VarArr = (e3[]) this.d;
                int i13 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f;
                dVar.setLoading(false);
                e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                n5.y(i13, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    zc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g2(p2 p2Var, int i10, List list, ArrayList arrayList, ur0 ur0Var) {
        this.a = 0;
        this.c = p2Var;
        this.b = i10;
        this.d = list;
        this.e = arrayList;
        this.f = ur0Var;
    }
}
