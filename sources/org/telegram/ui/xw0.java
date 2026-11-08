package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class xw0 {
    public final int a;
    public boolean b;
    public zw0 c;
    public final boolean[] g;
    public boolean i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList j = new ArrayList();

    public xw0(int i7, int i10) {
        boolean[] zArr = new boolean[2];
        this.g = zArr;
        this.a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String j3 = jg.g.j(i10, "");
            for (int i11 = 0; i11 < j3.length(); i11++) {
                int charAt = j3.charAt(i11) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = ax0.s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName, 0, false, false, new y(this, hashSet, arrayList, 11));
        }
        String str = ax0.s[Utilities.b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.fx(22, this, str));
    }

    public static xw0 c(int i7, TLRPC.UserFull userFull, xw0 xw0Var) {
        TL_account.TL_birthday tL_birthday;
        if (!org.telegram.messenger.sc.e(2) || !org.telegram.messenger.v1.d(userFull)) {
            if (xw0Var == null) {
                return null;
            }
            xw0Var.b(false);
            return null;
        }
        int years = (userFull == null || (tL_birthday = userFull.birthday) == null || (tL_birthday.flags & 1) == 0) ? 0 : Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
        if (xw0Var != null) {
            if (xw0Var.a == years) {
                return xw0Var;
            }
            xw0Var.b(false);
        }
        return new xw0(i7, years);
    }

    public final void a() {
        if (this.b || this.f.size() < this.e.size()) {
            return;
        }
        boolean[] zArr = this.g;
        int i7 = 0;
        if (zArr[0] && zArr[1]) {
            this.b = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void b(boolean z9) {
        if (!z9 && !this.j.isEmpty()) {
            this.i = true;
            return;
        }
        this.h.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((zw0) arrayList.get(i7)).R();
                i7++;
            }
        }
    }
}
