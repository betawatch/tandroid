package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ rk(h2.c cVar, Bitmap bitmap, int i7, int i10, String str, boolean z10) {
        this.e = cVar;
        this.f = bitmap;
        this.b = i7;
        this.c = i10;
        this.h = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.gc gcVar;
        int i7;
        int i10;
        int i11;
        Rect rect;
        int i12 = this.a;
        Serializable serializable = this.h;
        int i13 = this.c;
        int i14 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = (ArrayList) serializable;
                bn bnVar = ((sk) obj2).b;
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    org.telegram.messenger.mp.u1(i7).g7.edit().remove("pin_" + bnVar.l6).commit();
                    bnVar.gd(0, true);
                    gcVar = null;
                } else {
                    gcVar = null;
                    bnVar.getNotificationCenter().k(56, Long.valueOf(bnVar.l6), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i14), Boolean.valueOf(bnVar.g5));
                }
                if (i13 == bnVar.R3) {
                    bnVar.P3 = gcVar;
                    break;
                }
                break;
            default:
                h2.c cVar = (h2.c) obj2;
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) serializable;
                Paint paint = (Paint) cVar.d;
                int i15 = cVar.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i14 == 90 || i14 == 270) {
                        i10 = round2;
                        i11 = round;
                    } else {
                        i11 = round2;
                        i10 = round;
                    }
                    int i16 = i15 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i16 + i10, i16 + i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i17 = i15 + round;
                    int i18 = i15 + round2;
                    Rect rect3 = new Rect(i15, i15, i17, i18);
                    float f10 = i15;
                    canvas.translate((i10 / 2.0f) + f10, (i11 / 2.0f) + f10);
                    if (i13 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                        rect = rect2;
                    } else {
                        rect = rect2;
                        if (i13 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i14);
                    float f11 = -i15;
                    org.telegram.messenger.n10.k(round2, 2.0f, f11, f11 - (round / 2.0f), canvas);
                    try {
                        canvas.drawBitmap(bitmap, rect, rect3, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i15 > 0) {
                        float f12 = i17;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i18;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i17 + i15;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i18 + i15, paint);
                    }
                    org.telegram.messenger.g0.g3(new ai.n(cVar, str, createBitmap, this.d, bitmap));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rk(sk skVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.e = skVar;
        this.d = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i7;
        this.c = i10;
    }
}
