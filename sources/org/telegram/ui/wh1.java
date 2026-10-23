package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wh1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.c;
                int i10 = this.b;
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f;
                iArr[0] = i10;
                h9Var.r(user);
                w9Var.e(user, h9Var);
                break;
            case 1:
                rg.n2 n2Var = (rg.n2) this.c;
                int i11 = this.b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                wq0 wq0Var = (wq0) this.f;
                if (n2Var.I != null && !n2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var.I.getWidth(), 1.0f / n2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i11);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i11 / 90) % 2 != 0) {
                        matrix.postScale(n2Var.I.getHeight(), n2Var.I.getWidth());
                    } else {
                        matrix.postScale(n2Var.I.getWidth(), n2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        rg.k2 k2Var = new rg.k2(n2Var);
                        k2Var.h.set(0.0f, 0.0f, n2Var.I.getWidth(), n2Var.I.getHeight());
                        k2Var.i.set(k2Var.h);
                        matrix.mapRect(k2Var.i);
                        k2Var.c = i11;
                        Bitmap d = n2Var.d(0, 0, n2Var.I, false);
                        k2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            k2Var.f = k2Var.c();
                            rg.n2.c(k2Var, n2Var.T, n2Var.U);
                            n2Var.O = k2Var.j;
                            n2Var.P = k2Var.k;
                            arrayList.add(k2Var);
                            AndroidUtilities.runOnUIThread(new fn0(n2Var, arrayList, wq0Var, k2Var, 28));
                            n2Var.E = k2Var;
                            n2Var.y = true;
                            n2Var.x = false;
                            break;
                        }
                    } else {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            rg.m2 m2Var = (rg.m2) list.get(i12);
                            rg.k2 k2Var2 = new rg.k2(n2Var);
                            k2Var2.h.set(m2Var.b, m2Var.c, r12 + m2Var.d, r14 + m2Var.e);
                            k2Var2.i.set(k2Var2.h);
                            matrix.mapRect(k2Var2.i);
                            k2Var2.c = i11;
                            Bitmap d10 = n2Var.d(m2Var.b, m2Var.c, m2Var.a, false);
                            k2Var2.d = d10;
                            if (d10 != null) {
                                k2Var2.f = k2Var2.c();
                                rg.n2.c(k2Var2, n2Var.T, n2Var.U);
                                n2Var.O = k2Var2.j;
                                n2Var.P = k2Var2.k;
                                arrayList.add(k2Var2);
                            }
                        }
                        n2Var.E = null;
                        n2Var.y = true;
                        n2Var.x = false;
                        AndroidUtilities.runOnUIThread(new p2.b(14, n2Var, arrayList));
                        break;
                    }
                }
                break;
            default:
                yh.o1 o1Var = (yh.o1) this.c;
                Context context = (Context) this.d;
                int i13 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j10 = o1Var.c0;
                yh.l0 l0Var = new yh.l0(o1Var, callback, 2);
                boolean z11 = starGift.limited;
                boolean z12 = false;
                if (z11 && (disallowedGiftsSettings2 = o1Var.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                new yh.r0(o1Var, context, i13, starGift, j10, l0Var, z12, (z11 && (disallowedGiftsSettings = o1Var.b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) ? true : z10).show();
                break;
        }
    }

    public /* synthetic */ wh1(yh.o1 o1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.a = 2;
        this.c = o1Var;
        this.d = context;
        this.b = i10;
        this.e = starGift;
        this.f = callback;
    }
}
