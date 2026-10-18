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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yh1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
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
                rg.m2 m2Var = (rg.m2) this.c;
                int i11 = this.b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                yq0 yq0Var = (yq0) this.f;
                if (m2Var.I != null && !m2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / m2Var.I.getWidth(), 1.0f / m2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i11);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i11 / 90) % 2 != 0) {
                        matrix.postScale(m2Var.I.getHeight(), m2Var.I.getWidth());
                    } else {
                        matrix.postScale(m2Var.I.getWidth(), m2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        rg.j2 j2Var = new rg.j2(m2Var);
                        j2Var.h.set(0.0f, 0.0f, m2Var.I.getWidth(), m2Var.I.getHeight());
                        j2Var.i.set(j2Var.h);
                        matrix.mapRect(j2Var.i);
                        j2Var.c = i11;
                        Bitmap d = m2Var.d(0, 0, m2Var.I, false);
                        j2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            j2Var.f = j2Var.c();
                            rg.m2.c(j2Var, m2Var.T, m2Var.U);
                            m2Var.O = j2Var.j;
                            m2Var.P = j2Var.k;
                            arrayList.add(j2Var);
                            AndroidUtilities.runOnUIThread(new hn0(m2Var, arrayList, yq0Var, j2Var, 28));
                            m2Var.E = j2Var;
                            m2Var.y = true;
                            m2Var.x = false;
                            break;
                        }
                    } else {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            rg.l2 l2Var = (rg.l2) list.get(i12);
                            rg.j2 j2Var2 = new rg.j2(m2Var);
                            j2Var2.h.set(l2Var.b, l2Var.c, r12 + l2Var.d, r14 + l2Var.e);
                            j2Var2.i.set(j2Var2.h);
                            matrix.mapRect(j2Var2.i);
                            j2Var2.c = i11;
                            Bitmap d10 = m2Var.d(l2Var.b, l2Var.c, l2Var.a, false);
                            j2Var2.d = d10;
                            if (d10 != null) {
                                j2Var2.f = j2Var2.c();
                                rg.m2.c(j2Var2, m2Var.T, m2Var.U);
                                m2Var.O = j2Var2.j;
                                m2Var.P = j2Var2.k;
                                arrayList.add(j2Var2);
                            }
                        }
                        m2Var.E = null;
                        m2Var.y = true;
                        m2Var.x = false;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g2(15, m2Var, arrayList));
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

    public /* synthetic */ yh1(yh.o1 o1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.a = 2;
        this.c = o1Var;
        this.d = context;
        this.b = i10;
        this.e = starGift;
        this.f = callback;
    }
}
